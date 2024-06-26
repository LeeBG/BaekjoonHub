WITH COUNT_USER AS (
    SELECT HOST_ID,COUNT(ID) as CNT
    FROM PLACES
    GROUP BY HOST_ID
)
SELECT p.ID,p.NAME,p.HOST_ID
FROM PLACES p JOIN  COUNT_USER c
ON p.HOST_ID = c.HOST_ID and c.CNT >= 2
ORDER BY p.ID;