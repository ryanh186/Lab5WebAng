package edu.ben.cmsc3330.data.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@MappedSuperclass
@SuperBuilder
public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "is_active")
    private int active;

    @Column(name = "created_on")
    private LocalDateTime created;

    @Column(name = "updated_on")
    private LocalDateTime updated;
}
