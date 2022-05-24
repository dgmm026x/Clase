USE neptuno;

SELECT
	pedidos.IdPedido,
	pedidos.FechaPedido,
	productos.NombreProducto AS 'Producto encargado',
	CONCAT(detallespedidos.PrecioUnidad * (1 - detallespedidos.Descuento), ' / ', detallespedidos.Cantidad * (detallespedidos.PrecioUnidad * (1 - detallespedidos.Descuento))) AS 'Precio unitario / Precio total',
	CONCAT((detallespedidos.Cantidad * (detallespedidos.PrecioUnidad * (1 - detallespedidos.Descuento))) * 100 / pedidos.Cargo, '%') AS '% del coste del producto en la compra total'
FROM pedidos
JOIN detallespedidos ON (pedidos.IdPedido = detallespedidos.IdPedido)
JOIN productos ON (detallespedidos.IdProducto = productos.IdProducto)
WHERE pedidos.FechaPedido BETWEEN '1997-02-14' AND '1997-02-29'
/*GROUP BY pedidos.IdPedido*/
ORDER BY pedidos.IdPedido
;