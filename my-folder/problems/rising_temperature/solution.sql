# Write your MySQL query statement below
SELECT w2.id
FROM weather w1
join weather w2
ON DATEDIFF(w1.recordDate,w2.recordDate)=-1
AND w2.temperature>w1.temperature;