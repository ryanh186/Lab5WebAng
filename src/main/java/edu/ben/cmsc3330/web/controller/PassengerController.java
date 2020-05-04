package edu.ben.cmsc3330.web.controller;


import edu.ben.cmsc3330.data.model.Passenger;
import edu.ben.cmsc3330.data.repository.PassengerRepository;
import edu.ben.cmsc3330.data.service.PassengerService;
import edu.ben.cmsc3330.data.translator.PassengerTranslator;
import edu.ben.cmsc3330.web.model.PassengerView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

//import edu.ben.cmsc3330.data.translator.DestinationTranslator;

@Slf4j
@RestController
public class PassengerController {

    private final PassengerService passengerService;
    private final PassengerRepository passengerRepository;


    public PassengerController(final PassengerRepository passengerRepository,
                               final PassengerService passengerService) {
        this.passengerRepository = passengerRepository;
        this.passengerService = passengerService;
    }

    // /users
    // /users/id

    // GET, POST, PUT, DELETE

    @GetMapping(value = "/api/passenger/{passengerId}")
    public ResponseEntity<PassengerView> viewPassenger(@PathVariable Long passengerId) throws Exception {

        // Retrieve the Destination object
        Optional<Passenger> passengerOption = passengerRepository.findById(passengerId);

         //Verify we actually got a good destination/destination id
        if (passengerOption.isEmpty()) {
           // log.error("Destination with id [{}] does not exist in DB", destinationId);
            throw new Exception("Passenger with id [" + passengerId + "] does not exist in DB");
        }

        return new ResponseEntity<>(PassengerTranslator.entityToView(passengerOption.get()), HttpStatus.OK);
    }

    @PostMapping(value = "/api/passenger")
    public ResponseEntity<PassengerView> createPassenger(@RequestBody PassengerView passengerView) {

        Passenger passenger = new Passenger();
        passenger.setTicketId(passengerView.getTicketId());
        passenger.setFirstName(passengerView.getFirstName());
        passenger.setLastName(passengerView.getLastName());
        passengerView.setPhoneNumber(passengerView.getPhoneNumber());
        passenger.setLuggageAmount(passengerView.getLuggageAmount());

        passenger.setActive(1);

        passenger.setCreated(LocalDateTime.now());
        passenger.setUpdated(LocalDateTime.now());

        // Save it
        passengerRepository.save(passenger);

        return new ResponseEntity<>(PassengerTranslator.entityToView(passenger), HttpStatus.CREATED);
    }
}
