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
@Table(name = "airplane")
public class Airplane extends AbstractEntity {

    @NotNull
    @Column(name = "destination_id")
    private int destinationID;

    @NotNull
    @Column(name = "head_pilot_id")
    private int headPilotID;

    @NotNull
    @Column(name = "capacity")
    private int capacity;

    @NotNull
    @Column(name = "model")
    private String model;

    @NotNull
    @Column(name = "company")
    private String company;

    @NotNull
    @Column(name = "crew_size")
    private int crewSize;

}
