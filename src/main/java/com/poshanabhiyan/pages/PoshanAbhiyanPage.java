package com.poshanabhiyan.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.poshanabhiyan.model.user.PoshanAbhiyanDetails;

public class PoshanAbhiyanPage extends BasePage{

		public PoshanAbhiyanPage(WebDriver driver) {
			super(driver);
		}
		@FindBy(css=".ibox-title h5")
	    private WebElement chatMenuDescription;
		
		@FindBy(xpath="//i[@class='fas fa-bars']")
		private WebElement CMDImg;
		
		@FindBy(css="#create")
		private WebElement addNewChatMenuDescriptionBtn;
		
		@FindBy(css = ".k-grid-CustomDelete")
	    private WebElement deleteButton;
		
		@FindBy(css = ".k-grid-edit")
	    private WebElement editButton;
		
		@FindBy(xpath="//*[@id=\"export\"]/button")
	    private WebElement exporttoexcel;
		
		@FindBy(css=".k-edit-form-container .k-grid-update")
	    private WebElement saveBtn;

	    @FindBy(css=".toast-message")
	    private WebElement successmsg;
	    
	    @FindBy(css="#toast-container .toast-error .toast-message")
	    private List<WebElement> errorMsg;

	    @FindBy(css=".search-link")
	    private WebElement searchLink;

	    @FindBy(css=".modal-body .form-inline .form-group .k-select")
	    private List<WebElement> selectSearchColumn;

	    @FindBy(css="ul[id='1001sColumnName_listbox'] li")
	    private List<WebElement> columnNameList;

	    @FindBy(css="ul[id='1001sCriteria_listbox'] li")
	    private List<WebElement> searchTypeList;

	    @FindBy(css=".modal-body .form-inline .form-group .k-textbox")
	    private List<WebElement> searchText;

	    //@FindBy(css=".modal-footer .k-primary")
	    //private WebElement searchBtn;
	    
	    @FindBy(xpath="//i[@class='fas fa-search']")
	    private WebElement searchBtn;

	    @FindBy(css="#tGrid .k-grid-content")
	    private WebElement gridContent;

	    @FindBy(css=".k-grid-CustomDelete")
	    private WebElement deleteBtn;

	    @FindBy(css=".form-group #ModifyReason1")
	    private  WebElement deleteReasonTextBox;

	    @FindBy(css=".k-grid-edit")
	    private WebElement editBtn;

	    @FindBy(css=".k-edit-form-container #ModifyReason")
	    private  WebElement modifyReasonTextBox;

	    @FindBy(id="yesButton")
	    private WebElement yesBtn;

	    @FindBy(id="noButton")
	    private WebElement noBtn;

		@FindBy(css=".k-grid-cancel")
		private WebElement cancelBtn;

		@FindBy(css=".k-edit-form-container")
		private WebElement editFormContainer;

		@FindBy(css="div[style='display: block; z-index: 10002; opacity: 0.5;']")
		private WebElement deleteContainer;
		   
		@FindBy(xpath="//span[@class='k-input-value-text']")
		private WebElement pagerSize;
	    
		@FindBy(css="a[title='Go to the next page']")
		private WebElement nextPageIcon;
			    
		@FindBy(xpath="//p[@class='k-reset']")
		private WebElement groupby;
			    
		@FindBy(css="a[title='Go to the first page']")
		private WebElement firstPageIcon;
			    
		@FindBy(css="a[title='Go to the previous page']")
		private WebElement previousPageIcon;
			
		@FindBy(xpath="//i[@class='fas fa-expand']")
		private WebElement maximize;
					
		@FindBy(xpath="//div[@class='ibox float-e-margins fullscreen']")
		private WebElement fullscreen;
					 
		@FindBy(xpath="//i[@class='fas fa-compress']")
		private WebElement minimize;
			
		@FindBy(xpath="//div[@data-role='droptarget']")
		private WebElement droptarget;
			    
		@FindBy(xpath="//tbody/tr/td/p[@class='k-reset']/../../following-sibling::tr/td[4]")
		private WebElement groupbyMenuName;
			
		@FindBy(xpath="//a[text()='Language']")
		private WebElement Language;
			    
		@FindBy(xpath="//button[text()='Clear All']")
		private WebElement clearall;
			    
		@FindBy(xpath="//button[text()='Close']")
		private WebElement searchClose;
			    
		@FindBy(xpath="//div[@class='k-grid-norecords']")
		private WebElement norecords;
			    
		@FindBy(xpath="//i[@class='fas fa-sync fa-spin']")
		private WebElement clearsearch;
			
		@FindBy(css=".k-pager-numbers .k-state-selected")
		private WebElement pageNumber;
			
		@FindBy(css="a[title='Go to the last page']")
		private WebElement lastPageIcon;
				    
		@FindBy(xpath="//span[@class='k-icon k-i-arrow-s k-button-icon']/..")
		private WebElement pagerDropdown;
		
		@FindBy(css=".k-grid-update")
		private WebElement saveButton;
				    
		@FindBy(css=".k-animation-container ul li")
		private List<WebElement> pageSizeListBox;
				    
		@FindBy(css="th a[class='k-header-column-menu']")
		private List<WebElement> headersDropdown;
				    
		@FindBy(css="div[style*='overflow: visible'] span[class^='k-link']")
		private List<WebElement> headersColumns;
				    
		@FindBy(css="th span[class='k-link']")
		private List<WebElement> headersText;		
				    
		@FindBy(xpath="//div[@class='k-grid-content k-auto-scrollable']/table/tbody/tr")
		private List<WebElement> tablerecord;
				   
		@FindBy(xpath="//span[@class='k-pager-info k-label']")
		private WebElement items;
				    
		@FindBy(id="navbarheader")
		private WebElement header;
				    
		@FindBy(xpath="//tbody/tr/td[2]")
		private WebElement rowdata;
				    
		@FindBy(xpath="//span[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow']")
		private WebElement coloumnarrow;
				    
		@FindBy(id="tGrid")
		private WebElement auditGridContent;
		
		@FindBy(id="MenuId")
		private WebElement MenuIdTextbox;
		
		@FindBy(id="MenuName")
		private WebElement MenuNameTextbox;
		
		@FindBy(id="Intent")
		private WebElement IntentTextbox;
		
		@FindBy(xpath="//span[text()='Menu Name']")
		private WebElement MenuName;
		
		@FindBy(xpath="//span[text()='Intent']")
		private WebElement Intent;
		
		@FindBy(css = ".modal-body .form-inline .form-group .k-select")
		private List<WebElement> selectSearchCol;
		
		@FindBy(css="ul[id='1001sCriteria_listbox'] li")
		private List<WebElement> searchCriteriaDropDwn;
		
		@FindBy(id = "1001sTextToSearch")
		private WebElement searchTextBox;
	    
	    @FindBy(css = ".modal-footer .button-theme")
		private WebElement searchSearchBtn;
	    
	    
	    
	    @FindBy(name = "SelectTheme")
	    private WebElement themeDropdown;
		
	    @FindBy(name = "SelectLevel")
	    private WebElement levelDropdown;
	    
	    @FindBy(name = "awc_center")
	    private WebElement awcDropdown;
	    
	    @FindBy(name = "SelectActivity")
	    private WebElement activityDropdown;
	    
	    @FindBy(css = "input[name='SelectDateFrom']")
	    private WebElement fromDate;
	    
	    @FindBy(css = "input[name='SelectDateTo']")
	    private WebElement toDate;
	    
	    @FindBy(css = "input[name='CountAdultMale']")
	    private WebElement adultMale;
	    
	    @FindBy(css = "input[name='CountAdultFemale']")
	    private WebElement adultFemale;
	    
	    @FindBy(css = "input[name='CountChildMale']")
	    private WebElement childMale;
	    
	    @FindBy(css = "input[name='CountChildFemale']")
	    private WebElement childFemale;
	    
	    @FindBy(css = ".submit_button_box button[type='submit']")
	    private WebElement submitBtn;
	    
	    @FindBy(css = ".form-submitted-section p")
	    private WebElement submitMsg;
	    
		

		public boolean addPoshanAbhiyanRecords(PoshanAbhiyanDetails poshanAbhiyanDetails) throws Exception {
			boolean status = true;
			
			driver.navigate().refresh();
			Thread.sleep(5000);
			
			Select theme = new Select(themeDropdown);
			theme.selectByVisibleText(poshanAbhiyanDetails.getTheme());
			Thread.sleep(1000);

			Select level = new Select(levelDropdown);
			level.selectByVisibleText(poshanAbhiyanDetails.getLevel());
			Thread.sleep(1000);
			
			Select awc = new Select(awcDropdown);
			awc.selectByVisibleText(poshanAbhiyanDetails.getAwc());
			Thread.sleep(1000);
			
			Select activity = new Select(activityDropdown);
			activity.selectByVisibleText(poshanAbhiyanDetails.getActivity());
			Thread.sleep(2000);
			
			Runtime.getRuntime().exec("C:\\Sinch\\study\\PoshanAbhiyaanAutomation\\files\\date.exe");
			Thread.sleep(5000);
			
			selectWebElement(adultMale);
			enterValueToTxtBox1(adultMale, poshanAbhiyanDetails.getAdultMale());
			Thread.sleep(1000);
			
			selectWebElement(adultFemale);
			enterValueToTxtBox1(adultFemale, poshanAbhiyanDetails.getAdultFemale());
			Thread.sleep(1000);
			
			selectWebElement(childMale);
			enterValueToTxtBox1(childMale, poshanAbhiyanDetails.getChildMale());
			Thread.sleep(1000);
			
			selectWebElement(childFemale);
			enterValueToTxtBox1(childFemale, poshanAbhiyanDetails.getChildFemale());
			Thread.sleep(1000);
			
			scrollvertically();
			
			Thread.sleep(3000);
			
			selectWebElement(submitBtn);
			Thread.sleep(3000);
			if(submitMsg.getText().trim().equals("Succesfully Submitted")) {
				System.out.println("Poshan Abhiyaan Data entry Successful for : "+poshanAbhiyanDetails.getTheme() +" - "+poshanAbhiyanDetails.getActivity());
			} else {
				System.out.println("Poshan Abhiyaan Data entry Failed for : "+poshanAbhiyanDetails.getTheme() +" - "+poshanAbhiyanDetails.getActivity());
			}

			return status;
		}

}
