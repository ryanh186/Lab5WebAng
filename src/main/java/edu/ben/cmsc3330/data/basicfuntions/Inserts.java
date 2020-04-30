package edu.ben.cmsc3330.data.basicfuntions;

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
    public void insertDestination() {
        entityManager.createNativeQuery("INSERT INTO destination (id, airport, city, state, is_active, created_on, updated_on) VALUES (?,?,?,?,?,?,?)")
                .setParameter(1, "1111111")
                .setParameter(2, "United")
                .setParameter(3, "Chicago")
                .setParameter(4, "IL")
                .setParameter(5, 1)
                .setParameter(6, null)
                .setParameter(7, null)
                .executeUpdate();
    }

    @Transactional
    public void insertAirplane() {
        entityManager.createNativeQuery("INSERT INTO destination" +
                " (id, airport, city, state) VALUES (?,?,?,?)")
                .setParameter(1, "11111123")
                .setParameter(2, "United")
                .setParameter(3, "Chicago")
                .setParameter(4, "IL")
                .executeUpdate();
    }

    @Transactional
    public void insertPassenger() {
        entityManager.createNativeQuery("INSERT INTO destination (id, airport, city, state) VALUES (?,?,?,?)")
                .setParameter(1, "1111111")
                .setParameter(2, "United")
                .setParameter(3, "Chicago")
                .setParameter(4, "IL")
                .executeUpdate();
    }

    @Transactional
    public void insertPilot() {
        entityManager.createNativeQuery("INSERT INTO destination (id, airport, city, state) VALUES (?,?,?,?)")
                .setParameter(1, "1111111")
                .setParameter(2, "United")
                .setParameter(3, "Chicago")
                .setParameter(4, "IL")
                .executeUpdate();
    }

    @Transactional
    public void insertTicket() {
        entityManager.createNativeQuery("INSERT INTO destination (id, airport, city, state) VALUES (?,?,?,?)")
                .setParameter(1, "1111111")
                .setParameter(2, "United")
                .setParameter(3, "Chicago")
                .setParameter(4, "IL")
                .executeUpdate();
    }

}
