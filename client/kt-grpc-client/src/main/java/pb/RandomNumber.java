// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: randomNumber.proto

package pb;

public final class RandomNumber {
  private RandomNumber() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pb_RandomRangeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pb_RandomRangeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pb_RandomNumberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pb_RandomNumberResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022randomNumber.proto\022\002pb\"4\n\022RandomRangeR" +
      "equest\022\016\n\006rangeI\030\001 \001(\005\022\016\n\006rangeL\030\002 \001(\005\"\'" +
      "\n\024RandomNumberResponse\022\017\n\007rNumber\030\001 \001(\0052" +
      "]\n\017RandomGenerator\022J\n\024GenerateRandomNumb" +
      "er\022\026.pb.RandomRangeRequest\032\030.pb.RandomNu" +
      "mberResponse\"\000B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_pb_RandomRangeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pb_RandomRangeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pb_RandomRangeRequest_descriptor,
        new java.lang.String[] { "RangeI", "RangeL", });
    internal_static_pb_RandomNumberResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_pb_RandomNumberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pb_RandomNumberResponse_descriptor,
        new java.lang.String[] { "RNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
