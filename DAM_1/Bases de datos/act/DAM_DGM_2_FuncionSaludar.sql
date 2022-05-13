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

/*SELECT saludarCliente('Hola','ALFKI');*/