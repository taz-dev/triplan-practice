package be.triplan.domain;

import lombok.Getter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Checklist {

    @Id @GeneratedValue
    @Column(name = "checklist_id")
    private Long id;

    private String checkItem;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "plan_id")
    private Plan plan;
}
