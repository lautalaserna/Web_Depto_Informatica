-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 07-07-2022 a las 00:41:19
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `web_informatica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE `areas` (
  `id_area` int(6) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `areas`
--

INSERT INTO `areas` (`id_area`, `titulo`, `url`) VALUES
(1, 'area 1', ''),
(2, 'area 2', ''),
(3, 'area 3', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignaturas`
--

CREATE TABLE `asignaturas` (
  `id_asignatura` int(6) NOT NULL,
  `codigo` varchar(16) DEFAULT NULL,
  `titulo` varchar(50) DEFAULT NULL,
  `id_area` int(6) NOT NULL,
  `creditos_grado` int(6) NOT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asignaturas`
--

INSERT INTO `asignaturas` (`id_asignatura`, `codigo`, `titulo`, `id_area`, `creditos_grado`, `url`) VALUES
(1, 'FG3', 'Programacion 1', 1, 8, ''),
(2, 'TY5', 'Programacion 2', 1, 8, ''),
(3, 'XZ2', 'Programacion 3', 1, 8, ''),
(4, 'G77', 'Sistemas Distribuidos', 2, 8, NULL),
(5, 'C32', 'Algebra A', 1, 8, NULL),
(6, '376', 'Analisis Matematico B', 1, 8, NULL),
(7, 'K5F', 'Matematica Discreta', 1, 4, NULL),
(8, 'D56', 'Ingenieria Economica', 1, 4, NULL),
(9, 'A1B', 'Sistemas Operativos', 1, 8, NULL),
(10, '3F5', 'Sistemas de Representacion', 1, 6, NULL),
(11, 'RA8', 'Análisis y Diseño de Sistemas 1', 1, 8, NULL),
(12, '638', 'Ing en Videojuegos', 1, 40, NULL),
(13, 'P7N', 'Software Libre', 1, 50, NULL),
(14, 'AC3', 'Base de Datos 2', 1, 60, NULL),
(15, 'B23', 'Base de Datos', 1, 60, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autoridades`
--

CREATE TABLE `autoridades` (
  `id_autoridad` int(6) NOT NULL,
  `director` varchar(255) DEFAULT NULL,
  `vicedirector` varchar(255) DEFAULT NULL,
  `url` varchar(4096) DEFAULT '',
  `img_url_dir` varchar(2048) DEFAULT NULL,
  `img_url_vice` varchar(2048) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `autoridades`
--

INSERT INTO `autoridades` (`id_autoridad`, `director`, `vicedirector`, `url`, `img_url_dir`, `img_url_vice`) VALUES
(1, 'Lic. Carlos Alberto Rico', 'Lic. Valeria Dicrocce', '', 'img/director.png', 'img/vicedirector.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calendario_academico`
--

CREATE TABLE `calendario_academico` (
  `id_calendario_academico` int(6) NOT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `concepto` varchar(4096) DEFAULT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `calendario_academico`
--

INSERT INTO `calendario_academico` (`id_calendario_academico`, `fecha_inicio`, `fecha_fin`, `concepto`, `url`) VALUES
(1, '2012-01-01', '2012-01-01', 'este es el concepto para las fechas indicadas', ''),
(2, '2012-01-02', '2012-01-02', 'este es el concepto para las fechas indicadas', ''),
(3, '2012-01-03', '2012-01-03', 'este es el concepto para las fechas indicadas', ''),
(4, '2012-01-07', '2012-01-07', 'este es el concepto para las fechas indicadas', ''),
(5, '2012-01-04', '2012-01-04', 'este es el concepto para las fechas indicadas', ''),
(6, '2012-01-06', '2012-01-06', 'este es el concepto para las fechas indicadas', ''),
(7, '2012-01-05', '2012-01-05', 'este es el concepto para las fechas indicadas', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargos`
--

CREATE TABLE `cargos` (
  `id_cargo` int(6) NOT NULL,
  `id_asignatura` int(6) NOT NULL,
  `id_tipo_cargo` int(6) NOT NULL,
  `id_dedicacion` int(6) NOT NULL,
  `id_docente` int(6) NOT NULL,
  `clasificacion` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cargos`
--

INSERT INTO `cargos` (`id_cargo`, `id_asignatura`, `id_tipo_cargo`, `id_dedicacion`, `id_docente`, `clasificacion`) VALUES
(1, 1, 1, 1, 1, ''),
(2, 1, 2, 1, 2, ''),
(3, 2, 1, 1, 3, ''),
(4, 2, 3, 1, 4, ''),
(5, 3, 1, 1, 5, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carreras`
--

CREATE TABLE `carreras` (
  `id_carrera` int(6) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `id_tipo_carrera` int(6) NOT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carreras`
--

INSERT INTO `carreras` (`id_carrera`, `titulo`, `id_tipo_carrera`, `url`) VALUES
(1, 'Ingeniería en informática', 1, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consejo_alumnos`
--

CREATE TABLE `consejo_alumnos` (
  `id_consejo_alumnos` int(6) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tipo` char(1) DEFAULT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consejo_alumnos`
--

INSERT INTO `consejo_alumnos` (`id_consejo_alumnos`, `nombre`, `tipo`, `url`) VALUES
(1, 'consejero alumno 1', 'T', NULL),
(2, 'consejero alumno 2', 'T', NULL),
(3, 'consejero alumno 3', 'T', NULL),
(4, 'consejero alumno 4', 'S', NULL),
(5, 'consejero alumno 5', 'S', NULL),
(6, 'consejero alumno 6', 'S', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consejo_departamental`
--

CREATE TABLE `consejo_departamental` (
  `id_consejo_departamental` int(6) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tipo` char(1) DEFAULT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consejo_departamental`
--

INSERT INTO `consejo_departamental` (`id_consejo_departamental`, `nombre`, `tipo`, `url`) VALUES
(1, 'consejero dep 1', 'T', NULL),
(2, 'consejero dep 2', 'T', NULL),
(3, 'consejero dep 3', 'T', NULL),
(4, 'consejero dep 4', 'S', NULL),
(5, 'consejero dep 5', 'S', NULL),
(6, 'consejero dep 6', 'S', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `correlativas`
--

CREATE TABLE `correlativas` (
  `id_correlativa` int(6) NOT NULL,
  `id_asignatura_principal` int(6) NOT NULL,
  `id_asignatura_correlativa` int(6) NOT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `correlativas`
--

INSERT INTO `correlativas` (`id_correlativa`, `id_asignatura_principal`, `id_asignatura_correlativa`, `url`) VALUES
(1, 3, 2, NULL),
(2, 2, 1, NULL),
(3, 2, 7, NULL),
(4, 7, 5, NULL),
(5, 9, 3, NULL),
(6, 12, 3, NULL),
(7, 13, 4, NULL),
(8, 14, 15, NULL),
(9, 14, 11, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dedicacion`
--

CREATE TABLE `dedicacion` (
  `id_dedicacion` int(6) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `dedicacion`
--

INSERT INTO `dedicacion` (`id_dedicacion`, `nombre`) VALUES
(1, 'Completa'),
(2, 'Parcial');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docentes`
--

CREATE TABLE `docentes` (
  `id_docente` int(6) NOT NULL,
  `nombre_completo` varchar(255) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `docentes`
--

INSERT INTO `docentes` (`id_docente`, `nombre_completo`, `dni`, `email`, `titulo`, `img_url`, `url`) VALUES
(1, 'docente1', '1231231', 'docente1@facultad.com', 'Lic.', 'img/user.png', NULL),
(2, 'docente2', '12312318', 'docente2@facultad.com', 'Lic.', 'img/user.png', NULL),
(3, 'docente 3', '1231231', 'docente3@fi.unmdp.edu.ar', 'Ing. en informática', 'img/user.png', ''),
(4, 'docente 2', '2231231', 'docente2@fi.edu', 'Ing.', 'img/user.png', ''),
(5, 'docente 3', '3231231', 'docente3@fi.edu', 'Ing.', 'img/user.png', ''),
(6, 'docente 4', '4231231', 'docente4@fi.edu', 'Ing.', 'img/user.png', ''),
(7, 'docente 5', '5231231', 'docente5@fi.edu', 'Ing.', 'img/user.png', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `elecciones`
--

CREATE TABLE `elecciones` (
  `id_eleccion` int(6) NOT NULL,
  `postulante` varchar(255) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `votos` int(6) NOT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `elecciones`
--

INSERT INTO `elecciones` (`id_eleccion`, `postulante`, `dni`, `votos`, `url`) VALUES
(1, 'postulante 1', '12312312', 10, NULL),
(2, 'postulante 2', '32312312', 22, ''),
(3, 'postulante 3', '45612312', 6, NULL),
(4, 'postulante 4', '22612312', 15, NULL),
(5, 'postulante 5', '11612312', 17, NULL),
(6, 'postulante 6', '13632312', 8, NULL),
(7, 'postulante 7', '33232312', 13, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `graduados`
--

CREATE TABLE `graduados` (
  `id_graduado` int(6) NOT NULL,
  `nombre_completo` varchar(255) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `graduados`
--

INSERT INTO `graduados` (`id_graduado`, `nombre_completo`, `fecha`, `url`) VALUES
(1, 'graduado 1', '2017-06-05', NULL),
(2, 'graduado 2', '2017-07-07', NULL),
(3, 'graduado 3', '2018-08-09', NULL),
(4, 'graduado 4', '2018-04-01', NULL),
(5, 'graduado 5', '2018-08-19', NULL),
(6, 'graduado 6', '2019-09-23', NULL),
(7, 'graduado 7', '2020-04-27', NULL),
(8, 'graduado 8', '2021-05-12', NULL),
(9, 'graduado 9', '2022-05-18', NULL),
(10, 'graduado 10', '2022-05-25', NULL),
(13, 'admin', '2022-01-01', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `investigacion`
--

CREATE TABLE `investigacion` (
  `id_investigacion` int(6) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `integrantes` varchar(2048) DEFAULT NULL,
  `objetivo` varchar(8192) DEFAULT NULL,
  `url` varchar(2048) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `investigacion`
--

INSERT INTO `investigacion` (`id_investigacion`, `titulo`, `integrantes`, `objetivo`, `url`) VALUES
(1, '1 Grupo de Ingenieria en Desarrollos Informáticos GIDI', 'Carlos Alberto Rico (Director) - Genin Fernando (Vicedirector) - Stella Massa', 'Intervenir en la confección, actualización y dictado de curriculas de materias optativas y/u obligatorias para satisfacer la demanda creciente en el área de Informática de las actuales y futuras carreras de grado y posgrado de la Facultad.', 'http://www3.fi.mdp.edu.ar/informatica/'),
(2, '2 Grupo de Ingenieria en Desarrollos Informáticos GIDI', 'Carlos Alberto Rico (Director) - Genin Fernando (Vicedirector) - Stella Massa', 'Intervenir en la confección, actualización y dictado de curriculas de materias optativas y/u obligatorias para satisfacer la demanda creciente en el área de Informática de las actuales y futuras carreras de grado y posgrado de la Facultad.', 'http://www3.fi.mdp.edu.ar/informatica/'),
(3, '3 Grupo de Ingenieria en Desarrollos Informáticos GIDI', 'Carlos Alberto Rico (Director) - Genin Fernando (Vicedirector) - Stella Massa', 'Intervenir en la confección, actualización y dictado de curriculas de materias optativas y/u obligatorias para satisfacer la demanda creciente en el área de Informática de las actuales y futuras carreras de grado y posgrado de la Facultad.', 'http://www3.fi.mdp.edu.ar/informatica/');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `novedades`
--

CREATE TABLE `novedades` (
  `id_novedad` int(6) NOT NULL,
  `fecha` date DEFAULT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `info` varchar(2048) DEFAULT NULL,
  `contenido` varchar(8192) DEFAULT NULL,
  `url` varchar(4096) DEFAULT '',
  `is_bolsa_trabajo` char(1) NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `novedades`
--

INSERT INTO `novedades` (`id_novedad`, `fecha`, `imgurl`, `titulo`, `info`, `contenido`, `url`, `is_bolsa_trabajo`) VALUES
(1, '2017-01-05', 'img/noticia.png', 'Titulo de noticia', 'Esta es una breve descripcion que tendra la noticia para mostrarse antes de apliarla, a modo de resumen general del contenido de la noticia', 'What is Lorem Ipsum?\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', '', 'N'),
(2, '2019-05-17', 'img/noticia.png', 'Titulo de otra noticia', 'Esta es una breve descripcion que tendra la noticia para mostrarse antes de apliarla, a modo de resumen general del contenido de la noticia', 'What is Lorem Ipsum?\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', '', 'N'),
(3, '2020-11-23', 'img/noticia.png', 'Titulo de otra noticia mas', 'Esta es una breve descripcion que tendra la noticia para mostrarse antes de apliarla, a modo de resumen general del contenido de la noticia', 'What is Lorem Ipsum?\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', '', 'N'),
(4, '2020-11-23', 'img/noticia.png', 'Titulo de trabajo 1', 'Esta es una breve descripcion que tendra la noticia para mostrarse antes de apliarla, a modo de resumen general del contenido de la noticia', 'What is Lorem Ipsum?\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', '', 'Y'),
(5, '2020-11-27', 'img/noticia.png', 'Titulo de trabajo 2', 'Esta es una breve descripcion que tendra la noticia para mostrarse antes de apliarla, a modo de resumen general del contenido de la noticia', 'What is Lorem Ipsum?\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', '', 'Y'),
(6, '2020-12-30', 'img/noticia.png', 'Titulo de trabajo 3', 'Esta es una breve descripcion que tendra la noticia para mostrarse antes de apliarla, a modo de resumen general del contenido de la noticia', 'What is Lorem Ipsum?\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', '', 'Y');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `optativas`
--

CREATE TABLE `optativas` (
  `id_optativa` int(6) NOT NULL,
  `id_plan_estudio` int(6) NOT NULL,
  `id_asignatura` int(6) NOT NULL,
  `cuatrimestre` int(1) NOT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `optativas`
--

INSERT INTO `optativas` (`id_optativa`, `id_plan_estudio`, `id_asignatura`, `cuatrimestre`, `url`) VALUES
(1, 1, 12, 1, NULL),
(2, 1, 13, 2, NULL),
(3, 1, 14, 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plan_estudio`
--

CREATE TABLE `plan_estudio` (
  `id_plan_estudio` int(6) NOT NULL,
  `id_carrera` int(6) NOT NULL,
  `id_asignatura` int(6) NOT NULL,
  `anio` int(4) NOT NULL,
  `cuatrimestre` int(1) NOT NULL,
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `plan_estudio`
--

INSERT INTO `plan_estudio` (`id_plan_estudio`, `id_carrera`, `id_asignatura`, `anio`, `cuatrimestre`, `url`) VALUES
(1, 1, 1, 1, 1, NULL),
(2, 1, 2, 2, 2, NULL),
(3, 1, 3, 3, 1, NULL),
(4, 1, 4, 4, 2, NULL),
(5, 1, 5, 1, 1, NULL),
(6, 1, 6, 1, 2, NULL),
(7, 1, 7, 2, 1, NULL),
(8, 1, 8, 4, 1, NULL),
(9, 1, 9, 4, 1, NULL),
(10, 1, 10, 3, 1, NULL),
(11, 1, 11, 3, 2, NULL),
(12, 1, 15, 4, 2, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pps`
--

CREATE TABLE `pps` (
  `id_pps` int(6) NOT NULL,
  `entidad` varchar(255) DEFAULT NULL,
  `objetivo` varchar(4096) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `presupuesto` float DEFAULT NULL,
  `is_contratacion` char(1) DEFAULT NULL,
  `estado` char(1) DEFAULT NULL,
  `url` varchar(2048) DEFAULT '',
  `estudiantes` varchar(4096) DEFAULT '',
  `tutores` varchar(2048) DEFAULT NULL,
  `lugar` varchar(512) DEFAULT NULL,
  `is_pdts` char(1) DEFAULT NULL,
  `is_pps` char(1) DEFAULT NULL,
  `is_psc` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pps`
--

INSERT INTO `pps` (`id_pps`, `entidad`, `objetivo`, `fecha_inicio`, `fecha_fin`, `presupuesto`, `is_contratacion`, `estado`, `url`, `estudiantes`, `tutores`, `lugar`, `is_pdts`, `is_pps`, `is_psc`) VALUES
(1, 'primera entidad', 'objetivo de la practica profesional', '2022-06-20', '2022-11-23', 300000, 'N', 'D', '', '', '', '', 'N', 'N', 'N'),
(2, 'segunda entidad', 'otro objetivo de la practica profesional', '2022-05-19', '2022-10-24', 350000, 'Y', 'D', '', '', '', '', 'N', 'N', 'N'),
(3, 'tercera entidad', 'otro objetivo mas de la practica profesional', '2022-05-19', '2022-10-24', 360000, 'Y', 'C', '', 'Estudiante 1', 'Tutor 1', 'Lugar 1', 'N', 'N', 'N'),
(4, 'cuarta entidad', 'otro objetivo de la practica profesional', '2022-03-01', '2022-09-11', 450000, 'N', 'C', '', 'Estudiante 1, Estudiante 2, Estudiante 3', 'Tutor 1, Tutor 2', 'Lugar 2', 'N', 'N', 'N'),
(5, 'quinta entidad', 'objetivo de la practica profesional', '2022-01-01', '2022-05-13', 125000, 'N', 'F', '', 'Estudiante 4, Estudiante 5, Estudiante 6', 'Tutor 3, Tutor 4', 'Lugar 3', 'N', 'N', 'N'),
(6, 'sexta entidad', 'objetivo 2 de la practica profesional', '2022-02-02', '2022-05-14', 126000, 'N', 'F', '', 'Estudiante 7, Estudiante 8', 'Tutor 5, Tutor 6', 'Lugar 4', 'N', 'N', 'N');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id_rol` int(6) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `rol` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id_rol`, `id_usuario`, `rol`) VALUES
(1, 2, 'graduados'),
(2, 2, 'elecciones'),
(3, 1, 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_cargo`
--

CREATE TABLE `tipo_cargo` (
  `id_tipo_cargo` int(6) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_cargo`
--

INSERT INTO `tipo_cargo` (`id_tipo_cargo`, `nombre`) VALUES
(1, 'Titular'),
(2, 'Suplente'),
(3, 'JTP');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_carrera`
--

CREATE TABLE `tipo_carrera` (
  `id_tipo_carrera` int(6) NOT NULL,
  `url` varchar(4096) DEFAULT '',
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_carrera`
--

INSERT INTO `tipo_carrera` (`id_tipo_carrera`, `url`, `nombre`) VALUES
(1, '', 'ingenieria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajos_finales`
--

CREATE TABLE `trabajos_finales` (
  `id_trabajo_final` int(6) NOT NULL,
  `titulo` varchar(2048) DEFAULT NULL,
  `estudiantes` varchar(4096) DEFAULT NULL,
  `demandante` varchar(2048) DEFAULT NULL,
  `directores` varchar(2048) DEFAULT NULL,
  `is_concluido` char(1) DEFAULT 'N',
  `url` varchar(4096) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `trabajos_finales`
--

INSERT INTO `trabajos_finales` (`id_trabajo_final`, `titulo`, `estudiantes`, `demandante`, `directores`, `is_concluido`, `url`) VALUES
(1, 'Titulo de trabajo final 1', 'estudiante 1', 'demandante 1', 'director 1 y director 2', 'Y', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(2, 'Titulo de trabajo final 2', 'estudiante 2', 'demandante 2', 'director 3 y director 4', 'Y', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(3, 'Titulo de trabajo final 3', 'estudiante 3', 'demandante 3', 'director 5 y director 6', 'Y', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(4, 'Titulo de trabajo final 4', 'estudiante 4', 'demandante 4', 'director 7 y director 8', 'Y', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(5, 'Titulo de trabajo final 5', 'estudiante 5', 'demandante 5', 'director 9 y director 10', 'Y', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(6, 'Titulo de trabajo final 6', 'estudiante 6', 'demandante 6', 'director 11 y director 12', 'N', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(7, 'Titulo de trabajo final 7', 'estudiante 7', 'demandante 7', 'director 13 y director 14', 'N', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(8, 'Titulo de trabajo final 8', 'estudiante 8', 'demandante 8', 'director 15 y director 16', 'N', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(9, 'Titulo de trabajo final 9', 'estudiante 9', 'demandante 9', 'director 17 y director 18', 'N', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(10, 'Titulo de trabajo final 10', 'estudiante 10', 'demandante 10', 'director 19 y director 20', 'N', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245'),
(11, 'Titulo de trabajo final 11', 'estudiante 11', 'demandante 11', 'director 21 y director 22', 'Y', 'http://rinfi.fi.mdp.edu.ar/handle/123456789/245');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `roles` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `username`, `password`, `roles`) VALUES
(1, 'admin', '$2a$10$ccoaJ4m65gLiIdGM5Cxt8OOXw2m3zv.RYh8yAeerh6vLBMTWRCWey', 'admin'),
(2, 'test', '$2a$10$BQGZIvFxGWzei6DEGhJhEuF9d/4cQBGLph13Q8KcTh1Vn/kOdTEU.', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vista_correlativas`
--

CREATE TABLE `vista_correlativas` (
  `id_docente` int(11) NOT NULL,
  `asignatura` varchar(255) DEFAULT NULL,
  `id_asignatura` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_docentes`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_docentes` (
`id_docente` int(6)
,`img_url` varchar(255)
,`nombre_completo` varchar(255)
,`email` varchar(255)
,`titulo` varchar(255)
,`asignatura` varchar(50)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_optativas`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_optativas` (
`id_optativa` int(6)
,`asignatura` varchar(50)
,`codigo` varchar(16)
,`creditos_grado` int(6)
,`cuatrimestre` int(1)
,`correlativas` mediumtext
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_plan_estudio`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_plan_estudio` (
`id_plan_estudio` int(6)
,`anio` int(4)
,`cuatrimestre` int(1)
,`asignatura` varchar(50)
,`codigo` varchar(16)
,`creditos_grado` int(6)
,`correlativas` mediumtext
);

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_docentes`
--
DROP TABLE IF EXISTS `vista_docentes`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_docentes`  AS SELECT DISTINCT `d`.`id_docente` AS `id_docente`, `d`.`img_url` AS `img_url`, `d`.`nombre_completo` AS `nombre_completo`, `d`.`email` AS `email`, `d`.`titulo` AS `titulo`, CASE WHEN `c`.`id_tipo_cargo` = 1 THEN `a`.`titulo` ELSE NULL END AS `asignatura` FROM ((`docentes` `d` join `cargos` `c` on(`c`.`id_docente` = `d`.`id_docente`)) join `asignaturas` `a` on(`c`.`id_asignatura` = `a`.`id_asignatura`)) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_optativas`
--
DROP TABLE IF EXISTS `vista_optativas`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_optativas`  AS SELECT `o`.`id_optativa` AS `id_optativa`, `a`.`titulo` AS `asignatura`, `a`.`codigo` AS `codigo`, `a`.`creditos_grado` AS `creditos_grado`, `o`.`cuatrimestre` AS `cuatrimestre`, coalesce(group_concat(`a2`.`titulo` separator ', '),'') AS `correlativas` FROM (((`asignaturas` `a` left join `correlativas` `c` on(`a`.`id_asignatura` = `c`.`id_asignatura_principal`)) left join `asignaturas` `a2` on(`a2`.`id_asignatura` = `c`.`id_asignatura_correlativa`)) join `optativas` `o` on(`a`.`id_asignatura` = `o`.`id_asignatura`)) GROUP BY `a`.`id_asignatura` ORDER BY `a`.`titulo` ASC ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_plan_estudio`
--
DROP TABLE IF EXISTS `vista_plan_estudio`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_plan_estudio`  AS SELECT `pe`.`id_plan_estudio` AS `id_plan_estudio`, `pe`.`anio` AS `anio`, `pe`.`cuatrimestre` AS `cuatrimestre`, `a`.`titulo` AS `asignatura`, `a`.`codigo` AS `codigo`, `a`.`creditos_grado` AS `creditos_grado`, coalesce(group_concat(`a2`.`titulo` separator ', '),'') AS `correlativas` FROM (((`asignaturas` `a` left join `correlativas` `c` on(`a`.`id_asignatura` = `c`.`id_asignatura_principal`)) left join `asignaturas` `a2` on(`a2`.`id_asignatura` = `c`.`id_asignatura_correlativa`)) join `plan_estudio` `pe` on(`pe`.`id_asignatura` = `a`.`id_asignatura`)) GROUP BY `a`.`id_asignatura` ORDER BY `pe`.`anio` ASC, `pe`.`cuatrimestre` ASC, `a`.`titulo` ASC ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `areas`
--
ALTER TABLE `areas`
  ADD PRIMARY KEY (`id_area`);

--
-- Indices de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD PRIMARY KEY (`id_asignatura`),
  ADD KEY `id_area` (`id_area`);

--
-- Indices de la tabla `autoridades`
--
ALTER TABLE `autoridades`
  ADD PRIMARY KEY (`id_autoridad`);

--
-- Indices de la tabla `calendario_academico`
--
ALTER TABLE `calendario_academico`
  ADD PRIMARY KEY (`id_calendario_academico`);

--
-- Indices de la tabla `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`id_cargo`),
  ADD KEY `id_asignatura` (`id_asignatura`),
  ADD KEY `id_tipo_cargo` (`id_tipo_cargo`),
  ADD KEY `id_dedicacion` (`id_dedicacion`),
  ADD KEY `id_docente` (`id_docente`);

--
-- Indices de la tabla `carreras`
--
ALTER TABLE `carreras`
  ADD PRIMARY KEY (`id_carrera`),
  ADD KEY `id_tipo_carrera` (`id_tipo_carrera`);

--
-- Indices de la tabla `consejo_alumnos`
--
ALTER TABLE `consejo_alumnos`
  ADD PRIMARY KEY (`id_consejo_alumnos`);

--
-- Indices de la tabla `consejo_departamental`
--
ALTER TABLE `consejo_departamental`
  ADD PRIMARY KEY (`id_consejo_departamental`);

--
-- Indices de la tabla `correlativas`
--
ALTER TABLE `correlativas`
  ADD PRIMARY KEY (`id_correlativa`),
  ADD KEY `id_asignatura_principal` (`id_asignatura_principal`),
  ADD KEY `id_asignatura_correlativa` (`id_asignatura_correlativa`);

--
-- Indices de la tabla `dedicacion`
--
ALTER TABLE `dedicacion`
  ADD PRIMARY KEY (`id_dedicacion`);

--
-- Indices de la tabla `docentes`
--
ALTER TABLE `docentes`
  ADD PRIMARY KEY (`id_docente`);

--
-- Indices de la tabla `elecciones`
--
ALTER TABLE `elecciones`
  ADD PRIMARY KEY (`id_eleccion`);

--
-- Indices de la tabla `graduados`
--
ALTER TABLE `graduados`
  ADD PRIMARY KEY (`id_graduado`);

--
-- Indices de la tabla `investigacion`
--
ALTER TABLE `investigacion`
  ADD PRIMARY KEY (`id_investigacion`);

--
-- Indices de la tabla `novedades`
--
ALTER TABLE `novedades`
  ADD PRIMARY KEY (`id_novedad`);

--
-- Indices de la tabla `optativas`
--
ALTER TABLE `optativas`
  ADD PRIMARY KEY (`id_optativa`),
  ADD KEY `id_plan_estudio` (`id_plan_estudio`),
  ADD KEY `id_asignatura` (`id_asignatura`);

--
-- Indices de la tabla `plan_estudio`
--
ALTER TABLE `plan_estudio`
  ADD PRIMARY KEY (`id_plan_estudio`),
  ADD KEY `id_carrera` (`id_carrera`),
  ADD KEY `id_asignatura` (`id_asignatura`);

--
-- Indices de la tabla `pps`
--
ALTER TABLE `pps`
  ADD PRIMARY KEY (`id_pps`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id_rol`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `tipo_cargo`
--
ALTER TABLE `tipo_cargo`
  ADD PRIMARY KEY (`id_tipo_cargo`);

--
-- Indices de la tabla `tipo_carrera`
--
ALTER TABLE `tipo_carrera`
  ADD PRIMARY KEY (`id_tipo_carrera`);

--
-- Indices de la tabla `trabajos_finales`
--
ALTER TABLE `trabajos_finales`
  ADD PRIMARY KEY (`id_trabajo_final`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `UKm2dvbwfge291euvmk6vkkocao` (`username`);

--
-- Indices de la tabla `vista_correlativas`
--
ALTER TABLE `vista_correlativas`
  ADD PRIMARY KEY (`id_docente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `areas`
--
ALTER TABLE `areas`
  MODIFY `id_area` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  MODIFY `id_asignatura` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `autoridades`
--
ALTER TABLE `autoridades`
  MODIFY `id_autoridad` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `calendario_academico`
--
ALTER TABLE `calendario_academico`
  MODIFY `id_calendario_academico` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `cargos`
--
ALTER TABLE `cargos`
  MODIFY `id_cargo` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `carreras`
--
ALTER TABLE `carreras`
  MODIFY `id_carrera` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `consejo_alumnos`
--
ALTER TABLE `consejo_alumnos`
  MODIFY `id_consejo_alumnos` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `consejo_departamental`
--
ALTER TABLE `consejo_departamental`
  MODIFY `id_consejo_departamental` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `correlativas`
--
ALTER TABLE `correlativas`
  MODIFY `id_correlativa` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `dedicacion`
--
ALTER TABLE `dedicacion`
  MODIFY `id_dedicacion` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `docentes`
--
ALTER TABLE `docentes`
  MODIFY `id_docente` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `elecciones`
--
ALTER TABLE `elecciones`
  MODIFY `id_eleccion` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `graduados`
--
ALTER TABLE `graduados`
  MODIFY `id_graduado` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `investigacion`
--
ALTER TABLE `investigacion`
  MODIFY `id_investigacion` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `novedades`
--
ALTER TABLE `novedades`
  MODIFY `id_novedad` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `optativas`
--
ALTER TABLE `optativas`
  MODIFY `id_optativa` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `plan_estudio`
--
ALTER TABLE `plan_estudio`
  MODIFY `id_plan_estudio` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `pps`
--
ALTER TABLE `pps`
  MODIFY `id_pps` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `id_rol` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tipo_cargo`
--
ALTER TABLE `tipo_cargo`
  MODIFY `id_tipo_cargo` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tipo_carrera`
--
ALTER TABLE `tipo_carrera`
  MODIFY `id_tipo_carrera` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `trabajos_finales`
--
ALTER TABLE `trabajos_finales`
  MODIFY `id_trabajo_final` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vista_correlativas`
--
ALTER TABLE `vista_correlativas`
  MODIFY `id_docente` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD CONSTRAINT `asignaturas_ibfk_1` FOREIGN KEY (`id_area`) REFERENCES `areas` (`id_area`);

--
-- Filtros para la tabla `cargos`
--
ALTER TABLE `cargos`
  ADD CONSTRAINT `cargos_ibfk_1` FOREIGN KEY (`id_asignatura`) REFERENCES `asignaturas` (`id_asignatura`),
  ADD CONSTRAINT `cargos_ibfk_2` FOREIGN KEY (`id_tipo_cargo`) REFERENCES `tipo_cargo` (`id_tipo_cargo`),
  ADD CONSTRAINT `cargos_ibfk_3` FOREIGN KEY (`id_dedicacion`) REFERENCES `dedicacion` (`id_dedicacion`),
  ADD CONSTRAINT `cargos_ibfk_4` FOREIGN KEY (`id_docente`) REFERENCES `docentes` (`id_docente`);

--
-- Filtros para la tabla `carreras`
--
ALTER TABLE `carreras`
  ADD CONSTRAINT `carreras_ibfk_1` FOREIGN KEY (`id_tipo_carrera`) REFERENCES `tipo_carrera` (`id_tipo_carrera`);

--
-- Filtros para la tabla `correlativas`
--
ALTER TABLE `correlativas`
  ADD CONSTRAINT `correlativas_ibfk_1` FOREIGN KEY (`id_asignatura_principal`) REFERENCES `asignaturas` (`id_asignatura`),
  ADD CONSTRAINT `correlativas_ibfk_2` FOREIGN KEY (`id_asignatura_correlativa`) REFERENCES `asignaturas` (`id_asignatura`);

--
-- Filtros para la tabla `optativas`
--
ALTER TABLE `optativas`
  ADD CONSTRAINT `optativas_ibfk_1` FOREIGN KEY (`id_plan_estudio`) REFERENCES `plan_estudio` (`id_plan_estudio`),
  ADD CONSTRAINT `optativas_ibfk_2` FOREIGN KEY (`id_asignatura`) REFERENCES `asignaturas` (`id_asignatura`);

--
-- Filtros para la tabla `plan_estudio`
--
ALTER TABLE `plan_estudio`
  ADD CONSTRAINT `plan_estudio_ibfk_1` FOREIGN KEY (`id_carrera`) REFERENCES `carreras` (`id_carrera`),
  ADD CONSTRAINT `plan_estudio_ibfk_2` FOREIGN KEY (`id_asignatura`) REFERENCES `asignaturas` (`id_asignatura`);

--
-- Filtros para la tabla `roles`
--
ALTER TABLE `roles`
  ADD CONSTRAINT `roles_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
