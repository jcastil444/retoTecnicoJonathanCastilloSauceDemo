# language:es

#Proyecto: Saucedemo
#Cliente: Sura
#Elaborado por: Jonathan castillo

Característica: Flujo completo de compra

  Escenario: HU007 Solicitud de compra E2E
    Dado El usuario accede a la pagina principal del aplicativo
    Y diligencia el formulario de login y se autentica
    Y se seleccionan productos deseados de forma aleatoria
    Y ingresa los datos personales solicitados
    Y se procede a continuar el proceso de compra
    Cuando verifico los datos de facturacion
    Entonces finalizo la compra y valido que el pedido fue enviado

