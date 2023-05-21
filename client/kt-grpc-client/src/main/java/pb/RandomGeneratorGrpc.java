package pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: randomNumber.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RandomGeneratorGrpc {

  private RandomGeneratorGrpc() {}

  public static final String SERVICE_NAME = "pb.RandomGenerator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pb.RandomRangeRequest,
      pb.RandomNumberResponse> getGenerateRandomNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateRandomNumber",
      requestType = pb.RandomRangeRequest.class,
      responseType = pb.RandomNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pb.RandomRangeRequest,
      pb.RandomNumberResponse> getGenerateRandomNumberMethod() {
    io.grpc.MethodDescriptor<pb.RandomRangeRequest, pb.RandomNumberResponse> getGenerateRandomNumberMethod;
    if ((getGenerateRandomNumberMethod = RandomGeneratorGrpc.getGenerateRandomNumberMethod) == null) {
      synchronized (RandomGeneratorGrpc.class) {
        if ((getGenerateRandomNumberMethod = RandomGeneratorGrpc.getGenerateRandomNumberMethod) == null) {
          RandomGeneratorGrpc.getGenerateRandomNumberMethod = getGenerateRandomNumberMethod =
              io.grpc.MethodDescriptor.<pb.RandomRangeRequest, pb.RandomNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateRandomNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.RandomRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.RandomNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RandomGeneratorMethodDescriptorSupplier("GenerateRandomNumber"))
              .build();
        }
      }
    }
    return getGenerateRandomNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RandomGeneratorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorStub>() {
        @java.lang.Override
        public RandomGeneratorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RandomGeneratorStub(channel, callOptions);
        }
      };
    return RandomGeneratorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RandomGeneratorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorBlockingStub>() {
        @java.lang.Override
        public RandomGeneratorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RandomGeneratorBlockingStub(channel, callOptions);
        }
      };
    return RandomGeneratorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RandomGeneratorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RandomGeneratorFutureStub>() {
        @java.lang.Override
        public RandomGeneratorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RandomGeneratorFutureStub(channel, callOptions);
        }
      };
    return RandomGeneratorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RandomGeneratorImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateRandomNumber(pb.RandomRangeRequest request,
        io.grpc.stub.StreamObserver<pb.RandomNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateRandomNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateRandomNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pb.RandomRangeRequest,
                pb.RandomNumberResponse>(
                  this, METHODID_GENERATE_RANDOM_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class RandomGeneratorStub extends io.grpc.stub.AbstractAsyncStub<RandomGeneratorStub> {
    private RandomGeneratorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RandomGeneratorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RandomGeneratorStub(channel, callOptions);
    }

    /**
     */
    public void generateRandomNumber(pb.RandomRangeRequest request,
        io.grpc.stub.StreamObserver<pb.RandomNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateRandomNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RandomGeneratorBlockingStub extends io.grpc.stub.AbstractBlockingStub<RandomGeneratorBlockingStub> {
    private RandomGeneratorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RandomGeneratorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RandomGeneratorBlockingStub(channel, callOptions);
    }

    /**
     */
    public pb.RandomNumberResponse generateRandomNumber(pb.RandomRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateRandomNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RandomGeneratorFutureStub extends io.grpc.stub.AbstractFutureStub<RandomGeneratorFutureStub> {
    private RandomGeneratorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RandomGeneratorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RandomGeneratorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pb.RandomNumberResponse> generateRandomNumber(
        pb.RandomRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateRandomNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_RANDOM_NUMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RandomGeneratorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RandomGeneratorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_RANDOM_NUMBER:
          serviceImpl.generateRandomNumber((pb.RandomRangeRequest) request,
              (io.grpc.stub.StreamObserver<pb.RandomNumberResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RandomGeneratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RandomGeneratorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pb.RandomNumber.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RandomGenerator");
    }
  }

  private static final class RandomGeneratorFileDescriptorSupplier
      extends RandomGeneratorBaseDescriptorSupplier {
    RandomGeneratorFileDescriptorSupplier() {}
  }

  private static final class RandomGeneratorMethodDescriptorSupplier
      extends RandomGeneratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RandomGeneratorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RandomGeneratorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RandomGeneratorFileDescriptorSupplier())
              .addMethod(getGenerateRandomNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
