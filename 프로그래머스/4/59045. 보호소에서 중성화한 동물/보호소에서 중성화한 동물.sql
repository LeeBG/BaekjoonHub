SELECT ANIMAL_ID, ANIMAL_TYPE, NAME
FROM ANIMAL_INS
WHERE ANIMAL_ID 
in 
(select i.ANIMAL_ID
   from ANIMAL_INS i, ANIMAL_OUTS o 
   where i.ANIMAL_ID= o.ANIMAL_ID and 
   (i.SEX_UPON_INTAKE like 'Intact%' and (o.SEX_UPON_OUTCOME like 'Spayed%' or o.SEX_UPON_OUTCOME like 'Neutered%')))
order by ANIMAL_ID asc;