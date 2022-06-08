Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


 @AñadirAcerinox

 Scenario: Prueba añadir recurso


   Given cambia el rol a Supplier
   When elegir proveedor
   And pinchar a trabajadores en la barra derecha
   And pinchar el boton añadir trabajador
   And completar NIF, Apellidos, Nombre
   And completar tipo de posicion
   Then pinchar en guardar