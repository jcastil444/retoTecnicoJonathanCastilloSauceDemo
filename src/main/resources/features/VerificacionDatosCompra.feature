# language:es

#Proyecto: Saucedemo
#Cliente: Sura
#Elaborado por: Jonathan castillo

Característica: Se inicia el proceso de compra y generacion de factura

  Escenario: HU006 Solicitud de datos personales facturacion
    Dado El usuario accede a la pagina principal del aplicativo
    Y diligencia el formulario de login y se autentica
    Y se seleccionan productos deseados de forma aleatoria
    Cuando ingresa los datos personales solicitados
    Entonces se procede a continuar el proceso de compra

