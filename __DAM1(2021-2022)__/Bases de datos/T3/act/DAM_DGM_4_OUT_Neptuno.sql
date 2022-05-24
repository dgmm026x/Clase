USE neptuno;

DELIMITER $$

DROP PROCEDURE if EXISTS productoBaratoProductoCaro $$
CREATE PROCEDURE productoBaratoProductoCaro(OUT productoBarato DECIMAL(19,4),OUT productoCaro DECIMAL(19,4))

BEGIN

	SET productoBarato = (
	
        SELECT
            MIN(PrecioUnidad)
        FROM productos
	);
	
	SET productoCaro = (
	
        SELECT
            MAX(PrecioUnidad)
        FROM productos
	);
	
END $$

DELIMITER ;

/*CALL productoBaratoProductoCaro(@barato,@caro);
SELECT @barato AS 'Precio del producto más barato',@caro AS 'Precio del producto más caro';*/