SELECT 
    YEAR(ed.differentiation_date) AS year, 
    yearly_max.max_size - ed.size_of_colony AS year_dev, 
    ed.id
FROM 
    ecoli_data ed
JOIN 
    (SELECT 
         YEAR(differentiation_date) AS year, 
         MAX(size_of_colony) AS max_size
     FROM 
         ecoli_data
     GROUP BY 
         YEAR(differentiation_date)) AS yearly_max
ON 
    YEAR(ed.differentiation_date) = yearly_max.year
GROUP BY
    YEAR(ed.differentiation_date), yearly_max.max_size - ed.size_of_colony, ed.id
ORDER BY year, year_dev;