package edu.ben.cmsc3330.web.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class DestinationView {

    private String airport;
    private String city;
    private String state;

}
