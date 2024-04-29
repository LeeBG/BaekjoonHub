with cte as (
select
    id,                                     -- id
    rank() over(order by size_of_colony desc) as rnk, -- 대장균 개체의 크기별 내림차순 랭크 
    count(id) over() as total               -- 전체 데이터의 갯수
from ecoli_data)

-- (2) 전체 데이터 갯수 구하기
select 
    id,
    case 
        when rnk <= (total / 4) then 'CRITICAL' -- 25이하인 경우
        when rnk <= (total / 2) then 'HIGH'     -- 50 이하인 경우
        when rnk <= (total / 4 * 3) then 'MEDIUM' -- 75이하인 경우
        else 'LOW'
    end as colony_name
from cte
order by id;