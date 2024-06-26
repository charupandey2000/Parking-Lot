package dev.charu.Services;

import dev.charu.Models.Slot;
import dev.charu.Models.SlotStatus;
import dev.charu.Models.Ticket;
import dev.charu.Models.ticketStatus;

public class TicketService {
   SlotService slotService=new SlotService();
    public Ticket createTicket(Ticket ticket){
        Slot slot=slotService.getslotwithstatusFree();
        slot.setSlotStatus(SlotStatus.occupied);
        ticket.setTicketStatus(ticketStatus.complete);
        ticket.setSlot(slot);
        return ticket;
    }
}
