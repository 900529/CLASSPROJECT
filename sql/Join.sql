-- 06. Join : 관계있는 테이블의 스키마를 붙이는 것

select *
from emp, dept
where emp.deptno = dept.deptno 
;
-- emp 14 * 4 = cross join 결과 행 56
select * 
from emp cross join dept; 

select emp.ename, dept.dname
from emp, dept
where emp.deptno = dept.deptno;

select e.ename, d.dname
from emp e, dept d  -- 별칭 넣는 방법
where e.deptno = d.deptno 
;
-- Equi Join, Non-Equi Join, Outer Join, Self Join

-- mysql
select * 
from emp e inner join dept d
on e.deptno = d.deptno;

select * 
from emp join dept
on emp.deptno = dept.deptno;

-- self Join : 자기 자신의 테이블과 조인
-- emp => mgr : 상사의 사원번호 
-- 각 사원들의 이름과 상사의 이름을 출력 

select ename, mgr from emp;
select ename from emp where empno=7839;

select e1.ename as "사원이름", e2.ename as "상사이름"
from emp e1, emp e2
where e1.mgr = e2.empno (+) -- 조건이 맞지 않더라도 
;

select e1.ename, e2.ename
from emp e1 left outer join emp e2
on e1.mgr = e2.empno;

select e1.ename, e2.ename
from emp e1 right outer join emp e2
on e1.empno = e2.mgr; -- 헷갈림

