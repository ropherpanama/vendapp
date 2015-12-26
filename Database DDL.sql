-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.21-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para vendapp
CREATE DATABASE IF NOT EXISTS `vendapp` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `vendapp`;


-- Volcando estructura para tabla vendapp.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(50) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla vendapp.clientes: ~2 rows (aproximadamente)
DELETE FROM `clientes`;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`id_cliente`, `nombre_cliente`, `direccion`) VALUES
	(1, 'Algieri Caballero', 'Las Acacias, Casa 35'),
	(2, 'Rosendo Peña', 'Juan Diaz, Llano Bonito');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


-- Volcando estructura para tabla vendapp.facturas
CREATE TABLE IF NOT EXISTS `facturas` (
  `id_factura` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_factura` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_vendedor` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `num_factura` varchar(100) NOT NULL,
  `importe` double NOT NULL,
  PRIMARY KEY (`id_factura`),
  KEY `fecha_factura` (`fecha_factura`),
  KEY `num_factura` (`num_factura`),
  KEY `FK_facturas_vendedores` (`id_vendedor`),
  KEY `FK_facturas_clientes` (`id_cliente`),
  CONSTRAINT `FK_facturas_clientes` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `FK_facturas_vendedores` FOREIGN KEY (`id_vendedor`) REFERENCES `vendedores` (`id_vendedor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla vendapp.facturas: ~1 rows (aproximadamente)
DELETE FROM `facturas`;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` (`id_factura`, `fecha_factura`, `id_vendedor`, `id_cliente`, `num_factura`, `importe`) VALUES
	(1, '2015-12-26 18:03:21', 1, 1, 'NUMFACT0000001', 0);
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;


-- Volcando estructura para tabla vendapp.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `id_producto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(50) NOT NULL,
  `precio` double NOT NULL,
  `disponible` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla vendapp.productos: ~3 rows (aproximadamente)
DELETE FROM `productos`;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` (`id_producto`, `nombre_producto`, `precio`, `disponible`) VALUES
	(1, 'Mortadela', 0.75, 10),
	(2, 'Salami', 1.85, 10),
	(3, 'Bologna', 2.5, 10);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;


-- Volcando estructura para tabla vendapp.productos_factura
CREATE TABLE IF NOT EXISTS `productos_factura` (
  `num_factura` varchar(100) NOT NULL,
  `id_factura` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `id_productos_factura` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_productos_factura`),
  KEY `num_factura` (`num_factura`),
  KEY `FK_productos_factura_facturas` (`id_factura`),
  KEY `FK_productos_factura_productos` (`id_producto`),
  CONSTRAINT `FK_productos_factura_facturas` FOREIGN KEY (`id_factura`) REFERENCES `facturas` (`id_factura`),
  CONSTRAINT `FK_productos_factura_productos` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla vendapp.productos_factura: ~0 rows (aproximadamente)
DELETE FROM `productos_factura`;
/*!40000 ALTER TABLE `productos_factura` DISABLE KEYS */;
INSERT INTO `productos_factura` (`num_factura`, `id_factura`, `id_producto`, `cantidad`, `id_productos_factura`) VALUES
	('NUMFACT0000001', 1, 3, 3, 1),
	('NUMFACT0000001', 1, 2, 4, 2),
	('NUMFACT0000001', 1, 1, 6, 3);
/*!40000 ALTER TABLE `productos_factura` ENABLE KEYS */;


-- Volcando estructura para tabla vendapp.vendedores
CREATE TABLE IF NOT EXISTS `vendedores` (
  `id_vendedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `ruta_vendedor` varchar(200) NOT NULL,
  PRIMARY KEY (`id_vendedor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla vendapp.vendedores: ~1 rows (aproximadamente)
DELETE FROM `vendedores`;
/*!40000 ALTER TABLE `vendedores` DISABLE KEYS */;
INSERT INTO `vendedores` (`id_vendedor`, `nombre`, `ruta_vendedor`) VALUES
	(1, 'Daniel Guzman', 'RUT23456');
/*!40000 ALTER TABLE `vendedores` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
