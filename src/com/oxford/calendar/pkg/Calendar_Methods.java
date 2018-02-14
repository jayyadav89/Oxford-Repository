package com.oxford.calendar.pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.oxford.generic.pkg.Generic_Methods;

public class Calendar_Methods extends Generic_Methods{

	
	@FindBy(xpath = "//div[@id='dvCalendar']/h1")
	public WebElement Calendar_Text;
	
	@FindBy(xpath = "//div[@id='divAddEvents']/div/span")
	public WebElement AddEvent_LK;
	
	@FindBy(id = "Subject")
	public WebElement Title_TB;
	
	@FindBy(id= "Description")
	public WebElement Description_TB;
	
	@FindBy(xpath = "//select[@ng-model='selectedClassSubject']")
	public WebElement Class_DD;
	
	@FindBy(id = "IsAllDayEvent")
	public WebElement AllDayEvent_CB;
	
	@FindBy(xpath = "//select[@ng-model='selectedFromTimeHour']")
	public WebElement FromHours_DD;
	
	@FindBy(xpath = "//select[@ng-model='selectedToTimeHour']")
	public WebElement ToHours_DD;
	
	@FindBy(id = "btnSave")
	public WebElement Save_BT;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(id= "btncancel")
	public WebElement Cancel_BT;
	
	@FindBy(id= "stpartdate")
	public WebElement FromDate_LK;
	
	@FindBy(id= "etpartdate")
	public WebElement ToDate_LK;
	
	@FindBy(xpath = "//tr[2]/th")
	public WebElement BackDate_Icon;
	
	@FindBy(xpath = "//tr[2]/th[3]")
	public WebElement ForwardDate_Icon;
	
	@FindBy(xpath = "//div[@class='datepicker-days']/table/tbody/tr/td[6]")
	public WebElement SelectDate_LK;
	
	@FindBy(xpath = "//tr[2]/th")
	public WebElement BackDate2_Icon;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//tr[3]/td[7]")
	public WebElement SelectDate2_LK;
	
	@FindBy(xpath = "//td[6]")
	public WebElement SelectDateLearning_LK;
	
	@FindBy(id= "CPH_ucCalendar_schedule_Id")
	public WebElement ManageAssignment_LK;
	
	@FindBys({@FindBy(xpath = "//div[@class='corn_rw col-xs-12 col-sm-12 col-md-12 cnrl_rowh']")})
	private List<WebElement> LessonsList;
	
	@FindBy(id= "CPH_ddlClass")
	public WebElement ClassSubject_DD;
	
	@FindBy(id= "CPH_ddlType")
	public WebElement Type_DD;
	
	@FindBy(id= "CPH_txtStartDate")
	public WebElement FromDateManage_LK;
	
	@FindBy(xpath = "//div[@id='CPH_divActMsg']/div")
	public WebElement NoAssignmentFound_Text;
	
	@FindBy(id= "CPH_btnGo")
	public WebElement Go_BT;
	
	@FindBy(id= "iframeTemplate")
	public WebElement AddEvent_Frame;
	
	@FindBy(id= "iTestUser")
	public WebElement MarkingReport_Frame;
	
	@FindBy(xpath = "//a[@id='CPH_rptSchedules_lnkTestReport_0']/img")
	public WebElement Reports1_Icon;
	
	@FindBy(xpath = "//div[@id='summary_report']/div/div/div")
	public WebElement SummaryReport_Text;
	
	@FindBy(xpath = "//div[@id='resGraphStatus']/ul/li/span/span")
	public WebElement UnreadNum_Text;
	
	@FindBy(xpath = "//div[@id='resGraphStatus']/ul/li[2]/span/span")
	public WebElement ReadNum_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-5 col-sm-4 col-md-4 pull-right text-right rit_t_st']/span[2]")
	public WebElement StudentsNum_Text;
	
	@FindBys({@FindBy(xpath = "//div[@class='col-xs-11 col-sm-12 col-md-12 brdr_rt']//div[2]/strong")})
	private List<WebElement> StudentsList;
	
	@FindBy(id= "btnCloseChooseChapters")
	public WebElement Close_Icon;
	
	@FindBy(xpath = "//div[3]/div/div[2]/a/span")
	public WebElement ViewMarks_Icon;
	
	@FindBy(id= "lblPageHeading")
	public WebElement StudentResource_Text;
	
	@FindBy(id= "CPH_lblAssignmentName")
	public WebElement ResourceName_Text;
	
	@FindBy(id= "CPH_lblSubjectName")
	public WebElement SubjectName_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-3 col-md-3 ']/span")
	public WebElement StudentName_Label;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-2 col-md-2 ']/span")
	public WebElement ClassSection_Label;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-3 col-md-2 ']/span")
	public WebElement StartDate_Label;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-3 col-md-2 '][2]/span")
	public WebElement EndDate_Label;
	
	@FindBys({@FindBy(xpath = "//div[@class='corn_rw col-xs-12 col-sm-12 col-md-12 cnrl_rowh']")})
	private List<WebElement> TotalStudentsList;
	
	@FindBy(id= "CPH_lblTstName")
	public WebElement TestName_Text;
	
	@FindBy(id= "CPH_spnassetSubType")
	public WebElement TestType_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-4 col-sm-6 col-md-2 rt_pn'][2]/span[2]")
	public WebElement MaximumMarks_Text;
	
	@FindBy(id= "CPH_lblSubjectName")
	public WebElement Subject_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-10 col-sm-10 col-md-8']/span")
	public WebElement StudentNameTest_Label;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-3 col-md-3']/span")
	public WebElement ClassSectionTest_Label;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-3 col-md-3'][2]/span")
	public WebElement SubmittedDate_Label;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-3 col-md-3'][3]/span")
	public WebElement Marks_Label;
	
	@FindBy(id= "CPH_rptSubmission_txtRemark_0")
	public WebElement RemarksFeedback_TB;
	
	@FindBy(id= "CPH_btnSave")
	public WebElement SaveTest_BT;
	
	@FindBy(xpath = "//div[@id='divNavigate']/span")
	public WebElement SummaryReport_LK;
	
	@FindBy(xpath = "//div[@id='divNavigate']/span[3]")
	public WebElement QuestionwiseReport_LK;
	
	@FindBy(xpath = "//form[@id='form1']/div[3]/div/div/div/div/span[5]")
	public WebElement StudentTestReport_LK;
	
	@FindBy(xpath = "//form[@id='form1']/div[3]/div/div/div/div/span[7]")
	public WebElement LevelofDifficultReport_LK;
	
	@FindBy(xpath = "//form[@id='form1']/div[3]/div/div/div/div/span[9]")
	public WebElement LevelofClassificationReport_LK;
	
	@FindBy(id= "CPH_lblName")
	public WebElement AssignmentName_Text;
	
	@FindBy(id= "CPH_lblType")
	public WebElement AssignmentType_Text;
	
	@FindBy(id= "CPH_lblSubject")
	public WebElement AssignmentSubject_Text;
	
	@FindBys({@FindBy(xpath = "//div[@id='dvMainRowpint']/div/div/div/strong")})
	private List<WebElement> TotalAssignmentStudentsList;
	
	@FindBy(xpath = "//div[@id='dvView']/div/div")
	public WebElement PreviewAssignment_Icon;
	
	
	
	
	
	public void fn_VisibilityofCalendarText() throws InterruptedException, IOException{
	   if(Calendar_Text.isDisplayed()){
 	     Thread.sleep(2000);
 	     Assert.assertTrue(Calendar_Text.getText().trim().equals("Calendar"), "Calendar text does not match:  Fail");
         Thread.sleep(2000);
         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofCalendarText","Pass"); 
//         readWriteExcel(173,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofCalendarText","Pass");
	      }
	     else{
	    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofCalendarText","Fail"); 
//  	    readWriteExcel(173,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofCalendarText","Fail");
  	    	Thread.sleep(5000);
           }
	      }
	
	
	public void fn_AddAllDayEvent() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		fn_ScrollDown250();
		Thread.sleep(2000);
	   if(AddEvent_LK.isDisplayed()){
		fn_Click(AddEvent_LK);
 	    Thread.sleep(2000);
 	    driver.switchTo().frame(AddEvent_Frame);
 	    Thread.sleep(2000);
 	    fn_Input(Title_TB,obj.getProperty("EventTitleofAllDay"));
		Thread.sleep(2000);
		fn_Input(Description_TB,obj.getProperty("EventDescriptionofAllDay"));
		Thread.sleep(2000);
		fn_SelectbyIndex(Class_DD,0);
	 	Thread.sleep(2000);
	 	fn_Click(AllDayEvent_CB);
 	    Thread.sleep(2000);
 	    fn_Click(Save_BT);
	    Thread.sleep(2000);
		Assert.assertTrue(Popup_TX.getText().trim().equals("Calendar event added successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		fn_ScrollUp250();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddAllDayEvent","Pass");
//		readWriteExcel(174,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddAllDayEvent","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddAllDayEvent","Fail");
//	    readWriteExcel(174,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddAllDayEvent","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_AddSpecificHourEvent() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		fn_ScrollDown250();
		Thread.sleep(2000);
	   if(AddEvent_LK.isDisplayed()){
		fn_Click(AddEvent_LK);
 	    Thread.sleep(2000);
 	    driver.switchTo().frame(AddEvent_Frame);
	    Thread.sleep(2000);
 	    fn_Input(Title_TB,obj.getProperty("EventTitleofSpecificHour"));
		Thread.sleep(2000);
		fn_Input(Description_TB,obj.getProperty("EventDescriptionofSpecificHour"));
		Thread.sleep(2000);
		fn_SelectbyIndex(Class_DD,0);
	 	Thread.sleep(2000);
	 	fn_SelectbyIndex(FromHours_DD,18);
	 	Thread.sleep(2000);
	 	fn_SelectbyIndex(ToHours_DD,19);
	 	Thread.sleep(2000);
	 	fn_Click(Save_BT);
	    Thread.sleep(2000);
		Assert.assertTrue(Popup_TX.getText().trim().equals("Calendar event added successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		fn_ScrollUp250();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddSpecificHourEvent","Pass");
//		readWriteExcel(175,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddSpecificHourEvent","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddSpecificHourEvent","Fail");
//	    readWriteExcel(175,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddSpecificHourEvent","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ValidationsforMandatoryfields() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		fn_ScrollDown250();
		Thread.sleep(2000);
	   if(AddEvent_LK.isDisplayed()){
		fn_Click(AddEvent_LK);
 	    Thread.sleep(2000);
 	    driver.switchTo().frame(AddEvent_Frame);
	    Thread.sleep(2000);
 	    fn_Click(Save_BT);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Event title cannot be blank"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Input(Title_TB,obj.getProperty("EventTitleofSpecificHour"));
		Thread.sleep(2000);
		fn_Click(Save_BT);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Description cannot be blank"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Input(Description_TB,obj.getProperty("EventDescriptionofSpecificHour"));
		Thread.sleep(2000);
		fn_Click(Save_BT);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Start date or time is less than today's date or time"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_SelectbyIndex(FromHours_DD,18);
	 	Thread.sleep(2000);
	 	fn_Click(Save_BT);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("End date is less than start date"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Cancel_BT);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		fn_ScrollUp250();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationsforMandatoryfields","Pass");
//		readWriteExcel(176,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationsforMandatoryfields","Pass");
	    }
	    else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationsforMandatoryfields","Fail");
//	    readWriteExcel(176,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationsforMandatoryfields","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		fn_ScrollDown250();
		Thread.sleep(2000);
	   if(AddEvent_LK.isDisplayed()){
		fn_Click(AddEvent_LK);
 	    Thread.sleep(2000);
 	    driver.switchTo().frame(AddEvent_Frame);
	    Thread.sleep(2000);
 	    fn_Input(Title_TB,obj.getProperty("EventTitleofSpecificHour"));
		Thread.sleep(2000);
		fn_Input(Description_TB,obj.getProperty("EventDescriptionofSpecificHour"));
		Thread.sleep(2000);
		fn_SelectbyIndex(Class_DD,0);
	 	Thread.sleep(2000);
	 	fn_Click(FromDate_LK);
 	    Thread.sleep(2000);
 	    fn_Click(ForwardDate_Icon);
	    Thread.sleep(2000);
	    fn_Click(SelectDate_LK);
	    Thread.sleep(2000);
	 	fn_SelectbyIndex(FromHours_DD,19);
	 	Thread.sleep(2000);
	 	fn_SelectbyIndex(ToHours_DD,18);
	 	Thread.sleep(2000);
	 	fn_Click(Save_BT);
	    Thread.sleep(2000);
		Assert.assertTrue(Popup_TX.getText().trim().equals("End date is less than start date"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Cancel_BT);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		fn_ScrollUp250();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt","Pass");
//		readWriteExcel(177,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt","Fail");
//	    readWriteExcel(177,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		fn_ScrollDown250();
		Thread.sleep(2000);
	   if(AddEvent_LK.isDisplayed()){
		fn_Click(AddEvent_LK);
 	    Thread.sleep(2000);
 	    driver.switchTo().frame(AddEvent_Frame);
	    Thread.sleep(2000);
 	    fn_Input(Title_TB,obj.getProperty("EventTitleofSpecificHour"));
		Thread.sleep(2000);
		fn_Input(Description_TB,obj.getProperty("EventDescriptionofSpecificHour"));
		Thread.sleep(2000);
		fn_SelectbyIndex(Class_DD,0);
	 	Thread.sleep(2000);
	 	fn_Click(FromDate_LK);
 	    Thread.sleep(2000);
 	    fn_Click(BackDate_Icon);
	    Thread.sleep(2000);
	    fn_Click(SelectDate_LK);
	    Thread.sleep(2000);
	 	fn_SelectbyIndex(FromHours_DD,19);
	 	Thread.sleep(2000);
	 	fn_Click(ToDate_LK);
 	    Thread.sleep(2000);
 	    fn_Click(ForwardDate_Icon);
	    Thread.sleep(2000);
	    fn_Click(SelectDate_LK);
	    Thread.sleep(2000);
	 	fn_SelectbyIndex(ToHours_DD,18);
	 	Thread.sleep(2000);
	 	fn_Click(Save_BT);
	    Thread.sleep(2000);
		Assert.assertTrue(Popup_TX.getText().trim().equals("Start date or time is less than today's date or time"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Cancel_BT);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		fn_ScrollUp250();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt","Pass");
//		readWriteExcel(178,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt","Fail");
//	    readWriteExcel(178,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ValidationifToDateLessthanFromDate() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		fn_ScrollDown250();
		Thread.sleep(2000);
	   if(AddEvent_LK.isDisplayed()){
		fn_Click(AddEvent_LK);
 	    Thread.sleep(2000);
 	    driver.switchTo().frame(AddEvent_Frame);
	    Thread.sleep(2000);
 	    fn_Input(Title_TB,obj.getProperty("EventTitleofSpecificHour"));
		Thread.sleep(2000);
		fn_Input(Description_TB,obj.getProperty("EventDescriptionofSpecificHour"));
		Thread.sleep(2000);
		fn_SelectbyIndex(Class_DD,0);
	 	Thread.sleep(2000);
	 	fn_Click(AllDayEvent_CB);
 	    Thread.sleep(2000);
	 	fn_Click(ToDate_LK);
 	    Thread.sleep(2000);
 	    fn_Click(BackDate2_Icon);
	    Thread.sleep(2000);
	    fn_Click(SelectDate2_LK);
	    Thread.sleep(2000);
	 	fn_Click(Save_BT);
	    Thread.sleep(2000);
		Assert.assertTrue(Popup_TX.getText().trim().equals("End date is less than start date"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Cancel_BT);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		fn_ScrollUp250();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationifToDateLessthanFromDate","Pass");
//		readWriteExcel(179,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationifToDateLessthanFromDate","Pass");
	    }
	   else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationifToDateLessthanFromDate","Fail");
//	    readWriteExcel(179,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationifToDateLessthanFromDate","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_CancelAddEventPopup() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		fn_ScrollDown250();
		Thread.sleep(2000);
	   if(AddEvent_LK.isDisplayed()){
		fn_Click(AddEvent_LK);
 	    Thread.sleep(2000);
 	    driver.switchTo().frame(AddEvent_Frame);
	    Thread.sleep(2000);
 	    fn_Click(Cancel_BT);
 	    driver.switchTo().parentFrame();
		fn_ScrollUp250();
		Thread.sleep(2000);
		Thread.sleep(2000);
		Assert.assertTrue(AddEvent_LK.isDisplayed(), "Dashboard not redirected: Fail");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CancelAddEventPopup","Pass");
//		readWriteExcel(180,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelAddEventPopup","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CancelAddEventPopup","Fail");
//	    readWriteExcel(180,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelAddEventPopup","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_VisibilityofManageAssignments() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofManageAssignments","Pass");
//	         readWriteExcel(181,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofManageAssignments","Pass");
		      }
		     else{
		    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofManageAssignments","Fail");
//	  	    	readWriteExcel(181,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofManageAssignments","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	
	
	public void fn_ViewAllLessonPlansbyTeacher() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		try{ 
	 		 System.out.println("Total lesson plans on page:"+ LessonsList.size());
	 		 Thread.sleep(2000);
	 		 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLessonPlansbyTeacher","Pass");
	   //      readWriteExcel(182,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLessonPlansbyTeacher","Pass");
		      }
	 		catch(ElementNotFoundException e){
		    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
		         Thread.sleep(2000);
		         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLessonPlansbyTeacher","Pass");
//		         readWriteExcel(182,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLessonPlansbyTeacher","Pass");
		       }
	 		   }
	 		else{
	 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLessonPlansbyTeacher","Fail");
//	 		readWriteExcel(182,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLessonPlansbyTeacher","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	
	
	public void fn_ViewAllActivitiesforSpecifieddates() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,0);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDate2_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total activities are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllActivitiesforSpecifieddates","Pass");
//		         readWriteExcel(183,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllActivitiesforSpecifieddates","Pass");
			      }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000); 
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllActivitiesforSpecifieddates","Pass");
//			         readWriteExcel(183,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllActivitiesforSpecifieddates","Pass");
			       }
		 		   }
		 		else{
		 			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllActivitiesforSpecifieddates","Fail");
//		 		    readWriteExcel(183,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllActivitiesforSpecifieddates","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
		     
		     
		     
		     
	public void fn_ViewAllLearningMaterialsforSpecifieddates() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,2);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total Learning Materials are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLearningMaterialsforSpecifieddates","Pass");
//		         readWriteExcel(184,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLearningMaterialsforSpecifieddates","Pass");
			      }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLearningMaterialsforSpecifieddates","Pass");
//			         readWriteExcel(184,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLearningMaterialsforSpecifieddates","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLearningMaterialsforSpecifieddates","Fail");
//		 		readWriteExcel(184,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLearningMaterialsforSpecifieddates","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
		     
		     
	public void fn_ViewStudentResourceMarkingReport() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,2);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total Learning Materials are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(Reports1_Icon);
			     Thread.sleep(2000);
		 		driver.switchTo().frame(MarkingReport_Frame);
		 		Thread.sleep(2000);
		 		Assert.assertTrue(SummaryReport_Text.getText().trim().equals("Summary Report"), "Summary Report text is not visible:  Fail");
		        Thread.sleep(2000);
		 		 String Unread=UnreadNum_Text.getText();
		 		 System.out.println("Number of unread students:" + Unread);
		 		 Thread.sleep(2000);
		 		 String read=ReadNum_Text.getText();
		 		 System.out.println("Number of read students:" + read);
		 		 Thread.sleep(2000);
		 		 String studentnum=StudentsNum_Text.getText();
		 		 System.out.println("Number of students:" + studentnum);
		 		 Thread.sleep(2000);
		 		 
		 		java.util.Iterator<WebElement> i = StudentsList.iterator();
		 		while(i.hasNext()) {
		 		    WebElement row = i.next();
		 		    System.out.println(row.getText());
		 		  }
		 		 driver.switchTo().parentFrame();
		 		 fn_Click(Close_Icon);
			     Thread.sleep(2000);
			     readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentResourceMarkingReport","Pass");
//		         readWriteExcel(185,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentResourceMarkingReport","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentResourceMarkingReport","Pass");
//			         readWriteExcel(185,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentResourceMarkingReport","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentResourceMarkingReport","Fail");
//		 		readWriteExcel(185,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentResourceMarkingReport","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
		     
		     
	public void fn_ViewStudentsLearning() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,2);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total Learning Materials are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(ViewMarks_Icon);
			     Thread.sleep(2000);
		 		 Assert.assertTrue(StudentResource_Text.getText().trim().equals("Students Resource Track"), "Students resource track header is not visible:  Fail");
		         Thread.sleep(2000);
		 		 String resourcename=ResourceName_Text.getText();
		 		 System.out.println("Resource name is:" + resourcename);
		 		 Thread.sleep(2000);
		 		 String subjectname=SubjectName_Text.getText();
		 		 System.out.println("Subject name is:" + subjectname);
		 		 Thread.sleep(2000);
		 		Assert.assertTrue(StudentName_Label.getText().trim().equals("Student Name"), "Student Name label is not visible:  Fail");
		         Thread.sleep(2000);
		         Assert.assertTrue(ClassSection_Label.getText().trim().equals("Class-Section"), "Class Section label is not visible:  Fail");
		         Thread.sleep(2000); 
		         Assert.assertTrue(StartDate_Label.getText().trim().equals("Start date"), "Start Date label is not visible:  Fail");
		         Thread.sleep(2000);
		         Assert.assertTrue(EndDate_Label.getText().trim().equals("End date"), "End Date label is not visible:  Fail");
		         Thread.sleep(2000);
		 		 System.out.println("Total students for learning source:"+ TotalStudentsList.size());
		 		 Thread.sleep(2000);
		 		 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentsLearning","Pass");
//		         readWriteExcel(186,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentsLearning","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentsLearning","Pass");
//			         readWriteExcel(186,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentsLearning","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentsLearning","Fail");
//		 		readWriteExcel(186,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentsLearning","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
		  
	
	public void fn_ViewTestsforSpecifiedDaterange() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,3);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDate2_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total tests are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTestsforSpecifiedDaterange","Pass");
//		         readWriteExcel(187,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTestsforSpecifiedDaterange","Pass");
			      }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTestsforSpecifiedDaterange","Pass");
//			         readWriteExcel(187,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTestsforSpecifiedDaterange","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTestsforSpecifiedDaterange","Fail");
//		 		readWriteExcel(187,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTestsforSpecifiedDaterange","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	public void fn_ViewStudentSubmissiondetails() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,3);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total Tests are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(ViewMarks_Icon);
			     Thread.sleep(2000);
		 		 Assert.assertTrue(StudentResource_Text.getText().trim().equals("Mark Student Test"), "Mark student test header is not visible:  Fail");
		         Thread.sleep(2000);
		 		 String testname=TestName_Text.getText();
		 		 System.out.println("Test name is:" + testname);
		 		 Thread.sleep(2000);
		 		 String testtype=TestType_Text.getText();
		 		 System.out.println("Test type is:" + testtype);
		 		 Thread.sleep(2000);
		 		 String maxmarks=MaximumMarks_Text.getText();
		 		 System.out.println("Maximum marks is:" + maxmarks);
		 		 Thread.sleep(2000);
		 		 String sub=Subject_Text.getText();
		 		 System.out.println("Subject is:" + sub);
		 		 Thread.sleep(2000);
		 		 Assert.assertTrue(StudentNameTest_Label.getText().trim().equals("Student Name"), "Student Name label is not visible:  Fail");
		         Thread.sleep(2000);
		         Assert.assertTrue(ClassSectionTest_Label.getText().trim().equals("Class-Section"), "Class Section label is not visible:  Fail");
		         Thread.sleep(2000); 
		         Assert.assertTrue(SubmittedDate_Label.getText().trim().equals("Submitted date"), "Submitted date label is not visible:  Fail");
		         Thread.sleep(2000);
		         Assert.assertTrue(Marks_Label.getText().trim().equals("Marks"), "Marks label is not visible:  Fail");
		         Thread.sleep(2000);
		 		 System.out.println("Total students for test:"+ TotalStudentsList.size());
		 		 Thread.sleep(2000);
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentSubmissiondetails","Pass");
//		        readWriteExcel(188,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentSubmissiondetails","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentSubmissiondetails","Pass");
//			         readWriteExcel(188,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentSubmissiondetails","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewStudentSubmissiondetails","Fail");
//		 		readWriteExcel(188,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentSubmissiondetails","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	public void fn_SaveRemarkFeedbackofTest() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,3);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total Tests are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(ViewMarks_Icon);
			     Thread.sleep(2000);
		 		 Assert.assertTrue(StudentResource_Text.getText().trim().equals("Mark Student Test"), "Mark student test header is not visible:  Fail");
		         Thread.sleep(2000);
		 		 RemarksFeedback_TB.clear();
		         Thread.sleep(2000);
		         fn_Input(RemarksFeedback_TB,"Please submit your test within due date");
		         Thread.sleep(2000);
		         fn_Click(SaveTest_BT);
			     Thread.sleep(2000);
		         Assert.assertTrue(Popup_TX.getText().trim().equals("Remarks added / Test re-assigned successfully"));
					Thread.sleep(2000);
					fn_Click(Ok_BT);
					Thread.sleep(2000);
				 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SaveRemarkFeedbackofTest","Pass");
//		         readWriteExcel(189,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SaveRemarkFeedbackofTest","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SaveRemarkFeedbackofTest","Pass");
//			         readWriteExcel(189,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SaveRemarkFeedbackofTest","Pass");
			       }
		 		   }
		 		else{
		 			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SaveRemarkFeedbackofTest","Fail");
//		 		    readWriteExcel(189,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SaveRemarkFeedbackofTest","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	public void fn_ViewTestReport() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,3);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total tests are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(Reports1_Icon);
			     Thread.sleep(2000);
		 		driver.switchTo().frame(MarkingReport_Frame);
		 		Thread.sleep(2000);
		 		Assert.assertTrue(SummaryReport_LK.getText().trim().equals("Summary Report"), "Summary Report link is not visible:  Fail");
		        Thread.sleep(2000);
		        fn_Click(SummaryReport_LK);
			    Thread.sleep(2000);
			     Assert.assertTrue(QuestionwiseReport_LK.getText().trim().equals("Questionwise Report"), "Questionwise Report link is not visible:  Fail");
			     Thread.sleep(2000);
			     fn_Click(QuestionwiseReport_LK);
				 Thread.sleep(2000);
				 Assert.assertTrue(StudentTestReport_LK.getText().trim().equals("Student Test Report"), "Student Test Report link is not visible:  Fail");
			     Thread.sleep(2000);
			     fn_Click(StudentTestReport_LK);
				 Thread.sleep(2000);
				 Assert.assertTrue(LevelofDifficultReport_LK.getText().trim().equals("Level of Difficult Report"), "Level of Difficult Report link is not visible:  Fail");
			     Thread.sleep(2000);
			     fn_Click(LevelofDifficultReport_LK);
				 Thread.sleep(2000);
				 Assert.assertTrue(LevelofClassificationReport_LK.getText().trim().equals("Level of Classification Report"), "Level of Classification Report link is not visible:  Fail");
			     Thread.sleep(2000);
			     fn_Click(LevelofClassificationReport_LK);
				 Thread.sleep(2000);
				 driver.switchTo().parentFrame();
		 		 fn_Click(Close_Icon);
			     Thread.sleep(2000);
			     readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTestReport","Pass");
//		         readWriteExcel(190,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTestReport","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTestReport","Pass");
//			         readWriteExcel(190,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTestReport","Pass");
			       }
		 		   }
		 		else{
		 			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTestReport","Fail");
//		 		readWriteExcel(190,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTestReport","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	public void fn_EvaluateRespectiveTest() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,3);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDate2_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total tests are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 
	////////code to evaluate a test require, currently evaluate icon not available so not done	 		 
		 		 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_EvaluateRespectiveTest","Pass");
//		 		 readWriteExcel(191,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EvaluateRespectiveTest","Pass");
			      }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_EvaluateRespectiveTest","Pass");
//			         readWriteExcel(191,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EvaluateRespectiveTest","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_EvaluateRespectiveTest","Fail");
//		 		readWriteExcel(191,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EvaluateRespectiveTest","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	
	public void fn_UploadingWorksheet() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,3);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDate2_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total tests are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 
	////////code to upload worksheet require, currently evaluate icon not available so not done	 		 
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_UploadingWorksheet","Pass");
//		 		 readWriteExcel(192,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_UploadingWorksheet","Pass");
			      }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000); 
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_UploadingWorksheet","Pass");
//			         readWriteExcel(192,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_UploadingWorksheet","Pass");
			       }
		 		   }
		 		else{
		 			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_UploadingWorksheet","Fail");
//		 		readWriteExcel(192,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_UploadingWorksheet","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	
	public void fn_ViewAssignmentsWithinSpecifiedDaterange() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,4);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDate2_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total assignments are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentsWithinSpecifiedDaterange","Pass");
//		         readWriteExcel(193,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentsWithinSpecifiedDaterange","Pass");
			      }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentsWithinSpecifiedDaterange","Pass");
//			         readWriteExcel(193,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentsWithinSpecifiedDaterange","Pass");
			       }
		 		   }
		 		else{
		 			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentsWithinSpecifiedDaterange","Fail");
//		 		readWriteExcel(193,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentsWithinSpecifiedDaterange","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	
	public void fn_ViewAssignmentSubmissionDetails() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,4);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total assignments are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(ViewMarks_Icon);
			     Thread.sleep(2000);
		 		 Assert.assertTrue(StudentResource_Text.getText().trim().equals("View Assignment Submissions"), "View Assignment Submissions header is not visible:  Fail");
		         Thread.sleep(2000);
		 		 String assignname=AssignmentName_Text.getText();
		 		 System.out.println("Assignment name is:" + assignname);
		 		 Thread.sleep(2000);
		 		 String assigntype=AssignmentType_Text.getText();
		 		 System.out.println("Assignment type is:" + assigntype);
		 		 Thread.sleep(2000);
		 		 String assignsub=AssignmentSubject_Text.getText();
		 		 System.out.println("Assignment Subject is:" + assignsub);
		 		 Thread.sleep(2000);
		 		 
		 		java.util.Iterator<WebElement> i = TotalAssignmentStudentsList.iterator();
		 		while(i.hasNext()) {
		 		    WebElement row = i.next();
		 		    System.out.println(row.getText());
		 		  }
		 		 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentSubmissionDetails","Pass");
//		 		 readWriteExcel(194,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentSubmissionDetails","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000); 
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentSubmissionDetails","Pass");
//			         readWriteExcel(194,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentSubmissionDetails","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentSubmissionDetails","Fail");
//		 		readWriteExcel(194,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentSubmissionDetails","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	
	public void fn_ViewAssignmentSubmissionsandResponses() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,4);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total assignments are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(ViewMarks_Icon);
			     Thread.sleep(3000);
			     fn_Click(PreviewAssignment_Icon);
			     Thread.sleep(3000);
/////////currently preview icon is not clickable, so adding of code required 
			     
			     readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentSubmissionsandResponses","Pass");
//			     readWriteExcel(195,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentSubmissionsandResponses","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentSubmissionsandResponses","Pass");
//			         readWriteExcel(195,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentSubmissionsandResponses","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAssignmentSubmissionsandResponses","Fail");
//		 		readWriteExcel(195,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssignmentSubmissionsandResponses","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	public void fn_DownloadAssignmentSubmittedResources() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,4);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total assignments are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(ViewMarks_Icon);
			     Thread.sleep(3000);
			     fn_Click(PreviewAssignment_Icon);
			     Thread.sleep(3000);
/////////currently preview icon is not clickable, so adding of code required
			     
			     readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DownloadAssignmentSubmittedResources","Pass");
//			     readWriteExcel(196,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DownloadAssignmentSubmittedResources","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DownloadAssignmentSubmittedResources","Pass");
//			         readWriteExcel(196,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DownloadAssignmentSubmittedResources","Pass");
			       }
		 		   }
		 		else{
		 		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DownloadAssignmentSubmittedResources","Fail");
//		 		readWriteExcel(196,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DownloadAssignmentSubmittedResources","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	
	public void fn_StudentAssignmentMarkingReport() throws InterruptedException, IOException{
		   if(Calendar_Text.isDisplayed()){
	 	     Thread.sleep(2000);
	 	    fn_ScrollDown250();
			Thread.sleep(2000);
	 	     Assert.assertTrue(ManageAssignment_LK.getText().trim().equals("Manage Assignment"), "Manage Assignment text is not visible:  Fail");
	         Thread.sleep(2000);
	         fn_Click(ManageAssignment_LK);
	 		 Thread.sleep(3000);
	 		 fn_SelectbyIndex(ClassSubject_DD,1);
		 	 Thread.sleep(2000);
		 	 fn_SelectbyIndex(Type_DD,4);
		 	 Thread.sleep(2000);
		 	 fn_Click(FromDateManage_LK);
	 	     Thread.sleep(2000);
	 	     fn_Click(BackDate2_Icon);
		     Thread.sleep(2000);
		     fn_Click(SelectDateLearning_LK);
		     Thread.sleep(2000);
		     fn_Click(Go_BT);
		     Thread.sleep(2000);
		     try{ 
		 		 System.out.println("Total assignments are:"+ LessonsList.size());
		 		 Thread.sleep(2000);
		 		 fn_Click(Reports1_Icon);
			     Thread.sleep(2000);
		 		driver.switchTo().frame(MarkingReport_Frame);
		 		Thread.sleep(2000);
		 		Assert.assertTrue(SummaryReport_Text.getText().trim().equals("Student resource marking report"), "Student resource marking report Report text is not visible:  Fail");
		        Thread.sleep(2000);
		 		 String Unread=UnreadNum_Text.getText();
		 		 System.out.println("Number of unread students:" + Unread);
		 		 Thread.sleep(2000);
		 		 String read=ReadNum_Text.getText();
		 		 System.out.println("Number of read students:" + read);
		 		 Thread.sleep(2000);
		 		 String studentnum=StudentsNum_Text.getText();
		 		 System.out.println("Number of students:" + studentnum);
		 		 Thread.sleep(2000);
		 		 
		 		java.util.Iterator<WebElement> i = StudentsList.iterator();
		 		while(i.hasNext()) {
		 		    WebElement row = i.next();
		 		    System.out.println(row.getText());
		 		  }
		 		 driver.switchTo().parentFrame();
		 		 fn_Click(Close_Icon);
			     Thread.sleep(2000);
			     readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_StudentAssignmentMarkingReport","Pass");
//		         readWriteExcel(197,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_StudentAssignmentMarkingReport","Pass");
			    }
		 		catch(ElementNotFoundException e){
			    	 Assert.assertTrue(NoAssignmentFound_Text.getText().trim().equals("No assignments found!"), "Validation is not visible:  Fail");
			         Thread.sleep(2000);
			         readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_StudentAssignmentMarkingReport","Pass");
//			         readWriteExcel(197,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_StudentAssignmentMarkingReport","Pass");
			       }
		 		   }
		 		else{
		 			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_StudentAssignmentMarkingReport","Fail");
//		 		readWriteExcel(197,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_StudentAssignmentMarkingReport","Fail");
		  	    	Thread.sleep(5000);
		           }
			      }
	
	
	
	
	
	
	
	
	
   }
