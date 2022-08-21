package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication 으로 인해 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동을 ㅗ설정된다.
// 특히 @SpringBootApplication 이 있는 위치부터 설정을 읽어들어가니까, 이 클래스는 항상 프로젝트 최상단에 위치해야 한다.

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // SpringApplication.run 로 인해 내장 WAS 를 실행
        // 내장 WAS 는 외부에 WAS 를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것을 말함
        // 이렇게 되면 항상 서버에 톰캣을 설치할 필요가 없고, 스프링 부트로 만들어진 Jar  파일( 실행 가능한 Java 패키징 파일)로 실행하면 된다.
        // 스프링부트에서는 내장 왓스를 사용하는 것을 권장하는데, 그 이유는 언제나 같은 환경에서 스프링 부트를 배포할 수 있기 때문에 .

        SpringApplication.run(Application.class, args);
    }

}
