/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smarttransportation;

/**
 *
 * @author 19835
 */

import generated.smarttransportation.parkingspot.ParkingSpotServiceGrpc;
import generated.smarttransportation.system.SystemServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import generated.smarttransportation.user.*;

public class SmartParkingClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        
        //create stub to recall gRPC Service
        ParkingSpotServiceGrpc.ParkingSpotServiceBlockingStub parkingStub = ParkingSpotServiceGrpc.newBlockingStub(channel);
        SystemServiceGrpc.SystemServiceBlockingStub systemStub = SystemServiceGrpc.newBlockingStub(channel);
        UserServiceGrpc.UserServiceBlockingStub userStub = UserServiceGrpc.newBlockingStub(channel);
        
        
        ZoneRequest request = ZoneRequest.newBuilder().setZoneId("Z001").build();
        AvailableSpot response = userStub.viewAvailableSpots(request);

        System.out.println("Avaiable Spot: " + response.getAvailableSpotListList());

        channel.shutdown();
    }
}
