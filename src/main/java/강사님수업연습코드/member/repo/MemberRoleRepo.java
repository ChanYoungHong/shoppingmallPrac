package 강사님수업연습코드.member.repo;

import 강사님수업연습코드.member.entity.MemberRoleList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRoleRepo extends JpaRepository<MemberRoleList, Long> {

    List<MemberRoleList> findAllByRoleId(Long roleId);

    @Query(value = "select count(m) from MemberRoleList m where m.role.id =:roleId")
    Long getNumber(@Param("roleId") Long roleId);

}
