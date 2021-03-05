package org.example;


import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
    public static void main(String[] args) {
        try {

            Server server = ServerBuilder.forPort(8188)
                    .addService(new GreetingServiceImpl())
                    .build();

            server.start();
            System.out.println("Server started");
            server.awaitTermination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
