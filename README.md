## Falta hacer (TP6)
La idea es que cuando arranca el sistema se calcula una purga. Podemos suponer que nuestro equivalente es que el carnicero tiene que buscar más carne.
* Hay que agregar tres columnas: RND, tiempo para purgar, tiempo donde purga (tiempo actual+tiempo para purgar).
* Entonces toma el RND, si es > 0,50 purga a 100% (buscamos en la tabla de la simulación continua cuando sobrepasa el 100%), si es > 0,30 purga a 70% y > 0,20 purga al 50%.
* Cuando llega el momento de la purga, el carnicero se bloquea y vuelve a los 10 minutos y sigue atendiendo (ahí se calcula la próxima purga).
