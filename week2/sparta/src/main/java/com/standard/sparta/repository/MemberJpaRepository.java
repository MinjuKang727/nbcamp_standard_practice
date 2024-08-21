package com.standard.sparta.repository;

import com.standard.sparta.domain.Member;
import com.standard.sparta.dto.MemberDeleteRequestDto;
import com.standard.sparta.dto.MemberUpdateRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Slf4j
//@Repository
public class MemberJpaRepository implements MemberRepository {
    @Override
    public Member save(Member member) {
        return null;
    };

    public Member findById(Long memberId){
        return null;
    };

    public List<Member> findAll(){
        return null;
    };

    public Member update(MemberUpdateRequestDto data){
        return null;
    };

    public Member delete(MemberDeleteRequestDto data){
        return null;
    };

}
