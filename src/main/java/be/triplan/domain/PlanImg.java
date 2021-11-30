package be.triplan.domain;

import lombok.Getter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class PlanImg {

    @Id @GeneratedValue
    @Column(name = "planImg_Id")
    private Long id;

    private String imgName;

    private String imgPath;

    @OneToOne(mappedBy = "planImg", fetch = LAZY)
    private Plan plan;
}
