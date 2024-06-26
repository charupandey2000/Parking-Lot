package dev.charu.Models;

import java.util.ArrayList;
import java.util.List;

public class Floor extends BaseModel {
    private List<Slot>slots=new ArrayList<>();

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public Floor(List<Slot> slots) {
        this.slots = slots;
    }
}
