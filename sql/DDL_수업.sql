-- DDL : 정의어 = 객체를 정의하는 명령어

-- 데이터의 저장 공간 생성 
-- create table 테이블 이름 ( 
--     컬럼이름 타입 [제약조건], 
--     컬럼이름 타입 [제약조건], 
--     ....
-- );
create table ddl_test (
    no number(3) not null unique,
    name varchar2(10),
    birth date default sysdate
);

desc emp;
-- 사원 테이블과 유사한 구조의 사원번호, 사원이름, 급여 3개의 칼럼으로 구성된 EMP01 테이블 생성
create table emp01
(
    empno number(4),
    ename varchar2(10),
    sal number(7,2)
);

desc emp01;
insert into emp01 (empno, ename, sal) values (1111, 'SON', 1000);
select * from emp01;

--  as : 서브쿼리를 이용해서 기존 테이블 구조로 생성, 데이터 저장, 제약 조건은 카피되지 않는다!!
create table emp02
as
select * from emp
;

desc emp02;

select * from emp02;

-- 원하는 컬럼만 카피해서 생성
create table emp03
as
select empno, ename, job, hiredate from emp
;

desc emp03;

select * from emp03;

select empno, ename, job from emp where deptno=20;

create table emp04
as
select empno, ename, job from emp where deptno=20;
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
-- job 컬럼을 추가!
alter table emp01 add (job varchar2(9));
select * from emp01;

-- alter table 테이블 이름 modify => 컬럼을 수정
alter table emp01 modify (job varchar2(30) default 'manager');

-- null 값이 있는 경우 not null 제약은 추가 불가!
alter table emp01 modify (job not null);
desc emp01;

-- 컬럼의 이름 변경
alter table emp01 rename column job to jobs;
desc emp01;

-- alter table 테이블 이름 drop => 컬럼을 삭제
alter table emp01 drop column job;
desc emp01;

-- 테이블 객체 삭제
drop table emp01;

desc emp01;
select * from emp01;

select * from emp02;
drop table emp02;

select * from emp03;

-- 테이블의 모든 행을 삭제 : 물리적 삭제
truncate table emp03;

desc emp03;

-- 테이블의 이름 변경 : rename 기존테이블이름 to 새로운이름
select * from emp03;

rename emp03 to test03;

select * from test03;

create table emp01 (
    empno number(4),
    ename varchar2(10),
    job varchar2(9),
    deptno number(2)
);

drop table emp01;

create table emp01 (
    empno number(4) not null, -- not null 제약조건은 컬럼 정의 위치에서 제약조건을 정의
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
    
);

-- unique 제약 조건 정의
create table emp01 (
    empno number(4) not null unique, -- not null 제약조건은 컬럼 정의 위치에서 제약조건을 정의
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
    
);

-- 기본키 제약조건 정의
create table emp01 (
    empno number(4) primary key, 
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)    
);

-- 기본키 제약조건 정의 : 제약조건의 이름 등록
create table emp01 (
    empno number(4) CONSTRAINT emp01_empno_pk primary key, 
    ename varchar2(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique ,
    deptno number(2)
    
);

-- 외래키 제약 조건 정의
create table emp01 (
    empno number(4) CONSTRAINT emp01_empno_pk primary key, 
    ename varchar2(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique ,
    deptno number(2) constraint emp01_deptno_FK REFERENCES DEPT(deptno)
    
);


-- check  제약
create table emp01 (
    empno number(4) CONSTRAINT emp01_empno_pk primary key, 
    ename varchar2(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique ,
    sal number(7,2) constraint emp01_sal_CK check (sal between 500 and 5000) , -- 500~5000
    gender char(1) constraint emp01_gender_CK check (gender in ('M','F')) , -- 남자 M 여자 F
    deptno number(2) constraint emp01_deptno_FK REFERENCES DEPT(deptno)
    
);

-- default : null 값의 입력시 기본으로 저장할 값을 정의
create table emp01 (
    empno number(4) CONSTRAINT emp01_empno_pk primary key, 
    ename varchar2(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique ,
    sal number(7,2) constraint emp01_sal_CK check (sal between 500 and 5000) , -- 500~5000
    gender char(1) constraint emp01_gender_CK check (gender in ('M','F')) , -- 남자 M 여자 F
    deptno number(2) constraint emp01_deptno_FK REFERENCES DEPT(deptno),
    hiredate date default sysdate
);

-- default 없는 컬럼의 null 입력
create table emp01 (
    empno number(4) CONSTRAINT emp01_empno_pk primary key, 
    ename varchar2(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique ,
    sal number(7,2) constraint emp01_sal_CK check (sal between 500 and 5000) , -- 500~5000
    gender char(1) constraint emp01_gender_CK check (gender in ('M','F')) , -- 남자 M 여자 F
    deptno number(2) constraint emp01_deptno_FK REFERENCES DEPT(deptno),
    hiredate date
);

drop table emp01;


insert into emp01 (empno, ename, sal, gender, job, deptno ) 
values (1111, 'KING', 5000, 'M', 'MANAGER', 10);
insert into emp01 (empno, ename, sal, gender, job, deptno, hiredate ) 
values (1111, 'KING', 5000, 'M', 'MANAGER', 10, sysdate);
select * from emp01;


desc emp01;

insert into emp01 values(1111, 'SON', 'MANAGER', 100, 'A', 20);
insert into emp01 values(1111, 'SON', 'MANAGER', 500, 'M', 20);

desc emp01;

insert into emp01 (job, deptno) values ('MANAGER', 20);

select * from dept;

insert into emp01 (empno, ename, job, deptno) values (1111, 'KING', 'DEV', 10);
insert into emp01 (empno, ename, job, deptno) values (1112, 'KING', 'DEVs', 60);
insert into emp01 (empno, ename, job, deptno) values (null, 'SON', 'MANAGER', 20);
select * from emp01;
