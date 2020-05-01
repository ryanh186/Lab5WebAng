package edu.ben.cmsc3330.web.model;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class TicketView {

    private int planeID;
    private int passengerID;
    private int seatNumber;
    private String ticketCost;

}
