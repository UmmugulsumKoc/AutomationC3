Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


 @Acceso
 Scenario: Hacer carnet manual

   Given entro en el cliente y cambiarlo a Cemex
   When en la izquierda hacer clic a Control de acceso
   And hacer clic en el boton de Control acceso
   And hacer clic por seleccionar un recurso
   And selecciona de recurso Vehiculo y hacer clic en el boton Buscar
   And selecciona un recurso y hacer click en el boton Carnet
   And hacer clic en el boton Imprimir
   Then se visualiza el carnet
