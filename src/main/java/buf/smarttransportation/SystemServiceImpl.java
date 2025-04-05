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
 import generated.smarttransportation.system.*;
 import java.util.*;
 import java.util.concurrent.ConcurrentHashMap;

public class SystemServiceImpl extends SystemServiceGrpc.SystemServiceImplBase {
    private final Map<String, Integer> availableSpots = new ConcurrentHashMap<>();
    private final Map<String, Float> pricing = new ConcurrentHashMap<>();
    private final Map<String, Boolean> sensorErrors = new ConcurrentHashMap<>();

    @Override
    public void calculateAvailableSpots(ZoneRequest request, StreamObserver<AvailableSpotResponse> responseObserver) {
        int available = availableSpots.getOrDefault(request.getZoneId(), 0);
        
        AvailableSpotResponse response = AvailableSpotResponse.newBuilder().setZoneId(request.getZoneId()).setAvailableSpot(available).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sensorError(SensorAlert request, StreamObserver<MaintenanceConfirmation> responseObserver) {
        sensorErrors.put(request.getSpotId(), true);

        MaintenanceConfirmation response = MaintenanceConfirmation.newBuilder().setSuccess(true).setMessage("Maintenance Alert Sent").build(); 

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateParkingPrice(Pricing request, StreamObserver<ConfirmationMessage> responseObserver) {
        pricing.put(request.getZoneId(), request.getBaseRate() * request.getMultiplier());
        
        ConfirmationMessage response = ConfirmationMessage.newBuilder().setSuccess(true).setMessage("Pricing Updated").build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void computeParkingFee(FeeQuery request, StreamObserver<FeeResult> responseObserver) {
        long timeSpent = request.getExitTime() - request.getEntryTime();
        float rate = pricing.getOrDefault(request.getSpotId(), 10.0F);
        
        FeeResult response = FeeResult.newBuilder().setParkingFee(timeSpent * rate).setParkingTime(timeSpent).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
