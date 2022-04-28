-- Activity 1
CREATE TABLE Salesman
(
salesman_id int,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);

describe Salesman;

--Activity 2
insert into Salesman (salesman_id,salesman_name,salesman_city,commission) values ('5001', 'James Hoog', 'New York', '15');
insert into Salesman (salesman_id,salesman_name,salesman_city,commission) values ('5002', 'Nail Knite', 'Paris', '13');
insert into Salesman values ('5005', 'Pit Alex', 'London', '11');
insert into Salesman values ('5006', 'McLyon', 'Paris', '14');
insert into Salesman (salesman_id,salesman_name,salesman_city,commission) values ('5007','Paul Adam','Rome','13');

insert into Salesman values ('5003', 'Lauson Hen', 'San Jose', '12');
select 1 from dual; 

select * from Salesman;

--Activity 3
select salesman_id,salesman_city from Salesman;
select * from Salesman where salesman_city='Paris';
select salesman_id, commission from Salesman where salesman_name='Paul Adam';

--Activity 4

alter table Salesman add Grade int;
update Salesman set Grade=100;
select * from Salesman;

-- Activity 5
update Salesman set Grade=200 where SALESMAN_CITY='Rome';
update Salesman set Grade=300 where SALESMAN_name='James Hoog';
update Salesman set Salesman_name='Pierre' where SALESMAN_name='McLyon';
select * from Salesman;

--Activity 6
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;


select distinct salesman_id from Orders;
select order_no,order_date from Orders order by order_date asc;
select order_no,purchase_amount from Orders order by purchase_amount desc;
select * from Orders where purchase_amount<500;
select * from Orders where purchase_amount>1000 and purchase_amount<2000;
select * from Orders where purchase_amount between 1000 and 2000;

--Activity 7

select sum(purchase_amount) Total from Orders;
select Round(Avg(purchase_amount),0) Average from orders;
select max(purchase_amount) Maximum from orders;
select min(purchase_amount) Minimum from orders;
select count(salesman_id) Headcount from orders;

--Activity 8
select customer_id, max(purchase_amount) from orders group by customer_id;
select salesman_id, order_date, max(purchase_amount) from orders where order_date=To_Date('2012/08/17','YYYY/MM/DD') group by salesman_id,order_date;
select customer_id, order_date, max(purchase_amount) from orders group by customer_id, order_date having max(purchase_amount) in (2030,  3450, 5760, 6000);

--Activity 9

select c.customer_id, c.customer_name, c.city, s.salesman_name from customers c inner join salesman s on c.salesman_id=s.salesman_id;
select a.customer_id, a.customer_name, a.grade,b.salesman_id,b.salesman_name from customers a left outer join salesman b on a.salesman_id = b.salesman_id where a.grade<300 order by a.customer_id;
select a.customer_id, a.customer_name, b.salesman_id,b.salesman_name, b.salesman_city,b.commission from customers a right join salesman b on a.salesman_id = b.salesman_id where b.commission>12 order by b.salesman_id;
select o.order_no,o.order_date, o.purchase_amount, c.customer_id, c.customer_name, s.salesman_id, s.salesman_name, s.commission 
from orders o inner join customers c 
on o.customer_id=c.customer_id inner join salesman s 
on c.salesman_id=s.salesman_id order by o.order_no; 

--Activity 10
select * from orders where salesman_id in (select distinct salesman_id from orders where customer_id=3007);
select * from orders where salesman_id in (select distinct salesman_id from salesman where salesman_city='New York');
select grade, count(*) as Count from customers group by grade having grade > (select avg(grade) from customers where city='New York');
select * from orders where salesman_id = (select salesman_id from salesman where commission in (select max(commission) from salesman));

--Activity 11
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);
