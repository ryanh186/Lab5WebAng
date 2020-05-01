package edu.ben.cmsc3330.data.translator;

import edu.ben.cmsc3330.data.model.Destination;
import edu.ben.cmsc3330.web.model.DestinationView;

public class DestinationTranslator {

    public static DestinationView entityToView(final Destination destination) {
        return DestinationView.builder()
                .airport(destination.getAirport())
                .city(destination.getCity())
                .state(destination.getState())
                .build();
    }
}

