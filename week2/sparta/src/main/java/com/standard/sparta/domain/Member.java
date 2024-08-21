package com.standard.sparta.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
회원 Entity
 */
@Getter
@AllArgsConstructor
public class Member {
    private Long id;
    private String email;
    private String name;
    private Boolean isDeleted;

    public static Member createNewMember(String email, String name) {
        return new Member(null, email, name, false);
    }

    public static Member updateMember(Long id, String email, String name) {
        return new Member(id, email, name, false);
    }
}
