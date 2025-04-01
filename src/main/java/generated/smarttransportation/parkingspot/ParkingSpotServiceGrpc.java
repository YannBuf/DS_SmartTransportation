package generated.smarttransportation.parkingspot;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ParkingSpotService.proto")
public final class ParkingSpotServiceGrpc {

  private ParkingSpotServiceGrpc() {}

  public static final String SERVICE_NAME = "ParkingSpotService.ParkingSpotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.ParkingStatus,
      generated.smarttransportation.parkingspot.ConfirmationMessage> getSendParkingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendParkingStatus",
      requestType = generated.smarttransportation.parkingspot.ParkingStatus.class,
      responseType = generated.smarttransportation.parkingspot.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.ParkingStatus,
      generated.smarttransportation.parkingspot.ConfirmationMessage> getSendParkingStatusMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.ParkingStatus, generated.smarttransportation.parkingspot.ConfirmationMessage> getSendParkingStatusMethod;
    if ((getSendParkingStatusMethod = ParkingSpotServiceGrpc.getSendParkingStatusMethod) == null) {
      synchronized (ParkingSpotServiceGrpc.class) {
        if ((getSendParkingStatusMethod = ParkingSpotServiceGrpc.getSendParkingStatusMethod) == null) {
          ParkingSpotServiceGrpc.getSendParkingStatusMethod = getSendParkingStatusMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.parkingspot.ParkingStatus, generated.smarttransportation.parkingspot.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpotService.ParkingSpotService", "SendParkingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.ParkingStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.ConfirmationMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpotServiceMethodDescriptorSupplier("SendParkingStatus"))
                  .build();
          }
        }
     }
     return getSendParkingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.DurationData,
      generated.smarttransportation.parkingspot.ConfirmationMessage> getSendParkingDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendParkingDuration",
      requestType = generated.smarttransportation.parkingspot.DurationData.class,
      responseType = generated.smarttransportation.parkingspot.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.DurationData,
      generated.smarttransportation.parkingspot.ConfirmationMessage> getSendParkingDurationMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.DurationData, generated.smarttransportation.parkingspot.ConfirmationMessage> getSendParkingDurationMethod;
    if ((getSendParkingDurationMethod = ParkingSpotServiceGrpc.getSendParkingDurationMethod) == null) {
      synchronized (ParkingSpotServiceGrpc.class) {
        if ((getSendParkingDurationMethod = ParkingSpotServiceGrpc.getSendParkingDurationMethod) == null) {
          ParkingSpotServiceGrpc.getSendParkingDurationMethod = getSendParkingDurationMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.parkingspot.DurationData, generated.smarttransportation.parkingspot.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpotService.ParkingSpotService", "SendParkingDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.DurationData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.ConfirmationMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpotServiceMethodDescriptorSupplier("SendParkingDuration"))
                  .build();
          }
        }
     }
     return getSendParkingDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.SensorStatus,
      generated.smarttransportation.parkingspot.ConfirmationMessage> getSendSensorStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSensorStatus",
      requestType = generated.smarttransportation.parkingspot.SensorStatus.class,
      responseType = generated.smarttransportation.parkingspot.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.SensorStatus,
      generated.smarttransportation.parkingspot.ConfirmationMessage> getSendSensorStatusMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.SensorStatus, generated.smarttransportation.parkingspot.ConfirmationMessage> getSendSensorStatusMethod;
    if ((getSendSensorStatusMethod = ParkingSpotServiceGrpc.getSendSensorStatusMethod) == null) {
      synchronized (ParkingSpotServiceGrpc.class) {
        if ((getSendSensorStatusMethod = ParkingSpotServiceGrpc.getSendSensorStatusMethod) == null) {
          ParkingSpotServiceGrpc.getSendSensorStatusMethod = getSendSensorStatusMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.parkingspot.SensorStatus, generated.smarttransportation.parkingspot.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpotService.ParkingSpotService", "SendSensorStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.SensorStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.ConfirmationMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpotServiceMethodDescriptorSupplier("SendSensorStatus"))
                  .build();
          }
        }
     }
     return getSendSensorStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.ZoneRequest,
      generated.smarttransportation.parkingspot.ParkingStatus> getStreamParkingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamParkingStatus",
      requestType = generated.smarttransportation.parkingspot.ZoneRequest.class,
      responseType = generated.smarttransportation.parkingspot.ParkingStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.ZoneRequest,
      generated.smarttransportation.parkingspot.ParkingStatus> getStreamParkingStatusMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.parkingspot.ZoneRequest, generated.smarttransportation.parkingspot.ParkingStatus> getStreamParkingStatusMethod;
    if ((getStreamParkingStatusMethod = ParkingSpotServiceGrpc.getStreamParkingStatusMethod) == null) {
      synchronized (ParkingSpotServiceGrpc.class) {
        if ((getStreamParkingStatusMethod = ParkingSpotServiceGrpc.getStreamParkingStatusMethod) == null) {
          ParkingSpotServiceGrpc.getStreamParkingStatusMethod = getStreamParkingStatusMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.parkingspot.ZoneRequest, generated.smarttransportation.parkingspot.ParkingStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingSpotService.ParkingSpotService", "StreamParkingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.ZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.parkingspot.ParkingStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingSpotServiceMethodDescriptorSupplier("StreamParkingStatus"))
                  .build();
          }
        }
     }
     return getStreamParkingStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingSpotServiceStub newStub(io.grpc.Channel channel) {
    return new ParkingSpotServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingSpotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingSpotServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingSpotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingSpotServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ParkingSpotServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendParkingStatus(generated.smarttransportation.parkingspot.ParkingStatus request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSendParkingStatusMethod(), responseObserver);
    }

    /**
     */
    public void sendParkingDuration(generated.smarttransportation.parkingspot.DurationData request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSendParkingDurationMethod(), responseObserver);
    }

    /**
     */
    public void sendSensorStatus(generated.smarttransportation.parkingspot.SensorStatus request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSendSensorStatusMethod(), responseObserver);
    }

    /**
     */
    public void streamParkingStatus(generated.smarttransportation.parkingspot.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ParkingStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamParkingStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendParkingStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.parkingspot.ParkingStatus,
                generated.smarttransportation.parkingspot.ConfirmationMessage>(
                  this, METHODID_SEND_PARKING_STATUS)))
          .addMethod(
            getSendParkingDurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.parkingspot.DurationData,
                generated.smarttransportation.parkingspot.ConfirmationMessage>(
                  this, METHODID_SEND_PARKING_DURATION)))
          .addMethod(
            getSendSensorStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.parkingspot.SensorStatus,
                generated.smarttransportation.parkingspot.ConfirmationMessage>(
                  this, METHODID_SEND_SENSOR_STATUS)))
          .addMethod(
            getStreamParkingStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.smarttransportation.parkingspot.ZoneRequest,
                generated.smarttransportation.parkingspot.ParkingStatus>(
                  this, METHODID_STREAM_PARKING_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class ParkingSpotServiceStub extends io.grpc.stub.AbstractStub<ParkingSpotServiceStub> {
    private ParkingSpotServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingSpotServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingSpotServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingSpotServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendParkingStatus(generated.smarttransportation.parkingspot.ParkingStatus request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendParkingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendParkingDuration(generated.smarttransportation.parkingspot.DurationData request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendParkingDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendSensorStatus(generated.smarttransportation.parkingspot.SensorStatus request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendSensorStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamParkingStatus(generated.smarttransportation.parkingspot.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ParkingStatus> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamParkingStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ParkingSpotServiceBlockingStub extends io.grpc.stub.AbstractStub<ParkingSpotServiceBlockingStub> {
    private ParkingSpotServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingSpotServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingSpotServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingSpotServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.smarttransportation.parkingspot.ConfirmationMessage sendParkingStatus(generated.smarttransportation.parkingspot.ParkingStatus request) {
      return blockingUnaryCall(
          getChannel(), getSendParkingStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.parkingspot.ConfirmationMessage sendParkingDuration(generated.smarttransportation.parkingspot.DurationData request) {
      return blockingUnaryCall(
          getChannel(), getSendParkingDurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.parkingspot.ConfirmationMessage sendSensorStatus(generated.smarttransportation.parkingspot.SensorStatus request) {
      return blockingUnaryCall(
          getChannel(), getSendSensorStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generated.smarttransportation.parkingspot.ParkingStatus> streamParkingStatus(
        generated.smarttransportation.parkingspot.ZoneRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamParkingStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParkingSpotServiceFutureStub extends io.grpc.stub.AbstractStub<ParkingSpotServiceFutureStub> {
    private ParkingSpotServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingSpotServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingSpotServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingSpotServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.parkingspot.ConfirmationMessage> sendParkingStatus(
        generated.smarttransportation.parkingspot.ParkingStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSendParkingStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.parkingspot.ConfirmationMessage> sendParkingDuration(
        generated.smarttransportation.parkingspot.DurationData request) {
      return futureUnaryCall(
          getChannel().newCall(getSendParkingDurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.parkingspot.ConfirmationMessage> sendSensorStatus(
        generated.smarttransportation.parkingspot.SensorStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSendSensorStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_PARKING_STATUS = 0;
  private static final int METHODID_SEND_PARKING_DURATION = 1;
  private static final int METHODID_SEND_SENSOR_STATUS = 2;
  private static final int METHODID_STREAM_PARKING_STATUS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingSpotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingSpotServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_PARKING_STATUS:
          serviceImpl.sendParkingStatus((generated.smarttransportation.parkingspot.ParkingStatus) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage>) responseObserver);
          break;
        case METHODID_SEND_PARKING_DURATION:
          serviceImpl.sendParkingDuration((generated.smarttransportation.parkingspot.DurationData) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage>) responseObserver);
          break;
        case METHODID_SEND_SENSOR_STATUS:
          serviceImpl.sendSensorStatus((generated.smarttransportation.parkingspot.SensorStatus) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ConfirmationMessage>) responseObserver);
          break;
        case METHODID_STREAM_PARKING_STATUS:
          serviceImpl.streamParkingStatus((generated.smarttransportation.parkingspot.ZoneRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.parkingspot.ParkingStatus>) responseObserver);
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

  private static abstract class ParkingSpotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingSpotServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smarttransportation.parkingspot.ParkingSpotServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingSpotService");
    }
  }

  private static final class ParkingSpotServiceFileDescriptorSupplier
      extends ParkingSpotServiceBaseDescriptorSupplier {
    ParkingSpotServiceFileDescriptorSupplier() {}
  }

  private static final class ParkingSpotServiceMethodDescriptorSupplier
      extends ParkingSpotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingSpotServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkingSpotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingSpotServiceFileDescriptorSupplier())
              .addMethod(getSendParkingStatusMethod())
              .addMethod(getSendParkingDurationMethod())
              .addMethod(getSendSensorStatusMethod())
              .addMethod(getStreamParkingStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
