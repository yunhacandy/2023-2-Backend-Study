# WIL6

DB
---
### DB란?
여러 사용자가 공유하여 사용할 수 있도록 통합해서 저장한 운영 데이터의 집합

### SQL
##### SQL의 특징
1. 데이터는 정해진 데이터 스키마에 따라 테이블에 저장된다.
2. 데이터는 관계를 통해 여러 테이블에 분산된다.
3. 중복 데이터는 저장하지 않는다. (무결성 보장)

### NoSQL
말 그대로, SQL이 아닌, 즉 스키마도 없고 관계도 없는 자료 형식

##### NoSQL 특징
1. 스키마도 없고 관계도 없는 자료 형식이다.
2. 관련 데이터를 동일한 '컬렉션'에 넣는다.

유연한 구조, 빠른 속도, 확장 편리하다는 장점을 가짐

ORM
---
### Entity
데이터베이스에 넣을 객체를 엔티티라고 부른다.

```Java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Feed> feeds;

    private String name;
}
```

### ORM 이란?
Object-Relational Mapping의 약자로, 데이터베이스와 객체 지향 프로그래밍 언어 사이의 관계형 데이터를 객체로 매핑하는 기술이나 프로그래밍 기술이다.

##### ORM의 장,단점
* 장점
1. 추상화: 데이터베이스와의 상호 작용을 객체 지향적인 방식으로 처리할 수 있다.
2. 데이터베이스 독립성: 다양한 데이터베이스 시스템에 대해 동일한 코드를 사용할 수 있게 도와준다.
3. 생산성: SQL 쿼리를 직접 작성하지 않아도 된다.
4. 유지 보수: 코드 변경이 필요할 때, 객체 모델만 수정하면 된다.

* 단점
1. 성능: 개발자가 작성한 쿼리보다 비효율적일 수 있다.
2. 복잡성: 복잡한 쿼리나 특정 데이터베이스 최적화 기술을 사용하려면 ORM을 벗어나야 할 수 있다.

JPA
---
### JPA란?
![img](https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F81276f83-e80d-4730-b0ae-1b519fac7648%2Fe31ee8c5-ba5a-4e64-b9ff-b4b47b729b6c%2F%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-10-30_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_3.29.55.png&blockId=c979a499-0383-459b-ae80-c88113307342)
Java Persistence API로, 자바 애플리케이션에서 관계형 데이터베이스를 사용하는 방법을 정의한 자바 API이다.

### JPA의 특징
1. 객체-테이블 매핑 : 어노테이션 또는 XML을 사용하여 자바 객체와 데이터베이스 테이블을 매핑한다.
2. 쿼리 언어 사용 : JPQL라는 객체지향 쿼리 언어를 제공하여 데이터베이스에 질의할 수 있다.
3. 생명 주기 관리 : 엔티티의 생명 주기 (예: 생성, 조회, 수정, 삭제)를 관리한다.
4. 캐싱 : 기본적인 캐시 전략을 지원한다.
5. 자동 스키마 생성: 데이터베이스 스키마를 자동으로 생성하거나 업데이트 할 수 있다.

### Mapping
데이터베이스의 테이블과 자바 클래스를 매핑하는 역할을 한다.
```Java
@Entity // 해당 클래스는 JPA가 관리하는 엔터티로 표시되며, 데이터베이스 테이블과 연동될 수 있게 됨
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 이 값이 기본키 임을 나타냄
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Feed> feeds;

    private String name;
}
```
실제 서비스는 무수히 많은 엔티티가 있고, 이 엔티티 간의 관계를 기반으로 다양한 정보를 저장한다.   
이를 위해 ERD (Entity-Relation Diagram)을 사용하며, 이 내용을 기반으로 객체를 구현한다.   
ERD에는 데이터베이스의 구조에 관한 메타 데이터, 명세를 적어둔다.   

객체는 다른 객체와 아래와 같은 관계를 맺을 수 있다.
* 1:1
* 1:N
* M:N


### Spring Data JPA란?
Spring Framework의 일부로, 데이터 접근 계층을 쉽게 구현할 수 있도록 지원하는 모듈이다.   
JPA 를 기반으로 하여 다양한 기능을 제공한다.   

특징
1. Repository 인터페이스 : Repository 인터페이스를 사용하여 CRUD (Create, Read, Update, Delete) 연산을 추상화한다. 개발자는 이 인터페이스를 상속받아 필요한 메서드를 선언하기만 하면 된다.
2. 쿼리 메서드 : 메서드 이름을 분석하여 자동으로 SQL 쿼리를 생성하는 기능을 제공한다.
3. Custom Query : @Query 애노테이션을 사용하여 사용자 정의 쿼리를 작성할 수 있다.
4. Pagination and Sorting : 페이징과 정렬 기능을 지원한다.
5. Transaction Management : 트랜잭션을 쉽게 관리할 수 있게 해준다.

JPA를 사용하는 것보다, Spring Data JPA를 사용할 경우, 복잡한 설정이나 쿼리 없이도 빠르고 편리하게 데이터 접근 계층을 구현할 수 있어, 개발 생산성이 크게 향상된다.