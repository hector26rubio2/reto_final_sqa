Feature: HU-002 Buscador adidas background
  Yo como usuario de Haceb
  Quiero buscar un producto en la plataforma
  Para ver el nombre del producto en pantalla


  Background: Usuario ingreso a la pagina
    Given me encuentro en la pagina de Adidas



  Scenario Outline:Escenario1 Encontrar producto
    When encuentre el producto
      |<Producto>|
    Then podre mirar <Producto> en pantalla
    Examples:
      |Producto|
      |TIRO TK JKT CUW|


  Scenario Outline:Escenario2 Encontrar producto
    When encuentre el producto
      |<Producto>|
    Then podre mirar <Producto> en pantalla
    Examples:
      |Producto|
      |Chaqueta Adicolor Logo Grande|