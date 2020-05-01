package edu.ben.cmsc3330.data.translator;

import edu.ben.cmsc3330.data.model.Ticket;
import edu.ben.cmsc3330.web.model.TicketView;

public class TicketTranslator {

    public static TicketView entityToView(final Ticket ticket) {
        return TicketView.builder()
                .planeID(ticket.getPlaneID())
                .passengerID(ticket.getPassengerID())
                .seatNumber(ticket.getSeatNumber())
                .ticketCost(ticket.getTicketCost())
                .build();
    }

}

