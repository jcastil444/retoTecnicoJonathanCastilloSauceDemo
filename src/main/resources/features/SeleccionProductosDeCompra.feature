# language:es

#Proyecto: Saucedemo
#Cliente: Sura
#Elaborado por: Jonathan castillo

Característica: Selección aleatoria de productos y adicion al carro de compras

  Escenario: HU005 Seleccion y adicion de productos a comprar
    Dado El usuario accede a la pagina principal del aplicativo
    Y diligencia el formulario de login y se autentica
    Cuando se seleccionan productos deseados de forma aleatoria
    Entonces se verifica la carga de los productos anadidos al carrito de compras
