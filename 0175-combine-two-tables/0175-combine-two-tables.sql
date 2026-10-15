# Write your MySQL query statement below
select P.firstName,P.lastName,A.City,A.state FROM Person P
LEFT JOIN Address A ON P.PersonId= A.PersonId;
