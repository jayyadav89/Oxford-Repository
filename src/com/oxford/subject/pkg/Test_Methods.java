package com.oxford.subject.pkg;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import com.oxford.generic.pkg.Generic_Methods;

public class Test_Methods extends Generic_Methods{

	@FindBy(id = "ddlClass")
	public WebElement Class_DD;
	
	@FindBy(xpath = "//a[@id='CPH_dtlstSubjects_ancSubject_0']/div")
    public WebElement Subject1_Lk;
	
	@FindBy(id = "drpSubjects")
	public WebElement ClassSubject_DD;
	
	@FindBy(xpath = "//div[@id='test']/div[2]")
	public WebElement Test_LK;
	
	@FindBy(id = "CPH_txtSearch")
	public WebElement Search_TB;
	
	@FindBy(id = "lnkFilterBySearchText")
	public WebElement Search_Icon;
	
	@FindBy(xpath = "//div[@id='CPH_rptAssets_dvLessonDetails_0']/div/div[4]//div[2]")
	public WebElement FilteredResourse_Text;
	
	@FindBy(id = "All")
	public WebElement All_LK;
	
	@FindBy(id = "CPH_totalAssetsCount")
	public WebElement TotalCount_Text;
	
    @FindBys({@FindBy(xpath = "//div[@class='bdr-rit-non digitalreptext col-xs-12 col-sm-12 col-md-12 pdrt0']")})
	private List<WebElement> TestsList;
	
	@FindBy(id = "Recommended")
	public WebElement Recommended_LK;
	
	@FindBy(id = "My")
	public WebElement My_LK;
	
	@FindBy(id = "CPH_lblNoRecords")
	public WebElement NoRecords_Text;
	
	@FindBy(xpath = "//div[@id='CPH_rptAssets_dvLessonDetails_0']/div[2]/div[5]")
	public WebElement Play_Icon;
	
	@FindBy(id = "Start")
	public WebElement Start_LK;
	
	@FindBy(id = "CPH_rptAssets_dvPrint_0")
	public WebElement Print_Icon;
	
	@FindBy(id = "CPH_rptAssets_dvNewPrint_0")
	public WebElement AnswerBooklet_Icon;
	
	@FindBy(id = "CPH_dvTestCreate")
	public WebElement Create_BT;
	
//	@FindBy(xpath = "//select[@id='CPH_ddlClass']")
	@FindBy(id = "CPH_ddlClass")
	public WebElement ClassTest_DD;
	
//	@FindBy(xpath = "//select[@id='dvSelectChapter']")
	@FindBy(id = "dvSelectChapter")
	public WebElement ChapterTest_DD;
	
	@FindBy(id = "CPH_txtAssname")
	public WebElement TestName_TB;
	
	@FindBy(xpath = "//iframe[@id='frmTopic']")
	public WebElement Iframe;
	
	@FindBy(id = "btnAddBlocks")
	public WebElement AddSection_BT;
	
	@FindBy(id = "txtBlkName")
	public WebElement SectionName_TB;
	
	@FindBy(id = "txtQuestions")
	public WebElement NoofQues_TB;
	
	@FindBy(id = "btnSave")
	public WebElement SaveSection_BT;
	
	@FindBy(id = "RptTopicList_lblBlockName_0")
	public WebElement AddedSection_Text;
	
	@FindBy(id = "RptTopicList_lblBlockName_1")
	public WebElement AddedSection1_Text;
	
	@FindBy(id = "RptTopicList_lblBlockName_2")
	public WebElement AddedSection2_Text;
	
	@FindBy(id = "RptTopicList_lblBlockName_3")
	public WebElement AddedSection3_Text;
	
	@FindBy(xpath = "//table[@id='tblData']/tbody/tr/td[2]/div/div/a")
	public WebElement AddQues1_BT;
	
	@FindBy(xpath = "//table[3]/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/a")
	public WebElement AddQues2_BT;
	
	@FindBy(xpath = "//iframe[@id='modalDialogueContent1']")
	public WebElement IframeContent;
	
	@FindBy(id = "ucChapterList_rptCurriculum_btnCurriculum_1")
	public WebElement QuesChapter_LK;
	
	@FindBy(id = "ucChapterList_rptCurriculum_btnCurriculum_3")
	public WebElement QuesChapter3_LK;
	
	@FindBy(id = "rptrQB_chkSelect_0")
	public WebElement Question1_CB;
	
	@FindBy(id = "rptrQB_chkSelect_1")
	public WebElement Question2_CB;
	
	@FindBy(id = "btnOk")
	public WebElement AddtoSection_BT;
	
	@FindBy(id = "CPH_lnkTestNext")
	public WebElement Next1_BT;
	
	@FindBy(id = "CPH_A2")
	public WebElement Next2_BT;
	
	@FindBy(id = "CPH_cboGradeScheme")
	public WebElement GradeScheme_DD;
	
	@FindBy(id = "CPH_A5")
	public WebElement Next3_BT;
	
	@FindBy(id = "CPH_ChkQuestionHints")
	public WebElement ShowHint_CB;
	
	@FindBy(id = "CPH_chkSkip")
	public WebElement Skip_CB;
	
	@FindBy(id = "CPH_cmdTabPreferenceFinish")
	public WebElement Save_BT;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;

	@FindBy(id= "RptTopicList_btnEditBlock_0")
	public WebElement EditSection_LK;
	
	@FindBy(id= "RptTopicList_btnEditBlock_1")
	public WebElement EditSection1_LK;
	
	@FindBy(xpath = "(//input[@id='chkBlock'])[2]")
	public WebElement Section2_CB;
	
	@FindBy(xpath = "(//input[@id='chkBlock'])[3]")
	public WebElement Section3_CB;
	
	@FindBy(id= "RptTopicList_btndeleteBlock")
	public WebElement DeleteSection_BT;
	
	@FindBy(id= "btnAdvSearch")
	public WebElement AdvancedSearch_BT;
	
	@FindBy(id= "btnApplyFilter")
	public WebElement ApplyFilter_BT;
	
	@FindBy(xpath = "(//input[@id='rdClassfication'])[2]")
	public WebElement Classification_Option;
	
	@FindBy(xpath = "(//input[@id='rdmarks'])[2]")
	public WebElement Marks_Option;
	
	@FindBy(id= "divActMsg")
	public WebElement NoQuesFound_Text;
	
	@FindBy(xpath = "//div[@id='modalDialogue1']/a/img")
	public WebElement Closepopup_Icon;
	
	@FindBy(xpath = "//div[@id='div_QB']/table/tbody/tr/td[3]/a")
	public WebElement TryOut_LK;
	
	@FindBy(id= "proceed")
	public WebElement SubmitWin_BT;
	
	@FindBy(id= "CPH_rptAssets_chkContent_0")
	public WebElement Test1_CB;
	
	@FindBy(id= "CPH_dvDelete")
	public WebElement Delete_BT;
	
	@FindBy(id= "popup_cancel")
	public WebElement No_BT;
	
	@FindBy(id= "CPH_dvAssign")
	public WebElement Assign_LK;
	
	@FindBy(id= "rdnSelectUsers")
	public WebElement Individuals_RBT;
	
	@FindBy(id= "CPH_ddlsection")
	public WebElement Section_DD;
	
	@FindBy(id= "btnPreivewAssign")
	public WebElement Assign_BT;
	
	@FindBy(id= "rdnSelectGroups")
	public WebElement SelectGrp_RBT;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']/div[5]/span/table/tbody/tr/td")
	public WebElement SelectGroup_LK;

	@FindBy(id= "spnmsg1")
	public WebElement TestAssign_MSG;
	
	@FindBy(xpath = "//div[@id='mdlPopup']/div/button")
	public WebElement Closemsg_icon;
	
	@FindBy(xpath = "//select[@ng-model='selectedFromTimeHour']")
	public WebElement FromHour_DD;
	
	@FindBy(xpath = "//select[@ng-model='selectedToTimeHour']")
	public WebElement ToHour_DD;
	
	@FindBy(id= "dvAssignlater")
	public WebElement AssignLater_BT;
	
	@FindBy(id= "spnMsg")
	public WebElement TimeMsg_Text;
	
	@FindBy(id= "dvbackarrow")
	public WebElement Back_Arrow;
	
	@FindBy(id= "chkBlockHeader")
	public WebElement Section_CB;
	
	
	
	public void fn_ViewAllTests() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of tests:" + totalcount);
	    System.out.println("Total lesson on page:"+ TestsList.size());
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllTests","Pass"); 
//	    readWriteExcel(148,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllTests","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllTests","Fail"); 
//	    readWriteExcel(148,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllTests","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewAllRecommendedTests() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Recommended_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of Recommended tests:" + totalcount);
	    System.out.println("Total Recommended tests on 1st page:"+ TestsList.size());
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllRecommendedTests","Pass");
//	    readWriteExcel(149,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllRecommendedTests","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllRecommendedTests","Fail");
//	    readWriteExcel(149,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllRecommendedTests","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewAllMyTests() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of my tests:" + totalcount);
	    System.out.println("Total my tests on 1st page:"+ TestsList.size());
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllMyTests","Pass");
//	    readWriteExcel(150,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllMyTests","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllMyTests","Fail");
//	    readWriteExcel(150,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllMyTests","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_SearchTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"tesing1");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equals("tesing1"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchTest","Pass");
//	    readWriteExcel(151,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchTest","Fail");
//	    readWriteExcel(151,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_SearchInvalidTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"abc@12");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    Assert.assertTrue(NoRecords_Text.getText().trim().equals("No Tests found!"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchInvalidTest","Pass");
//	    readWriteExcel(152,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchInvalidTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchInvalidTest","Fail");
//	    readWriteExcel(152,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchInvalidTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PreviewTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
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
	       Thread.sleep(2000);
	       Assert.assertTrue(Start_LK.isDisplayed(), "Start button on window not present: Fail");
	       driver.close();
	        }
	        }
	      driver.switchTo().window(parent);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewTest","Pass");
//	    readWriteExcel(153,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewTest","Fail");
//	    readWriteExcel(153,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PrintTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Print_Icon);
	    Thread.sleep(2000);
	    WindowHandling();
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PrintTest","Pass");
//	    readWriteExcel(154,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PrintTest","Fail");
//	    readWriteExcel(154,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PrintAnswerBooklet() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(AnswerBooklet_Icon);
	    Thread.sleep(2000);
	    WindowHandling();
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PrintAnswerBooklet","Pass");
//	    readWriteExcel(155,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintAnswerBooklet","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PrintAnswerBooklet","Fail");
//	    readWriteExcel(155,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintAnswerBooklet","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_CreateTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassTest_DD,0);
 	    Thread.sleep(2000);
        fn_Input(TestName_TB,"Testing Test1");
	    Thread.sleep(2000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Testing Section1");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Testing Section1"), "Added Section text not present: Fail");
	    Thread.sleep(3000);
	    fn_Click(AddQues1_BT);
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    driver.switchTo().frame(IframeContent);
	    Thread.sleep(2000);
        fn_Click(QuesChapter_LK);
	    Thread.sleep(2000);
	    fn_Click(Question1_CB);
	    Thread.sleep(2000);
	    fn_Click(AddtoSection_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
	    Thread.sleep(3000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(AddQues2_BT);
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    driver.switchTo().frame(IframeContent);
	    Thread.sleep(2000);
	    fn_Click(QuesChapter3_LK);
	    Thread.sleep(2000);
	    fn_Click(Question1_CB);
	    Thread.sleep(2000);
	    fn_Click(Question2_CB);
	    Thread.sleep(2000);
	    fn_Click(AddtoSection_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    fn_Click(Next1_BT);
	    Thread.sleep(3000);
	    fn_Click(Next2_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(GradeScheme_DD,0);
 	    Thread.sleep(2000);
 	    fn_Click(Next3_BT);
	    Thread.sleep(3000);
	    fn_Click(ShowHint_CB);
	    Thread.sleep(2000);
	    fn_Click(Skip_CB);
	    Thread.sleep(2000);
	    fn_Click(Save_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Test created successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
		fn_Click(My_LK);
	    Thread.sleep(2000);
	    fn_Input(Search_TB,"Testing Test1");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equals("Testing Test1"), "Search not done: Fail");
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateTest","Pass");
//	    readWriteExcel(156,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CreateTest","Fail");
//	    readWriteExcel(156,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ValidationforMandatoryfieldinCreateTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_Click(Next1_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Test name cannot be blank"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforMandatoryfieldinCreateTest","Pass");
//		readWriteExcel(157,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforMandatoryfieldinCreateTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforMandatoryfieldinCreateTest","Fail");
//	    readWriteExcel(157,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforMandatoryfieldinCreateTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_AddMoreSections() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassTest_DD,0);
 	    Thread.sleep(2000);
// 	    fn_SelectbyIndex(ChapterTest_DD,0);
//	    Thread.sleep(2000);
	    fn_Input(TestName_TB,"Testing Test2");
	    Thread.sleep(2000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Section1");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Section1"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Section2");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection2_Text.getText().trim().equals("Section2"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Section3");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection3_Text.getText().trim().equals("Section3"), "Added Section text not present: Fail");
	    Thread.sleep(3000);
	    fn_Click(Section_CB);
	    Thread.sleep(2000);
	    fn_Click(DeleteSection_BT);
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUp250();
	    Thread.sleep(2000);
	    fn_Click(Back_Arrow);
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddMoreSections","Pass");
//	    readWriteExcel(158,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddMoreSections","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AddMoreSections","Fail");
//	    readWriteExcel(158,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AddMoreSections","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_EditSection() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassTest_DD,0);
 	    Thread.sleep(2000);
 	    fn_Input(TestName_TB,"Testing Test3");
	    Thread.sleep(2000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(EditSection_LK);
	    Thread.sleep(2000);
	    SectionName_TB.clear();
	    fn_Input(SectionName_TB,"Sec1");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection_Text.getText().trim().equals("Sec1"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Section2");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Section2"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(EditSection1_LK);
	    Thread.sleep(2000);
	    SectionName_TB.clear();
	    fn_Input(SectionName_TB,"Sec2");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Sec2"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Section_CB);
	    Thread.sleep(2000);
	    fn_Click(DeleteSection_BT);
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUp250();
	    Thread.sleep(2000);
	    fn_Click(Back_Arrow);
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_EditSection","Pass");
//	    readWriteExcel(159,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditSection","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_EditSection","Fail");
//	    readWriteExcel(159,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditSection","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_DeleteSection() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassTest_DD,0);
 	    Thread.sleep(2000);
 	    fn_Input(TestName_TB,"Testing Test3");
	    Thread.sleep(2000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Section1");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Section1"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Section2");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection2_Text.getText().trim().equals("Section2"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Section2_CB);
	    Thread.sleep(2000);
	    fn_Click(Section3_CB);
	    Thread.sleep(2000);
	    fn_Click(DeleteSection_BT);
	    Thread.sleep(3000);
//	    Assert.assertFalse(DeleteSection_BT.isDisplayed(), "Delete button not removed: Fail");
//	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    fn_Click(Back_Arrow);
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteSection","Pass");
//	    readWriteExcel(160,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteSection","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteSection","Fail");
//	    readWriteExcel(160,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteSection","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_SearchSpecificQuestionWithAdvancedofQuestionBank() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassTest_DD,0);
 	    Thread.sleep(2000);
 	    fn_Input(TestName_TB,"Testing Test1");
	    Thread.sleep(2000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Testing Section1");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Testing Section1"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(AddQues1_BT);
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    driver.switchTo().frame(IframeContent);
	    Thread.sleep(2000);
	    fn_Click(QuesChapter_LK);
	    Thread.sleep(3000);
	    fn_Click(AdvancedSearch_BT);
	    Thread.sleep(3000);
	    fn_Click(Classification_Option);
	    Thread.sleep(2000);
	    fn_Click(Marks_Option);
	    Thread.sleep(2000);
	    fn_Click(ApplyFilter_BT);
	    Thread.sleep(3000);
	    if(Question1_CB.isDisplayed()){
	    	driver.switchTo().parentFrame();
		    Thread.sleep(2000);
	    	fn_Click(Closepopup_Icon);
		    Thread.sleep(2000);
		    driver.switchTo().parentFrame();
		    Thread.sleep(2000);
		    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchSpecificQuestionWithAdvancedofQuestionBank","Pass");
//	    	readWriteExcel(161,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchSpecificQuestionWithAdvancedofQuestionBank","Pass");
	    }
	    else if(NoQuesFound_Text.isDisplayed()){
	    	Assert.assertTrue(NoQuesFound_Text.getText().trim().equals("No questions found!"), "Validation not coming: Fail");
	    	driver.switchTo().parentFrame();
		    Thread.sleep(2000);
	    	fn_Click(Closepopup_Icon);
		    Thread.sleep(2000);
		    driver.switchTo().parentFrame();
		    Thread.sleep(2000);
		    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchSpecificQuestionWithAdvancedofQuestionBank","Pass");
//	    	readWriteExcel(161,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchSpecificQuestionWithAdvancedofQuestionBank","Pass");
	    }
	    else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchSpecificQuestionWithAdvancedofQuestionBank","Fail");
//	    readWriteExcel(161,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchSpecificQuestionWithAdvancedofQuestionBank","Fail");
  	    Thread.sleep(5000);
           }
	      }
	      }
	
	
	public void fn_SearchSpecificQuestionFromLeftofQuestionBank() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassTest_DD,0);
 	    Thread.sleep(2000);
 	    fn_Input(TestName_TB,"Testing Test1");
	    Thread.sleep(2000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Testing Section1");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Testing Section1"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(AddQues1_BT);
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    driver.switchTo().frame(IframeContent);
	    Thread.sleep(2000);
	    fn_Click(QuesChapter3_LK);
	    Thread.sleep(3000);
	    if(Question1_CB.isDisplayed()){
	    	driver.switchTo().parentFrame();
		    Thread.sleep(2000);
	    	fn_Click(Closepopup_Icon);
		    Thread.sleep(2000);
		    driver.switchTo().parentFrame();
		    Thread.sleep(2000);
		    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchSpecificQuestionFromLeftofQuestionBank","Pass");
//	    	readWriteExcel(162,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchSpecificQuestionFromLeftofQuestionBank","Pass");
	    }
	    else if(NoQuesFound_Text.isDisplayed()){
	    	Assert.assertTrue(NoQuesFound_Text.getText().trim().equals("No questions found!"), "Validation not coming: Fail");
	    	driver.switchTo().parentFrame();
		    Thread.sleep(2000);
	    	fn_Click(Closepopup_Icon);
		    Thread.sleep(2000);
		    driver.switchTo().parentFrame();
		    Thread.sleep(2000);
		    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchSpecificQuestionFromLeftofQuestionBank","Pass");
//	    	readWriteExcel(162,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchSpecificQuestionFromLeftofQuestionBank","Pass");
	    }
	    else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchSpecificQuestionFromLeftofQuestionBank","Fail");
//	    readWriteExcel(162,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchSpecificQuestionFromLeftofQuestionBank","Fail");
  	    Thread.sleep(5000);
           }
	      }
	      }
	
	
	
	public void fn_TryoutAQuestionBank() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Create_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassTest_DD,0);
 	    Thread.sleep(2000);
 	    fn_Input(TestName_TB,"Testing Test1");
	    Thread.sleep(2000);
	    driver.switchTo().frame(Iframe);
	    Thread.sleep(2000);
	    fn_Click(AddSection_BT);
	    Thread.sleep(2000);
	    fn_Input(SectionName_TB,"Testing Section1");
	    Thread.sleep(2000);
	    fn_Input(NoofQues_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(SaveSection_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(AddedSection1_Text.getText().trim().equals("Testing Section1"), "Added Section text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(AddQues1_BT);
	    Thread.sleep(3000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    driver.switchTo().frame(IframeContent);
	    Thread.sleep(2000);
	    fn_Click(QuesChapter3_LK);
	    Thread.sleep(3000);
	    fn_Click(TryOut_LK);
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
	       Thread.sleep(2000);
	       Assert.assertTrue(SubmitWin_BT.isDisplayed(), "Submit button on window not present: Fail");
	       driver.close();
	        }
	        }
	    driver.switchTo().window(parent);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    fn_Click(Closepopup_Icon);
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_TryoutAQuestionBank","Pass");
//		readWriteExcel(163,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TryoutAQuestionBank","Pass");
		}
	    else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_TryoutAQuestionBank","Fail");
//	    readWriteExcel(163,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TryoutAQuestionBank","Fail");
  	    Thread.sleep(5000);
           }
	      }
	      
	
	public void fn_RemoveSubmittedTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of my tests before:" + totalcount);
	    int resultbefore = Integer.parseInt(totalcount);
	    fn_Input(Search_TB,"test 1");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
		Search_TB.clear();
		Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    String totalcountafter=TotalCount_Text.getText();
	    System.out.println("Total no.of my tests after:" + totalcountafter);
	    Thread.sleep(2000);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore==resultafter,"Delete logic fails");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RemoveSubmittedTest","Pass");
//	    readWriteExcel(164,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveSubmittedTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RemoveSubmittedTest","Fail");
//	    readWriteExcel(164,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveSubmittedTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_DeleteTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of my tests before delete:" + totalcount);
	    int resultbefore = Integer.parseInt(totalcount);
	    fn_Input(Search_TB,"Testing Test1");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Learning contents are shared with multiple teachers, Do you want to still delete ?"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
//	    Assert.assertTrue(Popup_TX.getText().trim().equals("Tests deleted successfully"));
//		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
	    Search_TB.clear();
		Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    String totalcountafter=TotalCount_Text.getText();
	    System.out.println("Total no.of my tests after delete:" + totalcountafter);
	    Thread.sleep(2000);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore>resultafter,"Delete logic fails");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteTest","Pass");
//	    readWriteExcel(165,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteTest","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteTest","Fail");
//	    readWriteExcel(165,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_DeleteTestbyNobutton() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of my tests before delete:" + totalcount);
	    int resultbefore = Integer.parseInt(totalcount);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(No_BT);
		Thread.sleep(2000);
	    String totalcountafter=TotalCount_Text.getText();
	    System.out.println("Total no.of my tests after not deleted:" + totalcountafter);
	    Thread.sleep(2000);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore==resultafter,"Delete logic fails");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteTestbyNobutton","Pass");
//	    readWriteExcel(166,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteTestbyNobutton","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteTestbyNobutton","Fail");
//	    readWriteExcel(166,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteTestbyNobutton","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_DeleteRecommendedTests() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(Recommended_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of Recommended tests before delete:" + totalcount);
	    int resultbefore = Integer.parseInt(totalcount);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
	    String totalcountafter=TotalCount_Text.getText();
	    System.out.println("Total no.of Recommended tests after not deleted:" + totalcountafter);
	    Thread.sleep(2000);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore==resultafter,"Delete logic fails");
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteRecommendedTests","Pass");
//	    readWriteExcel(167,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteRecommendedTests","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_DeleteRecommendedTests","Fail");
//	    readWriteExcel(167,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteRecommendedTests","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_AssignTesttoIndividuals() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
//	    fn_Input(Search_TB,"Testing Test1");
//	    Thread.sleep(2000);
//	    fn_Click(Search_Icon);
//	    Thread.sleep(2000);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Assign_LK);
	    Thread.sleep(3000);
	    fn_Click(Individuals_RBT);
		Thread.sleep(2000);
		fn_SelectbyIndex(Section_DD,0);
 	    Thread.sleep(3000);
 	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	    if(Popup_TX.isDisplayed()){
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Select students"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTesttoIndividuals","No students present: Fail");
//	    readWriteExcel(168,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTesttoIndividuals","No students present: Fail");
	    }
	    else if(TestAssign_MSG.isDisplayed()) {
	    	Assert.assertTrue(TestAssign_MSG.getText().trim().equals("Test assigned successfully."));
	    	Thread.sleep(2000);
			fn_Click(Closemsg_icon);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTesttoIndividuals","Pass");
//			readWriteExcel(168,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTesttoIndividuals","Pass");
	    }
	    else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTesttoIndividuals","Fail");
//	    readWriteExcel(168,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTesttoIndividuals","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_AssignTesttoGroup() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
//	    fn_Input(Search_TB,"Testing Test1");
//	    Thread.sleep(2000);
//	    fn_Click(Search_Icon);
//	    Thread.sleep(2000);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Assign_LK);
	    Thread.sleep(3000);
	    fn_Click(SelectGroup_LK);
	    Thread.sleep(2000);
	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
//	    if(Popup_TX.isDisplayed()){
//	    Assert.assertTrue(Popup_TX.getText().trim().equals("Select students"));
//		Thread.sleep(2000);
//		fn_Click(Ok_BT);
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//	    readWriteExcel(169,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTesttoGroup","No students present: Fail");
//	    }
	    if(TestAssign_MSG.isDisplayed()) {
	    	Assert.assertTrue(TestAssign_MSG.getText().trim().equals("Test assigned successfully."));
	    	Thread.sleep(2000);
			fn_Click(Closemsg_icon);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTesttoGroup","Pass");
//			readWriteExcel(169,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTesttoGroup","Pass");
	    }
	    else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTesttoGroup","Fail");
//	    readWriteExcel(169,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTesttoGroup","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	public void fn_AssignTestLaterToindividuals() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
//	    fn_Input(Search_TB,"Testing Test1");
//	    Thread.sleep(2000);
//	    fn_Click(Search_Icon);
//	    Thread.sleep(2000);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Assign_LK);
	    Thread.sleep(3000);
	    fn_Click(AssignLater_BT);
	    Thread.sleep(2000);
	    fn_Click(Individuals_RBT);
		Thread.sleep(2000);
		fn_SelectbyIndex(Section_DD,0);
 	    Thread.sleep(3000);
 	    fn_SelectbyIndex(FromHour_DD,20);
	    Thread.sleep(3000);
 	    fn_SelectbyIndex(ToHour_DD,22);
	    Thread.sleep(3000);
 	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	   if(Popup_TX.isDisplayed()){
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Select students"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTestLaterToindividuals","No students present: Fail");
//	    readWriteExcel(170,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTestLaterToindividuals","No students present: Fail");
	    }
	    
	    else if(TestAssign_MSG.isDisplayed()) {
	    	Assert.assertTrue(TestAssign_MSG.getText().trim().equals("Test assigned successfully."));
	    	Thread.sleep(2000);
			fn_Click(Closemsg_icon);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTestLaterToindividuals","Pass");
//			readWriteExcel(170,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTestLaterToindividuals","Pass");
	    }
	    else{
	    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTestLaterToindividuals","Fail");
//	    readWriteExcel(170,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTestLaterToindividuals","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_AssignTestLaterToGroup() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
//	    fn_Input(Search_TB,"Testing Test1");
//	    Thread.sleep(2000);
//	    fn_Click(Search_Icon);
//	    Thread.sleep(2000);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Assign_LK);
	    Thread.sleep(3000);
	    fn_Click(AssignLater_BT);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(FromHour_DD,20);
	    Thread.sleep(3000);
 	    fn_SelectbyIndex(ToHour_DD,22);
	    Thread.sleep(3000);
	    fn_Click(SelectGroup_LK);
	    Thread.sleep(2000);
	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
//	    if(Popup_TX.isDisplayed()){
//	    Assert.assertTrue(Popup_TX.getText().trim().equals("Select students"));
//		Thread.sleep(2000);
//		fn_Click(Ok_BT);
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//	    readWriteExcel(171,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTestLaterToGroup","No students present: Fail");
//	    }
	    if(TestAssign_MSG.isDisplayed()) {
	    	Assert.assertTrue(TestAssign_MSG.getText().trim().equals("Test assigned successfully."));
	    	Thread.sleep(2000);
			fn_Click(Closemsg_icon);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTestLaterToGroup","Pass");
//			readWriteExcel(171,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTestLaterToGroup","Pass");
	    }
	    else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssignTestLaterToGroup","Fail");
//	    readWriteExcel(171,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssignTestLaterToGroup","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_ValidationforTimeToAssignTest() throws InterruptedException, IOException{
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
	    Assert.assertTrue(Test_LK.getText().trim().equals("Test"), "Test text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
//	    fn_Input(Search_TB,"Testing Test1");
//	    Thread.sleep(2000);
//	    fn_Click(Search_Icon);
//	    Thread.sleep(2000);
	    fn_Click(Test1_CB);
	    Thread.sleep(2000);
	    fn_Click(Assign_LK);
	    Thread.sleep(3000);
	    fn_Click(AssignLater_BT);
	    Thread.sleep(3000);
	    fn_Click(SelectGroup_LK);
	    Thread.sleep(2000);
	    fn_Click(Assign_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(TimeMsg_Text.getText().trim().equals("Start time cannot be less than current time"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforTimeToAssignTest","Pass");
//		 readWriteExcel(172,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforTimeToAssignTest","Pass");
		}
		else{
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationforTimeToAssignTest","Fail");
//	    readWriteExcel(172,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationforTimeToAssignTest","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     
       }
