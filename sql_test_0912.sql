use infinite;
#creating table:-
create table salesman(
salesman_id integer primary key,
 name varchar(20),
 city varchar(20),
 commission double);
create table customer(
customer_id integer primary key,
 customer_name varchar(20),
 city varchar(20),
 grade integer,
 salesman_id integer,
 foreign key(salesman_id) references salesman(salesman_id));
 create table order2(
 order_no integer primary key,
 purchase_amt double,
 order_date date,
 customer_id integer,
 salesman_id integer,
 foreign key(salesman_id) references salesman(salesman_id),
 foreign key(customer_id) references customer(customer_id)
 );
 
 #inserting in the tables--
 
 insert into salesman(salesman_id,name,city,commission) values
 (5001,'James Hoog','New York',0.15),
 (5002,'Nail Knite','Paris',0.13),
 (5005,'Pit Ales','London',0.11),
 (5006,'Mc Lyon','Paris',0.14),
 (5003,'Lauson Hen',null,0.12),
 (5007,'Paul Adan', 'Rome',0.13);
 
 select * from salesman;
 
 insert into customer(customer_id,customer_name,city,grade,salesman_id) values
 (3002,'Nick Rimando','New York',100,5001),
 (3005,'Graham Zusi','California',200,5002),
 (3001,'Brad Guzan','London',null,null),
 (3004,'Fabian Johns','Paris',300,5006),
 (3007,'Brad Davis','New York',300,5006),
 (3009,'Geoff Camero','Berlin',100,null),
 (3008,'Jullian Green','London',300,5002),
 (3003,'Jozy Altidor','Moncow',200,5007);
 
  select * from customer;
  
  insert into order2(order_no,purchase_amt,order_date,customer_id,salesman_id) values
  (70001,150.5,20161005,3005,5002),
  (70009,270.65,20160910,3001,null),
  (70002,65.26,20161005,3002,5001),
  (70004,110.5,20160817,3009,null),
  (70007,948.5,20160910,3005,5002),
  (70005,2400.6,20160727,3007,5001),
  (70008,5760,20160910,3002,5001),
  (70010,1983.43,20161010,3004,5006),
  (70003,2480.4,20161010,3009,null),
  (70012,250.45,20160627,3008,5002),
  (70011,75.29,20160817,3003,5007)
  ;
  set sql_safe_updates=0;
 update customer set grade =' ' where grade= null;
 #2. Display name and commission of all the salesmen.
 select name,commission from salesman;
 
 #3. Retrieve salesman id of all salesmen from orders table without any repeats.
 select salesman_id from order2 where salesman_id in(select salesman_id from salesman) group by salesman_id;
 
 #4. Display names and city of salesman, who belongs to the city of Paris.
select name,city from salesman where city='Paris';

#5. Display all the information for those customers with a grade of 200
select * from customer where grade=200;

#6. Display the order number, order date and the purchase amount for 
#   order(s) which will be delivered by the salesman with ID 5001.
select order_no, order_date, purchase_amt from order2 where salesman_id=5001;

#7. Display all the customers, who are either belongs to the city New York or 
#    not had a grade above 100.
select * from customer where city='New York' or grade<=100;

#8. Find those salesmen with all information who gets the commission 
#    within a range of 0.12 and 0.14.
select * from salesman where commission between 0.12 and 0.14;

#9. Find all those customers with all information whose names are ending 
#    with the letter 'n'.
select * from customer where customer_name like '%n';

#10. Find those salesmen with all information whose name containing the 
#    1st character is 'N' and the 4th character is 'l' and rests may be any character.

select * from salesman where name like 'N__l%';

#11. Find that customer with all information who does not get any grade except NULL
select * from customer where grade is null;

#12. Find the total purchase amount of all orders.

select sum(purchase_amt) from order2;

#13. Find the third highest grade for each of the cities of the customers.

select * from  customer where grade = (select max(grade) from customer );


