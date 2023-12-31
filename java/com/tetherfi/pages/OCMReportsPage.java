package com.tetherfi.pages;

import com.tetherfi.model.chat.ChatIntentSkillMappingDetails;
import com.tetherfi.model.chat.ChatMenuDescriptionDetails;
import com.tetherfi.model.chat.ChatTemplateDetails;
import com.tetherfi.model.email.EmailTemplateDetails;
import com.tetherfi.model.fax.FaxAddressBookDetails;
import com.tetherfi.model.fax.FaxAutoACKConfigurationDetails;
import com.tetherfi.model.fax.FaxLineConfigDetails;
import com.tetherfi.model.fax.FaxRoutingConfigurationDetails;
import com.tetherfi.model.fax.FaxSendersDetails;
import com.tetherfi.model.fax.FaxTemplateDetails;
import com.tetherfi.model.fax.SendFaxDetails;
import com.tetherfi.model.ivr.AdhocOptionEnhancementDetails;
import com.tetherfi.model.ivr.AgentTransferDetails;
import com.tetherfi.model.ivr.BranchManagementDetails;
import com.tetherfi.model.ivr.CallbackAnnouncementDetails;
import com.tetherfi.model.ivr.FaxApplicationFormDetails;
import com.tetherfi.model.ivr.HostValueMappingDetails;
import com.tetherfi.model.ivr.IntentMappingDetails;
import com.tetherfi.model.ivr.IntroMessageAnnouncementDetails;
import com.tetherfi.model.ivr.IvrConfigDetails;
import com.tetherfi.model.ivr.MenuDescriptionMappingDetails;
import com.tetherfi.model.ivr.VBEnrollmentFlagDetails;
import com.tetherfi.model.ivr.VipListManagementDetails;
import com.tetherfi.model.report.ReportDetails;
import com.tetherfi.model.sms.SmsResponseTemplateDetails;
import com.tetherfi.model.tmac.AgentTeamMgmtDetails;
import com.tetherfi.model.tmac.TmacBroadCastMsgDetails;
import com.tetherfi.model.tmac.WaitTimeColorConfigDetails;
import com.tetherfi.model.tmac.WorkCodeListDetails;
import com.tetherfi.model.user.CepEventMappingDetails;
import com.tetherfi.model.user.SkillConfigurationDetails;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.SystemOutLogger;
import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OCMReportsPage extends BasePage {

    public OCMReportsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "OCMReportsli")
    private WebElement ocmReportsTab;

    @FindBy(css=".ibox-title h5")
    private WebElement ocmReportsManager;

    @FindBy(id = "form")
    private WebElement formContents;
    
    @FindBy(xpath="//input[@placeholder='Search by Function Name..']")
    private WebElement SearchByFunctionName;
    
    @FindBy(css="ul[id='autoCompleteTextbox_listbox'] li")
    private List<WebElement> autoCompleteListBox;

    @FindBy(id="grid")
    private WebElement auditGridContent;
    
    @FindBy(css = "span[aria-owns='reportchannel_listbox']")
    private WebElement reportChannelDropdown;

    @FindBy(css = "ul[id='reportchannel_listbox'] li")
    private List<WebElement> reportChannelListBox;

    @FindBy(css = "span[aria-owns='reportname_listbox']")
    private WebElement reportNameDropdown;

    @FindBy(css = "ul[id='reportname_listbox'] li")
    private List<WebElement> reportNameListbox;

    @FindBy(css = "span[aria-owns='reporttype_listbox']")
    private WebElement reportTypeDropdown;

    @FindBy(css = "ul[id='reporttype_listbox'] li")
    private List<WebElement> reportTypeListbox;

    @FindBy(id = "singledate")
    private WebElement reportdate;

    @FindBy(id="startdate")
    private WebElement startDate;

    @FindBy(id="enddate")
    private WebElement endDate;

    @FindBy(id="searchRadioGroup")
    private WebElement advancedSearchBtn;

    @FindBy(css=".modal-body .form-inline .form-group .k-select")
    private List<WebElement> selectSearchColumn;

    @FindBy(css="ul[id='1001sColumnName_listbox'] li")
    private List<WebElement> columnNameList;

    @FindBy(css="ul[id='1001sCriteria_listbox'] li")
    private List<WebElement> searchTypeList;

    @FindBy(css="#advanced .k-textbox")
    private List<WebElement> searchText;

    @FindBy(css = ".k-Show")
    private List<WebElement> showReportBtn;

    @FindBy(id = "grid")
    private WebElement gridBoxContent;

    @FindBy(id = "reportNameLbl")
    private WebElement reportnameLbl;

    @FindBy(id="ExportReportBtn")
    private WebElement exportReportBtn;

    @FindBy(id="showDownloadedReportBtn")
    private WebElement viewDownloadedReport;

    @FindBy(id="ScheduleReportBtn")
    private WebElement scheduleReport;

    @FindBy(id="clearAllSearch")
    private WebElement clearAll;

    @FindBy(css=".toast-message")
    private WebElement successmsg;

    @FindBy(css="#toast-container .toast-error")
    private List<WebElement> errorMsg;

    //Reports Download page web elements
    @FindBy(id="notifications")
    private WebElement notificationIcon;

    @FindBy(id="nav")
    private WebElement notificationPan;

    @FindBy(css="ul[id='nav'] li a div")
    private List<WebElement> notificationReportNameList;

    @FindBy(css="ul[id='nav'] li span")
    private List<WebElement> notificationReportGeneratedOnList;

    @FindBy(css=".k-grid-content table[role='grid']")
    private WebElement gridTable;

    @FindBy(css=".k-grid-excel")
    private WebElement exportPage;

    @FindBy(css="button[onclick='onSelectExportAll()']")
    private WebElement exportToCSV;

    @FindBy(css=".k-i-download")
    private WebElement viewDownloadedReportAtShowReportsPage;

    @FindBy(css=".k-i-clock")
    private WebElement scheduledReportatShowReportsPage;

    @FindBy(css=".k-pager-info")
    private WebElement pagerInfo;

    @FindBy(css=".k-pager-sizes .k-input")
    private WebElement pagerSize;

    @FindBy(css=".k-pager-sizes .k-icon")
    private WebElement pagerDropdown;

    @FindBy(css=".k-animation-container ul li")
    private List<WebElement> pageSizeListBox;

    @FindBy(css="a[aria-label='Go to the next page']")
    private WebElement nextPageIcon;

    @FindBy(css=".ibox-content")
    private WebElement gridContent;

    @FindBy(css=".k-i-more-vertical")
    private List<WebElement> headersDropdown;

    @FindBy(css=".k-sort-asc")
    private List<WebElement> sortAscending;

    @FindBy(css=".k-sort-desc")
    private List<WebElement> sortDescending;

    @FindBy(css=".k-columns-item")
    private List<WebElement> columns;

    @FindBy(id="autoCompleteTextbox")
    private WebElement searchByTextBox;

    @FindBy(css="ul[id='autoCompleteTextbox_listbox'] li")
    private List<WebElement> searchByListBox;

    @FindBy(css = ".fa-search")
    private WebElement searchBtn;

    @FindBy(css = "span[aria-controls='1001sColumnName_listbox']")
    private WebElement searchColDropdown;

    @FindBy(css="ul[id='1001sColumnName_listbox'] li")
    private List<WebElement> searchColListBox;

    @FindBy(css = "span[aria-owns='1001sCriteria_listbox']")
    private WebElement searchCriteriaDropdown;

    @FindBy(css="ul[id='1001sCriteria_listbox'] li")
    private List<WebElement> searchCriteriaListbox;

    @FindBy(id = "1001sTextToSearch")
    private WebElement searchTextBox;

    @FindBy(id="1001sMaskedTextToSearch")
    private WebElement dateTimeSearchTextBox;

    @FindBy(css = "#1001sAddButton .k-i-add")
    private WebElement searchAddCriteriaBtn;

    @FindBy(css = "#1001sCloseButton .k-i-close")
    private WebElement searchRemoveFilterBtn;

    @FindBy(css = ".modal-footer .k-button")
    private WebElement searchCloseBtn;

    @FindBy(css = ".modal-footer .button-danger-theme")
    private WebElement searchClearAllBtn;

    @FindBy(css = ".modal-footer .button-theme")
    private WebElement searchSearchBtn;

    @FindBy(css=".k-grid-norecords-template")
    private List<WebElement> norecords;

    @FindBy(css=".fa-refresh")
    private WebElement refreshBtn;

    @FindBy(css=".k-grid-Download")
    private WebElement downloadreportBtn;

    @FindBy(css = ".k-pager-last")
    private WebElement goToLastPage;

    @FindBy(css = ".k-state-selected")
    private WebElement pageNumber;

    @FindBy(css=".k-grouping-header")
    private WebElement groupingHeader;

    @FindBy(css=".k-group-indicator")
    private List<WebElement> groupname;

    @FindBy(css=".k-group-indicator .k-bare")
    private List<WebElement> groupClose;

    @FindBy(css=".k-grid-pdf")
    private WebElement exportToPDF;
    
    @FindBy(id="1001sAddButton")
    private WebElement plusbutton;
    
    @FindBy(xpath="//label[@for='1001sRadioAND']")
    private WebElement andradiobtn;
    
    @FindBy(css="ul[id='1002sColumnName_listbox'] li")
    private List<WebElement> columnNameListtwo;
    
    @FindBy(css="ul[id='1002sCriteria_listbox'] li")
    private List<WebElement> searchTypeListtwo;
    
    @FindBy(id="1002sTextToSearch")
    private WebElement searchTextBoxtwo;
    
    public boolean isShowButtonsDisplayed() {
    	return showReportBtn.get(0).isDisplayed() && showReportBtn.get(1).isDisplayed() && showReportBtn.get(0).isEnabled() && showReportBtn.get(1).isEnabled();    	
    }
    
    public boolean isExportBtnDisplayed() {
    	return exportReportBtn.isDisplayed() && exportReportBtn.isEnabled();
    }
    
    public boolean isExportBtnNotDisplayed() {
    	if(exportReportBtn.isDisplayed() && exportReportBtn.isEnabled())
    		return false;
    	else
    		return true;
    }
    
    public boolean isOCMReportPageIsDisplayed() {
        waitForLoad(driver);
       // waitForJqueryLoad(driver);
        return ocmReportsTab.isEnabled();
    }
    public boolean isDownloaderPageDisplayed() {
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        return ocmReportsManager.isEnabled();
    }
    public void showReport(ReportDetails details) throws Exception {
        chooseReport(details);
        if(details.getAdvancedsearch().equalsIgnoreCase("Yes")){chooseAdvancedSearch(details);}
        selectWebElement(showReportBtn.get(0));
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        waitUntilWebElementIsVisible(gridBoxContent);
    }
    public void chooseAdvancedSearch(ReportDetails details){
    try{selectWebElement(advancedSearchBtn);
    selectWebElement(selectSearchColumn.get(0));
    Thread.sleep(2000);
    selectDropdownFromVisibleText(columnNameList,details.getColname());
    selectWebElement(selectSearchColumn.get(1));
    Thread.sleep(2000);
    selectDropdownFromVisibleText(searchTypeList,details.getColtype());
    enterValueToTxtField(searchText.get(0),details.getSearchStr());
    }catch(Exception e){e.printStackTrace();}}
    public void showReportInNewPage(ReportDetails details) throws Exception {
        chooseReport(details);
        selectWebElement(showReportBtn.get(1));
        switchToNewWindow();
        waitForLoad(driver);
        waitForJqueryLoad(driver);
      waitUntilWebElementIsVisible(gridBoxContent);
    }
    public void exportReport(ReportDetails details) throws Exception{
        chooseReport(details);
        selectWebElement(exportReportBtn);
    }
    public void scheduleReport(ReportDetails details) throws Exception{
        chooseReport(details);
        selectWebElement(scheduleReport);
    }
    public void viewDownloadedReportInNotificationTab(){
        selectWebElement(viewDownloadedReport);
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        selectWebElement(notificationIcon);
        waitUntilWebElementIsVisible(notificationPan);
    }
    public void viewDownloadedReportInReportsDownloadsPage() {
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        selectWebElement(viewDownloadedReport);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForLoad(driver);
        waitForJqueryLoad(driver);
    }
    public boolean verifyDownloadedReportNameInNotificationPan(String reportname){
        if(notificationReportNameList.get(0).getText().contains(reportname)){
            return true;}else{
            System.out.println("Wrong Report name:"+notificationReportNameList.get(0).getText());return false;}
        }
    public boolean verifyDownloadedReportGeneratedTime(){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        if(notificationReportGeneratedOnList.get(0).getText().contains("Generated On : "+date)){
            return true;
        }else {System.out.println("Wrong Report generated Date:"+notificationReportGeneratedOnList.get(0).getText());return false;}
    }
    public boolean verifyDownloadedReportNameAndTimeInReportsDownloadPage(String reportname){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        Map<String,String> map=getFirstRowDatafromTable();
        if(map.get("Report Name").equalsIgnoreCase(reportname)){
            if(map.get("Report Generated On").contains(date)){return true;}else{System.out.println("Wrong Report Generated Date:"+map.get("Report Generated On"));return false;}
    }else{System.out.println("Wrong Report Name:"+map.get("Report Name"));return false;}
    }
    public boolean verifyReportDisplayed(ReportDetails details) {
        if (reportnameLbl.getText().contains("OCM Reports > " + details.getReportChannel() + " > " + details.getReportName() + " on " + details.getReportDate())) {
            return true;
        } else {
            return false;
        }
    }
    public boolean verifyAuditTrailReportDisplayed(String trans ,String fun) {
    boolean status=false;
    List<Map<String,String>> data=getAllDatafromTable();
    for(Map<String,String> map:data){
        if(map.get("Transaction").equalsIgnoreCase(trans)){
            if(map.get("Function").equalsIgnoreCase(fun)){
                status=true;break;
            }
        }
    }
    return status;
    }
    public boolean verifyReportHeaders(ReportDetails details){
        boolean status=false;
        String[] headers=details.getReportHeaders().split(",");
        List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
        List<WebElement> gridheaders = rows.get(0).findElements(By.tagName("th"));
        for(String head:headers){
            status=false;
            for(WebElement e:gridheaders){
               scrollToElement(e);
                if(e.getText().equals(head)){status=true;break;}
            }
            if(status){}else{System.out.println(head+" header not present in this report");break;}
        }
    return status;
    }
    public boolean verifyDateRangeReportDisplayed(ReportDetails details) {
        if (reportnameLbl.getText().contains("OCM Reports > " + details.getReportChannel() + " > " + details.getReportName() + " from " + details.getStartDate()+" to "+details.getEndDate())){
            return true;
        } else {
            return false;
        }
    }
    public boolean verifyReportExported(){
        waitForJqueryLoad(driver);
        if(errorMsg.size()>0){return false;}
        if(waitUntilTextToBePresentInWebElement(successmsg,"Report Export is Initiated... Notification will be sent once Completed"))
        {return true;}else{return false;}
    }
    public boolean verifyScheduleReport(){
        waitForLoad(driver);
        waitForJqueryLoad(driver);
        return (ocmReportsManager.getText().equals("Report Scheduler"));
    }
    
    public void chooseReportChannel(String rptChannel) {
    	waitForJqueryLoad(driver);
    	selectWebElement(reportChannelDropdown);
        selectDropdownFromVisibleText(reportChannelListBox, rptChannel);
    }
    
    public void chooseReportName(String rptName) {
    	waitForJqueryLoad(driver);
    	selectWebElement(reportNameDropdown);
        selectDropdownFromVisibleText(reportNameListbox, rptName);
    }
    
    public void chooseReport(ReportDetails details) throws Exception
    {
        waitUntilWebElementIsVisible(formContents);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectWebElement(reportChannelDropdown);
        selectDropdownFromVisibleText(reportChannelListBox, details.getReportChannel());
        waitForJqueryLoad(driver);
        selectWebElement(reportNameDropdown);
        selectDropdownFromVisibleText(reportNameListbox, details.getReportName());
        waitForJqueryLoad(driver);
        selectWebElement(reportTypeDropdown);
        selectDropdownFromVisibleText(reportTypeListbox, details.getReportType());
        if(details.getReportType().equalsIgnoreCase("Single Date"))
        {enterValueToTxtField(reportdate, formatDate(details.getReportDate()));
            reportdate.sendKeys(Keys.TAB);}
        else if(details.getReportType().equalsIgnoreCase("Date Range")){
            enterValueToTxtField(startDate,formatDate(details.getStartDate()));
            startDate.sendKeys(Keys.TAB);
            enterValueToTxtField(endDate,formatDate(details.getEndDate()));
            endDate.sendKeys(Keys.TAB);
        }
    }
    public String formatDate(String date){
        Date dateParsed = null;
        try {
            dateParsed = new SimpleDateFormat("dd-MM-yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String inputDate = new SimpleDateFormat("yyyyMMdd").format(dateParsed);
    return inputDate;
    }
    public void exportPage(){
        emptyDownloadsDirectory(System.getProperty("user.dir")+"\\src\\test\\resources\\DownloadedFiles");
        selectWebElement(exportPage);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void exportToCSV(){
        emptyDownloadsDirectory(System.getProperty("user.dir")+"\\src\\test\\resources\\DownloadedFiles");
        selectWebElement(exportToCSV);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void viewDownloadedReports(){
        selectWebElement(viewDownloadedReportAtShowReportsPage);
        waitForLoad(driver);
        waitForJqueryLoad(driver);
    }
    public void downloadReport(){
    if(isDownloaderPageDisplayed())
    {try {
    emptyDownloadsDirectory(System.getProperty("user.dir")+"\\src\\test\\resources\\DownloadedFiles");
    selectWebElement(downloadreportBtn);
    Thread.sleep(5000);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }}
    public void scheduledReports(){
        selectWebElement(scheduledReportatShowReportsPage);
        waitForLoad(driver);
        waitForJqueryLoad(driver);
    }
    public boolean verifyExportPageFileDownloaded(String reportname){
        return verifyExportPageFileDownload(System.getProperty("user.dir")+"\\src\\test\\resources\\DownloadedFiles",reportname);
    }
    public boolean verifyReportPageFileDownloaded(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return verifyExportPageFileDownload(System.getProperty("user.dir")+"\\src\\test\\resources\\DownloadedFiles","OCMReportDownload-"+date);
    }
    private List<Map<String, String>> getAllDatafromTable(){
        int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
        int pagersize=Integer.valueOf(pagerSize.getText());
        int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
        List<Map<String, String>> maplist = new ArrayList<Map<String, String>>();
        for(int i=0;i<=pages;i++){
            List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
            List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
            for(int j=1;j<=rows.size()-1;j++){
                List<WebElement> cols=rows.get(j).findElements(By.tagName("td"));
                Map<String,String> map=new HashMap<>();
                for(int k=0; k<cols.size();k++){
                   map.put(headers.get(k).getText(),cols.get(k).getText());
                }
                maplist.add(map);
                }
            if(i<pages){    nextPageIcon.click();
            waitForJqueryLoad(driver);}
            }
        return maplist;
        }
    private List<String> getColumnDatafromTable(String columnname){
            List<String> list = new ArrayList<>();
            List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
            List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
            int colindex=0;
            for(WebElement e:headers){if(e.getText().equals(columnname)){break;}else{colindex++;}}
            for(int j=1;j<=rows.size()-1;j++){
                List<WebElement> cols=rows.get(j).findElements(By.tagName("td"));
                list.add(cols.get(colindex).getText());
            }
            return list;
    }
    public boolean verifySorting() {
        boolean status=false;
        int items = Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
        int pagersize = Integer.valueOf(pagerSize.getText());
        int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
        for (int i = 0; i <= pages; i++) {
            List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
            List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
            int k=0;
            for(int j=0;j<headers.size();j++){
            if(headers.get(j).getText().equals("")||headers.get(j).getText().equals(" ")){continue;}
            List<String> l1 = getColumnDatafromTable(headers.get(j).getText());
            //System.out.println(l1);
            List<String> temp = l1;
            Collections.sort(temp);
            //System.out.println(temp);
            selectWebElement(headersDropdown.get(k));
            waitForJqueryLoad(driver);
            selectWebElement(sortAscending.get(k));
            waitForJqueryLoad(driver);
            List<String> l2 = getColumnDatafromTable(headers.get(j).getText());
            //System.out.println(l2);
            if (l2.equals(temp)) {/*System.out.println("sorting works fine");*/status = true;}else{status=false;}
            if(status){}else{System.out.println("Ascending sorting failed for column name:"+headers.get(j).getText()+"\n"+l2);break;}
            /*descending sort code*/
            status=false;
            temp = l1;
            Collections.sort(temp,Collections.reverseOrder());
            //System.out.println(temp);
            selectWebElement(headersDropdown.get(k));
            waitForJqueryLoad(driver);
            selectWebElement(sortDescending.get(k));
            waitForJqueryLoad(driver);
            k++;
            List<String> l3 = getColumnDatafromTable(headers.get(j).getText());
            //System.out.println(l3);
            if (l3.equals(temp)) {/*System.out.println("sorting works fine");*/status = true;}
            if(status){}else{System.out.println("Descending sorting failed for column name:"+headers.get(j).getText()+"\n"+l3);break;}
            }
            if(status){}else{break;}
            nextPageIcon.click();
            waitForJqueryLoad(driver);
        }
        return status;
    }
    private String getProperHeadersInGrid(String cname){
        List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
        List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
        for(WebElement e:headers){if(cname.contains(e.getText())){return e.getText();}}
        return "";
    }
    public boolean verifySearchByTextbox() throws Exception{
        boolean status=false;
        String colname=searchByTextBox.getAttribute("placeholder").split("Search by ")[1];
        if(colname.contains(".")){colname=colname.split("\\.")[0];}
        colname=getProperHeadersInGrid(colname);
        List<String> searchList=getColumnDatafromTable(colname);
        enterValueToTxtField(searchByTextBox,searchList.get(0));
    try {
        Thread.sleep(3000);
        selectDropdownFromVisibleText(searchByListBox,searchList.get(0));
        Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
        int pagersize=Integer.valueOf(pagerSize.getText());
        int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
        for(int i=0;i<=pages;i++){
        status=false;
        List<String> searchList1=getColumnDatafromTable(colname);
        for(String s:searchList1){
            if(s.equals(searchList.get(0))){status=true;}
            else{System.out.println(s+" does not contain "+searchList.get(0));status=false;break;}
        }
        if(status){}else{break;}
        selectWebElement(nextPageIcon);
        waitForJqueryLoad(driver);
        }
        return status;
    }
    public boolean verifySearchByColumnValue() throws Exception{
        boolean status=false;
        List<Map<String,String>> table=getAllDatafromTable();
        List<String> colDataFromTable=new ArrayList<>();
        List<String> search=new ArrayList<>();
        for(String key:table.get(0).keySet()){
            if(key.equals("")||key.equals(" ")){continue;}
            String srch=table.get(0).get(key);
            if(srch.equals("")||srch.contains("\n")){srch="test";}
            searchReport(key,"Is equal to",srch);
            for(Map<String,String> m:table){
                if(m.get(key).equalsIgnoreCase(srch)){colDataFromTable.add(m.get(key));}
            }
            if(norecords.size()<=0){
            int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
            int pagersize=Integer.valueOf(pagerSize.getText());
            int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
            for(int i=0;i<=pages;i++){
                status=false;
                List<String> searchList=getColumnDatafromTable(key);
                search.addAll(searchList);
                for(String s:searchList){
                    if(s.equalsIgnoreCase(srch)){status=true;}
                    else{System.out.println(s+" Is not equals To "+srch);status=false;break;}
                }
                if(status){}else{break;}
                selectWebElement(nextPageIcon);
                waitForJqueryLoad(driver);
            }
        //verify the table and list
        if(search.equals(colDataFromTable)){status=true;}else{System.out.println("Search failed in count");System.out.println(search+"\n"+colDataFromTable);status=false;break;}
        //verify the table and list
        }else{System.out.println("no records to verify"); status=true;}
        selectWebElement(refreshBtn);colDataFromTable.clear();search.clear();
        waitForJqueryLoad(driver);
        }
return status;
    }
    private Map<String,String> getFirstRowDatafromTable(){
        Map<String,String> map = new HashMap<>();
        List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
        List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
        List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
        for(int j=0;j<headers.size();j++){
            map.put(headers.get(j).getText(),cols.get(j).getText());
        }
        return map;
    }
    public void searchReport(String colname, String criteria, String searchString) throws Exception {
        selectWebElement(searchBtn);
        selectWebElement(searchColDropdown);
        selectDropdownFromVisibleText(searchColListBox,colname);
        selectWebElement(searchCriteriaDropdown);
        selectDropdownFromVisibleText(searchCriteriaListbox,criteria);
        if(searchTextBox.isDisplayed())
        {enterValueToTxtField(searchTextBox,searchString);}
        else {enterValueToTxtField(dateTimeSearchTextBox,searchString);}
        selectWebElement(searchSearchBtn);
        waitForJqueryLoad(driver);
        waitUntilWebElementIsVisible(gridContent);
    }
    public boolean verifySearchContainsColumnValue() throws Exception{
        boolean status=false;
        List<Map<String,String>> table=getAllDatafromTable();
        List<String> colDataFromTable=new ArrayList<>();
        List<String> search=new ArrayList<>();
        for(String key:table.get(0).keySet()){
            if(key.contains("Duration")||key.contains("Time")||key.equals("")||key.equals(" ")){continue;}
            String srch=table.get(0).get(key);
            if(srch.equals("")||srch.contains("\n")){srch="test";}
            searchReport(key,"Contains",srch);
            for(Map<String,String> m:table){
                //if(m.get(key).contains(srch)){colDataFromTable.add(m.get(key));}
                if(StringUtils.containsIgnoreCase(m.get(key),srch)){colDataFromTable.add(m.get(key));}
            }
            if(norecords.size()<=0){
                int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
                int pagersize=Integer.valueOf(pagerSize.getText());
                int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
                for(int i=0;i<=pages;i++){
                    status=false;
                    List<String> searchList=getColumnDatafromTable(key);
                    search.addAll(searchList);
                    for(String s:searchList){
                        //if(s.contains(srch)){status=true;}
                        if(StringUtils.containsIgnoreCase(s,srch)){status=true;}
                        else{System.out.println(s+" Is not contains "+srch);status=false;break;}
                    }
                    if(status){}else{break;}
                    selectWebElement(nextPageIcon);
                    waitForJqueryLoad(driver);
                }
                //verify the table and list
                if(search.equals(colDataFromTable)){status=true;}else{System.out.println("Search failed in count");System.out.println(search+"\n"+colDataFromTable);status=false;break;}
                //verify the table and list
            }else{System.out.println("no records to verify"); status=true;}
            selectWebElement(refreshBtn);colDataFromTable.clear();search.clear();
            waitForJqueryLoad(driver);
        }
        return status;
    }
    public boolean verifySearchIsNotEqualsColumnValue() throws Exception{
        boolean status=false;
        List<Map<String,String>> table=getAllDatafromTable();
        List<String> colDataFromTable=new ArrayList<>();
        List<String> search=new ArrayList<>();
        for(String key:table.get(0).keySet()){
            if(key.equals("")||key.equals(" ")){continue;}
            String srch=table.get(0).get(key);
            if(srch.equals("")||srch.contains("\n")){srch="test";}
            searchReport(key,"Is not equal to",srch);
            for(Map<String,String> m:table){
                if(!m.get(key).equalsIgnoreCase(srch)){colDataFromTable.add(m.get(key));}
            }
            if(norecords.size()<=0){
                int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
                int pagersize=Integer.valueOf(pagerSize.getText());
                int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
                for(int i=0;i<=pages;i++){
                    status=false;
                    List<String> searchList=getColumnDatafromTable(key);
                    search.addAll(searchList);
                    for(String s:searchList){
                        if(!s.equalsIgnoreCase(srch)){status=true;}
                        else{System.out.println(s+" Is equals To "+srch);status=false;break;}
                    }
                    if(status){}else{break;}
                    selectWebElement(nextPageIcon);
                    waitForJqueryLoad(driver);
                }
                //verify the table and list
                if(search.equals(colDataFromTable)){status=true;}else{System.out.println("Search failed in count");System.out.println(search+"\n"+colDataFromTable);status=false;break;}
                //verify the table and list
            }else{System.out.println("no records to verify"); status=true;}
            selectWebElement(refreshBtn);colDataFromTable.clear();search.clear();
            waitForJqueryLoad(driver);
        }
        return status;
    }
    public boolean verifySearchStartsWithColumnValue() throws Exception{
        boolean status=false;
        List<Map<String,String>> table=getAllDatafromTable();
        List<String> colDataFromTable=new ArrayList<>();
        List<String> search=new ArrayList<>();
        for(String key:table.get(0).keySet()){
            if(key.contains("Duration")||key.contains("Time")||key.equals("")||key.equals(" ")){continue;}
            String srch=table.get(0).get(key);
            if(srch.equals("")||srch.contains("\n")){srch="test";}
            searchReport(key,"Starts with",srch);
            for(Map<String,String> m:table){
                if(StringUtils.startsWithIgnoreCase(m.get(key),srch)){colDataFromTable.add(m.get(key));}
            }
            if(norecords.size()<=0){
                int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
                int pagersize=Integer.valueOf(pagerSize.getText());
                int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
                for(int i=0;i<=pages;i++){
                    status=false;
                    List<String> searchList=getColumnDatafromTable(key);
                    search.addAll(searchList);
                    for(String s:searchList){
                        if(StringUtils.startsWithIgnoreCase(s,srch)){status=true;}
                        else{System.out.println(s+" Is does'nt starts with "+srch);status=false;break;}
                    }
                    if(status){}else{break;}
                    selectWebElement(nextPageIcon);
                    waitForJqueryLoad(driver);
                }
                //verify the table and list
                if(search.equals(colDataFromTable)){status=true;}else{System.out.println("Search failed in count");System.out.println(search+"\n"+colDataFromTable);status=false;break;}
                //verify the table and list
            }else{System.out.println("no records to verify"); status=true;}
            selectWebElement(refreshBtn);colDataFromTable.clear();search.clear();
            waitForJqueryLoad(driver);
        }
        return status;
    }
    public boolean verifySearchEndsWithColumnValue() throws Exception{
        boolean status=false;
        List<Map<String,String>> table=getAllDatafromTable();
        List<String> colDataFromTable=new ArrayList<>();
        List<String> search=new ArrayList<>();
        for(String key:table.get(0).keySet()){
            if(key.contains("Duration")||key.contains("Time")||key.equals("")||key.equals(" ")){continue;}
            String srch=table.get(0).get(key);
            if(srch.equals("")||srch.contains("\n")){srch="test";}
            searchReport(key,"Ends with",srch);
            for(Map<String,String> m:table){
                if(StringUtils.endsWithIgnoreCase(m.get(key),srch)){colDataFromTable.add(m.get(key));}
            }
            if(norecords.size()<=0){
                int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
                int pagersize=Integer.valueOf(pagerSize.getText());
                int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
                for(int i=0;i<=pages;i++){
                    status=false;
                    List<String> searchList=getColumnDatafromTable(key);
                    search.addAll(searchList);
                    for(String s:searchList){
                        if(StringUtils.endsWithIgnoreCase(s,srch)){status=true;}
                        else{System.out.println(s+" Is does'nt starts with "+srch);status=false;break;}
                    }
                    if(status){}else{break;}
                    selectWebElement(nextPageIcon);
                    waitForJqueryLoad(driver);
                }
                //verify the table and list
                if(search.equals(colDataFromTable)){status=true;}else{System.out.println("Search failed in count");System.out.println(search+"\n"+colDataFromTable);status=false;break;}
                //verify the table and list
            }else{System.out.println("no records to verify"); status=true;}
            selectWebElement(refreshBtn);colDataFromTable.clear();search.clear();
            waitForJqueryLoad(driver);
        }
        return status;
    }
    public boolean verifySearchDoesNotContainsColumnValue() throws Exception{
        boolean status=false;
        List<Map<String,String>> table=getAllDatafromTable();
        List<String> colDataFromTable=new ArrayList<>();
        List<String> search=new ArrayList<>();
        for(String key:table.get(0).keySet()){
            if(key.contains("Duration")||key.contains("Time")||key.equals("")||key.equals(" ")){continue;}
            String srch=table.get(0).get(key);
            if(srch.equals("")||srch.contains("\n")){srch="test";}
            searchReport(key,"Does not contain",srch);
            for(Map<String,String> m:table){
                //if(m.get(key).contains(srch)){colDataFromTable.add(m.get(key));}
                if(!StringUtils.containsIgnoreCase(m.get(key),srch)){colDataFromTable.add(m.get(key));}
            }
            if(norecords.size()<=0){
                int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
                int pagersize=Integer.valueOf(pagerSize.getText());
                int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
                for(int i=0;i<=pages;i++){
                    status=false;
                    List<String> searchList=getColumnDatafromTable(key);
                    search.addAll(searchList);
                    for(String s:searchList){
                        //if(s.contains(srch)){status=true;}
                        if(!StringUtils.containsIgnoreCase(s,srch)){status=true;}
                        else{System.out.println(s+" Is contains "+srch);status=false;break;}
                    }
                    if(status){}else{break;}
                    selectWebElement(nextPageIcon);
                    waitForJqueryLoad(driver);
                }
                //verify the table and list
                if(search.equals(colDataFromTable)){status=true;}else{System.out.println("Search failed in count");System.out.println(search+"\n"+colDataFromTable);status=false;break;}
                //verify the table and list
            }else{System.out.println("no records to verify"); status=true;}
            selectWebElement(refreshBtn);colDataFromTable.clear();search.clear();
            waitForJqueryLoad(driver);
        }
        return status;
    }

    public boolean verifyNumberOfItemsPerPage() {
        boolean status = false;
        try {
            if (norecords.size() <= 0) {
                int items = Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
                selectWebElement(pagerDropdown);
                Thread.sleep(1500);
                for (int i = 0; i < pageSizeListBox.size(); i++) {
                    if(Integer.valueOf(pageSizeListBox.get(i).getText())>items){continue;}
                    selectDropdownFromVisibleText(pageSizeListBox, pageSizeListBox.get(i).getText());
                    waitForJqueryLoad(driver);
                    int totalItems = Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
                    int pagersize = Integer.valueOf(pagerSize.getText());
                    int pages = (totalItems % pagersize == 0) ? items / pagersize : items / pagersize+1;
                    int totalRows=(gridContent.findElements(By.tagName("tr")).size())-1;
                    selectWebElement(goToLastPage);
                    waitForJqueryLoad(driver);
                    int lastPageNumber = Integer.valueOf(pageNumber.getText());
                    if (items == totalItems && pages == lastPageNumber&&totalRows==pagersize) {
                        status = true;
                    } else {System.out.println(items+":"+totalItems+"\t"+pages+":"+lastPageNumber+"\t"+totalRows+":"+pagersize);
                        status = false;
                        break;
                    }selectWebElement(pagerDropdown);Thread.sleep(1500);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } return status;
    }
    public void closeGrouping(){
        if(!groupingHeader.equals("Drag a column header and drop it here to group by that column")){
            for(int i=0;i<groupname.size();i++){
                String groupedName=groupname.get(i).getText();
                selectWebElement(groupClose.get(i));
            }
        }
    }
    public void enableColumns(){
        selectWebElement(headersDropdown.get(1));
        selectWebElement(columns.get(0));
        selectWebElement(columns.get(0).findElements(By.tagName("input")).get(0));
        selectWebElement(refreshBtn);
    }
    public void dragandDropColumns(String col1, String col2)
    {
        List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
        List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
        WebElement column1=null,column2=null;
        for(WebElement e:headers){
            if(e.getText().equals(col1)){column1=e;}
            if(e.getText().equals(col2)){column2=e;}
        }
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(column1).moveToElement(column2).release(column2).build();
        dragAndDrop.perform();
    }
    public void exportToPDF(){
        emptyDownloadsDirectory(System.getProperty("user.dir")+"\\src\\test\\resources\\DownloadedFiles");
        selectWebElement(exportToPDF);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean verifySortingForAllDataDisplayed(){
        boolean status=false;
        List<Map<String,String>> table=getAllDatafromTable();
        List<String> colDataFromTable=new ArrayList<>();
        List<String> sort=new ArrayList<>();
        List<WebElement> rows=gridContent.findElements(By.tagName("tr"));
        List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
        int k=0;
        for(int j=0;j<headers.size();j++){
            String key=headers.get(j).getText();
            for(Map<String,String> m:table){
                colDataFromTable.add(m.get(key));
            }
            selectWebElement(refreshBtn);
            if(key.equals("")||key.equals(" ")){continue;}
            selectWebElement(headersDropdown.get(k));
            waitForJqueryLoad(driver);
            selectWebElement(sortAscending.get(k));
            waitForJqueryLoad(driver);
            Collections.sort(colDataFromTable);
            int items=Integer.valueOf(pagerInfo.getText().split("of ")[1].split(" items")[0]);
            int pagersize=Integer.valueOf(pagerSize.getText());
            int pages=(items%pagersize==0)?items/pagersize-1:items/pagersize;
            for(int i=0;i<=pages;i++){
            List<String> sortList=getColumnDatafromTable(key);
            sort.addAll(sortList);
            selectWebElement(nextPageIcon);
            waitForJqueryLoad(driver);
            }
            if(sort.equals(colDataFromTable)){status=true;}else{System.out.println("Ascending Sort failed for column "+key);System.out.println(sort+"\n"+colDataFromTable);status=false;break;}
            selectWebElement(refreshBtn);sort.clear();
            waitForJqueryLoad(driver);
//Descending sort starts from here
            selectWebElement(headersDropdown.get(k));
            waitForJqueryLoad(driver);
            selectWebElement(sortDescending.get(k));
            waitForJqueryLoad(driver);
            k++;
            Collections.sort(colDataFromTable,Collections.reverseOrder());
            for(int i=0;i<=pages;i++){
                List<String> sortList=getColumnDatafromTable(key);
                sort.addAll(sortList);
                selectWebElement(nextPageIcon);
                waitForJqueryLoad(driver);
            }
            if(sort.equals(colDataFromTable)){status=true;}else{System.out.println("Descending Sort failed for column "+key);System.out.println(sort+"\n"+colDataFromTable);status=false;break;}
            selectWebElement(refreshBtn);colDataFromTable.clear();sort.clear();
            waitForJqueryLoad(driver);
        }
        return status;
    }

	public boolean isReportListDisplayed() {
		selectWebElement(reportNameDropdown);
		waitForJqueryLoad(driver);
		if(reportNameListbox.size()>0)
			return false;
		else
			return true;
	}
	
	public void booleansearchnew(String Name, String Transaction) throws Exception
	{
		selectWebElement(searchBtn);
		waitForJqueryLoad(driver);
        selectWebElement(selectSearchColumn.get(0));
        selectDropdownFromVisibleText(columnNameList,"Transaction");
        selectWebElement(selectSearchColumn.get(1));
        selectDropdownFromVisibleText(searchTypeList,"Is equal to");
        enterValueToTxtField(searchTextBox,Transaction);
        selectWebElement(plusbutton);
        moveToElement(andradiobtn);
        selectWebElement(andradiobtn);
        Thread.sleep(2000);
        selectWebElement(selectSearchColumn.get(2));
        selectDropdownFromVisibleTextContains(columnNameListtwo,"New Value");
        selectWebElement(selectSearchColumn.get(3));
        selectDropdownFromVisibleText(searchTypeListtwo,"Contains");
        enterValueToTxtField(searchTextBoxtwo,Name);
        selectWebElement(searchSearchBtn);
        waitForJqueryLoad(driver);
        waitUntilWebElementIsVisible(gridContent);
	}
	
	public void booleansearchold(String Name, String Transaction) throws Exception
	{
		selectWebElement(searchBtn);
		waitForJqueryLoad(driver);
        selectWebElement(selectSearchColumn.get(0));
        selectDropdownFromVisibleText(columnNameList,"Transaction");
        selectWebElement(selectSearchColumn.get(1));
        selectDropdownFromVisibleText(searchTypeList,"Is equal to");
        enterValueToTxtField(searchTextBox,Transaction);
        selectWebElement(plusbutton);
        moveToElement(andradiobtn);
        selectWebElement(andradiobtn);
        Thread.sleep(2000);
        selectWebElement(selectSearchColumn.get(2));
        selectDropdownFromVisibleTextContains(columnNameListtwo,"Old Value");
        selectWebElement(selectSearchColumn.get(3));
        selectDropdownFromVisibleText(searchTypeListtwo,"Contains");
        enterValueToTxtField(searchTextBoxtwo,Name);
        selectWebElement(searchSearchBtn);
        waitForJqueryLoad(driver);
        waitUntilWebElementIsVisible(gridContent);
	}

	public Boolean verifyTmacBroadcastMsgCreate(TmacBroadCastMsgDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getMessage(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			System.out.println(e);
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("TeamName").equals(details.getTeamName()))
			{
				if(newvalues.get("Message").equals(details.getMessage()))
				{
					if(newvalues.get("Status").equals(details.getStatus()))
						Status= true;
					else {System.out.println("Status data mismatch");}
				}
				else {System.out.println("Message data mismatch");}
			}
			else {System.out.println("TeamName data mismatch");	}
			return Status;
		}

	public Boolean verifyTmacBroadcastMsgUpdate(TmacBroadCastMsgDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedMessage(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("TeamName").equals(details.getTeamName())){
    			if(oldvalues.get("Message").equals(details.getMessage())){
    				if(oldvalues.get("Status").equals(details.getStatus()))
    					if(firstRowData.containsKey("New Values")) {
    		    			Map<String,String> newvalues=new HashMap<>();
    		        		String[]d1=firstRowData.get("New Values").split("\n");
    		        		for(String e:d1) {
    		        			System.out.println(e);
    		        			String f[]=e.split(":",2);
    		        			if(f.length>1)
    		        				newvalues.put(f[0], f[1]);
    		        		}
    		        		if(newvalues.get("TeamName").equals(details.getTeamName())){
    		        			if(newvalues.get("Message").equals(details.getUpdatedMessage())){
    		        				if(newvalues.get("Status").equals(details.getUpdatedStatus())) {
    		        					if(newvalues.get("Modify Reason").equals(details.getModifyReason())) {
    		        						if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
    		        		        			Status=true;
    		        		        		else System.out.println("Change reason data mismatch");
    		        					}
    		        					else System.out.println("Modify reason data mismatch");
    		        				}
    		        				else {System.out.println("Status data mismatch");}
    		        			}
    		        			else {System.out.println("Message data mismatch");}
    		        			}
    		        		else {System.out.println("TeamName data mismatch");	}
    		        		
    		    		}
    		    		else {System.out.println("New values data mismatch");}
    				else {System.out.println("Status data mismatch");}
    			}
    			else {System.out.println("Message data mismatch");}
    			}
    		else {System.out.println("TeamName data mismatch");	}
    		
    	}
        else {System.out.println("Old values data mismatch");}
        return Status;
	}
	
	private Map<String,String> getFirstRowDatafromTable1(){
        Map<String,String> map = new HashMap<>();
        waitUntilWebElementIsVisible(auditGridContent);
        List<WebElement> rows=auditGridContent.findElements(By.tagName("tr"));
        List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
        List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
        for(int j=0;j<headers.size();j++){
            scrollToElement(headers.get(j));
            map.put(headers.get(j).getText(),cols.get(j).getText());
        }
        return map;
	}

	public boolean verifywaitTimeColorConfigCreate(WaitTimeColorConfigDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getColorcode(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("ColorCode").equals(details.getColorcode()))
			{
				if(newvalues.get("Color").equals(details.getColorcode()))
				{
					if(newvalues.get("StartTime").equals(details.getStartTime()))
					{
						if(newvalues.get("EndTime").equals(details.getEndTime()))
							Status= true;
						else {System.out.println("End Time  data mismatch");}
					}
					else {System.out.println("Start Time data mismatch");}
				}
				else {System.out.println("Color data mismatch");}
			}
			else {System.out.println("Color Code data mismatch");}
			return Status;
	}

	public boolean verifywaitTimeColorConfigUpdate(WaitTimeColorConfigDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedColorCode(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Color").equals(details.getColorcode())){
    			if(oldvalues.get("ColorCode").equals(details.getColorcode())){
    				if(oldvalues.get("StartTime").equals(details.getStartTime())) {
    					if(oldvalues.get("EndTime").equals(details.getEndTime())){
    						if(firstRowData.containsKey("New Values")) {
    							Map<String,String> newvalues=new HashMap<>();
    							String[]d1=firstRowData.get("New Values").split("\n");
    							for(String e:d1) {
    								String f[]=e.split(":",2);
    								if(f.length>1)
    		        				newvalues.put(f[0], f[1]);
    							}
    							if(newvalues.get("Color").equals(details.getUpdatedColorCode())){
    								if(newvalues.get("ColorCode").equals(details.getUpdatedColorCode())){
    									if(newvalues.get("StartTime").equals(details.getUpdatedStartTime())) {
    										if(newvalues.get("EndTime").equals(details.getEndTime())){
    											if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
    												if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
    													Status=true;
    												else System.out.println("Change reason data mismatch");
    											}
    											else System.out.println("Modify reason data mismatch");
    										}
    										else System.out.println("End Time data mismatch");
    		        				}
    		        				else {System.out.println("Start Time data mismatch");}
    		        			}
    		        			else {System.out.println("Colorcode data mismatch");}
    		        			}
    		        		else {System.out.println("Color data mismatch");	}	
    		    		}
    		    		else {System.out.println("New values data mismatch");}
    					}
    				else {System.out.println("End Time data mismatch");}
    			}
    			else {System.out.println("Start Time data mismatch");}
    			}
    		else {System.out.println("Color Code data mismatch");	}	
    	}
    	else System.out.println("Color data mismatch");
        }
    else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifywaitTimeColorConfigdelete(WaitTimeColorConfigDetails details,String Transaction) throws Exception {
		booleansearchold(details.getUpdatedColorCode(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("ColorCode").equals(details.getUpdatedColorCode()))
			{
				if(oldvalues.get("Color").equals(details.getUpdatedColorCode()))
				{
					if(oldvalues.get("StartTime").equals(details.getStartTime()))
					{
						if(oldvalues.get("EndTime").equals(details.getEndTime()))
						{
							if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
								if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
    		        			Status=true;
								else System.out.println("Change reason data mismatch");
							}
							else System.out.println("Modify reason data mismatch");
						}
						else {System.out.println("End Time  data mismatch");}
					}
					else {System.out.println("Start Time data mismatch");}
				}
				else {System.out.println("Color data mismatch");}
			}
			else {System.out.println("Color Code data mismatch");}
			return Status;
	}

	public boolean verifyWorkcodeListCreate(WorkCodeListDetails details, String Transaction, WorkCodeListDetails details1) throws Exception {
		booleansearchnew(details.getName(),Transaction);
		String workcode=database(details1.getQuery()).get(0).remove("WorkCode");
		System.out.println(workcode);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("WorkLevel").equals(details.getWorkLevel()))
			{
				if(newvalues.get("Name").equals(details.getName()))
				{
					if(newvalues.get("WorkCode").equals(workcode))
						Status= true;
					else {System.out.println("Workcode data mismatch");}
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("WorkLevel data mismatch");	}
			return Status;
	}
	public String workcode;
	public boolean verifyWorkcodeListUpdate(WorkCodeListDetails details,String Transaction,WorkCodeListDetails details1) throws Exception {
		booleansearchnew(details.getUpdatedName(),Transaction);
		workcode=database(details1.getQuery()).get(0).remove("WorkCode");
		System.out.println(workcode);
		String teamid=database(details1.getQuery()).get(0).remove("TeamID");
		System.out.println(teamid);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("WorkLevel").equals(details.getWorkLevel())){
    			if(oldvalues.get("Name").equals(details.getName())){
    				if(oldvalues.get("WorkCode").equals(workcode)) {
    					if(oldvalues.get("TeamID").equals(teamid)){
    						if(firstRowData.containsKey("New Values")) {
    							Map<String,String> newvalues=new HashMap<>();
    							String[]d1=firstRowData.get("New Values").split("\n");
    							for(String e:d1) {
    								String f[]=e.split(":",2);
    								if(f.length>1)
    		        				newvalues.put(f[0], f[1]);
    							}
    							if(newvalues.get("WorkLevel").equals(details.getWorkLevel())){
    								if(newvalues.get("Name").equals(details.getUpdatedName())){
    									if(newvalues.get("WorkCode").equals(workcode)) {
    										if(newvalues.get("TeamID").equals(teamid)){
    											if(newvalues.get("Modify Reason").equals(details.getModifyReason())) {
    												if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
    													Status=true;
    												else System.out.println("Change reason data mismatch");
    											}
    											else System.out.println("Modify reason data mismatch");
    										}
    										else System.out.println("TeamID data mismatch");
    		        				}
    		        				else {System.out.println("Workcode data mismatch");}
    		        			}
    		        			else {System.out.println("Name data mismatch");}
    		        			}
    		        		else {System.out.println("WorkLevel data mismatch");	}	
    		    		}
    		    		else {System.out.println("New values data mismatch");}
    					}
    				else {System.out.println("Team Id data mismatch");}
    			}
    			else {System.out.println("WorkCode data mismatch");}
    			}
    		else {System.out.println("Name data mismatch");	}	
    	}
    	else System.out.println("WorkLevel data mismatch");
        }
    else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifycodeListdelete(WorkCodeListDetails details, String Transaction,String workcode) throws Exception {
		booleansearchold(details.getUpdatedName(),Transaction);
		System.out.println(workcode);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("WorkLevel").equals(details.getWorkLevel()))
			{
				if(oldvalues.get("Name").equals(details.getUpdatedName()))
				{
					if(oldvalues.get("WorkCode").equals(workcode))
					{
						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason()))
						{
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
    		        			Status=true;
    		        		else System.out.println("Change reason data mismatch");
						}
						else {System.out.println("Modify Reason  data mismatch");}
					}
					else {System.out.println("Workcode data mismatch");}
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("WOrkLevel data mismatch");}
			return Status;
	}

	public String RunQuery(String query, String Key) {
		return database(query).get(0).remove(Key);
	}

	public boolean verifyAgentTeamMgmtCreate(AgentTeamMgmtDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getTeamName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("LevelHierarchy").equals(details.getLevel()))
			{
				if(newvalues.get("Name").equals(details.getTeamName()))
				{
					Status= true;
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("Level Hierarchy data mismatch");}
			return Status;
	}

	public boolean verifyAgentTeamMgmtUpdate(AgentTeamMgmtDetails details, String Transaction, String displayname,AgentTeamMgmtDetails details2) throws Exception {
		booleansearchnew(details.getUpdateTeamName(),Transaction);
		String displayname2=RunQuery(details2.getQuery(),"DisplayName");
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("LevelHierarchy").equals(details.getLevel())){
    			if(oldvalues.get("Name").equals(details.getTeamName())){
    				if(oldvalues.get("DisplayHierarchy").equals(displayname)) {
    					if(firstRowData.containsKey("New Values")) {
    						Map<String,String> newvalues=new HashMap<>();
    						String[]d1=firstRowData.get("New Values").split("\n");
    						for(String e:d1) {
    							String f[]=e.split(":",2);
    							if(f.length>1)
    		        			newvalues.put(f[0], f[1]);
    						}
    						if(newvalues.get("LevelHierarchy").equals(details.getLevel())){
    							if(newvalues.get("Name").equals(details.getUpdateTeamName())){
    								if(newvalues.get("DisplayHierarchy").equals(displayname2)) {
    									if(newvalues.get("Modify Reason").equals(details.getModifyReason())) {
    										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
    											Status=true;
    										else System.out.println("Change reason data mismatch");
    									}
    									else System.out.println("Modify reason data mismatch");
    								}
    								else System.out.println("Display Hierarchy data mismatch");
    		        				}
    		        			else {System.out.println("Name data mismatch");}
    		        			}
    		        		else {System.out.println("LevelHeirarchy data mismatch");	}	
    		    		}
    		    		else {System.out.println("New values data mismatch");}
    					}
    				else {System.out.println("Display Hierarchy data mismatch");}
    			}
    			else {System.out.println("Name data mismatch");}
    			}
    		else {System.out.println("Level Hierarchy data mismatch");	}	
        }
        else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyAgentTeamMgmtdelete(AgentTeamMgmtDetails details, String Transaction,String displayname) throws Exception {
		booleansearchold(details.getUpdateTeamName(),Transaction);
		System.out.println(displayname);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("LevelHierarchy").equals(details.getLevel()))
			{
				if(oldvalues.get("Name").equals(details.getUpdateTeamName()))
				{
					if(oldvalues.get("DisplayHierarchy").equals(displayname))
					{
						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason()))
						{
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
    		        			Status=true;
    		        		else System.out.println("Change reason data mismatch");
						}
						else {System.out.println("Modify Reason  data mismatch");}
					}
					else {System.out.println("DisplayHierarchy data mismatch");}
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("LevelHierarchy data mismatch");}
			return Status;
	}

	public boolean verifyAdhocOptionEnhancementCreate(AdhocOptionEnhancementDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getPromotionalDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("PromotionNumber").equals(details.getPromotionalNumber()))
			{
				if(newvalues.get("PromotionDescription").equals(details.getPromotionalDescription()))
				{
					if(newvalues.get("Language").equals(details.getLanguage()))
					{
						if(newvalues.get("PromotionNameWavFile").equals(details.getPromotionNameWavFile()))
						{
							if(newvalues.get("PromotionDetailsWavFile").equals(details.getPromotionDetailsWavFile()))
							{
								if(newvalues.get("DirectTransferEnabled").equals(details.getDirectTransferEnabled()))
								{
									if(newvalues.get("Intent").equals(details.getIntent()))
									{
										if(newvalues.get("Status").equals(details.getStatus()))
										{
											Status= true;
										}
										else {System.out.println("Status data mismatch");}
									}
									else {System.out.println("Intent data mismatch");}
								}
								else {System.out.println("Direct TransferEnabled data mismatch");}
							}
							else {System.out.println("PromotionDetailsWavFile data mismatch");}
						}	
						else {System.out.println("romotionNameWavFile data mismatch");}
					}
					else {System.out.println("Language data mismatch");}
				}
				else {System.out.println("PromotionDescription data mismatch");}
			}
			else {System.out.println("PromotionNumber data mismatch");}
			return Status;
	}

	public boolean verifyAdhocOptionEnhancementUpdate(AdhocOptionEnhancementDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedPromotiondescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("PromotionNumber").equals(details.getPromotionalNumber())){
    			if(oldvalues.get("PromotionDescription").equals(details.getPromotionalDescription())){
    				if(oldvalues.get("Language").equals(details.getLanguage())) {
    					if(oldvalues.get("DirectTransferEnabled").equals(details.getDirectTransferEnabled())){
    						if(oldvalues.get("PromotionNameWavFile").equals(details.getPromotionNameWavFile())){
    							if(oldvalues.get("PromotionDetailsWavFile").equals(details.getPromotionDetailsWavFile())){
    								if(oldvalues.get("Intent").equals(details.getIntent())){
    									if(oldvalues.get("Status").equals(details.getStatus())){
    										if(firstRowData.containsKey("New Values")) {
    											Map<String,String> newvalues=new HashMap<>();
    											String[]d1=firstRowData.get("New Values").split("\n");
    											for(String e:d1) {
    												String f[]=e.split(":",2);
    												if(f.length>1)
    													newvalues.put(f[0], f[1]);
    											}
    											if(newvalues.get("PromotionNumber").equals(details.getPromotionalNumber())){
    												if(newvalues.get("PromotionDescription").equals(details.getUpdatedPromotiondescription())){
    													if(newvalues.get("Language").equals(details.getLanguage())) {
    														if(newvalues.get("DirectTransferEnabled").equals(details.getDirectTransferEnabled())){
    																if(newvalues.get("PromotionNameWavFile").equals(details.getPromotionNameWavFile())){
    																	if(newvalues.get("PromotionDetailsWavFile").equals(details.getPromotionDetailsWavFile())){
    																		if(newvalues.get("Intent").equals(details.getIntent())){
    																			if(newvalues.get("Status").equals(details.getStatus())) {
    																				if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
    																					if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
    																					Status=true;
    																					else System.out.println("Change reason data mismatch");
    																				}
    																				else System.out.println("ModifyReason data mismatch");
    																			}
    																			else System.out.println("Status data mismtach");
    																		}
    																		else System.out.println("Intent data mismatch");
    																	}
    																	else System.out.println("Promotiondetailswavfile data mismatch");
    																}
    																else System.out.println("PromotionNamewavfile data mismatch");
    															}
    															else System.out.println("DirectTransferEnabled Data mismatch");
    														}
    														else System.out.println("Language data mismatch");
    													}
    													else System.out.println("Promotion description data mismatch");
    												}
    												else System.out.println("Promotion Number data mismatch");	
    											}
    											else System.out.println("Newvalues data mismatch");
    										}
    										else System.out.println("Status data mismatch");
    									}
    									else {System.out.println("Intent data mismatch");}
    								}
    								else {System.out.println("Promotiondetailswavfile data mismatch");}
    		        			}
    							else {System.out.println("PromotionNamewavfile data mismatch");	}	
    						}
    						else {System.out.println("DirectTransferEnabled data mismatch");}
    					}
    					else {System.out.println("Langvage data mismatch");}
    				}
    				else {System.out.println("Promotiondescription data mismatch");}
    			}
    			else {System.out.println("Promotion Number data mismatch");	}	
    		}
    		else {System.out.println("Old values data mismatch");}
    		return Status;
	}
	
	public boolean verifyAdhocOptionEnhancementdelete(AdhocOptionEnhancementDetails details,String Transaction) throws Exception {
		booleansearchold(details.getPromotionalDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("PromotionNumber").equals(details.getPromotionalNumber()))
			{
				if(oldvalues.get("PromotionDescription").equals(details.getPromotionalDescription()))
				{
					if(oldvalues.get("Language").equals(details.getLanguage()))
					{
						if(oldvalues.get("DirectTransferEnabled").equals(details.getDirectTransferEnabled()))
						{
							if(oldvalues.get("PromotionNameWavFile").equals(details.getPromotionNameWavFile())) {
								if(oldvalues.get("PromotionDetailsWavFile").equals(details.getPromotionDetailsWavFile())) {
									if(oldvalues.get("Intent").equals(details.getIntent())) {
										if(oldvalues.get("Status").equals(details.getStatus())){
											if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
												if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
					    		        			Status=true;
					    		        		else System.out.println("Change reason data mismatch");
											}
											else System.out.println("Modify Reason data mismatch");
										}
										else System.out.println("Status data mismatch");
									}
									else System.out.println("Intent data mismtach");
								}
								else System.out.println("PomotionDetails data mismatch");
							}
							else System.out.println("PromotionNameWavFile Data mismatch");
						}
						else {System.out.println("DirectTansferEnabled data mismatch");}
					}
					else {System.out.println("Language data mismatch");}
				}
				else {System.out.println("Promotion Description data mismatch");}
			}
			else {System.out.println("Promotion Number data mismatch");}
			return Status;
	}

	public boolean verifyFaxLineConfigCreate(FaxLineConfigDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getFaxLineName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(newvalues.get("FaxLineName").equals(details.getFaxLineName()))
				{
					if(newvalues.get("Description").equals(details.getDescription()))
					{
						if(newvalues.get("Enabled").equals(details.getStatus()))
						{
							if(newvalues.get("SendEnabled").equals(details.getSendStatus()))
							{
								if(newvalues.get("ReceiveEnabled").equals(details.getReceiveStatus()))
								{
									Status= true;
								}
								else {System.out.println("Recieve Enabled data mismatch");}
							}
							else {System.out.println("Send Enabled data mismatch");}
						}
						else {System.out.println("Enabled data mismatch");}
					}
					else {System.out.println("Description data mismatch");}
				}
				else {System.out.println("FaxLineName data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");	}
			return Status;
	}

	public boolean verifyFaxLineConfigUpdate(FaxLineConfigDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("DNIS").equals(details.getFaxLine())){
    			if(oldvalues.get("Description").equals(details.getDescription())){
    				if(oldvalues.get("FaxLineName").equals(details.getFaxLineName())) {
    					if(oldvalues.get("Enabled").equals(details.getStatus())){
        					if(oldvalues.get("SendEnabled").equals(details.getSendStatus())){
            					if(oldvalues.get("ReceiveEnabled").equals(details.getReceiveStatus())){
            						if(firstRowData.containsKey("New Values")) {
            							Map<String,String> newvalues=new HashMap<>();
            							String[]d1=firstRowData.get("New Values").split("\n");
            							for(String e:d1) {
            								String f[]=e.split(":",2);
            								if(f.length>1)
            									newvalues.put(f[0], f[1]);
            							}
            							if(newvalues.get("DNIS").equals(details.getFaxLine())){
            								if(newvalues.get("FaxLineName").equals(details.getFaxLineName())){
            									if(newvalues.get("Description").equals(details.getUpdatedDescription())) {
            										if(newvalues.get("Enabled").equals(details.getUpdatedStatus())){
                										if(newvalues.get("SendEnabled").equals(details.getUpdatedSendStatus())){
                    										if(newvalues.get("ReceiveEnabled").equals(details.getUpdatedReceiveStatus())){
                    											if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
                    												if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                    													Status=true;
                    												else System.out.println("Change reason data mismatch");
                    											}
                    											else System.out.println("Modify reason data mismatch");
                    										}
                    										else System.out.println("ReceiveEnabled data mismatch");
                										}
                										else {System.out.println("SendEnabled data mismatch");}
            										}
            										else System.out.println("Enabled data mismatch");
            									}
        										else System.out.println("Description data mismatch");
            								}
            								else {System.out.println("FaxLineName data mismatch");}
            							}
            							else {System.out.println("DNIS data mismatch");	}	
            						}
            						else {System.out.println("New values data mismatch");}
            					}
            					else {System.out.println("RecieveEnabled data mismatch");}
        					}
        					else {System.out.println("SendEnabled data mismatch");}
    					}
    					else {System.out.println("Enabled data mismatch");	}	
    				}
    				else System.out.println("FaxLineNamedata mismatch");
    			}
    			else System.out.println("Description data mismatch");
    		}
    		else System.out.println("DNIS Data Mismatch");
        }
        else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyFaxLineConfigdelete(FaxLineConfigDetails details, String Transaction) throws Exception {
		booleansearchold(details.getFaxLine(),Transaction);
		System.out.println(workcode);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(oldvalues.get("FaxLineName").equals(details.getFaxLineName()))
				{
					if(oldvalues.get("Description").equals(details.getUpdatedDescription()))
					{
						if(oldvalues.get("Enabled").equals(details.getStatus())){
							if(oldvalues.get("Send Enabled").equals(details.getSendStatus())) {
								if(oldvalues.get("ReceiveEnabled").equals(details.getReceiveStatus())) {
									if(oldvalues.get("ModifyReason").equals(details.getDeleteReason()))
									{
										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
											Status=true;
										else System.out.println("Change reason data mismatch");
									}
									else {System.out.println("Modify Reason  data mismatch");}
								}
								else {System.out.println("Receive Enabled data mismatch");}
							}
							else {System.out.println("Send Enabled data mismatch");}
						}
						else {System.out.println("Enabled data mismatch");}
					}
					else {System.out.println("Description data mismatch");}
				}
				else {System.out.println("FaxLine Name data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");}
			return Status;
	}

	public boolean verifyFaxSendersCreate(FaxSendersDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getFaxNumber(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(newvalues.get("Name").equals(details.getName()))
				{
					if(newvalues.get("FaxNumber").equals(details.getFaxNumber()))
					{
						if(newvalues.get("Type").equals(details.getSenderType()))
						{
							Status= true;
						}
						else {System.out.println("Type data mismatch");}
					}
					else {System.out.println("FaxNumber data mismatch");}
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");	}
			return Status;
	}

	public boolean verifySendersUpdate(FaxSendersDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedSenderType(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("DNIS").equals(details.getFaxLine())){
    			if(oldvalues.get("Name").equals(details.getName())) {
        			if(oldvalues.get("FaxNumber").equals(details.getFaxNumber())){
            			if(oldvalues.get("Type").equals(details.getSenderType())){
            				if(firstRowData.containsKey("New Values")) {
            					Map<String,String> newvalues=new HashMap<>();
            					String[]d1=firstRowData.get("New Values").split("\n");
            					for(String e:d1) {
            						String f[]=e.split(":",2);
            						if(f.length>1)
            						newvalues.put(f[0], f[1]);
            					}
            					if(newvalues.get("DNIS").equals(details.getFaxLine())){
            						if(newvalues.get("Name").equals(details.getUpdatedName())){
            							if(newvalues.get("FaxNumber").equals(details.getFaxNumber())){
                							if(newvalues.get("Type").equals(details.getUpdatedSenderType())){
                								if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
                    								if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                    									Status=true;
                    								else System.out.println("Change reason data mismatch");
                    							}
                    							else System.out.println("Modify reason data mismatch");
                    						}
                    						else System.out.println("Type data mismatch");
                						}
            							else {System.out.println("FaxNumber data mismatch");}
            						}
            						else System.out.println("Name data mismatch");
            					}
            					else {System.out.println("DNIS data mismatch");	}	
            				}
            				else {System.out.println("New values data mismatch");}
            			}
            			else {System.out.println("Type data mismatch");}
        			}
        			else {System.out.println("FaxNumber data mismatch");}
    			}
    			else System.out.println("Name data mismatch");
    		}
    		else System.out.println("DNIS Data Mismatch");
        }
        else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyFaxSendersdelete(FaxSendersDetails details, String Transaction) throws Exception {
		booleansearchold(details.getFaxNumber(),Transaction);	
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(oldvalues.get("Name").equals(details.getName()))
				{
					if(oldvalues.get("FaxNumber").equals(details.getFaxNumber()))
					{
						if(oldvalues.get("Type").equals(details.getSenderType())) {
							if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
								if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
									Status=true;
								else System.out.println("Change reason data mismatch");
							}
							else {System.out.println("Modify Reason  data mismatch");}
						}
						else {System.out.println("Type data mismatch");}
					}
					else {System.out.println("FaxNumber data mismatch");}
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");}
			return Status;
	}

	public boolean verifyFaxRoutingConfigCreate(FaxRoutingConfigurationDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getRouteData(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(newvalues.get("Intent").equals(details.getIntent()))
				{
					if(newvalues.get("RouteType").equals(details.getRouteType()))
					{
						if(newvalues.get("Type").equals(details.getSenderType()))
						{
							if(newvalues.get("RouteData").equals(details.getRouteData()))
							Status= true;
							else {System.out.println("RouteData data mismatch");}
						}
						else {System.out.println("Type data mismatch");}
					}
					else {System.out.println("RouteType data mismatch");}
				}
				else {System.out.println("Intent data mismatch");	}
			}
			else {System.out.println("DNIS data mismatch");	}
			return Status;
	}

	public boolean verifyFaxRoutingConfigUpdate(FaxRoutingConfigurationDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedRouteData(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("DNIS").equals(details.getFaxLine())){
    			if(oldvalues.get("Type").equals(details.getSenderType())){
    				if(oldvalues.get("Intent").equals(details.getIntent())) {
    					if(oldvalues.get("RouteType").equals(details.getRouteType())){
        					if(oldvalues.get("RouteData").equals(details.getRouteData())){
            					if(firstRowData.containsKey("New Values")) {
            						Map<String,String> newvalues=new HashMap<>();
            						String[]d1=firstRowData.get("New Values").split("\n");
            						for(String e:d1) {
            							String f[]=e.split(":",2);
            							if(f.length>1)
            								newvalues.put(f[0], f[1]);
            						}
            						if(newvalues.get("DNIS").equals(details.getFaxLine())){
            							if(newvalues.get("Type").equals(details.getSenderType())){
            								if(newvalues.get("Intent").equals(details.getIntent())) {
            									if(newvalues.get("RouteType").equals(details.getRouteType())){
                									if(newvalues.get("RouteData").equals(details.getRouteData())){
                    									if(newvalues.get("Modify Reason").equals(details.getModifyReason())) {
                    										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                    											Status=true;
                    										else System.out.println("Change reason data mismatch");
                    									}
                    									else System.out.println("Modify reason data mismatch");
                    								}
                									else System.out.println("Routedata data mismatch");
                								}
                								else {System.out.println("Routetype data mismatch");}
            								}
            								else System.out.println("Intent data mismatch");
            							}
        								else System.out.println("Type data mismatch");
            						}
            						else {System.out.println("DNIS data mismatch");}
            					}
            					else {System.out.println("New values data mismatch");}
        					}
        					else {System.out.println("RouteData data mismatch");}
    					}
    					else {System.out.println("RouteType data mismatch");	}	
    				}
    				else System.out.println("Intent mismatch");
    			}
    			else System.out.println("Type data mismatch");
    		}
    		else System.out.println("DNIS Data Mismatch");
        }
        else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyFaxRoutingConfigdelete(FaxRoutingConfigurationDetails details, String Transaction) throws Exception {
		booleansearchold(details.getRouteData(),Transaction);	
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(oldvalues.get("Type").equals(details.getSenderType()))
				{
					if(oldvalues.get("Intent").equals(details.getIntent()))
					{
						if(oldvalues.get("RouteType").equals(details.getRouteType())) {
							if(oldvalues.get("RouteData").equals(details.getRouteData())) {
								if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
									if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
										Status=true;
									else System.out.println("Change reason data mismatch");
								}
								else {System.out.println("Modify Reason  data mismatch");}
							}
							else {System.out.println("RouteData data mismatch");}
						}
						else {System.out.println("RouteType data mismatch");}
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("Type data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");}
			return Status;
	}

	public boolean verifySendFaxCreate(SendFaxDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getRecipientNumber(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("Number").equals(details.getRecipientNumber()))
			{
				if(newvalues.get("FaxLine").equals(details.getFaxLine())) {
					if(newvalues.get("GlobalTemplate").equals(details.getTemplate())) {
						if(newvalues.get("EnableTemp").equals(details.getEnableTemp())) {
							if(newvalues.get("Scheduled").equals(details.getScheduled())) 
								Status= true;
							else {System.out.println("Scheduled data mismatch");}
						}
						else {System.out.println("EnableTemp data mismatch");}
					}
					else {System.out.println("GlobalTemplate data mismatch");}
				}
				else {System.out.println("FaxLine data mismatch");}
			}
			else {System.out.println("Number data mismatch");	}
			return Status;
	}
	
	public boolean verifyFaxTemplateCreate(FaxTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getTemplateName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			System.out.println(e);
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("TemplateName").equals(details.getTemplateName()))
			{
				if(newvalues.get("TemplateHtml").equals(details.getBody()))
				{
					if(newvalues.get("Custom").equals(details.getCustom()))
					{
						if(newvalues.get("HtmlDoc").equals(details.getHtml()))
						{
							if(newvalues.get("Logo").equals(details.getLogo()))
							{
								if(newvalues.get("UploadDoc").equals(details.getUploadDoc()))
								{
									if(newvalues.get("fileName").equals(details.getFilename()))
										Status= true;
									else {System.out.println("fileName data mismatch");}
								}
								else {System.out.println("UploadDoc data mismatch");}
							}
							else {System.out.println("Logo data mismatch");}
						}
						else {System.out.println("HtmlDoc data mismatch");}
					}
					else {System.out.println("Custom data mismatch");}
				}
				else {System.out.println("TemplateHtml data mismatch");	}
			}
			else {System.out.println("TemplateName data mismatch");	}
			return Status;
	}

	public boolean verifyFaxTemplateUpdate(FaxTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedFilename(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("TemplateName").equals(details.getTemplateName())){
    			if(oldvalues.get("TemplateHtml").equals(details.getBody())){
    				if(oldvalues.get("Custom").equals(details.getCustom())) {
    					if(oldvalues.get("HtmlDoc").equals(details.getHtml())){
        					if(oldvalues.get("Logo").equals(details.getLogo())){
            					if(oldvalues.get("fileName").equals(details.getFilename())){
                					if(oldvalues.get("UploadDoc").equals(details.getUploadDoc())){
                						if(firstRowData.containsKey("New Values")) {
                							Map<String,String> newvalues=new HashMap<>();
                							String[]d1=firstRowData.get("New Values").split("\n");
                							for(String e:d1) {
                								String f[]=e.split(":",2);
                								if(f.length>1)
                									newvalues.put(f[0], f[1]);
                							}
                							if(newvalues.get("TemplateName").equals(details.getTemplateName())){
                								if(newvalues.get("TemplateHtml").equals(details.getUpdatedBody())){
                									if(newvalues.get("Custom").equals(details.getUpdatedCustom())) {
                										if(newvalues.get("HtmlDoc").equals(details.getUpdatedHtml())){
                											if(newvalues.get("Logo").equals(details.getUpdatedLogo())){
                												if(newvalues.get("fileName").equals(details.getUpdatedFilename())){
                    												if(newvalues.get("UploadDoc").equals(details.getUpdatedUploadDoc())) {
                														if(newvalues.get("Modify Reason").equals(details.getModifyReason())) {
                															if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                																Status=true;
                															else System.out.println("Change reason data mismatch");
                														}
                            											else System.out.println("Modify reason data mismatch");
                    												}
                        											else System.out.println("Upload Doc reason data mismatch");
                    											}
                    											else System.out.println("fileName data mismatch");
                    										}
                    										else System.out.println("Logo data mismatch");
                										}
                										else {System.out.println("HtmlDoc data mismatch");}
            										}
            										else System.out.println("Custom data mismatch");
            									}
        										else System.out.println("TemplateHtml data mismatch");
            								}
            								else {System.out.println("TemplateName data mismatch");}
            							}
            							else {System.out.println("New value data mismatch");	}	
            						}
            						else {System.out.println("Uplaod Doc data mismatch");}
            					}
            					else {System.out.println("fileName data mismatch");}
        					}
        					else {System.out.println("Logo data mismatch");}
    					}
    					else {System.out.println("HtmlDoc data mismatch");	}	
    				}
    				else System.out.println("Custom data mismatch");
    			}
    			else System.out.println("TemplateHtml data mismatch");
    		}
    		else System.out.println("TemplateName Data Mismatch");
        }
        else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyFaxTemplateDelete(FaxTemplateDetails details, String Transaction) throws Exception {
		booleansearchold(details.getDeleteReason(),Transaction);	
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("TemplateName").equals(details.getTemplateName()))
			{
				if(oldvalues.get("TemplateHtml").equals(details.getBody()))
				{
					if(oldvalues.get("Custom").equals(details.getCustom()))
					{
						if(oldvalues.get("HtmlDoc").equals(details.getHtml())) {
							if(oldvalues.get("Logo").equals(details.getLogo())) {
								if(oldvalues.get("fileName").equals(details.getFilename())) {
									if(oldvalues.get("UploadDoc").equals(details.getLogo())) {
										if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
											if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
												Status=true;
											else System.out.println("Change reason data mismatch");
										}
										else {System.out.println("Modify Reason  data mismatch");}
									}
									else {System.out.println("UploadDoc data mismatch");}
								}
								else {System.out.println("fileName  data mismatch");}
							}
							else {System.out.println("Logo data mismatch");}
						}
						else {System.out.println("Htmldoc data mismatch");}
					}
					else {System.out.println("Custom data mismatch");}
				}
				else {System.out.println("TemplateHtml data mismatch");}
			}
			else {System.out.println("TemplateName data mismatch");}
			return Status;
	}

	public boolean verifyFaxAutoACKConfigCreate(FaxAutoACKConfigurationDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(newvalues.get("Name").equals(details.getName()))
				{
					if(newvalues.get("TemplateContent").equals(details.getTemplate()))
					{
						if(newvalues.get("Type").equals(details.getSenderType()))
						{
							if(newvalues.get("Enabled").equals(details.getStatus()))
							{
								Status= true;
							}
							else {System.out.println("Enabled data mismatch");}
						}
						else {System.out.println("Type data mismatch");}
					}
					else {System.out.println("FaxNumber data mismatch");}
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");	}
			return Status;
	}

	public boolean verifyFaxAutoACKConfigUpdate(FaxAutoACKConfigurationDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("DNIS").equals(details.getFaxLine())){
    			if(oldvalues.get("Name").equals(details.getName())) {
    				if(oldvalues.get("Enabled").equals(details.getStatus())){
        				if(oldvalues.get("Type").equals(details.getSenderType())){
            				if(oldvalues.get("TemplateContent").equals(details.getTemplate())){
            					if(firstRowData.containsKey("New Values")) {
            						Map<String,String> newvalues=new HashMap<>();
            						String[]d1=firstRowData.get("New Values").split("\n");
            						for(String e:d1) {
            							String f[]=e.split(":",2);
            							if(f.length>1)
            								newvalues.put(f[0], f[1]);
            						}
            						if(newvalues.get("DNIS").equals(details.getFaxLine())){
            							if(newvalues.get("Name").equals(details.getName())){
            								if(newvalues.get("Enabled").equals(details.getUpdatedStatus())){
                								if(newvalues.get("Type").equals(details.getSenderType())){
                    									if(newvalues.get("TemplateContent").equals(details.getTemplate())){
                    										if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
                    											if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                    												Status=true;
                    											else System.out.println("Change reason data mismatch");
                    										}
                    										else System.out.println("Modify reason data mismatch");
                										}
                										else {System.out.println("Template data mismatch");}
            										}
            										else System.out.println("Type data mismatch");
            									}
        										else System.out.println("Enabled data mismatch");
            								}
            								else {System.out.println("Name data mismatch");}
            							}
            							else {System.out.println("DNIS data mismatch");	}	
            						}
            						else {System.out.println("New values data mismatch");}
                 				}
        						else {System.out.println("Template data mismatch");}
    						}
    						else {System.out.println("Type data mismatch");	}	
    					}
    					else System.out.println("Enabled data mismatch");
    				}
    				else System.out.println("Name data mismatch");
    			}
    			else System.out.println("DNIS Data Mismatch");
        	}
        	else {System.out.println("Old values data mismatch");}
        return Status;
	}

	public boolean verifyFaxAutoACKConfigDelete(FaxAutoACKConfigurationDetails details,String Transaction) throws Exception {
		booleansearchold(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("DNIS").equals(details.getFaxLine()))
			{
				if(oldvalues.get("TemplateContent").equals(details.getTemplate()))
				{
					if(oldvalues.get("Enabled").equals(details.getStatus()))
					{
						if(oldvalues.get("Type").equals(details.getSenderType()))
						{
							if(oldvalues.get("Name").equals(details.getName())) {
								if(firstRowData.get("ModifyReason").equalsIgnoreCase(details.getDeleteReason())) {
									if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
		    		        			Status=true;
									else System.out.println("Change reason data mismatch");
								}
								else System.out.println("Modify reason data mismatch");
							}
							else System.out.println("Name data mismatch");
						}
						else {System.out.println("Type  data mismatch");}
					}
					else {System.out.println("Enabled data mismatch");}
				}
				else {System.out.println("Template data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");}
			return Status;
	}

	public boolean verifyAgentTransferCreate(AgentTransferDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getVdnDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			System.out.println(e);
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("IMD_MENU_ID").equals(details.getMenuId()))
			{
				if(newvalues.get("VDN_NUM").equals(details.getVdn()))
				{
					if(newvalues.get("VIP_VDN_NUM").equals(details.getVipVdn()))
					{
						if(newvalues.get("OPTION").equals(details.getOption()))
						{
							if(newvalues.get("DNIS").equals(details.getDNIS()))
							{
								if(newvalues.get("VDN_DESC").equals(details.getVdnDescription()))
								{
									Status= true;
								}
								else {System.out.println("VDN_DESC data mismatch");}
							}
							else {System.out.println("DNIS data mismatch");}
						}
						else {System.out.println("OPTION data mismatch");}
					}
					else {System.out.println("VIP_VDN_NUM data mismatch");}
				}
				else {System.out.println("VDN_NUM data mismatch");	}
			}
			else {System.out.println("IMD_MENU_ID data mismatch");	}
			return Status;
	}

	public boolean verifyAgentTransferUpdate(AgentTransferDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdateVdnDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("IMD_MENU_ID").equals(details.getMenuId())){
    			if(oldvalues.get("VDN_NUM").equals(details.getVdn())){
    				if(oldvalues.get("VIP_VDN_NUM").equals(details.getVipVdn())) {
    					if(oldvalues.get("OPTION").equals(details.getOption())){
        					if(oldvalues.get("DNIS").equals(details.getDNIS())){
            					if(oldvalues.get("VDN_DESC").equals(details.getVdnDescription())){
            						if(firstRowData.containsKey("New Values")) {
            							Map<String,String> newvalues=new HashMap<>();
            							String[]d1=firstRowData.get("New Values").split("\n");
            							for(String e:d1) {
            								String f[]=e.split(":",2);
            								if(f.length>1)
            									newvalues.put(f[0], f[1]);
            							}
            							if(newvalues.get("IMD_MENU_ID").equals(details.getMenuId())){
            				    			if(newvalues.get("VDN_NUM").equals(details.getVdn())){
            				    				if(newvalues.get("VIP_VDN_NUM").equals(details.getVipVdn())) {
            				    					if(newvalues.get("OPTION").equals(details.getOption())){
            				        					if(newvalues.get("DNIS").equals(details.getDNIS())){
            				            					if(newvalues.get("VDN_DESC").equals(details.getUpdateVdnDescription())) {
                				            					if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
                            										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                            											Status=true;
                            										else System.out.println("Change reason data mismatch");
                				            					}
                    											else System.out.println("Modify reason data mismatch");	
            				            					}
            				            					else System.out.println("VDN_DESC data mismatch");
            				        					}
            				        					else System.out.println("DNIS data mismatch");
            				    					}
        				        					else System.out.println("OPTION data mismatch");
            				    				}
        										else System.out.println("VIP_VDN_NUM data mismatch");
    										}
    										else System.out.println("VDN_NUM data mismatch");
            							}
            		        			else {System.out.println("IMD_MENU_ID data mismatch");}
    		        				}
                					else {System.out.println("New values data mismatch");}
    		        			}
            					else System.out.println("VDN_DESC data mismatch");
    		        		}
        					else System.out.println("DNIS data mismatch");
    					}
    					else System.out.println("OPTION data mismatch");
    				}
    				else System.out.println("VIP_VDN_NUM data mismatch");
    			}
    			else System.out.println("VDN_NUM data mismatch");
    		}
    		else {System.out.println("IMD_MENU_ID data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifySkillConfigurationCreate(SkillConfigurationDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getSkillName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			System.out.println(e);
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("SkillID").equals(details.getSkillID()))
			{
				if(newvalues.get("SkillName").equals(details.getSkillName()))
				{
					if(newvalues.get("SkillExtension").equals(details.getSkillExtension()))
					{
						if(newvalues.get("Priority").equals(details.getSkillPriority()))
						{
							if(newvalues.get("SkillTimeOutTime").equals(details.getTimeout()))
							{
								if(newvalues.get("SLATime").equals(details.getAcceptedSL()))
								{
									if(newvalues.get("IsEnabled").equals(details.getEnabled()))
										Status= true;
									else {System.out.println("Enabled data mismatch");}
								}
								else {System.out.println("SLA Time data mismatch");}
							}
							else {System.out.println("SkillTimeOutTime data mismatch");}
						}
						else {System.out.println("Priority data mismatch");}
					}
					else {System.out.println("Skil Extension data mismatch");}
				}
				else {System.out.println("SkillName data mismatch");	}
			}
			else {System.out.println("SkillID data mismatch");	}
			return Status;
	}

	public boolean verifySkillConfigurationUpdate(SkillConfigurationDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedSkillName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("SkillID").equals(details.getSkillID())){
    			if(oldvalues.get("SkillName").equals(details.getSkillName())){
    				if(oldvalues.get("SkillExtension").equals(details.getSkillExtension())) {
    					if(oldvalues.get("Priority").equals(details.getSkillPriority())){
        					if(oldvalues.get("SkillTimeOutTime").equals(details.getTimeout())){
            					if(oldvalues.get("SLATime").equals(details.getAcceptedSL())){
                					if(oldvalues.get("IsEnabled").equals(details.getEnabled())){
                						if(firstRowData.containsKey("New Values")) {
                							Map<String,String> newvalues=new HashMap<>();
                							String[]d1=firstRowData.get("New Values").split("\n");
                							for(String e:d1) {
                								String f[]=e.split(":",2);
                								if(f.length>1)
                									newvalues.put(f[0], f[1]);
                							}
                							if(newvalues.get("SkillID").equals(details.getSkillID())){
                				    			if(newvalues.get("SkillName").equals(details.getUpdatedSkillName())){
                				    				if(newvalues.get("SkillExtension").equals(details.getSkillExtension())) {
                				    					if(newvalues.get("Priority").equals(details.getSkillPriority())){
                				        					if(newvalues.get("SkillTimeOutTime").equals(details.getTimeout())){
                				            					if(newvalues.get("SLATime").equals(details.getAcceptedSL())){
                				                					if(newvalues.get("IsEnabled").equals(details.getUpdatedEnabled())){
                				                						if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
                				                							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                				                								Status=true;
                				                							else System.out.println("Change reason data mismatch");
                				                						}
                				                						else System.out.println("Modify reason data mismatch");	
                				                					}
            				                						else System.out.println("Is Enabled data mismatch");	
                				            					}
                				            					else System.out.println("SLA Time data mismatch");
            				            					}
            				            					else System.out.println("SkillTimeOutTime data mismatch");
            				        					}
            				        					else System.out.println("Priority data mismatch");
            				    					}
        				        					else System.out.println("Skill Extension data mismatch");
            				    				}
        										else System.out.println("Skill Name data mismatch");
    										}
    										else System.out.println("Skill Id data mismatch");
            							}
            		        			else {System.out.println("New values data mismatch");}
    		        				}
                					else {System.out.println("IS Enabled data mismatch");}
    		        			}
            					else System.out.println("SLA Time data mismatch");
    		        		}
        					else System.out.println("SkillTimeOut data mismatch");
    					}
    					else System.out.println("Priority data mismatch");
    				}
    				else System.out.println("Skill Extension data mismatch");
    			}
    			else System.out.println("Skill Name data mismatch");
    		}
    		else {System.out.println("Skill Id data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifySkillConfigurationdelete(SkillConfigurationDetails details, String Transaction) throws Exception {
		booleansearchold(details.getSkillName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
		if(oldvalues.get("SkillID").equals(details.getSkillID())){
			if(oldvalues.get("SkillName").equals(details.getSkillName())){
				if(oldvalues.get("SkillExtension").equals(details.getSkillExtension())) {
					if(oldvalues.get("Priority").equals(details.getSkillPriority())){
    					if(oldvalues.get("SkillTimeOutTime").equals(details.getTimeout())){
        					if(oldvalues.get("SLATime").equals(details.getAcceptedSL())){
            					if(oldvalues.get("IsEnabled").equals(details.getEnabled())){
            						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
            							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
            								Status=true;
            							else System.out.println("Change reason data mismatch");
            						}
            						else System.out.println("Modify reason data mismatch");
            					}
        						else System.out.println("Is Enabled data mismatch");	
        					}
        					else {System.out.println("SLATime data mismatch");}
    					}
    					else {System.out.println("SkillTimeOutTime data mismatch");}
					}
					else {System.out.println("Priority data mismatch");}
				}
				else {System.out.println("SkillExtension data mismatch");}
			}
			else {System.out.println("SkillName data mismatch");}
		}
		else {System.out.println("SkillID data mismatch");}
		return Status;
	}

	public boolean verifyBranchManagementCreate(BranchManagementDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getBranchName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			System.out.println(e);
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("MainLines").equals(details.getMainLines()))
			{
				if(newvalues.get("SubLines").equals(details.getSubLines()))
				{
					if(newvalues.get("Location").equals(details.getLocation()))
					{
						if(newvalues.get("BranchType").equals(details.getBranchType()))
						{
							if(newvalues.get("BranchWavefile").equals(details.getBranchWave()))
							{
								if(newvalues.get("AddressWavefile").equals(details.getAddressWave()))
								{
									if(newvalues.get("BranchName").equals(details.getBranchName()))
									{
										if(newvalues.get("AddressText").equals(details.getAddress()))
										{
											if(newvalues.get("LineOrder").equals(details.getLineEstateOrder()))
											{
												if(newvalues.get("Status").equals(details.getStatus()))
												{
													if(newvalues.get("Language").equals(details.getLanguage()))
														Status= true;
													else {System.out.println("Language data mismatch");}
												}
												else {System.out.println("Status data mismatch");}
											}									
											else {System.out.println("Line/EstateOrder data mismatch");}
										}
										else {System.out.println("AddressText data mismatch");}
									}
									else {System.out.println("BranchName data mismatch");}
								}
								else {System.out.println("AddressWavfile data mismatch");}
							}
							else {System.out.println("BranchWavfile data mismatch");}
						}
						else {System.out.println("BranchType data mismatch");}
					}
					else {System.out.println("Location data mismatch");}
				}
				else {System.out.println("SubLines data mismatch");	}
			}
			else {System.out.println("MainLines data mismatch");	}
			return Status;
	}

	public boolean verifyBranchManagementUpdate(BranchManagementDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedSubLines(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("MainLines").equals(details.getMainLines())){
    			if(oldvalues.get("SubLines").equals(details.getSubLines())){
    				if(oldvalues.get("Location").equals(details.getLocation())) {
    					if(oldvalues.get("BranchType").equals(details.getBranchType())){
        					if(oldvalues.get("BranchWavefile").equals(details.getBranchWave())){
            					if(oldvalues.get("AddressWavefile").equals(details.getAddressWave())){
                					if(oldvalues.get("BranchName").equals(details.getBranchName())){
                    					if(oldvalues.get("AddressText").equals(details.getAddress())){
                        					if(oldvalues.get("LineOrder").equals(details.getLineEstateOrder())){
                            					if(oldvalues.get("Status").equals(details.getStatus())){
                                					if(oldvalues.get("Language").equals(details.getLanguage())){
                                						if(firstRowData.containsKey("New Values")) {
                                							Map<String,String> newvalues=new HashMap<>();
                                							String[]d1=firstRowData.get("New Values").split("\n");
                                							for(String e:d1) {
                                								String f[]=e.split(":",2);
                                								if(f.length>1)
                                									newvalues.put(f[0], f[1]);
                                							}
                                							if(newvalues.get("MainLines").equals(details.getMainLines()))
                                							{
                                								if(newvalues.get("SubLines").equals(details.getUpdatedSubLines()))
                                								{
                                									if(newvalues.get("Location").equals(details.getLocation()))
                                									{
                                										if(newvalues.get("BranchType").equals(details.getBranchType()))
                                										{
                                											if(newvalues.get("BranchWavefile").equals(details.getBranchWave()))
                                											{
                                												if(newvalues.get("AddressWavefile").equals(details.getAddressWave()))
                                												{
                                													if(newvalues.get("BranchName").equals(details.getBranchName()))
                                													{
                                														if(newvalues.get("AddressText").equals(details.getAddress()))
                                														{
                                															if(newvalues.get("LineOrder").equals(details.getLineEstateOrder()))
                                															{
                                																if(newvalues.get("Status").equals(details.getUpdatedStatus()))
                                																{
                                																	if(newvalues.get("Language").equals(details.getLanguage()))
                                																	{	
                                																		if(newvalues.get("ModifyReason").equals(details.getModifyReason())) 
                                																		{
                                																			if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                                																				Status=true;
                                																			else System.out.println("Change reason data mismatch");
                                																		}
                                																		else System.out.println("Modify reason data mismatch");	
                                																	}
                                																	else System.out.println("Language data mismatch");	
                                																}
                                																else System.out.println("Status data mismatch");
                                															}
                                															else System.out.println("LineOrder data mismatch");
                                														}
                                														else System.out.println("AddressText data mismatch");
                                													}
                                													else System.out.println("BranchName data mismatch");
                                												}
                                												else System.out.println("AddressWavefile data mismatch");
                                											}
                                											else System.out.println("BranchWavefile data mismatch");
                                										}
                            											else System.out.println("BranchType data mismatch");
                                									}
                        											else System.out.println("Location data mismatch");
                                								}
                    											else System.out.println("SubLines data mismatch");
                                							}
                											else System.out.println("MainLines data mismatch");
                                						}
                            		        			else {System.out.println("New values data mismatch");}
                                					}
                        		        			else {System.out.println("Language data mismatch");}
                            					}
                    		        			else {System.out.println("Status data mismatch");}
                        					}
                		        			else {System.out.println("LineOrder data mismatch");}
            							}
            		        			else {System.out.println("AddressText data mismatch");}
    		        				}
                					else {System.out.println("BranchName data mismatch");}
    		        			}
            					else System.out.println("AddressWavefile data mismatch");
    		        		}
        					else System.out.println("BranchWavefile data mismatch");
    					}
    					else System.out.println("BranchType data mismatch");
    				}
    				else System.out.println("Location data mismatch");
    			}
    			else System.out.println("SubLines data mismatch");
    		}
    		else {System.out.println("MainLines data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyBranchManagementDelete(BranchManagementDetails details, String Transaction) throws Exception {
		booleansearchold(details.getBranchName(),Transaction);	
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
		if(oldvalues.get("MainLines").equals(details.getMainLines())){
			if(oldvalues.get("SubLines").equals(details.getSubLines())){
				if(oldvalues.get("Location").equals(details.getLocation())) {
					if(oldvalues.get("BranchType").equals(details.getBranchType())){
    					if(oldvalues.get("BranchWavefile").equals(details.getBranchWave())){
        					if(oldvalues.get("AddressWavefile").equals(details.getAddressWave())){
            					if(oldvalues.get("BranchName").equals(details.getBranchName())){
                					if(oldvalues.get("AddressText").equals(details.getAddress())){
                    					if(oldvalues.get("LineOrder").equals(details.getLineEstateOrder())){
                        					if(oldvalues.get("Status").equals(details.getStatus())){
                            					if(oldvalues.get("Language").equals(details.getLanguage())){
                            						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
                            							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
                            								Status=true;
                            							else System.out.println("Change reason data mismatch");
                            						}
                            						else {System.out.println("Modify Reason  data mismatch");}
                            					}
            									else {System.out.println("Language data mismatch");}
                        					}
        									else {System.out.println("Status data mismatch");}
                    					}
    									else {System.out.println("LineOrder data mismatch");}
									}
									else {System.out.println("AddressText data mismatch");}
								}
								else {System.out.println("BranchName  data mismatch");}
							}
							else {System.out.println("AddressWaveFile data mismatch");}
						}
						else {System.out.println("BranchWavefile data mismatch");}
					}
					else {System.out.println("BranchType data mismatch");}
				}
				else {System.out.println("Location data mismatch");}
			}
			else {System.out.println("Sublines data mismatch");}
		}
		else {System.out.println("MainLines data mismatch");}
	return Status;
	}

	public boolean verifyCallbackAnnouncementCreate(CallbackAnnouncementDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getWavFile(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("WaveFile").equals(details.getWavFile()))
			{
				if(newvalues.get("StartTime").equals(details.getStartTime()))
				{
					if(newvalues.get("EndTime").equals(details.getEndTime()))
					{
						if(newvalues.get("Language").equals(details.getLanguage()))
						Status= true;
						else {System.out.println("Language data mismatch");}
					}
					else {System.out.println("EndTime data mismatch");}
				}
				else {System.out.println("StartTime data mismatch");}
			}
			else {System.out.println("WavFile data mismatch");	}
			return Status;
	}

	public boolean verifyCallBackAnnouncementUpdate(CallbackAnnouncementDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getWavFile(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("WaveFile").equals(details.getWavFile())){
    			if(oldvalues.get("StartTime").equals(details.getStartTime())) {
    				if(oldvalues.get("EndTime").equals(details.getEndTime())){
        				if(oldvalues.get("Language").equals(details.getLanguage())){
    						if(firstRowData.containsKey("New Values")) {
    							Map<String,String> newvalues=new HashMap<>();
    							String[]d1=firstRowData.get("New Values").split("\n");
    							for(String e:d1) {
    								String f[]=e.split(":",2);
    								if(f.length>1)
    		        				newvalues.put(f[0], f[1]);
    							}
    							if(newvalues.get("WaveFile").equals(details.getWavFile())){
    								if(newvalues.get("StartTime").equals(details.getUpdatedStartTime())) {
    									if(newvalues.get("EndTime").equals(details.getUpdatedEndTime())){
    	    								if(newvalues.get("Language").equals(details.getLanguage())){
    											if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
    												if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
    													Status=true;
    												else System.out.println("Change reason data mismatch");
    											}
    											else System.out.println("Modify reason data mismatch");
    										}
    										else System.out.println("Language data mismatch");
    		        				}
    		        				else {System.out.println("End Time data mismatch");}
    		        			}
    		        			else {System.out.println("Starttime data mismatch");}
    		        			}
    		        		else {System.out.println("WaveFile data mismatch");	}	
    		    		}
    		    		else {System.out.println("New values data mismatch");}
    					}
    				else {System.out.println("Language data mismatch");}
    			}
    			else {System.out.println("End Time data mismatch");}
    			}
    		else {System.out.println("StartTime data mismatch");	}	
    	}
    	else System.out.println("WaveFile data mismatch");
        }
    else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyCallbackAnnouncemnetdelete(CallbackAnnouncementDetails details,
			String Transaction) throws Exception {
		booleansearchold(details.getWavFile(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("WaveFile").equals(details.getWavFile()))
			{
				if(oldvalues.get("StartTime").equals(details.getStartTime()))
				{
					if(oldvalues.get("EndTime").equals(details.getEndTime()))
					{
						if(oldvalues.get("Language").equals(details.getLanguage()))
						{
							if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
								if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
    		        			Status=true;
								else System.out.println("Change reason data mismatch");
							}
							else System.out.println("Modify reason data mismatch");
						}
						else {System.out.println("Language  data mismatch");}
					}
					else {System.out.println("End Time data mismatch");}
				}
				else {System.out.println("Start time mismatch");}
			}
			else {System.out.println("WaveFile data mismatch");}
			return Status;
	}

	public boolean verifyFaxApplicationFormCreate(FaxApplicationFormDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getFunctionality(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("FUNCTIONALITY").equals(details.getFunctionality()))
			{
				if(newvalues.get("LANGUAGE").equals(details.getLanguage()))
				{
					if(newvalues.get("WAV_FILE").equals(details.getWavFile()))
					{
						if(newvalues.get("FORM_NAME").equals(details.getPDFFile()))
						{
							if(newvalues.get("STATUS").equals(details.getStatus()))
								Status= true;
							else {System.out.println("Status data mismatch");}
						}
						else {System.out.println("Form Name data mismatch");}
					}
					else {System.out.println("Wavfile data mismatch");}
				}
				else {System.out.println("Language data mismatch");}
			}
			else {System.out.println("Functionality data mismatch");	}
			return Status;
	}

	public boolean verifyFaxApplicationFormUpdate(FaxApplicationFormDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getFunctionality(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("FUNCTIONALITY").equals(details.getFunctionality())){
    			if(oldvalues.get("LANGUAGE").equals(details.getLanguage())) {
    				if(oldvalues.get("WAV_FILE").equals(details.getWavFile())){
        				if(oldvalues.get("FORM_NAME").equals(details.getPDFFile())){
            				if(oldvalues.get("STATUS").equals(details.getStatus())){
            					if(firstRowData.containsKey("New Values")) {
            						Map<String,String> newvalues=new HashMap<>();
            						String[]d1=firstRowData.get("New Values").split("\n");
            						for(String e:d1) {
            							String f[]=e.split(":",2);
            							if(f.length>1)
            								newvalues.put(f[0], f[1]);
            						}
            						if(newvalues.get("FUNCTIONALITY").equals(details.getFunctionality()))
            						{
            							if(newvalues.get("LANGUAGE").equals(details.getLanguage()))
            							{
            								if(newvalues.get("WAV_FILE").equals(details.getWavFile()))
            								{
            									if(newvalues.get("FORM_NAME").equals(details.getPDFFile()))
            									{
            										if(newvalues.get("STATUS").equals(details.getUpdatedStatus())) {
            											if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
            												if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
            													Status=true;
            												else System.out.println("Change reason data mismatch");
            											}
            											else System.out.println("Modify reason data mismatch");
    												}
    												else System.out.println("Status data mismatch");
            									}
    											else System.out.println("Form Name data mismatch");
    										}
    										else System.out.println("Wave File data mismatch");
    		        					}
    		        					else {System.out.println("Language data mismatch");}
    		        				}
    		        				else {System.out.println("Functionality data mismatch");}
    		        			}
    		        			else {System.out.println("New values data mismatch");	}	
    		    			}
    		    			else {System.out.println("Status data mismatch");}
    					}
    					else {System.out.println("Form Name data mismatch");}
    				}
    				else {System.out.println("WaveFile data mismatch");}
    			}
    			else {System.out.println("Language data mismatch");	}	
    		}
    		else System.out.println("Functionality data mismatch");
        }
    	else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyFaxApplicationFormdelete(FaxApplicationFormDetails details, String Transaction) throws Exception {
		booleansearchold(details.getFunctionality(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
		if(oldvalues.get("FUNCTIONALITY").equals(details.getFunctionality())){
			if(oldvalues.get("LANGUAGE").equals(details.getLanguage())) {
				if(oldvalues.get("WAV_FILE").equals(details.getWavFile())){
    				if(oldvalues.get("FORM_NAME").equals(details.getPDFFile())){
        				if(oldvalues.get("STATUS").equals(details.getStatus())){
							if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
								if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
    		        			Status=true;
								else System.out.println("Change reason data mismatch");
							}
							else System.out.println("Modify reason data mismatch");
						}
						else {System.out.println("Status data mismatch");}
					}
					else {System.out.println("Form Name data mismatch");}
				}
				else {System.out.println("WaveFile mismatch");}
			}
			else {System.out.println("Language data mismatch");}
		}
		else {System.out.println("Functionality data mismatch");}
			return Status;
	}

	public boolean verifyIvrConfigCreate(IvrConfigDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getParameter(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("Parameter").equals(details.getParameter()))
			{
				if(newvalues.get("Value").equals(details.getValue()))
					Status= true;
				else {System.out.println("Value data mismatch");}
			}
			else {System.out.println("Parameter data mismatch");	}
			return Status;
	}

	public boolean verifyIvrConfigUpdate(IvrConfigDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getParameter(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Parameter").equals(details.getParameter())){
    			if(oldvalues.get("Value").equals(details.getValue())) {
    				if(firstRowData.containsKey("New Values")) {
    					Map<String,String> newvalues=new HashMap<>();
            			String[]d1=firstRowData.get("New Values").split("\n");
            			for(String e:d1) {
            				String f[]=e.split(":",2);
            				if(f.length>1)
            					newvalues.put(f[0], f[1]);
            			}
            			if(newvalues.get("Parameter").equals(details.getParameter())) {
            				if(newvalues.get("Value").equals(details.getUpdatedValue())) {
            					if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
            						if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
            							Status=true;
            						else System.out.println("Change reason data mismatch");
            					}
            					else System.out.println("Modify reason data mismatch");
    						}
            				else {System.out.println("Value data mismatch");}
						}    					
    					else {System.out.println("Parameter data mismatch");}
    				}
    				else {System.out.println("New Values data mismatch");}
    			}
    			else {System.out.println("Value data mismatch");	}	
    		}
    		else System.out.println("Parameter data mismatch");
        }
    	else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyIvrConfigdelete(IvrConfigDetails details, String Transaction) throws Exception {
		booleansearchold(details.getParameter(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Parameter").equals(details.getParameter()))
			{
				if(oldvalues.get("Value").equals(details.getValue()))
				{
					if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
						if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
							Status=true;
						else System.out.println("Change reason data mismatch");
					}
					else System.out.println("Modify reason data mismatch");
				}
				else {System.out.println("Value mismatch");}
			}
			else {System.out.println("Parameter data mismatch");}
			return Status;
	}

	public boolean verifyVIPListManagementUpdate(VipListManagementDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getCallerID(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("CallerID").equals(details.getCallerID())){
    			if(oldvalues.get("Email").equals(details.getEmailID())){
    				if(oldvalues.get("FBHandle").equals(details.getFBHandle())) {
    					if(oldvalues.get("MessengerID").equals(details.getMessengerID())){
        					if(oldvalues.get("CustomerIDType").equals(details.getCustomerIDType())){
            					if(oldvalues.get("CustomerIDNo").equals(details.getCustomerIDNo())){
                					if(oldvalues.get("Country").equals(details.getCountry())){
                    					if(oldvalues.get("ContactType").equals(details.getContactType())){                					
                    						if(oldvalues.get("InclusionFlag").equals(details.getInclusionFlag())){
                            					if(oldvalues.get("ExclusionFlag").equals(details.getExclusionFlag())){
                                					if(oldvalues.get("OtherData").equals(details.getOtherData())){
                                						if(firstRowData.containsKey("New Values")) {
                                							Map<String,String> newvalues=new HashMap<>();
                                							String[]d1=firstRowData.get("New Values").split("\n");
                                							for(String e:d1) {
                                								String f[]=e.split(":",2);
                                								if(f.length>1)
                                									newvalues.put(f[0], f[1]);
                                							}
                                							if(newvalues.get("CallerID").equals(details.getCallerID())){
                                								if(newvalues.get("Email").equals(details.getEmailID())){
                                									if(newvalues.get("FBHandle").equals(details.getUpdatedFBHandle())) {
                                										if(newvalues.get("MessegerID").equals(details.getMessengerID())){
                                											if(newvalues.get("CustomerIDType").equals(details.getCustomerIDType())){
                                												if(newvalues.get("CustomerIDNo").equals(details.getCustomerIDNo())){
                                													if(newvalues.get("Country").equals(details.getCountry())){
                                    													if(newvalues.get("ContactType").equals(details.getContactType())){
                                        													if(newvalues.get("InclusionFlag").equals(details.getInclusionFlag())){
                                            													if(newvalues.get("ExclusionFlag").equals(details.getExclusionFlag())){
                                            	                                					if(newvalues.get("OtherData").equals(details.getOtherData())){
                                            	                                						if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
                                            	                                							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                                            	                                								Status=true;
                                            	                                							else System.out.println("Change reason data mismatch");
                                            	                                						}
                                            	                                						else System.out.println("Modify reason data mismatch");	
                                            	                                					}
                                            	                                					else System.out.println("OtherData data mismatch");	
                                            													}
                                        	                                					else System.out.println("ExclusionFlag data mismatch");	
                                        													}
                                    	                                					else System.out.println("InclusionFlag data mismatch");	
                                    													}
                                	                                					else System.out.println("ContactType data mismatch");	
                                													}
                            	                                					else System.out.println("Country data mismatch");	
                                												}
                        	                                					else System.out.println("CustomerIDNo data mismatch");	
                                											}
                    	                                					else System.out.println("CustomerIDType data mismatch");	
                                										}
                	                                					else System.out.println("MessengerID data mismatch");	
                                									}
            	                                					else System.out.println("FBHandle data mismatch");	
                                								}
                				            					else System.out.println("Email data mismatch");
            				            					}
            				            					else System.out.println("CallerID data mismatch");
            				        					}
            				        					else System.out.println("NewValues data mismatch");
            				    					}
        				        					else System.out.println("OtherData data mismatch");
            				    				}
        										else System.out.println("ExclusionFlag data mismatch");
    										}
    										else System.out.println("InclusionFlag data mismatch");
            							}
            		        			else {System.out.println("ContactType data mismatch");}
    		        				}
                					else {System.out.println("Country data mismatch");}
    		        			}
            					else System.out.println("CustomerIDType data mismatch");
    		        		}
        					else System.out.println("CustomerIDNo data mismatch");
    					}
    					else System.out.println("MessengerID data mismatch");
    				}
    				else System.out.println("FBHandle data mismatch");
    			}
    			else System.out.println("Email data mismatch");
    		}
    		else {System.out.println("Caller IDdata mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyVIPListManagementCreate(VipListManagementDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getEmailID(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("CallerID").equals(details.getCallerID()))
			{
				if(newvalues.get("Email").equals(details.getEmailID()))
				{
					if(newvalues.get("FBHandle").equals(details.getFBHandle()))
					{
						if(newvalues.get("MessengerID").equals(details.getMessengerID()))
						{
							if(newvalues.get("CustomerIDType").equals(details.getCustomerIDType()))
							{
								if(newvalues.get("Country").equals(details.getCountry()))
								{
									if(newvalues.get("ContactType").equals(details.getContactType()))
									{
										if(newvalues.get("InclusionFlag").equals(details.getInclusionFlag()))
										{
											if(newvalues.get("ExclusionFlag").equals(details.getExclusionFlag()))
											{
												if(newvalues.get("OtherData").equals(details.getOtherData()))
													Status= true;
												else {System.out.println("OtherData data mismatch");}
											}
											else {System.out.println("Exclusion Flag data mismatch");}
										}
										else {System.out.println("Inclusion Flag data mismatch");}
									}
									else {System.out.println("ContactType data mismatch");}
								}
								else {System.out.println("Country data mismatch");}
							}
							else {System.out.println("CustomerIDType data mismatch");}
						}	
						else {System.out.println("MessengerID data mismatch");}
					}
					else {System.out.println("FBHandle data mismatch");}
				}
				else {System.out.println("Email data mismatch");}
			}
			else {System.out.println("Caller ID data mismatch");}
			return Status;
	}

	public boolean verifyVIPListManagementdelete(VipListManagementDetails details, String Transaction) throws Exception {
		booleansearchold(details.getEmailID(),Transaction);	
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
		if(oldvalues.get("CallerID").equals(details.getCallerID())){
			if(oldvalues.get("Email").equals(details.getEmailID())){
				if(oldvalues.get("FBHandle").equals(details.getFBHandle())) {
					if(oldvalues.get("MessengerID").equals(details.getMessengerID())){
    					if(oldvalues.get("CustomerIDType").equals(details.getCustomerIDType())){
        					if(oldvalues.get("CustomerIDNo").equals(details.getCustomerIDNo())){
            					if(oldvalues.get("Country").equals(details.getCountry())){
                					if(oldvalues.get("ContactType").equals(details.getContactType())){
                    					if(oldvalues.get("InclusionFlag").equals(details.getInclusionFlag())){
                        					if(oldvalues.get("ExclusionFlag").equals(details.getExclusionFlag())){
                            					if(oldvalues.get("OtherData").equals(details.getOtherData())){
                            						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
                            							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
                            								Status=true;
                            							else System.out.println("Change reason data mismatch");
                            						}
                            						else {System.out.println("Modify Reason  data mismatch");}
                            					}
            									else {System.out.println("OtherData data mismatch");}
                        					}
        									else {System.out.println("Exclsuion Flag data mismatch");}
                    					}
    									else {System.out.println("Inclusion Flag data mismatch");}
									}
									else {System.out.println("ContactType data mismatch");}
								}
								else {System.out.println("Country  data mismatch");}
							}
							else {System.out.println("CustomerIDNo data mismatch");}
						}
						else {System.out.println("CustomerIDType data mismatch");}
					}
					else {System.out.println("MessengerID data mismatch");}
				}
				else {System.out.println("FBHandle data mismatch");}
			}
			else {System.out.println("Email data mismatch");}
		}
		else {System.out.println("CallerID data mismatch");}
	return Status;
	}

	public boolean verifyHostValueMappingCreate(HostValueMappingDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("Functionality").equals(details.getFunctionality()))
			{
				if(newvalues.get("Language").equals(details.getLanguage()))
				{
					if(newvalues.get("HostData").equals(details.getHostData()))
					{
						if(newvalues.get("Status").equals(details.getStatus()))
						{
							if(newvalues.get("Description").equals(details.getDescription()))
							{
								if(newvalues.get("WaveFile").equals(details.getWaveFile()))
								{
									Status=true;
								}
								else {System.out.println("WaveFile data mismatch");}
							}
							else {System.out.println("Description data mismatch");}
						}	
						else {System.out.println("Status data mismatch");}
					}
					else {System.out.println("HostData data mismatch");}
				}
				else {System.out.println("Language data mismatch");}
			}
			else {System.out.println("Functionality data mismatch");}
			return Status;
	}

	public boolean verifyHostValueMappingUpdate(HostValueMappingDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Functionality").equals(details.getFunctionality())){
    			if(oldvalues.get("HostData").equals(details.getHostData())){
    				if(oldvalues.get("Language").equals(details.getLanguage())) {
    					if(oldvalues.get("Status").equals(details.getStatus())){
        					if(oldvalues.get("Description").equals(details.getDescription())){
            					if(oldvalues.get("WaveFile").equals(details.getWaveFile())){
            						if(firstRowData.containsKey("New Values")) {
                                		Map<String,String> newvalues=new HashMap<>();
                                		String[]d1=firstRowData.get("New Values").split("\n");
                                		for(String e:d1) {
                                			String f[]=e.split(":",2);
                                			if(f.length>1)
                                				newvalues.put(f[0], f[1]);
                                		}
                                		if(newvalues.get("Functionality").equals(details.getFunctionality())) {
                                			if(newvalues.get("Language").equals(details.getLanguage())){
                                				if(newvalues.get("HostData").equals(details.getHostData())){
                                					if(newvalues.get("Status").equals(details.getStatus())){
                                						if(newvalues.get("Description").equals(details.getUpdatedDescription())){
                                							if(newvalues.get("WaveFile").equals(details.getWaveFile())) {	
                                								if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                                									if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                                            	                       	Status=true;
                                            	                    else System.out.println("Change reason data mismatch");
                                            	                 }
                                            	                 else System.out.println("Modify reason data mismatch");	
            				            					}
            				            					else System.out.println("WaveFile data mismatch");
            				        					}
            				        					else System.out.println("Description data mismatch");
            				    					}
        				        					else System.out.println("Status data mismatch");
            				    				}
        										else System.out.println("HostData data mismatch");
    										}
    										else System.out.println("Language data mismatch");
            							}
            		        			else {System.out.println("Functionality data mismatch");}
    		        				}
                					else {System.out.println("New Values data mismatch");}
    		        			}
            					else System.out.println("WaveFile data mismatch");
    		        		}
        					else System.out.println("Description data mismatch");
    					}
    					else System.out.println("Status data mismatch");
    				}
    				else System.out.println("HostData data mismatch");
    			}
    			else System.out.println("Language data mismatch");
    		}
    		else {System.out.println("Functionality data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyHostValueMappingDelete(HostValueMappingDetails details, String Transaction) throws Exception {
		booleansearchold(details.getDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Functionality").equals(details.getFunctionality()))
			{
				if(oldvalues.get("HostData").equals(details.getHostData()))
				{
					if(oldvalues.get("Language").equals(details.getLanguage()))
					{
						if(oldvalues.get("Description").equals(details.getDescription()))
						{
							if(oldvalues.get("WaveFile").equals(details.getWaveFile()))
							{
								if(oldvalues.get("Status").equals(details.getStatus()))
								{
									if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
											Status=true;
										else System.out.println("Change reason data mismatch");
									}
									else System.out.println("Modify reason data mismatch");
								}
								else System.out.println("Status data mismatch");
							}
							else System.out.println("WaveFile data mismatch");
						}
						else {System.out.println("Description data mismatch");}
					}
					else {System.out.println("Language data mismatch");}
				}
				else {System.out.println("HostData mismatch");}
			}
			else {System.out.println("Functionality data mismatch");}
			return Status;
	}

	public boolean verifyMenuDescriptionMappingCreate(MenuDescriptionMappingDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getMenuName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("MenuId").equals(details.getMenuID()))
			{
				if(newvalues.get("MenuName").equals(details.getMenuName()))
				{
					if(newvalues.get("Intent").equals(details.getIntent()))
					{
						Status= true;
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("MenuName data mismatch");}
			}
			else {System.out.println("MenuId data mismatch");	}
			return Status;
	}

	public boolean verifyMenuDescriptionMappingUpdate(MenuDescriptionMappingDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedMenuName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("MenuId").equals(details.getMenuID())){
    			if(oldvalues.get("MenuName").equals(details.getMenuName())) {
        			if(oldvalues.get("Intent").equals(details.getIntent())) {
        				if(firstRowData.containsKey("New Values")) {
        					Map<String,String> newvalues=new HashMap<>();
        					String[]d1=firstRowData.get("New Values").split("\n");
        					for(String e:d1) {
        						String f[]=e.split(":",2);
        						if(f.length>1)
        							newvalues.put(f[0], f[1]);
        					}
        					if(newvalues.get("MenuId").equals(details.getMenuID())) {
        						if(newvalues.get("MenuName").equals(details.getUpdatedMenuName())) {
            						if(newvalues.get("Intent").equals(details.getIntent())) {
        								if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
        									if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
        										Status=true;
        									else System.out.println("Change reason data mismatch");
        								}
        								else System.out.println("Modify reason data mismatch");
            						}
    								else System.out.println("Intent data mismatch");
        						}
								else System.out.println("MenuName data mismatch");
    						}
            				else {System.out.println("Menu ID data mismatch");}
						}    					
    					else {System.out.println("New Values data mismatch");}
    				}
    				else {System.out.println("Intent data mismatch");}
    			}
    			else {System.out.println("MenuName data mismatch");	}	
    		}
    		else System.out.println("MenuID data mismatch");
        }
    	else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyMenuDescriptionMappingdelete(MenuDescriptionMappingDetails details,
			String Transaction) throws Exception {
		booleansearchold(details.getMenuName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("MenuId").equals(details.getMenuID()))
			{
				if(oldvalues.get("MenuName").equals(details.getMenuName()))
				{
					if(oldvalues.get("Intent").equals(details.getIntent()))
					{
						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
								Status=true;
							else System.out.println("Change reason data mismatch");
							}
						else System.out.println("Modify reason data mismatch");
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("Menu Name mismatch");}
			}
			else {System.out.println("Intent data mismatch");}
		return Status;
	}

	public boolean verifyVBEnrollmentFlagCreate(VBEnrollmentFlagDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getDNIS(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("DNIS").equals(details.getDNIS()))
			{
				if(newvalues.get("HotlineName").equals(details.getHotLineName()))
				{
					if(newvalues.get("EnrollmentFlag").equals(details.getEnrollmentFlag()))
					{
						Status= true;
					}
					else {System.out.println("EnrollmentFlag data mismatch");}
				}
				else {System.out.println("Hot Line Name data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");	}
			return Status;
	}

	public boolean verifyVBEnrollmentFlagUpdate(VBEnrollmentFlagDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedHotLineName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("DNIS").equals(details.getDNIS())){
    			if(oldvalues.get("HotlineName").equals(details.getHotLineName())) {
        			if(oldvalues.get("EnrollmentFlag").equals(details.getEnrollmentFlag())) {
        				if(firstRowData.containsKey("New Values")) {
        					Map<String,String> newvalues=new HashMap<>();
        					String[]d1=firstRowData.get("New Values").split("\n");
        					for(String e:d1) {
        						String f[]=e.split(":",2);
        						if(f.length>1)
        							newvalues.put(f[0], f[1]);
        					}
        					if(newvalues.get("DNIS").equals(details.getDNIS())) {
        						if(newvalues.get("HotlineName").equals(details.getUpdatedHotLineName())) {
            						if(newvalues.get("EnrollmentFlag").equals(details.getEnrollmentFlag())) {
        								if(newvalues.get("ModifyReason").equals(details.getModifyReason())) {
        									if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
        										Status=true;
        									else System.out.println("Change reason data mismatch");
        								}
        								else System.out.println("Modify reason data mismatch");
            						}
    								else System.out.println("EnrollmentFlag data mismatch");
        						}
								else System.out.println("HotLineName data mismatch");
    						}
            				else {System.out.println("DNIS data mismatch");}
						}    					
    					else {System.out.println("New Values data mismatch");}
    				}
    				else {System.out.println("EnrollmentFlag data mismatch");}
    			}
    			else {System.out.println("HotLIneName data mismatch");	}	
    		}
    		else System.out.println("DNIS data mismatch");
        }
    	else {System.out.println("Old values data mismatch");}
    return Status;
	}

	public boolean verifyVBEnrollmentFlagdelete(VBEnrollmentFlagDetails details, String Transaction) throws Exception {
		booleansearchold(details.getHotLineName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("DNIS").equals(details.getDNIS()))
			{
				if(oldvalues.get("HotlineName").equals(details.getHotLineName()))
				{
					if(oldvalues.get("EnrollmentFlag").equals(details.getEnrollmentFlag()))
					{
						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
								Status=true;
							else System.out.println("Change reason data mismatch");
							}
						else System.out.println("Modify reason data mismatch");
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("Menu Name mismatch");}
			}
			else {System.out.println("Intent data mismatch");}
		return Status;
	}

	public boolean verifyIntentMappingCreate(IntentMappingDetails intentMappingDetails, String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyIntentMappingUpdate(IntentMappingDetails intentMappingDetails, String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyIntentMappingdelete(IntentMappingDetails details, String Transaction) throws Exception {
		booleansearchold(details.getVDN(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("VDN").equals(details.getVDN()))
			{
				if(oldvalues.get("Product").equals(details.getProduct()))
				{
					if(oldvalues.get("Segment").equals(details.getSegment()))
					{
						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
								Status=true;
							else System.out.println("Change reason data mismatch");
							}
						else System.out.println("Modify reason data mismatch");
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("Menu Name mismatch");}
			}
			else {System.out.println("Intent data mismatch");}
		return Status;
	}

	public boolean verifyIntroMessageAnnouncementCreate(IntroMessageAnnouncementDetails details,String Transaction) throws Exception {
		booleansearchnew(details.getHotLine(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("Functionality").equals(details.getFunctionality()))
			{
				if(newvalues.get("Language").equals(details.getLanguage()))
				{
					if(newvalues.get("Hotline").equals(details.getHotLine()))
					{
						if(newvalues.get("Interrupt").equals(details.getInterrupt()))
						{
							if(newvalues.get("Status").equals(details.getStatus()))
							{
								if(newvalues.get("WaveFile").equals(details.getWavFile()))
									Status= true;
								else {System.out.println("WaveFile data mismatch");}
							}
							else {System.out.println("Status data mismatch");}
						}
						else {System.out.println("Interrupt data mismatch");}
					}
					else {System.out.println("Hotline data mismatch");}
				}
				else {System.out.println("Language data mismatch");}
			}
			else {System.out.println("Functionality data mismatch");	}
		return Status;
	}

	public boolean verifyIntroMessageAnnouncementUpdate(IntroMessageAnnouncementDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getWavFile(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Functionality").equals(details.getFunctionality())){
    			if(oldvalues.get("Hotline").equals(details.getHotLine())){
    				if(oldvalues.get("Language").equals(details.getLanguage())) {
    					if(oldvalues.get("Interrupt").equals(details.getInterrupt())){
        					if(oldvalues.get("Status").equals(details.getStatus())){
            					if(oldvalues.get("WaveFile").equals(details.getWavFile())){
                					if(firstRowData.containsKey("New Values")) {
                						Map<String,String> newvalues=new HashMap<>();
                						String[]d1=firstRowData.get("New Values").split("\n");
                						for(String e:d1) {
                							String f[]=e.split(":",2);
                							if(f.length>1)
                								newvalues.put(f[0], f[1]);
                							}
                							if(newvalues.get("Functionality").equals(details.getFunctionality())) {
                								if(newvalues.get("Language").equals(details.getLanguage())){
                									if(newvalues.get("HotLine").equals(details.getHotLine())){
                										if(newvalues.get("Interrupt").equals(details.getUpdatedInterrupt())){
                											if(newvalues.get("Status").equals(details.getStatus())){
                												if(newvalues.get("WaveFile").equals(details.getWavFile())) {	
                    												if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                														if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                															Status=true;
                														else System.out.println("Change reason data mismatch");
                    													}
                    												else System.out.println("Modify reason data mismatch");
                    											}
                												else System.out.println("WaveFile data mismatch");
                											}
                											else System.out.println("Status data mismatch");
                										}
                										else System.out.println("Interrupt data mismatch");
                									}
                									else System.out.println("HotLine data mismatch");
                								}
                								else System.out.println("Language data mismatch");
                							}
                							else {System.out.println("Functionality data mismatch");}
                						}
                						else {System.out.println("New Values data mismatch");}
                					}
                					else System.out.println("WaveFile data mismatch");
            					}
            					else System.out.println("Status data mismatch");
        					}
        					else System.out.println("Interrupt data mismatch");
    					}
    					else System.out.println("HotLine data mismatch");
    				}
    				else System.out.println("Language data mismatch");
    			}
    			else {System.out.println("Functionality data mismatch");}
    		}
			else {System.out.println("Old Values data mismatch");}
 return Status;
}
	public boolean verifyIntroMessageAnnouncementDelete(IntroMessageAnnouncementDetails details,
			String Transaction) throws Exception {
		booleansearchold(details.getHotLine(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Functionality").equals(details.getFunctionality()))
			{
				if(oldvalues.get("Hotline").equals(details.getHotLine()))
				{
					if(oldvalues.get("Status").equals(details.getStatus()))
					{
						if(oldvalues.get("Interrupt").equals(details.getInterrupt()))
						{
							if(oldvalues.get("Language").equals(details.getLanguage()))
							{
								if(oldvalues.get("WaveFile").equals(details.getWavFile()))
								{
									if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
											Status=true;
										else System.out.println("Change reason data mismatch");
										}
									else System.out.println("Modify reason data mismatch");
								}
								else {System.out.println("WaveFile data mismatch");}
							}
							else {System.out.println("Language data mismatch");}
					}
					else {System.out.println("Interrupt data mismatch");}
				}
				else {System.out.println("Status data mismatch");}
			}
			else {System.out.println("Functionality data mismatch");}
			}
		return Status;	
	}
	
	
	public boolean verifyChatIntentSkillMappingCreate(ChatIntentSkillMappingDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getSegment(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("Segment").equals(details.getSegment()))
			{
				if(newvalues.get("SubSegment").equals(details.getSubSegment()))
				{
					if(newvalues.get("Intent").equals(details.getIntent()))
					{
						if(newvalues.get("Language").equals(details.getLanguage()))
						{
							if(newvalues.get("RequestType").equals(details.getChannel()))
							{
								if(newvalues.get("CustEntType").equals(details.getCustEntType()))
									if(newvalues.get("ChatVdn").equals(details.getSkill()))
										Status= true;
									else {System.out.println("Skill data mismatch");}

								else {System.out.println("CustEntType data mismatch");}
							}
							else {System.out.println("Request type data mismatch");}
						}
						else {System.out.println("Language data mismatch");}
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("SubSegment data mismatch");}
			}
			else {System.out.println("Segment data mismatch");	}
		return Status;
	}

	public boolean verifyChatIntentSkillMappingUpdate(ChatIntentSkillMappingDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedSegment(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Segment").equals(details.getSegment())){
    			if(oldvalues.get("Subsegment").equals(details.getSubSegment())){
    				if(oldvalues.get("Language").equals(details.getLanguage())) {
    					if(oldvalues.get("Intent").equals(details.getIntent())){
        					if(oldvalues.get("RequestType").equals(details.getChannel())){
            					if(oldvalues.get("CustEntType").equals(details.getCustEntType())){
                					if(oldvalues.get("ChatVdn").equals(details.getSkill())){
                						if(firstRowData.containsKey("New Values")) {
                							Map<String,String> newvalues=new HashMap<>();
                							String[]d1=firstRowData.get("New Values").split("\n");
                							for(String e:d1) {
                								String f[]=e.split(":",2);
                								if(f.length>1)
                									newvalues.put(f[0], f[1]);
                							}
                							if(newvalues.get("Segment").equals(details.getUpdatedSegment())) {
                								if(newvalues.get("Language").equals(details.getLanguage())){
                									if(newvalues.get("SubSegment").equals(details.getUpdatedSubSegment())){
                										if(newvalues.get("Intent").equals(details.getIntent())){
                											if(newvalues.get("RequestType").equals(details.getChannel())){
                												if(newvalues.get("CustEntType").equals(details.getCustEntType())) {	
                    												if(newvalues.get("ChatVdn").equals(details.getSkill())) {	
                    													if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                															if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                																Status=true;
                															else System.out.println("Change reason data mismatch");
                    													}
                    													else System.out.println("Modify reason data mismatch");
                    												}
                													else System.out.println("Skills data mismatch");
                            				            		}
                												else System.out.println("CustEntType data mismatch");
                											}
                											else System.out.println("RequestType data mismatch");
                										}
                										else System.out.println("Intent data mismatch");
                									}
                									else System.out.println("SubSegment data mismatch");
                								}
                								else System.out.println("Language data mismatch");
                							}
                							else {System.out.println("Segment data mismatch");}
                						}
                						else {System.out.println("New Values data mismatch");}
                					}
                					else System.out.println("ChatVdn data mismatch");
            					}
            					else System.out.println("CustEntType data mismatch");
        					}
        					else System.out.println("RequestType data mismatch");
    					}
    					else System.out.println("Intent data mismatch");
    				}
    				else System.out.println("Language data mismatch");
    			}
    			else {System.out.println("SubSegment data mismatch");}
    		}
			else {System.out.println("Segment data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyChatIntentSkillMappingdelete(ChatIntentSkillMappingDetails details,
			String Transaction) throws Exception {
		booleansearchold(details.getSegment(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Segment").equals(details.getSegment()))
			{
				if(oldvalues.get("SubSegment").equals(details.getSubSegment()))
				{
					if(oldvalues.get("Segment").equals(details.getSegment()))
					{
						if(oldvalues.get("Intent").equals(details.getIntent()))
						{
							if(oldvalues.get("Language").equals(details.getLanguage()))
							{
								if(oldvalues.get("RequestType").equals(details.getChannel()))
								{
									if(oldvalues.get("CustEntType").equals(details.getCustEntType())) {
										if(oldvalues.get("ChatVdn").equals(details.getSkill())) {
											if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
												if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
													Status=true;
												else System.out.println("Change reason data mismatch");
											}
											else System.out.println("Modify reason data mismatch");
										}
										else {System.out.println("ChatVdn data mismatch");}
									}
									else {System.out.println("CustEntType data mismatch");}
								}
								else {System.out.println("RequestType data mismatch");}
							}
							else {System.out.println("Language data mismatch");}
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("SubSegment data mismatch");}
			}
			else {System.out.println("Segment data mismatch");}
			}
		return Status;	
			}

	public boolean verifyChatTemplatesDepartmentCreate(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getDepartmentName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("Name").equals(details.getDepartmentName()))
			{
				if(newvalues.get("Enabled").equals(details.getDeptEnabled()))
				{
					Status= true;
				}
				else {System.out.println("Enabled data mismatch");}
			}
			else {System.out.println("Name data mismatch");	}
			return Status;		
	}

	public boolean verifyChatTemplatesGroupCreate(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getDepartmentName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
		if(newvalues.get("DepartmentName").equals(details.getDepartmentName()))
		{
			if(newvalues.get("Name").equals(details.getGroupName()))
			{
				if(newvalues.get("Enabled").equals(details.getDeptEnabled()))
				{
					Status= true;
				}
				else {System.out.println("Enabled data mismatch");}
			}
			else {System.out.println("Name data mismatch");	}
		}	
		else {System.out.println("Department Name data mismatch");	}
		return Status;		
	}

	public boolean verifyChatTemplatesCreate(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("DepartmentName").equals(details.getDepartmentName()))
			{
				if(newvalues.get("GroupName").equals(details.getGroupName()))
				{
					if(newvalues.get("Name").equals(details.getName()))
					{
						if(newvalues.get("Text").equals(details.getText()))
						{
							if(newvalues.get("Enabled").equals(details.getEnabled()))
							{
								if(newvalues.get("StartTime").equals(details.getStartTime()))
								{
									if(newvalues.get("EndTime").equals(details.getEndTime()))
										Status= true;
									else {System.out.println("EndTime data mismatch");}
								}
								else {System.out.println("StartTime data mismatch");}
							}
							else {System.out.println("Enabled data mismatch");}
						}
						else {System.out.println("Text data mismatch");}
					}
					else {System.out.println("Name data mismatch");}
				}
				else {System.out.println("GroupName data mismatch");}
			}
			else {System.out.println("Department data mismatch");	}
		return Status;
	}

	public boolean verifyChatTemplateDepartmentUpdate(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getDepartmentName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Name").equals(details.getDepartmentName())){
    			if(oldvalues.get("Enabled").equals(details.getDeptEnabled())){
    				if(firstRowData.containsKey("New Values")) {
    					Map<String,String> newvalues=new HashMap<>();
    					String[]d1=firstRowData.get("New Values").split("\n");
                		for(String e:d1) {
                			String f[]=e.split(":",2);
                			if(f.length>1)
                				newvalues.put(f[0], f[1]);
                		}
                		if(newvalues.get("Name").equals(details.getDepartmentName())) {
                			if(newvalues.get("Enabled").equals(details.getUpdatedDeptEnabled())){
                				if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                					if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                						Status=true;
                					else System.out.println("Change reason data mismatch");
                    			}
                				else System.out.println("Modify reason data mismatch");
                			}
                			else System.out.println("Enabled data mismatch");
    					}
    					else System.out.println("Name data mismatch");
    				}
    				else System.out.println("New Values data mismatch");
    			}
    			else {System.out.println("Enabled data mismatch");}
    		}
			else {System.out.println("Name data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyChatTemplateUpdate(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Name").equals(details.getName())){
    			if(oldvalues.get("Text").equals(details.getText())){
    				if(oldvalues.get("Enabled").equals(details.getEnabled())) {
    					if(oldvalues.get("GroupName").equals(details.getGroupName())){
        					if(oldvalues.get("DepartmentName").equals(details.getDepartmentName())){
            					if(oldvalues.get("StartTime").equals(details.getStartTime())){
                					if(oldvalues.get("EndTime").equals(details.getEndTime())){
                						if(firstRowData.containsKey("New Values")) {
                							Map<String,String> newvalues=new HashMap<>();
                							String[]d1=firstRowData.get("New Values").split("\n");
                							for(String e:d1) {
                								String f[]=e.split(":",2);
                								if(f.length>1)
                									newvalues.put(f[0], f[1]);
                							}
                							if(newvalues.get("Name").equals(details.getName())) {
                								if(newvalues.get("Text").equals(details.getText())){
                									if(newvalues.get("Enabled").equals(details.getUpdatedEnabled())){
                										if(newvalues.get("GroupName").equals(details.getGroupName())){
                											if(newvalues.get("DepartmentName").equals(details.getDepartmentName())){
                												if(newvalues.get("StartTime").equals(details.getStartTime())) {	
                    												if(newvalues.get("EndTime").equals(details.getEndTime())) {	
                    													if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                															if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                																Status=true;
                															else System.out.println("Change reason data mismatch");
                    													}
                    													else System.out.println("Modify reason data mismatch");
                    												}
                													else System.out.println("EndTime data mismatch");
                            				            		}
                												else System.out.println("StartTime data mismatch");
                											}
                											else System.out.println("DepartmentName data mismatch");
                										}
                										else System.out.println("GroupName data mismatch");
                									}
                									else System.out.println("Enabled data mismatch");
                								}
                								else System.out.println("Text data mismatch");
                							}
                							else {System.out.println("Name data mismatch");}
                						}
                						else {System.out.println("New Values data mismatch");}
                					}
                					else System.out.println("EndTime data mismatch");
            					}
            					else System.out.println("StartTime data mismatch");
        					}
        					else System.out.println("DepartmentName data mismatch");
    					}
    					else System.out.println("GroupName data mismatch");
    				}
    				else System.out.println("Enabled data mismatch");
    			}
    			else {System.out.println("Text data mismatch");}
    		}
			else {System.out.println("Name data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyChatTemplateGroupUpdate(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getGroupName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Name").equals(details.getGroupName())){
    			if(oldvalues.get("Enabled").equals(details.getEnabled())) {
    				if(oldvalues.get("DepartmentName").equals(details.getDepartmentName())){
    					if(firstRowData.containsKey("New Values")) {
                			Map<String,String> newvalues=new HashMap<>();
                			String[]d1=firstRowData.get("New Values").split("\n");
                			for(String e:d1) {
                				String f[]=e.split(":",2);
                				if(f.length>1)
                					newvalues.put(f[0], f[1]);
                			}
                			if(newvalues.get("Name").equals(details.getGroupName())) {
                				if(newvalues.get("Enabled").equals(details.getUpdatedEnabled())){
                					if(newvalues.get("DepartmentName").equals(details.getDepartmentName())){
                						if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                								Status=true;
                							else System.out.println("Change reason data mismatch");
                    						}
                    					else System.out.println("Modify reason data mismatch");
                					}
                					else System.out.println("DepartmentName data mismatch");
                				}
                				else System.out.println("Enabled data mismatch");
                			}
                			else {System.out.println("Name data mismatch");}
                		}
    					else {System.out.println("New Values data mismatch");}
    				}
        			else System.out.println("DepartmentName data mismatch");
    			}
    			else System.out.println("Enabled data mismatch");
    		}
			else {System.out.println("Name data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyChatTemplatedelete(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchold(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Name").equals(details.getName()))
			{
				if(oldvalues.get("Enabled").equals(details.getEnabled()))
				{
					if(oldvalues.get("DepartmentName").equals(details.getDepartmentName()))
					{
						if(oldvalues.get("GroupName").equals(details.getGroupName()))
						{
							if(oldvalues.get("Text").equals(details.getText()))
							{
								if(oldvalues.get("StartTime").equals(details.getStartTime()))
								{
									if(oldvalues.get("EndTime").equals(details.getEndTime())) {
										if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
											if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
													Status=true;
											else System.out.println("Change reason data mismatch");
										}
										else System.out.println("Modify reason data mismatch");
									}
									else {System.out.println("EndTime data mismatch");}
								}
								else {System.out.println("StartTime data mismatch");}
							}
							else {System.out.println("Text data mismatch");}
					}
					else {System.out.println("GroupName data mismatch");}
				}
				else {System.out.println("DepartmentName data mismatch");}
			}
			else {System.out.println("Enabled data mismatch");}
		}
		else {System.out.println("NAmedata mismatch");}
		return Status;	
	}

	public boolean verifyDepartmentdelete(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchold(details.getDepartmentName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Name").equals(details.getDepartmentName()))
			{
				if(oldvalues.get("Enabled").equals(details.getEnabled()))
				{
					if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
						if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
							Status=true;
						else System.out.println("Change reason data mismatch");
					}
					else System.out.println("Modify reason data mismatch");
				}
				else {System.out.println("Enabled mismatch");}
			}
			else {System.out.println("Name data mismatch");}
			return Status;
	}

	public boolean verifyGroupdelete(ChatTemplateDetails details, String Transaction) throws Exception {
		booleansearchold(details.getGroupName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Name").equals(details.getGroupName()))
			{
				if(oldvalues.get("DepartmentName").equals(details.getDepartmentName()))
				{
					if(oldvalues.get("Enabled").equals(details.getDeleteReason())) {
						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
								Status=true;
							else System.out.println("Change reason data mismatch");
						}
						else System.out.println("Modify reason data mismatch");
					}
					else System.out.println("Enabled data mismatch");
				}
				else {System.out.println("Department data mismatch");}
			}
			else {System.out.println("Name data mismatch");}
			return Status;
	}

	public boolean verifyCepEventMappingCreate(CepEventMappingDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("EventType").equals(details.getCepEvent()))
			{
				if(newvalues.get("ProductType").equals(details.getProductType()))
				{
					if(newvalues.get("Bin").equals(details.getBins()))
					{
						if(newvalues.get("Intent").equals(details.getIntent()))
						{
							if(newvalues.get("TransferStatus").equals(details.getTransferFlag()))
							{
								if(newvalues.get("Description").equals(details.getDescription()))
									Status= true;
								else {System.out.println("Description data mismatch");}
							}
							else {System.out.println("TransferStatus data mismatch");}
						}
						else {System.out.println("Intent data mismatch");}
					}
					else {System.out.println("Bin data mismatch");}
				}
				else {System.out.println("ProductType data mismatch");}
			}
			else {System.out.println("EventType data mismatch");	}
		return Status;
	}

	public boolean verifyCepEventMappingUpdate(CepEventMappingDetails details, String Transaction) throws Exception {
			booleansearchnew(details.getUpdatedDescription(),Transaction);
			Boolean Status=false;
	        Map<String,String> firstRowData=getFirstRowDatafromTable1();
	        if(firstRowData.containsKey("Old Values")) {
	        	Map<String,String> oldvalues=new HashMap<>();
	    		String[]d=firstRowData.get("Old Values").split("\n");
	    		for(String e:d) {
	    			System.out.println(e);
	    			String f[]=e.split(":",2);
	    			if(f.length>1)
	    				oldvalues.put(f[0], f[1]);
	    		}
	    		if(oldvalues.get("EventType").equals(details.getCepEvent())){
	    			if(oldvalues.get("ProductType").equals(details.getProductType())){
	    				if(oldvalues.get("Bin").equals(details.getBins())) {
	    					if(oldvalues.get("Intent").equals(details.getIntent())){
	        					if(oldvalues.get("TransferStatus").equals(details.getTransferFlag())){
	            					if(oldvalues.get("Description").equals(details.getDescription())){
	                					if(firstRowData.containsKey("New Values")) {
	                						Map<String,String> newvalues=new HashMap<>();
	                						String[]d1=firstRowData.get("New Values").split("\n");
	                						for(String e:d1) {
	                							String f[]=e.split(":",2);
	                							if(f.length>1)
	                								newvalues.put(f[0], f[1]);
	                						}
	                						if(newvalues.get("EventType").equals(details.getCepEvent())) {
	                							if(newvalues.get("ProductType").equals(details.getProductType())){
	                								if(newvalues.get("Bin").equals(details.getBins())){
	                									if(newvalues.get("Intent").equals(details.getIntent())){
	                										if(newvalues.get("TransferStatus").equals(details.getTransferFlag())){
	                    										if(newvalues.get("Description").equals(details.getUpdatedDescription())) {	
	                    											if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
	                													if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
	                														Status=true;
	                													else System.out.println("Change reason data mismatch");
	                    											}
	                    											else System.out.println("Modify reason data mismatch");
	                    										}
	    	                									else System.out.println("Description data mismatch");
	                										}
	                										else System.out.println("Transfer Status data mismatch");
	                									}
	                									else System.out.println("Intent data mismatch");
	                								}
	                								else System.out.println("Bins data mismatch");
	                							}
	                							else {System.out.println("Product Type data mismatch");}
	                						}
	                						else {System.out.println("Event Type data mismatch");}
	                					}
	                					else System.out.println("New Values data mismatch");
	            					}
	            					else System.out.println("Description data mismatch");
	        					}
	        					else System.out.println("Transfer Status data mismatch");
	    					}
	    					else System.out.println("Intent data mismatch");
	    				}
	    				else System.out.println("Bins data mismatch");
	    			}
	    			else {System.out.println("Product Type data mismatch");}
	    		}
				else {System.out.println("Event Type data mismatch");}
	    	}
	        else {System.out.println("Old values data mismatch");}
	 return Status;
	}

	public boolean verifyCepEventMappingdelete(CepEventMappingDetails details, String Transaction) throws Exception {
		booleansearchold(details.getDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("EventType").equals(details.getCepEvent()))
			{
				if(oldvalues.get("ProductType").equals(details.getProductType()))
				{
					if(oldvalues.get("Bin").equals(details.getBins()))
					{
						if(oldvalues.get("Intent").equals(details.getIntent()))
						{
							if(oldvalues.get("TransferStatus").equals(details.getTransferFlag()))
							{
								if(oldvalues.get("Description").equals(details.getDescription()))
								{
									if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
											Status=true;
										else System.out.println("Change reason data mismatch");
									}
									else System.out.println("Modify reason data mismatch");
								}
								else {System.out.println("Description data mismatch");}
							}
							else {System.out.println("Transfer Status data mismatch");}
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("Bin data mismatch");}
			}
			else {System.out.println("Product Type data mismatch");}
		}
		else {System.out.println("Event Type data mismatch");}
		return Status;	
	}

	public boolean verifyRecipientCreate(FaxAddressBookDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getfirstName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("FirstName").equals(details.getfirstName()))
			{
				if(newvalues.get("LastName").equals(details.getlastName()))
				{
					if(newvalues.get("FaxNumber").equals(details.getNumber()))
					{
						Status= true;
					}
					else {System.out.println("Fax Number data mismatch");}
				}
				else {System.out.println("Last Name data mismatch");}
			}
			else {System.out.println("First Name data mismatch");	}
		return Status;
	}

	public boolean verifyRecipientUpdate(FaxAddressBookDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedFirstName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("FirstName").equals(details.getfirstName())){
    			if(oldvalues.get("LastName").equals(details.getlastName())){
    				if(oldvalues.get("FaxNumber").equals(details.getNumber())) {
    					if(firstRowData.containsKey("New Values")) {
    						Map<String,String> newvalues=new HashMap<>();
                			String[]d1=firstRowData.get("New Values").split("\n");
                			for(String e:d1) {
                				String f[]=e.split(":",2);
                				if(f.length>1)
                					newvalues.put(f[0], f[1]);
                			}
                			if(newvalues.get("FirstName").equals(details.getUpdatedFirstName())) {
                				if(newvalues.get("LastName").equals(details.getlastName())){
                					if(newvalues.get("FaxNumber").equals(details.getNumber())) {	
                    					if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                								Status=true;
                							else System.out.println("Change reason data mismatch");
                    					}
                    					else System.out.println("Modify reason data mismatch");
                					}
                					else System.out.println("Number data mismatch");
            					}
            					else System.out.println("Last Name data mismatch");
        					}
        					else System.out.println("First Name data mismatch");
    					}
    					else System.out.println("New values data mismatch");
    				}
    				else System.out.println("Number data mismatch");
    			}
    			else {System.out.println("Last Name data mismatch");}
    		}
			else {System.out.println("First Name data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyRecipientdelete(FaxAddressBookDetails details, String Transaction) throws Exception {
		booleansearchold(details.getfirstName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("FirstName").equals(details.getfirstName()))
			{
				if(oldvalues.get("LastName").equals(details.getlastName()))
				{
					if(oldvalues.get("FaxNumber").equals(details.getNumber()))
					{
						if(firstRowData.get("ModifyReason").equalsIgnoreCase(details.getDeleteReason())) {
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
		    		        	Status=true;
							else System.out.println("Change reason data mismatch");
						}
						else System.out.println("Modify reason data mismatch");
					}
					else {System.out.println("Enabled data mismatch");}
				}
				else {System.out.println("Template data mismatch");}
			}
			else {System.out.println("DNIS data mismatch");}
			return Status;
	}

	public boolean verifyFaxAddressCreate(FaxAddressBookDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("FaxLine").equals(details.getFaxLine()))
			{
				if(newvalues.get("Name").equals(details.getName()))
				{
					if(newvalues.get("Recipients").equals(details.getRecipients()))
					{
						Status= true;
					}
					else {System.out.println("Recipients data mismatch");}
				}
				else {System.out.println("Name data mismatch");}
			}
			else {System.out.println("FaxLine data mismatch");	}
		return Status;
	}

	public boolean verifyAddressBookUpdate(FaxAddressBookDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Name").equals(details.getName())){
    			if(oldvalues.get("FaxLine").equals(details.getFaxLine())){
    				if(oldvalues.get("Recipients").equals(details.getRecipients())) {
    					if(firstRowData.containsKey("New Values")) {
    						Map<String,String> newvalues=new HashMap<>();
                			String[]d1=firstRowData.get("New Values").split("\n");
                			for(String e:d1) {
                				String f[]=e.split(":",2);
                				if(f.length>1)
                					newvalues.put(f[0], f[1]);
                			}
                			if(newvalues.get("Name").equals(details.getUpdatedName())) {
                				if(newvalues.get("FaxLine").equals(details.getFaxLine())){
                					if(newvalues.get("Recipients").equals(details.getUpdatedRecipients())) {	
                    					if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                								Status=true;
                							else System.out.println("Change reason data mismatch");
                    					}
                    					else System.out.println("Modify reason data mismatch");
                					}
                					else System.out.println("Recipients data mismatch");
            					}
            					else System.out.println("FaxLine data mismatch");
        					}
        					else System.out.println("Name data mismatch");
    					}
    					else System.out.println("New values data mismatch");
    				}
    				else System.out.println("Recipients data mismatch");
    			}
    			else {System.out.println("FaxLine data mismatch");}
    		}
			else {System.out.println("Name data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyAddressBookdelete(FaxAddressBookDetails details, String Transaction) throws Exception {
		booleansearchold(details.getName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("Name").equals(details.getName()))
			{
				if(oldvalues.get("FaxLine").equals(details.getFaxLine()))
				{
					if(oldvalues.get("Recipients").equals(details.getRecipients()))
					{
						if(firstRowData.get("ModifyReason").equalsIgnoreCase(details.getDeleteReason())) {
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
		    		        	Status=true;
							else System.out.println("Change reason data mismatch");
						}
						else System.out.println("Modify reason data mismatch");
					}
					else {System.out.println("Recipients data mismatch");}
				}
				else {System.out.println("Faxline data mismatch");}
			}
			else {System.out.println("Name data mismatch");}
			return Status;
	}

	public boolean verifyChatMenuDescriptionCreate(ChatMenuDescriptionDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getMenuName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("MenuId").equals(details.getMenuId()))
			{
				if(newvalues.get("MenuName").equals(details.getMenuName()))
				{
					if(newvalues.get("Intent").equals(details.getIntent()))
					{
						Status= true;
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("Menu Name data mismatch");}
			}
			else {System.out.println("Menu Id data mismatch");	}
		return Status;
	}

	public boolean verifyChatMenuDescriptionUpdate(ChatMenuDescriptionDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedMenuName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("MenuId").equals(details.getMenuId())){
    			if(oldvalues.get("MenuName").equals(details.getMenuName())){
    				if(oldvalues.get("Intent").equals(details.getIntent())) {
    					if(firstRowData.containsKey("New Values")) {
    						Map<String,String> newvalues=new HashMap<>();
                			String[]d1=firstRowData.get("New Values").split("\n");
                			for(String e:d1) {
                				String f[]=e.split(":",2);
                				if(f.length>1)
                					newvalues.put(f[0], f[1]);
                			}
                			if(newvalues.get("MenuId").equals(details.getMenuId())) {
                				if(newvalues.get("MenuName").equals(details.getUpdatedMenuName())){
                					if(newvalues.get("Intent").equals(details.getIntent())) {	
                    					if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                								Status=true;
                							else System.out.println("Change reason data mismatch");
                    					}
                    					else System.out.println("Modify reason data mismatch");
                					}
                					else System.out.println("Intent data mismatch");
            					}
            					else System.out.println("Menu Name data mismatch");
        					}
        					else System.out.println("MenuId data mismatch");
    					}
    					else System.out.println("New values data mismatch");
    				}
    				else System.out.println("Intent data mismatch");
    			}
    			else {System.out.println("Menu Name data mismatch");}
    		}
			else {System.out.println("Menu Id data mismatch");}
    	}
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifyChatMenuDescriptiondelete(ChatMenuDescriptionDetails details,String Transaction) throws Exception {
		booleansearchold(details.getMenuName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
			if(oldvalues.get("MenuId").equals(details.getMenuId()))
			{
				if(oldvalues.get("MenuName").equals(details.getMenuName()))
				{
					if(oldvalues.get("Intent").equals(details.getIntent()))
					{
						if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
							if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
								Status=true;
							else System.out.println("Change reason data mismatch");
						}
						else System.out.println("Modify reason data mismatch");
					}
					else {System.out.println("Intent data mismatch");}
				}
				else {System.out.println("MenuName data mismatch");}
			}
			else {System.out.println("MenuId data mismatch");}
		return Status;	
	}

	public boolean verifySmsResponseTemplateCreate(SmsResponseTemplateDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getMessageDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
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

	public boolean verifySmsResponseTemplateUpdate(SmsResponseTemplateDetails details,
			String Transaction) throws Exception {
		booleansearchnew(details.getUpdatedMessageDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
        if(firstRowData.containsKey("Old Values")) {
        	Map<String,String> oldvalues=new HashMap<>();
    		String[]d=firstRowData.get("Old Values").split("\n");
    		for(String e:d) {
    			System.out.println(e);
    			String f[]=e.split(":",2);
    			if(f.length>1)
    				oldvalues.put(f[0], f[1]);
    		}
    		if(oldvalues.get("Text").equals(details.getText())){
    			if(oldvalues.get("Intent").equals(details.getIntent())){
    				if(oldvalues.get("Enable").equals(details.getEnable())) {
    					if(oldvalues.get("ICOMTemplateId").equals(details.getiCOMTemplateID())){
        					if(oldvalues.get("AppID").equals(details.getAppID())){
            					if(oldvalues.get("AlertCode").equals(details.getAlertCode())){
                					if(oldvalues.get("MessageDescription").equals(details.getMessageDescription())){
                						if(firstRowData.containsKey("New Values")) {
                						Map<String,String> newvalues=new HashMap<>();
                						String[]d1=firstRowData.get("New Values").split("\n");
                						for(String e:d1) {
                							String f[]=e.split(":",2);
                							if(f.length>1)
                								newvalues.put(f[0], f[1]);
                						}
                						if(newvalues.get("Text").equals(details.getText())) {
                							if(newvalues.get("Intent").equals(details.getIntent())){
                								if(newvalues.get("Enable").equals(details.getEnable())){
                									if(newvalues.get("ICOMTemplateId").equals(details.getiCOMTemplateID())){
                    									if(newvalues.get("MessageDescription").equals(details.getUpdatedMessageDescription())) {	
                        									if(newvalues.get("Source").equals(details.getUpdatedMessageDescription())) {	
                            									if(newvalues.get("AppID").equals(details.getUpdatedMessageDescription())) {	
                                									if(newvalues.get("AlertCode").equals(details.getUpdatedMessageDescription())) {	
                                										if(newvalues.get("ModifyReason").equals(details.getModifyReason())){ 
                                											if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getModifyReason()))
                                												Status=true;
                                											else System.out.println("Change reason data mismatch");
                                										}
                                										else System.out.println("Modify reason data mismatch");
                                									}
                	                								else System.out.println("AlertCode data mismatch");
                            									}
            	                								else System.out.println("AppID data mismatch");
                        									}
        	                								else System.out.println("Source data mismatch");
                    									}
                    									else System.out.println("MessageDescription data mismatch");
                									}
                									else System.out.println("ICOMTemplateID data mismatch");
                								}
                								else System.out.println("Enable data mismatch");
                							}
                							else {System.out.println("Intent data mismatch");}
                						}
                						else {System.out.println("Text data mismatch");}
                					}
                					else System.out.println("New Values data mismatch");
            					}
            					else System.out.println("MessageDescription data mismatch");
        					}
        					else System.out.println("AlertCode data mismatch");
    					}
    					else System.out.println("AppID data mismatch");
    				}
    				else System.out.println("ICOMTemplateID data mismatch");
    			}
    			else {System.out.println("Enable data mismatch");}
    		}
			else {System.out.println("Intent data mismatch");}
    		}
            else {System.out.println("Text data mismatch");}
        }
        else {System.out.println("Old values data mismatch");}
 return Status;
	}

	public boolean verifySmsResponseTemplateDelete(SmsResponseTemplateDetails details,
			String Transaction) throws Exception {
		booleansearchold(details.getMessageDescription(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> oldvalues=new HashMap<>();
		String[]d=firstRowData.get("Old Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			oldvalues.put(f[0], f[1]);
		}
		if(oldvalues.get("Text").equals(details.getText())){
			if(oldvalues.get("Intent").equals(details.getIntent())){
				if(oldvalues.get("Enable").equals(details.getEnable())) {
					if(oldvalues.get("ICOMTemplateId").equals(details.getiCOMTemplateID())){
    					if(oldvalues.get("AppID").equals(details.getAppID())){
        					if(oldvalues.get("AlertCode").equals(details.getAlertCode())){
            					if(oldvalues.get("MessageDescription").equals(details.getMessageDescription())){
									if(oldvalues.get("ModifyReason").equals(details.getDeleteReason())) {
										if(firstRowData.get("Change Reason").equalsIgnoreCase(details.getDeleteReason()))
											Status=true;
										else System.out.println("Change reason data mismatch");
									}
									else System.out.println("Modify reason data mismatch");
								}
								else {System.out.println("MessageDescription data mismatch");}
							}
							else {System.out.println("AlertCode data mismatch");}
					}
					else {System.out.println("AppID data mismatch");}
				}
				else {System.out.println("ICOMTemplateId data mismatch");}
			}
			else {System.out.println("Enable data mismatch");}
		}
		else {System.out.println("Intent data mismatch");}
		}
		else {System.out.println("Text data mismatch");}
		return Status;	
	}

	public boolean verifyEmailTemplateDepartmentCreate(EmailTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getDepartmentName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("Name").equals(details.getDepartmentName()))
			{
				if(newvalues.get("Enabled").equals(details.getDeptEnabled()))
				{
					Status= true;
				}
				else {System.out.println("Enabled data mismatch");}
			}
			else {System.out.println("Name data mismatch");	}
			return Status;		
	}

	public boolean verifyEmailTemplateGroupCreate(EmailTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getGroupName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
		if(newvalues.get("DepartmentName").equals(details.getDepartmentName()))
		{
			if(newvalues.get("Name").equals(details.getGroupName()))
			{
				if(newvalues.get("Enabled").equals(details.getGroupEnabled()))
				{
					Status= true;
				}
				else {System.out.println("Enabled data mismatch");}
			}
			else {System.out.println("Name data mismatch");	}
		}	
		else {System.out.println("Department Name data mismatch");	}
		return Status;
	}

	public boolean verifyEmailTemplateCreate(EmailTemplateDetails details, String Transaction) throws Exception {
		booleansearchnew(details.getTemplateName(),Transaction);
		Boolean Status=false;
        Map<String,String> firstRowData=getFirstRowDatafromTable1();
		Map<String,String> newvalues=new HashMap<>();
		String[]d=firstRowData.get("New Values").split("\n");
		for(String e:d) {
			String f[]=e.split(":",2);
			if(f.length>1)
			newvalues.put(f[0], f[1]);
		}
			if(newvalues.get("DepartmentName").equals(details.getDepartmentName()))
			{
				if(newvalues.get("GroupName").equals(details.getGroupName()))
				{
					if(newvalues.get("Name").equals(details.getTemplateName()))
					{
						if(newvalues.get("Subject").equals(details.getSubject()))
						{
							if(newvalues.get("Enabled").equals(details.getEnabled()))
							{
								if(newvalues.get("Type").equals(details.getType()))
								{
									if(newvalues.get("Body").equals(details.getBody()))
										Status= true;
									else {System.out.println("Body data mismatch");}
								}
								else {System.out.println("Type data mismatch");}
							}
							else {System.out.println("Enabled data mismatch");}
						}
						else {System.out.println("Subject data mismatch");}
					}
					else {System.out.println("Name data mismatch");}
				}
				else {System.out.println("GroupName data mismatch");}
			}
			else {System.out.println("Department data mismatch");	}
		return Status;
	}


	
}