# springboot-grpc-articles

[![Java](https://img.shields.io/badge/Java-21-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.3-green)](https://spring.io/projects/spring-boot)
[![gRPC](https://img.shields.io/badge/gRPC-1.65.0-brightgreen)](https://grpc.io/)
[![Protocol Buffers](https://img.shields.io/badge/Protobuf-3.25.0-orange)](https://developers.google.com/protocol-buffers)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

---

##  Description

**springboot-grpc-articles** est un microservice développé avec **Spring Boot 3** et **gRPC**, permettant
la gestion et la consultation d’articles via différents modes de communication gRPC :

- Unary RPC  
- Server Streaming  
- Client Streaming  
- Bidirectional Streaming  

Le service expose des opérations pour récupérer, créer, et analyser des articles en utilisant un fichier `.proto`
dont les stubs Java sont générés automatiquement.

---

##  Fonctionnalités

- ** Récupération d’un article (Unary RPC)**  
  Retourne les détails d’un article à partir de son ID.

- ** Liste des articles (Server Streaming)**  
  Envoie un flux d’articles un par un.

- ** Ajout multiple d’articles (Client Streaming)**  
  Le client envoie plusieurs articles, et le serveur retourne un accusé de réception.

- ** Analyse continue d’articles (Bidirectional Streaming)**  
  Le client envoie des articles et le serveur renvoie des statistiques en temps réel.

- **🛠️ Génération automatique des stubs gRPC** via `protobuf-maven-plugin`.

---

##  Technologies utilisées

- **Java 21**  
- **Spring Boot 3.3.3**  
- **gRPC Java 1.65.0**  
- **Protocol Buffers 3.25.0**  
- **Maven**

---

##  Structure du projet
springboot-grpc-articles
│
├── src/main/java/com/example/grpc/articles
│ ├── service/ # Implémentations gRPC
│ ├── config/ # Configuration du serveur gRPC
│ └── model/ # Entités Article
│
├── src/main/proto
│ └── article.proto # Définition Protobuf
│
├── pom.xml
└── README.md
MIT License

Copyright (c) 2025 Sarra

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

