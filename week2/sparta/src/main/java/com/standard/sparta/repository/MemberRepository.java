package com.standard.sparta.repository;

import com.standard.sparta.domain.Member;
import com.standard.sparta.dto.MemberDeleteRequestDto;
import com.standard.sparta.dto.MemberUpdateRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MemberRepository {
    Member save(Member member);

    Member findById(Long memberId);

    List<Member> findAll();

    Member update(MemberUpdateRequestDto data);

    Member delete(MemberDeleteRequestDto data);
}
