SELECT animal_type,
case
when name is null then 'No name'
else name
end as name
, SEX_UPON_INTAKE
FROM animal_ins
order by animal_id