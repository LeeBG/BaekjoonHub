SELECT COUNT(ID) as FISH_COUNT, FISH_NAME
    FROM FISH_INFO f
    JOIN FISH_NAME_INFO n
    ON f.FISH_TYPE = n.FISH_TYPE
GROUP BY FISH_NAME
ORDER BY FISH_COUNT DESC;