USE neptuno;

SELECT
	clientes.NombreContacto,
	COUNT(pedidos.idpedido) AS 'Cantidad de pedidos'
FROM clientes
JOIN pedidos ON(pedidos.IdCliente = clientes.IdCliente)
WHERE clientes.Pais = 'Alemania' AND clientes.NombreContacto LIKE '%R' OR clientes.NombreContacto LIKE '%P'
GROUP BY clientes.NombreContacto
;