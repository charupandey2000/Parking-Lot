package dev.charu.Models;

import java.util.Date;

public class Ticket extends BaseModel{

    private Date entrydate;
    private Vechile vechile;

    private Slot slot;

    private ticketStatus ticketStatus;

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Vechile getVechile() {
        return vechile;
    }

    public void setVechile(Vechile vechile) {
        this.vechile = vechile;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public dev.charu.Models.ticketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(dev.charu.Models.ticketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
