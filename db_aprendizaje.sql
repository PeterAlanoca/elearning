-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2016 a las 21:17:35
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `db_aprendizaje`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE IF NOT EXISTS `docente` (
`id` int(11) NOT NULL,
  `ci` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `paterno` varchar(100) NOT NULL,
  `materno` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `sexo` varchar(100) NOT NULL,
  `materia` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`id`, `ci`, `nombre`, `paterno`, `materno`, `correo`, `sexo`, `materia`) VALUES
(1, '12345678', 'Ivan  ', 'Arce', 'Cardenas', 'docente.matematica@gmail.com', 'Masculino', 'Matematica'),
(2, '87654321', 'Alberto', 'Paz', 'Gonzales', 'docente.fisica@gmail.com', 'Masculino', 'Fisica'),
(3, '01234567', 'Ivan', 'Choque', 'Coaquira', 'docente.quimica@gmail.com', 'Masculino', 'Quimica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE IF NOT EXISTS `estudiante` (
`id` int(11) NOT NULL,
  `ci` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `paterno` varchar(100) NOT NULL,
  `materno` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `celular` varchar(100) NOT NULL,
  `sexo` varchar(100) NOT NULL,
  `materia` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id`, `ci`, `nombre`, `paterno`, `materno`, `correo`, `celular`, `sexo`, `materia`) VALUES
(1, '12452399', 'Tania', 'Alanoca', 'Larico', 'tania.alanoca@gmail.com', '60631096', 'Mujer', 'Matematica'),
(2, '9993405', 'Ivan David', 'Aliaga', 'Vargas', 'ivan.aliaga@gmail.com', '60631097', 'Hombre', 'Matematica'),
(3, '10062212', 'Raul', 'Antonio', 'Ramirez', 'raul.ramirez@gmail.com', '60631098', 'Hombre', 'Matematica'),
(4, '7094405', 'Mac Gyver', 'Aruquipa', 'Paxi', 'mac.aruquipa@gmail.com', '60631099', 'Hombre', 'Matematica'),
(5, '6729692', 'Justino', 'Bautista', 'Matias', 'justo.bautista@gmail.com', '60631100', 'Hombre', 'Matematica'),
(6, '8403280', 'Rodrigo', 'Blanco', 'Huanca', 'rodrigo.blanco@gmail.com', '60631111', 'Hombre', 'Matematica'),
(7, '9212512', 'Cristian', 'Cahuana', 'Miranda', 'cristian.cahuana@gmail.com', '60631112', 'Hombre', 'Matematica'),
(8, '12635656', 'Mariela', 'Cahuaya', 'Matta', 'mariela.cahuaya@gmail.com', '60631113', 'Mujer', 'Matematica'),
(9, '8299143', 'Jose Leonardo', 'Calami', 'Paye', 'jose.calami@gmail.com', '60631114', 'Hombre', 'Matematica'),
(10, '9186693', 'Katerin', 'Calderon', 'Velasco', 'katerin.calderon@gmail.com', '60631115', 'Mujer', 'Matematica'),
(11, '10083485', 'Gonzalo Gary', 'Callata', 'Aguilar', 'gonzalo.callata@gmail.com', '60631116', 'Hombre', 'Matematica'),
(12, '7009290', 'Alberto Alvaro', 'Campos', 'Ticona', 'alberto.campos@gmail.com', '606310117', 'Hombre', 'Fisica'),
(13, '12421949', 'Americo David', 'Canaviri', 'Calderon', 'americo.canaviri@gmail.com', '60631118', 'Hombre', 'Fisica'),
(14, '9234347', 'Nilda', 'Carvajal', 'Yujra', 'nilda.carvajal@gmail.com', '60631119', 'Mujer', 'Fisica'),
(15, '9103356', 'Nelson', 'Castillo', 'Aliaga', 'nelson.castillo@gmail.com', '60631120', 'Hombre', 'Fisica'),
(16, '7056625', 'Royer', 'Cayo', 'Huanca', 'royer.huanca@gmail.com', '60631221', 'Hombre', 'Fisica'),
(17, '7094438', 'Luis Hernan', 'Cespedes', 'Churata', 'luis.hernan@gmail.com', '60631222', 'Hombre', 'Fisica'),
(18, '9115945', 'Judith', 'Chambi', 'Callizaya', 'judith.chambi@gmail.com', '60631223', 'Mujer', 'Fisica'),
(19, '9243487', 'David Pablo', 'Chambi', 'Conde', 'david.cambi@gmail.com', '60631224', 'Hombre', 'Fisica'),
(20, '9210312', 'Maria Elena', 'Chambi', 'Nina', 'elena.chambi@gmail.com', '60631225', 'Mujer', 'Fisica'),
(21, '8362987', 'Yesica', 'Chambi', 'Yujra', 'yesica.chambi@gmail.com', '60631226', 'Mujer', 'Fisica'),
(22, '10917361', 'Daniel Arnoldo', 'Alcon', 'Apaza', 'daniel.alcon@gmail.com', '60631227', 'Hombre', 'Quimica'),
(23, '9113756', 'Cesar Luis', 'Almanza', 'Quispe', 'cesar.almanza@gmail.com', '60631228', 'Hombre', 'Quimica'),
(24, '9885122', 'Jesus Reynaldo', 'Apaza', 'Chipana', 'jesus.apaza@gmail.com', '60631229', 'Hombre', 'Quimica'),
(25, '6807828', 'Diego Adolfo', 'Apaza', 'Choquehuanca', 'diego.apaza@gmail.com', '60631230', 'Hombre', 'Quimica'),
(26, '10077072', 'Milton', 'Apaza', 'Quenallata', 'milton.apaza@gmail.com', '60631231', 'Hombre', 'Quimica'),
(27, '1002669', 'Hilarion', 'Apaza', 'Condori', 'hilarion.apaza@gmail.com', '60631232', 'Hombre', 'Quimica'),
(28, '7039987', 'Juan Carlos', 'Aruquipa', 'Mamani', 'juan.aruquipa@gmail.com', '60631233', 'Hombre', 'Quimica'),
(29, '9921159', 'Guido', 'Aruquipa', 'Mamani', 'guido.aruquipa@gmail.com', '60631234', 'Hombre', 'Quimica'),
(30, '13442955', 'Juan Carlos', 'Avalos', 'Huallpa', 'juan.avalos@gmail.com', '60631235', 'Hombre', 'Quimica'),
(31, '10927552', 'Miguel Angel', 'Benito', 'Mamani', 'miguel.benito@gmail.com', '60631236', 'Hombre', 'Quimica'),
(32, '7068299', 'Henry Dennis', 'Calderon', 'Mamani', 'henry.calderon@gmail.com', '60631238', 'Hombre', 'Quimica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema`
--

CREATE TABLE IF NOT EXISTS `tema` (
`id` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL,
  `materia` varchar(100) NOT NULL,
  `titulo` varchar(1000) NOT NULL,
  `descripcion` varchar(1000) NOT NULL,
  `contenido` text NOT NULL,
  `archivo` varchar(100) NOT NULL,
  `fecha` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tema`
--

INSERT INTO `tema` (`id`, `id_docente`, `materia`, `titulo`, `descripcion`, `contenido`, `archivo`, `fecha`) VALUES
(1, 1, 'Matematica', 'Matrices', 'En matematica, una matriz es un arreglo bidimensional de nÃºmeros. ', 'En matematica, una matriz es un arreglo bidimensional de nÃºmeros. Dado que puede definirse tanto la suma como el producto de matrices, en mayor generalidad se dice que son elementos de un anillo. Una matriz se representa por medio de una letra mayÃºscula(A,B..) y sus elementos con la misma letra en minÃºscula (a,b...), con un doble subÃ­ndice donde el primero indica la fila y el segundo la columna a la que pertenece.Las matrices se utilizan para mÃºltiples aplicaciones y sirven, en particular, para representar los coeficientes de los sistemas de ecuaciones lineales o para representar transformaciones lineales dada una base. En este Ãºltimo caso, las matrices desempeÃ±an el mismo papel que los datos de un vector para las aplicaciones lineales.Pueden sumarse, multiplicarse y descomponerse de varias formas, lo que tambiÃ©n las hace un concepto clave en el campo del Ã¡lgebra lineal.Es larga la historia del uso de las matrices para resolver ecuaciones lineales. Un importante texto matemÃ¡tico chino que proviene del aÃ±o 300 a. C. a 200 a. C., Nueve capÃ­tulos sobre el Arte de las matemÃ¡ticas (Jiu Zhang Suan Shu), es el primer ejemplo conocido de uso del mÃ©todo de matrices para resolver un sistema de ecuaciones simultÃ¡neas.3 En el capÃ­tulo sÃ©ptimo, "Ni mucho ni poco", el concepto de determinante apareciÃ³ por primera vez, dos mil aÃ±os antes de su publicaciÃ³n por el matemÃ¡tico japonÃ©s Seki KÅ?wa en 1683 y el matemÃ¡tico alemÃ¡n Gottfried Leibniz en 1693.', 'Algebra_Matrices.pdf', '06/12/2016 15:24:55'),
(2, 2, 'Fisica', 'Movimiento rectilineo uniforme', 'Un movimiento es rectilÃ­neo cuando un objeto describe una trayectoria recta respecto a un observador.', 'Un movimiento es rectilÃ­neo cuando un objeto describe una trayectoria recta respecto a un observador, y es uniforme cuando su velocidad es constante en el tiempo, dado que su aceleraciÃ³n es nula.\r\n\r\nNÃ³tese que el movimiento rectilÃ­neo puede ser tambiÃ©n no uniforme, y en ese caso la relaciÃ³n entre la posiciÃ³n y el tiempo es algo mÃ¡s compleja.\r\n\r\nEl movimiento rectilÃ­neo y uniforme se designa frecuentemente con el acrÃ³nimo MRU, aunque en algunos paÃ­ses es MRC, por movimiento rectilÃ­neo constante. El MRU se caracteriza por:\r\n\r\nMovimiento que se realiza sobre una lÃ­nea recta.\r\nVelocidad constante; implica magnitud y direcciÃ³n constantes.\r\nLa magnitud de la velocidad recibe el nombre de celeridad o rapidez.\r\nSin aceleraciÃ³n\r\nPara este tipo de movimiento, la distancia recorrida se calcula multiplicando la magnitud de la velocidad por el tiempo transcurrido. Esta relaciÃ³n tambiÃ©n es aplicable si la trayectoria no es rectilÃ­nea, con tal que la rapidez o mÃ³dulo de la velocidad sea constante. Por lo tanto, el movimiento puede considerarse en dos sentidos; una velocidad negativa representa un movimiento en direcciÃ³n contraria al sentido que convencionalmente hayamos adoptado como positivo.\r\n\r\nDe acuerdo con la Primera Ley de Newton, toda partÃ­cula puntual permanece en reposo o en movimiento rectilÃ­neo uniforme cuando no hay una fuerza externa que actÃºe sobre el cuerpo, dado que las fuerzas actuales estÃ¡n en equilibrio, por lo cual su estado es de reposo o de movimiento rectilÃ­neo uniforme. Esta es una situaciÃ³n ideal, ya que siempre existen fuerzas que tienden a alterar el movimiento de las partÃ­culas, por lo que en el movimiento rectilÃ­neo uniforme (MRU) es difÃ­cil encontrar la fuerza amplificada.', '6mru.pdf', '06/12/2016 15:30:12'),
(3, 3, 'Quimica', 'Quimica organica', 'es la rama de la quÃ­mica que estudia una clase numerosa de molÃ©culas que en su gran mayorÃ­a contienen carbono.', 'La quÃ­mica orgÃ¡nica es la rama de la quÃ­mica que estudia una clase numerosa de molÃ©culas que en su gran mayorÃ­a contienen carbono formando enlaces covalentes carbono-carbono o carbono-hidrÃ³geno y otros heteroÃ¡tomos, tambiÃ©n conocidos como compuestos orgÃ¡nicos. Debido a la omnipresencia del carbono en los compuestos que esta rama de la quÃ­mica estudia esta disciplina tambiÃ©n es llamada quÃ­mica del carbono. Friedrich WÃ¶hler es conocido como el padre de la quÃ­mica orgÃ¡nica por reportar la sÃ­ntesis artificial de la urea a partir de cianato de amonio: compuesto inorgÃ¡nico con alto contenido de nitrÃ³geno presente de manera general en la orina.\r\n\r\nEn astronomÃ­a, el MRU es muy utilizado. Los planetas y las estrellas no se mueven en lÃ­nea recta, pero la que sÃ­ se mueve en lÃ­nea recta es la luz, y siempre a la misma velocidad.\r\n\r\nEntonces, sabiendo la distancia a la que se encuentra un objeto, se puede saber el tiempo que tarda la luz en recorrer esa distancia. Por ejemplo, el sol se encuentra a 150 000 000 km. La luz, por lo tanto, tarda 500 segundos (8 minutos 20 segundos) en llegar hasta la tierra. La realidad es un poco mÃ¡s compleja, con la relatividad de por medio, pero a grandes rasgos podemos decir que la luz sigue un movimiento rectilÃ­neo uniforme.', 'formulacion_organica.pdf', '06/12/2016 15:38:52');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tema`
--
ALTER TABLE `tema`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT de la tabla `tema`
--
ALTER TABLE `tema`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
