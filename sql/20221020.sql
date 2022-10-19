
select * from dept;

desc dept;
commit;

insert into dept values (50, '개발', '서울');

update dept set dname ='기획', loc='제주'  where deptno=50;

delete from dept where deptno = 50;

rollback;