package dev.charu.Controllers;

import dev.charu.DTOs.createparkinglotrequestdto;
import dev.charu.Models.ParkingLot;
import dev.charu.Services.parkingLotService;

public class ParkingLotController {

    private parkingLotService parkingLotService=new parkingLotService();
    public ParkingLot createAParkingLot(createparkinglotrequestdto creatRequest){

        ParkingLot parkingLot=creatRequest.toParkingLot();
        parkingLotService.createAParkingLot(parkingLot);
        return parkingLot;
}

    public ParkingLot getAParkingLot(Long id){
        ParkingLot parkingLot=parkingLotService.getAParkingLot(id);
        return parkingLot;
    }
}
