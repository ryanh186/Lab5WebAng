package edu.ben.cmsc3330.web.controller;


import edu.ben.cmsc3330.data.model.Airplane;
import edu.ben.cmsc3330.data.repository.AirplaneRepository;
import edu.ben.cmsc3330.data.service.AirplaneService;
import edu.ben.cmsc3330.data.translator.AirplaneTranslator;
import edu.ben.cmsc3330.web.model.AirplaneView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;


@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class AirplaneController {

    private final AirplaneService airplaneService;
    private final AirplaneRepository airplaneRepository;


    public AirplaneController(final AirplaneRepository airplaneRepository,
                              final AirplaneService airplaneService) {
        this.airplaneRepository = airplaneRepository;
        this.airplaneService = airplaneService;
    }

    @GetMapping(value = "/api/airplane/{airplaneId}")
    public ResponseEntity<AirplaneView> viewAirplane(@PathVariable Long airplaneId) throws Exception {

        // Retrieve the Airplane object
        Optional<Airplane> airplaneOption = airplaneRepository.findById(airplaneId);

        //Verify we actually got a good airplane id
        if (airplaneOption.isEmpty()) {
            // log.error("Airplane with id [{}] does not exist in DB", airplaneId);
            throw new Exception("Airplane with id [" + airplaneId + "] does not exist in DB");
        }

        return new ResponseEntity<>(AirplaneTranslator.entityToView(airplaneOption.get()), HttpStatus.OK);
    }

    @PostMapping(value = "/api/airplane")
    public ResponseEntity<AirplaneView> createAirplane(@RequestBody AirplaneView airplaneView) {

        Airplane airplane = new Airplane();
        airplane.setDestinationID(airplaneView.getDestinationID());
        airplane.setHeadPilotID(airplaneView.getHeadPilotID());
        airplane.setCapacity(airplaneView.getCapacity());
        airplane.setModel(airplaneView.getModel());
        airplane.setCompany(airplaneView.getCompany());
        airplane.setCrewSize(airplaneView.getCrewSize());

        airplane.setActive(1);

        airplane.setCreated(LocalDateTime.now());
        airplane.setUpdated(LocalDateTime.now());

        // Save it
        airplaneRepository.save(airplane);

        return new ResponseEntity<>(AirplaneTranslator.entityToView(airplane), HttpStatus.CREATED);
    }

    @PutMapping(value = "/api/airplane/{airplaneId}")
    public ResponseEntity<AirplaneView> changeAirplane(@PathVariable Long airplaneId,
                                                          @RequestBody AirplaneView airplaneView) throws Exception {
        // Retrieve the airplane object
        Optional<Airplane> airplaneOption = airplaneRepository.findById(airplaneId);

        //Verify we actually got a good airplane id
        if (airplaneOption.isEmpty()) {
            // log.error("Airplane with id [{}] does not exist in DB", airplaneId);
            throw new Exception("Airplane with id [" + airplaneId + "] does not exist in DB");
        }

        Airplane airplane = new Airplane();

        airplane.setId(airplaneId);

        airplane.setDestinationID(airplaneView.getDestinationID());
        airplane.setHeadPilotID(airplaneView.getHeadPilotID());
        airplane.setCapacity(airplaneView.getCapacity());
        airplane.setModel(airplaneView.getModel());
        airplane.setCompany(airplaneView.getCompany());
        airplane.setCrewSize(airplaneView.getCrewSize());

        airplane.setActive(1);

        airplane.setCreated(LocalDateTime.now());
        airplane.setUpdated(LocalDateTime.now());

        // Save it
        airplaneRepository.save(airplane);

        return new ResponseEntity<>(AirplaneTranslator.entityToView(airplane), HttpStatus.CREATED);
    }
}