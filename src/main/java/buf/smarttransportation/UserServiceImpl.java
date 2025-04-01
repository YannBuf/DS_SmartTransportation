/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smarttransportation;

/**
 *
 * @author 19835
 */

import io.grpc.stub.StreamObserver;
import generated.smarttransportation.user.*;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void viewAvailableSpots(ZoneRequest request, StreamObserver<AvailableSpot> responseObserver) {
        System.out.println("User request to view aviable Spot: " + request.getZoneId());

        AvailableSpot response = AvailableSpot.newBuilder()
                .addAvailableSpotList("A1")
                .addAvailableSpotList("B2")
                .addAvailableSpotList("C3")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}