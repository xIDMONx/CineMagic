package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Tickets;

import java.util.List;

public interface TicketsServiceInterface {
    Tickets getTicketById(Long id);

    List<Tickets> getAllTickets();

    Tickets saveTicket(Tickets ticket);

    Tickets updateTicket(Tickets ticket);

    void deleteTicketById(Long id);
}
