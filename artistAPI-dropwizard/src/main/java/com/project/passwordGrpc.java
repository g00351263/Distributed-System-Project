package com.project;

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
    comments = "Source: password.proto")
public final class passwordGrpc {

  private passwordGrpc() {}

  public static final String SERVICE_NAME = "password";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.Password.hash1,
      com.project.Password.hashResponse> getHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hash",
      requestType = com.project.Password.hash1.class,
      responseType = com.project.Password.hashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.Password.hash1,
      com.project.Password.hashResponse> getHashMethod() {
    io.grpc.MethodDescriptor<com.project.Password.hash1, com.project.Password.hashResponse> getHashMethod;
    if ((getHashMethod = passwordGrpc.getHashMethod) == null) {
      synchronized (passwordGrpc.class) {
        if ((getHashMethod = passwordGrpc.getHashMethod) == null) {
          passwordGrpc.getHashMethod = getHashMethod = 
              io.grpc.MethodDescriptor.<com.project.Password.hash1, com.project.Password.hashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "password", "hash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Password.hash1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Password.hashResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new passwordMethodDescriptorSupplier("hash"))
                  .build();
          }
        }
     }
     return getHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.Password.validate1,
      com.project.Password.validateResponse> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validate",
      requestType = com.project.Password.validate1.class,
      responseType = com.project.Password.validateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.Password.validate1,
      com.project.Password.validateResponse> getValidateMethod() {
    io.grpc.MethodDescriptor<com.project.Password.validate1, com.project.Password.validateResponse> getValidateMethod;
    if ((getValidateMethod = passwordGrpc.getValidateMethod) == null) {
      synchronized (passwordGrpc.class) {
        if ((getValidateMethod = passwordGrpc.getValidateMethod) == null) {
          passwordGrpc.getValidateMethod = getValidateMethod = 
              io.grpc.MethodDescriptor.<com.project.Password.validate1, com.project.Password.validateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "password", "validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Password.validate1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.Password.validateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new passwordMethodDescriptorSupplier("validate"))
                  .build();
          }
        }
     }
     return getValidateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static passwordStub newStub(io.grpc.Channel channel) {
    return new passwordStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static passwordBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new passwordBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static passwordFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new passwordFutureStub(channel);
  }

  /**
   */
  public static abstract class passwordImplBase implements io.grpc.BindableService {

    /**
     */
    public void hash(com.project.Password.hash1 request,
        io.grpc.stub.StreamObserver<com.project.Password.hashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHashMethod(), responseObserver);
    }

    /**
     */
    public void validate(com.project.Password.validate1 request,
        io.grpc.stub.StreamObserver<com.project.Password.validateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.Password.hash1,
                com.project.Password.hashResponse>(
                  this, METHODID_HASH)))
          .addMethod(
            getValidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.Password.validate1,
                com.project.Password.validateResponse>(
                  this, METHODID_VALIDATE)))
          .build();
    }
  }

  /**
   */
  public static final class passwordStub extends io.grpc.stub.AbstractStub<passwordStub> {
    private passwordStub(io.grpc.Channel channel) {
      super(channel);
    }

    private passwordStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected passwordStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new passwordStub(channel, callOptions);
    }

    /**
     */
    public void hash(com.project.Password.hash1 request,
        io.grpc.stub.StreamObserver<com.project.Password.hashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validate(com.project.Password.validate1 request,
        io.grpc.stub.StreamObserver<com.project.Password.validateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class passwordBlockingStub extends io.grpc.stub.AbstractStub<passwordBlockingStub> {
    private passwordBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private passwordBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected passwordBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new passwordBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.project.Password.hashResponse hash(com.project.Password.hash1 request) {
      return blockingUnaryCall(
          getChannel(), getHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.project.Password.validateResponse validate(com.project.Password.validate1 request) {
      return blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class passwordFutureStub extends io.grpc.stub.AbstractStub<passwordFutureStub> {
    private passwordFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private passwordFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected passwordFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new passwordFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.Password.hashResponse> hash(
        com.project.Password.hash1 request) {
      return futureUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.Password.validateResponse> validate(
        com.project.Password.validate1 request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HASH = 0;
  private static final int METHODID_VALIDATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final passwordImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(passwordImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HASH:
          serviceImpl.hash((com.project.Password.hash1) request,
              (io.grpc.stub.StreamObserver<com.project.Password.hashResponse>) responseObserver);
          break;
        case METHODID_VALIDATE:
          serviceImpl.validate((com.project.Password.validate1) request,
              (io.grpc.stub.StreamObserver<com.project.Password.validateResponse>) responseObserver);
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

  private static abstract class passwordBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    passwordBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.Password.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("password");
    }
  }

  private static final class passwordFileDescriptorSupplier
      extends passwordBaseDescriptorSupplier {
    passwordFileDescriptorSupplier() {}
  }

  private static final class passwordMethodDescriptorSupplier
      extends passwordBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    passwordMethodDescriptorSupplier(String methodName) {
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
      synchronized (passwordGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new passwordFileDescriptorSupplier())
              .addMethod(getHashMethod())
              .addMethod(getValidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
