<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    
    <xsl:output method="html" indent="yes"/>
    <xsl:template match="/web">

        <html>

            <head>

                <title><xsl:value-of select="title"/></title>

                <link rel="stylesheet" href="DAM_DGM_css.css"/>

            </head>

            <body>

                <header><xsl:value-of select="titulo"/></header>

                <section>

                    <p><xsl:value-of select="descripcion"/></p>
                    <h3><xsl:value-of select="subtitulo"/></h3>

                </section>

                <section>

                    <h3><xsl:value-of select="subtitulo2"/></h3>
                    
                    <xsl:for-each select="/web/conjunto/pelicula">

                        <div>

                            <h2><xsl:value-of select="titulo"/></h2>
                            <p><xsl:value-of select="director"/></p>
                            <p><xsl:value-of select="imagen"/></p>
                            <p><xsl:value-of select="salida"/></p>
                            <p><xsl:value-of select="sinopsis"/></p>
                            <p><xsl:value-of select="generos"/></p>

                            <div>

                                <h3><xsl:value-of select="tituloprincipales"/></h3>
                                <p><xsl:value-of select="actor1"/></p>
                                <p><xsl:value-of select="actor2"/></p>
                                <p><xsl:value-of select="actor3"/></p>

                            </div>

                            <div>

                                <h3><xsl:value-of select="titulosecundarios"/></h3>
                                <p><xsl:value-of select="actor4"/></p>
                                <p><xsl:value-of select="actor5"/></p>
                                <p><xsl:value-of select="actor6"/></p>

                            </div>

                        </div>

                    </xsl:for-each>

                </section>

                <footer>
                    <p><xsl:value-of select="final"/></p>
                </footer>

            </body>

        </html>

    </xsl:template>

</xsl:stylesheet>