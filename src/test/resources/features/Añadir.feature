Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


  @Contrato
  Scenario: Añadir contrato

    Given entro en la Contratos en la izquierda
    When abre menu y elegi Gestión de contratos
    And hago clic en el boton Añadir
    And relleno el numero de contrato "000020222503"
    And relleno Descripción "test"
    And selecciona una contratista
    And selecciona una centro de trabajo
    And selecciona una departamento
    And selecciona un perfil
    And hago clic a Añadir Responsable
    And se abre la pantalla de responsable y hago clic a seleccione
    And selecciona una responsable y hago clic en el boton
    And hago clic a Nueva Personas de contacto
    And creo una nueva Persona de contacto
    And hago clic a boton de Guardar
    And tengo la palabra "Se ha guardado el contrado correctamente"
    And valido el contrato con el boton validar
    Then el estado de contrado esta validada


    @Subcontrado

    Scenario: Añadir subcontrato
      Given entro en la Contratos en la izquierda
      When abre menu y elegi Gestión de contratos
      And hago clic en el boton Añadir
      And escribo del numero "000020222403" de contrado y hago clic
      And selecciona un Subcontratista Nivel de contratación 1
      And hago clic en el boton subir documento y subir uno
      And hago clic a boton de nueva persona de contacto y ir al boton seleccione persona de contacto
      And ir al boton a Guardar
      Then el subcontrado esta guardado correctamente y esta en el estado Pendiente



