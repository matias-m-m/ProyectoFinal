-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:43:24
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdhotel`
--
CREATE DATABASE IF NOT EXISTS `bdhotel` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bdhotel`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idTipoHabitacion` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesp` int(11) NOT NULL,
  `apellidoHuesp` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `nombreHuesp` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `dniHuesp` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `domicilioHuesp` varchar(80) COLLATE utf8_spanish_ci NOT NULL,
  `emailHuesp` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `telefonoHuesp` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `estadoHuesp` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesp`, `apellidoHuesp`, `nombreHuesp`, `dniHuesp`, `domicilioHuesp`, `emailHuesp`, `telefonoHuesp`, `estadoHuesp`) VALUES
(1, 'Salinas', 'Raul', '21555888', 'Salta 111', 'raul@hotmail.com', '0111589991', 1),
(2, 'Castro', 'Gabriel', '19741555', 'Av. Luro 890', 'castro@hotmail.com', '34158236', 0),
(3, 'Videlo', 'Gabriel', '29741569', 'Av. Luro 101', 'videla@hotmail.com', '888888', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `FechaIngreso` date NOT NULL,
  `FechaSalida` date NOT NULL,
  `montoTotal` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `idTipoHabit` int(11) NOT NULL,
  `nombreTipo` char(1) COLLATE utf8_spanish_ci NOT NULL,
  `maxHuespedes` int(11) NOT NULL,
  `importePorNoche` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipoHabitacion` (`idTipoHabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesp`),
  ADD UNIQUE KEY `dniHuesp` (`dniHuesp`),
  ADD UNIQUE KEY `emailHuesp` (`emailHuesp`),
  ADD UNIQUE KEY `telefonoHuesp` (`telefonoHuesp`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHabitacion` (`idHabitacion`),
  ADD KEY `idHuesped` (`idHuesped`);

--
-- Indices de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`idTipoHabit`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  MODIFY `idTipoHabit` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipoHabitacion`) REFERENCES `tipohabitacion` (`idTipoHabit`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesp`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
