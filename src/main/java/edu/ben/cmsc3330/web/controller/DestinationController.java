package edu.ben.cmsc3330.web.controller;


import edu.ben.cmsc3330.data.repository.DestinationRepository;
import edu.ben.cmsc3330.data.service.DestinationService;
import edu.ben.cmsc3330.data.translator.DestinationTranslator;
import edu.ben.cmsc3330.data.model.Destination;
import edu.ben.cmsc3330.web.model.DestinationView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

//import edu.ben.cmsc3330.data.translator.DestinationTranslator;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class DestinationController {

    private final DestinationService destinationService;
    private final DestinationRepository destinationRepository;


    public DestinationController(final DestinationRepository destinationRepository,
                                 final DestinationService destinationService) {
        this.destinationRepository = destinationRepository;
        this.destinationService = destinationService;
    }

    // GET, POST, PUT

    @GetMapping("/getAllDestinations")
    public List<Destination> findAllDestinations() {
        return destinationRepository.findAll();

    }
    @GetMapping(value = "/api/destination/{destinationId}")
    public ResponseEntity<DestinationView> viewDestination(@PathVariable Long destinationId) throws Exception {

        // Retrieve the Destination object
        Optional<Destination> destinationOption = destinationRepository.findById(destinationId);

         //Verify we actually got a good destination/destination id
        if (destinationOption.isEmpty()) {
           // log.error("Destination with id [{}] does not exist in DB", destinationId);
            throw new Exception("Destination with id [" + destinationId + "] does not exist in DB");
        }

        return new ResponseEntity<>(DestinationTranslator.entityToView(destinationOption.get()), HttpStatus.OK);
    }

    @PostMapping(value = "/api/destinationTest")
    public String register(@RequestBody Destination destination){
        destinationRepository.save(destination);
        return "YOU DID IT " + destination.getAirport();
    }

    @PostMapping(value = "/api/destination")
    public ResponseEntity<DestinationView> createDestination(@RequestBody DestinationView destinationView) {

        Destination destination = new Destination();

        destination.setAirport(destinationView.getAirport());
        destination.setCity(destinationView.getCity());
        destination.setState(destinationView.getState());

        destination.setActive(1);

        destination.setCreated(LocalDateTime.now());
        destination.setUpdated(LocalDateTime.now());

        // Save it

        destinationRepository.save(destination);

        return new ResponseEntity<>(DestinationTranslator.entityToView(destination), HttpStatus.CREATED);
    }

    @PutMapping(value = "/api/destination/{destinationId}")
    public ResponseEntity<DestinationView> changeDestination(@PathVariable Long destinationId,
                                                             @RequestBody DestinationView destinationView) throws Exception {

        // Retrieve the Destination object
        Optional<Destination> destinationOption = destinationRepository.findById(destinationId);

        //Verify we actually got a good destination/destination id
        if (destinationOption.isEmpty()) {
            // log.error("Destination with id [{}] does not exist in DB", destinationId);
            throw new Exception("Destination with id [" + destinationId + "] does not exist in DB");
        }

        Destination destination = new Destination();

        destination.setId(destinationId);

        destination.setAirport(destinationView.getAirport());
        destination.setCity(destinationView.getCity());
        destination.setState(destinationView.getState());

        destination.setActive(1);

        destination.setCreated(LocalDateTime.now());
        destination.setUpdated(LocalDateTime.now());

        // Save it

        destinationRepository.save(destination);

        return new ResponseEntity<>(DestinationTranslator.entityToView(destination), HttpStatus.CREATED);
    }

}
