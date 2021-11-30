package be.triplan.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String nameTag;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

    private String aboutMe;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "memberImg_id")
    private MemberImg memberImg;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<PlanJoin> planJoins = new ArrayList<>();

//    @Builder
//    public Member(String email, String nickname) {
//        this.email = email;
//        this.nickname = nickname;
//    }
}
