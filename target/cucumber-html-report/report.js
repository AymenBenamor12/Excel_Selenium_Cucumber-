$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Formulaire/Fromulaire.feature");
formatter.feature({
  "line": 1,
  "name": "Remplir le formulaire ans le site demo",
  "description": "I want to use this template for my feature file",
  "id": "remplir-le-formulaire-ans-le-site-demo",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3965715200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Remplir le formulaire ans le site demo",
  "description": "",
  "id": "remplir-le-formulaire-ans-le-site-demo;remplir-le-formulaire-ans-le-site-demo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Formulaire23"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "je me connecte sur l\u0027application  demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "je vais remplir le formulaire par excel",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "je click sur le radio gender",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "faire une screenshotuser \"\u003cscreenshot\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "je click  sur le bouton submit",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "je obtient un message de confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "FormulaireStepDef.je_me_connecte_sur_l_application_demo()"
});
formatter.result({
  "duration": 2711272501,
  "status": "passed"
});
formatter.match({
  "location": "FormulaireStepDef.je_remplir_le_champ_firstname()"
});
formatter.result({
  "duration": 1995974101,
  "error_message": "java.lang.IllegalStateException: Cannot get a text value from a numeric cell\r\n\tat org.apache.poi.xssf.usermodel.XSSFCell.typeMismatch(XSSFCell.java:895)\r\n\tat org.apache.poi.xssf.usermodel.XSSFCell.getRichStringCellValue(XSSFCell.java:311)\r\n\tat org.apache.poi.xssf.usermodel.XSSFCell.getStringCellValue(XSSFCell.java:262)\r\n\tat com.e2eTests.automation.utils.ExcelUtils.getCellData(ExcelUtils.java:48)\r\n\tat com.e2eTests.automation.pageObjects.FormulairePageObejects.excelMethode(FormulairePageObejects.java:93)\r\n\tat com.e2eTests.automation.stepDefinitions.FormulaireStepDef.je_remplir_le_champ_firstname(FormulaireStepDef.java:32)\r\n\tat ✽.When je vais remplir le formulaire par excel(Formulaire/Fromulaire.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FormulaireStepDef.je_click_sur_le_radio_gender()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cscreenshot\u003e",
      "offset": 26
    }
  ],
  "location": "FormulaireStepDef.faire_une_screenshotuser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FormulaireStepDef.je_click_sur_le_bouton_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FormulaireStepDef.je_obtient_un_message_de_confirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current page URL is https://demoqa.com/automation-practice-form");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2162851500,
  "status": "passed"
});
});