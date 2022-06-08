Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


  Scenario: Entra a Biblotheka

    Given elegi una cliente
    When entra en la biblotheka en la barra derecha
    And abre una carpeta
