WITH SCORE as (
    SELECT
    EMP_NO,
    CASE
        WHEN AVG(score) >= 96 THEN 'S'
        WHEN AVG(score) >= 90 THEN 'A'
        WHEN AVG(score) >= 80 THEN 'B'
        ELSE 'C'
    END as grade,
    CASE
        WHEN AVG(score) >= 96 THEN 0.20
        WHEN AVG(score) >= 90 THEN 0.15
        WHEN AVG(score) >= 80 THEN 0.10
        ELSE 0
    END as percent
    FROM HR_GRADE
    GROUP BY EMP_NO
) 
SELECT DISTINCT e.EMP_NO, e.EMP_NAME,s.grade , s.percent * e.SAL as BONUS
    FROM HR_DEPARTMENT d
    JOIN HR_EMPLOYEES e
    ON d.DEPT_ID = e.DEPT_ID
    JOIN SCORE s
    ON e.EMP_NO = s.EMP_NO
ORDER BY e.EMP_NO;