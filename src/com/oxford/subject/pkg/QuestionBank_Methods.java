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

public class QuestionBank_Methods extends Generic_Methods{

	
	@FindBy(id = "ddlClass")
	public WebElement Class_DD;
	
	@FindBy(xpath = "//a[@id='CPH_dtlstSubjects_ancSubject_0']/div")
    public WebElement Subject1_Lk;
	
	@FindBy(id = "drpSubjects")
	public WebElement ClassSubject_DD;
	
	@FindBy(xpath = "//div[@id='ques']/div[2]")
	public WebElement QuestionBank_LK;
	
	@FindBy(id = "CPH_txtFilterBy")
	public WebElement Filterby_DD;
	
	@FindBy(id = "All")
	public WebElement All_LK;
	
	@FindBy(id = "CPH_totalAssetsCount")
	public WebElement TotalCount_Text;
	
//	@FindBys({@FindBy(xpath = "//div[@id='dvcheckbox']")})
	@FindBys({@FindBy(xpath = "//div[@class='pjt-br-rt bdr-rit-non digitalreptext col-xs-12 col-sm-12 col-md-12 pdrt0']")})
	private List<WebElement> QuestionsList;
	
	@FindBy(id = "Recommended")
	public WebElement Recommended_LK;
	
	@FindBy(id = "My")
	public WebElement My_LK;
	
	@FindBy(id = "proceed")
	public WebElement SubmitWindow_BT;
	
	@FindBy(xpath = "//div[@id='CPH_rptAssets_dvLessonDetails_0']/div[2]/div[3]")
	public WebElement Play1_Icon;
	
	@FindBy(id = "CPH_rptAssets_chkContent_0")
	public WebElement Question1_CB;
	
	@FindBy(id = "CPH_dvGenerateTest")
	public WebElement Generate_BT;
	
	@FindBy(id = "txtTestName")
	public WebElement AssessmentName_TB;
	
	@FindBy(xpath = "//select[@ng-model='selectedQuestionLesson']")
	public WebElement Chapter_DD;
	
	@FindBy(id = "TestTypeDropDown")
	public WebElement TestType_DD;
	
	@FindBy(xpath = "//select[@ng-model='selectedTimeHour']")
    public WebElement Hour_DD;
	
	@FindBy(id = "txtAttempts")
	public WebElement Submissions_TB;
	
	@FindBy(id = "btnGenerate")
	public WebElement SaveAssessment_BT;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(xpath = "//div[@id='test']/div[2]")
	public WebElement Test_LK;
	
	@FindBy(id = "CPH_txtSearch")
	public WebElement Search_TB;
	
	@FindBy(id = "lnkFilterBySearchText")
	public WebElement Search_Icon;
	
	@FindBy(xpath = "//div[@id='CPH_rptAssets_dvLessonDetails_0']/div/div[4]//div[2]")
	public WebElement FilteredResourse_Text;
	
	@FindBy(id= "CPH_dvDelete")
	public WebElement Delete_BT;
	
	@FindBy(xpath = "//div[@id='mdlGenerateTest']/div/div/div[2]/div[9]/button")
	public WebElement Cancel_BT;
	
	@FindBy(xpath = "//select[@ng-model='selectedChapterConcept']")
	public WebElement ChapterConcept_DD;
	
	@FindBy(xpath = "//select[@ng-model='selectedQuestionType']")
	public WebElement QuestionType_DD;
	
	@FindBy(xpath = "//select[@ng-model='selectedComplexity']")
	public WebElement Complexity_DD;
	
	@FindBy(xpath = "//select[@ng-model='selectedClassification']")
	public WebElement Classification_DD;
	
	@FindBy(xpath = "//select[@ng-model='Marks']")
	public WebElement Marks_DD;
	
	@FindBy(xpath = "//input[@ng-model='NoofQns']")
	public WebElement NoofQns_TB;
	
	@FindBy(xpath = "//tr/td[8]/div")
	public WebElement Delete1_BT;
	
	@FindBy(id= "add_rown")
	public WebElement Addrow_BT;
	
	@FindBy(xpath = "//tr[2]/td/select")
	public WebElement ChapterConcept2_DD;
	
	@FindBy(xpath = "//tr[2]/td[2]/select")
	public WebElement QuestionType2_DD;
	
	@FindBy(xpath = "//tr[2]/td[3]/select")
	public WebElement Complexity2_DD;
	
	@FindBy(xpath = "//tr[2]/td[4]/select")
	public WebElement Classification2_DD;
	
	@FindBy(xpath = "//tr[2]/td[5]/select")
	public WebElement Marks2_DD;
	
	@FindBy(xpath = "//tr[2]/td[7]/input")
	public WebElement NoofQns2_TB;
	
	@FindBy(xpath = "//tr[2]/td[8]/div")
	public WebElement Delete2_BT;
	
	@FindBy(xpath = "//tr[3]/td/select")
	public WebElement ChapterConcept3_DD;
	
	@FindBy(xpath = "//tr[2]/td[2]/select")
	public WebElement QuestionType3_DD;
	
	@FindBy(xpath = "//tr[3]/td[3]/select")
	public WebElement Complexity3_DD;
	
	@FindBy(xpath = "//tr[3]/td[4]/select")
	public WebElement Classification3_DD;
	
	@FindBy(xpath = "//tr[3]/td[5]/select")
	public WebElement Marks3_DD;
	
	@FindBy(xpath = "//tr[3]/td[7]/input")
	public WebElement NoofQns3_TB;
	
	@FindBy(xpath = "//tr[3]/td[8]/div")
	public WebElement Delete3_BT;
	
	@FindBy(xpath = "//tr[4]/td/select")
	public WebElement ChapterConcept4_DD;
	
	@FindBy(xpath = "//tr[4]/td[2]/select")
	public WebElement QuestionType4_DD;
	
	@FindBy(xpath = "//tr[4]/td[3]/select")
	public WebElement Complexity4_DD;
	
	@FindBy(xpath = "//tr[4]/td[4]/select")
	public WebElement Classification4_DD;
	
	@FindBy(xpath = "//tr[4]/td[5]/select")
	public WebElement Marks4_DD;
	
	@FindBy(xpath = "//tr[4]/td[7]/input")
	public WebElement NoofQns4_TB;
	
	@FindBy(xpath = "//tr[4]/td[8]/div")
	public WebElement Delete4_BT;
	
	@FindBy(xpath = "//tr[5]/td/select")
	public WebElement ChapterConcept5_DD;
	
	@FindBy(xpath = "//tr[5]/td[2]/select")
	public WebElement QuestionType5_DD;
	
	@FindBy(xpath = "//tr[5]/td[3]/select")
	public WebElement Complexity5_DD;
	
	@FindBy(xpath = "//tr[5]/td[4]/select")
	public WebElement Classification5_DD;
	
	@FindBy(xpath = "//tr[5]/td[5]/select")
	public WebElement Marks5_DD;
	
	@FindBy(xpath = "//tr[5]/td[7]/input")
	public WebElement NoofQns5_TB;
	
	@FindBy(xpath = "//tr[5]/td[8]/div")
	public WebElement Delete5_BT;
	
	@FindBy(xpath = "//div[@id='Div1']/strong")
	public WebElement QuesSelected_Text;
	
	
	
	
	public void fn_ViewAllquestions() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of questions:" + totalcount);
	    System.out.println("Total lesson on page:"+ QuestionsList.size());
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllquestions","Pass"); 
//	    readWriteExcel(138,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllquestions","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewAllquestions","Fail"); 
//	    readWriteExcel(138,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAllquestions","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewRecommendedquestions() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(Recommended_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of Recommended questions:" + totalcount);
	    System.out.println("Total Recommended questions on 1st page:"+ QuestionsList.size());
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewRecommendedquestions","Pass");
//	    readWriteExcel(139,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewRecommendedquestions","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewRecommendedquestions","Fail");
//	    readWriteExcel(139,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewRecommendedquestions","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewMyquestions() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(My_LK);
	    Thread.sleep(2000);
	    String totalcount=TotalCount_Text.getText();
	    System.out.println("Total no.of my questions:" + totalcount);
	    System.out.println("Total my questions on 1st page:"+ QuestionsList.size());
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewMyquestions","Pass");
//	    readWriteExcel(140,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewMyquestions","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewMyquestions","Fail");
//	    readWriteExcel(140,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewMyquestions","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_PreviewRespectivequestion() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Play1_Icon);
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
	       Assert.assertTrue(SubmitWindow_BT.isDisplayed(), "Submit button on window not present: Fail");
	       driver.close();
	        }
	        }
	      driver.switchTo().window(parent);
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewRespectivequestion","Pass");
//	    readWriteExcel(141,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewRespectivequestion","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewRespectivequestion","Fail");
//	    readWriteExcel(141,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewRespectivequestion","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_AssessmentGeneration() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Question1_CB);
	    Thread.sleep(2000);
	    fn_Click(Generate_BT);
	    Thread.sleep(3000);
	    fn_Input(AssessmentName_TB,"Testing Assessment1");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Chapter_DD,4);
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(TestType_DD,3);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hour_DD,3);
	    Thread.sleep(2000);
//	    Submissions_TB.clear();
//	    fn_Input(Submissions_TB,"3");
//	    Thread.sleep(2000);
	    fn_Click(SaveAssessment_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Assessment created successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
	    fn_Click(Test_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
		fn_Input(Search_TB,"Testing Assessment1");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equals("Testing Assessment1"), "Search not done: Fail");
	    Thread.sleep(2000);
	    fn_Click(Question1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssessmentGeneration","Pass");
//	    readWriteExcel(142,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssessmentGeneration","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_AssessmentGeneration","Fail");
//	    readWriteExcel(142,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_AssessmentGeneration","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ValidationForMandatoryFieldsonAssessmentwindow() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Question1_CB);
	    Thread.sleep(2000);
	    fn_Click(Generate_BT);
	    Thread.sleep(3000);
	    fn_Click(SaveAssessment_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Assessment name cannot be blank"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Cancel_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationForMandatoryFieldsonAssessmentwindow","Pass");
//		readWriteExcel(143,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationForMandatoryFieldsonAssessmentwindow","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationForMandatoryFieldsonAssessmentwindow","Fail");
//	    readWriteExcel(143,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationForMandatoryFieldsonAssessmentwindow","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_CancelAssessmentwindow() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(3000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Question1_CB);
	    Thread.sleep(2000);
	    fn_Click(Generate_BT);
	    Thread.sleep(3000);
	    fn_Click(Cancel_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CancelAssessmentwindow","Pass");
//		readWriteExcel(144,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelAssessmentwindow","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CancelAssessmentwindow","Fail");
//	    readWriteExcel(144,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelAssessmentwindow","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_RandomAssessmentGeneration() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Generate_BT);
	    Thread.sleep(3000);
	    fn_Input(AssessmentName_TB,"Random Testing Assessment");
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Chapter_DD,4);
 	    Thread.sleep(2000);
 	    fn_SelectbyIndex(TestType_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Hour_DD,3);
	    Thread.sleep(2000);
//	    Submissions_TB.clear();
//	    fn_Input(Submissions_TB,"3");
//	    Thread.sleep(2000);
	    fn_SelectbyIndex(ChapterConcept_DD,2);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(QuestionType_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Complexity_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Classification_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(Marks_DD,0);
	    Thread.sleep(2000);
	    fn_Input(NoofQns_TB,"1");
	    Thread.sleep(2000);
	    fn_Click(Addrow_BT);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ChapterConcept2_DD,3);
	    Thread.sleep(2000);
	    fn_Input(NoofQns2_TB,"1");
	    Thread.sleep(2000);
	    fn_Click(Addrow_BT);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ChapterConcept3_DD,3);
	    Thread.sleep(2000);
	    fn_Input(NoofQns3_TB,"1");
	    Thread.sleep(2000);
	    fn_Click(Addrow_BT);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ChapterConcept4_DD,3);
	    Thread.sleep(2000);
	    fn_Input(NoofQns4_TB,"1");
	    Thread.sleep(2000);
	    fn_Click(Addrow_BT);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ChapterConcept5_DD,3);
	    Thread.sleep(2000);
	    fn_Input(NoofQns5_TB,"1");
	    Thread.sleep(2000);
	    fn_Click(Addrow_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("You can add maximum 5 filters only"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
	    String totalcountbefore=QuesSelected_Text.getText();
	    System.out.println("Total selected questions before delete:" + totalcountbefore);
	    int resultbefore = Integer.parseInt(totalcountbefore);
	    fn_Click(Delete5_BT);
	    Thread.sleep(3000);
	    fn_Click(Delete4_BT);
	    Thread.sleep(3000);
	    fn_Click(Delete3_BT);
	    Thread.sleep(3000);
	    String totalcountafter=QuesSelected_Text.getText();
	    System.out.println("Total selected questions after delete:" + totalcountafter);
	    Thread.sleep(2000);
		int resultafter = Integer.parseInt(totalcountafter);
		Assert.assertTrue(resultbefore>resultafter,"Delete logic fails");
		Thread.sleep(2000);
	    fn_Click(SaveAssessment_BT);
	    Thread.sleep(3000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Assessment created successfully"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(3000);
	    fn_Click(Test_LK);
	    Thread.sleep(3000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
		fn_Input(Search_TB,"Random Testing Assessment");
	    Thread.sleep(2000);
	    fn_Click(Search_Icon);
	    Thread.sleep(2000);
	    Assert.assertTrue(FilteredResourse_Text.getText().trim().equals("Random Testing Assessment"), "Search not done: Fail");
	    Thread.sleep(2000);
	    fn_Click(Question1_CB);
	    Thread.sleep(2000);
	    fn_Click(Delete_BT);
	    Thread.sleep(2000);
	    fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RandomAssessmentGeneration","Pass");
//	    readWriteExcel(145,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RandomAssessmentGeneration","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RandomAssessmentGeneration","Fail");
//	    readWriteExcel(145,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RandomAssessmentGeneration","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(All_LK);
	    Thread.sleep(2000);
	    fn_Click(Generate_BT);
	    Thread.sleep(3000);
	    fn_Click(SaveAssessment_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Assessment name cannot be blank"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Input(AssessmentName_TB,"Random Testing Assessment2");
	    Thread.sleep(2000);
	    fn_Click(SaveAssessment_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Please select Chapter / Concept"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_SelectbyIndex(ChapterConcept_DD,2);
	    Thread.sleep(2000);
	    fn_Click(SaveAssessment_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Please enter valid number of questions"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		fn_Input(NoofQns_TB,"2");
	    Thread.sleep(2000);
	    fn_Click(Addrow_BT);
	    Thread.sleep(2000);
		fn_Click(SaveAssessment_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Please select Chapter / Concept"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_SelectbyIndex(ChapterConcept2_DD,2);
	    Thread.sleep(2000);
	    fn_Click(SaveAssessment_BT);
	    Thread.sleep(2000);
	    Assert.assertTrue(Popup_TX.getText().trim().equals("Please enter valid number of questions"));
		Thread.sleep(2000);
		fn_Click(Ok_BT);
		Thread.sleep(2000);
		fn_Click(Cancel_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration","Pass");
//		readWriteExcel(146,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration","Fail");
//	    readWriteExcel(146,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_CancelRandomAssessmentwindow() throws InterruptedException, IOException{
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
	    Assert.assertTrue(QuestionBank_LK.getText().trim().equals("Question Bank"), "Question Bank text not present: Fail");
	    Thread.sleep(2000);
	    fn_Click(QuestionBank_LK);
	    Thread.sleep(2000);
	    fn_Click(Generate_BT);
	    Thread.sleep(3000);
	    fn_Click(Cancel_BT);
		Thread.sleep(2000);
		readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CancelRandomAssessmentwindow","Pass");
//		readWriteExcel(147,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelRandomAssessmentwindow","Pass");
	    }
	     else{
	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_CancelRandomAssessmentwindow","Fail");
//	    readWriteExcel(147,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelRandomAssessmentwindow","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	
	
	
	
	
	
	}
