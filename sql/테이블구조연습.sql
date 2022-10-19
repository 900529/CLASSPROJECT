
-- 20221016 연습

-- 테이블 구조 확인
describe dept;
desc dept;

-- 사용가능한 테이블 정보
select * from tab;

select *
from emp;

select deptno, job, sal, ename
from emp;

select ename, sal, sal*12 as yearSal1 , sal*12+nvl(comm, 0) as yearSal2
from emp;

-- 문자열 연산 
select ename ||  ' is a ' || job
from emp;

select  concat(ename, ' is a ', job)
from emp;
