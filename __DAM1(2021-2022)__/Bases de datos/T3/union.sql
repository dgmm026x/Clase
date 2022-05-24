USE neptuno;

SELECT
    `NombreCompañia`
        AS `Empresa colaboradora`,
    Telefono
FROM proveedores

UNION ALL

SELECT
    `NombreCompañia`,
    Telefono
FROM `compañiasenvios`;