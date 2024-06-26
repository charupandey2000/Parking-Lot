package dev.charu.DTOs;

import dev.charu.Models.Ticket;
import dev.charu.Models.Vechile;
import dev.charu.Models.ticketStatus;
import dev.charu.Models.vechileType;

import java.util.Date;

public class TicketRequestDto {
    private String vechileNo;
    private vechileType vechileType;

    public Ticket toTicket(){
        Vechile vechile=new Vechile();
        vechile.setVechileNo(vechileNo);
        vechile.setVechileType(vechileType);
        Ticket ticket=new Ticket();
        ticket.setTicketStatus(ticketStatus.pending);
        ticket.setVechile(vechile);
        return ticket;
    }
}
