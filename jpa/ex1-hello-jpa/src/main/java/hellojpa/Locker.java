package hellojpa;

import jakarta.persistence.*;

@Entity
public class Locker {

    @Id @GeneratedValue
    private Long id;

    private String name;

//    @OneToOne
//    @JoinColumn(name = "MEMBER_ID")
//    private Member member;
}
