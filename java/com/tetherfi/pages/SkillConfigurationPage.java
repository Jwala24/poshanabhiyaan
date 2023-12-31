package com.tetherfi.pages;

import com.tetherfi.model.ivr.IntroMessageAnnouncementDetails;
import com.tetherfi.model.ivr.OperatingHoursDetails;
import com.tetherfi.model.user.SkillConfigurationDetails;
import com.tetherfi.utility.FileUploader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkillConfigurationPage extends BasePage {

    public SkillConfigurationPage(WebDriver driver){super(driver);}

    @FindBy(css=".ibox-title h5")
    private WebElement skillConfiguration;
    
    @FindBy(css="#create")
    private WebElement addNewRecordBtn;
    
    @FindBy(css = ".k-grid-edit")
    private WebElement editButton;
    
    @FindBy(css = ".k-grid-CustomDelete")
    private WebElement deleteButton;
    
    @FindBy(xpath="//button[@class='k-button k-button-icontext k-grid-excel']")
    private WebElement exporttoexcel;
    
    @FindBy(xpath="//i[@class='fas fa-cog']")
    private WebElement SCImg;
    
    @FindBy(xpath="//i[@class='fas fa-expand']")
	private WebElement maximize;
	
	@FindBy(xpath="//div[@class='ibox float-e-margins fullscreen']")
	private WebElement fullscreen;
	 
	@FindBy(xpath="//i[@class='fas fa-compress']")
	private WebElement minimize;
	
	@FindBy(xpath="//span[@class='k-input']")
    private WebElement pagerSize;
    
    @FindBy(css="a[aria-label='Go to the next page']")
    private WebElement nextPageIcon;
    
    @FindBy(xpath="//p[@class='k-reset']")
    private WebElement groupby;
    
    @FindBy(css="a[aria-label='Go to the first page']")
    private WebElement firstPageIcon;
    
    @FindBy(css="a[aria-label='Go to the previous page']")
    private WebElement previousPageIcon;
    
    @FindBy(css=".k-pager-numbers .k-state-selected")
    private WebElement pageNumber;
    
    @FindBy(css="a[aria-label='Go to the last page']")
    private WebElement lastPageIcon;
    
    @FindBy(css=".k-pager-sizes .k-icon")
    private WebElement pagerDropdown;
    
    @FindBy(css=".k-animation-container ul li")
    private List<WebElement> pageSizeListBox;
    
    @FindBy(css="th a[class='k-header-column-menu']")
    private List<WebElement> headersDropdown;
    
    @FindBy(css="div[style*='overflow: visible'] span[class^='k-link']")
    private List<WebElement> headersColumns;
    
    @FindBy(css="th a[class='k-link']")
    private List<WebElement> headersText;		
    
    @FindBy(xpath="//div[@class='k-grid-content k-auto-scrollable']/table/tbody/tr")
    private List<WebElement> tablerecord;
   
    @FindBy(xpath="//span[@class='k-pager-info k-label']")
	private WebElement items;
    
    @FindBy(id="navbarheader")
	private WebElement header;
    
    @FindBy(xpath="//span[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow']")
    private WebElement coloumnarrow;
    
    @FindBy(id="tGrid")
    private WebElement auditGridContent;
    
    @FindBy(css = ".fa-search")
    private WebElement searchBtn;

    @FindBy(css = ".modal-body .form-inline .form-group .k-select")
    private List<WebElement> selectSearchCol;

    @FindBy(css="ul[id='1001sColumnName_listbox'] li")
    private List<WebElement> columnNameList;
    
    @FindBy(css="ul[id='1002sColumnName_listbox'] li")
    private List<WebElement> columnNameListtwo;

    @FindBy(css = "#1001sFormDropDown .k-i-arrow-60-down")
    private List<WebElement> selectSearchCriteria;

    @FindBy(css="ul[id='1001sCriteria_listbox'] li")
    private List<WebElement> searchCriteriaDropDwn;
    
    @FindBy(css="ul[id='1002sCriteria_listbox'] li")
    private List<WebElement> searchCriteriaDropDwntwo;
    
    @FindBy(id = "1001sTextToSearch")
    private WebElement searchTextBox;
    
    @FindBy(css = ".modal-footer .button-theme")
    private WebElement searchSearchBtn;
    
    @FindBy(css=".k-grid-content")
    private WebElement gridContent;
    
    @FindBy(css = "#toast-container .toast-error .toast-message")
    private List<WebElement> errorMsg;
    
    @FindBy(xpath="//a[text()='Skill Name']")
    private WebElement SkillName;
    
    @FindBy(xpath="//div[@data-role='droptarget']")
    private WebElement droptarget;
    
    @FindBy(xpath="//tbody/tr/td/p[@class='k-reset']/../../following-sibling::tr/td[4]")
    private WebElement groupbySkillName;
    
    @FindBy(xpath="//tbody/tr/td[3]")
    private WebElement rowdata;
    
    @FindBy(xpath="//button[text()='Clear All']")
    private WebElement clearall;
    
    @FindBy(xpath="//button[text()='Close']")
    private WebElement searchClose;
    
    @FindBy(xpath="//div[text()='No records to display']")
    private WebElement norecords;
    
    @FindBy(xpath="//i[@class='fas fa-sync']")
    private WebElement clearsearch;
    
    @FindBy(xpath="//a[@class='k-button k-bare k-button-icon k-window-action']")
    private List<WebElement> closebtn;
    
    @FindBy(id = "ModifyReason1")
    private WebElement deleteReasonTextBox;
    
    @FindBy(id="yesButton")
    private WebElement yesBtn;
    
    @FindBy(id="noButton")
    private WebElement nobtn;
    
    @FindBy(css="input[placeholder='Enter Skill ID']")
    private WebElement skillIdTextbox;
    
    @FindBy(id="SkillName")
    private WebElement skillNameTextbox;
    
    @FindBy(css="input[placeholder='Enter Skill Extension']")
    private List<WebElement> skillExtensionTextbox;
    
    @FindBy(css="span[aria-owns='Prioritylevel_listbox']")
    private WebElement skillPriorityDropDown;
    
    @FindBy(css="ul[id='Prioritylevel_listbox'] li")
    private List<WebElement> skillPriorityList;
    
    @FindBy(id="SkillTimeOutTime")
    private WebElement skillTimeout;
    
    @FindBy(id="SLATime")
    private WebElement acceptedSla;
    
    @FindBy(css="span[aria-owns='IsEnabled_listbox']")
    private WebElement enabledDropDown;
    
    @FindBy(css="ul[id='IsEnabled_listbox'] li")
    private List<WebElement> enabledList;
    
    @FindBy(css=".k-edit-form-container .k-grid-update")
    private WebElement saveBtn;

    @FindBy(css=".k-grid-cancel")
    private WebElement cancelBtn;
    
    @FindBy(css=".toast-message")
    private WebElement successmsg;
    
    @FindBy(css=".k-edit-form-container #ModifyReason")
    private  WebElement modifyReasonTextBox;
    
    @FindBy(xpath="//a[text()='Skill ID']")
    private WebElement SkillID;
    
    public boolean isSkillConfigurationPageDisplayed() {
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        return skillConfiguration.isEnabled();
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

    public boolean verifylogo() {
		if(isElementExist(SCImg))
				return true;
		else
		return false;
	}
	public boolean maximizewindow() {
		selectWebElement(maximize);
		waitForJqueryLoad(driver);
		if(fullscreen.isEnabled())
			return true;
		else 
		{return false;}
	}
	public boolean minimizewindow() {
		selectWebElement(minimize);
		waitForJqueryLoad(driver);
		if(header.isDisplayed())
		{
			return true;
		}
		else 
			return false; 
	}

	public boolean verifyExportToExcel(String filePath) {
		final File folder = new File(filePath);
		for (final File f : folder.listFiles()) {
		    if (f.getName().startsWith("SkillConfiguration")) {
		        f.delete();
		    }
		}
		selectWebElement(exporttoexcel);
		waitForJqueryLoad(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Boolean Status=verifyExportPageFileDownload(filePath, "SkillConfiguration");
		return Status;
	}
	public boolean verifyexportToExcelSheet(List<Map<String, String>> maplist) {
		List<Map<String,String>> UI=getdata(); 
		if(UI.equals(maplist))
		return true;
		else
		return false;
	}
	
	private List<Map<String,String>> getdata(){
		int item=Integer.valueOf(items.getText().split("of ")[1].split(" items")[0]);
        int pagersize=Integer.valueOf(pagerSize.getText());
        int pages=(item%pagersize==0)?item/pagersize-1:item/pagersize;
		List<Map<String,String>> arr=new ArrayList<Map<String,String>>();
		for(int k=0;k<=pages;k++){
		waitUntilWebElementIsVisible(auditGridContent);
		List<WebElement> rows=auditGridContent.findElements(By.tagName("tr"));
		List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
		String col=null;
		for(int i=1;i<rows.size();i++) {
			Map<String,String> map = new HashMap<String,String>();
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=1;j<headers.size();j++) {
				if(headers.get(j).getText().equals("Last Changed On")){
					col=cols.get(j).getText().substring(0,10);
					}
				else
					col=cols.get(j).getText();
				map.put(headers.get(j).getText(),col);
			}
			map.remove("");
			
			arr.add(map);
		}
		if(k!=pages)
		{
			nextPageIcon.click();
			waitForJqueryLoad(driver);}
		}
			return arr;
	}
	public boolean verifyDatabase(String query) {
		selectWebElement(SkillID);
		List<Map<String,String>> database=database(query);
		System.out.println(database);
		List<Map<String,String>> UI=gettable(); 
		System.out.println(UI);
		if(UI.equals(database))
			return true;
		else
			return false;
	}
	
	public List<Map<String, String>> gettable() {
		int item=Integer.valueOf(items.getText().split("of ")[1].split(" items")[0]);
        int pagersize=Integer.valueOf(pagerSize.getText());
        int pages=(item%pagersize==0)?item/pagersize-1:item/pagersize;
		List<Map<String,String>> arr=new ArrayList<Map<String,String>>();
		for(int k=0;k<=pages;k++){

		waitUntilWebElementIsVisible(auditGridContent);
		List<WebElement> rows=auditGridContent.findElements(By.tagName("tr"));
		List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
		for(int i=1;i<rows.size();i++) {
			Map<String,String> map = new HashMap<String,String>();
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String col=null;
			for(int j=1;j<headers.size();j++){
				if(headers.get(j).getText().equals("Enabled")){
					if(cols.get(j).getText().equals("Yes"))
					col="1";
					else 
						col="0";
					}
				else if(headers.get(j).getText().equals("Skill Priority")) {
					if(cols.get(j).getText().equals("Top"))
						col="1";
					else if(cols.get(j).getText().equals("High"))
						col="2";
					else if(cols.get(j).getText().equals("Medium"))
						col="3";
					else 
						col="4";
				}
				else
					col=cols.get(j).getText();
				map.put(headers.get(j).getText(),col);
			}
			map.remove("");
			map.remove("Accepted SL");
			map.remove("Time Out");
			arr.add(map);
		}
		if(k!=pages)
		{
			nextPageIcon.click();
			waitForJqueryLoad(driver);}
		}
			return arr;
	}
	public boolean ExporttoExcelWithoutData(SkillConfigurationDetails details) throws Exception {
		searchSkillConfigurationRecord(details.getSkillID());
		waitForJqueryLoad(driver);
		Thread.sleep(1000);
		selectWebElement(exporttoexcel);
		waitUntilWebElementListIsVisible(errorMsg);
		if(errorMsg.get(0).getText().equals("There is no record to export"))
			return true;
		else
		return false;
	}
	private void searchSkillConfigurationRecord(String skillID) throws Exception {
		selectWebElement(searchBtn);
        selectWebElement(selectSearchCol.get(0));
        selectDropdownFromVisibleText(columnNameList,"Skill ID");
        selectWebElement(selectSearchCol.get(1));
        selectDropdownFromVisibleText(searchCriteriaDropDwn,"Is equal to");
        enterValueToTxtField(searchTextBox,skillID);
        selectWebElement(searchSearchBtn);
        waitForJqueryLoad(driver);
        waitUntilWebElementIsVisible(gridContent);
	}

	public void SortByAscending() {
		selectWebElement(SkillName);
		selectWebElement(exporttoexcel);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void SortByDescending() {
		selectWebElement(SkillName);
		selectWebElement(SkillName);
		selectWebElement(exporttoexcel);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean verifyArrowMoveForPreviousAndNextPage(){
        boolean status=false;
        if(!nextPageIcon.getAttribute("class").contains("k-state-disabled")){
        int pagenumber=Integer.valueOf(getTextFromWebElement(pageNumber));
        selectWebElement(nextPageIcon);
        int nextnumber=Integer.valueOf(getTextFromWebElement(pageNumber));
        selectWebElement(previousPageIcon);
        int previousnumber=Integer.valueOf(getTextFromWebElement(pageNumber));
        if(nextnumber==(pagenumber+1) && pagenumber==previousnumber){status=true;}
        }else{
            System.out.println("previous and next page icon disabled");status=true;
        }
        return status;
	}
	public boolean verifyArrowMoveForFirstAndLastPage(){
        boolean status=false;
        if(!lastPageIcon.getAttribute("class").contains("k-state-disabled")){
            int pagenumber=Integer.valueOf(getTextFromWebElement(pageNumber));
            selectWebElement(lastPageIcon);
            int nextnumber=Integer.valueOf(getTextFromWebElement(pageNumber));
            selectWebElement(firstPageIcon);
            int previousnumber=Integer.valueOf(getTextFromWebElement(pageNumber));
            if(nextnumber>pagenumber && pagenumber==previousnumber){status=true;}
        }else{
            System.out.println("previous and next page icon disabled");status=true;
        }
        return status;
    }
	public boolean verifyNumberOfItemsPerPage() {
        boolean status = false;
        try {
          //  if (norecords.size() <= 0) {
                int item = Integer.valueOf(items.getText().split("of ")[1].split(" items")[0]);
                selectWebElement(pagerDropdown);
                Thread.sleep(1500);
                for (int i = 0; i < pageSizeListBox.size(); i++) {
                    if(Integer.valueOf(pageSizeListBox.get(i).getText())>item){continue;}
                    selectDropdownFromVisibleText(pageSizeListBox, pageSizeListBox.get(i).getText());
                    waitForJqueryLoad(driver);
                    int totalItems = Integer.valueOf(items.getText().split("of ")[1].split(" items")[0]);
                    int pagersize = Integer.valueOf(pagerSize.getText());
                    int pages = (totalItems % pagersize == 0) ? item / pagersize : item / pagersize+1;
                    int totalRows=(gridContent.findElements(By.tagName("tr")).size());
                    selectWebElement(lastPageIcon);
                    waitForJqueryLoad(driver);
                    int lastPageNumber = Integer.valueOf(pageNumber.getText());
                    if (item == totalItems && pages == lastPageNumber&&totalRows==pagersize) {
                        status = true;
                    } else {System.out.println(items+":"+totalItems+"\t"+pages+":"+lastPageNumber+"\t"+totalRows+":"+pagersize);
                        status = false;
                        break;
                    }selectWebElement(pagerDropdown);Thread.sleep(1500);
                }
           // }
        } catch (Exception e) {
            e.printStackTrace();
        } return status;
    }
    public boolean verifyTotalNumberOfItemsPerPageDetails(){
        String item = items.getText();
        return item.matches("(\\d.*) - (\\d.*) of (\\d.*) items");
    }
    public boolean verifyDropDownOfAllHeaders() {
        boolean status = false;
        try {for (WebElement ele : headersDropdown) {
            scrollToElement(ele);
            if (!ele.isDisplayed()) {
                continue;
            } else {
                selectWebElement(ele);
                    Thread.sleep(1000);
                if (headersColumns.get(0).getText().equals("Sort Ascending")) {
                    if (headersColumns.get(1).getText().equals("Sort Descending")) {
                        if (headersColumns.get(2).getText().equals("Columns")) {
                            status = true;selectWebElement(ele);
                        }
                    }
                }
                if (status) {
                } else {
                    break;
                }
            }
        }} catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    public boolean verifycolumnsHeaderDisabled() {
        boolean status = false;
        WebElement ele = headersDropdown.get(0);
            if (ele.isDisplayed()) {
                try {
                    selectWebElement(ele);
                    Thread.sleep(1000);
                    selectWebElement(headersColumns.get(2));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i =3; i < headersColumns.size(); i++) {
                    System.out.println(headersColumns.get(i).getText());
                    WebElement checkbox = headersColumns.get(i).findElement(By.tagName("input"));
                    if (checkbox.isSelected()) {
                        checkbox.click();
                    } else {
                    }
                    for (WebElement ele1 : headersText) {
                        if (ele1.getText().equals(headersColumns.get(i).getText())) {
                            status = true;
                            break;
                        }
                    }
                    if (!status) {
                        checkbox.click();
                    } else {
                        break;
                    }
                }

            }
        return status;
    }
    public boolean verifycolumnsHeaderEnabled(){
        boolean status=false;
        WebElement ele= headersDropdown.get(0);
            if(ele.isDisplayed()){
                try {
                    selectWebElement(ele);
                    Thread.sleep(1000);
                    selectWebElement(headersColumns.get(2));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 3; i <headersColumns.size(); i++) {
                    WebElement checkbox = headersColumns.get(i).findElement(By.tagName("input"));
                    checkbox.click();
                    if (checkbox.isSelected()) {
                    } else {
                        checkbox.click();
                    }
                    for (WebElement ele1 : headersText) {
                        if (ele1.getText().equals(headersColumns.get(i).getText())) {
                            status = true;
                            break;
                        }
                    }
                    if (status) {
                    } else {
                        break;
                    }
                }
            }
        return status;
    }
    
    public boolean groupby() {
		DragandDrop(SkillName,droptarget);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(groupby.getText().split(": ")[1].equals(groupbySkillName.getText()))
		{return true;}
		else
			return false;		
	}
    
    public boolean verifydeleteNo(SkillConfigurationDetails details) throws Exception {
    	searchSkillConfigurationRecord(details.getSkillID());		
    	selectWebElement(deleteButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		enterValueToTxtField(deleteReasonTextBox,details.getDeleteReason());
		selectWebElement(nobtn);
		if(rowdata.getText().equals(details.getSkillName()))
				return true;
		else
		return false;
	}
	public boolean deleteclose(SkillConfigurationDetails details) throws Exception {
		searchSkillConfigurationRecord(details.getSkillName());		
    	selectWebElement(deleteButton);		
    	Thread.sleep(2000);
    	enterValueToTxtField(deleteReasonTextBox,details.getDeleteReason());
    	moveToElement(closebtn.get(2));
		selectWebElement(closebtn.get(2));
		if(rowdata.getText().equals(details.getSkillName()))
				return true;
		else
		return false;
	}
	public boolean clearAll(SkillConfigurationDetails details) throws Exception {
		selectWebElement(searchBtn);
        selectWebElement(selectSearchCol.get(0));
        selectDropdownFromVisibleText(columnNameList,"Skill Name");
        selectWebElement(selectSearchCol.get(1));
        selectDropdownFromVisibleText(searchCriteriaDropDwn,"Is equal to");
        enterValueToTxtField(searchTextBox,details.getSkillName());
        selectWebElement(clearall);
        if(searchTextBox.isEnabled())
        	return true;
        else
		return false;
	}

	public boolean verifyclose() {
		selectWebElement(searchClose);
		if(gridContent.isDisplayed())
			return true;
		else
		return false;
	}
	public boolean verifyinvalidsearch(SkillConfigurationDetails details) throws Exception {
		searchSkillConfigurationRecord(details.getSkillName());		
		if(norecords.isDisplayed())
			return true; 
			else
				return false;
	}
	public boolean verifyclearsearch() {
		selectWebElement(clearsearch);
		if(gridContent.isDisplayed())
			return true;
		else
		return false;
	}

	public boolean addNewCancel(SkillConfigurationDetails details) throws Exception {
		String actualitems=items.getText();
		selectWebElement(addNewRecordBtn);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillIdTextbox, details.getSkillID());
        enterValueToTxtField(skillNameTextbox, details.getSkillName());
        enterValueToTxtFieldWithoutClear(skillExtensionTextbox.get(1), details.getSkillExtension());
        selectWebElement(skillPriorityDropDown);
        selectDropdownFromVisibleText(skillPriorityList,details.getSkillPriority());
        enterValueToTxtField(skillTimeout, details.getTimeout());
        enterValueToTxtField(acceptedSla, details.getAcceptedSL());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getEnabled());
        selectWebElement(cancelBtn);
        if(actualitems.equals(items.getText()))
        	return true;
        else
		return false;
	}

	public void addNewSkillConfigurationRecord(SkillConfigurationDetails details) throws Exception {
		selectWebElement(addNewRecordBtn);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillIdTextbox, details.getSkillID());
        enterValueToTxtField(skillNameTextbox, details.getSkillName());
        enterValueToTxtFieldWithoutClear(skillExtensionTextbox.get(1), details.getSkillExtension());
        selectWebElement(skillPriorityDropDown);
        selectDropdownFromVisibleText(skillPriorityList,details.getSkillPriority());
        enterValueToTxtField(skillTimeout, details.getTimeout());
        enterValueToTxtField(acceptedSla, details.getAcceptedSL());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getEnabled());
        selectWebElement(saveBtn);
        try {
        	selectWebElement(cancelBtn);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

	public String getMessage() {
		if(successmsg.isDisplayed()) {
			return successmsg.getText();}
        else {
		return errorMsg.get(0).getText();   }      
	}
	
	public boolean verifyMessage() {
		waitUntilWebElementListIsVisible(errorMsg);									 
		if(errorMsg.size()>0)
		return false;
		else 
			return true;
	}

	public void addNewRecordWithoutSkillID(SkillConfigurationDetails details) throws Exception {
		selectWebElement(addNewRecordBtn);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillNameTextbox, details.getSkillName());
        enterValueToTxtField(skillExtensionTextbox.get(1), details.getSkillExtension());
        selectWebElement(skillPriorityDropDown);
        selectDropdownFromVisibleText(skillPriorityList,details.getSkillPriority());
        enterValueToTxtField(skillTimeout, details.getTimeout());
        enterValueToTxtField(acceptedSla, details.getAcceptedSL());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getEnabled());
        selectWebElement(saveBtn);	
        selectWebElement(cancelBtn);
	}

	public void addNewRecordWithoutSkillName(SkillConfigurationDetails details) throws Exception {
		selectWebElement(addNewRecordBtn);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillIdTextbox, details.getSkillID());
        enterValueToTxtFieldWithoutClear(skillExtensionTextbox.get(1), details.getSkillExtension());
        selectWebElement(skillPriorityDropDown);
        selectDropdownFromVisibleText(skillPriorityList,details.getSkillPriority());
        enterValueToTxtField(skillTimeout, details.getTimeout());
        enterValueToTxtField(acceptedSla, details.getAcceptedSL());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getEnabled());
        selectWebElement(saveBtn);
        selectWebElement(cancelBtn);
	}

	public void addNewRecordWithoutSkillExtension(SkillConfigurationDetails details) throws Exception {
		selectWebElement(addNewRecordBtn);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillIdTextbox, details.getSkillID());
        enterValueToTxtField(skillNameTextbox, details.getSkillName());
        selectWebElement(skillPriorityDropDown);
        selectDropdownFromVisibleText(skillPriorityList,details.getSkillPriority());
        enterValueToTxtField(skillTimeout, details.getTimeout());
        enterValueToTxtField(acceptedSla, details.getAcceptedSL());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getEnabled());
        selectWebElement(saveBtn);
        selectWebElement(cancelBtn);		
	}

	public void addNewRecordWithoutSkillPriority(SkillConfigurationDetails details) throws Exception {
		selectWebElement(addNewRecordBtn);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillIdTextbox, details.getSkillID());
        enterValueToTxtField(skillNameTextbox, details.getSkillName());
        enterValueToTxtField(skillExtensionTextbox.get(1), details.getSkillExtension());
        enterValueToTxtField(skillTimeout, details.getTimeout());
        enterValueToTxtField(acceptedSla, details.getAcceptedSL());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getEnabled());
        selectWebElement(saveBtn);
        selectWebElement(cancelBtn);		
	}

	public void addNewRecordWithoutEnabled(SkillConfigurationDetails details) throws Exception {
		selectWebElement(addNewRecordBtn);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillIdTextbox, details.getSkillID());
        enterValueToTxtField(skillNameTextbox, details.getSkillName());
        enterValueToTxtField(skillExtensionTextbox.get(1), details.getSkillExtension());
        selectWebElement(skillPriorityDropDown);
        selectDropdownFromVisibleText(skillPriorityList,details.getSkillPriority());
        enterValueToTxtField(skillTimeout, details.getTimeout());
        enterValueToTxtField(acceptedSla, details.getAcceptedSL());
        selectWebElement(saveBtn);
        selectWebElement(cancelBtn);		
	}

	public boolean editcancel(SkillConfigurationDetails details) throws Exception {
		searchSkillConfigurationRecord(details.getSkillID());
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        selectWebElement(editButton);
        waitForJqueryLoad(driver);
        enterValueToTxtField(skillNameTextbox, details.getUpdatedSkillName());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getUpdatedEnabled());
        selectWebElement(cancelBtn);
        if(rowdata.getText().equals(details.getSkillName()))
        	return true;
        else
        return false;
	}

	public void editSkillConfigurationRecord(SkillConfigurationDetails details) throws Exception {
		searchSkillConfigurationRecord(details.getSkillID());
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        selectWebElement(editButton);
        waitForJqueryLoad(driver);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        enterValueToTxtField(skillNameTextbox, details.getUpdatedSkillName());
        selectWebElement(enabledDropDown);
        selectDropdownFromVisibleText(enabledList,details.getUpdatedEnabled());	
        enterValueToTxtField(modifyReasonTextBox, details.getModifyReason());
        selectWebElement(saveBtn);
	}

	public void deleteWaitTimeColorConfigRecord(SkillConfigurationDetails details) throws Exception {
		searchSkillConfigurationRecord(details.getSkillID());		
    	selectWebElement(deleteButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		enterValueToTxtField(deleteReasonTextBox,details.getDeleteReason());
		selectWebElement(yesBtn);		
	}

	
}
