package com.standard.sparta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * MemberDto
 * 불필요한 정보를 클라이언트에게 노출시키지 않기 위해 사용
 */
@Getter
@AllArgsConstructor
public class MemberDto {
    private Long id;
    private String email;
    private String name;
}
