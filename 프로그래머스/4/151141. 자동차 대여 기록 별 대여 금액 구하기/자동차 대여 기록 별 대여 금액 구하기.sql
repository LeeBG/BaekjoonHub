SELECT 
    h.HISTORY_ID,
    CASE 
        WHEN h.END_DATE - h.START_DATE + 1 >= 90 THEN 
            ROUND((h.END_DATE - h.START_DATE + 1) * c.DAILY_FEE *
            (SELECT (100 - DISCOUNT_RATE) / 100
             FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
             WHERE CAR_TYPE = '트럭' AND DURATION_TYPE = '90일 이상'), 2)
                  
        WHEN h.END_DATE - h.START_DATE + 1 >= 30 THEN 
            ROUND((h.END_DATE - h.START_DATE + 1) * c.DAILY_FEE * 
            (SELECT (100 - DISCOUNT_RATE) / 100
             FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
             WHERE CAR_TYPE = '트럭' AND DURATION_TYPE = '30일 이상'), 2)
                  
        WHEN h.END_DATE - h.START_DATE + 1 >= 7 THEN 
            ROUND((h.END_DATE - h.START_DATE + 1) * c.DAILY_FEE *
            (SELECT (100 - DISCOUNT_RATE) / 100
             FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
             WHERE CAR_TYPE = '트럭' AND DURATION_TYPE = '7일 이상'), 2)
        ELSE 
            c.DAILY_FEE * (h.END_DATE - h.START_DATE + 1)
    END AS FEE
FROM 
    CAR_RENTAL_COMPANY_CAR c 
JOIN 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY h ON c.CAR_ID = h.CAR_ID
WHERE 
    c.CAR_TYPE = '트럭'
ORDER BY 
    FEE DESC, h.HISTORY_ID DESC;