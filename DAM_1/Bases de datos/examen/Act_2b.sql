USE neptuno;

DELIMITER $$
DROP PROCEDURE if EXISTS Act2b $$
CREATE PROCEDURE Act2b(IN nombreDelProducto VARCHAR(40), OUT resultado VARCHAR(16))

BEGIN
	
	SET resultado = ('');
	
	if (
		
		(SELECT
			UnidadesEnExistencia - NivelNuevoPedido
		FROM productos
		WHERE NombreProducto = nombreDelProducto) >= 0
		,
		
		SET resultado = ('HACER PEDIDO')
		,
		
		SET resultado = ('no')
	)

END$$

DELIMITER ;

CALL Act2b('Algas Konbu',@xxx);
SELECT @xxx;