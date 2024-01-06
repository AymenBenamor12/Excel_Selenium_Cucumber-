package com.e2eTests.automation.pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.e2eTests.automation.utils.CommondMethods;
import com.e2eTests.automation.utils.Constants;
import com.e2eTests.automation.utils.ExcelUtils;
import com.e2eTests.automation.utils.Setup;

public class FormulairePageObejects extends CommondMethods  {
	
	
	
	 
	// calling the ExcelUtils class method to initialise the workbook and sheet
	 ParametrePageObjects ParametrePageObjects = new ParametrePageObjects();
   
	// creating object of ExcelUtils class
	    public final static ExcelUtils excelUtils = new ExcelUtils();

	    // using the Constants class values for excel file path
	    public static String excelFilePath = Constants.Path_TestData + Constants.File_TestData;
    
    /*Locators*/
	
	final static String FIRSTNAME_ID = "firstName";
	final static String LASTTNAME_ID = "lastName";
	final static String EMAILTNAME_ID = "userEmail";
	final static String GENDER_ID = "gender-radio-1";
	final static String NUMBER_ID = "userNumber";
	final static String ADDRESS_ID = "currentAddress";
	final static String SUBMIT_ID = "submit";
    final static String MESSAGE_XPATH ="//div[text()='Thanks for submitting the form']";
	final static String CLOSEBTN_ID ="closeLargeModal";
	
	/*@FindBy*/
	@FindBy(how= How.ID, using=FIRSTNAME_ID)
	public static WebElement firstName;
	
	@FindBy(how= How.ID, using=LASTTNAME_ID)
	public static WebElement lastName;
	
	@FindBy(how= How.ID, using=EMAILTNAME_ID)
	public static WebElement email;
	
	@FindBy(how= How.ID, using=GENDER_ID)
	public static WebElement genderr;
	
	@FindBy(how= How.ID, using=NUMBER_ID)
	public static WebElement number;
	
	@FindBy(how= How.ID, using=ADDRESS_ID)
	public static WebElement adress;
	
	@FindBy(how= How.ID, using=SUBMIT_ID)
	public static WebElement submit;
	
	@FindBy(how = How.XPATH, using= MESSAGE_XPATH)
	public static WebElement confirmationMessage;
	
	@FindBy(how = How.ID, using= CLOSEBTN_ID)
	public static WebElement closeBtn ;
	
	
	/*Methods*/
	  public static void excelMethode(String args[]) throws IOException
	    {
	    

	        // calling the ExcelUtils class method to initialise the workbook and sheet
	        excelUtils.setExcelFile(excelFilePath, "STUDENT_DATA");

	        // iterate over all the row to print the data present in each cell.
	        for (int i1 = 1; i1 <= excelUtils.getRowCountInSheet(); i1++)
	        {
	            // Enter the values read from Excel in firstname,lastname,mobile,email,address
	        	 firstName.sendKeys(excelUtils.getCellData(i1, 0));
	            lastName.sendKeys(excelUtils.getCellData(i1, 1));
	            email.sendKeys(excelUtils.getCellData(i1, 2));
	            number.sendKeys(excelUtils.getCellData(i1, 3));
	            adress.sendKeys(excelUtils.getCellData(i1, 4));
	       	 if (confirmationMessage.isDisplayed()) {
	             // if the message is displayed , write PASS in the excel sheet
	   			 ExcelUtils.setCellValue(i1, 6, "PASS", excelFilePath);
	             
	         } else {
	             //if the message is not displayed , write FAIL in the excel sheet
	       	   ExcelUtils.setCellValue(i1, 6, "FAIL", excelFilePath);
	         }
	   	}

	        
	    }
	
		public static void genderMethode() {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].click();", genderr);
	}
		public static void sumbitMethode() {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submit);
	
	}
		public static void messageMethode() {
			 if (confirmationMessage.isDisplayed()) {
	             // if the message is displayed , write PASS in the excel sheet
	             System.out.println("PASS");
	             
	         } else {
	             //if the message is not displayed , write FAIL in the excel sheet
	        	 System.out.println("FAIL");
	         }
		}
		public static void closeMethode() {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].click();", closeBtn);
	}
		
	
	
	
}

