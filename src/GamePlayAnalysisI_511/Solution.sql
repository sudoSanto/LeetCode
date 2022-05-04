select distinct a.player_id,
(select top 1 a2.event_date a2 from Activity a2 where a2.player_id = a.player_id order by 1 asc) as first_login
from Activity a
