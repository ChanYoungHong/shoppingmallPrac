package 강사님수업연습코드.member.repo;

import 강사님수업연습코드.member.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
