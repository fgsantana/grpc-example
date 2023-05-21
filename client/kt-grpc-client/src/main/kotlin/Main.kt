import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import pb.RandomGeneratorGrpc

import pb.RandomGeneratorGrpcKt
import pb.RandomRangeRequest

import kotlin.coroutines.createCoroutine


import java.io.Closeable
import java.util.concurrent.TimeUnit


suspend fun main() {
    runBlocking {
        val (name, port) = Pair("0.0.0.0", 50051)
        val channel = ManagedChannelBuilder.forAddress(name, port).usePlaintext().build()
        val client = RandomNumberGeneratorClient(channel)
        val init = System.currentTimeMillis()
        val rpcCalljob = launch {
            val randomNumber = client.generateNumber(10, 50)
            println("generated number: $randomNumber")
        }

        rpcCalljob.join()
        val wait = (System.currentTimeMillis() - init).toDouble() / 1000

        println("waited $wait seconds until response")
    }
}

class RandomNumberGeneratorClient(private val channel: ManagedChannel) : Closeable {

    private val randomNumberGeneratorServerStub = RandomGeneratorGrpcKt.RandomGeneratorCoroutineStub(channel)

    suspend fun generateNumber(rangeI: Int, rangeL: Int): Int {
        val request = RandomRangeRequest.newBuilder()
                                            .setRangeI(rangeI)
                                            .setRangeL(rangeL)
                                            .build()

        println("sending request to server: \n{ $request }" )
        val response = randomNumberGeneratorServerStub.generateRandomNumber(request)

        return response.rNumber
    }

    override fun close() {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }

}