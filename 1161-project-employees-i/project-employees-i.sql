# Write your MySQL query statement below
SELECT Project.project_id, ROUND(AVG(Employee.experience_years), 2) AS average_years
FROM Project
JOIN Employee
ON Project.Employee_id = Employee.Employee_id
GROUP BY Project.project_id;
