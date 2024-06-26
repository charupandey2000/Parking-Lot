package dev.charu.Models;

import java.util.List;

public class ParkingLot extends BaseModel {
   private String Name;
    private String Address;
    private List<Floor>floors;
    private List<Gate>entryGate;
    private List<Gate>exitGate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(List<Gate> entryGate) {
        this.entryGate = entryGate;
    }

    public List<Gate> getExitGate() {
        return exitGate;
    }

    public void setExitGate(List<Gate> exitGate) {
        this.exitGate = exitGate;
    }
}
