package dev.charu.DTOs;

import dev.charu.Genrator.parkingLotId;
import dev.charu.Models.Floor;
import dev.charu.Models.ParkingLot;
import dev.charu.Models.Slot;
import dev.charu.Models.SlotStatus;

import java.util.ArrayList;
import java.util.List;

public class createparkinglotrequestdto {
    private String name;
    private String address;
    private Integer noOfFloor;
    private Integer noOfSlot;
    private Integer noOfEntryGate;
    private Integer noOfExitGate;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNoOfFloor() {
        return noOfFloor;
    }

    public void setNoOfFloor(Integer noOfFloor) {
        this.noOfFloor = noOfFloor;
    }

    public Integer getNoOfSlot() {
        return noOfSlot;
    }

    public void setNoOfSlot(Integer noOfSlot) {
        this.noOfSlot = noOfSlot;
    }

    public Integer getNoOfEntryGate() {
        return noOfEntryGate;
    }

    public void setNoOfEntryGate(Integer noOfEntryGate) {
        this.noOfEntryGate = noOfEntryGate;
    }

    public Integer getNoOfExitGate() {
        return noOfExitGate;
    }

    public void setNoOfExitGate(Integer noOfExitGate) {
        this.noOfExitGate = noOfExitGate;
    }
    public ParkingLot toParkingLot(){
        List<Floor>floors=new ArrayList<>();
        for(int i=0;i<noOfFloor;i++){
            List<Slot>slots=new ArrayList<>();
            for(int j=0;j<noOfSlot;j++){
                Slot newslot=new Slot(SlotStatus.free);
                slots.add(newslot);
            }
            Floor newfloor=new Floor(slots);
            floors.add(newfloor);
        }

        ParkingLot parkingLot=new ParkingLot();
        parkingLot.setId(parkingLotId.id());
        parkingLot.setName(name);
        parkingLot.setAddress(address);
        parkingLot.setFloors(floors);
        return parkingLot;

    }

}
