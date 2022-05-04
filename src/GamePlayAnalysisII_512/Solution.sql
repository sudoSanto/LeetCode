with dates_CTE (player_id, event_date) as
(select distinct a.player_id,
(select top 1 a2.event_date a2 from Activity a2 where a2.player_id = a.player_id order by 1 asc) as first_login
from Activity a)

select a.player_id, a.device_id
from Activity a
join dates_CTE d on a.player_id = d.player_id and a.event_date = d.event_date