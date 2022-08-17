package com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.member.controller;

import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.member.dto.MemberDto;
import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.member.entity.Member;
import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.member.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/logintest")
    public Member addMember(MemberDto memberDto){

        return memberService.addMember(memberDto);
    }

    @GetMapping("/findAll")
    public List<Member> findall(){
        return memberService.getAll();
    }

    @GetMapping("/find/{roleId}")
    public Long getNumberByRole(@PathVariable Long roleId){
        return memberService.getNumberByRole(roleId);
    }

}
