package com.poshanabhiyan.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){super(driver);}

    @FindBy(css=".login-input-group-div")
    private WebElement loginForm;

    @FindBy(css="input[name='password']")
    private WebElement password;
    
    @FindBy(css="input[name='username']")
    private WebElement username;

    @FindBy(css="button[type='submit']")
    private WebElement loginBtn;
    
    public boolean isLoginPageDisplayed(){
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        return loginForm.isEnabled();
    }

    public void login(String user, String pass) throws Exception{
    	try {
    		waitForJqueryLoad(driver);
    		waitForLoad(driver);
    		selectWebElement(username);
    		enterValueToTxtField(username,user);
    		selectWebElement(password);
    		enterValueToTxtField(password,pass);
    		clickOn(loginBtn);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }

    public void overrideSecurityConcern() {
		try {
			//advButton.click();
			//proLink.click();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
    
    public void openNewWindow(){
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		}
    
    public void launchUrl() {
		driver.get("http://Administrator:Paytm@654321@172.16.2.61:47700/IWIVRUI#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

	public void enterEmail(String emailId) throws Exception {
		selectWebElement(username);
		enterValueToTxtField(username, emailId);
		clickOn(loginBtn);
	}
    


}
