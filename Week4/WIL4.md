# WIL4

DI에 대해 정리하라
---
DI는 Dependency Injection (의존성 주입)의 약자다.   

DI란 외부에서 두 객체 간의 관계를 결정해주는 디자인 패턴으로,   
인터페이스를 사이에 둬서 클래스 레벨에서는 의존관계가 고정되지 않도록 하고   
런타임 시에 관계를 동적으로 주입하여 유연성을 확보하고 결합도를 낮출 수 있게 해준다.

### 의존관계 주입
1. 생성자 주입   
생성자 주입을 사용하면 객체의 최초 생성 시점에 스프링이 의존성을 주입해준다.   
생성자가 1개만 있을 경우에 @Autowired를 생략해도 주입이 가능하도록 편의성을 제공하고 있다.
2. 수정자 주입 (setter 주입)   
선택, 변경 가능성이 있는 의존관계에 사용할 수 있다.   
setter 메서드에 @Autowired 어노테이션을 붙이면 스프링이 자동으로 의존성을 주입해준다.
3. 필드 주입    
필드 주입을 사용하게 되면 의존성이 프레임워크에 강하게 종속된다는 문제점이 있다.
4. 일반 메서드 주입   
한번에 여러 필드를 주입 받을 수 있다.

### DI 주의점
1. NullPointerException 방지
2. 순환참조 문제 방지

자동으로 주입하려는 Bean을 바꿀 때 어떻게 해야 할까?   
1. @Qualifier 이용
2. @Primary 이용   

의존성 주입 우선순위 : 타입 -> @Qualifier -> @Primary -> 변수명

### AOP
Aspect Oriented Programming   
객체지향 기술의 한계와 단점을 극복하도록 도와주는 보조적인 프로그래밍 기술   
종단의 관심사를 간단히 처리해주는 기능

### PSA
Portable Service Abstraction   
환경과 세부 기술의 변화에 관계없이 일관된 방식으로 기술에 접근할 수 있게 해줌   
서비스 추상화로 제공되는 기술을 다른 기술 스택으로 간편하게 바꿀 수 있는 확장성을 가짐

Spring Boot에 대해 정리하라
---
Spring Boot는 스프링 기반의 어플리케이션을 빠르게 개발하고 실행하기 위한 프레임워크다.

### Spring Boot의 특징
1. WAS: 웹 서버를 내장해서 별도로 설치 안해도 됨
2. 라이브러리 관리: 손쉬운 빌드 구성을 위한 스타터 종속성 제공 및 라이브러리 버전 관리
3. 자동 구성: 스프링과 외부 라이브러리의 빈을 자동 등록
4. 외부 설정: 환경에 따라 달라져야 하는 외부 설정 공통화
5. 프로덕션 준비: 모니터링을 위한 메트릭, 상태 확인 기능 제공

