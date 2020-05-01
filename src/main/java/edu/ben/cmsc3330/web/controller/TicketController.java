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

import java.util.Optional;

//import edu.ben.cmsc3330.data.translator.DestinationTranslator;

@Slf4j
@RestController
public class TicketController {

    private final TicketService ticketService;
    private final TicketRepository ticketRepository;


    public TicketController(final TicketRepository ticketRepository,
                            final TicketService ticketService) {
        this.ticketRepository = ticketRepository;
        this.ticketService = ticketService;
    }

    // /users
    // /users/id

    // GET, POST, PUT, DELETE

    @GetMapping(value = "/api/ticket/{ticketId}")
    public ResponseEntity<TicketView> viewTicket(@PathVariable Long ticketId) throws Exception {

        // Retrieve the Destination object
        Optional<Ticket> ticketOption = ticketRepository.findById(ticketId);

         //Verify we actually got a good destination/destination id
        if (ticketOption.isEmpty()) {
           // log.error("Destination with id [{}] does not exist in DB", destinationId);
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
        //destination.setCreated(LocalDateTime.now());

        // Save it
        ticketRepository.save(ticket);

        return new ResponseEntity<>(TicketTranslator.entityToView(ticket), HttpStatus.CREATED);
    }
}
