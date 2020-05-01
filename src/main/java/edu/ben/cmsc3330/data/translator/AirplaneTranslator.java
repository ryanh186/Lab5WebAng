package edu.ben.cmsc3330.data.translator;

import edu.ben.cmsc3330.data.model.Airplane;
import edu.ben.cmsc3330.web.model.AirplaneView;

public class AirplaneTranslator {

    public static AirplaneView entityToView(final Airplane airplane) {
        return AirplaneView.builder()
                .destinationID(airplane.getDestinationID())
                .headPilotID(airplane.getHeadPilotID())
                .capacity(airplane.getCapacity())
                .model(airplane.getModel())
                .company(airplane.getCompany())
                .crewSize(airplane.getCrewSize())
                .build();
    }
}


