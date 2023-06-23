# language:es

#Proyecto: Saucedemo
#Cliente: Sura
#Elaborado por: Jonathan castillo

Característica: Un usuario ingresa a la plataforma con credenciales incorrectas

  Escenario: HU001 Ingreso al aplicativo fallido
    Dado El usuario accede a la pagina del aplicativo
    Cuando diligencia el formulario de login y se intenta autenticar
    Entonces se verifica que la autenticacion es fallida
