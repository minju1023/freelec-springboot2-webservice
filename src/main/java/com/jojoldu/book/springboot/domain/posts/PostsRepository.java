package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PostsRepository  extends JpaRepository<Posts, Long> {
    // Repository 는 Dao 라고 불리는 DB Layer 접근자, 인터페이스로 생성한다.
    // JpaRepository<Entity 클래스, PK타입 > 을 상속하면 기본적인 CRUD 메소드가 자동으로 생성됨
    // Entity 클래스와 기본 Entity Repository 는 함께 위치해야한다.
    // Entity 클래스는 기본 Repository 없이는 제대로 역할을 할 수 없다.
}
