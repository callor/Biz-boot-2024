# Spring Data JPA
- `spring.****.data-jpa` 를 dependency 로 설정하면 기본적으로 JPA 를 사용하는 프로젝트가 된다 
 
## `Persistance` : `영속성 객체`
- 컴퓨터에 입력되는 모든 데이터는 기본적으로 `주 기억장치(Main Memory, RAM)`에 저장된다
- `주 기억장치`에 저장된 데이터는 컴퓨터에 전원이 On 되어 있을 동안만 유지되는 휘발성 성질을 갖느다
- `주 기억장치`에 저장된 데이터 또는 연산된 결과를 보관하기 위해 `File`, `DBMS`에 저장한다
- 프로그래밍에서 데이터가 주 기억장치에서 File 또는 DBMS 에 보관되는 것을 `영속화(Persistence)` 라고 한다
- `Spring Data JPA`는 Spring 에서 DBMS 에 데이터를 CRUD 할때 최소한의 SQL 만을 사용하고, 
- 마치 자바의 코드를 사용하고, 객체에 데이터를 저장하는 것처럼 사용하기 위한 기술로 탄생한다

## `JPA` 의 `ddl-auto` 설정
- `ddl_auto`는 프로젝트가 시작될때 DBMS 의 table 핸들링을 어떻게 할것인가를 결정
- `create` : 기존의 table 을 DROP & CREATE, 보통 Test 환경에서 사용한다
- `update` : Alter Table 을 실행해야 하는데, 잘 실행이 안된다.
- `create-drop` : 기존의 table 을 DROP & CREATE 하고 프로젝트가 종료될때 다시 DROP 
- `none` : 아무것도 하지마, 실제 운영환경에서 주로 사용하는 방식
- `validate` : Table 구조가 문제가 없는지 검사, 만약 문제가 있으면 프로젝트 멈추기