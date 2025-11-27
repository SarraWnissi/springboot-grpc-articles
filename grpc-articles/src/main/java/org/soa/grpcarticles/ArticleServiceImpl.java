package org.soa.grpcarticles;
import io.grpc.stub.StreamObserver;
import crudarticles.ArticleOuterClass;
import crudarticles.ArticleServiceGrpc;
import java.util.HashMap;
import java.util.Map;
public class ArticleServiceImpl extends
        ArticleServiceGrpc.ArticleServiceImplBase {
    private final Map<String, ArticleOuterClass.Article> articleDB = new
            HashMap<>();
    @Override
    public void createArticle(ArticleOuterClass.Article request,
                              StreamObserver<ArticleOuterClass.ArticleResponse> responseObserver) {
        articleDB.put(request.getCode(), request);
        ArticleOuterClass.ArticleResponse response =
                ArticleOuterClass.ArticleResponse.newBuilder()
                        .setMessage("Article créé avec succès!")
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void getAllArticles(ArticleOuterClass.EmptyRequest request,
                               StreamObserver<ArticleOuterClass.ArticleListResponse> responseObserver) {
        System.out.println("Récupération de tous les articles.");
        ArticleOuterClass.ArticleListResponse.Builder responseBuilder =
                ArticleOuterClass.ArticleListResponse.newBuilder();
        for (ArticleOuterClass.Article article : articleDB.values()) {
            responseBuilder.addArticles(article);
        }
        ArticleOuterClass.ArticleListResponse response =
                responseBuilder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void getArticle(ArticleOuterClass.ArticleRequest request,
                           StreamObserver<ArticleOuterClass.Article> responseObserver) {
        System.out.println("Recherche de l'article avec code: " +
                request.getCode());
        ArticleOuterClass.Article article = articleDB.get(request.getCode());
        if (article == null) {
            System.out.println("Article non trouvé, renvoi d'un article vide");
            article = ArticleOuterClass.Article.newBuilder().build();
        } else {
            System.out.println("Article trouvé: " + article);
        }
        responseObserver.onNext(article);
        responseObserver.onCompleted();
    }
    @Override
    public void updateArticle(ArticleOuterClass.Article request,
                              StreamObserver<ArticleOuterClass.ArticleResponse> responseObserver) {
        articleDB.put(request.getCode(), request);
        ArticleOuterClass.ArticleResponse response =
                ArticleOuterClass.ArticleResponse.newBuilder()
                        .setMessage("Article mis à jour!")
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void deleteArticle(ArticleOuterClass.ArticleRequest request,
                              StreamObserver<ArticleOuterClass.ArticleResponse> responseObserver) {
        articleDB.remove(request.getCode());
        ArticleOuterClass.ArticleResponse response =
                ArticleOuterClass.ArticleResponse.newBuilder()
                        .setMessage("Article supprimé!")
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }}