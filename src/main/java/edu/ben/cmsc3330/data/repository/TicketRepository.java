package edu.ben.cmsc3330.data.repository;

import edu.ben.cmsc3330.data.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {


}
