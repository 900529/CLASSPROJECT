-- 20221018 

-- inline view - rownum
-- from 절 뒤에 오는 서브쿼리 => inline view
-- select => 결과도 테이블

select * from emp;
select rownum, emp. * from emp order by hiredate; 

-- rownum : 사용자가 생성하는 컬럼이 아니다! 시스템에서 제공하는 컬럼 
select rownum, t.*
from (select * from emp order by hiredate) t 
;

-- top3
-- 입사일이 가장 오래된 3명을 구한다! 
select rownum, t.*
from (select * from emp order by hiredate) t 
where rownum <= 3
; -- 정렬해놓고 rownum하면 inline으로 재정렬


-- rownum은 오라클에서만! mysql에서는 limit
-- select * from emp order by hiredate limit 0,3;



