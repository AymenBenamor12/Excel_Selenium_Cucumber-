Feature: Remplir le formulaire ans le site demo
  I want to use this template for my feature file

  @Formulaire23
 Scenario:  Remplir le formulaire ans le site demo
    Given je me connecte sur l'application  demo
    When je vais remplir le formulaire par excel
    And je click sur le radio gender
    And faire une screenshotuser "<screenshot>"
    And je click  sur le bouton submit
    Then je obtient un message de confirmation

   
