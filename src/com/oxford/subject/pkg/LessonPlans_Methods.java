package com.oxford.subject.pkg;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.oxford.generic.pkg.Generic_Methods;

public class LessonPlans_Methods extends Generic_Methods{
	
	
	
	@FindBy(id = "ddlClass")
	public WebElement Class_DD;
	
	@FindBy(xpath = "//a[@id='CPH_dtlstSubjects_ancSubject_0']/div")
    public WebElement Subject1_Lk;
	
	@FindBy(xpath = "//div[@id='dvCalendar']/h1")
	public WebElement Calendar_Text;
    
	@FindBy(xpath = "//div[starts-with(@id,’bbit’)]")
	public WebElement Event_Text;
	
	@FindBy(id = "drpSubjects")
	public WebElement ClassSubject_DD;
	
	@FindBy(xpath = "//div[@id='dvChapter']/div ")
	public WebElement Chapters_Text;
	
	@FindBy(id = "CPH_ucChapterList_rptCurriculum_btnCurriculum_0")
	public WebElement AllChapters_LK;	
	
	@FindBy(xpath = "//div[@id='pjt-menu-on']/div[2]")
	public WebElement LessonPlans_LK;
	
	@FindBy(xpath = "//div[@id='res']/div[2]")
	public WebElement LearningResources_LK;
	
	@FindBy(xpath = "//div[@id='ques']/div[2]")
	public WebElement QuestionBank_LK;
	
	@FindBy(xpath = "//div[@id='test']/div[2]")
	public WebElement Test_LK;
	
	@FindBy(id = "All")
	public WebElement All_LK;
	
	@FindBy(id = "CPH_totalAssetsCount")
	public WebElement TotalCount_Text;
	
//@FindBys({@FindBy(xpath = "//div[@extn='lessonplan']")})
	@FindBys({@FindBy(xpath = "//div[@id='dvcheckbox']")})
	private List<WebElement> lessonsList;
	
	@FindBy(id = "CPH_rptAssets_dvscheDetails_0")
	public WebElement Usage1_Icon;
	
	@FindBy(id = "CPH_txtSearch")
	public WebElement Search_TB;
	
	@FindBy(id = "lnkFilterBySearchText")
	public WebElement Search_BT;
	
	@FindBy(id = "prev")
	public WebElement Play_BT;
	
	@FindBy(id = "divLaunch")
	public WebElement Launch_BT;
	
	@FindBy(id = "dvBack")
	public WebElement LessonPlan_Icon;
	
	@FindBy(id = "dvWrapper")
	public WebElement ViewAssets_Icon;
	
	@FindBy(xpath = "//ul[@id='list']//div/span")
	public WebElement ResourceList;

	@FindBy(id = "tdTeachingResource")
	public WebElement TeachingResource_Icon;
	
	@FindBy(id = "ucViewTeachingResource_lblheader")
	public WebElement TeachingResource_Text;
	
	@FindBy(id = "lnkClose")
	public WebElement Close_LK;
	
	@FindBy(id = "dvBookMark")
	public WebElement Bookmark_Icon;
	
	@FindBy(id = "CPH_rptAssets_advplan_0")
	public WebElement Plan_Icon;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']//table//tr/td/span")
	public WebElement Class_Lbl;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']//table//tr/td/span[2]")
	public WebElement Class_Text;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']//table//tr[2]/td/span")
	public WebElement Subject_Lbl;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']//table//tr[2]/td/span[2]")
	public WebElement Subject_Text;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']//table//tr[2]/td[2]/span")
	public WebElement Duration_Lbl;
	
	@FindBy(xpath = "//div[@class='lessonplandiv']/div")
	public WebElement TeachingandLearningPlan_Lbl;
	
	@FindBy(id = "Recommended")
	public WebElement Recommended_LK;
	
	@FindBy(id = "My")
	public WebElement MyLessons_LK;
	
	@FindBy(id = "CPH_rptAssets_chkContent_0")
	public WebElement Lesson1_CB;
	
	@FindBy(id = "CPH_lnkPlan")
	public WebElement Plan_LK;
	
	@FindBy(id = "CPH_rptLessons_dvDraggable_0")
	public WebElement Lesson_Drag;
	
	@FindBy(id = "targetDrop")
	public WebElement Target_Drop;
	
	@FindBy(id = "CPH_btnNext")
	public WebElement Next_Icon;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(id = "CPH_rptAssets_chkContent_1")
	public WebElement Lesson2_CB;
	
	@FindBy(id= "CPH_dvDelete")
	public WebElement Delete_BT;
	
	@FindBy(id= "CPH_dvCreateLesson")
	public WebElement CreateLesson_BT;
	
	@FindBy(id= "ctl00_CPH_AdvancedLesson_ucChapterList_rptCurriculum_ctl01_rptchapterChild_ctl00_btnCurriculum")
	public WebElement Concept_LK;
	
	@FindBy(id= "ctl00_CPH_AdvancedLesson_txtLsnName")
	public WebElement LessonName_TB;
	
	@FindBy(id= "ctl00_CPH_AdvancedLesson_txtLsnDuration")
	public WebElement Duration_TB;
	
	@FindBy(id= "ctl00_CPH_AdvancedLesson_lnkNext")
	public WebElement Next_BT;
	
	@FindBy(id= "selectClassSetting")
	public WebElement SelectClassSetting_DD;
	
	@FindBy(id= "ctl00_CPH_AdvancedLesson_txtStageDuration")
	public WebElement StageDuration_TB;
	
	@FindBy(id= "ctl00_CPH_AdvancedLesson_FNext")
	public WebElement Next2_BT;
	
	@FindBy(linkText= "Save")
	public WebElement Save_BT;
	
	@FindBy(id= "AssignAll")
	public WebElement AssignAll_LK;
	
	
	@FindBy(xpath = "//div[@id='dvTimeSetter']/div/div[3]/span/select")
	public WebElement From_Time;
	
	@FindBy(xpath = "//div[@id='dvTimeSetter']/div[2]/div[3]/span/select")
	public WebElement To_Time;
	
	@FindBy(xpath = "//div[@id='mCSB_5']/div/div/span/table/tbody/tr/td")
	public WebElement Group_Tab;
	
	@FindBy(id= "ctl00_CPH_txtToDate")
	public WebElement ToDate_LK;
	
	@FindBy(xpath = "//div[@class='datepicker-days']/table//tr[2]/td[4]")
	public WebElement ToDate_picker;
	
	
	
	
	
	public void fn_ViewSubjectsandCalendarofClass() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    Assert.assertTrue(Calendar_Text.getText().trim().equals("Calendar"), "Calendar not present: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewSubjectsandCalendarofClass","Pass"); 
// 	    readWriteExcel(96,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSubjectsandCalendarofClass","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewSubjectsandCalendarofClass","Fail"); 	 
//	    readWriteExcel(96,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSubjectsandCalendarofClass","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(Chapters_Text.getText().trim().equals("Chapters"), "Chapters not present: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(AllChapters_LK.getText().trim().equals("All Chapters"), "All Chapters link not present: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans link not present: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources link not present: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank link not present: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test link not present: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest","Pass");
//	    readWriteExcel(97,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest","Fail");
//	    readWriteExcel(97,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_VisibilityofText() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofText","Pass");
//	    readWriteExcel(98,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofText","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofText","Fail");
//	    readWriteExcel(98,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofText","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ViewAllLessons() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of lessons:" + totalcount);
	   
	   System.out.println("Total lesson on page:"+ lessonsList.size());
	   readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLessons","Pass");
//		readWriteExcel(99,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLessons","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllLessons","Fail");
//	    readWriteExcel(99,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllLessons","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ViewUsageListofLesson() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    
	    try{
    	if(Usage1_Icon.isEnabled()){
    		fn_Click(Usage1_Icon);
    	    Thread.sleep(2000);
    	    //do code if enabled
    	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewUsageListofLesson","Pass");
//    	    readWriteExcel(100,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUsageListofLesson","Pass");
    	   }
          }
    	catch(ElementNotFoundException e){
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewUsageListofLesson","Usage icon is disabled: Pass");
//    	readWriteExcel(100,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUsageListofLesson","Usage icon is disabled: Pass");	
    	}
		}	
	    
	//    readWriteExcel(100,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUsageListofLesson","Pass");
	    
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewUsageListofLesson","Fail");
//	    readWriteExcel(100,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUsageListofLesson","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ViewTheChapterPlanDetails() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    
	    try{
    	if(Usage1_Icon.isEnabled()){
    		fn_Click(Usage1_Icon);
    	    Thread.sleep(2000);
    	    //do code if enabled
    	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTheChapterPlanDetails","Pass");
//    	    readWriteExcel(101,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTheChapterPlanDetails","Pass");
    	   }
          }
    	catch(ElementNotFoundException e){
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTheChapterPlanDetails","Usage icon is disabled: Pass");
//    	readWriteExcel(101,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTheChapterPlanDetails","Usage icon is disabled: Pass");	
    	}
		}	
	    
	//    readWriteExcel(100,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUsageListofLesson","Pass");
	    
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewTheChapterPlanDetails","Fail");
//	    readWriteExcel(101,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTheChapterPlanDetails","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_PrintChapterPlanDetails() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    
	    try{
    	if(Usage1_Icon.isEnabled()){
    		fn_Click(Usage1_Icon);
    	    Thread.sleep(2000);
    	    //do code if enabled
    	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PrintChapterPlanDetails","Pass");
 //   	    readWriteExcel(102,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintChapterPlanDetails","Pass");
    	   }
          }
    	catch(ElementNotFoundException e){
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PrintChapterPlanDetails","Usage icon is disabled: Pass");
 //   	readWriteExcel(102,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintChapterPlanDetails","Usage icon is disabled: Pass");	
    	}
		}	
	    
	//    readWriteExcel(100,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUsageListofLesson","Pass");
	    
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PrintChapterPlanDetails","Fail");
//	    readWriteExcel(102,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintChapterPlanDetails","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PreviewLesson() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing lesson");
	    Thread.sleep(2000);
	    fn_Click(Search_BT);
	    Thread.sleep(2000);
	    fn_Click(Play_BT);
	    Thread.sleep(3000);
	    
	    String parent=driver.getWindowHandle();
   	      Set<String>s1=driver.getWindowHandles();
    	     Iterator<String> I1= s1.iterator();
    	    while(I1.hasNext())
    	    {
    	     String child_window=I1.next();
        // Here we will compare if parent window is not equal to child window then we will close
    	 if(!parent.equals(child_window))
    	{
    	driver.switchTo().window(child_window);
    	fn_Click(Launch_BT);
	    Thread.sleep(3000);
	    fn_Click(LessonPlan_Icon);
	    Thread.sleep(3000);
    	driver.close();
    	}
    	}
    	driver.switchTo().window(parent);
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewLesson","Pass");
//	    readWriteExcel(103,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewLesson","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewLesson","Fail");
//	    readWriteExcel(103,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewLesson","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ViewAllAssetsAssociatedwithLearningresource() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing lesson");
	    Thread.sleep(2000);
	    fn_Click(Search_BT);
	    Thread.sleep(2000);
	    fn_Click(Play_BT);
	    Thread.sleep(3000);
	    
	    String parent=driver.getWindowHandle();
   	      Set<String>s1=driver.getWindowHandles();
    	     Iterator<String> I1= s1.iterator();
    	    while(I1.hasNext())
    	     {
    	     String child_window=I1.next();
        // Here we will compare if parent window is not equal to child window then we will close
    	 if(!parent.equals(child_window))
    	  {
    	driver.switchTo().window(child_window);
    	fn_Click(Launch_BT);
	    Thread.sleep(3000);
	    fn_Click(ViewAssets_Icon);
	    Thread.sleep(3000);
	    
	    if(ResourceList.isDisplayed()){
	     System.out.println("Total associated resource available");
	    }
	    driver.close();
    	 }
    	 }
    	driver.switchTo().window(parent);
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllAssetsAssociatedwithLearningresource","Pass");
//	    readWriteExcel(104,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllAssetsAssociatedwithLearningresource","Pass");
	     }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllAssetsAssociatedwithLearningresource","Fail");
//	    readWriteExcel(104,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllAssetsAssociatedwithLearningresource","Fail");
  	    Thread.sleep(5000);
           }
	       }
	
	
	
	public void fn_ViewallTeachingresources() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing lesson");
	    Thread.sleep(2000);
	    fn_Click(Search_BT);
	    Thread.sleep(2000);
	    fn_Click(Play_BT);
	    Thread.sleep(3000);
	    String parent=driver.getWindowHandle();
   	      Set<String>s1=driver.getWindowHandles();
    	     Iterator<String> I1= s1.iterator();
    	    while(I1.hasNext())
    	     {
    	     String child_window=I1.next();
        // Here we will compare if parent window is not equal to child window then we will close
    	 if(!parent.equals(child_window))
    	  {
    	driver.switchTo().window(child_window);
    	fn_Click(Launch_BT);
	    Thread.sleep(3000);
	    fn_Click(TeachingResource_Icon);
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    
//	    Thread.sleep(2000);
//	    Assert.assertTrue(TeachingResource_Text.getText().trim().equals("Teaching resources"), "Teaching resources text not present: Fail");
//	    Thread.sleep(2000);
//	    fn_ScrollDown500();
//	    Thread.sleep(2000);
//	    fn_Click(Close_LK);
//	    Thread.sleep(2000);
	    driver.close();
    	 }
    	 }
    	driver.switchTo().window(parent);
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewallTeachingresources","Pass");
//	    readWriteExcel(105,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewallTeachingresources","Pass");
	     }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewallTeachingresources","Fail");
//	    readWriteExcel(105,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewallTeachingresources","Fail");
  	    Thread.sleep(5000);
           }
	       }
	
	
	
	public void fn_BookmarktheResource() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing lesson");
	    Thread.sleep(2000);
	    fn_Click(Search_BT);
	    Thread.sleep(2000);
	    fn_Click(Play_BT);
	    Thread.sleep(3000);
	    
	    String parent=driver.getWindowHandle();
   	      Set<String>s1=driver.getWindowHandles();
    	     Iterator<String> I1= s1.iterator();
    	    while(I1.hasNext())
    	    {
    	     String child_window=I1.next();
        // Here we will compare if parent window is not equal to child window then we will close
    	 if(!parent.equals(child_window))
    	{
    	driver.switchTo().window(child_window);
    	fn_Click(Launch_BT);
	    Thread.sleep(3000);
	    fn_mouseOver(Bookmark_Icon);
	    String titlebefore=Bookmark_Icon.getAttribute("title");
	    System.out.println("Title before click :" +titlebefore);
	    fn_Click(Bookmark_Icon);
	    String titleafter=Bookmark_Icon.getAttribute("title");
	    System.out.println("Title after click :" +titleafter);
	    Thread.sleep(3000);
    	driver.close();
    	}
    	}
    	driver.switchTo().window(parent);
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_BookmarktheResource","Pass");
//	    readWriteExcel(106,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_BookmarktheResource","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_BookmarktheResource","Fail");
//	    readWriteExcel(106,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_BookmarktheResource","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ViewLessonPlan() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(3000);
	    fn_Click(All_LK);
	    Thread.sleep(3000);
	    fn_mouseClick(Plan_Icon);
	    Thread.sleep(3000);
	   String parent=driver.getWindowHandle();
   	      Set<String>s1=driver.getWindowHandles();
    	     Iterator<String> I1= s1.iterator();
    	    while(I1.hasNext())
    	    {
    	     String child_window=I1.next();
        if(!parent.equals(child_window))
    	{
    	driver.switchTo().window(child_window);
    	Assert.assertTrue(Class_Lbl.getText().trim().equals("Class:"), "Class label not present in window: Fail");
	    Thread.sleep(2000);
    	String classlbl=Class_Text.getText();
	    System.out.println("Class is :" +classlbl);
	    Assert.assertTrue(Subject_Lbl.getText().trim().equals("Subject:"), "Subject label not present in window: Fail");
	    Thread.sleep(2000);
	    String sub=Subject_Text.getText();
	    System.out.println("Subject is :" +sub);
	    Thread.sleep(2000);
	    Assert.assertTrue(Duration_Lbl.getText().trim().equals("Duration:"), "Duration label not present in window: Fail");
	    Thread.sleep(2000);
	    driver.close();
    	}
    	}
    	driver.switchTo().window(parent);
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewLessonPlan","Pass");
//	    readWriteExcel(107,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonPlan","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewLessonPlan","Fail");
//	    readWriteExcel(107,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonPlan","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewRecommendedLesson() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(Recommended_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total Recommended lessons is:" + totalcount);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewRecommendedLesson","Pass");
//	    readWriteExcel(108,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewRecommendedLesson","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewRecommendedLesson","Fail");
//	    readWriteExcel(108,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewRecommendedLesson","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewMyLessons() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(MyLessons_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total My lessons is:" + totalcount);
	    
	    System.out.println("Total my lessons on page:"+ lessonsList.size());
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewMyLessons","Pass");
//	    readWriteExcel(109,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewMyLessons","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewMyLessons","Fail");
//	    readWriteExcel(109,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewMyLessons","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PlanLessons() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    
	    fn_Click(Lesson1_CB);
	    Thread.sleep(2000);
	    fn_Click(Plan_LK);
	    Thread.sleep(3000);
	    fn_Click(Next_Icon);
	    Thread.sleep(2000);
	    fn_DragandDrop(Lesson_Drag,Target_Drop);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Lesson scheduled successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PlanLessons","Pass");
//	    readWriteExcel(110,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PlanLessons","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PlanLessons","Fail");
//	    readWriteExcel(110,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PlanLessons","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_AddLessonPlan() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(MyLessons_LK);
	    Thread.sleep(2000);
	    String totalcountbefore=TotalCount_Text.getText();
	    System.out.println("Total My lessons before adding is:" + totalcountbefore);
	    int resultbefore = Integer.parseInt(totalcountbefore);
	    fn_Click(CreateLesson_BT);
	    Thread.sleep(2000);
	    fn_Click(Concept_LK);
	    Thread.sleep(2000);
	    fn_Input(LessonName_TB,"Testing lesson 0.0");
	    Thread.sleep(2000);
	    fn_Input(Duration_TB,"30");
	    Thread.sleep(2000);
        fn_ScrollDown500();
        Thread.sleep(2000);
	    fn_Click(Next_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(SelectClassSetting_DD,0);
	    Thread.sleep(2000);
	    fn_Input(StageDuration_TB,"30");
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
	    fn_Click(Next2_BT);
	    Thread.sleep(3000);
	    fn_ScrollDown1000();
        Thread.sleep(2000);
	    fn_Click(Save_BT);
		Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Lesson created successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
		fn_Click(MyLessons_LK);
	    Thread.sleep(2000);
	    String totalcountafter=TotalCount_Text.getText();
		System.out.println("Total My lessons after adding is:" + totalcountafter);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore<resultafter,"Lesson not added");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddLessonPlan","Pass");
//	    readWriteExcel(111,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddLessonPlan","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddLessonPlan","Fail");
//	    readWriteExcel(111,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddLessonPlan","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_DeleteMyLessons() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(MyLessons_LK);
	    Thread.sleep(2000);
	    String totalcountbefore=TotalCount_Text.getText();
	    System.out.println("Total My lessons before delete is:" + totalcountbefore);
	    int resultbefore = Integer.parseInt(totalcountbefore);
	    
	    fn_Click(Lesson1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
		Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Lesson deleted successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(MyLessons_LK);
	    Thread.sleep(2000);
	    String totalcountafter=TotalCount_Text.getText();
		System.out.println("Total My lessons after delete is:" + totalcountafter);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore>resultafter,"Delete logic fails");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteMyLessons","Pass");
//	    readWriteExcel(112,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteMyLessons","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteMyLessons","Fail");
//	    readWriteExcel(112,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteMyLessons","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_AssignLessonToStudents() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Class_DD.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(Class_DD,0);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(Subject1_Lk.isDisplayed(), "Subjects are not present: Fail");
 	    Thread.sleep(2000);
 	    fn_Click(Subject1_Lk);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(3000); 
	    Assert.assertTrue(LessonPlans_LK.getText().trim().equals("Lesson Plans"), "Lesson Plans text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing lesson");
	    Thread.sleep(2000);
	    fn_Click(Search_BT);
	    Thread.sleep(2000);
	    fn_Click(Play_BT);
	    Thread.sleep(3000);
	    String parent=driver.getWindowHandle();
   	      Set<String>s1=driver.getWindowHandles();
    	     Iterator<String> I1= s1.iterator();
    	    while(I1.hasNext())
    	    {
    	     String child_window=I1.next();
        // Here we will compare if parent window is not equal to child window then we will close
    	 if(!parent.equals(child_window))
    	{
    	driver.switchTo().window(child_window);
    	Assert.assertTrue(AssignAll_LK.isDisplayed(), "Assign All link not present: Fail");
 	    Thread.sleep(2000);
    	driver.close();
    	}
    	}
    	driver.switchTo().window(parent);
    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignLessonToStudents","Pass");
//	    readWriteExcel(113,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignLessonToStudents","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignLessonToStudents","Fail");
//	    readWriteExcel(113,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignLessonToStudents","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	
	
	
	
	
	
	
	
	

}
