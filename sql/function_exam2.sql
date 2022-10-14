-- [ 함수문제 2 ] 

-- 박지성의 총구매액 (박지성 고객번호는 1번으로 놓고 작성)
select sum(saleprice) as totalprice
from orders
where custid = 1;

select sum(saleprice) as totlaprice
from orders 
where custid = (select custid from customer where name = '박지성');

-- 박지성이 구매한 도서의 수 (박지성 고객번호는 1번으로 놓고 작성)
select count(*) totlacount
from orders 
where custid = 1;

select count(*) total_count 
from orders 
where custid = (select custid from customer where name = '박지성');

-- 마당 서점 도서의 총 개수
select count(*)as totalcount
from book;

-- 마당 서점에 도서를 출고하는 출판사의 총개수
select count(distinct publisher) as bookcompany
from book;