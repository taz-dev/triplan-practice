package be.triplan.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Plan {

    @Id @GeneratedValue
    @Column(name = "plan_id")
    private Long id;

    private String planTitle;

    private LocalDate startDateTime;

    private LocalDate endDateTime;

    @Enumerated(EnumType.STRING)
    private PlanStatus planStatus;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "planImg_id")
    private PlanImg planImg;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
    private List<Checklist> checklists = new ArrayList<>();

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
    private List<Schedule> schedules = new ArrayList<>();
}
