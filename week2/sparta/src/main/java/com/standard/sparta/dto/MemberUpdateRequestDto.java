package com.standard.sparta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberUpdateRequestDto {
    private Long id;
    private String name;
    private String email;

    public void setId(Long id) {
        this.id = id;
    }
}
