package com.tetherfi.pages;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import  java.util.List;

import com.tetherfi.model.chat.CallBackManagementDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSOSurveyQAPage extends BasePage {
    public CSOSurveyQAPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".ibox-title h5")
    private WebElement csoSurveyQA;
    
    @FindBy(css = "#create")
    private WebElement addCsoSurveyQARecdBtn;
    
    @FindBy(css = ".k-grid-edit")
    private WebElement editBtn;
    
    @FindBy(css = ".k-grid-CustomDelete")
    private WebElement deleteBtn;
    
    @FindBy(xpath="//button[@class='k-button k-button-icontext k-grid-excel']")
	private WebElement exporttoexcel;

    public boolean isCSOSurveyQAPageDisplayed() throws InterruptedException {
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        return csoSurveyQA.isEnabled();
    }
    
    public boolean isAddBtnDisplayed() {
    	return addCsoSurveyQARecdBtn.isDisplayed() && addCsoSurveyQARecdBtn.isEnabled();
    }
    
    public boolean isEditBtnDisplayed() {
    	Boolean status = false;
    	try {
    		if(editBtn.isDisplayed() && editBtn.isEnabled())
    			status = true;
    	}catch(Exception e) {
    		status = false;
    	}
		return status;
    }
    
    public boolean isDeleteBtnDisplayed() {
    	Boolean status = false;
    	try {
    		if(deleteBtn.isDisplayed() && deleteBtn.isEnabled())
    			status = true;
    	}catch(Exception e) {
    		status = false;
    	}
		return status;
    }
    
    public boolean isExportBtnDisplayed() {
    	return exporttoexcel.isDisplayed() && exporttoexcel.isEnabled();
    }

}