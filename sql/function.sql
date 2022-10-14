
-- 20221013
-- 함수 : 단일행 함수, 집합 함수

select ename, sal, nvl(comm, 0) as comm
from emp;
where comm >= 0
;

-- [ 문자함수 ] 
select lower('SCOTT')from dual;

select ename, lower(ename) from emp;  -- 저장 데이터는 대문자여도 소문자로 출력할때!

select upper('scott') from dual;

select initcap('scott') from dual; -- 앞글자 대문자로!

-- substr(원본, 시작포인트, 반환할 개수)
-- 특정 부분에 있는 데이터 뽑아낼 때
select substr('안녕하세요! 손흥민입니다.', 2, 5) from dual;
select substr('안녕하세요! 손흥민입니다.', 5) from dual;
select length ('안녕하세요! 손흥민입니다.') from dual;

-- lpad, rpad 특정 자리수 지정하고, 자리수에 데이터가 없는 경우 특정 패턴으로 채우는 함수
-- 00010, 00020, 00030, 00040
select dname, deptno, lpad(deptno, 5, '0'), rpad(deptno, 5, 'A')
from dept;

select '   ABC     ', trim('   ABC     ')
from dual;

select replace('Steven King','Steven', 'S.')
from dual;


-- [ 숫자함수 ] 
select -10, abs(-10)
from dual;

select 2.1, 2.9, floor(2.9)
from dual;

select 1234.567, round(1234.527, 1), round(1234.527, -1)
from dual;

select 1234.567, trunc(1234.567, 1), trunc(12345.567, -1), trunc(1234.567)
from dual;

select mod(1,3), mod(2,3), mod(3,3), mod(0,3)
from dual;

-- [ 날짜함수 ] 

-- 현재 날짜 
select sysdate
from dual;

select months_between(sysdate, '21/12/13') from dual;
select add_months(sysdate, -2) from dual;
select next_day(sysdate, 1) from dual;
select last_day(sysdate) from dual;
select round(sysdate) from daul;
select trunc(sysdate) from dual;



