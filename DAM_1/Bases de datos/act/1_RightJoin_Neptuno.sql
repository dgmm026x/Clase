SELECT
	*
FROM pedidos
RIGHT JOIN clientes
ON pedidos.IdCliente = clientes.IdCliente;