package edu.ben.cmsc3330.data.model;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "ticket")
public class Ticket extends AbstractEntity {

    @NotNull
    @Column(name = "plane_id")
    private int planeID;

    @NotNull
    @Column(name = "passenger_id")
    private int passengerID;

    @NotNull
    @Column(name = "seat_number")
    private int seatNumber;

    @NotNull
    @Column(name = "ticket_cost")
    private String ticketCost;
}
