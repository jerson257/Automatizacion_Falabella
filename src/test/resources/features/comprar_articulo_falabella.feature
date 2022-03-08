Feature: Compra de articulo Falabella
  en este escenario se desea probar la funcionalidad de realizar
  compra de articulos en falabella.

  Scenario: Agregar producto a bolsa de compras
    Given se requiere buscar un producto para comprar
    When agregar al carrito el producto "Reloj Hombre Fossil Neutra Fs5790"
    Then Validar forma de pago del producto