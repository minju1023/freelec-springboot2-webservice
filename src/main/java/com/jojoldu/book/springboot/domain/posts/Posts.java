package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 롬복의 어노테이션
@NoArgsConstructor //롬복의 어노테이션, 기본 생성자 자동 추가, public Posts(){} 와 같은 효과
@Entity // JPA 의 어노테이션
//롬복은 필수 어노테이션은 아니므로 주요 어노테이션인 @Entity 를 클래스 가깝게 두고, 롬복 어노테이션을 그 위에 둠
//이렇게 하면 이후에 코틑린 등의 새 언어 전환으로 롬복이 더이상 필요없을 경우 쉽게 삭제 할 수 있으니까!
public class Posts {
    // Post 는 테이블과 매칭 될 Entity 클래스
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        // @BUilder 는 해당 클래스의 빌더 패턴 클래스를 생성
        // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
        this.title = title;
        this.content = content;
        this.author = author;
    }
    // 주의해야 할 점!
    // Entity 클래스에서는 절대 Setter 메소드를 만들지 않는다. 대신 해당 필드의 값 변경이 필요하면
    // 명확히 그 목적과 의도를 나타낼 수 있는 메소드를 추가해야한다.
    // Setter 가 없는 상항에 어떻게 db 에 데이터를 놓느냐!
    // 기본적인 구조는 생성자를 통해 최종 값을 채운 후 DB 에 삽입하는 것.

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
