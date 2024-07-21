SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, ROUND(AVG(r.review_score),2) as score
FROM REST_INFO i 
JOIN REST_REVIEW r
ON i.rest_id = r.rest_id
where i.address like '서울%'
GROUP BY i.rest_id, i.rest_name, i.food_type, i.favorites, i.address
ORDER BY score desc, i.favorites desc;