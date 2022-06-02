-- CALENDARIO ACADEMICO --
insert into calendario_academico
	(fechaInicio, fechaFin, concepto, url) values (STR_TO_DATE('1-01-2012', '%d-%m-%Y'),STR_TO_DATE('1-01-2012', '%d-%m-%Y'),'este es el concepto para las fechas indicadas','');

-- GRADUADOS --
insert into graduados
	(nombre_completo, url) values ('graduado 10', '');

-- TRABAJOS FINALES --
insert into trabajos_finales
	(titulo, estudiantes, demandante, directores, is_concluido, url) values ('Titulo de trabajo final 11', 'estudiante 11', 'demandante 11', 'director 21 y director 22', 'Y', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245');
