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

    public String airport;
    public String city;
    public String state;

}
