package com.e2eTests.automation.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import utilities.ExcelUtils;

public class ParametrePageObjects extends FormulairePageObejects{
	
	



public static void scrennshot( String screenShot1) {
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
   File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

   //String destinationPath = "C:\\Users\\AYMEN\\Desktop\\excelProjet.screenshot.png";

   File destinationFile = new File("C:\\Users\\AYMEN\\Desktop\\screen shot\\"+screenShot1+".png");
   
   		try {
       FileUtils.copyFile(screenshotFile, destinationFile);
       System.out.println("Capture d'écran effectuée avec succès. Chemin du fichier : " + destinationFile.getAbsolutePath());
   } catch (IOException e) {
       System.out.println("Erreur lors de l'enregistrement du screenshot : " + e.getMessage());
   }
}
	
public static  void ecriremessage(String done) {
		System.out.println("Le Scenario est "+done);
	}
}
