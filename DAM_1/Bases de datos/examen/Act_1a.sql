USE neptuno;

SELECT
	clientes.NombreContacto,
	COUNT(pedidos.idpedido) AS 'Cantidad de pedidos realizados'
FROM pedidos
JOIN clientes ON(pedidos.IdCliente = clientes.IdCliente)
GROUP BY clientes.NombreContacto
;