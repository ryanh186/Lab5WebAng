package edu.ben.cmsc3330.data.translator;

import edu.ben.cmsc3330.data.model.Pilot;
import edu.ben.cmsc3330.web.model.PilotView;

public class PilotTranslator {

    public static PilotView entityToView(final Pilot pilot) {
        return PilotView.builder()
                .street(pilot.getStreet())
                .firstName(pilot.getFirstName())
                .lastName(pilot.getLastName())
                .build();
    }
}

