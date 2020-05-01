package edu.ben.cmsc3330.web.controller;


import edu.ben.cmsc3330.data.model.Pilot;
import edu.ben.cmsc3330.data.repository.PilotRepository;
import edu.ben.cmsc3330.data.service.PilotService;
import edu.ben.cmsc3330.data.translator.PilotTranslator;
import edu.ben.cmsc3330.web.model.PilotView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//import edu.ben.cmsc3330.data.translator.DestinationTranslator;

@Slf4j
@RestController
public class PilotController {

    private final PilotService pilotService;
    private final PilotRepository pilotRepository;


    public PilotController(final PilotRepository pilotRepository,
                           final PilotService pilotService) {
        this.pilotRepository = pilotRepository;
        this.pilotService = pilotService;
    }

    // /users
    // /users/id

    // GET, POST, PUT, DELETE

    @GetMapping(value = "/api/pilot/{pilotId}")
    public ResponseEntity<PilotView> viewPilot(@PathVariable Long pilotId) throws Exception {

        // Retrieve the Destination object
        Optional<Pilot> pilotOption = pilotRepository.findById(pilotId);

         //Verify we actually got a good destination/destination id
        if (pilotOption.isEmpty()) {
           // log.error("Destination with id [{}] does not exist in DB", destinationId);
            throw new Exception("Pilot with id [" + pilotId + "] does not exist in DB");
        }

        return new ResponseEntity<>(PilotTranslator.entityToView(pilotOption.get()), HttpStatus.OK);
    }

    @PostMapping(value = "/api/pilot")
    public ResponseEntity<PilotView> createDestination(@RequestBody PilotView pilotView) {

        Pilot pilot = new Pilot();
        pilot.setStreet(pilotView.getStreet());
        pilot.setFirstName(pilotView.getFirstName());
        pilot.setLastName(pilotView.getLastName());


        pilot.setActive(1);
        //destination.setCreated(LocalDateTime.now());

        // Save it
        pilotRepository.save(pilot);

        return new ResponseEntity<>(PilotTranslator.entityToView(pilot), HttpStatus.CREATED);
    }
}
