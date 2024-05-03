with cte as (
    SELECT i.ITEM_ID, i.ITEM_NAME, i.RARITY, t.PARENT_ITEM_ID
    FROM ITEM_INFO i
    LEFT JOIN ITEM_TREE t
    ON i.ITEM_ID = t.PARENT_ITEM_ID
)

SELECT item_id, item_name, rarity
FROM cte
WHERE parent_item_id is null
order by ITEM_ID desc;

