-- INTEGRADOR

-- CANDADO A
-- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT COUNT(*) AS 'Veces que se logró el máximo de asistencias por partido'
FROM estadisticas e
WHERE e.Asistencias_por_partido = (SELECT MAX(e.Asistencias_por_partido) FROM estadisticas e);

-- Resultado: 2



-- Clave: La clave del candado A estará conformada por la/s siguientes consulta/s a la base de
-- datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
-- centro o esté comprendida en otras posiciones.


SELECT * FROM equipos;

SELECT SUM(j.Peso)
FROM jugadores j, equipos e
WHERE j.Nombre_equipo = e.nombre
AND e.Conferencia = 'East'
AND j.Posicion LIKE '%C%';

-- Respuesta: 14043


-- CANDADO B
-- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
-- jugadores que tiene el equipo Heat.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT COUNT(j.codigo)
FROM jugadores j
INNER JOIN estadisticas e ON e.jugador = j.codigo
WHERE e.Asistencias_por_partido >
	(SELECT COUNT(*)
    FROM equipos e
    INNER JOIN jugadores j ON e.Nombre = j.Nombre_equipo
    WHERE e.Nombre = 'Heat'
    );
    
-- Respuesta: 3




-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.

SELECT * FROM partidos;

SELECT COUNT(p.codigo)
FROM partidos p
WHERE p.temporada LIKE '%99%';


-- CANDADO C
-- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
-- parte de equipos de la conferencia oeste.

SELECT * FROM jugadores;

SELECT COUNT(j.codigo)
FROM jugadores j
LEFT JOIN equipos e ON j.Nombre_equipo = e.Nombre
WHERE j.Procedencia = 'Michigan'
AND e.Conferencia = 'West';

-- Resultado: 2

-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
-- 195, y a eso le vamos a sumar 0.9945.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT COUNT(j.codigo)
FROM jugadores j
WHERE j.Peso >= 195;

-- Resultado = 362

-- 2 / 362 + 0.9945 = 1 (Resultado final / posición del candado)



-- Clave: La clave del candado B estará conformada por la/s siguientes consulta/s a la base de
-- datos:
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
-- sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
-- tapones por partido. Además, este resultado debe ser, donde la división sea central.

SELECT * FROM equipos;

SELECT AVG(e.Puntos_por_partido) + COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)
FROM estadisticas e
INNER JOIN jugadores j ON e.jugador = j.codigo
INNER JOIN equipos eq ON j.Nombre_equipo = eq.Nombre
WHERE eq.Division = 'Central';

-- CANDADO D
-- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
-- resultado debe ser redondeado. Nota: el resultado debe estar redondeado
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT e.Tapones_por_partido
FROM estadisticas e
INNER JOIN jugadores j ON e.jugador = j.codigo
WHERE j.Nombre = 'Corey Maggette'
AND e.temporada = '00/01';

-- Respuesta: 4

-- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
-- de todos los jugadores de procedencia argentina.

SELECT SUM(e.Puntos_por_partido)
FROM estadisticas e
INNER JOIN jugadores j ON e.jugador = j.codigo
WHERE j.Procedencia = 'Argentina';

-- Respuesta: 191