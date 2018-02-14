package com.oxford.subject.pkg;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.oxford.generic.pkg.Generic_Methods;

public class LearningResource_Methods extends Generic_Methods{

	
	@FindBy(id = "ddlClass")
	public WebElement Class_DD;
	
	@FindBy(xpath = "//a[@id='CPH_dtlstSubjects_ancSubject_0']/div")
    public WebElement Subject1_Lk;
	
	@FindBy(id = "drpSubjects")
	public WebElement ClassSubject_DD;
	
	@FindBy(xpath = "//div[@id='res']/div[2]")
	public WebElement LearningResources_LK;
	
	@FindBy(id = "CPH_txtFilterBy")
	public WebElement Filterby_DD;
	
	@FindBy(linkText = "All")
	public WebElement All_LK;
	
	@FindBy(id = "CPH_totalAssetsCount")
	public WebElement TotalCount_Text;
	
	@FindBy(id = "prev")
	public WebElement Play_Icon;
	
	@FindBy(xpath = "//div[@id='CPH_dropdownMenu']/div/ul/li[5]/a/span")
	public WebElement Personalized_LK;
	
	@FindBy(xpath = "//div[@id='CPH_dropdownMenu']/div/ul/li[5]/ul/li/a/span")
	public WebElement Recommended_LK;
	
	@FindBy(id = "CPH_txtSearch")
	public WebElement Search_TB;
	
	@FindBy(id = "lnkFilterBySearchText")
	public WebElement Search_Icon;
	
	@FindBy(xpath = "//div[@id='CPH_rptAssets_dvLessonDetails_0']/div/div[4]//div[2]")
	public WebElement FilteredResourse_Text;
	
	@FindBy(id = "CPH_lblNoRecords")
	public WebElement NoRecords_Text;
	
	@FindBy(id = "CPH_ucChapterList_rptCurriculum_btnCurriculum_3")
	public WebElement Chapter_LK;
	
	@FindBy(id = "CPH_dvCreateResource")
	public WebElement Create_BT;
	
	@FindBy(id = "dvUplink")
	public WebElement link_LK;
	
	@FindBy(id = "iframeRes")
	public WebElement iframe_AddLink;
	
	@FindBy(id = "txtName")
	public WebElement Name_TB;
	
	@FindBy(id = "drpHours")
	public WebElement Hours_DD;
	
	@FindBy(id = "txtDesc")
	public WebElement Description_TB;
	
	@FindBy(id = "txtPurpose")
	public WebElement Purpose_TB;
	
	@FindBy(id = "txtType")
	public WebElement UploadLink_TB;
	
	@FindBy(id = "ancLinkUpload")
	public WebElement Uploadlink_LK;
	
	@FindBy(id = "btnUploadLinkAgain")
	public WebElement UploadlinkAgain_LK;
	
	@FindBy(id = "UCMessage_divMsg")
	public WebElement Uploadlink_Msg;
	
	@FindBy(xpath = "//div[@id='UCMessage_divMain']/div/div[4]/a")
	public WebElement OK_LK;
	
	@FindBy(xpath = "//button[@Class='close']")
	public WebElement Close_LK;
	
	@FindBy(id = "ancTagMetadataIbook")
	public WebElement MetaTag_LK;
	
	@FindBy(xpath = "//div[@id='TaskLable2']/div[2]")
	public WebElement MetaTagSelect_LK;
	
	@FindBy(id = "2")
	public WebElement MetaTag_option;
	
	@FindBy(id = "btnSave")
	public WebElement Update_LK;
	
	@FindBy(id = "UclMessage_divMsg")
	public WebElement UpdateMetatag_Msg;
	
	@FindBy(xpath = "//div[@id='UclMessage_divMain']/div/div[4]/a")
	public WebElement MetaTagOK_LK;
	
	@FindBy(id = "dvUpresource")
	public WebElement Resource_LK;	
	
	@FindBy(id = "ctlFileUpload")
	public WebElement Browse_LK;
	
	@FindBy(id = "ancUpload")
	public WebElement Uploadresource_LK;
	
	@FindBy(id = "btnUploadAgain")
	public WebElement UploadresourceAgain_LK;
	
	@FindBy(id = "ancTagMetadataNormal")
	public WebElement TagMetadataResource_LK;
	
	@FindBy(xpath = "//div[@id='TaskLable4']/div[2]")
	public WebElement SubjectiveTag_LK;
	
	@FindBy(xpath = "//div[@id='idcurriculum']/table/tbody/tr[2]/td/input")
	public WebElement Chapter_CB;
	
	
	@FindBy(id = "CPH_dvUploadAssessment")
	public WebElement Assignment_LK;
	
	@FindBy(id = "txtAssignmentName")
	public WebElement AssignmentName_TB;
	
	@FindBy(id = "asgnmntChapter")
	public WebElement AssignmentChapter_DD;
	
	@FindBy(id = "ActivityTypeDpdwn")
	public WebElement AssignmentType_DD;
	
	@FindBy(id = "txtAssignmwntDesc")
	public WebElement AssignmentDesc_TB;
	
	@FindBy(xpath = "//select[@ng-model='selectedFromTimeHour']")
	public WebElement FromTime_DD;
	
	@FindBy(xpath = "//select[@class='ng-pristine ng-untouched ng-valid'  and  @ng-model='selectedToTimeHour']")
	public WebElement ToTime_DD;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']/div[5]/span/table/tbody/tr/td")
	public WebElement Group_LK;
	
	@FindBy(id = "btnPreivewAssign")
	public WebElement Assign_BT;
	
	@FindBy(id = "spnmsg1")
	public WebElement Assignment_msg;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div/div[2]/div/div/div")
	public WebElement Dragger_Icon;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(id= "CPH_rptAssets_playChk_0")
	public WebElement Resource1_CB;
	
	@FindBy(id= "CPH_dvDelete")
	public WebElement Delete_BT;
	
	@FindBy(id= "popup_cancel")
	public WebElement No_BT;
	
	@FindBy(id= "CPH_playContent")
	public WebElement PlayContent_BT;
	
	@FindBy(xpath = "//div[@id='ngdialog1']/div[2]/div[2]")
	public WebElement Closewin_Icon;
	
	@FindBy(xpath = "//div[@id='modalDialogue2']/div[2]/div/div[2]")
	public WebElement ConfirmationNo_BT;
	
	@FindBy(xpath = "//button[@ng-if='showSavePlayList']")
	public WebElement SavePlayList_LK;
	
	@FindBy(xpath = "//div[@id='modalDialogue2']/div[3]/div[2]/input")
	public WebElement LessonName_TB;
	
	@FindBy(xpath = "//select[@ng-model='selectedLesson.value']")
	public WebElement SelectChapter_DD;
	
	@FindBy(xpath = "//select[@ng-model='selectedConcept.value']")
	public WebElement SelectConcept_DD;
	
	@FindBy(xpath = "//div[@id='modalDialogue2']/div[3]/div[4]")
	public WebElement SaveConfirmation_BT;
	
    @FindBy(xpath = "//div[@id='pjt-menu-on']/div[2]")
	public WebElement LessonPlans_LK;
	
    @FindBy(id = "All")
	public WebElement AllLesson_LK;
    
	@FindBy(id = "lnkFilterBySearchText")
	public WebElement Search_BT;
	
	@FindBy(id = "CPH_rptAssets_chkContent_0")
	public WebElement Lesson1_CB;
	
	@FindBy(id = "divBookMark")
	public WebElement BookmarkPopup_Icon;
	
	@FindBy(xpath = "//div[@id='CPH_rptAssets_dvLessonDetails_0']/div[2]/div[4]")
	public WebElement Bookmark_Icon;
	
	@FindBy(xpath = "//div[@id='modalDialogue2']/div[2]/div/div")
	public WebElement Yes_BT;
	
	
	
	
	public void fn_VisibilityofLearningResourceText() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofLearningResourceText","Pass"); 
//	    readWriteExcel(114,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofLearningResourceText","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofLearningResourceText","Fail"); 
//	    readWriteExcel(114,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofLearningResourceText","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PreviewLearningResource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of sources:" + totalcount);
	    fn_Click(Play_Icon);
	    Thread.sleep(2000);
	    String parent=driver.getWindowHandle();
 	      Set<String>s1=driver.getWindowHandles();
  	     Iterator<String> I1= s1.iterator();
  	    while(I1.hasNext())
  	    {
  	     String child_window=I1.next();
           if(!parent.equals(child_window))
  	       {
  	       driver.switchTo().window(child_window);
  	        driver.close();
  	        }
  	        }
  	      driver.switchTo().window(parent);
  	      readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewLearningResource","Pass");
//	      readWriteExcel(115,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewLearningResource","Pass");
	       }
	     else{
	      readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewLearningResource","Fail");
//	      readWriteExcel(115,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewLearningResource","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_FilterLearningResources() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
//	    String totalcount=TotalCount_Text.getText();
//	    System.out.println("Total no.of sources:" + totalcount);
//	    Thread.sleep(2000);
	    //fn_mouseClick(Personalized_LK);
	    //Thread.sleep(2000);
	    //fn_Click(Recommended_LK);
	    //Thread.sleep(3000);
	    String totalcountafter=TotalCount_Text.getText();
	    System.out.println("Total Recommended sources:" + totalcountafter);
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_FilterLearningResources","Pass");
//	    readWriteExcel(116,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_FilterLearningResources","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_FilterLearningResources","Fail");
//	    readWriteExcel(116,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_FilterLearningResources","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_SearchLearningResource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Test resource");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Test resource"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchLearningResource","Pass");
//	    readWriteExcel(117,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchLearningResource","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchLearningResource","Fail");
//	    readWriteExcel(117,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchLearningResource","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_SearchInvalidLearningResources() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"123@");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    Assert.assertTrue(NoRecords_Text.getText().trim().equals("No resources found!"), "Validation not coming: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchInvalidLearningResources","Pass");
//	    readWriteExcel(118,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchInvalidLearningResources","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchInvalidLearningResources","Fail");
//	    readWriteExcel(118,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchInvalidLearningResources","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_CreateLink() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(link_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Link");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a testing link name");
	    Thread.sleep(2000);
	    fn_Input(UploadLink_TB,"https://203.129.242.98/");
	    Thread.sleep(2000);
	    fn_Click(Uploadlink_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource link uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Link");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Testing Link"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateLink","Pass");
//	    readWriteExcel(119,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateLink","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateLink","Fail");
//	    readWriteExcel(119,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateLink","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_CreatelinkWithoutSelectingchapter() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(link_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Link2");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a testing link without chapter");
	    Thread.sleep(2000);
	    fn_Input(UploadLink_TB,"https://203.129.242.98/");
	    Thread.sleep(2000);
	    fn_Click(Uploadlink_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource link uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Link2");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Testing Link2"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreatelinkWithoutSelectingchapter","Pass");
//	    readWriteExcel(120,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreatelinkWithoutSelectingchapter","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreatelinkWithoutSelectingchapter","Fail");
//	    readWriteExcel(120,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreatelinkWithoutSelectingchapter","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ValidationforMandatoryFieldsonAddLinkPopupWindow() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(link_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Click(Uploadlink_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Name cannot be blank"), "Validation for name field not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Link3");
	    Thread.sleep(2000);
	    fn_Click(Uploadlink_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Invalid linked resource"), "Validation for upload link field not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    driver.navigate().refresh();
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforMandatoryFieldsonAddLinkPopupWindow","Pass");
//      readWriteExcel(121,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforMandatoryFieldsonAddLinkPopupWindow","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforMandatoryFieldsonAddLinkPopupWindow","Fail");
//	    readWriteExcel(121,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforMandatoryFieldsonAddLinkPopupWindow","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_UploadAnotherresources() throws InterruptedException, IOException{
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
		    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
		    Thread.sleep(2000);
		    fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
		    fn_Click(Filterby_DD);
		    Thread.sleep(2000);
		    fn_Click(All_LK);
		    Thread.sleep(2000);
		    fn_Click(Chapter_LK);
		    Thread.sleep(2000);
		    fn_Click(Create_BT);
		    Thread.sleep(2000);
		    fn_Click(link_LK);
		    Thread.sleep(2000);
		    driver.switchTo().frame(iframe_AddLink);
		    Thread.sleep(2000);
		    fn_Input(Name_TB,"Test Link1");
		    Thread.sleep(2000);
		    fn_SelectbyIndex(Hours_DD,1);
		    Thread.sleep(2000);
		    fn_Input(Description_TB,"This is a test link");
		    Thread.sleep(2000);
		    fn_Input(Purpose_TB,"For testing purpose");
		    Thread.sleep(2000);
		    fn_Input(UploadLink_TB,"https://203.129.242.98/");
		    Thread.sleep(2000);
		    fn_Click(Uploadlink_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource link uploaded successfully"), "Success msg not coming: Fail");
		    Thread.sleep(2000);
		    fn_Click(OK_LK);
		    Thread.sleep(2000);
		    fn_Click(UploadlinkAgain_LK);
		    Thread.sleep(2000);
		    fn_Input(Name_TB,"Test Link2");
		    Thread.sleep(2000);
		    fn_SelectbyIndex(Hours_DD,1);
		    Thread.sleep(2000);
		    fn_Input(Description_TB,"This is a test link2");
		    Thread.sleep(2000);
		    fn_Input(Purpose_TB,"For testing purpose");
		    Thread.sleep(2000);
		    fn_Input(UploadLink_TB,"https://203.129.242.98/");
		    Thread.sleep(2000);
		    fn_Click(Uploadlink_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource link uploaded successfully"), "Success msg not coming: Fail");
		    Thread.sleep(2000);
		    fn_Click(OK_LK);
		    Thread.sleep(2000);
//		    try{
//		    fn_Click(Close_LK);
//		    Thread.sleep(3000);
//		    }
//		    catch(ElementNotFoundException e){
		    	driver.navigate().refresh();
		    	Thread.sleep(3000);
		    	fn_Click(LearningResources_LK);
			    Thread.sleep(2000);
		//    }
		    fn_Click(Filterby_DD);
		    Thread.sleep(2000);
		    fn_Click(All_LK);
		    Thread.sleep(2000);
		    fn_Click(Chapter_LK);
		    Thread.sleep(2000);
		    fn_Input(Search_TB,"Test Link2");
		    Thread.sleep(2000);
		    fn_Click(Search_Icon);
		    Thread.sleep(3000);
		    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Test Link2"), "Search not done: Fail");
		    Thread.sleep(2000);
		    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_UploadAnotherresources","Pass");
//	        readWriteExcel(122,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_UploadAnotherresources","Pass");
	       }
	     else{
	    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_UploadAnotherresources","Fail");
//	        readWriteExcel(122,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_UploadAnotherresources","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_TagmetadataToUploadedSubject() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(link_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Test Link5");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a test link5");
	    Thread.sleep(2000);
	    fn_Input(Purpose_TB,"For testing purpose");
	    Thread.sleep(2000);
	    fn_Input(UploadLink_TB,"https://203.129.242.98/");
	    Thread.sleep(2000);
	    fn_Click(Uploadlink_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource link uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    fn_Click(MetaTag_LK);
	    Thread.sleep(3000);
//	    fn_ScrollDown500();
//	    fn_Click(MetaTagSelect_LK);
//	    Thread.sleep(2000);
//	    fn_Click(MetaTag_option);
//	    Thread.sleep(2000);
//	    fn_Click(Update_LK);
//	    Thread.sleep(2000);
//	    Assert.assertTrue(UpdateMetatag_Msg.getText().trim().equals("Metadata updated successfully"), "Metadata updated msg not coming: Fail");
//	    Thread.sleep(2000);
//	    fn_Click(MetaTagOK_LK);
//	    Thread.sleep(2000);
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Test Link5");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Test Link5"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_TagmetadataToUploadedSubject","Pass");
//    readWriteExcel(123,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TagmetadataToUploadedSubject","Pass");
       }
     else{
    	 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_TagmetadataToUploadedSubject","Fail");
//    readWriteExcel(123,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TagmetadataToUploadedSubject","Fail");
	    Thread.sleep(5000);
       }
      }
	
	
	public void fn_CreateResource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(Resource_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Resource");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a testing resource name");
	    Thread.sleep(2000);
	    fn_Input(Browse_LK,"C://Users//incaendo//Desktop//images.jpg");
	    Thread.sleep(2000);
	    fn_Click(Uploadresource_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Resource");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Testing Resource"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateResource","Pass");
//	    readWriteExcel(124,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateResource","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateResource","Fail");
//	    readWriteExcel(124,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateResource","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_CreateResourceWithoutSelectingchapter() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(Resource_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Resource2");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a testing resource name2");
	    Thread.sleep(2000);
	    fn_Input(Browse_LK,"C://Users//incaendo//Desktop//images.jpg");
	    Thread.sleep(2000);
	    fn_Click(Uploadresource_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Resource2");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Testing Resource2"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateResourceWithoutSelectingchapter","Pass");
//	    readWriteExcel(125,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateResourceWithoutSelectingchapter","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateResourceWithoutSelectingchapter","Fail");
//	    readWriteExcel(125,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateResourceWithoutSelectingchapter","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ValidationforMandatoryFieldsonAddResourcePopupWindow() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(Resource_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Click(Uploadresource_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Name cannot be blank"), "Validation for name field not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Resource3");
	    Thread.sleep(2000);
	    fn_Click(Uploadresource_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Select a file to upload"), "Validation for file field not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforMandatoryFieldsonAddResourcePopupWindow","Pass");
//	    readWriteExcel(126,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforMandatoryFieldsonAddResourcePopupWindow","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforMandatoryFieldsonAddResourcePopupWindow","Fail");
//	    readWriteExcel(126,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforMandatoryFieldsonAddResourcePopupWindow","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_UploadAnotherLearningResource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(Resource_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Resource3");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a testing resource name3");
	    Thread.sleep(2000);
	    fn_Input(Browse_LK,"C://Users//incaendo//Desktop//images.jpg");
	    Thread.sleep(2000);
	    fn_Click(Uploadresource_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    
	    fn_Click(UploadresourceAgain_LK);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Testing Resource4");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a testing resource name4");
	    Thread.sleep(2000);
	    fn_Input(Browse_LK,"C://Users//incaendo//Desktop//images.jpg");
	    Thread.sleep(2000);
	    fn_Click(Uploadresource_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
        fn_Input(Search_TB,"Testing Resource4");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Testing Resource4"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_UploadAnotherLearningResource","Pass");
 //   readWriteExcel(127,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_UploadAnotherLearningResource","Pass");
       }
     else{
    	 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_UploadAnotherLearningResource","Fail");
 //   readWriteExcel(127,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_UploadAnotherLearningResource","Fail");
	    Thread.sleep(5000);
       }
      }
	
	
	public void fn_TagmetadataToLearningResource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(Resource_LK);
	    Thread.sleep(2000);
	    driver.switchTo().frame(iframe_AddLink);
	    Thread.sleep(2000);
	    fn_Input(Name_TB,"Test Resource3");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hours_DD,1);
	    Thread.sleep(2000);
	    fn_Input(Description_TB,"This is a test Resource3");
	    Thread.sleep(2000);
	    fn_Input(Purpose_TB,"For testing purpose");
	    Thread.sleep(2000);
	    fn_Input(Browse_LK,"C://Users//incaendo//Desktop//images.jpg");
	    Thread.sleep(2000);
	    fn_Click(Uploadresource_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(Uploadlink_Msg.getText().trim().equals("Resource uploaded successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
	    fn_Click(OK_LK);
	    Thread.sleep(2000);
	    fn_Click(TagMetadataResource_LK);
	    Thread.sleep(3000);
//	    fn_ScrollDown500();
//	    Thread.sleep(3000);
//	    fn_Click(SubjectiveTag_LK);
//	    Thread.sleep(2000);
//	    fn_Click(Chapter_CB);
//	    Thread.sleep(2000);
//	    fn_Click(Update_LK);
//	    Thread.sleep(2000);
//	    Assert.assertTrue(UpdateMetatag_Msg.getText().trim().equals("Metadata updated successfully"), "Metadata updated msg not coming: Fail");
//	    Thread.sleep(2000);
//	    fn_Click(MetaTagOK_LK);
//	    Thread.sleep(2000);
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Test Resource3");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Test Resource3"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_TagmetadataToLearningResource","Pass");
 //   readWriteExcel(128,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TagmetadataToLearningResource","Pass");
       }
     else{
    	 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_TagmetadataToLearningResource","Fail");
 //   readWriteExcel(128,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TagmetadataToLearningResource","Fail");
	    Thread.sleep(5000);
       }
      }
	
	
	public void fn_CreateAssignment() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(Assignment_LK);
	    Thread.sleep(2000);
        fn_Input(AssignmentName_TB,"Testing Assignment");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(AssignmentChapter_DD,2);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(AssignmentType_DD,5);
	    Thread.sleep(2000);
	    fn_Input(AssignmentDesc_TB,"This is a testing link name");
	    Thread.sleep(2000);
	   
//	    JavascriptExecutor scroll = (JavascriptExecutor)driver;
//	    scroll.executeScript("arguments[0].scrollIntoView(true);", FromTime_DD);
//	    Thread.sleep(2000);
	    
	    fn_SelectbyIndex(FromTime_DD,22);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ToTime_DD,23);
	    Thread.sleep(2000);
	    fn_Click(Group_LK);
	    Thread.sleep(2000);
	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Assignment_msg.getText().trim().equals("Assignment assigned successfully"), "Success msg not coming: Fail");
	    Thread.sleep(2000);
//	    fn_Click(OK_LK);
//	    Thread.sleep(2000);
	    
//	    try{
//	    fn_Click(Close_LK);
//	    Thread.sleep(3000);
//	    }
//	    catch(ElementNotFoundException e){
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	fn_Click(LearningResources_LK);
		    Thread.sleep(2000);
	//    }
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Assignment");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equalsIgnoreCase("Testing Assignment"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateLink","Pass");
//	    readWriteExcel(129,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateLink","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateLink","Fail");
//	    readWriteExcel(129,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateLink","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ValidationsForMandatoryFieldsonAssignPopupwindow() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Chapter_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(2000);
	    fn_Click(Assignment_LK);
	    Thread.sleep(2000);

	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Assignment name cannot be blank"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
	    fn_Input(AssignmentName_TB,"Testing Assignment2");
	    Thread.sleep(2000);
//	    fn_SelectbyIndex(AssignmentChapter_DD,2);
//	    Thread.sleep(2000);
	    fn_SelectbyIndex(AssignmentType_DD,5);
	    Thread.sleep(2000);
	    fn_Input(AssignmentDesc_TB,"This is a testing link name");
	    Thread.sleep(2000);
	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Please select Chapter / Concept"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_SelectbyIndex(AssignmentChapter_DD,2);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(AssignmentType_DD,0);
	    Thread.sleep(2000);
	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Please select type"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_SelectbyIndex(AssignmentType_DD,3);
	    Thread.sleep(2000);
	    AssignmentDesc_TB.clear();
	    Thread.sleep(2000);
	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Description cannot be blank"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		driver.navigate().refresh();
	    Thread.sleep(3000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationsForMandatoryFieldsonAssignPopupwindow","Pass");
//	    readWriteExcel(130,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationsForMandatoryFieldsonAssignPopupwindow","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationsForMandatoryFieldsonAssignPopupwindow","Fail");
//	    readWriteExcel(130,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationsForMandatoryFieldsonAssignPopupwindow","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_DeleteLearningResources() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    String totalcountbefore=TotalCount_Text.getText();
	    System.out.println("Total no.of resources before delete:" + totalcountbefore);
	    int resultbefore = Integer.parseInt(totalcountbefore);
	    Thread.sleep(2000);
	    fn_Click(Resource1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Learning contents are shared with multiple teachers, Do you want to still delete ?"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Resource deleted successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
		fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
		String totalcountafter=TotalCount_Text.getText();
	    System.out.println("Total no.of resources after delete:" + totalcountafter);
	    Thread.sleep(2000);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore>resultafter,"Delete logic fails");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteLearningResources","Pass");
//		readWriteExcel(131,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteLearningResources","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteLearningResources","Fail");
//	    readWriteExcel(131,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteLearningResources","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_DeleteResourcesByClickingOnNoInConfirmation() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    String totalcountbefore=TotalCount_Text.getText();
	    System.out.println("Total no.of resources before not deleting :" + totalcountbefore);
	    int resultbefore = Integer.parseInt(totalcountbefore);
	    Thread.sleep(2000);
	    fn_Click(Resource1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Learning contents are shared with multiple teachers, Do you want to still delete ?"));
		Thread.sleep(2000);
		fn_Click(No_BT);
		Thread.sleep(2000);
	    String totalcountafter=TotalCount_Text.getText();
	    System.out.println("Total no.of resources after not deleting:" + totalcountafter);
	    Thread.sleep(2000);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore==resultafter,"Delete logic fails");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteResourcesByClickingOnNoInConfirmation","Pass");
//		readWriteExcel(132,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteResourcesByClickingOnNoInConfirmation","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteResourcesByClickingOnNoInConfirmation","Fail");
//	    readWriteExcel(132,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteResourcesByClickingOnNoInConfirmation","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PlayContent() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Resource1_CB);
	    Thread.sleep(2000);
	    fn_Click(PlayContent_BT);
	    Thread.sleep(3000);
	    fn_Click(Closewin_Icon);
	    Thread.sleep(3000);
	    fn_Click(ConfirmationNo_BT);
	    Thread.sleep(3000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PlayContent","Pass");
//		readWriteExcel(133,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PlayContent","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PlayContent","Fail");
//	    readWriteExcel(133,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PlayContent","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_SavePlayedresource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(3000);
	    fn_Click(Resource1_CB);
	    Thread.sleep(2000);
	    fn_Click(PlayContent_BT);
	    Thread.sleep(3000);
	    fn_Click(SavePlayList_LK);
	    Thread.sleep(3000);
	    fn_Input(LessonName_TB,"Testing Lesson for All Class");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(SelectChapter_DD,2);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(SelectConcept_DD,2);
	    Thread.sleep(2000);
	    fn_Click(SaveConfirmation_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Lesson created successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
	    Thread.sleep(3000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(3000);
	    fn_Click(AllLesson_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Lesson for All Class");
	    Thread.sleep(2000);
	    fn_Click(Search_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equals("Testing Lesson for All Class"), "Search not done: Fail");
	    Thread.sleep(2000);
	    fn_Click(Lesson1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SavePlayedresource","Pass");
//		readWriteExcel(134,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SavePlayedresource","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SavePlayedresource","Fail");
//	    readWriteExcel(134,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SavePlayedresource","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_BookmarkLearningresource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(3000);
	    fn_Click(Resource1_CB);
	    Thread.sleep(2000);
	    fn_Click(PlayContent_BT);
	    Thread.sleep(3000);
	    String title=BookmarkPopup_Icon.getAttribute("title");
	   if(title.equals("Bookmark")){
	    	fn_Click(BookmarkPopup_Icon);
		    Thread.sleep(3000);
		    Assert.assertTrue(Popup_TX.getText().trim().equals("Bookmark saved successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
		    Thread.sleep(3000);
	    	String titleafter=BookmarkPopup_Icon.getAttribute("title");
		    Assert.assertTrue(titleafter.trim().equals("Bookmarked"));
			Thread.sleep(2000);
		    fn_Click(Closewin_Icon);
		    Thread.sleep(3000);
		    fn_Click(ConfirmationNo_BT);
		    Thread.sleep(3000);
		    String title2=Bookmark_Icon.getAttribute("title");
		    Assert.assertTrue(title2.trim().equals("Bookmarked"));
			Thread.sleep(2000);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_BookmarkLearningresource","Pass");
//			readWriteExcel(135,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_BookmarkLearningresource","Pass");
		  }
		else if(title.equals("Bookmarked")){
	    	fn_Click(BookmarkPopup_Icon);
		    Thread.sleep(3000);
		    Assert.assertTrue(Popup_TX.getText().trim().equals("Bookmark removed successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
		    Thread.sleep(3000);
		    fn_Click(BookmarkPopup_Icon);
		    Thread.sleep(3000);
		    Assert.assertTrue(Popup_TX.getText().trim().equals("Bookmark saved successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
		    Thread.sleep(3000);
	    	String titleafter=BookmarkPopup_Icon.getAttribute("title");
		    Assert.assertTrue(titleafter.trim().equals("Bookmarked"));
			Thread.sleep(2000);
		    fn_Click(Closewin_Icon);
		    Thread.sleep(3000);
		    fn_Click(ConfirmationNo_BT);
		    Thread.sleep(3000);
		    String title2=Bookmark_Icon.getAttribute("title");
		    Assert.assertTrue(title2.trim().equals("Bookmarked"));
			Thread.sleep(2000);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_BookmarkLearningresource","Pass");
//			readWriteExcel(135,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_BookmarkLearningresource","Pass");
	     }
	     else{
	    	 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_BookmarkLearningresource","Fail");
//	       readWriteExcel(135,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_BookmarkLearningresource","Fail");
  	       Thread.sleep(5000);
           }
	      }
	     }
	
	
	public void fn_RemoveLearningresource() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(3000);
	    fn_Click(Resource1_CB);
	    Thread.sleep(2000);
	    fn_Click(PlayContent_BT);
	    Thread.sleep(3000);
	    String title=BookmarkPopup_Icon.getAttribute("title");
	   if(title.equals("Bookmarked")){
	    	fn_Click(BookmarkPopup_Icon);
		    Thread.sleep(3000);
		    Assert.assertTrue(Popup_TX.getText().trim().equals("Bookmark removed successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
		    Thread.sleep(3000);
	    	String titleafter=BookmarkPopup_Icon.getAttribute("title");
		    Assert.assertTrue(titleafter.trim().equals("Bookmark"));
			Thread.sleep(2000);
		    fn_Click(Closewin_Icon);
		    Thread.sleep(3000);
		    fn_Click(ConfirmationNo_BT);
		    Thread.sleep(3000);
		    String title2=Bookmark_Icon.getAttribute("title");
		    Assert.assertTrue(title2.trim().equals("Bookmark"));
			Thread.sleep(2000);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RemoveLearningresource","Pass");
//			readWriteExcel(136,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveLearningresource","Pass");
		  }
		else if(title.equals("Bookmark")){
	    	fn_Click(BookmarkPopup_Icon);
		    Thread.sleep(3000);
		    Assert.assertTrue(Popup_TX.getText().trim().equals("Bookmark saved successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
		    Thread.sleep(3000);
		    fn_Click(BookmarkPopup_Icon);
		    Thread.sleep(3000);
		    Assert.assertTrue(Popup_TX.getText().trim().equals("Bookmark removed successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
		    Thread.sleep(3000);
	    	String titleafter=BookmarkPopup_Icon.getAttribute("title");
		    Assert.assertTrue(titleafter.trim().equals("Bookmark"));
			Thread.sleep(2000);
		    fn_Click(Closewin_Icon);
		    Thread.sleep(3000);
		    fn_Click(ConfirmationNo_BT);
		    Thread.sleep(3000);
		    String title2=Bookmark_Icon.getAttribute("title");
		    Assert.assertTrue(title2.trim().equals("Bookmark"));
			Thread.sleep(2000);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RemoveLearningresource","Pass");
//			readWriteExcel(136,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveLearningresource","Pass");
	     }
	     else{
	    	 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RemoveLearningresource","Fail");
//	       readWriteExcel(136,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveLearningresource","Fail");
  	       Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_AddLessontoLessonplayer() throws InterruptedException, IOException{
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
	    Assert.assertTrue(LearningResources_LK.getText().trim().equals("Learning Resources"), "Learning Resources text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(LearningResources_LK);
	    Thread.sleep(2000);
	    fn_Click(Filterby_DD);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(3000);
	    fn_Click(Resource1_CB);
	    Thread.sleep(2000);
	    fn_Click(PlayContent_BT);
	    Thread.sleep(3000);
	    fn_Click(Closewin_Icon);
	    Thread.sleep(2000);
	    fn_Click(Yes_BT);
	    Thread.sleep(2000);
	    fn_Input(LessonName_TB,"Testing Lesson2");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(SelectChapter_DD,2);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(SelectConcept_DD,2);
	    Thread.sleep(2000);
	    fn_Click(SaveConfirmation_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Lesson created successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
	    Thread.sleep(3000);
	    fn_Click(LessonPlans_LK);
	    Thread.sleep(3000);
	    fn_Click(AllLesson_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Lesson2");
	    Thread.sleep(2000);
	    fn_Click(Search_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equals("Testing Lesson2"), "Search not done: Fail");
	    Thread.sleep(2000);
	    fn_Click(Lesson1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddLessontoLessonplayer","Pass");
//		readWriteExcel(137,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddLessontoLessonplayer","Pass");
	       }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddLessontoLessonplayer","Fail");
//	    readWriteExcel(137,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddLessontoLessonplayer","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
