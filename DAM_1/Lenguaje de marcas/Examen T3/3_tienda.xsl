<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="html" />


        <html>

        <head>
            <link rel="stylesheet" href="1_polaroid.css"/>
            <title><xsl:import href="title"/></title>
        </head>

        <body>

            <header>
                <h2><xsl:import href="encabezado"/></h2>
                <p><xsl:import href="descripcion"/></p>
            </header>

            <div id="productos">

            </div>

        </body>

    </html>
    

</xsl:stylesheet>