# WIL5

MVC란 무엇인가?
---
### MVC란?
Model-View-Controller의 약자로   
주로 웹 어플리케이션과 그 외의 사용자 인터페이스를 가진 어플리케이션을 설계할 때 사용되는 디자인 패턴이다.   

MVC는 어플리케이션의 데이터 처리, 사용자 인터페이스, 그리고 제어 로직을 분리하여 각각의 책임을 명확하게 구분한다.

#### 1. Model
데이터와 비즈니스 로직을 처리   
데이터베이스와의 상호 작용, 쿼리 실행, 데이터 저장 및 조회와 같은 기본적인 작업을 포함   
변경이 발생하면, 관련된 View에 알릴 수 있다.

#### 2. View
화면에 표시되는 UI 부분   
데이터를 표시하거나 사용자와 상호작용을 위한 인터페이스를 표시하는 영역

#### 3. Controller
Model과 View 사이의 중개자 역할   
클라이언트의 요청에 대해 실제 업무를 수행하는 Model 컴포넌트를 호출하고 그 결과를 View에 전달한다.

### MVC의 장점
* 분리 및 재사용
* 유지 보수
* 확장성

### Spring MVC
![img](https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F81276f83-e80d-4730-b0ae-1b519fac7648%2F96f98626-df4f-4598-b82e-0333dc199b04%2FUntitled.png&blockId=f278e354-d5f2-402e-a3b6-f324c2c5d3cf)

Controller - Service - Repository
---
### 계층 구조
계층 구조란, 한 서비스를 여러 개의 논리적 레이어(계층)으로 나누는 설계 패턴이다.   
각 계층은 특정 역할과 책임을 가지며, 자신 아래 계층에 의존하는 구조를 가진다.
![img](https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F81276f83-e80d-4730-b0ae-1b519fac7648%2F3b6db308-e828-4e12-9cbe-b0f5429b31a8%2FUntitled.png&blockId=9b48c106-0c44-432a-99b2-de34cee1128c)

### Api Server 구조
#### Controller Layer
Client로부터 응답을 받는 계층   
사용자의 요청에 해당하는 URI와 컨트롤러의 메소드를 매칭시킨다.   
이 메소드는 해당 요청에 맞는 Service Layer의 기능을 호출해 요청을 처리한다.   
Controller는 사용자로부터 입력을 받는 부분을 설정하는 역할을 한다.

#### Service Layer
실질적인 비즈니스 로직이 실행되는 계층   
controller에서 매칭된 메소드가 service 레이어 메소드를 실행하게 된다.   
주로 service 레이어의 역할은 repository 레이어에서 받아온 데이터를 전달받아 가공, 처리하고, 이를 controller 레이어에 넘겨주는 것   

#### Repository Layer
특정 도메인 모델에 대한 CRUD 연산을 캡슐화하는 레이어   
DB에서 값을 가져오거나, 변경할 때 이 레이어 사용   

### DTO (Data Transfer Object)
이는 레이어에 해당하지 않는다.   
DTO는 계층 간 데이터 교환을 위해 사용하는 객체이다.   
* 주로 클라이언트와 서버 간 데이터 교환에 사용되며, 필요한 데이터만을 포함   
* 특별한 로직을 가지지 않음   

확장성과 보안을 위해 사용