# Write your MySQL query statement below
SELECT Product.Product_name, Sales.year, Sales.price
FROM Sales
JOIN Product
ON Sales.product_id = Product.product_id;
