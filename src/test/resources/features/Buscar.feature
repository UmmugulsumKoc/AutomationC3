Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


  Scenario: Buscar
    Given entre en una cliente
    When hace clic a Buscar en la barra izquierda
    And hace clic Que esta buscando
    And elegi proveedor
    Then ir al boton buscar