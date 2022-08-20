package 강사님수업연습코드.member.service;

import 강사님수업연습코드.member.dto.MemberDto;
import 강사님수업연습코드.member.entity.Member;
import java.util.List;


public interface MemberService {

    Member addMember(MemberDto memberDto);
    List<Member> getAll();
    Long getNumberByRole(Long roleId);
    Long getNum(Long roledId);

}
