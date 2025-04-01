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

public class SystemServiceImpl extends SystemServiceGrpc.SystemServiceImplBase {
    @Override
    public void calculateAvailableSpots(ZoneRequest request, StreamObserver<AvailableSpotResponse> responseObserver) {
        System.out.println("🔍 Areas " + request.getZoneId() + " Avaible Spot...");

        AvailableSpotResponse response = AvailableSpotResponse.newBuilder()
                .setZoneId(request.getZoneId())
                .setAvailableSpot(10) // Assume we have 10 Spot
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
