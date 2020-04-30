package edu.ben.cmsc3330.data.basicfuntions;

import edu.ben.cmsc3330.data.model.Destination;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class Inserts {

    public Inserts(){
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertDestination(Destination destination) {
        entityManager.createNativeQuery("INSERT INTO destination (airport, city, state) VALUES (?,?,?)")
                .setParameter(1, destination.getAirport())//"United")
                .setParameter(2, destination.getCity())//"Chicago")
                .setParameter(3, destination.getState())//"IL")
                .executeUpdate();
    }

    @Transactional
    public void insertAirplane() {
        entityManager.createNativeQuery("INSERT INTO airplane" +
                " (destination_id, head_pilot_id, capacity, model, company, crew_size) VALUES (?,?,?,?,?,?)")
                .setParameter(1, "1234567")
                .setParameter(2, "1")
                .setParameter(3, "100")
                .setParameter(4, "747")
                .setParameter(5, "Boeing")
                .setParameter(6, "10")
                .executeUpdate();
    }

    @Transactional
    public void insertPassenger() {
        entityManager.createNativeQuery("INSERT INTO passenger" +
                " (ticket_id, first_name, last_name, phone_number, luggage_amount) VALUES (?,?,?,?,?)")
                .setParameter(1, "1111111")
                .setParameter(2, "Bob")
                .setParameter(3, "Johnson")
                .setParameter(4, "223-123-4567")
                .setParameter(5, "5")
                .executeUpdate();
    }

    @Transactional
    public void insertPilot() {
        entityManager.createNativeQuery("INSERT INTO pilot" +
                " (id, airport, city, state) VALUES (?,?,?,?)")
                .setParameter(1, "1111111")
                .setParameter(2, "United")
                .setParameter(3, "Chicago")
                .setParameter(4, "IL")
                .executeUpdate();
    }

    @Transactional
    public void insertTicket() {
        entityManager.createNativeQuery("INSERT INTO ticket" +
                " (id, airport, city, state) VALUES (?,?,?,?)")
                .setParameter(1, "1111111")
                .setParameter(2, "United")
                .setParameter(3, "Chicago")
                .setParameter(4, "IL")
                .executeUpdate();
    }

}
