package edu.ben.cmsc3330.web.model;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class PassengerView {

    private int ticketId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int luggageAmount;

}
