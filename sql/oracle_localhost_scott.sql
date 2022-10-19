-- [ Jon & Sub Query 과제 ] 

-- 5. 박지성(CUSTOMER)이 구매한 도서(ORDERS)의 출판사 수(BOOK) 
select count (distinct publisher)
from orders o, book b, customer c
where o.bookid =b.bookid and c.custid=o.custid and c.name = '박지성';

-- 6. 박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격의 차이
select name, bookname, price, saleprice, price-saleprice as gapPrice
from orders o, book b, customer c
where o.bookid =b.bookid and c.custid=o.custid and c.name = '박지성';

-- 7. 박지성이 구매하지 않은 도서의 이름
select bookid, bookname
from book 
where bookid not in ( select distinct bookid
      from orders o, customer c
      where o.custid=c.custid and name = '박지성');


-- 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 작성
-- 8. 주문하지 않은 고객의 이름 (부속질의사용) ?? 재확인  
select distinct custid from orders;

select * 
from customer
where custid not in (select distinct custid from orders);

-- 9. 주문금액의 총액과 주문의 평균금액
select sum(saleprice), avg(saleprice)
from orders;

-- 10. 고객의 이름과 고객별 구매액
select c.name, sum(saleprice) as total
from customer c, orders o
where c.custid = o.custid
group by c.custid, c.name
order by c.custid -- ?? order by 두번이나? 
;

-- 11. 고객의 이름과 고객이 구매한 도서 목록
select name, bookname -- c, b 생략 
from customer c, orders o, book b 
where c.custid=o.custid and o.bookid=b.bookid;

-- 12. 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문 ??
select orderid, price, saleprice, price-saleprice
from orders o, book b
where o.bookid=b.bookid and price-saleprice = (select max(price-saleprice)
                                              from orders o, book b
                                              where o.bookid=b.bookid) 
;
                   
                                              
-- 13. 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름 ??
select c.custid, name, avg(saleprice)
from customer c, orders o
where c.custid = o.custid
group by c.custid, name
having avg(salesprice) > (select avg(saleprice) from orders)
order by c.custid
;

-- 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 
--     출판사에서 도서를 구매한 고객의 이름 ??

select name
from orders o, custoemr c, book b
where o.custid=c.custid and o.booklikd=b.bookid
and publisher in (select distinct pulisher 
               from orders 0, customer c, book b
               where o.custid=c.custid and o.bookid=b.bookid
               and name='박지성' )
    and name <> '박지성';        
            


-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select o.custid, name, count(distinct publisher)
from orders o, customer c, book b
where o.custiid=c.custid and 0.bookid=b.bookid
group by o.custid, name
having count (distinct pulisher) >1
;