Feature: Cambiar rol y buyer
  yo quiero cambiar el rol y buyer

Background:
  Given usuario esta en la pagina
  When usuario entrar en el entorno staging
  Then usuario deberia ver la pagina
  Then entro en la pagina Controlar


@Cambiarrol

Scenario: Menu de roles
  Given hago click en el boton de roles
  When se abre el menu de roles y elegi el rol supplier
  And con el mover el raton ir al menu y elegi operator
  Then yo veo que puedo cambiar los roles










  @Cambiarbuyer
  Scenario Outline: Menu de buyers
    When hago clic en el boton de buyers
    Then se abre la opcion de buyers y elegi "<buyer>"
    Examples:
      | Acerinox    |
      | Berge       |
      | Cemex       |
      | Cepsa       |
      | CIMSA       |
      | Naturgy     |
      | FreseniusMC |
      | MetroMalaga |
      | Naturgy     |
      | Brazil      |
      | Chile       |
      | Mexico      |
      | Panama      |
      | Dominica    |
      | TMB         |


    @Cambiarbuyers

    Scenario: Es posible cambiar los clientes en el dropdown menu
      Given estoy en el dropdown menu
      Then se visualiza todos clientes en el dropdown

        | Acerinox    |
        | Berge       |
        | Cemex       |
        | Cepsa       |
        | CIMSA       |
        | Naturgy     |
        | FreseniusMC |
        | MetroMalaga |
        | Naturgy     |
        | Brazil      |
        | Chile       |
        | Mexico      |
        | Panama      |
        | Dominica    |
        | TMB         |
