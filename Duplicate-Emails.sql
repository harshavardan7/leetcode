# Write your MySQL query statement below
select email as EMAIL
FROM Person
group by email
having count(email)>1
order by email