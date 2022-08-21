package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    // 모든 응답 Dto 는 Dto 패키지에 추가

    private final String name;
    private final int amount;
}

// 1. @Getter : 선언된 모든 필드의 get  메소드를 생성해준다.
// 2. @RequiredArgsConstructor
// - 선언된 모든 final 필드가 포함된 생성자를 생성해준다
// - final 이 없는 필드는 생성자에 포함되지 않는다.

