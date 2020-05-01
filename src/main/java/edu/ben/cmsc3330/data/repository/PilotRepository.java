package edu.ben.cmsc3330.data.repository;

import edu.ben.cmsc3330.data.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, Long> {


}
