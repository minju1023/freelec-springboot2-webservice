package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//1. @RestController
// - 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다.
// - 예전에는 @ResponseBody 를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준다고 생각하면 됨
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(
            @RequestParam("name") String name,
            @RequestParam("amount") int amount
    ) {
        return new HelloResponseDto(name, amount);
    }


}
