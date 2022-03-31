Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar


  @Acerinox

  Scenario: Añadir Contrato en Acerinox
    Given accedo a cliente  selleciona el Acerinox
    When entro en la Contratos en la izquierda
    And abre menu y elegi Gestión de contratos
    And hago clic en el boton Añadir
    And relleno el numero de contrato "000020223003-A"
    And relleno Descripción "test"
    And selecciona una contratista
    And hago clic en el perfil y selleciona una
    And hago clic en centros de trabajo y selleciona una
    And hago clic a Añadir Responsable
    And se abre la pantalla de responsable y hago clic a seleccione
    And selecciona una responsable y hago clic en el boton
    And hago clic a Nueva Personas de contacto
    And hago clic en seleccione y e abre pantalla con personas. Elegi uno
    And hago clic en el boton guardar



  @Berge

    Scenario: Añadir Contrato en Berge
      Given accedo a cliente  selleciona el Acerinox
      When entro en la Contratos en la izquierda
      And abre menu y elegi Gestión de contratos
      And hago clic en el boton Añadir
      And relleno el numero de contrato "000020223003-B"
      And relleno Descripción "test"
      And selecciona una contratista
      And hago clic a negocio y selecciona una
      And hago clic en la zona y selecciona una
      And hago clic en la sociedad y seleciona una
      And hago clic sociedad-división y seleciona una
      And hago clic a riesgo y selecciona una
      And hago clic a Añadir Responsable
      And se abre la pantalla de responsable y hago clic a seleccione
      And selecciona una responsable y hago clic en el boton
      And hago clic a Nueva Personas de contacto
      And hago clic en seleccione y e abre pantalla con personas. Elegi uno
      And hago clic en el boton guardar

  @Cemex

    Scenario: Añadir Contrato en Cemex
        Given accedo a cliente  selleciona el Cemex
        When entro en la Contratos en la izquierda
        And abre menu y elegi Gestión de contratos
        And hago clic en el boton Añadir
        And relleno el numero de contrato "000020223003-C"
        And relleno Descripción "test"
        And selecciona una contratista
        And hago clic a negocio y selecciona una
        And hago clic en la región y selecciona una
        And hago clic en la centro y seleciona una
        And hago clic actividad y seleciona una
        And hago clic a riesgos especiales y selecciona una
        And hago clic a Añadir Responsable
        And se abre la pantalla de responsable y hago clic a seleccione
        And selecciona una responsable y hago clic en el boton
        And hago clic a Nueva Personas de contacto
        And hago clic en seleccione y e abre pantalla con personas. Elegi uno
        And hago clic en el boton guardar


  @Cimsa

     Scenario: Añadir Contrato en Cimsa
        Given accedo a cliente  selleciona el Cemex
          When entro en la Contratos en la izquierda
          And abre menu y elegi Gestión de contratos
          And hago clic en el boton Añadir
          And relleno el numero de contrato "000020223003-Ci"
          And relleno Descripción "test"
          And selecciona una contratista
          And hago clic a negocio y selecciona una
          And hago clic en la región y selecciona una
          And hago clic en la centro y seleciona una
          And hago clic actividad y seleciona una
          And hago clic a riesgos especiales y selecciona una
          And hago clic a Añadir Responsable
          And se abre la pantalla de responsable y hago clic a seleccione
          And selecciona una responsable y hago clic en el boton
          And hago clic a Nueva Personas de contacto
          And hago clic en seleccione y e abre pantalla con personas. Elegi uno
          And hago clic en el boton guardar


  @FreseniusMedicalCare

      Scenario: Añadir Contrato en FreseniusMedicalCare
        Given accedo a cliente  selleciona el FreseniusMedical Care
        When entro en la Contratos en la izquierda
            And abre menu y elegi Gestión de contratos
            And hago clic en el boton Añadir
            And relleno el numero de contrato "000020223003-FMC"
            And relleno Descripción "test"
            And selecciona una contratista
            And hago clic en la sociedad y seleciona una
            And hago clic en centros de trabajo y selleciona una
            And hago clic actividad y seleciona una
            And hago clic a Añadir Responsable
            And se abre la pantalla de responsable y hago clic a seleccione
            And selecciona una responsable y hago clic en el boton
            And hago clic a Nueva Personas de contacto
            And hago clic en seleccione y e abre pantalla con personas. Elegi uno
            And hago clic en el boton guardar

  @MetrodeMalaga
  Scenario: Añadir Contrato en MetrodeMalaga
    Given accedo a cliente  selleciona el MetrodeMalaga
    When entro en la Contratos en la izquierda
    And abre menu y elegi Gestión de contratos
    And hago clic en el boton Añadir
    And relleno el numero de contrato "000020223003-MdM"
    And relleno Descripción "test"
    And selecciona una contratista
    And hago clic actividad y seleciona una
    And hago clic departamento y seleciona una
    And hago clic a Añadir Responsable
    And se abre la pantalla de responsable y hago clic a seleccione
    And selecciona una responsable y hago clic en el boton
    And hago clic a Nueva Personas de contacto
    And hago clic en seleccione y e abre pantalla con personas. Elegi uno
    And hago clic en el boton guardar

  @Naturgy
  Scenario: Añadir Contrato en Naturgy
    Given accedo a cliente  selleciona el Naturgy
    When entro en la Contratos en la izquierda
    And abre menu y elegi Gestión de contratos
    And hago clic en el boton Añadir
    And relleno el numero de contrato "000020223003-N"
    And relleno Descripción "test"
    And selecciona una contratista
    And hago clic negocio y seleciona una
    And hago clic área y seleciona una
    And hago clic departamento y seleciona una
    And hago clic Centro de trabajo y seleciona una
    And hago clic a Añadir Responsable
    And se abre la pantalla de responsable y hago clic a seleccione
    And selecciona una responsable y hago clic en el boton
    And hago clic a Nueva Personas de contacto
    And hago clic en seleccione y e abre pantalla con personas. Elegi uno
    And hago clic en el boton guardar


  @TMB
  Scenario: Añadir Contrato en TMB
    Given accedo a cliente  selleciona el TMB
    When entro en la Contratos en la izquierda
    And abre menu y elegi Gestión de contratos
    And hago clic en el boton Añadir
    And relleno el numero de contrato "000020223003-TMB"
    And relleno Descripción "test"
    And selecciona una contratista
    And hago clic riesgo y seleciona una
    And hago clic departamento y seleciona una
    And hago clic a Añadir Responsable
    And se abre la pantalla de responsable y hago clic a seleccione
    And selecciona una responsable y hago clic en el boton
    And hago clic a Nueva Personas de contacto
    And hago clic en seleccione y e abre pantalla con personas. Elegi uno
    And hago clic en el boton guardar















