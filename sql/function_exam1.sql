-- [ 함수문제 1 ]

-- 16. substr 함수 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오
-- '81/12/05' -> 81/12

SELECT HIREDATE, SUBSTR(HIREDATE, 1, 5), SUBSTR(HIREDATE, 1, 2), SUBSTR(HIREDATE, 4, 2)
FROM EMP;

-- 17. substr 함수 사용하여 4월에 입사한 사원 출력
SELECT *
FROM EMP
WHERE SUBSTR(HIREDATE, 4, 2) = '04';
-- WHERE TO_NUMBER(SUBSTR(HIREDATE, 4, 2), '99') = 4;

-- 18. MOD함수 사용하여 사원번호가 짝수인 사람만 출력 (2로 나눠서 0)
SELECT *
FROM EMP
WHERE MOD(EMPNO, 2) = 0;

-- 19. 입사일 년도 2자리 YY, 월은 MM 표시하고 요일은 약어 DY로 지정하여 출력
SELECT ENAME, 
       TO_CHAR(HIREDATE, 'YY') AS "입사 년도", 
       TO_CHAR(HIREDATE, 'MM') AS "입사 월", 
       TO_CHAR(HIREDATE, 'DY') AS "입사 요일",
       TO_CHAR(HIREDATE, 'YY.MM, DY') AS "입사 년도/월/요일"
FROM EMP;

-- 20. 올해 몇 칠이 지났는지 출력하시오. 
-- 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 
-- TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
SELECT TRUNC(SYSDATE - TO_DATE('2022/01/01')) AS "현재 이번 년도의 일수"
FROM DUAL;


-- 21. 사원들의 상관 사번을 출력하되, 상관이 없는 사원에 대해서는 null 값 대신 0으로 하시오
SELECT NVL(MGR, 0)
FROM EMP;

-- 22. DECODE 함수로 직급에 따라 급여 인상
-- ‘ANALIST” 200, ‘SALESMAN’ 180, ‘MANAGER’ 150, ‘CLERK' 100을 인상
SELECT ENAME, JOB, SAL,
       DECODE(JOB, 'ANALYST', SAL + 200,
                   'SALESMAN', SAL + 180,
                   'MANAGER', SAL + 150,
                   'CLERK', SAL + 100
       ) AS UP_SAL
FROM EMP;
​
-- 23. 모든 사원의 급여 최고액, 최저액, 총액 및 평균 급여 출력. 평균에 대해서는 정수로 반올림
select max(sal) as max_sal, min(sal) as min_sal, sum(sal) as total_sal, round(avg(sal),0) as add_sal 
from emp;

-- group by 중요
-- 24. 각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균 액을 출력하시오. 평균에 대해서는 정수로 반올림 하시오.
SELECT JOB, MAX(SAL), MIN(SAL), SUM(SAL), ROUND(AVG(SAL))
FROM EMP
-- WHERE EMPNO>0
GROUP BY JOB;

-- 25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오.
SELECT JOB, COUNT(*)  --COUNT 대상이 되지 않는 NULL 값 없어야함 
FROM EMP
GROUP BY JOB;

-- 26. 관리자 수를 출력하시오.
-- MGR -> 상관의 사원번호 EMPNO 
-- MGR 컬럼에 있는 사원번호 => 관리자들
SELECT COUNT(MRG) FROM EMP ORDER BY MGR;

SELECT COUNT(DISTINCT MGR)
FROM EMP;

-- 27. 급여 최고액, 급여 최저액의 차액을 출력하시오.
SELECT MAX(SAL), MIN(SAL), MAX(SAL) - MIN(SAL)
FROM EMP;

-- 28. 직급별 사원의 최저 급여를 출력
-- 관리자를 알 수 없는 사원과 WHERE
-- 최저 급여가 2000 미만인 그룹은 제외시키고 HAVING
-- 결과를 급여에 대한 내림차순으로 정렬하여 출력
SELECT MIN(SAL)
FROM EMP
WHERE MGR IS NOT NULL
GROUP BY JOB
HAVING NOT MIN(SAL) < 2000
ORDER BY MIN(SAL) DESC;

-- 29. 각 부서에 대해 부서번호, 사원 수, 부서 내의 모든 사원의 평균 급여 출력 
-- 평균 급여는 소수점 둘째 자리로 반올림 하시오.
SELECT DEPTNO, COUNT(*), ROUND(AVG(SAL), 2) AS "부서 평균 급여"
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

-- 30. 각 부서에 대해 부서번호 이름, 지역 명, 사원 수, 부서내의 모든 사원의 평균 급여를 출력. 
-- 평균 급여는 정수로 반올림 하시오. DECODE 사용
SELECT DECODE(DEPTNO, 10, 'ACCOUNTING',
                      20, 'RESEARCH',
                      30, 'SALES',
                      40, 'OPERATIONS'
       ) AS DNAME,
       DECODE(DEPTNO, 10, 'NEW YORK',
                      20, 'DALLAS',
                      30, 'CHICAGO',
                      40, 'BOSTON'
       ) AS LOC,
       COUNT(*) AS "사원 수", ROUND(AVG(SAL)) AS "부서 평균 급여"
FROM EMP
GROUP BY DEPTNO
ORDER BY AVG(SAL);

-- JOIN을 사용한 해결
SELECT DEPT.DNAME, DEPT.LOC, COUNT(*), ROUND(AVG(SAL)) AS "부서 평균 급여"
FROM EMP JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO
GROUP BY DEPT.DEPTNO, DEPT.DNAME, DEPT.LOC
ORDER BY AVG(SAL);

-- 31. 업무를 표시한 다음, 해당 업무에 대해 부서 번호별 급여 및 부서 10, 20, 30의 급여 총액을 각각 출력
-- 별칭은 각 job, dno, 부서 10, 부서 20, 부서 30, 총액으로 지정하시오. ( hint. Decode, group by )
SELECT JOB, DEPTNO,
       DECODE(DEPTNO, 10, SUM(SAL)) AS "부서10",
       DECODE(DEPTNO, 20, SUM(SAL)) AS "부서20",
       DECODE(DEPTNO, 30, SUM(SAL)) AS "부서30",
       SUM(SAL)
FROM EMP
GROUP BY JOB, DEPTNO
ORDER BY DEPTNO;

SELECT JOB, DEPTNO AS DNO, 0 AS "부서10", 0 AS "부서20", 0 AS "부서30" SUM(SAL)
FROM EMP
GROUP BY JOB, DEPTNO
;
