/*------ ------*/
/*------ ------*/
/*------ ------*/
SELECT MIN(FechaPedido) AS FMínima, MAX(FechaPedido) AS FMáxima FROM pedidos;

SELECT COUNT(IdEmpleado=1) AS TotalPedidos FROM pedidos;
SELECT COUNT(IdEmpleado) AS TotalPedidos FROM pedidos WHERE idEmpleado=1;

SELECT AVG(UnidadesEnExistencia) AS UMediasStock FROM productos;

/*------4------*/

/*1*/SELECT * FROM clientes WHERE NombreCompañia LIKE 'b%' LIMIT 3;
/*2*/SELECT * FROM pedidos WHERE FechaPedido>'1996-08-15' LIMIT 10;
/*3*/