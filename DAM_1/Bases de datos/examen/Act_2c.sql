USE neptuno;

DELIMITER $$
DROP PROCEDURE if EXISTS Act2c $$
CREATE PROCEDURE Act2c(IN inNombreDestinatario VARCHAR(40),IN inFechaDesde DATE,IN inFechaHasta DATE,
								OUT outNumeroPedidos INT, OUT outTotalProductos INT)

BEGIN
	
	SET outNumeroPedidos = (
		
		SELECT
			COUNT(IdPedido)
		FROM pedidos
		WHERE pedidos.Destinatario = inNombreDestinatario AND FechaPedido BETWEEN inFechaDesde AND inFechaHasta
	);
	
		SET outTotalProductos = (
		
		SELECT
			SUM(detallespedidos.Cantidad)
		FROM pedidos
		JOIN detallespedidos ON (pedidos.IdPedido = detallespedidos.IdPedido)
		WHERE pedidos.Destinatario = inNombreDestinatario AND FechaPedido BETWEEN inFechaDesde AND inFechaHasta
	);

END$$

DELIMITER ;

CALL Act2c('Wilman Kala','1990-1-1','2000-01-01',@xxx,@yyy);
SELECT @xxx AS 'Total de pedidos realizados', @yyy AS 'Total de productos encargados';