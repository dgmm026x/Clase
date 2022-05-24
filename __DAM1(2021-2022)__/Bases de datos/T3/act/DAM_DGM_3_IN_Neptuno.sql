USE neptuno;

DELIMITER $$

DROP PROCEDURE if EXISTS buscarCantProductosProv $$
CREATE PROCEDURE buscarCantProductosProv(IN nombreProveedor VARCHAR(40))

BEGIN

	SELECT
		proveedores.`NombreCompañia`,
		count(productos.NombreProducto) AS 'Número de productos',
		sum(productos.UnidadesEnExistencia) AS 'Cantidad total de productos'
	FROM productos
		JOIN proveedores ON (productos.IdProveedor = proveedores.IdProveedor)
	WHERE proveedores.`NombreCompañia` = nombreProveedor
	;
		
END $$

DELIMITER ;

/*CALL buscarCantProductosProv("Exotic Liquids");*/