package org.example.servergrpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.service.ImmatriculationGrpcService;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(5005)
                .addService(new ImmatriculationGrpcService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
