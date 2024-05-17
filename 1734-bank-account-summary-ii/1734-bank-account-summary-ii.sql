# Write your MySQL query statement below
select Users.name ,a1.balance from
Users join (select  account,sum(amount) as balance from Transactions 
  group by  account) a1
 on Users.account=a1.account where a1.balance>10000;

