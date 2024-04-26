SELECT ROUTE,
    CONCAT(ROUND(SUM(D_BETWEEN_DIST),1),'km') as TOTAL_DISTANCE,
    CONCAT(ROUND(AVG(D_BETWEEN_DIST),2),'km') as AVERAGE_DISTANCE
    FROM SUBWAY_DISTANCE
    GROUP BY ROUTE
    ORDER BY ROUND(SUM(D_BETWEEN_DIST),1) desc;