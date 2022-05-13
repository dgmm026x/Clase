USE neptuno;

DELIMITER $$

DROP PROCEDURE if EXISTS actualizarProductosTrasVenta $$
CREATE PROCEDURE actualizarProductosTrasVenta(IN nombreDelProducto VARCHAR(40), IN cantidadParaVender INT, OUT beneficio DECIMAL(19,4))

BEGIN
	
	UPDATE productos
		SET UnidadesEnExistencia = UnidadesEnExistencia - cantidadParaVender
	WHERE productos.NombreProducto = nombreDelProducto;
	
	SET beneficio = (
	
        SELECT
            (PrecioUnidad * cantidadParaVender)
         FROM productos
         WHERE productos.NombreProducto = nombreDelProducto
	);
	
	SELECT
   	NombreProducto AS 'Producto vendido',
   	PrecioUnidad AS 'Precio por ud.',
   	UnidadesEnExistencia + cantidadParaVender AS 'Uds. antes de la venta',
   	cantidadParaVender AS 'Uds. vendidas',
   	UnidadesEnExistencia AS 'Uds. restantes',
   	(PrecioUnidad * cantidadParaVender)  AS 'Ganancias tras última venta'
   FROM productos
   WHERE productos.NombreProducto = nombreDelProducto;
	
END $$

DELIMITER ;

/*CALL actualizarProductosTrasVenta('Chocolate Schoggi', 0, @'Ganancias tras última venta');
SELECT @'Ganancias tras última venta';*/