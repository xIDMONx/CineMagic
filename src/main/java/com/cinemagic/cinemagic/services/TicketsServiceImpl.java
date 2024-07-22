package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Tickets;
import com.cinemagic.cinemagic.repositories.TicketsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class TicketsServiceImpl implements TicketsServiceInterface {

    @Autowired
    private TicketsRepository ticketsRepository;

    @Override
    public Tickets getTicketById(Long id) {
        return ticketsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tickets> getAllTickets() {
        return ticketsRepository.findAll();
    }

    @Transactional
    @Override
    public Tickets saveTicket(Tickets ticket) {
        return ticketsRepository.save(ticket);
    }

    @Transactional
    @Override
    public Tickets updateTicket(Tickets ticket) {
        return ticketsRepository.save(ticket);
    }

    @Transactional
    @Override
    public void deleteTicketById(Long id) {
        ticketsRepository.deleteById(id);
    }
}
