package edu.ben.cmsc3330.data.repository;

import edu.ben.cmsc3330.data.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {


}
