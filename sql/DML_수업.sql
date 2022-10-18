-- DML

-- 데이터의 수정
-- update 테이블이름 set 컬럼이름 = 새로운값, 컬럼이름 = 새로운값 where 행 선택 조건

drop table emp03;
create table emp03 as select * from emp;

select * from emp03;

-- 모든 사원의 부서번호를 30으로 변경 
update emp03 set deptno=30;

-- 모든 사원의 급여를 10% 인상
update emp03 set sal = sal*1.1;

-- 모든 사원의 입사일을 오늘 날짜로 변경
update emp03 set hiredate = sysdate;

-------------------------------------------------
select * from emp03;
-- 부서번호가 10번인 사원의 부서번호를 30번으로 변경 [특정 행 변경]
update emp03 set deptno=30 where deptno=10;

-- 급여가 3000 이상인 사원들의 급여를 10% 인상하자!
update emp03 set sal=sal*1.1 where sal >= 3000;

-- SCOTT 사원을 40번 부서로 이동, 직급을 MANAGER로 변경
update emp03 set deptno=40, job='MANAGER' where ename = 'SCOTT';

-- SMITH 사원을 SCOTT 사원의 부서로 이동 
update emp03 set deptno = (select deptno from emp03 where ename='SCOTT') where ename = 'SMITH';
------------------------------------------------
drop table dept01;
create table dept01 as select * from dept;
select * from dept01;
-- 부서번호가 20번인 부서의 지역과 이름은 RESEARCH, DALLAS 이다. 
-- 부서번호가 20인 부서의 부서명과 지역명을 부서 번호가 40번인 부서와 동일하게 변경
update dept01
set (dname, loc) = (select dname, loc from dept where deptno=40)
where deptno = 20
;
select * from dept01;
-----------------------------------------------
-- 테이블의 행을 삭제
-- delete from 테이블 이름 where 행선택조건
-- delete 문으로 부서 테이블의 모든 행을 삭제합시다! 
delete from dept01;
select * from dept01;
select * from emp03;
-- 대표 사퇴
delete from emp03 where empno=7839;
-- 40번 부서의 모든 사원 삭제
delete from emp03 where deptno=40;
select * from emp03;
-- SALES 부서의 사원이 모두 퇴사 -> 삭제
delete from emp03 where deptno = (select deptno from dept where dname = 'SALES');

----------------------------------------------
