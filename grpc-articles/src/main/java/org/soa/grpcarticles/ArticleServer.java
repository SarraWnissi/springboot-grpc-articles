package org.soa.grpcarticles;
import io.grpc.Server;
import io.grpc.ServerBuilder;
public class ArticleServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090)
                .addService(new ArticleServiceImpl())
                .build();
        System.out.println("Serveur gRPC démarré sur le port 9090...");
        server.start();
        server.awaitTermination();
    }
}