package edu.ben.cmsc3330.web.controller;


import edu.ben.cmsc3330.data.model.Destination;
import edu.ben.cmsc3330.data.model.Pilot;
import edu.ben.cmsc3330.data.repository.DestinationRepository;
import edu.ben.cmsc3330.data.translator.DestinationTranslator;
import edu.ben.cmsc3330.web.model.DestinationView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//import edu.ben.cmsc3330.data.translator.DestinationTranslator;

@Slf4j
@RestController
public class DestinationController {

    private final DestinationRepository destinationRepository;


    public DestinationController(final DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    // /users
    // /users/id

    // GET, POST, PUT, DELETE

    @GetMapping(value = "/api/destination/{destinationId}")
    public DestinationView viewDestination(@PathVariable Long destinationId) throws Exception {

        // Retrieve the Destination object
        Optional<Destination> destinationOption = destinationRepository.findById(destinationId);

         //Verify we actually got a good destination/destination id
        if (destinationOption.isEmpty()) {
           // log.error("Destination with id [{}] does not exist in DB", destinationId);
            throw new Exception("Destination with id [" + destinationId + "] does not exist in DB");
        }

        return DestinationTranslator.entityToView(destinationOption.get());

    }
}
