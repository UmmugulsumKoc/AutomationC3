Feature: Validacion documentos
  yo quiero mostrar filtros

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar

@Mostrarfiltro

Scenario:Validar

  Given hago clic en Validación
  When elegi Validar documentos
  And hago clic en Mostrar filtros
  And cambio Tipo a Trabajador
  And hago clic en el boton Buscar
  Then tengo la resultado
