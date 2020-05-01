package edu.ben.cmsc3330.web.model;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class PilotView {

    private int street;
    private String firstName;
    private String lastName;
    
}
