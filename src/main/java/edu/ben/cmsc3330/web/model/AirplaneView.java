package edu.ben.cmsc3330.web.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AirplaneView {

    private int destinationID;
    private int headPilotID;
    private int capacity;
    private String model;
    private String company;
    private int crewSize;

}
