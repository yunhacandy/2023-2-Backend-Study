## WIL1
자바 (Java)
---
* 자바란?   
썬 마이크로시스템즈에서 개발하여 1996년 1월에 공식적으로 발표한 객체지향 프로그래밍 언어
* 자바의 특징
1. 운영체제에 독립적이다 (WORA, JVM)
2. 객체지향언어이다.
3. 자동 메모리 관리
4. 네트워크와 분산처리를 지원한다.
5. 멀티쓰레드를 지원한다.
6. 동적 로딩을 지원한다.

객체지향 프로그래밍
---
프로그래밍에서 필요한 데이터를 추상화시켜 상태와 행위를 가진 객체로 만들고, 객체들간의 상호작용을 통해 로직을 구성하는 프로그래밍 방법
* 객체지향 프로그래밍의 장점
1. 코드의 재사용성이 높다.
2. 유지보수가 쉽다.
3. 대형 프로젝트에 적합하다.

* 객체지향 프로그래밍의 단점
1. 처리 속도가 느리다.
2. 객체가 많으면 용량이 커진다.
3. 설계 시 많은 노력과 시간이 필요하다.

* 객체지향 프로그래밍의 특징
1. 추상화
2. 캡슐화 (낮은 결합도를 유지, 재사용이 원활하고 정보은닉에 활용)
3. 상속
4. 다형성 (오버라이딩, 오버로딩)

* 객체지향 설계 원칙 (SOLID)
1. 단일 책임 원칙 (SRP)
2. 개방-폐쇄 원칙 (OCP)
3. 리스코프 치환 원칙 (LSP)
4. 인터페이스 분리 원칙 (ISP)
5. 의존관계 역전 원칙 (DIP)

자바의 객체 지향 
---
* 클래스
\\\
public class Person {
    // 맴버 변수 (객체가 가질 수 있는 속성)
    private int age;
    private String name;

    // 생성자 (객체를 초기화할 때 사용)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter (멤버 변수에 접근 제어 및 데이터 무결성을 유지할 수 있다.)
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    // setter (getter와 마찬가지)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method (객체의 행동을 정의)
    public void hello(){
        System.out.println("hello");
    }
}
\\\s

* 캡슐화
private으로 선언하여 외부에서 접근할 수 없도록 하고   
메서드를 통해 데이터를 설정하고 조회한다.   
이렇게 함으로써 데이터의 무결성을 유지하고 객체 내부 상태를 보호할 수 있다.

* 상속
'''
//HarryPotter 클래스는 Person 클래스를 상속받아서 만들어진 하위 클래스이다. 그래서 모든 멤버 변수와 메서드를 상속받는다.(역으로 호출도 가능)
class HarryPotter extends Person { 
    public HarryPotter(String name, int age) {
        super(name, age); // 상위 클래스의 생성자 호출
    }

    // HarryPotter 클래스만의 메서드 추가
    public void Lumos() {
        System.out.println("Lumos");
    }

    @Override
    public void hello() {
        System.out.println("hello I'm " + this.getName());
    }
}
'''
* 다형성
동일한 메서드 호출로 인해 서로 다른 객체에 대한 다양한 동작을 구현할 수 있다.

* 추상화
추상 메서드를 통해 다양한 객체를 다룰 수 있다.