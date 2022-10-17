
-- DDL : 정의어 => 객체를 정의하는 명령어

-- 데이터의 저장 공간 생성 
-- creative table 테이블이름 (
--       컬럼이름 타입 [제약조건],
--       컬럼이름 타입 [제약조건],
--    ...
-- );

create table dd1_test ( --원하는 이름으로 설정 
    no number(3) not null unique,
    name varchar2(10),
    birth date default sysdate
    );
    
desc emp; -- 확인
-- 사원 테이블과 유사한 구조의 사원번호, 사원이름, 급여 2개의 칼럼으로 구성된 EMP01 테이블을 생성해 봅시다.
create table emp01
( 
 empno number(4),
 ename varchar2(10),
 sal number(7,2)
 );
 
desc emp01
insert into emp01 (empno, ename, sal) values (1111, 'SON',1000);
select * from emp01;

-- as : 서브쿼리를 이용해서 기존 테이블 구조로 생성, 데이터 저장
create table emp02
as
select * from emp
;

desc emp02;

-- 원하는 컬럼만 카피해서 생성
create table emp03
as
select from empno, -- 추가 정리할 것
--? 
as
select empno, ename, job from where deptno=20;
desc emp04;
select * from emp04;

-- 스키마만 복사한 테이블
create table emp05
as
select * from emp where 1=0
;
desc emp05;
select * from emp05;

-- 테이블의 컬럼 수정
-- alter table 테이블 이름 add => 컬럼을 추가
desc emp01;
-- job컬럼을 추가
alter table emp01 add (job varchar2(9));
select * from emp01;

-- alter table 테이블 이름 modify => 컬럼을 수정
alter table emp01 modify (job varchar(30));
desc emp01;

-- alter table 테이블 이름 drop => 컬럼을 삭제
alter table emp01 drop cplumn job;


-- 테이블의 모든 행을 삭제
