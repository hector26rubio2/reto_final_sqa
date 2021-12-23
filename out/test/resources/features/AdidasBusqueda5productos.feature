Feature: HU-001 Buscador Adidas
  Yo como usuario de Adidas
  Quiero buscar  5 producto en la pagina
  Para ver el nombre del producto en pantalla

  Scenario Outline: Buscador producto
    Given me encuentro en la pagina de Adidas
    When  busque los productos el producto <NombreProducto> en pantalla
    Then podre ver en pantalla <NombreProducto>
    Examples:
    |NombreProducto|
    |'Tenis adidas Ultraboost DNA x LEGO® Colors'|
    |'Guantes de Arquero Predator Competition'|
    |'Camiseta Real Madrid Icons'|
    |'Guantes de Arquero Predator Competition'|
    |'W FI MARIM UN B'|
