# language:es

#Proyecto: Saucedemo
#Cliente: Sura
#Elaborado por: Jonathan castillo

Característica: Un usuario ingresa a la plataforma de forma exitosa

  Escenario: HU002 Ingreso al aplicativo exitoso
    Dado El usuario accede a la pagina principal del aplicativo
    Cuando diligencia el formulario de login y se autentica
    Entonces se verifica que la autenticacion es exitosa
