Feature: HU-003 Buscador adidas escenario fallido y exitoso
  Yo como usuario de Adidas
  Quiero buscar un producto en la plataforma
  Para ver el nombre del producto en pantalla



  Scenario: Busqueda Exitosa
    Given me encuentro en la pagina de Adidas
    When busque los productos
      |Guantes de Arquero Predator Competition|
    Then podre observar en pantalla
      |Guantes de Arquero Predator Competition|

  Scenario: Busqueda Fallida
    Given me encuentro en la pagina de Adidas
    When busque los productos
      |Chanclas Adilette Jeremy Scott Teddy|
    Then podre observar en pantalla
      |Chanclas Adilette Jeremy Scott Teddy|