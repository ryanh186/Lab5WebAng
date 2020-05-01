package edu.ben.cmsc3330.data.translator;

import edu.ben.cmsc3330.data.model.Passenger;
import edu.ben.cmsc3330.web.model.PassengerView;

public class PassengerTranslator {

    public static PassengerView entityToView(final Passenger passenger) {
        return PassengerView.builder()
                .ticketId(passenger.getTicketId())
                .firstName(passenger.getFirstName())
                .lastName(passenger.getLastName())
                .phoneNumber(passenger.getPhoneNumber())
                .luggageAmount(passenger.getLuggageAmount())
                .build();

    }
}


