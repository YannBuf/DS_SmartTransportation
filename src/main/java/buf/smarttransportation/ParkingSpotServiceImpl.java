package buf.smarttransportation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 19835
 */

import io.grpc.stub.StreamObserver;
import generated.smarttransportation.parkingspot.*;


public class ParkingSpotServiceImpl extends ParkingSpotServiceGrpc.ParkingSpotServiceImplBase {
    @Override
    public void sendParkingStatus(ParkingStatus request, StreamObserver<ConfirmationMessage> responseObserver) {
        System.out.println("Spot Status: " + request.getSpotId() + " Occupied: " + request.getIsOccupied());

        ConfirmationMessage response = ConfirmationMessage.newBuilder()
                .setSuccess(true)
                .setMessage("Spot Status updated!")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}