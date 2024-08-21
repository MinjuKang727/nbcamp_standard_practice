package com.standard.sparta.controller;

import com.standard.sparta.domain.Member;
import com.standard.sparta.dto.MemberCreateRequestDto;
import com.standard.sparta.dto.MemberDeleteRequestDto;
import com.standard.sparta.dto.MemberDto;
import com.standard.sparta.dto.MemberUpdateRequestDto;
import com.standard.sparta.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
    // 클래스의 3영역
    // 1. 속성
    private final MemberService memberService;

    // 2. 생성자
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 3. 메서드

    /**
     * 1. 회원 생성을 위한 뷰를 반환합니다.
     * @return view 이름 반환
     */
    @GetMapping("/create-form")
    public String createMemberView() {
        log.info("::: MemberController - createMemberView() :::");
        return "member-create-form";
    }

    /**
     * 1-1. 회원 생성 API
     * @return
     */
    @PostMapping()
    public String createMemberAPI(@ModelAttribute MemberCreateRequestDto request) {
        log.info("::: MemberController - createMemberAPI() :::");

        // 회원 생성 서비스 호출
        memberService.createMember(request);
        return "redirect:/member/list-form";
    }

    /**
     * 회원 목록 확인을 위한 뷰를 반환
     * @param model MVC model 객체
     * @return view 이름 반환
     */
    @GetMapping("/list-form")
    public String memberListView(Model model) {
        log.info("::: MemberController - memberListView() :::");

        List<MemberDto> memberList = memberService.getMemberList();
        model.addAttribute("members", memberList);
        return "member-list-form";
    }

    @GetMapping("/{id}/update-form")
    public String memberUpdateView(@PathVariable Long id, Model model) {
        log.info("::: MemberController - memberUpdateView() :::");

        Member member = memberService.getMemberById(id);
        model.addAttribute("member", member);
        return "member-update-form";
    }

    @PostMapping("/{id}/update")
    public String updateMemberAPI(@ModelAttribute MemberUpdateRequestDto request) {
        log.info("::: MemberController - updateMemberAPI() :::");

        memberService.updateMember(request);
        return "redirect:/member/list-form";
    }

    @PostMapping("/{id}/delete")
    public String deleteMemberAPI(@ModelAttribute MemberDeleteRequestDto request) {
        log.info("::: MemberController - deleteMemberAPI() :::");

        memberService.deleteMember(request);
        return "redirect:/member/list-form";
    }
}
