SELECT FLAVOR
FROM 
    (SELECT first.FLAVOR, (first.TOTAL_ORDER + second.TOTAL_ORDER) as sum 
    FROM 
        (SELECT FLAVOR, SUM(TOTAL_ORDER) as TOTAL_ORDER
        FROM JULY
        GROUP BY FLAVOR) first
    JOIN FIRST_HALF second
    ON first.FLAVOR = second.FLAVOR
    order by sum desc
)
order by sum desc
fetch next 3 rows only;