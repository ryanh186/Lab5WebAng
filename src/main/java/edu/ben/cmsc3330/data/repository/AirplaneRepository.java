package edu.ben.cmsc3330.data.repository;

import edu.ben.cmsc3330.data.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane, Long> {


}
