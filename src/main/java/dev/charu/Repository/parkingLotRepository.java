package dev.charu.Repository;

import dev.charu.Models.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class parkingLotRepository {
    List<ParkingLot> parkingLotList=new ArrayList<>();

    public ParkingLot findById(Long id){
        for(ParkingLot parkingLot :parkingLotList){
            if(Objects.equals(parkingLot.getId(), id)){
                return parkingLot;
            }
        }
        return null;
    }

    public void save(ParkingLot parkingLot){
        parkingLotList.add(parkingLot);
    }
}
