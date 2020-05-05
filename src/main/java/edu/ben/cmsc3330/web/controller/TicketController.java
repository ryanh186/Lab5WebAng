package edu.ben.cmsc3330.web.controller;


import edu.ben.cmsc3330.data.model.Ticket;
import edu.ben.cmsc3330.data.repository.TicketRepository;
import edu.ben.cmsc3330.data.service.TicketService;
import edu.ben.cmsc3330.data.translator.TicketTranslator;
import edu.ben.cmsc3330.web.model.TicketView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;


@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {

    private final TicketService ticketService;
    private final TicketRepository ticketRepository;


    public TicketController(final TicketRepository ticketRepository,
                            final TicketService ticketService) {
        this.ticketRepository = ticketRepository;
        this.ticketService = ticketService;
    }

    @GetMapping(value = "/api/ticket/{ticketId}")
    public ResponseEntity<TicketView> viewTicket(@PathVariable Long ticketId) throws Exception {

        // Retrieve the Ticket object
        Optional<Ticket> ticketOption = ticketRepository.findById(ticketId);

        //Verify we actually got a good ticket id
        if (ticketOption.isEmpty()) {
            // log.error("ticket with id [{}] does not exist in DB", ticketId);
            throw new Exception("Ticket with id [" + ticketId + "] does not exist in DB");
        }

        return new ResponseEntity<>(TicketTranslator.entityToView(ticketOption.get()), HttpStatus.OK);
    }

    @PostMapping(value = "/api/ticket")
    public ResponseEntity<TicketView> createTicket(@RequestBody TicketView ticketView) {

        Ticket ticket = new Ticket();
        ticket.setPlaneID(ticketView.getPlaneID());
        ticket.setPassengerID(ticketView.getPassengerID());
        ticket.setSeatNumber(ticketView.getSeatNumber());
        ticket.setTicketCost(ticketView.getTicketCost());

        ticket.setActive(1);

        ticket.setCreated(LocalDateTime.now());
        ticket.setUpdated(LocalDateTime.now());

        // Save it
        ticketRepository.save(ticket);

        return new ResponseEntity<>(TicketTranslator.entityToView(ticket), HttpStatus.CREATED);
    }

    @PutMapping(value = "/api/ticket/{ticketId}")
    public ResponseEntity<TicketView> changeTicket(@PathVariable Long ticketId,
                                                   @RequestBody TicketView ticketView) throws Exception {
        // Retrieve the Ticket object
        Optional<Ticket> ticketOption = ticketRepository.findById(ticketId);

        //Verify we actually got a good ticket id
        if (ticketOption.isEmpty()) {
            // log.error("Ticket with id [{}] does not exist in DB", ticketId);
            throw new Exception("Ticket with id [" + ticketId + "] does not exist in DB");
        }

        Ticket ticket = new Ticket();
        ticket.setId(ticketId);

        ticket.setPlaneID(ticketView.getPlaneID());
        ticket.setPassengerID(ticketView.getPassengerID());
        ticket.setSeatNumber(ticketView.getSeatNumber());
        ticket.setTicketCost(ticketView.getTicketCost());

        ticket.setActive(1);

        ticket.setCreated(LocalDateTime.now());
        ticket.setUpdated(LocalDateTime.now());

        // Save it
        ticketRepository.save(ticket);

        return new ResponseEntity<>(TicketTranslator.entityToView(ticket), HttpStatus.CREATED);
    }
}
