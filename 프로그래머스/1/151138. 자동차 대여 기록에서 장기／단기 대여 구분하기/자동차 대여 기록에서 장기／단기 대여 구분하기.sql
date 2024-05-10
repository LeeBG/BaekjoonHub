SELECT HISTORY_ID,CAR_ID,TO_CHAR(START_DATE,'yyyy-mm-dd') as START_DATE,TO_CHAR(END_DATE,'yyyy-mm-dd') as END_DATE,
CASE
    WHEN END_DATE - START_DATE < 29 THEN '단기 대여'
    ELSE '장기 대여'
END as RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE TO_CHAR(START_DATE,'yyyy-MM') = '2022-09'
ORDER BY HISTORY_ID desc