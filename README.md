# web1_Spring✍️
**웹개발 (2023.06.12.~2023.11.07.) 강의에서 공부한 Spring 내용**입니다.

readme 파일에 목차 및 내용 정리해두었으니 참고 부탁드립니다.

감사합니다.🥰


<br><br>

## 📝 Day01
> ### Framework: 프레임워크
1. 라이브러리(Library): 개발자가 작성해놓은 코드파일
2. API: 여러 라이브러리가 모여있는 패키지(JAR)
3. 프레임워크(Framework): API가 굉장히 많이 모여져서 덩치가 커져있는 것

<br>

개발자는 각 개개인의 능력 차이가 큰 직종이고 개발자의 구성에 따라 프로젝트 결과 역시 큰 차이를 낳는다.  
이런 상황을 극복하기 위한 코드의 결과물이 바로 프레임워크이다.  
프로그램의 기본 흐름이나 구조를 정하고 모든 팀원이 이 구조에 자신의 코드를 추가하는 방식으로 개발하게 된다. 

<br>

> #### Framework의 장점
개발에 필요한 구조를 이미 코드로 만들어 놓았기 때문에,   
실력이 부족한 개발자라 하더라도 반쯤 완성된 상태에서 필요한 부분을 조립하는 형태의 개발이 가능하다.  
회사 입장에서는 프레임워크를 사용하면 일정한 품질이 보장되는 결과물을 얻을 수 있고,  
개발자 입장에서는 완성된 구조에 자신이 맡은 서비스에 대한 코드를 개발해서 넣기 때문에 개발 시간을 단축할 수 있다.  

<br>

> #### Spring Framework의 장점
- 프로젝트 전체 구조를 설계할 때 유용하다. (빠른 속도로 서버 제작 가능)
- 다른 프레임워크들의 포용, 여러 프레임워크를 혼용해서 사용 가능하기 때문에 접착성이 좋다.
- 개발 생산성과 개발도구의 지원

<br>

> #### Spring Framework의 특징
- **POJO(Plain Old JAVA Object) 기반의 구성**
  - 오래된 방식의 간단한 자바 객체라는 의미이며, JAVA 코드에서 일반적으로 객체를 구성하는 방식을 Spring Framework에서 그대로 사용할 수 있다는 의미
- **DI(Dependency Injection: 의존성 주입)를 통한 객체간의 관계 구성**
  - 의존성(Dependency)란 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 것을 의미한다.  
    예를 들어 A객체가 B객체 없이 동작이 불가능한 상황을 "A가 B에 의존적이다" 라고 표현한다.  
    하지만 직접 A필드에 B객체를 선언하면 결합도(Coupling)이 단단해지기 때문에 유연성이 떨어진다.  
  - 주입(Injection)은 외부에서 내부로 밀어 넣는 것을 의미한다.  
    필요한 객체를 외부에서 밀어 넣어 유연성을 높이고 결합도를 느슨하게 해준다.  
    주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없고 어떤 객체에 의존하든 자신의 역할은 변하지 않는다.  

```
📌 의존성
   A → → → → → → B
   A객체에서 B객체를 필드로 직접 생성

📌 의존성 주입
  A ↔ ↔ ↔ ? ↔ ↔ ↔ B
  A는 B가 필요하다고 신호를 보내고, ?가 B객체를 외부에서 생성하여 주입하게 된다.
  Spring Framework에서는 ApplicationContext가 ?이며, 필요한 객체들을 생성 및 주입해주는 역할을 한다.
  따라서 개발자들은 기존의 프로그래밍과는 달리 객체와 객체를 분리해서 생성하고,
  이러한 객체를 엮는 wiring 작업의 형태로 개발하게 된다.
```





