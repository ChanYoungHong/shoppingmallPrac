package 강사님수업연습코드.user.repo;

import 강사님수업연습코드.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepoo extends JpaRepository<User, Long> {
}
