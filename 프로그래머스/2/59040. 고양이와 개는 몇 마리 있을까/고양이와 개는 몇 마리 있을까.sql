-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(ANIMAL_ID) as COUNT
FROM ANIMAL_INS
WHERE (ANIMAL_TYPE) in ('CAT','DOG')
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE;