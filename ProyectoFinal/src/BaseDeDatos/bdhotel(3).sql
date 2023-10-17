-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-10-2023 a las 00:14:45
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdhotel`
--
CREATE DATABASE IF NOT EXISTS `bdhotel` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `bdhotel`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `nroHabitacion` int(11) NOT NULL,
  `idTipoHabitacion` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `nroHabitacion`, `idTipoHabitacion`, `piso`, `estado`) VALUES
(1, 10, 1, 1, 1),
(2, 11, 1, 1, 1),
(3, 12, 1, 1, 1),
(4, 13, 1, 1, 1),
(5, 14, 1, 1, 1),
(6, 15, 1, 1, 1),
(7, 20, 2, 1, 1),
(8, 21, 2, 1, 1),
(9, 22, 2, 1, 1),
(10, 23, 2, 1, 1),
(11, 24, 2, 1, 1),
(12, 25, 2, 1, 1),
(13, 30, 3, 2, 1),
(14, 31, 3, 2, 1),
(15, 32, 3, 2, 1),
(16, 33, 3, 2, 1),
(17, 34, 3, 2, 1),
(18, 35, 3, 2, 1),
(19, 40, 4, 2, 1),
(20, 41, 4, 2, 1),
(21, 42, 4, 2, 1),
(22, 60, 6, 2, 1),
(23, 61, 6, 2, 1),
(24, 70, 7, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesp` int(11) NOT NULL,
  `ApellidoHuesp` varchar(50) NOT NULL,
  `NombreHuesp` varchar(50) NOT NULL,
  `dniHuesp` varchar(8) NOT NULL,
  `emailHuesp` varchar(50) NOT NULL,
  `telefonoHuesp` varchar(20) NOT NULL,
  `estadoHuesp` tinyint(1) NOT NULL,
  `domicilioHuesp` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesp`, `ApellidoHuesp`, `NombreHuesp`, `dniHuesp`, `emailHuesp`, `telefonoHuesp`, `estadoHuesp`, `domicilioHuesp`) VALUES
(1, 'Fortuna', 'Marcelo', '27444111', 'fortuna@hotmail.com', '34004758', 1, 'Av. Saenz 890');

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
  `nombreTipo` varchar(20) NOT NULL,
  `letraTipo` char(1) NOT NULL,
  `maxHuespedes` int(11) NOT NULL,
  `importepornoche` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipohabitacion`
--

INSERT INTO `tipohabitacion` (`idTipoHabit`, `nombreTipo`, `letraTipo`, `maxHuespedes`, `importepornoche`, `estado`) VALUES
(1, 'Simple', 'S', 1, 3000, 1),
(2, 'Doble', 'D', 2, 7000, 1),
(3, 'Triple', 'T', 3, 12000, 1),
(4, 'SuiteLujo', 'L', 2, 12000, 1),
(6, 'SuiteXL', 'X', 7, 20000, 1),
(7, 'Presidencial', 'P', 5, 50000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `password`) VALUES
('andres', 'muñoz'),
('david', 'moreira'),
('juan', 'botaro'),
('matias', 'muzzopappa');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD UNIQUE KEY `nroHabitacion` (`nroHabitacion`),
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
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  MODIFY `idTipoHabit` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

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