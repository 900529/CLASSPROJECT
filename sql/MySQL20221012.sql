SELECT * FROM choiyena.Orders;

select sal, comm
from emp;

select sal, ifnull(comm, 0) 
from emp; 

select aname, job
from emp;

-- 문장열을 완성하는 함수 : concat(arag, arg, arg ....)
select concat(ename,'is a', job)
from emp;

