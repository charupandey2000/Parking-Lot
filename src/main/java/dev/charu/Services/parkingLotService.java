package dev.charu.Services;

import dev.charu.Exception.parkingNotFoundException;
import dev.charu.Models.Floor;
import dev.charu.Models.ParkingLot;
import dev.charu.Models.Slot;
import dev.charu.Repository.parkingLotRepository;

import java.util.List;

public class parkingLotService {
    private parkingLotRepository parkingLotRepository=new parkingLotRepository();
    private SlotService slotServices=new SlotService();
    public ParkingLot getAParkingLot(Long id){
        ParkingLot ans=parkingLotRepository.findById(id);
        if(ans!=null){
            return ans;
        }
        throw new parkingNotFoundException("please enter right parking id");
    }
    public void createAParkingLot(ParkingLot Parkinglot){

        List<Floor>floors=Parkinglot.getFloors();
        for(Floor floor:floors){
            for(Slot slot:floor.getSlots()){
                slotServices.createnewslot(slot);
            }
        }

        parkingLotRepository.save(Parkinglot);
    }

}
