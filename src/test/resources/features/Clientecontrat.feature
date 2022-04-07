Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar
    And accedo a cliente  selleciona el Cimsa
    And entro en la Contratos en la izquierda
    And abre menu y elegi Gestión de contratos
    And hago clic en el boton Añadir
    And relleno el numero de contrato para Acerinox "000020223003K"
    And relleno por el Descripcion "test1"
    And ir al contratista y selecciona una



  @Acerinox

  Scenario: Añadir Contrato en Acerinox

    And hago clic en el perfil y selleciona una
    And hago clic en centros de trabajo y selleciona una
    And entro a Añadir Responsable
    And se abre la pantalla de responsable y ir al boton seleccione
    And elegi una responsable y hago clic en el boton
    And hago clic a Nueva Personas de contacto
    And hago clic en seleccione y e abre pantalla con personas. Elegi uno
    And hago clic en el boton guardar
    Then ir al validar



  @Berge

    Scenario: Añadir Contrato en Berge

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

    And hago clic riesgo y seleciona una
    And hago clic departamento y seleciona una
    And hago clic a Añadir Responsable
    And se abre la pantalla de responsable y hago clic a seleccione
    And selecciona una responsable y hago clic en el boton
    And hago clic a Nueva Personas de contacto
    And hago clic en seleccione y e abre pantalla con personas. Elegi uno
    And hago clic en el boton guardar


  Scenario Outline: Añadir nuevo contrato
    Given entra a cliente "<Acerinox">
    When hago clic a perfil "<basico>"
    And hago clic en centros de trabajo "<gavaz>"
    And hago clic a negocio "<logistica>"
    And hago clic en la zona y selecciona una
    And hago clic en la sociedad y seleciona una
    And hago clic sociedad-división y seleciona una
    And hago clic a riesgo y selecciona una
    And hago clic en la región y selecciona una
    And hago clic en la centro y seleciona una
    And hago clic actividad y seleciona una
    And hago clic a riesgos especiales y selecciona una
    And hago clic a departamento y selecciona una
    And hago clic a area




    Examples:
    |Cliente|Perfil|Centro Trabajo|Negocio|Zona|Sociedad|sociedad-división|riesgo|region|centro|actividad|riesgo especial|departamento|area|
    |Acerinox|basico|gavaz        |
    |Berge   |      |             |logistica|
    |Cemex   |
    |Cimsa   |
    |FreseniusMedicalCare|
    |MetrodeMalaga       |
    |Naturgy             |
    |TMB                 |













