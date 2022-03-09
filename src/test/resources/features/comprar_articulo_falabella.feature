Feature: Compra de articulo Falabella
  en este escenario se desea probar la funcionalidad de realizar
  compra de articulos en falabella.

  Scenario: Agregar producto a bolsa de compras
    Given se requiere buscar un producto para comprar
    When agregar al carrito el producto
    |producto                           |direccion         |complemento_direccion|
    |"Reloj Hombre Fossil Neutra Fs5384"|calle 75 # 90 - 23|apto 1006            |
    Then Validar forma de pago del producto