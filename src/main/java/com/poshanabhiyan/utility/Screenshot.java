package com.poshanabhiyan.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.log4testng.Logger;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Screenshot {
	WebDriver driver;

	public void captureScreen(WebDriver driver,String foldername,String filename){
        try {
        	File file = new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\Screenshot\\" +foldername);
			if (!file.exists()) {
				System.out.println("File created " + file);
				file.mkdir();
			}
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\\\Screenshot\\" +foldername+"\\"+ filename+".jpg");
            FileHandler.copy(SrcFile, DestFile);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
	
	public Screenshot(WebDriver driver){this.driver=driver;}

    public void captureScreen(String foldername, String filename){
        try {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\Screenshot\\"+foldername+"\\" + filename+".jpg");
            FileUtils.copyFile(SrcFile, DestFile);
        }catch(Exception e){
        	 e.printStackTrace();
        	}
    }
}
