package dev.charu.Models;

public class Slot extends BaseModel {
    private SlotStatus slotStatus;

    public Slot(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }


    public SlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }
}
