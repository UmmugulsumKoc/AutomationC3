Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


  Scenario Outline: Buscar

    Given entre en una cliente "<Cliente>"
    When hace clic a Buscar en la barra izquierda
    And hace clic Que esta buscando
    And elegi proveedor
    And ir al boton buscar
    And ir al boton cambiar filtro
    And ir a Que esta buscando y cambia a Contrato
    And ir al boton cambiar filtro
    And ir a Que esta buscando y cambia a Trabajador
    And ir al boton cambiar filtro
    And ir a Que esta buscando y cambia a Vehiculo
    And ir al boton cambiar filtro
    Then ir a Que esta buscando y cambia a Maquinaria

    Examples:

    |Cliente  |
    |  21     |
    #|   25    |
    #|   22    |
    #|   8     |
    #|   26    |
    #|  20     |
    #|   1     |
    #|    11   |
