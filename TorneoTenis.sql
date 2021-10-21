-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 20-10-2021 a las 16:31:10
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `TorneoTenis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Encuentro`
--

CREATE TABLE `Encuentro` (
  `idPartido` int(11) NOT NULL,
  `jugador1` int(11) NOT NULL,
  `jugador2` int(11) NOT NULL,
  `fechaEncuentro` int(11) NOT NULL,
  `resultado` varchar(30) NOT NULL,
  `jugadorGanador` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Estadio`
--

CREATE TABLE `Estadio` (
  `idEstadio` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `ciudad` varchar(30) NOT NULL,
  `categoria` varchar(30) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `direComercial` varchar(80) NOT NULL,
  `dimension` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Estadio`
--

INSERT INTO `Estadio` (`idEstadio`, `nombre`, `ciudad`, `categoria`, `activo`, `direComercial`, `dimension`) VALUES
(2, 'Monumental', 'Bueno Aires', 'Seleccion', 1, 'Avellaneda ', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Jugador`
--

CREATE TABLE `Jugador` (
  `idJugador` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `dni` int(11) NOT NULL,
  `fechaNac` date NOT NULL,
  `altura` double NOT NULL,
  `peso` double NOT NULL,
  `estilo` varchar(40) NOT NULL,
  `manoHabil` tinyint(1) NOT NULL,
  `torneosGanados` int(11) NOT NULL,
  `reinking` int(11) NOT NULL,
  `idPatrocinadores` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Jugador`
--

INSERT INTO `Jugador` (`idJugador`, `nombre`, `dni`, `fechaNac`, `altura`, `peso`, `estilo`, `manoHabil`, `torneosGanados`, `reinking`, `idPatrocinadores`) VALUES
(3, 'Lucas', 41222333, '2021-10-11', 1.75, 79, 'facha', 1, 0, 999, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Sponsor`
--

CREATE TABLE `Sponsor` (
  `idPatrocinadores` int(11) NOT NULL,
  `marca` varchar(40) NOT NULL,
  `indumentaria` varchar(40) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Sponsor`
--

INSERT INTO `Sponsor` (`idPatrocinadores`, `marca`, `indumentaria`, `activo`) VALUES
(1, 'Nike', 'gorra', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Torneo`
--

CREATE TABLE `Torneo` (
  `idTorneo` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `fechaNacInicio` date NOT NULL,
  `fechaNacFinal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Torneo`
--

INSERT INTO `Torneo` (`idTorneo`, `nombre`, `fechaNacInicio`, `fechaNacFinal`) VALUES
(1, 'Copa1', '2021-10-21', '2021-12-21');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Encuentro`
--
ALTER TABLE `Encuentro`
  ADD PRIMARY KEY (`idPartido`);

--
-- Indices de la tabla `Estadio`
--
ALTER TABLE `Estadio`
  ADD PRIMARY KEY (`idEstadio`);

--
-- Indices de la tabla `Jugador`
--
ALTER TABLE `Jugador`
  ADD PRIMARY KEY (`idJugador`),
  ADD KEY `Sponsor` (`idPatrocinadores`);

--
-- Indices de la tabla `Sponsor`
--
ALTER TABLE `Sponsor`
  ADD PRIMARY KEY (`idPatrocinadores`);

--
-- Indices de la tabla `Torneo`
--
ALTER TABLE `Torneo`
  ADD PRIMARY KEY (`idTorneo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Encuentro`
--
ALTER TABLE `Encuentro`
  MODIFY `idPartido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Estadio`
--
ALTER TABLE `Estadio`
  MODIFY `idEstadio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `Jugador`
--
ALTER TABLE `Jugador`
  MODIFY `idJugador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `Sponsor`
--
ALTER TABLE `Sponsor`
  MODIFY `idPatrocinadores` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `Torneo`
--
ALTER TABLE `Torneo`
  MODIFY `idTorneo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Jugador`
--
ALTER TABLE `Jugador`
  ADD CONSTRAINT `Sponsor` FOREIGN KEY (`idPatrocinadores`) REFERENCES `Sponsor` (`idPatrocinadores`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
