package com.tetherfi.pages;

import com.tetherfi.model.sms.SmsResponseTemplateDetails;
import com.tetherfi.utility.FileUploader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmsResponseTemplatePage extends BasePage {

	public SmsResponseTemplatePage(WebDriver driver){super(driver);}

    @FindBy(css=".ibox-title h5")
    private WebElement smsResponseTemplate;
    
    @FindBy(css="#create")
    private WebElement addNewRecordBtn;
    
    @FindBy(css = ".k-grid-edit")
    private WebElement editButton;
    
    @FindBy(css = ".k-grid-CustomDelete")
    private WebElement deleteButton;
    
    @FindBy(xpath="//button[@class='k-button k-button-icontext k-grid-excel']")
    private WebElement exporttoexcel;
    
    @FindBy(xpath = "//div[@id='tabstripsmstemplateMakerChecker']/ul/li")
    private List<WebElement> navTabs;
    
    @FindBy(css="#makeChanges")
    private WebElement makeChangesButton;
    
    @FindBy(xpath="//i[@class='fab fa-replyd']")
	private WebElement SRTImg;
	    
	@FindBy(xpath="//i[@class='fas fa-expand']")
	private WebElement maximize;
		
	@FindBy(xpath="//div[@class='ibox float-e-margins fullscreen']")
	private WebElement fullscreen;
		 
	@FindBy(xpath="//i[@class='fas fa-compress']")
	private WebElement minimize;
	
	@FindBy(css="#checkerGrid th[data-role='columnsorter']")
	private List<WebElement> approvedDataTableHeaders;

	@FindBy(css="#tGrid th[data-role='columnsorter']")
	private List<WebElement> auditTrailTableHeaders;
	
    @FindBy(css="ul[class='k-tabstrip-items k-reset'] li")
    private List<WebElement> SmsResponseTemplateTabs;
    
    @FindBy(id="goToAuditTrail")
    private WebElement goBackBtn;
    
    @FindBy(id="makeChanges")
    private WebElement makeSmsResponseTemplateChanges;
    
    @FindBy(css="#drillGrid th[data-role='columnsorter']")
    private List<WebElement> makerTableHeaders;
    
    @FindBy(css=".k-grid-cancel")
    private WebElement cancelBtn;
    
    @FindBy(css="a[aria-label='Go to the next page']")
    private List<WebElement> nextPageIcon;
    
    @FindBy(xpath="//p[@class='k-reset']")
    private WebElement groupby;
    
    @FindBy(css="a[aria-label='Go to the first page']")
    private List<WebElement> firstPageIcon;
    
    @FindBy(css="a[aria-label='Go to the previous page']")
    private List<WebElement> previousPageIcon;
    
    @FindBy(css=".k-pager-numbers .k-state-selected")
    private List<WebElement> pageNumber;
    
    @FindBy(css="a[aria-label='Go to the last page']")
    private List<WebElement> lastPageIcon;
    
    @FindBy(css=".k-pager-sizes .k-icon")
    private List<WebElement> pagerDropdown;
    
    @FindBy(css=".k-animation-container ul li")
    private List<WebElement> pageSizeListBox;
    
    @FindBy(css="#drillGrid th a[title='Column Settings']")
    private List<WebElement> headersDropdown;
    
    @FindBy(css="div[style*='overflow: visible'] span[class^='k-link']")
    private List<WebElement> headersColumns;
    
    @FindBy(css="#drillGrid th a[class='k-link']")
    private List<WebElement> headersText;		
    
    @FindBy(xpath="//div[@class='k-grid-content k-auto-scrollable']/table/tbody/tr")
    private List<WebElement> tablerecord;
   
    @FindBy(xpath="//span[@class='k-pager-info k-label']")
	private List<WebElement> items;
    
    @FindBy(id="navbarheader")
	private WebElement header;
    
    @FindBy(xpath="//span[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow']")
    private WebElement coloumnarrow;
    
    @FindBy(id="grid")
    private WebElement auditGridContent;
    
    @FindBy(css=".k-pager-sizes .k-input")
    private List<WebElement> pagerSize;
    
    @FindBy(css="#drillGrid .k-grid-content")
    private WebElement gridContent;
    
    @FindBy(id = "drillGrid")
    private WebElement grid;

    @FindBy(css = "#drillGrid .k-grouping-header")
    private WebElement dragColumnDestination;
    
    @FindBy(css=".modal-body .form-inline .form-group .k-select")
    private List<WebElement> selectSearchColumn;

    @FindBy(css="ul[id='1001sColumnName_listbox'] li")
    private List<WebElement> columnNameList;

    @FindBy(css="ul[id='1001sCriteria_listbox'] li")
    private List<WebElement> searchTypeList;

    @FindBy(css=".modal-body .form-inline .form-group .k-textbox")
    private List<WebElement> searchText;

    @FindBy(css=".modal-footer .k-primary")
    private WebElement searchBtn;
    
    @FindBy(css=".toast-message")
    private WebElement successmsg;

    @FindBy(css="#toast-container .toast-error .toast-message")
    private List<WebElement> errorMsg;

    @FindBy(css="#gridDiv2 .search-link")
    private WebElement searchLink;
    
    @FindBy(css="#gridDiv .search-link")
    private WebElement gridsearchLink;
    
    @FindBy(xpath="//div[@class='k-button k-upload-button']")
    private WebElement uploadfile;
    
    @FindBy(xpath="//div[text()='No records to display']")
    private WebElement norecords;
    
    @FindBy(css="#tcheckerGrid .k-grid-content")
    private WebElement approvedgridcontent;
    
    @FindBy(xpath="//tbody/tr/td[1]")
    private WebElement rowdata;
    
    @FindBy(css="#drillGrid tbody tr td")
    private List<WebElement> editrowdata;
    
    @FindBy(id = "ModifyReason")
    private WebElement modifyReasonTextBox;
    
    @FindBy(css=".form-group #ModifyReason1")
    private  WebElement deleteReasonTextBox;
    
    @FindBy(id="yesButton")
    private WebElement yesBtn;

    @FindBy(id="noButton")
    private WebElement noBtn;
    
    @FindBy(id="checkerGrid")
    private WebElement checkerGrid;
    
    @FindBy(xpath="//button[text()='Clear All']")
    private WebElement clearall;
    
    @FindBy(xpath="//button[text()='Close']")
    private WebElement searchClose;
    
    @FindBy(xpath="//i[@class='fas fa-sync']")
    private WebElement clearsearch;
    
    @FindBy(id="tabstripfaxtemplateMakerChecker")
    private List<WebElement> makerCheckerTab;
    
    @FindBy(css=".k-grid-update")
    private WebElement saveBtn;
    
    @FindBy(id="taskComplete")
    private WebElement taskCompleteBtn;

    @FindBy(id="MakerComments")
    private WebElement makerComments;
    
    @FindBy(id="submitMakerComment")
    private WebElement taskCompleteBtnAtMakerCommentsPopUp;
    
    @FindBy(id="Approve")
    private WebElement approveBtn;

    @FindBy(id="Reject")
    private WebElement rejectBtn;

    @FindBy(id="CheckerReason")
    private WebElement checkerReason;

    @FindBy(id="approveButton")
    private WebElement approveYesBtn;
    
    @FindBy(xpath="//a[text()='Text']")
    private List<WebElement> Text;
    
    @FindBy(id="Text")
    private WebElement TextTextbox;
    
    @FindBy(id="Intent")
    private WebElement IntentTextbox;
    
    @FindBy(css="span[aria-owns='Enable_listbox']")
    private WebElement EnableDropdown;
    
    @FindBy(css="ul[id='Enable_listbox'] li")
    private List<WebElement> EnableListbox;
    
    @FindBy(id="Source")
    private WebElement SourceTextbox;
    
    @FindBy(id="AlertCode")
    private WebElement AlertCodeTextbox;
    
    @FindBy(id="AppID")
    private WebElement AppIdTextbox;
    
    @FindBy(id="MessageDescription")
    private WebElement MessageDescriptionTextbox;
    
    @FindBy(id="ICOMTemplateID")
    private WebElement IcomTemplateIdTextbox;
    
    
    
    
    
    
    public boolean isSMSResponseTemplatePageDisplayed() {
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        return smsResponseTemplate.isEnabled();
    }
    
    public void navigateToTab(String tabname){
        waitUntilWebElementListIsVisible(navTabs);
        waitUntilWebElementListIsClickable(navTabs);
        for(WebElement ele: navTabs){
            if(ele.getText().equalsIgnoreCase(tabname)){selectWebElement(ele);break;}
        }
    }
    
    public boolean isMakeChangesBtnDisplayed() {
    	Boolean status = false;
    	try {
    		if(makeChangesButton.isDisplayed() && makeChangesButton.isEnabled())
    			status = true;
    	}catch(Exception e) {
    		status = false;
    	}
		return status;
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

	public void selectMakeChangesBtn() {
		selectWebElement(makeChangesButton);		
	}

	 public boolean verifylogo() {
		if(isElementExist(SRTImg))
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

    private ArrayList getHeadersfromTable(List<WebElement> e){
        ArrayList header=new ArrayList();
        for(int j=0;j<e.size();j++){
            scrollToElement(e.get(j));
            if(!e.get(j).getText().equals("")){header.add(e.get(j).getText());}
        }
        return header;
        }

	public boolean verifyApprovedDataTableHeaders() {
		ArrayList<String> Expected=new ArrayList<String>(Arrays.asList("Text","Intent","Enable","Source","Alert Code","App ID","Message Description","ICOM Template ID","Last Changed By","Last Changed On"));
        ArrayList Actual = getHeadersfromTable(approvedDataTableHeaders);
        System.out.println(Actual);
        Collections.sort(Expected);
        Collections.sort(Actual);
        return Actual.equals(Expected);
	}

	public void selectSmsResponseTemplateAuditTrailTab() {
		selectWebElement(SmsResponseTemplateTabs.get(1));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	public void selectSmsResponseTemplateAuditTrailTab1() {
		selectWebElement(SmsResponseTemplateTabs.get(0));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	public boolean verifyAuditTrailDataTableHeaders() {
		ArrayList<String> Expected=new ArrayList<String>(Arrays.asList("Request Id", "Transaction", "Function", "Status", "User Id", "Submission DateTime", "Maker Comments", "Old Values", "New Values", "Reviewed By","Review DateTime", "Checker Comments"));
        ArrayList Actual = getHeadersfromTable(auditTrailTableHeaders);
        System.out.println(Actual);
        Collections.sort(Expected);Collections.sort(Actual);
        return Actual.equals(Expected);
	}

	public void selectMakeSmsResponseTemplateChanges() {
		selectWebElement(makeSmsResponseTemplateChanges);
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	public boolean verifyAddNewSmsResponseTemplateRecordButton() {
		return addNewRecordBtn.isEnabled();
	}

	public boolean verifyGoBackButton() {
		return goBackBtn.isEnabled();
	}
	
	public void selectGoBackButton() throws Exception
	{
		selectWebElement(goBackBtn);
		Thread.sleep(2000);
	}

	public boolean verifyExportToExcelButton() {
		return exporttoexcel.isEnabled();
	}

	public boolean verifyMakerDataTableHeaders() {
		ArrayList<String> Expected=new ArrayList<String>(Arrays.asList("Text","Intent","Enable","Source","Alert Code","App ID","Message Description","ICOM Template ID","Last Changed By","Last Changed On"));
		ArrayList Actual = getHeadersfromTable(makerTableHeaders);
		System.out.println(Actual);
        Collections.sort(Expected);Collections.sort(Actual);
        return Actual.equals(Expected);
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
    public boolean verifycolumnsHeaderDisbaled() {
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
                for (int i = 3; i < headersColumns.size(); i++) {
                    // System.out.println(headersColumns.get(i).getText());
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
    
    public boolean verifyArrowMoveForPreviousAndNextPage(int i){
        boolean status=false;
        if(!nextPageIcon.get(i).getAttribute("class").contains("k-state-disabled")){
        int pagenumber=Integer.valueOf(getTextFromWebElement(pageNumber.get(i)));
        selectWebElement(nextPageIcon.get(i));
        int nextnumber=Integer.valueOf(getTextFromWebElement(pageNumber.get(i)));
        selectWebElement(previousPageIcon.get(i));
        int previousnumber=Integer.valueOf(getTextFromWebElement(pageNumber.get(i)));
        if(nextnumber==(pagenumber+1) && pagenumber==previousnumber){status=true;}
        }else{
            System.out.println("previous and next page icon disabled");status=true;
        }
        return status;
    }
    public boolean verifyArrowMoveForFirstAndLastPage(int i){
        boolean status=false;
        if(!lastPageIcon.get(i).getAttribute("class").contains("k-state-disabled")){
            int pagenumber=Integer.valueOf(getTextFromWebElement(pageNumber.get(i)));
            selectWebElement(lastPageIcon.get(i));
            int nextnumber=Integer.valueOf(getTextFromWebElement(pageNumber.get(i)));
            selectWebElement(firstPageIcon.get(i));
            int previousnumber=Integer.valueOf(getTextFromWebElement(pageNumber.get(i)));
            if(nextnumber>pagenumber && pagenumber==previousnumber){status=true;}
        }else{
            System.out.println("previous and next page icon disabled");status=true;
        }
        return status;
    }
    public boolean verifyNumberOfItemsPerPage(int z) {
        boolean status = false;
        try {
          //  if (norecords.size() <= 0) {
                int item = Integer.valueOf(items.get(z).getText().split("of ")[1].split(" items")[0]);
                selectWebElement(pagerDropdown.get(z));
                Thread.sleep(1500);
                for (int i = 0; i < pageSizeListBox.size(); i++) {
                    if(Integer.valueOf(pageSizeListBox.get(i).getText())>item){continue;}
                    selectDropdownFromVisibleText(pageSizeListBox, pageSizeListBox.get(i).getText());
                    waitForJqueryLoad(driver);
                    int totalItems = Integer.valueOf(items.get(z).getText().split("of ")[1].split(" items")[0]);
                    int pagersize = Integer.valueOf(pagerSize.get(z).getText());
                    int pages = (totalItems % pagersize == 0) ? item / pagersize : item / pagersize+1;
                    int totalRows=(gridContent.findElements(By.tagName("tr")).size());
                    selectWebElement(lastPageIcon.get(z));
                    waitForJqueryLoad(driver);
                    int lastPageNumber = Integer.valueOf(pageNumber.get(z).getText());
                    if (item == totalItems && pages == lastPageNumber&&totalRows==pagersize) {
                        status = true;
                    } else {System.out.println(items+":"+totalItems+"\t"+pages+":"+lastPageNumber+"\t"+totalRows+":"+pagersize);
                        status = false;
                        break;
                    }selectWebElement(pagerDropdown.get(z));Thread.sleep(1500);
                }
           // }
        } catch (Exception e) {
            e.printStackTrace();
        } return status;
    }
    public boolean verifyTotalNumberOfItemsPerPageDetails(int z){
        String item = items.get(z).getText();
        return item.matches("(\\d.*) - (\\d.*) of (\\d.*) items");
    }
    
    public boolean verifyExportToExcel(String filePath) {
		final File folder = new File(filePath);
		for (final File f : folder.listFiles()) {
		    if (f.getName().startsWith("SMS Response Template")) {
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
		Boolean Status=verifyExportPageFileDownload(filePath, "SMS Response Template");
		return Status;
	}
	public boolean verifyexportToExcelSheet(List<Map<String, String>> maplist) {
		List<Map<String,String>> UI=getdata(); 
		System.out.println(UI);
		System.out.println(maplist);
		if(UI.equals(maplist))
		return true;
		else
		return false;
	}
	
	private List<Map<String,String>> getdata(){
		int item=Integer.valueOf(items.get(2).getText().split("of ")[1].split(" items")[0]);
        int pagersize=Integer.valueOf(pagerSize.get(2).getText());
        int pages=(item%pagersize==0)?item/pagersize-1:item/pagersize;
		List<Map<String,String>> arr=new ArrayList<Map<String,String>>();
		for(int k=0;k<=pages;k++){
		waitUntilWebElementIsVisible(grid);
		List<WebElement> rows=grid.findElements(By.tagName("tr"));
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
			nextPageIcon.get(2).click();
			waitForJqueryLoad(driver);}
		}
			return arr;
	}
	
	public void dragColumntoGroup(String columnname) {
        List<WebElement> rows = grid.findElements(By.tagName("tr"));
        List<WebElement> columnHeaders = rows.get(0).findElements(By.tagName("th"));
        for (WebElement ele : columnHeaders) {
            if (ele.getText().equals(columnname)) {
                Actions builder = new Actions(driver);
                Action dragAndDrop = builder.clickAndHold(ele).moveToElement(dragColumnDestination).release(dragColumnDestination).build();
                dragAndDrop.perform();
            }
        }
    }

    public boolean verifyDragColumntoGroup(String colname) {

        return (dragColumnDestination.getText().equals(colname));
    }

	public boolean ExporttoExcelWithoutData(SmsResponseTemplateDetails details) throws Exception {
		searchSmsResponseTemplateRecord(details.getiCOMTemplateID());
		waitForJqueryLoad(driver);
		Thread.sleep(1000);
		selectWebElement(exporttoexcel);
		waitUntilWebElementListIsVisible(errorMsg);
		if(errorMsg.get(0).getText().equals("There is no record to export"))
			return true;
		else
		return false;
	}
	
	private void searchSmsResponseTemplateRecord(String iComTemplateID) throws Exception {
		selectWebElement(searchLink);
        selectWebElement(selectSearchColumn.get(0));
        selectDropdownFromVisibleText(columnNameList,"ICOM Template ID");
        selectWebElement(selectSearchColumn.get(1));
        selectDropdownFromVisibleText(searchTypeList,"Is equal to");
        enterValueToTxtField(searchText.get(0),iComTemplateID);
        selectWebElement(searchBtn);
        waitForJqueryLoad(driver);
        waitUntilWebElementIsVisible(gridContent);			
	}

	public boolean clearAll(SmsResponseTemplateDetails details) throws Exception {
		selectWebElement(gridsearchLink);
        selectWebElement(selectSearchColumn.get(0));
        selectDropdownFromVisibleText(columnNameList,"ICOM Template ID");
        selectWebElement(selectSearchColumn.get(1));
        selectDropdownFromVisibleText(searchTypeList,"Is equal to");
        enterValueToTxtField(searchText.get(0),details.getiCOMTemplateID());
	    selectWebElement(clearall);
			if(searchText.get(0).isEnabled())
	        	return true;
	        else
			return false;
		}
	public boolean verifyclose() {
		selectWebElement(searchClose);
		if(approvedgridcontent.isDisplayed())
			return true;
		else
		return false;
	}

	public void searchwithoutextsearch(SmsResponseTemplateDetails details) {
		selectWebElement(gridsearchLink);
        selectWebElement(selectSearchColumn.get(0));
        selectDropdownFromVisibleText(columnNameList,"ICOM Template ID");
        selectWebElement(selectSearchColumn.get(1));
        selectDropdownFromVisibleText(searchTypeList,"Is equal to");
        selectWebElement(searchBtn);	
        selectWebElement(searchClose);
	}


	public boolean verifyclearsearch() {
		selectWebElement(clearsearch);
		if(approvedgridcontent.isDisplayed())
			return true;
		else
		return false;
	}
	
	public String getSuccessMessage() {
		waitForJqueryLoad(driver);
		if(successmsg.isDisplayed())
			return successmsg.getText();
		else{return errorMsg.get(0).getText();}
        
	}
	
	public boolean getErrorMsg() {
		waitUntilWebElementListIsVisible(errorMsg);
		if(errorMsg.size()>0)
		return false;
		else
			return true;
	}
	
	public void SortByAscending() {
		selectWebElement(Text.get(1));
		selectWebElement(exporttoexcel);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void SortByDescending() {
		selectWebElement(Text.get(1));
		selectWebElement(Text.get(1));
		selectWebElement(exporttoexcel);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean verifyApprovedSectionData(SmsResponseTemplateDetails details) throws Exception {
		searchSmsResponseTemplateRecordApprovedData(details.getiCOMTemplateID());
		if(norecords.isDisplayed())
			return true; 
			else
				return false;
	}

	private void searchSmsResponseTemplateRecordApprovedData(String icomTemplateId) throws Exception {
		selectWebElement(gridsearchLink);
        selectWebElement(selectSearchColumn.get(0));
        selectDropdownFromVisibleText(columnNameList,"ICOM Template ID");
        selectWebElement(selectSearchColumn.get(1));
        selectDropdownFromVisibleText(searchTypeList,"Is equal to");
        enterValueToTxtField(searchText.get(0),icomTemplateId);
        selectWebElement(searchBtn);
        waitForJqueryLoad(driver);
        waitUntilWebElementIsVisible(approvedgridcontent);		
	}
	
	public boolean verifyDatabase(String query) {
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
		int item=Integer.valueOf(items.get(0).getText().split("of ")[1].split(" items")[0]);
        int pagersize=Integer.valueOf(pagerSize.get(0).getText());
        int pages=(item%pagersize==0)?item/pagersize-1:item/pagersize;
		List<Map<String,String>> arr=new ArrayList<Map<String,String>>();
		for(int k=0;k<=pages;k++){

		waitUntilWebElementIsVisible(checkerGrid);
		List<WebElement> rows=checkerGrid.findElements(By.tagName("tr"));
		List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
		for(int i=1;i<rows.size();i++) {
			Map<String,String> map = new HashMap<String,String>();
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String col=null;
			for(int j=0;j<headers.size();j++){
				scrollToElement(headers.get(j));
				if(headers.get(j).getText().equals("Last Changed On")){
					col=cols.get(j).getText().substring(11);
					}
				else
					col=cols.get(j).getText();
				map.put(headers.get(j).getText(),col);
			}
			map.remove("");
			map.remove("Preview");
			arr.add(map);
		}
		if(k!=pages)
		{
			nextPageIcon.get(0).click();
			waitForJqueryLoad(driver);}
		}
			return arr;
	}

	public boolean addCancelButton(SmsResponseTemplateDetails SmsResponseTemplateDetails) {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		selectWebElement(makeSmsResponseTemplateChanges);
		String actualitems=items.get(2).getText();
		selectWebElement(addNewRecordBtn);
		waitForJqueryLoad(driver);
        selectWebElement(cancelBtn);
        if(actualitems.equals(items.get(2).getText()))
        	return true;
        else
		return false;
	}

	public void addNewSmsResponseTemplateRecord(SmsResponseTemplateDetails SmsResponseTemplateDetails) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		selectWebElement(makeSmsResponseTemplateChanges);
		selectWebElement(addNewRecordBtn);
		waitForJqueryLoad(driver);	
        enterValueToTxtFieldWithoutClear(TextTextbox,SmsResponseTemplateDetails.getText());
        enterValueToTxtFieldWithoutClear(IntentTextbox,SmsResponseTemplateDetails.getIntent());
		selectWebElement(EnableDropdown);
        selectDropdownFromVisibleText(EnableListbox, SmsResponseTemplateDetails.getEnable());
        enterValueToTxtField(SourceTextbox,SmsResponseTemplateDetails.getSource());
        enterValueToTxtField(AlertCodeTextbox,SmsResponseTemplateDetails.getAlertCode());
        enterValueToTxtField(AppIdTextbox,SmsResponseTemplateDetails.getAppID());
        enterValueToTxtField(MessageDescriptionTextbox,SmsResponseTemplateDetails.getMessageDescription());
        enterValueToTxtField(IcomTemplateIdTextbox,SmsResponseTemplateDetails.getiCOMTemplateID());
        selectWebElement(saveBtn);
	}

	public boolean verifyAuditTrail(SmsResponseTemplateDetails SmsResponseTemplateDetails, String Transaction, String Status) {
		boolean stat=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable();
        if(firstRowData.get("Transaction").equalsIgnoreCase(Transaction)){
            if(firstRowData.get("Status").equalsIgnoreCase(Status)){
                if(firstRowData.get("Function").equalsIgnoreCase("SmsResponseTemplate")){
                       if(Transaction.equals("MakerCreate")){
                           Map<String,String> newvalues=new HashMap<>();
                            String[] d=firstRowData.get("New Values").split("\n");
                            for(String e:d){
                                String[]f=e.split(":",2);
                                if(f.length>1){newvalues.put(f[0],f[1]);}
                            }
                            if(verifyNewValues(SmsResponseTemplateDetails,newvalues)){
                                stat=true;}
                            else 
                            stat=false;
                       }
                       else{System.out.println("Data mismatch");}
                }else{System.out.println("Data mismatch:"+firstRowData.get("Function")+"\t"+"RoleManagement");}
            }else{System.out.println("Data mismatch:"+firstRowData.get("Status")+"\t"+Status);}
        }else{System.out.println("Data mismatch:"+firstRowData.get("Transaction")+"\t"+Transaction);}
        return stat;
	}

	private boolean verifyNewValues(SmsResponseTemplateDetails details, Map<String, String> newvalues) {
		Boolean Status=false;
		if(newvalues.get("Text").equals(details.getText()))
		{
			if(newvalues.get("Intent").equals(details.getIntent()))
			{
				if(newvalues.get("Enable").equals(details.getEnable()))
				{
					if(newvalues.get("ICOMTemplateID").equals(details.getiCOMTemplateID()))
					{
						if(newvalues.get("Source").equals(details.getSource()))
						{
							if(newvalues.get("AppID").equals(details.getAppID()))
							{
								if(newvalues.get("AlertCode").equals(details.getAlertCode()))
								{
									if(newvalues.get("MessageDescription").equals(details.getMessageDescription()))
									{
										Status=true;
									}
									else {System.out.println("Message Description data mismatch");}
								}
								else {System.out.println("AlertCode data mismatch");}
							}
							else {System.out.println("AppID data mismatch");}
						}
						else {System.out.println("Source data mismatch");}
					}	
					else {System.out.println("ICOMTemplateID data mismatch");}
				}
				else {System.out.println("Enable data mismatch");}
			}
			else {System.out.println("Intent data mismatch");}
		}
		else {System.out.println("Text data mismatch");}
		return Status;
	}

	private Map<String, String> getFirstRowDatafromTable() {
		Map<String,String> map = new HashMap<>();
        waitUntilWebElementIsVisible(auditGridContent);
        List<WebElement> rows=auditGridContent.findElements(By.tagName("tr"));
        List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
        List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
        for(int j=0;j<headers.size();j++){
            scrollToElement(headers.get(j));
            for(int i=0;i<3;i++) {													
                try{map.put(headers.get(j).getText(), cols.get(j).getText());break;}catch (Exception e){e.printStackTrace();}
            }
        }
        return map;
	}

	public boolean verifyTaskCompleteEnabled() {
        return taskCompleteBtn.isEnabled();
	}

	public void taskCompleteAction(String comment) throws Exception {
		selectWebElement(makeSmsResponseTemplateChanges);
        waitForLoad(driver);
        selectWebElement(taskCompleteBtn);
        enterValueToTxtFieldWithoutClear(makerComments,comment);
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        selectWebElement(taskCompleteBtnAtMakerCommentsPopUp);			
	}

	public boolean verifyStatus(String status) {
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String,String> firstRowData=getFirstRowDatafromTable();
        return firstRowData.get("Status").equals(status);
	}

	public void clickonApprove(String comment) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOn(approveBtn);
        selectWebElement(checkerReason);
        enterValueToTxtField(checkerReason,comment);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOn(approveYesBtn);		
	}

	public boolean verifyReviewAuditTrail(String status, String comment) {
		 try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        boolean stat=false;
	        Map<String,String> firstRowData=getFirstRowDatafromTable();
	        if(firstRowData.get("Status").equals(status)){
	            if(firstRowData.get("Checker Comments").equals(comment)){
	            	stat=true;
	            	}
	            else{System.out.println("Data mismatch:"+firstRowData.get("Review Comments")+"\t"+comment);}
	        }else{System.out.println("Data mismatch:"+firstRowData.get("Status")+"\t"+status);}
	        return stat;
	}

	public boolean verifyApprovedSectionDataafterapproval(SmsResponseTemplateDetails SmsResponseTemplateDetails) throws Exception {
		searchSmsResponseTemplateRecordApprovedData(SmsResponseTemplateDetails.getiCOMTemplateID());
		if(rowdata.getText().equals(SmsResponseTemplateDetails.getText()))
			return true;
		else
		return false;
	}

	

	public void clickonReject(String comment) throws Exception {
		 selectWebElement(SmsResponseTemplateTabs.get(1));
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        clickOn(rejectBtn);
	        selectWebElement(checkerReason);
	        enterValueToTxtField(checkerReason,comment);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        clickOn(approveYesBtn);				
	}

	public boolean VerifyMakeSmsResponseTemplateChangeButton() {
		return makeSmsResponseTemplateChanges.isDisplayed();

	}

	public boolean EditCancel(SmsResponseTemplateDetails details) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		Thread.sleep(1000);
		selectWebElement(makeSmsResponseTemplateChanges);
		Thread.sleep(1000);
		searchSmsResponseTemplateRecord(details.getiCOMTemplateID());
		selectWebElement(editButton);
		waitForJqueryLoad(driver);
		selectWebElement(cancelBtn);
		if(editrowdata.get(3).getText().equals(details.getiCOMTemplateID()))
			return true;
		else
		return false;
	}

	public void EditSmsResponseTemplateRecord(SmsResponseTemplateDetails details) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		Thread.sleep(1000);
		selectWebElement(makeSmsResponseTemplateChanges);
		Thread.sleep(1000);
		searchSmsResponseTemplateRecord(details.getiCOMTemplateID());
		selectWebElement(editButton);
		waitForJqueryLoad(driver);		
		Thread.sleep(1000);
        enterValueToTxtField(MessageDescriptionTextbox,details.getUpdatedMessageDescription());
        enterValueToTxtField(modifyReasonTextBox,details.getModifyReason());
        selectWebElement(saveBtn);

	}

	public boolean verifyAuditTrailUpdate(SmsResponseTemplateDetails details, String Transaction,String Status) {
		boolean stat=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable();
        if(firstRowData.get("Transaction").equalsIgnoreCase(Transaction)){
            if(firstRowData.get("Status").equalsIgnoreCase(Status)){
                if(firstRowData.get("Function").equalsIgnoreCase("IvrHostMap")){
                       if(Transaction.equals("MakerUpdate")){
                           Map<String,String> newvalues=new HashMap<>();
                            String[] d=firstRowData.get("New Values").split("\n");
                            for(String e:d){
                                String[]f=e.split(":",2);
                                if(f.length>1){newvalues.put(f[0],f[1]);}
                            }
                            if(verifyUpdatedNewValues(details,newvalues)){
                                stat=true;}
                            else 
                            stat=false;
                       }
                       else{System.out.println("Data mismatch");}
                }else{System.out.println("Data mismatch:"+firstRowData.get("Function")+"\t"+"RoleManagement");}
            }else{System.out.println("Data mismatch:"+firstRowData.get("Status")+"\t"+Status);}
        }else{System.out.println("Data mismatch:"+firstRowData.get("Transaction")+"\t"+Transaction);}
        return stat;
	}

	private boolean verifyUpdatedNewValues(SmsResponseTemplateDetails details, Map<String, String> newvalues) {
		Boolean Status=false;
		if(newvalues.get("Text").equals(details.getText()))
		{
			if(newvalues.get("Intent").equals(details.getIntent()))
			{
				if(newvalues.get("Enable").equals(details.getEnable()))
				{
					if(newvalues.get("ICOMTemplateID").equals(details.getiCOMTemplateID()))
					{
						if(newvalues.get("Source").equals(details.getSource()))
						{
							if(newvalues.get("AppID").equals(details.getAppID()))
							{
								if(newvalues.get("AlertCode").equals(details.getAlertCode()))
								{
									if(newvalues.get("MessageDescription").equals(details.getUpdatedMessageDescription()))
									{
										Status=true;
									}
									else {System.out.println("Message Description data mismatch");}
								}
								else {System.out.println("AlertCode data mismatch");}
							}
							else {System.out.println("AppID data mismatch");}
						}
						else {System.out.println("Source data mismatch");}
					}	
					else {System.out.println("ICOMTemplateID data mismatch");}
				}
				else {System.out.println("Enable data mismatch");}
			}
			else {System.out.println("Intent data mismatch");}
		}
		else {System.out.println("Text data mismatch");}
		return Status;
	}

	public boolean verifyTaskCompleteSuccessMessage() {
        return(getSuccessMessage().contains("Record submission for approval success. Your Request ID is :"));

	}

	public void EditRecordWithoutModifyReason(SmsResponseTemplateDetails details) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		Thread.sleep(1000);
		selectWebElement(makeSmsResponseTemplateChanges);
		Thread.sleep(1000);
		searchSmsResponseTemplateRecord(details.getiCOMTemplateID());
		selectWebElement(editButton);
		waitForJqueryLoad(driver);		
		Thread.sleep(1000);
        enterValueToTxtField(MessageDescriptionTextbox,details.getUpdatedMessageDescription());
        selectWebElement(saveBtn);	
        selectWebElement(cancelBtn);
	}

	public boolean DeleteCancel(SmsResponseTemplateDetails details) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		Thread.sleep(1000);
		selectWebElement(makeSmsResponseTemplateChanges);
		Thread.sleep(1000);
		searchSmsResponseTemplateRecord(details.getiCOMTemplateID());
		selectWebElement(deleteButton);
		waitForJqueryLoad(driver);
		selectWebElement(noBtn);
		if(editrowdata.get(3).getText().equals(details.getiCOMTemplateID()))
			return true;
		else
		return false;
	}

	public void DeleteSmsResponseTemplateRecord(SmsResponseTemplateDetails details) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		Thread.sleep(1000);
		selectWebElement(makeSmsResponseTemplateChanges);
		Thread.sleep(1000);
		searchSmsResponseTemplateRecord(details.getiCOMTemplateID());
		Thread.sleep(1000);
		selectWebElement(deleteButton);
		Thread.sleep(1000);
        selectWebElement(deleteReasonTextBox);
        enterValueToTxtField(deleteReasonTextBox,details.getDeleteReason());
        selectWebElement(yesBtn);				
	}

	public boolean verifyAuditTrailDelete(SmsResponseTemplateDetails SmsResponseTemplateDetails, String Transaction,
			String Status) {
		boolean stat=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable();
        if(firstRowData.get("Transaction").equalsIgnoreCase(Transaction)){
            if(firstRowData.get("Status").equalsIgnoreCase(Status)){
                if(firstRowData.get("Function").equalsIgnoreCase("SmsResponseTemplate")){
                       stat=true;
                }else{System.out.println("Data mismatch:"+firstRowData.get("Function")+"\t"+"RoleManagement");}
            }else{System.out.println("Data mismatch:"+firstRowData.get("Status")+"\t"+Status);}
        }else{System.out.println("Data mismatch:"+firstRowData.get("Transaction")+"\t"+Transaction);}
        return stat;
	}

	public void DeleteRecordWithoutModifyReason(SmsResponseTemplateDetails details) throws Exception {
		selectWebElement(SmsResponseTemplateTabs.get(1));
		Thread.sleep(1000);
		selectWebElement(makeSmsResponseTemplateChanges);
		Thread.sleep(1000);
		searchSmsResponseTemplateRecord(details.getiCOMTemplateID());
		Thread.sleep(1000);
		selectWebElement(deleteButton);
		Thread.sleep(1000);
        selectWebElement(deleteReasonTextBox);
        selectWebElement(yesBtn);		
        selectWebElement(noBtn);
	}
	  	    
	 public void enableAllColumnsHeaders() {
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
	            for (int i = 3; i < headersColumns.size(); i++) {
	                WebElement checkbox = headersColumns.get(i).findElement(By.tagName("input"));
	                checkbox.click();
	                if (checkbox.isSelected()) {
	                } else {
	                    checkbox.click();
	                }
	            }
	        }
	    }

		public void selectAddNewSmsResponseTemplate() {
			selectWebElement(addNewRecordBtn);
		}

		public void addwithoutText(SmsResponseTemplateDetails details) throws Exception {
			selectWebElement(SmsResponseTemplateTabs.get(1));
			selectWebElement(makeSmsResponseTemplateChanges);
			selectWebElement(addNewRecordBtn);
			waitForJqueryLoad(driver);	
	        enterValueToTxtFieldWithoutClear(IntentTextbox,details.getIntent());
			selectWebElement(EnableDropdown);
	        selectDropdownFromVisibleText(EnableListbox, details.getEnable());
	        enterValueToTxtField(SourceTextbox,details.getSource());
	        enterValueToTxtField(AlertCodeTextbox,details.getAlertCode());
	        enterValueToTxtField(AppIdTextbox,details.getAppID());
	        enterValueToTxtField(MessageDescriptionTextbox,details.getMessageDescription());
	        enterValueToTxtField(IcomTemplateIdTextbox,details.getiCOMTemplateID());
	        selectWebElement(saveBtn);		
	        selectWebElement(cancelBtn);
		}

		public void addwithoutIntent(SmsResponseTemplateDetails SmsResponseTemplateDetails) throws Exception {
			selectWebElement(SmsResponseTemplateTabs.get(1));
			selectWebElement(makeSmsResponseTemplateChanges);
			selectWebElement(addNewRecordBtn);
			waitForJqueryLoad(driver);	
	        enterValueToTxtFieldWithoutClear(TextTextbox,SmsResponseTemplateDetails.getText());
			selectWebElement(EnableDropdown);
	        selectDropdownFromVisibleText(EnableListbox, SmsResponseTemplateDetails.getEnable());
	        enterValueToTxtField(SourceTextbox,SmsResponseTemplateDetails.getSource());
	        enterValueToTxtField(AlertCodeTextbox,SmsResponseTemplateDetails.getAlertCode());
	        enterValueToTxtField(AppIdTextbox,SmsResponseTemplateDetails.getAppID());
	        enterValueToTxtField(MessageDescriptionTextbox,SmsResponseTemplateDetails.getMessageDescription());
	        enterValueToTxtField(IcomTemplateIdTextbox,SmsResponseTemplateDetails.getiCOMTemplateID());
	        selectWebElement(saveBtn);	
	        selectWebElement(cancelBtn);
		}

		public void addwithoutEnable(SmsResponseTemplateDetails SmsResponseTemplateDetails) throws Exception {
			selectWebElement(SmsResponseTemplateTabs.get(1));
			selectWebElement(makeSmsResponseTemplateChanges);
			selectWebElement(addNewRecordBtn);
			waitForJqueryLoad(driver);	
	        enterValueToTxtFieldWithoutClear(TextTextbox,SmsResponseTemplateDetails.getText());
	        enterValueToTxtField(SourceTextbox,SmsResponseTemplateDetails.getSource());
	        enterValueToTxtField(AlertCodeTextbox,SmsResponseTemplateDetails.getAlertCode());
	        enterValueToTxtField(AppIdTextbox,SmsResponseTemplateDetails.getAppID());
	        enterValueToTxtField(MessageDescriptionTextbox,SmsResponseTemplateDetails.getMessageDescription());
	        enterValueToTxtField(IcomTemplateIdTextbox,SmsResponseTemplateDetails.getiCOMTemplateID());
	        selectWebElement(saveBtn);	
	        selectWebElement(cancelBtn);
		}

		public void addwithoutICOMTemplateID(SmsResponseTemplateDetails SmsResponseTemplateDetails) throws Exception {
			selectWebElement(SmsResponseTemplateTabs.get(1));
			selectWebElement(makeSmsResponseTemplateChanges);
			selectWebElement(addNewRecordBtn);
			waitForJqueryLoad(driver);	
	        enterValueToTxtFieldWithoutClear(TextTextbox,SmsResponseTemplateDetails.getText());
			selectWebElement(EnableDropdown);
	        selectDropdownFromVisibleText(EnableListbox, SmsResponseTemplateDetails.getEnable());
	        enterValueToTxtField(SourceTextbox,SmsResponseTemplateDetails.getSource());
	        enterValueToTxtField(AlertCodeTextbox,SmsResponseTemplateDetails.getAlertCode());
	        enterValueToTxtField(AppIdTextbox,SmsResponseTemplateDetails.getAppID());
	        enterValueToTxtField(MessageDescriptionTextbox,SmsResponseTemplateDetails.getMessageDescription());
	        selectWebElement(saveBtn);	
	        selectWebElement(cancelBtn);
		}

	
}
