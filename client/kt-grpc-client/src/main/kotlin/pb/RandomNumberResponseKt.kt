// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: randomNumber.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package pb;

@kotlin.jvm.JvmName("-initializerandomNumberResponse")
public inline fun randomNumberResponse(block: pb.RandomNumberResponseKt.Dsl.() -> kotlin.Unit): pb.RandomNumberResponse =
  pb.RandomNumberResponseKt.Dsl._create(pb.RandomNumberResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `pb.RandomNumberResponse`
 */
public object RandomNumberResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pb.RandomNumberResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pb.RandomNumberResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pb.RandomNumberResponse = _builder.build()

    /**
     * `int32 rNumber = 1;`
     */
    public var rNumber: kotlin.Int
      @JvmName("getRNumber")
      get() = _builder.getRNumber()
      @JvmName("setRNumber")
      set(value) {
        _builder.setRNumber(value)
      }
    /**
     * `int32 rNumber = 1;`
     */
    public fun clearRNumber() {
      _builder.clearRNumber()
    }
  }
}
@kotlin.jvm.JvmSynthetic
@com.google.errorprone.annotations.CheckReturnValue
public inline fun pb.RandomNumberResponse.copy(block: pb.RandomNumberResponseKt.Dsl.() -> kotlin.Unit): pb.RandomNumberResponse =
  pb.RandomNumberResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

