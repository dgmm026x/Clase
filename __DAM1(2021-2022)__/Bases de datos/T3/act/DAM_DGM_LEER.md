---
---
---
---
---
___ACTIVIDAD 7.1: CONSULTAS, FUNCIONES Y PROCEDIMIENTOS___
-
Daniel García Menéndez

1º D.A.M. (2021-2022)

---
---
---
---
---

___Enunciado 1: QUERY RIGHT JOIN___
-
__ENUNCIADO:__ "Una query en la base de datos Neptuno que involucre un right join y dos variables"

---
La consulta funciona de la siguiente manera:

- Consiste en una consulta que relaciona las tablas ___pedidos___ y ___clientes___, teniendo ___clientes___ relevancia, y en el caso de que haya datos de columnas vacías en ___pedidos___, se mostrarán como datos nulos "(NULL)"...

---
Ejecute el siguiente código en una nueva consulta:
-

```
USE neptuno;

SELECT
	*
FROM pedidos
RIGHT JOIN clientes
	ON pedidos.IdCliente = clientes.IdCliente
;
```



---
---
---
---
---



___Enunciado 2: FUNCIÓN ¡Hola cliente!___
-
__ENUNCIADO:__ "Una función que sirva para saludar. Ha de recibir 2 parámetros:

    · Tipo de saludo: 'hola', 'adios', y si no es ninguno de esos dos, devuelve 'Saludos'
    
    · Id usuario: ha de buscar por "id" en una tabla usuarios (es necesario que crees y que rellenes la tabla con datos). Si encuentra el id, la función devolverá el tipo de saludo y el nombre del usuario asociado a dicho id. Si no encuentra el id, la función devolverá  el tipo de saludo + "desconocido"."
---
La función funciona de la siguiente manera:

- La función imprime un ___CONCAT___ de 5 secciones:

   - La primera inicia la frase con el símbolo exclamativo '¡'

   - La segunda trabaja una condición que determinará que tipo de saludo ha de salir en base al parámetro recibido

   - La tercera sección es un simple espacio para separar el saludo del nombre...


   - La cuarta ejecuta una condición que establece que en el caso de encontrar el cliente, simplemente devuelve su nombre, y si no encuentra ese cliente (osea, el valor es nulo "(NULL)"), devolverá la cadena 'desconocido'...

  - La la última sección cierra la frase con el símbolo exclamativo '!'

---

Ejecute el siguiente código en una nueva consulta:
-

```
USE neptuno;

DELIMITER $$

DROP FUNCTION if EXISTS saludarCliente $$
CREATE FUNCTION saludarCliente(tipoSaludo VARCHAR(40), idDelCliente VARCHAR(5)) RETURNS VARCHAR(40)

BEGIN

	RETURN CONCAT (
	
		'¡',
		
		if (tipoSaludo = 'Hola' || tipoSaludo = 'Adiós',
		
			tipoSaludo,
			'Saludos'
		),
		
		' ',
		
		if ((SELECT NombreContacto FROM clientes WHERE IdCliente = idDelCliente) IS NULL,
		
			'desconocido',
			(SELECT NombreContacto FROM clientes WHERE IdCliente = idDelCliente)
		),
		
		'!'

	);
	
END $$

DELIMITER ;
```


Para llamar a la función, ha de emplear el siguiente comando:

- "_ TIPO_SALUDO _" indique aquí el saludo 'Hola' o 'Adiós'...

- "_ ID_CLIENTE _" es el ID del cliente...

```
SELECT saludarCliente(_TIPO_SALUDO_, _ID_CLIENTE_);
```



---
---
---
---
---



___Enunciado 3: PROCEDIMIENTO IN___
-
__ENUNCIADO:__ "Un procedimiento IN que permita hallar el número de productos a partir del nombre del proveedor en la base de datos Neptuno"

---
El procedimiento funciona de la siguiente manera:

- El procedimiento muestra el nombre del proveedor indicado, la cantidad de variedad de productos de los que dispone y la totalidad de unidades de todos los productos. Realiza un ___JOIN___ de las tablas ___productos___ y ___proveedores___ para localizar los productos del proveedor...


---
Ejecute el siguiente código en una nueva consulta:
-

```
USE neptuno;

DELIMITER $$

DROP PROCEDURE if EXISTS buscarCantProductosProv $$
CREATE PROCEDURE buscarCantProductosProv(IN nombreProveedor VARCHAR(40))

BEGIN

	SELECT
		proveedores.`NombreCompañia`,
		count(productos.NombreProducto) AS 'Número de productos',
		sum(productos.UnidadesEnExistencia) AS 'Unidades totales de productos'
	FROM productos
		JOIN proveedores ON (productos.IdProveedor = proveedores.IdProveedor)
	WHERE proveedores.`NombreCompañia` = nombreProveedor
	;
		
END $$

DELIMITER ;
```


Para llamar al procedimiento, ha de emplear el siguiente comando:

- "_ NOMBRE_PROVEEDOR _" es el nombre del proveedor...


```
CALL buscarCantProductosProv(_NOMBRE_PROVEEDOR_);
```



---
---
---
---
---



___Enunciado 4: PROCEDIMIENTO OUT___
-
__ENUNCIADO:__ "Un procedimiento OUT que muestre los precios del producto más caro y más barato de la base de datos Neptuno."

---
El procedimiento funciona de la siguiente manera:

- El procedimiento busca en el ___SET productoBarato___ el producto de menor valor en la tabla de productos, y lo mismo para el caso del producto de mayor valor con  ___SET productoCaro___...


---
Ejecute el siguiente código en una nueva consulta:
-

```
USE neptuno;

DELIMITER $$

DROP PROCEDURE if EXISTS productoBaratoProductoCaro $$
CREATE PROCEDURE productoBaratoProductoCaro(OUT productoBarato DECIMAL(19,4),OUT productoCaro DECIMAL(19,4))

BEGIN

	SET productoBarato = (
	
        SELECT
            MIN(PrecioUnidad)
        FROM productos
	);
	
	SET productoCaro = (
	
        SELECT
            MAX(PrecioUnidad)
        FROM productos
	);
	
END $$

DELIMITER ;
```


Para llamar al procedimiento, ha de emplear el siguiente comando:

- "_ _PRODUCTO_BARATO_ _" es el nombre del artículo de menor valor...

- "_ _PRODUCTO_CARO_ _" es el nombre del artículo de mayor valor...

```
CALL productoBaratoProductoCaro(@_PRODUCTO_BARATO_,@_PRODUCTO_CARO_);
```

Para observar directamente los valores, ejecute este comando:

```

SELECT @barato AS _PRODUCTO_BARATO_, @caro AS _PRODUCTO_CARO_;
```



---
---
---
---
---



___Enunciado 5: PROCEDIMIENTO IN/OUT___
-

__ENUNCIADO:__ "Un procedimiento IN/OUT que permita vender productos de la base de datos Neptuno, pasándole el nombre del producto(IN) y la cantidad de unidades que se quieren vender(IN). Dicho procedimiento, no sólo restará las unidades en existencia de cada producto, sino que al ser llamado varias veces (para distintos productos) permitirá ir acumulando el beneficio de las ventas en una variable (OUT)."

---

El procedimiento funciona de la siguiente manera:

- En la sección ___UPDATE productos...___ actualizará la tabla con los datos nuevos; en ___SET beneficio...___ se localiza el producto y su precio por unidad, y se calcula el precio final de la venta; y en ___SELECT...___ mostrará información, como el nombre del producto, precio, uds. antes y después de la venta, beneficio final...

---
Ejecute el siguiente código en una nueva consulta:
-

```
USE neptuno;

DELIMITER $$

DROP PROCEDURE if EXISTS actualizarProductosTrasVenta $$
CREATE PROCEDURE actualizarProductosTrasVenta(IN nombreDelProducto VARCHAR(40), IN cantidadParaVender INT, OUT beneficio DECIMAL(19,4))

BEGIN
	
	UPDATE productos
		SET UnidadesEnExistencia = UnidadesEnExistencia - cantidadParaVender
	WHERE productos.NombreProducto = nombreDelProducto;
	
	SET beneficio = (
	
        SELECT
            (PrecioUnidad * cantidadParaVender)
         FROM productos
         WHERE productos.NombreProducto = nombreDelProducto
	);
	
	SELECT
   	NombreProducto AS 'Producto vendido',
   	PrecioUnidad AS 'Precio por ud.',
   	UnidadesEnExistencia + cantidadParaVender AS 'Uds. antes de la venta',
   	cantidadParaVender AS 'Uds. vendidas',
   	UnidadesEnExistencia AS 'Uds. restantes',
   	(PrecioUnidad * cantidadParaVender)  AS 'Ganancias tras última venta'
   FROM productos
   WHERE productos.NombreProducto = nombreDelProducto;
	
END $$

DELIMITER ;
```


Para llamar al procedimiento, ha de emplear el siguiente comando:

- "_ NOMBRE_PRODUCTO _" es el nombre del artículo...

- "_ UDS_DE_PRODUCTO _" es el nombre del artículo...

- "_ INTRODUCIR_NOMBRE _" nombre de la salida de las ganancias...

```
CALL actualizarProductosTrasVenta(_NOMBRE_PRODUCTO_, _UDS_DE_PRODUCTO_, @_INTRODUCIR_NOMBRE_);
```

Para observar directamente las ganancias, ejecute este comando:
```
SELECT @_INTRODUCIR_NOMBRE_;
```



---
---
---
---
---