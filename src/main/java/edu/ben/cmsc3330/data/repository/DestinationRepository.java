package edu.ben.cmsc3330.data.repository;

import edu.ben.cmsc3330.data.model.Destination;
import edu.ben.cmsc3330.data.model.Pilot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DestinationRepository extends JpaRepository<Destination, Long> {

}
