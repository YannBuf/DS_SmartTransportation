package generated.smarttransportation.system;

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
 * <pre>
 * System Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: SystemService.proto")
public final class SystemServiceGrpc {

  private SystemServiceGrpc() {}

  public static final String SERVICE_NAME = "SystemService.SystemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.system.ZoneRequest,
      generated.smarttransportation.system.AvailableSpotResponse> getCalculateAvailableSpotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateAvailableSpots",
      requestType = generated.smarttransportation.system.ZoneRequest.class,
      responseType = generated.smarttransportation.system.AvailableSpotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.system.ZoneRequest,
      generated.smarttransportation.system.AvailableSpotResponse> getCalculateAvailableSpotsMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.system.ZoneRequest, generated.smarttransportation.system.AvailableSpotResponse> getCalculateAvailableSpotsMethod;
    if ((getCalculateAvailableSpotsMethod = SystemServiceGrpc.getCalculateAvailableSpotsMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getCalculateAvailableSpotsMethod = SystemServiceGrpc.getCalculateAvailableSpotsMethod) == null) {
          SystemServiceGrpc.getCalculateAvailableSpotsMethod = getCalculateAvailableSpotsMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.system.ZoneRequest, generated.smarttransportation.system.AvailableSpotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SystemService.SystemService", "CalculateAvailableSpots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.ZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.AvailableSpotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemServiceMethodDescriptorSupplier("CalculateAvailableSpots"))
                  .build();
          }
        }
     }
     return getCalculateAvailableSpotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.system.SensorAlert,
      generated.smarttransportation.system.MaintenanceConfirmation> getSensorErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SensorError",
      requestType = generated.smarttransportation.system.SensorAlert.class,
      responseType = generated.smarttransportation.system.MaintenanceConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.system.SensorAlert,
      generated.smarttransportation.system.MaintenanceConfirmation> getSensorErrorMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.system.SensorAlert, generated.smarttransportation.system.MaintenanceConfirmation> getSensorErrorMethod;
    if ((getSensorErrorMethod = SystemServiceGrpc.getSensorErrorMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getSensorErrorMethod = SystemServiceGrpc.getSensorErrorMethod) == null) {
          SystemServiceGrpc.getSensorErrorMethod = getSensorErrorMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.system.SensorAlert, generated.smarttransportation.system.MaintenanceConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SystemService.SystemService", "SensorError"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.SensorAlert.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.MaintenanceConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemServiceMethodDescriptorSupplier("SensorError"))
                  .build();
          }
        }
     }
     return getSensorErrorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.system.Pricing,
      generated.smarttransportation.system.ConfirmationMessage> getUpdateParkingPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParkingPrice",
      requestType = generated.smarttransportation.system.Pricing.class,
      responseType = generated.smarttransportation.system.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.system.Pricing,
      generated.smarttransportation.system.ConfirmationMessage> getUpdateParkingPriceMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.system.Pricing, generated.smarttransportation.system.ConfirmationMessage> getUpdateParkingPriceMethod;
    if ((getUpdateParkingPriceMethod = SystemServiceGrpc.getUpdateParkingPriceMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getUpdateParkingPriceMethod = SystemServiceGrpc.getUpdateParkingPriceMethod) == null) {
          SystemServiceGrpc.getUpdateParkingPriceMethod = getUpdateParkingPriceMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.system.Pricing, generated.smarttransportation.system.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SystemService.SystemService", "UpdateParkingPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.Pricing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.ConfirmationMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemServiceMethodDescriptorSupplier("UpdateParkingPrice"))
                  .build();
          }
        }
     }
     return getUpdateParkingPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.system.FeeQuery,
      generated.smarttransportation.system.FeeResult> getComputeParkingFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ComputeParkingFee",
      requestType = generated.smarttransportation.system.FeeQuery.class,
      responseType = generated.smarttransportation.system.FeeResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.system.FeeQuery,
      generated.smarttransportation.system.FeeResult> getComputeParkingFeeMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.system.FeeQuery, generated.smarttransportation.system.FeeResult> getComputeParkingFeeMethod;
    if ((getComputeParkingFeeMethod = SystemServiceGrpc.getComputeParkingFeeMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getComputeParkingFeeMethod = SystemServiceGrpc.getComputeParkingFeeMethod) == null) {
          SystemServiceGrpc.getComputeParkingFeeMethod = getComputeParkingFeeMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.system.FeeQuery, generated.smarttransportation.system.FeeResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SystemService.SystemService", "ComputeParkingFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.FeeQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.FeeResult.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemServiceMethodDescriptorSupplier("ComputeParkingFee"))
                  .build();
          }
        }
     }
     return getComputeParkingFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.system.ZoneRequest,
      generated.smarttransportation.system.AvailableSpotResponse> getStreamAvailableSpotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAvailableSpots",
      requestType = generated.smarttransportation.system.ZoneRequest.class,
      responseType = generated.smarttransportation.system.AvailableSpotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.system.ZoneRequest,
      generated.smarttransportation.system.AvailableSpotResponse> getStreamAvailableSpotsMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.system.ZoneRequest, generated.smarttransportation.system.AvailableSpotResponse> getStreamAvailableSpotsMethod;
    if ((getStreamAvailableSpotsMethod = SystemServiceGrpc.getStreamAvailableSpotsMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getStreamAvailableSpotsMethod = SystemServiceGrpc.getStreamAvailableSpotsMethod) == null) {
          SystemServiceGrpc.getStreamAvailableSpotsMethod = getStreamAvailableSpotsMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.system.ZoneRequest, generated.smarttransportation.system.AvailableSpotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SystemService.SystemService", "StreamAvailableSpots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.ZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.AvailableSpotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemServiceMethodDescriptorSupplier("StreamAvailableSpots"))
                  .build();
          }
        }
     }
     return getStreamAvailableSpotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.system.SensorStatus,
      generated.smarttransportation.system.MaintenanceConfirmation> getMonitorSensorStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorSensorStatus",
      requestType = generated.smarttransportation.system.SensorStatus.class,
      responseType = generated.smarttransportation.system.MaintenanceConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.system.SensorStatus,
      generated.smarttransportation.system.MaintenanceConfirmation> getMonitorSensorStatusMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.system.SensorStatus, generated.smarttransportation.system.MaintenanceConfirmation> getMonitorSensorStatusMethod;
    if ((getMonitorSensorStatusMethod = SystemServiceGrpc.getMonitorSensorStatusMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getMonitorSensorStatusMethod = SystemServiceGrpc.getMonitorSensorStatusMethod) == null) {
          SystemServiceGrpc.getMonitorSensorStatusMethod = getMonitorSensorStatusMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.system.SensorStatus, generated.smarttransportation.system.MaintenanceConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SystemService.SystemService", "MonitorSensorStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.SensorStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.system.MaintenanceConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemServiceMethodDescriptorSupplier("MonitorSensorStatus"))
                  .build();
          }
        }
     }
     return getMonitorSensorStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SystemServiceStub newStub(io.grpc.Channel channel) {
    return new SystemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SystemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SystemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SystemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SystemServiceFutureStub(channel);
  }

  /**
   * <pre>
   * System Service
   * </pre>
   */
  public static abstract class SystemServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculateAvailableSpots(generated.smarttransportation.system.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.AvailableSpotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateAvailableSpotsMethod(), responseObserver);
    }

    /**
     */
    public void sensorError(generated.smarttransportation.system.SensorAlert request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.MaintenanceConfirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getSensorErrorMethod(), responseObserver);
    }

    /**
     */
    public void updateParkingPrice(generated.smarttransportation.system.Pricing request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.ConfirmationMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateParkingPriceMethod(), responseObserver);
    }

    /**
     */
    public void computeParkingFee(generated.smarttransportation.system.FeeQuery request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.FeeResult> responseObserver) {
      asyncUnimplementedUnaryCall(getComputeParkingFeeMethod(), responseObserver);
    }

    /**
     */
    public void streamAvailableSpots(generated.smarttransportation.system.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.AvailableSpotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamAvailableSpotsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.smarttransportation.system.SensorStatus> monitorSensorStatus(
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.MaintenanceConfirmation> responseObserver) {
      return asyncUnimplementedStreamingCall(getMonitorSensorStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateAvailableSpotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.system.ZoneRequest,
                generated.smarttransportation.system.AvailableSpotResponse>(
                  this, METHODID_CALCULATE_AVAILABLE_SPOTS)))
          .addMethod(
            getSensorErrorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.system.SensorAlert,
                generated.smarttransportation.system.MaintenanceConfirmation>(
                  this, METHODID_SENSOR_ERROR)))
          .addMethod(
            getUpdateParkingPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.system.Pricing,
                generated.smarttransportation.system.ConfirmationMessage>(
                  this, METHODID_UPDATE_PARKING_PRICE)))
          .addMethod(
            getComputeParkingFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.system.FeeQuery,
                generated.smarttransportation.system.FeeResult>(
                  this, METHODID_COMPUTE_PARKING_FEE)))
          .addMethod(
            getStreamAvailableSpotsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.smarttransportation.system.ZoneRequest,
                generated.smarttransportation.system.AvailableSpotResponse>(
                  this, METHODID_STREAM_AVAILABLE_SPOTS)))
          .addMethod(
            getMonitorSensorStatusMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.smarttransportation.system.SensorStatus,
                generated.smarttransportation.system.MaintenanceConfirmation>(
                  this, METHODID_MONITOR_SENSOR_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * System Service
   * </pre>
   */
  public static final class SystemServiceStub extends io.grpc.stub.AbstractStub<SystemServiceStub> {
    private SystemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculateAvailableSpots(generated.smarttransportation.system.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.AvailableSpotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateAvailableSpotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sensorError(generated.smarttransportation.system.SensorAlert request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.MaintenanceConfirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSensorErrorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParkingPrice(generated.smarttransportation.system.Pricing request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.ConfirmationMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateParkingPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void computeParkingFee(generated.smarttransportation.system.FeeQuery request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.FeeResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getComputeParkingFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamAvailableSpots(generated.smarttransportation.system.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.AvailableSpotResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamAvailableSpotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.smarttransportation.system.SensorStatus> monitorSensorStatus(
        io.grpc.stub.StreamObserver<generated.smarttransportation.system.MaintenanceConfirmation> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMonitorSensorStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * System Service
   * </pre>
   */
  public static final class SystemServiceBlockingStub extends io.grpc.stub.AbstractStub<SystemServiceBlockingStub> {
    private SystemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.smarttransportation.system.AvailableSpotResponse calculateAvailableSpots(generated.smarttransportation.system.ZoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateAvailableSpotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.system.MaintenanceConfirmation sensorError(generated.smarttransportation.system.SensorAlert request) {
      return blockingUnaryCall(
          getChannel(), getSensorErrorMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.system.ConfirmationMessage updateParkingPrice(generated.smarttransportation.system.Pricing request) {
      return blockingUnaryCall(
          getChannel(), getUpdateParkingPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.system.FeeResult computeParkingFee(generated.smarttransportation.system.FeeQuery request) {
      return blockingUnaryCall(
          getChannel(), getComputeParkingFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generated.smarttransportation.system.AvailableSpotResponse> streamAvailableSpots(
        generated.smarttransportation.system.ZoneRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamAvailableSpotsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * System Service
   * </pre>
   */
  public static final class SystemServiceFutureStub extends io.grpc.stub.AbstractStub<SystemServiceFutureStub> {
    private SystemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.system.AvailableSpotResponse> calculateAvailableSpots(
        generated.smarttransportation.system.ZoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateAvailableSpotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.system.MaintenanceConfirmation> sensorError(
        generated.smarttransportation.system.SensorAlert request) {
      return futureUnaryCall(
          getChannel().newCall(getSensorErrorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.system.ConfirmationMessage> updateParkingPrice(
        generated.smarttransportation.system.Pricing request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateParkingPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.system.FeeResult> computeParkingFee(
        generated.smarttransportation.system.FeeQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getComputeParkingFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_AVAILABLE_SPOTS = 0;
  private static final int METHODID_SENSOR_ERROR = 1;
  private static final int METHODID_UPDATE_PARKING_PRICE = 2;
  private static final int METHODID_COMPUTE_PARKING_FEE = 3;
  private static final int METHODID_STREAM_AVAILABLE_SPOTS = 4;
  private static final int METHODID_MONITOR_SENSOR_STATUS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SystemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SystemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_AVAILABLE_SPOTS:
          serviceImpl.calculateAvailableSpots((generated.smarttransportation.system.ZoneRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.system.AvailableSpotResponse>) responseObserver);
          break;
        case METHODID_SENSOR_ERROR:
          serviceImpl.sensorError((generated.smarttransportation.system.SensorAlert) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.system.MaintenanceConfirmation>) responseObserver);
          break;
        case METHODID_UPDATE_PARKING_PRICE:
          serviceImpl.updateParkingPrice((generated.smarttransportation.system.Pricing) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.system.ConfirmationMessage>) responseObserver);
          break;
        case METHODID_COMPUTE_PARKING_FEE:
          serviceImpl.computeParkingFee((generated.smarttransportation.system.FeeQuery) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.system.FeeResult>) responseObserver);
          break;
        case METHODID_STREAM_AVAILABLE_SPOTS:
          serviceImpl.streamAvailableSpots((generated.smarttransportation.system.ZoneRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.system.AvailableSpotResponse>) responseObserver);
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
        case METHODID_MONITOR_SENSOR_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorSensorStatus(
              (io.grpc.stub.StreamObserver<generated.smarttransportation.system.MaintenanceConfirmation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SystemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smarttransportation.system.SystemServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SystemService");
    }
  }

  private static final class SystemServiceFileDescriptorSupplier
      extends SystemServiceBaseDescriptorSupplier {
    SystemServiceFileDescriptorSupplier() {}
  }

  private static final class SystemServiceMethodDescriptorSupplier
      extends SystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SystemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SystemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SystemServiceFileDescriptorSupplier())
              .addMethod(getCalculateAvailableSpotsMethod())
              .addMethod(getSensorErrorMethod())
              .addMethod(getUpdateParkingPriceMethod())
              .addMethod(getComputeParkingFeeMethod())
              .addMethod(getStreamAvailableSpotsMethod())
              .addMethod(getMonitorSensorStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
