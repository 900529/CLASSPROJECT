-- Jon & Sub Query 과제 

-- 5. 박지성이 구매한 도서의 출판사 수
select 


-- 6. 박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격의 차이



-- 7. 박지성이 구매하지 않은 도서의 이름



-- 8. 주문하지 않은 고객의 이름 (부속질의사용)



-- 9. 주문금액의 총액과 주문의 평균금액



-- 10. 고객의 이름과 고객별 구매액
select name (
 select name from customer c where c.custid=o.custid
)as name, 
sum(saleprice) 
from orders o
;

-- 11. 고객의 이름과 고객이 구매한 도서 목록



-- 12. 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문




-- 13. 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select name
from customer
where saleprice > ( select avg(saleprice)from orders )
;
   