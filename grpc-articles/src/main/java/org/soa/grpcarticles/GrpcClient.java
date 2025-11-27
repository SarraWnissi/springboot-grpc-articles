package org.soa.grpcarticles;
import crudarticles.ArticleOuterClass;
import crudarticles.ArticleServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",
                        9090)
                .usePlaintext()
                .build();
        ArticleServiceGrpc.ArticleServiceBlockingStub stub =
                ArticleServiceGrpc.newBlockingStub(channel);
// Création d'un article
        ArticleOuterClass.Article article =
                ArticleOuterClass.Article.newBuilder()
                        .setCode("A001")
                        .setDesignation("Laptop")
                        .setPrix(1200.00)
                        .build();
        ArticleOuterClass.ArticleResponse createResponse =
                stub.createArticle(article);
        System.out.println(createResponse.getMessage());
// Lecture de l'article
        ArticleOuterClass.ArticleRequest request =
                ArticleOuterClass.ArticleRequest.newBuilder().setCode("A001").build();
        ArticleOuterClass.Article readArticle = stub.getArticle(request);
        System.out.println("Article: " + readArticle);
        channel.shutdown();
    }
}