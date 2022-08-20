package 강사님수업연습코드.member.service.Impl;

import 강사님수업연습코드.member.dto.MemberDto;
import 강사님수업연습코드.member.entity.Member;
import 강사님수업연습코드.member.entity.MemberRoleList;
import 강사님수업연습코드.member.repo.MemberRepo;
import 강사님수업연습코드.member.repo.MemberRoleRepo;
import 강사님수업연습코드.member.repo.RoleRepo;
import 강사님수업연습코드.member.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepo memberRepo;
    private final MemberRoleRepo memberRoleRepo;
    private final RoleRepo roleRepo;

    @Override
    public Member addMember(MemberDto memberDto) {
        Member member = memberRepo.save(
            Member.builder()
                .name(memberDto.getName())
                .phone(memberDto.getPhone())
                .email(memberDto.getEmail())
                .build()
        );

        memberRoleRepo.save(
            MemberRoleList.builder()
                .role(roleRepo.findById(memberDto.getRoleId()).get())
                .member(member)
                .build()
        );
        return member;
    }

    @Override
    public List<Member> getAll() {
        return memberRepo.findAll();
    }

    @Override
    public Long getNumberByRole(Long roleId) {
        Long member = Long.valueOf(memberRoleRepo.findAllByRoleId(roleId).size());

        return member;
    }

    @Override
    public Long getNum(Long roledId) {
        return null;
    }
}
