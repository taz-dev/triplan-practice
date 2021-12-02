package be.triplan.domain;

import lombok.Getter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Map {

    @Id @GeneratedValue
    @Column(name = "map_id")
    private Long id;

    private String location;

    @OneToOne(mappedBy = "map", fetch = LAZY)
    private Schedule schedule;
}
