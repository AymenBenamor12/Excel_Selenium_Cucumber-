package com.e2eTests.automation.stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.FormulairePageObejects;
import com.e2eTests.automation.pageObjects.ParametrePageObjects;
import com.e2eTests.automation.utils.CommondMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormulaireStepDef extends CommondMethods{

	private  FormulairePageObejects formulairePageObejects = new FormulairePageObejects();
	private CommondMethods commonMethods = new CommondMethods();
	private ParametrePageObjects parametrePageObjects = new ParametrePageObjects();
	public FormulaireStepDef()  {
		driver = Setup.driver;
		PageFactory.initElements(driver, FormulairePageObejects.class);
	}

@Given("^je me connecte sur l'application  demo$")
public void je_me_connecte_sur_l_application_demo() throws Throwable {
	
	commonMethods.openURLWithConfigFile("url");
}

@When("^je vais remplir le formulaire par excel$")
public void je_remplir_le_champ_firstname( ) throws Throwable {
	formulairePageObejects.excelMethode(null);
	
}
@When("^je click sur le radio gender$")
public void je_click_sur_le_radio_gender() throws Throwable {
	formulairePageObejects.genderMethode();
}



@When("^faire une screenshotuser \"([^\"]*)\"$")
public void faire_une_screenshotuser(String screenshot) throws Throwable {
	parametrePageObjects.scrennshot(screenshot);
}

@When("^je click  sur le bouton submit$")
public void je_click_sur_le_bouton_submit() throws Throwable {
	parametrePageObjects.sumbitMethode();
}

@Then("^je obtient un message de confirmation$")
public void je_obtient_un_message_de_confirmation() throws Throwable {
	formulairePageObejects.messageMethode();
	formulairePageObejects.closeMethode();
}



}
