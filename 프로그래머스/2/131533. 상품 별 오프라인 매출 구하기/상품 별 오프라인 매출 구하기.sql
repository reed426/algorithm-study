-- 코드를 입력하세요
SELECT a.product_code, sum(a.price*b.sales_amount) as sales
from product a right outer join offline_sale b
on a.product_id = b.product_id
group by a.product_code 
order by sales Desc ,a.product_code ASC

