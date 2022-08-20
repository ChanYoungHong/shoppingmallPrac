package 강사님수업연습코드.member.repo;

import 강사님수업연습코드.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Long> {



}
