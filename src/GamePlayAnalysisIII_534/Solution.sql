select a.player_id, a.event_date,
    sum(a2.games_played) as games_played_so_far
from Activity a join Activity a2 on a.player_id = a2.player_id and a2.event_date <= a.event_date
group by a.player_id, a.event_date
