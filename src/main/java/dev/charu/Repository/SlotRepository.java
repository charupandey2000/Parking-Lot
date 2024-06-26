package dev.charu.Repository;

import dev.charu.Models.Slot;
import dev.charu.Models.SlotStatus;

import java.util.ArrayList;
import java.util.List;

public class SlotRepository {
    List<Slot>slotList=new ArrayList<>();

    public Slot save(Slot slot){
        slotList.add(slot);
        return slot;
    }
    public Slot findSlotstatusFree(){
        for(Slot slot:slotList){
            if(slot.getSlotStatus()== SlotStatus.free){
                return slot;
            }
        }
        return null;
    }
}
