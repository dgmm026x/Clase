SELECT
    matchid,
    player
FROM goal 

WHERE teamid LIKE 'GER'


SELECT
    id,
    stadium,
    team1,
    team2
FROM game WHERE id LIKE '1012'


SELECT
    player,
    teamid,
    stadium,
    mdate
FROM game
JOIN goal ON (id=matchid AND teamid='GER')


SELECT
    team1,
    team2,
    player
FROM game
JOIN goal ON (game.id=goal.matchid) AND player LIKE 'Mario%'