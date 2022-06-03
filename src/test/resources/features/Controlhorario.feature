Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


  @Controlhorario

  Scenario:Control de horarrios manual

    Given entra en la ciente y elegi el cliente Cemex
    When hacer clic en control de horarios en la barra izquierda
    And hacer clic en control manual
    And hacer clic en el desplegable centro de trabajo
    And y selecciona uno
    Then hace clic en el boton buscar