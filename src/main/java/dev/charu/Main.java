package dev.charu;

import dev.charu.Controllers.ParkingLotController;
import dev.charu.DTOs.createparkinglotrequestdto;
import dev.charu.Models.ParkingLot;
import dev.charu.Services.SlotService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        createparkinglotrequestdto create=new createparkinglotrequestdto();
        create.setName("charu");
        create.setAddress("ncm,m");
        create.setNoOfFloor(2);
        create.setNoOfSlot(4);

        ParkingLotController parkingLotController=new ParkingLotController();
        ParkingLot ans= parkingLotController.createAParkingLot(create);
        System.out.println("n,mcn,m");
    }
}