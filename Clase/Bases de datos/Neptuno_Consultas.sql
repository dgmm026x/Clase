/*------1------------------*/
/*------2------------------*/


/*------3------------------*/
/*1*/SELECT MIN(FechaPedido) AS FMínima, MAX(FechaPedido) AS FMáxima FROM pedidos;
/*2*/SELECT COUNT(IdEmpleado=1) AS TotalPedidos FROM pedidos;
     SELECT COUNT(IdEmpleado) AS TotalPedidos FROM pedidos WHERE idEmpleado=1;
/*3*/SELECT AVG(unidadesenexistencia) AS UMediasStock FROM productos;


/*------4------------------*/
/*1*/SELECT * FROM clientes WHERE NombreCompañia LIKE 'b%' LIMIT 3;
/*2*/SELECT * FROM pedidos WHERE FechaPedido>'1996-08-15' LIMIT 10;
/*3*/


/*------5------------------*/
/*1*/SELECT
        nombreproducto,preciounidad,unidadesenexistencia,nivelnuevopedido,

        IF(unidadesenexistencia<nivelnuevopedido,'SI','NO') AS Alerta
        FROM productos
    ;


/*------6------------------*/
/*1*/SELECT
        idpedido,
        fechapedido,
        destinatario,
        CASE idempleado
            when 1 then 'Nancy'
            when 2 then 'Andrew'
            when 3 then 'Janet'
            when 4 then 'Margaret'
            when 5 then 'Steven'
            when 6 then 'Michael'
            when 7 then 'Robert'
            when 8 then 'Laura'
            when 9 then 'Anna'
        END
        FROM pedidos WHERE idcliente='ANATR'
    ;


/*------7------------------*/
/*1*/