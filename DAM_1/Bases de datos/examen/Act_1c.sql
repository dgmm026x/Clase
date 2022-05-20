USE neptuno;

SELECT
	pedidos.IdPedido,
	pedidos.Cargo
FROM pedidos
JOIN empleados ON (empleados.IdEmpleado = pedidos.IdEmpleado)
WHERE empleados.FechaContratacion BETWEEN '1993-10-1' AND '1993-10-31'
ORDER BY -pedidos.Cargo
;