Feature: Login
  como usuario quiero entrar con clave y usuarnombre

  Background:
    Given usuario esta en la pagina
    When usuario entrar en el entorno staging
    Then usuario deberia ver la pagina
    Then entro en la pagina Controlar



 @ContratoAtlantik
   Scenario: Añadir contrato para Atlantik
   Given acceda a Atlanticcopper
   And hace click en la Contratos en la barra derecha
   And enta a Gestion de contartos
   And acceda a boton para Añadir
   And rellena numero de contrato
   And rellena Descripcion
   And selecciona contratista
   And selecciona la actividad
   And selecciona departamento
   And Añadir Responsable
   And pinchar en estado y elegi uno
   And entra nueva persona contacto
   And abre la tabla y elegi uno
   And guarda el contrato
   Then validarlo

@Añadircontrato
Scenario Outline: Añadir nuevo contrato
  Given entra a cliente "<Cliente>"
  And entro en la Contratos en la izquierda
  And abre menu y elegi Gestión de contratos
  And hago clic en el boton Añadir
  And relleno el numero de contrato "000020221304acde"
  And relleno por el Descripcion "test1"
  And ir al contratista y selecciona una
  And hago clic a perfil "<Perfil>"
  And hago clic a negocio y selecciona una "<Negocio>"
  And hago clic a area y selecciona una "<area>"
  And hago clic en la zona y selecciona una "<Zona>"
  And hago clic en la sociedad y seleciona una "<Sociedad>"
  And hago clic sociedadDivisión y seleciona una "<sociedadDivision>"
  And hago clic a riesgo y selecciona una "<riesgo>"
  And hago clic en la region y selecciona una "<region>"
  And hago clic en la centro y seleciona una "<centro>"
  And hago clic actividad y seleciona una "<actividad>"
  And hago clic a riesgos especiales y selecciona una "<riesgo especial>"
  And hago clic a departamento y selecciona una "<departamento>"
  And hago clic en centros de trabajo "<Centro Trabajo>"
  And hago clic a Añadir Responsable
  And se abre la pantalla de responsable y hago clic a seleccione
  And selecciona una responsable y hago clic en el boton
  And hago clic a Nueva Personas de contacto
  And hago clic en seleccione y e abre pantalla con personas. Elegi uno
  And hago clic en el boton guardar
  And tengo la palabra "Se ha guardado el contrado correctamente"
  And valido el contrato con el boton validar
  Then el estado de contrado esta validada

  Examples:
    | Cliente | Perfil          | Negocio | area  | Zona  | Sociedad | sociedadDivision | riesgo     | region | centro        | actividad | riesgo especial | departamento | Centro Trabajo |
    #| 21      | 2 | libre   | libre | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           | libre        | 9              |
    | 25      | libre           | 4       | libre | 3     | 2        | 1                | riesgoalto | libre  | libre         | libre     | libre           | libre        | libre          |
    #| 22      | libre           | 2       | libre | libre | libre    | libre            | libre      | 7      | Fabrica gador | 2         | 4               | libre        | libre          |
    #| 8       | 2               | libre   | 2     | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           | libre        | 9              |
    #| 26      | libre           | 1       | libre | libre | libre    | libre            | libre      | 1      | bunol         | 1         | 2               | libre        | libre          |
    #| 20      | libre           | libre   | libre | libre | 4        | libre            | libre      | libre  | libre         | 2         | libre           | libre        | 40             |
    #| 1       | libre           | libre   | 2     | libre | libre    | libre            | libre      | libre  | libre         | 3         | libre           | libre        | libre          |
    #| 6       | libre           | libre   | 2     | libre | libre    | libre            | libre      | libre  | libre         | 1         | libre           | libre        | libre          |
    # 11      | libre           | 2       | 2     | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           | 1            | 1              |
     #| 13      | libre           | 1       | 1            | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           | 1            | 1     |
    #| 24      | libre           |  2       |     1           | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           |   1           |  1     |
    #| 15      | libre           | 1        |     1           | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           |              |       |
    #| 16      | libre           | 1        |  1              | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           | 1             |  1     |
     #| 17      | libre           |  1       |   1             | libre | libre    | libre            | libre      | libre  | libre         | libre     | libre           |  1            |  1     |
     #| 5       | libre           | libre   | libre          | libre | libre    | libre            | 1      | libre  | libre         | libre     | libre           | 2          | libre |
















