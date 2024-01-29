package hellojpa.jpql;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Team teamA = new Team();
            teamA.setName("팀A");
            em.persist(teamA);

            Team teamB = new Team();
            teamB.setName("팀B");
            em.persist(teamB);

            Member member1 = new Member();
            member1.setUsername("회원1");
            member1.setTeam(teamA);
            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("회원2");
            member2.setTeam(teamA);
            em.persist(member2);

            Member member3 = new Member();
            member3.setUsername("회원3");
            member3.setTeam(teamB);
            em.persist(member3);

            Member member4 = new Member();
            member4.setUsername("회원4");
            em.persist(member4);

            em.flush();
            em.clear();

//            String query = "select m From Member m join fetch m.team";

            String query = "select t From Team t join fetch t.members";


//            List<Member> result = em.createQuery(query, Member.class)
//                    .getResultList();

//            for (Member member : result) {
//                System.out.println("member = " + member.getUsername() + ", " + member.getTeam().getName());
                // 회원1, 팀 A(SQL)
                // 회원2, 팀 A(1차캐시)
                // 회원3, 팀 B(SQL)
//            }

            List<Team> result = em.createQuery(query, Team.class)
                    .getResultList();

            for (Team team : result) {
                System.out.println("team = " + team.getName() + " | members = " + team.getMembers().size());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
