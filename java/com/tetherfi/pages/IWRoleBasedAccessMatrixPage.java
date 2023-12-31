package com.tetherfi.pages;

import com.tetherfi.model.ivr.IntroMessageAnnouncementDetails;
import com.tetherfi.utility.FileUploader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IWRoleBasedAccessMatrixPage extends BasePage {

    public IWRoleBasedAccessMatrixPage(WebDriver driver){super(driver);}

    @FindBy(css=".ibox-title h5")
    private WebElement iwRoleBasedAccessMatrix;
    
    @FindBy(css="#create")
    private WebElement addRecordBtn;
    
    @FindBy(css="#create")
    private WebElement addNewRecordBtn;
    
    @FindBy(css = ".k-grid-edit")
    private WebElement editButton;
    
    @FindBy(css = ".k-grid-CustomDelete")
    private WebElement deleteButton;
    
    @FindBy(xpath="//button[@class='k-button k-button-icontext k-grid-excel']")
    private WebElement exporttoexcel;
    
    public boolean isIWRoleBasedAccessMatrixPageDisplayed() {
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        return iwRoleBasedAccessMatrix.isEnabled();
    }
    
    public boolean isAddRecdButtonDisplayed() {
		Boolean status = false;
		try {
    		if(addRecordBtn.isDisplayed() && addRecordBtn.isEnabled())
    			status = true;
    	}catch(Exception e) {
    		status = false;
    	}
		return status;
	}
	
    public void clickOnAddRecdBtn() {
		selectWebElement(addRecordBtn);
	}
    
	public boolean isAddBtnDisplayed() {
    	return addNewRecordBtn.isDisplayed() && addNewRecordBtn.isEnabled();
    }
	
    public boolean isEditBtnDisplayed() {
    	Boolean status = false;
    	try {
    		if(editButton.isDisplayed() && editButton.isEnabled())
    			status = true;
    	}catch(Exception e) {
    		status = false;
    	}
		return status;
    }
    
    public boolean isDeleteBtnDisplayed() {
    	Boolean status = false;
    	try {
    		if(deleteButton.isDisplayed() && deleteButton.isEnabled())
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
