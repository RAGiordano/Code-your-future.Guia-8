-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT Nombre
FROM jugadores
ORDER BY Nombre ASC;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente.
SELECT Nombre
FROM jugadores
WHERE Posicion = 'C' AND Peso > 200
ORDER BY Nombre ASC;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT Nombre
FROM equipos
ORDER BY Nombre;

-- 4. Mostrar el nombre de los equipos del este (East).
SELECT Nombre
FROM equipos
WHERE Conferencia = 'East'
ORDER BY Nombre;

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT *
FROM equipos
WHERE ciudad Like 'c%'
ORDER BY Nombre;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT *
FROM jugadores j LEFT JOIN equipos e ON j.Nombre_Equipo = e.Nombre
ORDER BY e.Nombre, j.Nombre;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT j.Nombre AS 'Nombre del jugador', j.Nombre_equipo AS 'Equipo'
FROM equipos e LEFT JOIN jugadores j ON e.Nombre = j.Nombre_equipo
WHERE j.Nombre_equipo = 'Raptors'
ORDER BY j.Nombre;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT j.Nombre AS 'Nombre del jugador', e.temporada AS 'Temporada', e.Puntos_por_partido
FROM jugadores j LEFT JOIN estadisticas e ON j.codigo = e.jugador
WHERE j.Nombre = 'Pau Gasol';


-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT j.Nombre AS 'Nombre del jugador', e.temporada AS 'Temporada', e.Puntos_por_partido
FROM jugadores j
LEFT JOIN estadisticas e ON j.codigo = e.jugador
WHERE j.Nombre = 'Pau Gasol'
AND e.temporada = '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.

SELECT Nombre_del_jugador, SUM(Puntos_totales) AS 'Total de puntos'
FROM (
	SELECT j.Nombre Nombre_del_jugador, e.Puntos_por_partido, p.temporada, COUNT(p.codigo) AS 'Partidos', e.Puntos_por_partido * COUNT(p.codigo) Puntos_totales
	FROM jugadores j 
	INNER JOIN estadisticas e ON j.codigo = e.jugador
	INNER JOIN equipos eq ON eq.Nombre = j.Nombre_equipo
	INNER JOIN partidos p ON (p.equipo_visitante = j.Nombre_equipo
						OR p.equipo_local = j.Nombre_equipo)
						AND (p.temporada = e.temporada)
	GROUP BY p.temporada, j.codigo) AS Subconsulta
GROUP BY Nombre_del_jugador
ORDER BY Nombre_del_jugador;

-- SELECT j.Nombre AS 'Nombre del jugador', e.Puntos_por_partido, p.temporada, COUNT(p.codigo) AS 'Partidos', e.Puntos_por_partido * COUNT(p.codigo) AS 'Puntos totales'
-- FROM jugadores j 
-- INNER JOIN estadisticas e ON j.codigo = e.jugador
-- INNER JOIN equipos eq ON eq.Nombre = j.Nombre_equipo
-- INNER JOIN partidos p ON (p.equipo_visitante = j.Nombre_equipo
-- 					OR p.equipo_local = j.Nombre_equipo)
--                     AND (p.temporada = e.temporada)
-- GROUP BY p.temporada, j.codigo
-- ORDER BY j.Nombre, e.temporada;




-- SELECT p.temporada, e.nombre, COUNT(p.codigo)
-- FROM partidos p
-- INNER JOIN equipos e ON (p.equipo_visitante = e.Nombre
-- 					OR p.equipo_local = e.Nombre)
-- GROUP BY p.temporada, e.nombre;



-- 11. Mostrar el número de jugadores de cada equipo
SELECT e.Nombre AS 'Equipo', COUNT(j.codigo) AS 'Número de jugadores'
FROM equipos e
LEFT JOIN jugadores j ON e.Nombre = j.Nombre_equipo
GROUP BY e.Nombre
ORDER BY e.Nombre, j.Nombre;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT Nombre_del_jugador, SUM(Puntos_totales) AS 'Total de puntos'
FROM (
	SELECT j.Nombre Nombre_del_jugador, e.Puntos_por_partido, p.temporada, COUNT(p.codigo) AS 'Partidos', e.Puntos_por_partido * COUNT(p.codigo) Puntos_totales
	FROM jugadores j 
	INNER JOIN estadisticas e ON j.codigo = e.jugador
	INNER JOIN equipos eq ON eq.Nombre = j.Nombre_equipo
	INNER JOIN partidos p ON (p.equipo_visitante = j.Nombre_equipo
						OR p.equipo_local = j.Nombre_equipo)
						AND (p.temporada = e.temporada)
	GROUP BY p.temporada, j.codigo) AS Subconsulta
GROUP BY Nombre_del_jugador
ORDER BY SUM(Puntos_totales) DESC
LIMIT 1;


-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
-- diferencia de puntos.
-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
-- equipo_ganador), en caso de empate sera null.