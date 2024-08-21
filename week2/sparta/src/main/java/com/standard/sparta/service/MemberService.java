package com.standard.sparta.service;

import com.standard.sparta.domain.Member;
import com.standard.sparta.dto.MemberCreateRequestDto;
import com.standard.sparta.dto.MemberDeleteRequestDto;
import com.standard.sparta.dto.MemberDto;
import com.standard.sparta.dto.MemberUpdateRequestDto;
import com.standard.sparta.repository.MemberJdbcRepository;
import com.standard.sparta.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MemberService {
    private MemberJdbcRepository memberRepository;

    @Autowired
    public MemberService(MemberJdbcRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
    DTO 는 클라이언트로 부터 오는 데이터
    : 신뢰할 수 없음.(유효하지 않은 값을 포함할 수 있음)
    데이터를 나타내는 Entity 객체로 변환해야 함.
    데이터 규격에 맞게 변환
     */
    /**
     * 회원 생성 서비스.
     * @param data 회원 생성 데이터를 담은 DTO 객체
     */
    public void createMember(MemberCreateRequestDto data) {
        log.info("::: - MemberService - createMember() :::");
        // 엔티티 조합
        Member newMember = Member.createNewMember(data.getEmail(), data.getName());

        // 회원 저장
        memberRepository.save(newMember);
    }

    /**
     * 회원 정보 수정하기
     * @param data : 회원 수정 데이터를 담은 DTO 객체
     */
    public void updateMember( MemberUpdateRequestDto data) {
        log.info("::: - MemberService - updateMember() :::");

        // 회원 수정
        memberRepository.update(data);
    }

    /**
     * 회원 정보 삭제
     * @param id : 회원 고유 번호
     */
    public void deleteMember(MemberDeleteRequestDto data) {
        log.info("::: - MemberService - deleteMember() :::");

        // 회원 정보 삭제
        memberRepository.delete(data);
    }

    /**
     * 전체 회원에 대하여 회원 정보를 담은 Dto 객체 리스트 가져오기
     * @return 회원 정보를 담은 Dto객체 리스트
     */
    public List<MemberDto> getMemberList() {
        List<Member> memberList = memberRepository.findAll();
        return memberList.stream().map(member -> new MemberDto(member.getId(), member.getEmail(), member.getName())).toList();
    }

    /**
     *  회원 고유번호로 회원 정보를 담은 Member 객체 가져오기
     * @param id : 회원 고유 번호
     * @return 회원 정보를 담은 Member 객체
     */
    public Member getMemberById(Long id) {
        return memberRepository.findById(id);
    }


}
