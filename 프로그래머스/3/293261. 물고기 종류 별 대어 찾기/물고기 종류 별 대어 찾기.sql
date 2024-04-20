
SELECT i.ID, f.FISH_NAME, i.LENGTH
    FROM FISH_INFO i, FISH_NAME_INFO f
    where f.FISH_TYPE = i.FISH_TYPE AND (i.FISH_TYPE,LENGTH) in (
        SELECT FISH_TYPE, MAX(LENGTH)
        FROM FISH_INFO a
        GROUP BY FISH_TYPE
    )
    ORDER BY i.ID ASC;


