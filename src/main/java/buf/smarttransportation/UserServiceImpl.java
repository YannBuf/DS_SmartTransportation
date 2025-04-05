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

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    private final Map<String, String> reservations = new ConcurrentHashMap<>();
    private final Map<String, Double> payments = new ConcurrentHashMap<>();

    @Override
    public void viewAvailableSpots(ZoneRequest request, StreamObserver<AvailableSpot> responseObserver) {
        System.out.println("User request to view aviable Spot: " + request.getZoneId());
        
        //Example Spots
        List<String> spots = List.of("A1","A2","B1","B2","C1","C2"); 

        AvailableSpot response = AvailableSpot.newBuilder().addAllAvailableSpotList(spots).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void reserveSpot(ReservationRequest request, StreamObserver<ReservationConfirm> responseObserver) {
        //Match User ID and Spot ID to form reservation
        reservations.put(request.getUserId(), request.getSpotId());

        ReservationConfirm response = ReservationConfirm.newBuilder().setSuccess(true).setConfirmationId(UUID.randomUUID().toString()).setMessage("Spot Reserved").build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void navigateToSpot(NavigationRequest request, StreamObserver<NavigationPath> responseObserver) {
        //Example of navigation
        NavigationPath response = NavigationPath.newBuilder().addSteps("Go Straight").addSteps("Turn Right").addSteps("Arrived").build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void payParkingFee(PaymentRequest request, StreamObserver<PaymentReceipt> responseObserver) {
        //Get the parking fee and use the default 10 EUR if not info available
        double fee = payments.getOrDefault(request.getSpotId(), 10.0);

        PaymentReceipt response = PaymentReceipt.newBuilder().setReceiptId(UUID.randomUUID().toString()).setFeePaid((float) fee).setPaymentStatus("Paid").build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}