SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE (NAME like '%el%' or NAME like '%El%')and ANIMAL_TYPE='Dog'
order by name