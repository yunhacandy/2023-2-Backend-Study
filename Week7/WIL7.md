# WIL7

Spring Data JPA
---
![img](https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F81276f83-e80d-4730-b0ae-1b519fac7648%2Fe31ee8c5-ba5a-4e64-b9ff-b4b47b729b6c%2F%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-10-30_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_3.29.55.png&blockId=e7b1c98e-2fb6-477f-8a78-de4af65240b0)
JPA는 entityManager를 사용하여 DB에 접근할 수 있도록 도와준다.   
Spring Data JPA는 JPA를 간편하고 효율적으로 사용할 수 있는 모듈이다.

아래는 Spring Data JPA가 제공하는 DB에 관한 작업을 하는 방법이다.
1. JpaRepository가 지원해주는 함수 사용
2. Query Method
3. Custom Query

### JpaRepository
JpaRepository는 아래와 같은 함수를 기본적으로 제공해줍니다.
1. findAll() 메소드   
테이블에서 레코드 전체 목록을 조회
2. findById(id)   
테이블에서 기본키 필드 값이 id인 레코드를 조회
3. save(Entity entity)   
entity 객체를 entity 테이블에 저장
객체의 id(기본키) 속성값이 0이면 INSERT / 0이 아니면 UPDATE
4. saveAll(List)   
객체 목록을 테이블에 저장
5. delete(객체)   
객체의 id(기본키) 속성값과 일치하는 레코드를 삭제
6. deleteAll(List)   
객체 목록을 테이블에서 삭제
7. count()   
테이블의 전체 레코드 수를 리턴
8. exists(id)   
테이블에서 id에 해당하는 레코드가 있는지 true/false를 리턴   

### Query Method
기본적으로 제공하는 이외의 쿼리에 더해서, Spring Data Jpa는 Repository의 메소드 이름을 분석하여 쿼리를 만들어주는 기능을 가진다.   
find, update, delete 뒤에 조건을 붙인다고 생각하면 된다.

### Custom Query
JPQL 또는 native query(SQL) 을 통해 쿼리를 작성할 수 있다.   
주로 위 2개로 처리하기 힘들거나, 처리할 수 없을 경우 Custom Query를 사용하게 된다.   
