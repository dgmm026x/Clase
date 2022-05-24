USE neptuno;

SELECT
	(detallespedidos.Cantidad * detallespedidos.PrecioUnidad) AS Importe,
	pedidos.FechaPedido,
	pedidos.Destinatario
FROM pedidos
JOIN detallespedidos ON (pedidos.IdPedido = detallespedidos.IdPedido)
ORDER BY -Importe
;