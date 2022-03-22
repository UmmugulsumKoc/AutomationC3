Feature: Cambiar rol y buyer
  yo quiero cambiar el rol y buyer

Background:
  Given usuario esta en la pagina
  When usuario entrar en el entorno staging
  Then usuario deberia ver la pagina
  Then entro en la pagina Controlar


@Cambiarrol
Scenario Outline: Menu de roles
  When hago click en el boton de supplier
  Then yo veo los opciones y elegi uno

Examples:
|rol|
  |Achilles|
  |Supplier|
  |Operator|
  |Finance |


  @Cambiarbuyer
  Scenario Outline: Menu de buyers
    When hago clic en el boton de buyers
    Then se abre la opcion de buyers y elegi "<buyer>"
    Examples:
    |Acerinox|
    |Berge   |
    |Cemex   |
    |Cepsa   |
    |Çimsa   |
    |Indra   |
    |Naturgy |