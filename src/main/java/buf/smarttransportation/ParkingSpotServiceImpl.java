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
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingSpotServiceImpl extends ParkingSpotServiceGrpc.ParkingSpotServiceImplBase {
    private final Map<String, Boolean> parkingStatus = new ConcurrentHashMap<>();
    private final Map<String, Boolean> sensorStatus = new ConcurrentHashMap<>();
    private final Map<String, Long> parkingDuration = new ConcurrentHashMap<>();

    @Override
    public void sendParkingStatus(ParkingStatus request, StreamObserver<ConfirmationMessage> responseObserver) {
        parkingStatus.put(request.getSpotId(), request.getIsOccupied());
        
        ConfirmationMessage response = ConfirmationMessage.newBuilder().setSuccess(true).setMessage("Status Updated").build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sendParkingDuration(DurationData request, StreamObserver<ConfirmationMessage> responseObserver) {
        long duration = request.getExitTime() - request.getEntryTime();
        parkingDuration.put(request.getSpotId(), duration);

        ConfirmationMessage response = ConfirmationMessage.newBuilder().setSuccess(true).setMessage("Duration Updated").build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sendSensorStatus(SensorStatus request, StreamObserver<ConfirmationMessage> responseObserver) {
        sensorStatus.put(request.getSpotId(), request.getIsFunctional());

        ConfirmationMessage response = ConfirmationMessage.newBuilder().setSuccess(true).setMessage("Sensor Status Updated").build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}