/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smarttransportation;

/**
 *
 * @author 19835
 */

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SmartParkingService {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50051)
                .addService(new ParkingSpotServiceImpl())
                .addService(new SystemServiceImpl())
                .addService(new UserServiceImpl())
                .build()
                .start();

        System.out.println("Grpc Service running on port: 50051");

        server.awaitTermination();
    }
}
