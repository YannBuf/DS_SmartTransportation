package generated.smarttransportation.user;

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
 * User Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: UserService.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.user.ZoneRequest,
      generated.smarttransportation.user.AvailableSpot> getViewAvailableSpotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAvailableSpots",
      requestType = generated.smarttransportation.user.ZoneRequest.class,
      responseType = generated.smarttransportation.user.AvailableSpot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.user.ZoneRequest,
      generated.smarttransportation.user.AvailableSpot> getViewAvailableSpotsMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.user.ZoneRequest, generated.smarttransportation.user.AvailableSpot> getViewAvailableSpotsMethod;
    if ((getViewAvailableSpotsMethod = UserServiceGrpc.getViewAvailableSpotsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getViewAvailableSpotsMethod = UserServiceGrpc.getViewAvailableSpotsMethod) == null) {
          UserServiceGrpc.getViewAvailableSpotsMethod = getViewAvailableSpotsMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.user.ZoneRequest, generated.smarttransportation.user.AvailableSpot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService.UserService", "ViewAvailableSpots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.ZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.AvailableSpot.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ViewAvailableSpots"))
                  .build();
          }
        }
     }
     return getViewAvailableSpotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.user.ReservationRequest,
      generated.smarttransportation.user.ReservationConfirm> getReserveSpotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveSpot",
      requestType = generated.smarttransportation.user.ReservationRequest.class,
      responseType = generated.smarttransportation.user.ReservationConfirm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.user.ReservationRequest,
      generated.smarttransportation.user.ReservationConfirm> getReserveSpotMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.user.ReservationRequest, generated.smarttransportation.user.ReservationConfirm> getReserveSpotMethod;
    if ((getReserveSpotMethod = UserServiceGrpc.getReserveSpotMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getReserveSpotMethod = UserServiceGrpc.getReserveSpotMethod) == null) {
          UserServiceGrpc.getReserveSpotMethod = getReserveSpotMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.user.ReservationRequest, generated.smarttransportation.user.ReservationConfirm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService.UserService", "ReserveSpot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.ReservationConfirm.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ReserveSpot"))
                  .build();
          }
        }
     }
     return getReserveSpotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.user.NavigationRequest,
      generated.smarttransportation.user.NavigationPath> getNavigateToSpotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavigateToSpot",
      requestType = generated.smarttransportation.user.NavigationRequest.class,
      responseType = generated.smarttransportation.user.NavigationPath.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.user.NavigationRequest,
      generated.smarttransportation.user.NavigationPath> getNavigateToSpotMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.user.NavigationRequest, generated.smarttransportation.user.NavigationPath> getNavigateToSpotMethod;
    if ((getNavigateToSpotMethod = UserServiceGrpc.getNavigateToSpotMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getNavigateToSpotMethod = UserServiceGrpc.getNavigateToSpotMethod) == null) {
          UserServiceGrpc.getNavigateToSpotMethod = getNavigateToSpotMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.user.NavigationRequest, generated.smarttransportation.user.NavigationPath>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService.UserService", "NavigateToSpot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.NavigationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.NavigationPath.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("NavigateToSpot"))
                  .build();
          }
        }
     }
     return getNavigateToSpotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.user.PaymentRequest,
      generated.smarttransportation.user.PaymentReceipt> getPayParkingFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PayParkingFee",
      requestType = generated.smarttransportation.user.PaymentRequest.class,
      responseType = generated.smarttransportation.user.PaymentReceipt.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.user.PaymentRequest,
      generated.smarttransportation.user.PaymentReceipt> getPayParkingFeeMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.user.PaymentRequest, generated.smarttransportation.user.PaymentReceipt> getPayParkingFeeMethod;
    if ((getPayParkingFeeMethod = UserServiceGrpc.getPayParkingFeeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getPayParkingFeeMethod = UserServiceGrpc.getPayParkingFeeMethod) == null) {
          UserServiceGrpc.getPayParkingFeeMethod = getPayParkingFeeMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.user.PaymentRequest, generated.smarttransportation.user.PaymentReceipt>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService.UserService", "PayParkingFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.PaymentReceipt.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("PayParkingFee"))
                  .build();
          }
        }
     }
     return getPayParkingFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smarttransportation.user.NavigationRequest,
      generated.smarttransportation.user.NavigationPath> getStreamNavigationPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamNavigationPath",
      requestType = generated.smarttransportation.user.NavigationRequest.class,
      responseType = generated.smarttransportation.user.NavigationPath.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smarttransportation.user.NavigationRequest,
      generated.smarttransportation.user.NavigationPath> getStreamNavigationPathMethod() {
    io.grpc.MethodDescriptor<generated.smarttransportation.user.NavigationRequest, generated.smarttransportation.user.NavigationPath> getStreamNavigationPathMethod;
    if ((getStreamNavigationPathMethod = UserServiceGrpc.getStreamNavigationPathMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getStreamNavigationPathMethod = UserServiceGrpc.getStreamNavigationPathMethod) == null) {
          UserServiceGrpc.getStreamNavigationPathMethod = getStreamNavigationPathMethod = 
              io.grpc.MethodDescriptor.<generated.smarttransportation.user.NavigationRequest, generated.smarttransportation.user.NavigationPath>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService.UserService", "StreamNavigationPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.NavigationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smarttransportation.user.NavigationPath.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("StreamNavigationPath"))
                  .build();
          }
        }
     }
     return getStreamNavigationPathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * User Service
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void viewAvailableSpots(generated.smarttransportation.user.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.AvailableSpot> responseObserver) {
      asyncUnimplementedUnaryCall(getViewAvailableSpotsMethod(), responseObserver);
    }

    /**
     */
    public void reserveSpot(generated.smarttransportation.user.ReservationRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.ReservationConfirm> responseObserver) {
      asyncUnimplementedUnaryCall(getReserveSpotMethod(), responseObserver);
    }

    /**
     */
    public void navigateToSpot(generated.smarttransportation.user.NavigationRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.NavigationPath> responseObserver) {
      asyncUnimplementedUnaryCall(getNavigateToSpotMethod(), responseObserver);
    }

    /**
     */
    public void payParkingFee(generated.smarttransportation.user.PaymentRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.PaymentReceipt> responseObserver) {
      asyncUnimplementedUnaryCall(getPayParkingFeeMethod(), responseObserver);
    }

    /**
     */
    public void streamNavigationPath(generated.smarttransportation.user.NavigationRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.NavigationPath> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamNavigationPathMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getViewAvailableSpotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.user.ZoneRequest,
                generated.smarttransportation.user.AvailableSpot>(
                  this, METHODID_VIEW_AVAILABLE_SPOTS)))
          .addMethod(
            getReserveSpotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.user.ReservationRequest,
                generated.smarttransportation.user.ReservationConfirm>(
                  this, METHODID_RESERVE_SPOT)))
          .addMethod(
            getNavigateToSpotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.user.NavigationRequest,
                generated.smarttransportation.user.NavigationPath>(
                  this, METHODID_NAVIGATE_TO_SPOT)))
          .addMethod(
            getPayParkingFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smarttransportation.user.PaymentRequest,
                generated.smarttransportation.user.PaymentReceipt>(
                  this, METHODID_PAY_PARKING_FEE)))
          .addMethod(
            getStreamNavigationPathMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.smarttransportation.user.NavigationRequest,
                generated.smarttransportation.user.NavigationPath>(
                  this, METHODID_STREAM_NAVIGATION_PATH)))
          .build();
    }
  }

  /**
   * <pre>
   * User Service
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void viewAvailableSpots(generated.smarttransportation.user.ZoneRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.AvailableSpot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewAvailableSpotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reserveSpot(generated.smarttransportation.user.ReservationRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.ReservationConfirm> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReserveSpotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void navigateToSpot(generated.smarttransportation.user.NavigationRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.NavigationPath> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNavigateToSpotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void payParkingFee(generated.smarttransportation.user.PaymentRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.PaymentReceipt> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayParkingFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamNavigationPath(generated.smarttransportation.user.NavigationRequest request,
        io.grpc.stub.StreamObserver<generated.smarttransportation.user.NavigationPath> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamNavigationPathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * User Service
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.smarttransportation.user.AvailableSpot viewAvailableSpots(generated.smarttransportation.user.ZoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getViewAvailableSpotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.user.ReservationConfirm reserveSpot(generated.smarttransportation.user.ReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getReserveSpotMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.user.NavigationPath navigateToSpot(generated.smarttransportation.user.NavigationRequest request) {
      return blockingUnaryCall(
          getChannel(), getNavigateToSpotMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smarttransportation.user.PaymentReceipt payParkingFee(generated.smarttransportation.user.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getPayParkingFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generated.smarttransportation.user.NavigationPath> streamNavigationPath(
        generated.smarttransportation.user.NavigationRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamNavigationPathMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * User Service
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.user.AvailableSpot> viewAvailableSpots(
        generated.smarttransportation.user.ZoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getViewAvailableSpotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.user.ReservationConfirm> reserveSpot(
        generated.smarttransportation.user.ReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReserveSpotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.user.NavigationPath> navigateToSpot(
        generated.smarttransportation.user.NavigationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNavigateToSpotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smarttransportation.user.PaymentReceipt> payParkingFee(
        generated.smarttransportation.user.PaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPayParkingFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_AVAILABLE_SPOTS = 0;
  private static final int METHODID_RESERVE_SPOT = 1;
  private static final int METHODID_NAVIGATE_TO_SPOT = 2;
  private static final int METHODID_PAY_PARKING_FEE = 3;
  private static final int METHODID_STREAM_NAVIGATION_PATH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VIEW_AVAILABLE_SPOTS:
          serviceImpl.viewAvailableSpots((generated.smarttransportation.user.ZoneRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.user.AvailableSpot>) responseObserver);
          break;
        case METHODID_RESERVE_SPOT:
          serviceImpl.reserveSpot((generated.smarttransportation.user.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.user.ReservationConfirm>) responseObserver);
          break;
        case METHODID_NAVIGATE_TO_SPOT:
          serviceImpl.navigateToSpot((generated.smarttransportation.user.NavigationRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.user.NavigationPath>) responseObserver);
          break;
        case METHODID_PAY_PARKING_FEE:
          serviceImpl.payParkingFee((generated.smarttransportation.user.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.user.PaymentReceipt>) responseObserver);
          break;
        case METHODID_STREAM_NAVIGATION_PATH:
          serviceImpl.streamNavigationPath((generated.smarttransportation.user.NavigationRequest) request,
              (io.grpc.stub.StreamObserver<generated.smarttransportation.user.NavigationPath>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smarttransportation.user.UserServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getViewAvailableSpotsMethod())
              .addMethod(getReserveSpotMethod())
              .addMethod(getNavigateToSpotMethod())
              .addMethod(getPayParkingFeeMethod())
              .addMethod(getStreamNavigationPathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
