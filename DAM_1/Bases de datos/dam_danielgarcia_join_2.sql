SELECT
    title
FROM movie

JOIN actor ON movie.id = casting.movieid
JOIN actor ON actor.id = casting.actorid
WHERE actor.name = 'Harrinson Ford';



SELECT
    title
FROM movie

JOIN casting ON movie.id = casting.movieid
JOIN actor ON actor.id = casting.actorid
WHERE actor.name = 'Harrinson Ford' AND ord!=1;



SELECT
    *
FROM movie

JOIN casting ON movie.id = casting.movieid
JOIN actor ON actor.id = casting.actorid
WHERE movie.yr = 1962 AND casting.ord=1;



SELECT
    yr,
    count(title)
        AS 'n. peliculas'
FROM movie

JOIN casting ON movie.id = casting.movieid
JOIN actor ON actor.id = casting.actorid
WHERE actor.name = 'Harrinson Ford' HAVING count(title) > 1;