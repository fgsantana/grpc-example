package main

import (
	"context"
	"flag"
	"go-grpc-service/pb/proto"
	"google.golang.org/grpc"
	"log"
	"math/rand"
	"net"
	"time"
)

var (
	port = flag.Int("port", 50051, "The server port")
)

type server struct {
	pb.UnimplementedRandomGeneratorServer
}

func (s *server) GenerateRandomNumber(ctx context.Context, in *pb.RandomRangeRequest) (*pb.RandomNumberResponse, error) {
	log.Printf("received request: { %v } - generating random number...", in)
	randomGenerated := rand.Intn(int(in.RangeL-in.RangeI)) + int(in.RangeI)
	for i := 0; i < 5; i++ {
		time.Sleep(1000 * time.Millisecond)
		log.Printf("delaying %d seconds..", i+1)

	}
	return &pb.RandomNumberResponse{RNumber: int32(randomGenerated)}, nil
}

func main() {
	lis, err := net.Listen("tcp", "localhost:50051")
	if err != nil {
		log.Fatalf("failed to listen %v", err)
	}
	s := grpc.NewServer()
	pb.RegisterRandomGeneratorServer(s, &server{})
	log.Printf("server listening at %v", lis.Addr())
	if err := s.Serve(lis); err != nil {
		log.Fatalf("failed to serve: %v", err)
	}
}
