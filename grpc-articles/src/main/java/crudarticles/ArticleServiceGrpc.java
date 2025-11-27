package crudarticles;

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
 * Définition du service gRPC
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: article.proto")
public final class ArticleServiceGrpc {

  private ArticleServiceGrpc() {}

  public static final String SERVICE_NAME = "ArticleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.Article,
      crudarticles.ArticleOuterClass.ArticleResponse> getCreateArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateArticle",
      requestType = crudarticles.ArticleOuterClass.Article.class,
      responseType = crudarticles.ArticleOuterClass.ArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.Article,
      crudarticles.ArticleOuterClass.ArticleResponse> getCreateArticleMethod() {
    io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.Article, crudarticles.ArticleOuterClass.ArticleResponse> getCreateArticleMethod;
    if ((getCreateArticleMethod = ArticleServiceGrpc.getCreateArticleMethod) == null) {
      synchronized (ArticleServiceGrpc.class) {
        if ((getCreateArticleMethod = ArticleServiceGrpc.getCreateArticleMethod) == null) {
          ArticleServiceGrpc.getCreateArticleMethod = getCreateArticleMethod = 
              io.grpc.MethodDescriptor.<crudarticles.ArticleOuterClass.Article, crudarticles.ArticleOuterClass.ArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ArticleService", "CreateArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.Article.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.ArticleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArticleServiceMethodDescriptorSupplier("CreateArticle"))
                  .build();
          }
        }
     }
     return getCreateArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.ArticleRequest,
      crudarticles.ArticleOuterClass.Article> getGetArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArticle",
      requestType = crudarticles.ArticleOuterClass.ArticleRequest.class,
      responseType = crudarticles.ArticleOuterClass.Article.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.ArticleRequest,
      crudarticles.ArticleOuterClass.Article> getGetArticleMethod() {
    io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.ArticleRequest, crudarticles.ArticleOuterClass.Article> getGetArticleMethod;
    if ((getGetArticleMethod = ArticleServiceGrpc.getGetArticleMethod) == null) {
      synchronized (ArticleServiceGrpc.class) {
        if ((getGetArticleMethod = ArticleServiceGrpc.getGetArticleMethod) == null) {
          ArticleServiceGrpc.getGetArticleMethod = getGetArticleMethod = 
              io.grpc.MethodDescriptor.<crudarticles.ArticleOuterClass.ArticleRequest, crudarticles.ArticleOuterClass.Article>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ArticleService", "GetArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.ArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.Article.getDefaultInstance()))
                  .setSchemaDescriptor(new ArticleServiceMethodDescriptorSupplier("GetArticle"))
                  .build();
          }
        }
     }
     return getGetArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.Article,
      crudarticles.ArticleOuterClass.ArticleResponse> getUpdateArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateArticle",
      requestType = crudarticles.ArticleOuterClass.Article.class,
      responseType = crudarticles.ArticleOuterClass.ArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.Article,
      crudarticles.ArticleOuterClass.ArticleResponse> getUpdateArticleMethod() {
    io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.Article, crudarticles.ArticleOuterClass.ArticleResponse> getUpdateArticleMethod;
    if ((getUpdateArticleMethod = ArticleServiceGrpc.getUpdateArticleMethod) == null) {
      synchronized (ArticleServiceGrpc.class) {
        if ((getUpdateArticleMethod = ArticleServiceGrpc.getUpdateArticleMethod) == null) {
          ArticleServiceGrpc.getUpdateArticleMethod = getUpdateArticleMethod = 
              io.grpc.MethodDescriptor.<crudarticles.ArticleOuterClass.Article, crudarticles.ArticleOuterClass.ArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ArticleService", "UpdateArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.Article.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.ArticleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArticleServiceMethodDescriptorSupplier("UpdateArticle"))
                  .build();
          }
        }
     }
     return getUpdateArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.ArticleRequest,
      crudarticles.ArticleOuterClass.ArticleResponse> getDeleteArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteArticle",
      requestType = crudarticles.ArticleOuterClass.ArticleRequest.class,
      responseType = crudarticles.ArticleOuterClass.ArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.ArticleRequest,
      crudarticles.ArticleOuterClass.ArticleResponse> getDeleteArticleMethod() {
    io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.ArticleRequest, crudarticles.ArticleOuterClass.ArticleResponse> getDeleteArticleMethod;
    if ((getDeleteArticleMethod = ArticleServiceGrpc.getDeleteArticleMethod) == null) {
      synchronized (ArticleServiceGrpc.class) {
        if ((getDeleteArticleMethod = ArticleServiceGrpc.getDeleteArticleMethod) == null) {
          ArticleServiceGrpc.getDeleteArticleMethod = getDeleteArticleMethod = 
              io.grpc.MethodDescriptor.<crudarticles.ArticleOuterClass.ArticleRequest, crudarticles.ArticleOuterClass.ArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ArticleService", "DeleteArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.ArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.ArticleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArticleServiceMethodDescriptorSupplier("DeleteArticle"))
                  .build();
          }
        }
     }
     return getDeleteArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.EmptyRequest,
      crudarticles.ArticleOuterClass.ArticleListResponse> getGetAllArticlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllArticles",
      requestType = crudarticles.ArticleOuterClass.EmptyRequest.class,
      responseType = crudarticles.ArticleOuterClass.ArticleListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.EmptyRequest,
      crudarticles.ArticleOuterClass.ArticleListResponse> getGetAllArticlesMethod() {
    io.grpc.MethodDescriptor<crudarticles.ArticleOuterClass.EmptyRequest, crudarticles.ArticleOuterClass.ArticleListResponse> getGetAllArticlesMethod;
    if ((getGetAllArticlesMethod = ArticleServiceGrpc.getGetAllArticlesMethod) == null) {
      synchronized (ArticleServiceGrpc.class) {
        if ((getGetAllArticlesMethod = ArticleServiceGrpc.getGetAllArticlesMethod) == null) {
          ArticleServiceGrpc.getGetAllArticlesMethod = getGetAllArticlesMethod = 
              io.grpc.MethodDescriptor.<crudarticles.ArticleOuterClass.EmptyRequest, crudarticles.ArticleOuterClass.ArticleListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ArticleService", "GetAllArticles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  crudarticles.ArticleOuterClass.ArticleListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArticleServiceMethodDescriptorSupplier("GetAllArticles"))
                  .build();
          }
        }
     }
     return getGetAllArticlesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArticleServiceStub newStub(io.grpc.Channel channel) {
    return new ArticleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArticleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArticleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArticleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArticleServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Définition du service gRPC
   * </pre>
   */
  public static abstract class ArticleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createArticle(crudarticles.ArticleOuterClass.Article request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateArticleMethod(), responseObserver);
    }

    /**
     */
    public void getArticle(crudarticles.ArticleOuterClass.ArticleRequest request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.Article> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArticleMethod(), responseObserver);
    }

    /**
     */
    public void updateArticle(crudarticles.ArticleOuterClass.Article request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateArticleMethod(), responseObserver);
    }

    /**
     */
    public void deleteArticle(crudarticles.ArticleOuterClass.ArticleRequest request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteArticleMethod(), responseObserver);
    }

    /**
     */
    public void getAllArticles(crudarticles.ArticleOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllArticlesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateArticleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                crudarticles.ArticleOuterClass.Article,
                crudarticles.ArticleOuterClass.ArticleResponse>(
                  this, METHODID_CREATE_ARTICLE)))
          .addMethod(
            getGetArticleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                crudarticles.ArticleOuterClass.ArticleRequest,
                crudarticles.ArticleOuterClass.Article>(
                  this, METHODID_GET_ARTICLE)))
          .addMethod(
            getUpdateArticleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                crudarticles.ArticleOuterClass.Article,
                crudarticles.ArticleOuterClass.ArticleResponse>(
                  this, METHODID_UPDATE_ARTICLE)))
          .addMethod(
            getDeleteArticleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                crudarticles.ArticleOuterClass.ArticleRequest,
                crudarticles.ArticleOuterClass.ArticleResponse>(
                  this, METHODID_DELETE_ARTICLE)))
          .addMethod(
            getGetAllArticlesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                crudarticles.ArticleOuterClass.EmptyRequest,
                crudarticles.ArticleOuterClass.ArticleListResponse>(
                  this, METHODID_GET_ALL_ARTICLES)))
          .build();
    }
  }

  /**
   * <pre>
   * Définition du service gRPC
   * </pre>
   */
  public static final class ArticleServiceStub extends io.grpc.stub.AbstractStub<ArticleServiceStub> {
    private ArticleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleServiceStub(channel, callOptions);
    }

    /**
     */
    public void createArticle(crudarticles.ArticleOuterClass.Article request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArticle(crudarticles.ArticleOuterClass.ArticleRequest request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.Article> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateArticle(crudarticles.ArticleOuterClass.Article request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteArticle(crudarticles.ArticleOuterClass.ArticleRequest request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllArticles(crudarticles.ArticleOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllArticlesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Définition du service gRPC
   * </pre>
   */
  public static final class ArticleServiceBlockingStub extends io.grpc.stub.AbstractStub<ArticleServiceBlockingStub> {
    private ArticleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public crudarticles.ArticleOuterClass.ArticleResponse createArticle(crudarticles.ArticleOuterClass.Article request) {
      return blockingUnaryCall(
          getChannel(), getCreateArticleMethod(), getCallOptions(), request);
    }

    /**
     */
    public crudarticles.ArticleOuterClass.Article getArticle(crudarticles.ArticleOuterClass.ArticleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetArticleMethod(), getCallOptions(), request);
    }

    /**
     */
    public crudarticles.ArticleOuterClass.ArticleResponse updateArticle(crudarticles.ArticleOuterClass.Article request) {
      return blockingUnaryCall(
          getChannel(), getUpdateArticleMethod(), getCallOptions(), request);
    }

    /**
     */
    public crudarticles.ArticleOuterClass.ArticleResponse deleteArticle(crudarticles.ArticleOuterClass.ArticleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteArticleMethod(), getCallOptions(), request);
    }

    /**
     */
    public crudarticles.ArticleOuterClass.ArticleListResponse getAllArticles(crudarticles.ArticleOuterClass.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllArticlesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Définition du service gRPC
   * </pre>
   */
  public static final class ArticleServiceFutureStub extends io.grpc.stub.AbstractStub<ArticleServiceFutureStub> {
    private ArticleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<crudarticles.ArticleOuterClass.ArticleResponse> createArticle(
        crudarticles.ArticleOuterClass.Article request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateArticleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<crudarticles.ArticleOuterClass.Article> getArticle(
        crudarticles.ArticleOuterClass.ArticleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetArticleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<crudarticles.ArticleOuterClass.ArticleResponse> updateArticle(
        crudarticles.ArticleOuterClass.Article request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateArticleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<crudarticles.ArticleOuterClass.ArticleResponse> deleteArticle(
        crudarticles.ArticleOuterClass.ArticleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteArticleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<crudarticles.ArticleOuterClass.ArticleListResponse> getAllArticles(
        crudarticles.ArticleOuterClass.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllArticlesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ARTICLE = 0;
  private static final int METHODID_GET_ARTICLE = 1;
  private static final int METHODID_UPDATE_ARTICLE = 2;
  private static final int METHODID_DELETE_ARTICLE = 3;
  private static final int METHODID_GET_ALL_ARTICLES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArticleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArticleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ARTICLE:
          serviceImpl.createArticle((crudarticles.ArticleOuterClass.Article) request,
              (io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse>) responseObserver);
          break;
        case METHODID_GET_ARTICLE:
          serviceImpl.getArticle((crudarticles.ArticleOuterClass.ArticleRequest) request,
              (io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.Article>) responseObserver);
          break;
        case METHODID_UPDATE_ARTICLE:
          serviceImpl.updateArticle((crudarticles.ArticleOuterClass.Article) request,
              (io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse>) responseObserver);
          break;
        case METHODID_DELETE_ARTICLE:
          serviceImpl.deleteArticle((crudarticles.ArticleOuterClass.ArticleRequest) request,
              (io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ARTICLES:
          serviceImpl.getAllArticles((crudarticles.ArticleOuterClass.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<crudarticles.ArticleOuterClass.ArticleListResponse>) responseObserver);
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

  private static abstract class ArticleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArticleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return crudarticles.ArticleOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArticleService");
    }
  }

  private static final class ArticleServiceFileDescriptorSupplier
      extends ArticleServiceBaseDescriptorSupplier {
    ArticleServiceFileDescriptorSupplier() {}
  }

  private static final class ArticleServiceMethodDescriptorSupplier
      extends ArticleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArticleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ArticleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArticleServiceFileDescriptorSupplier())
              .addMethod(getCreateArticleMethod())
              .addMethod(getGetArticleMethod())
              .addMethod(getUpdateArticleMethod())
              .addMethod(getDeleteArticleMethod())
              .addMethod(getGetAllArticlesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
