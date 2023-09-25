## WIL2
HTTP에 대해 정리하라
---
* HTTP란?   
 서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층의 protocol로, HyperText Transfer Protocol의 약자이다.

 * HTTP 특징   
 1. Transfer layer
 2. 비 연결성
 3. 무상태성

 * HTTP 연결 과정   
 1. TCP 연결을 열어준다.
 2. HTTP 메시지 전송한다.
 3. 서버가 보낸 응답을 읽는다.
 4. 연결을 닫거나 다른 요청을 위해 재사용한다.

 * HTTP Message   
 HTTP는 HTTP message를 통해 데이터를 주고 받는다. HTTP 메시지에는 request와 response가 있다. request는 http method, 경로, http 버전, 헤더로 이루어져 있다.

 * HTTP Method   
 클라이언트가 서버에 특정 요청을 보낼 때, 웹 서버에게 요청하는 목적 및 그 조류를 알리는 수단으로 HTTP Method를 사용한다.   
 GET: 리소스 조회   
 POST: 요청 데이터 처리, 주로 등록에 사용   
 PUT: 리소스를 대체, 해당 리소스가 없으면 생성   
 PATCH: 리소스 부분 변경   
 DELETE: 리소스 삭제   
 HEAD: 메시지 부분을 제외하고, 상태 줄과 헤더만 반환   
 OPTIONS: 대상 리소스에 대한 통신 기능 옵션을 설명   
 CONNECT: 대상 리소스로 식별되는 서버에 대한 터널 설정   
 TRACE: 대상 리소스에 대한 경로를 따라 메시지 루프백 테스트를 수행   

 * HTTP 상태 코드   
서버 측에서 클라이언트로 요청에 대한 응답을 보낼 때, 해당 요청에 관한 처리 상태를 알려주는 기능 (번호마다 가진 의미가 다름)

HTTPS가 무엇인지 정리하고, HTTP와 비교하라
---
HTTPS는 웹 통신을 위한 암호화된 프로토콜로, 정보를 안전하게 전송하기 위해 사용된다. Hypertext Transfer Protocol Secure의 약자다.   

HTTPS는 HTTP와 달리 데이터의 기밀성과 무결성을 보호하며 사용자와 웹 서버 간의 통신을 보호하는 중요한 역할을 한다. 즉, HTTPS는 HTTP의 보안 버전이다.   

HTTPS를 사용하면 웹 통신이 안전하게 이루어지며 중요한 정보를 전송할 때 사용자의 개인 정보가 보호된다.

아래 API에 대한 RESTful한 URL를 설계하라.
---