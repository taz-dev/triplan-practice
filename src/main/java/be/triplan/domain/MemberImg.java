package be.triplan.domain;

import lombok.Getter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class MemberImg {

    @Id
    @GeneratedValue
    @Column(name = "memberImg_Id")
    private Long id;

    private String imgName;

    private String imgPath;

    @OneToOne(mappedBy = "memberImg", fetch = LAZY)
    private Member member;
}
