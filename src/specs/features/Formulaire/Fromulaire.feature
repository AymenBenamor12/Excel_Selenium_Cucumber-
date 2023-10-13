Feature: Remplir le formulaire ans le site demo
  I want to use this template for my feature file

  @Formulaire
  Scenario Outline: Remplir le formulaire ans le site demo
    Given je me connecte sur l'application  demo
    When je remplir le champ firstname  "<firstname>"
    And je remplir le champ lastname  "<lastname>"
    And je remplir le champ useremail  "<useremail>"
    And je click sur le radio gender
    And je remplir le champ numero  "<numero>"
    And je remplir le champ currentAdress  "<currentAdress>"
    And faire une screenshotuser "<screenshot>"
    And je click  sur le bouton submit
    Then je obtient un message de confirmation

    Examples: 
      | firstname |lastname | useremail             | numero   | currentAdress | screenshot  |
      | aymen1    | Amor1    | aymen.benamor@enis.tn  | 23412279 | soussa        | screenshot1 |
      | aymen2    | amor2    | aymen.benamor1@enis.tn | 23415279 | soussa        | screenshot2 |
      | aymen3    | Amor3    | aymen.benamor2@enis.tn | 24356872 | soussa        | screenshot3 |
      | aymen4    | amor4    | aymen.benamor3@enis.tn | 23418279 | soussa        | screenshot4 |
      | aymen5    | Amor5    | aymen.benamor4@enis.tn | 23419279 | soussa        | screenshot5 |
