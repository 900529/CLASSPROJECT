-- 문자함수
select ename, lower(ename) from emp;
select Upper('scott') from dual;
select initcap('scott') from dual;

-- substr( 원본, 시작포인트)
select substr('안녕하세요. 최예나입니다.', 2, 3)  from dual;
select length ('안녕하세요. 최예나입니다.')  from dual;

-- lpad(왼쪽), rpad(오른쪽) 특정 자리수 지정하고 자리수에 데이터가 없는 경우 특정 패턴으로 채우는 함수
-- 000010, 00020, 00030, 00040
select dname, deptno, lpad(deptno, 5, '0'), rpad(deptno, 5, 'A')
from dept;

-- 앞뒤 공백 
select '     ABC     ', trim('     ABC     '), '      ABC     ', trim('ABC      ')
from dual;

select replace ('Steven King', 'Steven', 'S.')
from dual;

--  숫자함수
select -10, abs(-10)
from dual;

select 2.1, 2.9, floor(2.9)
from dual;

select 1234.567,round (1234.567, 1),round (1234.567, -1)
from dual;

select 1234.567, trunc(1234.567, 1),  trunc(1235.567, -1)
from dual;

select mod(1,3), mod(2,3), mod(3,3), mod(0,3) from dual;

-- 현재 날짜
select sysdate from dual;
select months_between(sysdate, '21/12/13') from dual;
select add_months(sysdate, 2) from dual;
select next_day(sysdate, 1) from dual; -- 일요일이 1번
select last_day(sysdate) from dual;
select round(sysdate) from dual; -- 반올림한 날짜로! 
select trunc(sysdate) from dual; --절삭

-- 변환함수
-- to_char (원본, 'format')  2022.10.13  14:39 
-- date -> varchar2
select sysdate, to_char(sysdate, 'YYYY-MM-DD'), to_char(sysdate, 'YYYY. MM. DD'),
 to_char(sysdate, 'YYYY. MM. DD. HH24:MI:SS')l
from dual;

-- number ->verchar2 

select to_char(123456789, '000,000,000,000'), to_char(123456789, '999,999,999,999') --9로 하면 공백은 비워짐
, to_char(123456789, 'L999,999,999,999') --L은 원화표시  
from dual;

select ename, sal, to_char(sal*1400, 'L999,999,999') as wonSal
from emp;

-- vercahr2 => date
-- to_date (문자열, '날짜형식')
-- 1999-12-13 
select  to_date('1999-12-13', 'YYYY-MM-DD')
from dual; 
desc emp;
insert into emp values(9998, 'KKK',  'CLERK', 7782, '1982-12-12', 1300, null, 10);
select * from emp;
rollback; --commit 안했으면  잘못 입력할 경우,  rollback으로 원상복귀

-- varchar2 => number
select 
to_number('20,000', '999,999') - to_number('10,000', '999,999')
from dual; 

-- dcode 함수 : 여러가지 비교를 통해 결과 출력 switch-case 유사
select
ename,
deptno,
decode (deptno, 10, 'ACCOUNT'
                         , 20, 'RESEARCH'
                         ,30, 'SALES'
                         , 40, 'OPERATIONS'
)  as dname
from emp;

select distinct job from emp;

select 
ename, job, sal, 
nvl (decode (  job, 'ANALYST', sal*1.05,
                          'SALESMAN', sal*1.1,
                          'MANAGER', sal*1.15,
                          'CLERK', sal*1.2
),sal)  as upSal
from emp;

-- case ~ when ~ then
select ename, deptno,
case when deptno =10 then 'accounting'
   when deptno =20 then 'research'
   when deptno =30 then 'sales'
   when deptno =40 then 'operations'
end as dname

from emp;

--------------------------------------------
-- 그룹함수, 집합함수, 집계함수, 다중행 함수
-- sum, avg, count, max, min

-- 회사의 모든 사원의 급여 총액 : 월 지출액
select sum(sal)*1400
from emp;
-- 커미션 총액
select sum(comm), count(comm), avg(comm)
from emp;
-- 급여 평균
select round (avg(sal), 2)
from emp; 
-- 최고급여 찾기
select 
max(sal)
from emp;

-- 최저 급여
select min(sal)
from emp;

-- 전체 사원의 수
 select count (*) from emp;
 
 -- 부서의 개수
 select  count(*) from dept;
 
 -- 직급의 수
 select count( distinct job) from emp;
 select distinct job from emp;
 
 -- group by : 특정 컬럼 값을 기준으로 그룹핑 가능
 select * from emp;
 
 select sum(sal), count(*) from emp where deptno =10;
  select sum(sal), count(*) from emp where deptno =20;
 
 select deptno, count(*), sum(sal), avg(sal), trunc(avg(sal)), max(sal), min(sal), count(comm)
 from emp
 group by deptno
 -- 부서별 평균 급여가 2000 이상인 부서의 데이터만 출력 
 having max(Sal) >= 2900;
 
 -- 직급별
  select job, count(*)
  from emp
  group by job;
  
  