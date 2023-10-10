## WIL3

POJO: Plain Old Java Object
POJO는 아래 세 가지 조건을 충족해야 한다.
1. 특정 규약에 종속되지 않는다
2. 특정 환경에 종속되지 않는다
3. 객체지향적인 자바 언어의 기본에 충실하게 만들어져야 한다

POJO 프레임
<img src= "https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F81276f83-e80d-4730-b0ae-1b519fac7648%2F945b7b16-7319-43d4-8710-192fa4918c3a%2FUntitled.png&blockId=a78fe971-5d6f-4e3a-8e8b-a82c13544560">

* 스프링이란?
자바 엔터프라이즈 개발을 편하게 해주는 오픈소스 경량급 애플리케이션 프레임워크 

* 스프링 특징이란?
1. Spring은 경량 컨테이너로 자바 객체를 직접 Spring 안에서 관리한다.
2. Spring의 가장 큰 특징으로 IOC와 DI가 많이 언급된다.

* 스프링의 기술
1. IoC/DI
2. AOP
3. PSA

* IoC - 제어의 역전
제어: 객체 생명주기나 메서드의 호출을 직접 관리한다
역전: 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것
프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것을 제어를 역전시켰다고 말할 수 있다.

IoC는 객체지향 원칙을 잘 지키기 위해서 필요함
목적: 클래스 간 결합을 느슨히 하기 위해서
IoC는 제어의 역전, DIP는 의존 방향의 역전

Spring Bean이란 무엇인가?
---
Spring Bean이란 스프링 IoC 컨테이너에 의해 관리되는 자바 객체(POJO)이다.

<img src = "https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F81276f83-e80d-4730-b0ae-1b519fac7648%2Fddbe5c77-9ee0-4809-9594-1c94682640bd%2F%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-09-20_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_12.24.42.png&blockId=88d2d579-63be-4f4f-9ff9-1831ee5bedfc">
ApplicationContext라는 인터페이스가 IoC 컨테이너를 대표한다.
ApplicationContext는 여러 인터페이스를 상속받아 만들어진다.

빈 스코프: 빈은 생성되고 존재하고 적용되는 범위를 지정할 수 있다.   
* 싱글톤 (IoC 컨테이너 사용)
* 프로토타입
* 웹 관련 스코프 : request, session, application

스프링 IoC 컨테이너가 빈의 라이프사이클을 관리하는 과정
1. 객체 생성 + property 설정
2. 의존 설정
3. 객체 초기화 -> 사용 -> 소멸

@Bean 어노테이션 사용하면 빈 설정할 수 있다.   
@Configuration 어노테이션 이용하여 스프링에서 빈을 싱글톤으로 관리할 수 있다.

빈 설정시 주의점
1. 싱글톤 스코프의 빈이 상태를 가지면 안된다.   
2. 의존성을 자동 주입해야 할 인터페이스의 구현체가 두개 이상일 경우 충동이 일어난다. (Primary, Qualifier 사용하여 우선순위 정할 수 있다.)

Spring Bean을 등록하는 방법을 정리하라 
---
* Component Scan이란?
  스프링이 애플리케이션의 클래스를 검색하고, 자동으로 스프링 빈을 등록하는 방법이다.

@Component를 이용하면 간단하게 스프링 빈 등록이 가능하다.   
스프링은 이 어노테이션이 붙은 클래스를 자동으로 검색하고 빈으로 등록한다.

@ComponentScan 어노테이션을 사용하여 스프링이 어느 패키지에서 클래스 검색을 시작할지 및 검색할 패키지의 범위를 설정할 수 있다.   
@Configuration이 붙어있는 클래스도 빈 등록이 된다.   
또한 해당 클래스에 포함된 수동으로 등록된 빈 또한 빈으로 등록이 된다.

프로그램 구현
---
