-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 16-01-2025 a las 20:16:33
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12
CREATE DATABASE IF NOT EXISTS audiencias CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE audiencias;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `audiencias`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `audiencia`
--

CREATE TABLE `audiencia` (
  `id_audiencia` bigint(20) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `distrito` varchar(100) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `tipo_audiencia` varchar(50) NOT NULL,
  `id_Sala` int(11) DEFAULT NULL,
  `id_Causa` int(11) DEFAULT NULL,
  `id_Juez` int(11) DEFAULT NULL,
  `id_Fiscal` int(11) DEFAULT NULL,
  `id_Defensor` int(11) DEFAULT NULL,
  `cuij` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `audiencia`
--

INSERT INTO `audiencia` (`id_audiencia`, `fecha`, `hora`, `distrito`, `estado`, `tipo_audiencia`, `id_Sala`, `id_Causa`, `id_Juez`, `id_Fiscal`, `id_Defensor`, `cuij`) VALUES
(1, '2025-02-28', '10:00:00', 'Santa Fe', 'Realizada', 'Preliminar', 1, 1, 1, 1, 1, 'CU12312'),
(2, '2025-02-28', '11:30:00', 'Rosario', 'Suspendida', 'Juicio', 2, 2, 2, 2, 2, 'CU12312'),
(3, '2025-02-28', '09:00:00', 'Santa Fe', 'Realizada', 'Apelacion', 3, 3, 3, 3, 3, 'CU12312'),
(4, '2025-02-28', '14:00:00', 'Rosario', 'En Horario', 'Juicio', 4, 4, 4, 4, 4, 'CU12311'),
(5, '2025-02-28', '15:30:00', 'Santa Fe', 'En Horario', 'Preliminar', 5, 5, 5, 5, 5, 'CU12312'),
(6, '2025-02-25', '16:00:00', 'Rosario', 'En Horario', 'Juicio', 6, 6, 6, 6, 6, 'CU12121'),
(7, '2025-02-25', '12:00:00', 'Santa Fe', 'Demorada', 'Apelacion', 7, 7, 7, 7, 7, 'CU11211'),
(8, '2025-02-25', '17:30:00', 'Rosario', 'En Horario', 'Preliminar', 8, 8, 8, 8, 8, 'CU12312'),
(9, '2025-02-25', '13:00:00', 'Santa Fe', 'En Horario', 'Juicio', 9, 9, 9, 9, 9, 'CU12312'),
(10, '2025-02-25', '10:30:00', 'Rosario', 'En Horario', 'Apelacion', 10, 10, 10, 10, 10, 'CU12312'),
(11, '2025-02-25', '10:30:00', 'Santa Fe', 'Demorada', 'Juicio', 1, 11, 11, 11, 11, 'CU12312'),
(12, '2025-02-24', '14:00:00', 'Rosario', 'En Curso', 'Apelacion', 2, 12, 12, 12, 12, 'CU12312'),
(13, '2025-02-24', '09:15:00', 'Santa Fe', 'En Horario', 'Preliminar', 3, 13, 13, 13, 13, 'CU12312'),
(14, '2025-02-24', '11:00:00', 'Rosario', 'En Horario', 'Juicio', 4, 14, 14, 14, 14, 'CU12312'),
(15, '2025-02-24', '15:45:00', 'Santa Fe', 'Realizada', 'Apelacion', 5, 15, 15, 15, 15, 'CU12312'),
(16, '2025-02-24', '13:30:00', 'Rosario', 'En Horario', 'Juicio', 6, 16, 16, 16, 16, 'CU12312'),
(17, '2025-02-24', '16:00:00', 'Santa Fe', 'Suspendida', 'Preliminar', 7, 17, 17, 17, 17, 'CU12312'),
(18, '2025-02-24', '10:00:00', 'Rosario', 'Realizada', 'Juicio', 8, 18, 18, 18, 18, 'CU12312'),
(19, '2025-02-24', '12:00:00', 'Santa Fe', 'En Horario', 'Apelacion', 9, 19, 19, 19, 19, 'CU12312'),
(20, '2025-02-24', '14:30:00', 'Rosario', 'Demorada', 'Preliminar', 10, 20, 20, 20, 20, 'CU12312'),
(23, '2025-02-24', '21:00:00', 'Rosario', 'Demorada', 'Preliminar', 6, 5, 1, 4, 16, 'CUIJ1222');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `causa`
--

CREATE TABLE `causa` (
  `id_Causa` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `causa`
--

INSERT INTO `causa` (`id_Causa`, `descripcion`) VALUES
(1, 'Delitos contra la propiedad'),
(2, 'Homicidio doloso'),
(3, 'Violencia de género'),
(4, 'Robo con violencia'),
(5, 'Tráfico de drogas'),
(6, 'Abuso sexual'),
(7, 'Lesiones leves'),
(8, 'Falsificación de documentos'),
(9, 'Estafa'),
(10, 'Fraude financiero'),
(11, 'Incumplimiento de los deberes de asistencia famili'),
(12, 'Despojo de bienes'),
(13, 'Secuestro'),
(14, 'Causas laborales'),
(15, 'Causas de alimentos'),
(16, 'Causas civiles por daños'),
(17, 'Accidente de tránsito'),
(18, 'Causas por maltrato animal'),
(19, 'Causas por fraude fiscal'),
(20, 'Causas por corrupción administrativa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `defensor`
--

CREATE TABLE `defensor` (
  `id_Defensor` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `defensor`
--

INSERT INTO `defensor` (`id_Defensor`, `nombre`, `apellido`, `fecha_nacimiento`, `email`, `telefono`, `direccion`) VALUES
(1, 'Rodrigo', 'González', '1983-03-25', 'rodrigo.gonzalez@example.com', '3512345678', 'Calle de los Árboles 102'),
(2, 'Adriana', 'Zapata', '1980-08-15', 'adriana.zapata@example.com', '3512345679', 'Av. Libertad 45'),
(3, 'Carlos', 'Delgado', '1992-05-04', 'carlos.delgado@example.com', '3512345680', 'Calle Las Palmas 56'),
(4, 'Eva', 'Mármol', '1985-01-22', 'eva.marmol@example.com', '3512345681', 'Calle Mar 77'),
(5, 'Iván', 'Pineda', '1990-07-06', 'ivan.pineda@example.com', '3512345682', 'Av. Sol 13'),
(6, 'Gabriela', 'Velasco', '1987-11-14', 'gabriela.velasco@example.com', '3512345683', 'Calle Fuerte 34'),
(7, 'José', 'Villanueva', '1981-03-03', 'jose.villanueva@example.com', '3512345684', 'Calle Río 12'),
(8, 'Lilia', 'Treviño', '1989-09-10', 'lilia.trevino@example.com', '3512345685', 'Paseo de la Luna 20'),
(9, 'Ricardo', 'Casas', '1983-02-17', 'ricardo.casas@example.com', '3512345686', 'Calle Mayor 45'),
(10, 'Raquel', 'Leiva', '1982-04-11', 'raquel.leiva@example.com', '3512345687', 'Calle Hermosa 67'),
(11, 'Pedro', 'Alvarado', '1984-05-25', 'pedro.alvarado@example.com', '3512345688', 'Calle 21 de Mayo 90'),
(12, 'Susana', 'Figueroa', '1990-12-08', 'susana.figueroa@example.com', '3512345689', 'Calle San Antonio 54'),
(13, 'Patricio', 'Sierra', '1986-10-13', 'patricio.sierra@example.com', '3512345690', 'Calle Valle 31'),
(14, 'Verónica', 'Sánchez', '1991-09-19', 'veronica.sanchez@example.com', '3512345691', 'Paseo Central 81'),
(15, 'Héctor', 'Franco', '1980-11-23', 'hector.franco@example.com', '3512345692', 'Calle Rosario 99'),
(16, 'Lucía', 'Acosta', '1987-05-07', 'lucia.acosta@example.com', '3512345693', 'Calle San Martín 11'),
(17, 'Alfredo', 'Bermúdez', '1982-07-30', 'alfredo.bermudez@example.com', '3512345694', 'Av. Cordoba 12'),
(18, 'Marta', 'Miranda', '1988-03-18', 'marta.miranda@example.com', '3512345695', 'Calle Belgrano 67'),
(19, 'Ricardo', 'Navarro', '1983-02-12', 'ricardo.navarro@example.com', '3512345696', 'Calle San José 44'),
(20, 'Elena', 'Jiménez', '1991-11-04', 'elena.jimenez@example.com', '3512345697', 'Calle del Sol 90');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fiscal`
--

CREATE TABLE `fiscal` (
  `id_Fiscal` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `fiscal`
--

INSERT INTO `fiscal` (`id_Fiscal`, `nombre`, `apellido`, `fecha_nacimiento`, `email`, `telefono`, `direccion`) VALUES
(1, 'Julio', 'Zavala', '1976-07-21', 'julio.zavala@example.com', '3512345678', 'Calle Pérez 123'),
(2, 'Patricia', 'Astorga', '1982-01-13', 'patricia.astorga@example.com', '3512345679', 'Av. Rivadavia 56'),
(3, 'Nicolás', 'Berrocal', '1985-10-05', 'nicolas.berrocal@example.com', '3512345680', 'Calle Huella 78'),
(4, 'Estela', 'Balcarce', '1990-02-18', 'estela.balcarce@example.com', '3512345681', 'Calle Mistral 12'),
(5, 'Santiago', 'Olazabal', '1984-08-25', 'santiago.olazabal@example.com', '3512345682', 'Plaza del Sol 66'),
(6, 'Mariana', 'Larrain', '1988-03-10', 'mariana.larrain@example.com', '3512345683', 'Paseo Hidalgo 80'),
(7, 'Raúl', 'Behrens', '1977-04-17', 'raul.behrens@example.com', '3512345684', 'Calle Cielo 99'),
(8, 'Antonio', 'Weiss', '1981-06-15', 'antonio.weiss@example.com', '3512345685', 'Av. del Lago 33'),
(9, 'Sandra', 'Rivas', '1987-02-03', 'sandra.rivas@example.com', '3512345686', 'Calle Nubes 44'),
(10, 'Tomás', 'Díaz', '1983-12-08', 'tomas.diaz@example.com', '3512345687', 'Calle Azul 90'),
(11, 'Marcos', 'Catalán', '1991-01-14', 'marcos.catalan@example.com', '3512345688', 'Av. Buenos Aires 51'),
(12, 'Lidia', 'Morales', '1985-07-22', 'lidia.morales@example.com', '3512345689', 'Calle Maipú 16'),
(13, 'Esteban', 'Palacios', '1980-05-13', 'esteban.palacios@example.com', '3512345690', 'Calle Del Parque 12'),
(14, 'Carmen', 'López', '1982-11-02', 'carmen.lopez@example.com', '3512345691', 'Av. Libertador 21'),
(15, 'Felipe', 'Cavallaro', '1992-02-27', 'felipe.cavallaro@example.com', '3512345692', 'Calle Río 55'),
(16, 'Lucía', 'Biscay', '1987-08-29', 'lucia.biscay@example.com', '3512345693', 'Calle Vieja 87'),
(17, 'Daniela', 'Jirón', '1989-04-22', 'daniela.jiron@example.com', '3512345694', 'Calle Junín 34'),
(18, 'Guillermo', 'Cavero', '1983-03-30', 'guillermo.cavero@example.com', '3512345695', 'Calle del Mar 60'),
(19, 'Eduardo', 'Garbajosa', '1979-12-15', 'eduardo.garbajosa@example.com', '3512345696', 'Calle Nueva 41'),
(20, 'Victoria', 'Ferraro', '1991-07-14', 'victoria.ferraro@example.com', '3512345697', 'Av. Los Nogales 77');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juez`
--

CREATE TABLE `juez` (
  `id_Juez` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `juez`
--

INSERT INTO `juez` (`id_Juez`, `nombre`, `apellido`, `fecha_nacimiento`, `email`, `telefono`, `direccion`) VALUES
(1, 'Carlos', 'Sanchez', '1980-05-22', 'carlos.xilofono@example.com', '3512345678', 'Calle Ficticia 123'),
(2, 'Ana', 'Zarzuela', '1975-03-14', 'ana.zarzuela@example.com', '3512345679', 'Avenida Sol 456'),
(3, 'Luis', 'Manzanilla', '1983-09-05', 'luis.manzanilla@example.com', '3512345680', 'Callejón del Sol 789'),
(4, 'Maria', 'Toribio', '1990-12-18', 'maria.toribio@example.com', '3512345681', 'Calle Verde 102'),
(5, 'Ricardo', 'Cuesta', '1978-11-02', 'ricardo.cuesta@example.com', '3512345682', 'Av. Libertad 35'),
(6, 'Susana', 'Alonso', '1982-07-21', 'susana.alonso@example.com', '3512345683', 'Paseo del Río 54'),
(7, 'Héctor', 'Pereira', '1981-04-12', 'hector.pereira@example.com', '3512345684', 'Calle Los Andes 56'),
(8, 'Elena', 'Palladino', '1985-01-30', 'elena.palladino@example.com', '3512345685', 'Calle de la Luna 65'),
(9, 'Javier', 'Garfias', '1979-02-25', 'javier.garfias@example.com', '3512345686', 'Paseo de los Héroes 21'),
(10, 'Verónica', 'Ramos', '1984-08-19', 'veronica.ramos@example.com', '3512345687', 'Avenida Belgrano 11'),
(11, 'Pedro', 'Gallardo', '1987-06-06', 'pedro.gallardo@example.com', '3512345688', 'Calle La Esperanza 33'),
(12, 'Lucía', 'Aguirre', '1976-09-14', 'lucia.aguirre@example.com', '3512345689', 'Calle 9 de Julio 99'),
(13, 'Felipe', 'Marconi', '1986-05-16', 'felipe.marconi@example.com', '3512345690', 'Boulevard Norte 72'),
(14, 'Marcela', 'Lomelí', '1992-10-11', 'marcela.lomeli@example.com', '3512345691', 'Calle del Viento 44'),
(15, 'Gustavo', 'Merrlo', '1980-12-02', 'gustavo.merlo@example.com', '3512345692', 'Calle de la Paz 19'),
(16, 'Marta', 'Cuervo', '1977-03-23', 'marta.cuervo@example.com', '3512345693', 'Av. de los Sauces 88'),
(17, 'Adrián', 'Figueroa', '1988-11-28', 'adrian.figueroa@example.com', '3512345694', 'Calle San Martín 17'),
(18, 'Beatriz', 'González', '1991-04-20', 'beatriz.gonzalez@example.com', '3512345695', 'Calle Principal 91'),
(19, 'Carlos', 'Zúñiga', '1979-06-25', 'carlos.zuniga@example.com', '3512345696', 'Calle Libertad 85'),
(20, 'Diana', 'Lucero', '1984-09-01', 'diana.lucero@example.com', '3512345697', 'Calle Ancha 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `id_Sala` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `ubicacion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sala`
--

INSERT INTO `sala` (`id_Sala`, `nombre`, `ubicacion`) VALUES
(1, 'Sala 1 - San Cristóbal', 'Tribunales, Santa Fe'),
(2, 'Sala 2 - Santa Fe Capital', 'Tribunales, Santa Fe, Planta Baja'),
(3, 'Sala 3 - Subsuelo', 'Tribunales, Rosario, Subsuelo'),
(4, 'Sala 4 - Reconquista', 'Tribunales, Santa Fe'),
(5, 'Sala 5 - Penal', 'Tribunales, Rosario, Planta Baja'),
(6, 'Sala 6 - Vera', 'Tribunales, Santa Fe'),
(7, 'Sala 7 - Subsuelo', 'Tribunales, Rosario, Subsuelo'),
(8, 'Sala GESELL', 'Tribunales, Rosario, 1º Piso'),
(9, 'Sala 8 - Civil', 'Tribunales, Santa Fe, 2º Piso'),
(10, 'Sala 9 - Penal Juvenil', 'Tribunales, Rosario, Planta Baja'),
(11, 'Sala 10 - Laboral', 'Tribunales, Santa Fe, 3º Piso'),
(12, 'Sala 11 - Familia', 'Tribunales, Rosario, Planta Baja'),
(13, 'Sala 12 - Penal', 'Tribunales, Santa Fe, Planta Baja'),
(14, 'Sala 13 - Civil y Comercial', 'Tribunales, Rosario, 2º Piso'),
(15, 'Sala 14 - Gálvez', 'Tribunales, Santa Fe, Planta Baja'),
(16, 'Sala 15 - Gálvez', 'Galvez');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `audiencia`
--
ALTER TABLE `audiencia`
  ADD PRIMARY KEY (`id_audiencia`),
  ADD KEY `id_Sala` (`id_Sala`),
  ADD KEY `id_Causa` (`id_Causa`),
  ADD KEY `id_Juez` (`id_Juez`),
  ADD KEY `id_Fiscal` (`id_Fiscal`),
  ADD KEY `id_Defensor` (`id_Defensor`);

--
-- Indices de la tabla `causa`
--
ALTER TABLE `causa`
  ADD PRIMARY KEY (`id_Causa`);

--
-- Indices de la tabla `defensor`
--
ALTER TABLE `defensor`
  ADD PRIMARY KEY (`id_Defensor`);

--
-- Indices de la tabla `fiscal`
--
ALTER TABLE `fiscal`
  ADD PRIMARY KEY (`id_Fiscal`);

--
-- Indices de la tabla `juez`
--
ALTER TABLE `juez`
  ADD PRIMARY KEY (`id_Juez`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`id_Sala`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `audiencia`
--
ALTER TABLE `audiencia`
  MODIFY `id_audiencia` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `causa`
--
ALTER TABLE `causa`
  MODIFY `id_Causa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `defensor`
--
ALTER TABLE `defensor`
  MODIFY `id_Defensor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `fiscal`
--
ALTER TABLE `fiscal`
  MODIFY `id_Fiscal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `juez`
--
ALTER TABLE `juez`
  MODIFY `id_Juez` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `sala`
--
ALTER TABLE `sala`
  MODIFY `id_Sala` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `audiencia`
--
ALTER TABLE `audiencia`
  ADD CONSTRAINT `audiencia_ibfk_1` FOREIGN KEY (`id_Sala`) REFERENCES `sala` (`id_Sala`) ON DELETE SET NULL,
  ADD CONSTRAINT `audiencia_ibfk_2` FOREIGN KEY (`id_Causa`) REFERENCES `causa` (`id_Causa`) ON DELETE SET NULL,
  ADD CONSTRAINT `audiencia_ibfk_3` FOREIGN KEY (`id_Juez`) REFERENCES `juez` (`id_Juez`) ON DELETE SET NULL,
  ADD CONSTRAINT `audiencia_ibfk_4` FOREIGN KEY (`id_Fiscal`) REFERENCES `fiscal` (`id_Fiscal`) ON DELETE SET NULL,
  ADD CONSTRAINT `audiencia_ibfk_5` FOREIGN KEY (`id_Defensor`) REFERENCES `defensor` (`id_Defensor`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
