package dev.charu.Controllers;

import dev.charu.DTOs.TicketRequestDto;
import dev.charu.Models.Ticket;

public class TicketController {

    public Ticket createATicket(TicketRequestDto ticketRequestDto){
        Ticket ticket=ticketRequestDto.toTicket();
        return ticket;

    }

}
