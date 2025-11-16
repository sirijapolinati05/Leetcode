# Write your MySQL query statement below
SELECT w1.id FROM Weather w1, 
Weather w2 Where date_sub(w1.recordDate, interval 1 day) = w2.recordDate and w1.temperature > w2.temperature;
