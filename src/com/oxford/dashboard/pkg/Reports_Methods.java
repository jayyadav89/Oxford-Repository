package com.oxford.dashboard.pkg;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.oxford.generic.pkg.Generic_Methods;

public class Reports_Methods extends Generic_Methods{
	
	
	@FindBy(xpath = "//li[@id='lnkReports']/div[2]")
    public WebElement Reports_Lk;
	
	@FindBy(xpath = "//div[@class='pagehead']")
	public WebElement ReportsHead_Label;
	
	@FindBy(id = "spnGroupName")
	public WebElement SelectGroup_DD;
	
	@FindBy(xpath = "//nav[@id='navMenu']/div/ul/li/a")
	public WebElement Menu_Icon;
	
	@FindBy(id = "ancSectionWiseReport")
	public WebElement SectionwiseReport_LK;
	
	@FindBy(id = "ddlClsSubject")
	public WebElement ClassSubject_DD;
	
	@FindBy(id = "ddlReportType")
	public WebElement ReportType_DD;
	
	@FindBy(xpath = "//div[@id='teachrReport']/div[3]/div")
	public WebElement SectionwiseReport_Label;
	
	@FindBy(xpath = "//div[@class='blue cust_blue'][2]")
	public WebElement SectionwiseDetailedReport_Label;
	
	@FindBy(xpath = "//div[@id='teachrReport']/div[3]/div[8]/div/div[2]/div/div/ul/div[2]/li/a")
	public WebElement Navigate_Icon;
	
	@FindBy(xpath = "//div[@class='cnt_usr lft-alin-tb']/span")
	public WebElement Subject_Text;
	
	@FindBy(xpath = "//div[@class='lsn_subject_1']/div")
	public WebElement AveragePerformance_Text;
	
	@FindBy(xpath = "//div[@id='dvcenter']")
	public WebElement AveragePerformancePercentage_Text;
	
	@FindBy(xpath = "//div[@class='lsn_subject_3']/div")
	public WebElement ClassSubjectPerformance_Text;
	
	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_rptrLessonTrack_dvLessonDetail_0']/div[2]")
	public WebElement Assessment_LK;
	
	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_rptrLessonTrack_rptrAssetTrack_0_dvAssetDetail_0']/div[2]/div/span[2]")
	public WebElement AssessmentName_LK;
	
	@FindBy(xpath = "//div[@class='text-center pad10']")
	public WebElement AveragePerformanceofAssessment_Text;
	
	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_dvcenter']")
	public WebElement AveragePerformanceAssessmentPercent_Text;
	
	@FindBy(xpath = "//div[@class='gry-box-txt']")
	public WebElement StudentwisePerformance_Text;
	
	@FindBy(id = "ContentPlaceHolder1_rptStudentAsset_stdViewDet_0")
	public WebElement ViewDetails_LK;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[6]/span")
	public WebElement OverallPerformance_Text;
	
	@FindBy(xpath = "//div[@id='center']")
	public WebElement OverallPerformancePercent_Text;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[9]/div/span")
	public WebElement SubjectwisePerformance_Text;
	
	@FindBy(xpath = "//table//tr/td/div/div/div")
	public WebElement Subject1_Text;
	
	@FindBy(xpath = "//div[@id='center1']")
	public WebElement Subject1_Percent;
	
	@FindBy(xpath = "//div[@class='sbjt-ekt']")
	public WebElement LearningReports_Text;
	
	@FindBy(xpath = "//div[@id='teachrReport']/div[3]/div")
	public WebElement SectionwiseReports_Text;
	
	@FindBy(xpath = "//div[@class='blue cust_blue'][2]")
	public WebElement SectionwiseDetailedReports_Text;
	
	@FindBy(id = "ancUseageReport")
	public WebElement TrackingReport_LK;
	
	@FindBy(id = "ancLearningReport")
	public WebElement LearningReport_LK;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[5]/span")
	public WebElement LessonPlansOverview_Text;
	
	@FindBy(xpath = "//div[@class='prn-br-hlf bdr-rit']/span")
	public WebElement SubjectwiseOverview_Text;
	
	@FindBy(id = "ContentPlaceHolder1_rptLODetails_lblSubjectName_0")
	public WebElement LearningSubject1_Text;
	
	@FindBy(xpath = "//div[@class='rptlsndetail']//span")
	public WebElement TotalLessonPlannedNo_Text;
	
	@FindBy(xpath = "//div[@class='prn-br-hlf']/span")
	public WebElement ClassPerformance_Text;
	
	@FindBy(id = "center1")
	public WebElement ClassPerformancePercent_Text;
	
	@FindBy(id = "ContentPlaceHolder1_rptLODetails_lblAverageScore_0")
	public WebElement ClassPerformancePercentoutside_Text;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[8]/div[4]/div[3]/div/a")
	public WebElement ViewDetail1_LK;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[4]/div/div/div")
	public WebElement AveragePerformanceofSubject_Text;
	
	@FindBy(id = "dvcenter")
	public WebElement AveragePerformanceofSubjectPercent_Text;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[4]/div[2]/div/div")
	public WebElement ChapterwisePerformance_Text;
	
	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_dvGraph']//div[3]")
	public WebElement AveragePerformanceofChapter_Text;
	
	@FindBy(id = "divcenter")
	public WebElement AveragePerformanceofChapterPercent_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 col-md-6 ']//div[3]")
	public WebElement LessonwisePerformance_Text;
	
	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_rptrLessonTrack_dvLessonDetail_0']/div[2]/span[2]")
	public WebElement LessonPlanName_LK;
	
	@FindBy(xpath = "//div[@class='graph_header']")
	public WebElement AverageperformanceofLessonPlan_Text;
	
	@FindBy(id = "dvcenter0")
	public WebElement AverageperformanceofLessonPlanPercent_Text;
	
	@FindBy(xpath = "//div[@class='flt-lft  brd_nne']/span[2]")
	public WebElement ActivityName_LK;
	
	@FindBy(id = "ContentPlaceHolder1_dvcenter")
	public WebElement AvePerformofLearningResourcePercent_Text;
	
	@FindBy(id = "ContentPlaceHolder1_rptStudentAsset_stdViewDet_0")
	public WebElement ViewStudent1Details_LK;
	
	@FindBy(xpath = "//div[@class='well well-sm repthd_oupi']/span")
	public WebElement OverallPerformanceLearning_Text;
	
	@FindBy(id = "center")
	public WebElement AveScorePercent_Text;

	@FindBy(xpath = "//div[@class='app_mn']/div/span")
	public WebElement SubjectwisePerformanceLearning_Text;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[8]/div[6]/div[3]/div/a")
	public WebElement ViewDetails3_LK;
	
	@FindBy(id = "ancUsageRpt")
	public WebElement ApplicationUsageReport_LK;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[3]/div/a/span")
	public WebElement Desktop_LK;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[3]/div/div/span")
	public WebElement DesktopNoVisits_Text;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[3]/div/div/div/span")
	public WebElement DesktopTimeSpent_Text;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[4]/div/a/span")
	public WebElement Mobile_LK;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[4]/div/div/span")
	public WebElement MobileNoVisits_Text;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[4]/div/div/div/span")
	public WebElement MobileTimeSpent_Text;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[5]/div/a/span")
	public WebElement School_LK;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[5]/div/div/span")
	public WebElement SchoolNoVisits_Text;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[5]/div/div/div/span")
	public WebElement SchoolTimeSpent_Text;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[6]/div/a/span")
	public WebElement Web_LK;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[6]/div/div/span")
	public WebElement WebNoVisits_Text;
	
	@FindBy(xpath = "//div[@id='containerUsage']/div[3]/div/div/div[6]/div/div/div/span")
	public WebElement WebTimeSpent_Text;
	
	@FindBy(xpath = "//table/tbody/tr/td[3]")
	public WebElement Date_LK;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[3]/div/a/span")
	public WebElement Teacher_LK;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[3]/div/div/span")
	public WebElement TeacherNoVisits_Text;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[3]/div/div/div/span")
	public WebElement TeacherTimeSpent_Text;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[4]/div/a/span")
	public WebElement Parent_LK;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[4]/div/div/span")
	public WebElement ParentNoVisits_Text;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[4]/div/div/div/span")
	public WebElement ParentTimeSpent_Text;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[5]/div/a/span")
	public WebElement Student_LK;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[5]/div/div/span")
	public WebElement StudentNoVisits_Text;
	
	@FindBy(xpath = "//div[@id='containerRole']/div[3]/div/div/div[5]/div/div/div/span")
	public WebElement StudentTimeSpent_Text;
	
	@FindBy(xpath = "//div[@class='print_icn_usg ng-scope']")
	public WebElement Print_Icon;
	
	@FindBy(xpath = "//div[@id='containerUser']/div[2]/div/div/div[3]/div/a/span")
	public WebElement RollName_LK;
	
	@FindBy(id = "divjourney")
	public WebElement BackArrow_LK;
	
	@FindBy(xpath = "//div[@id='containerSecGraphDetails']/div[2]/div/div/div[3]/div/a/span")
	public WebElement SectionName1_LK;
	
	@FindBy(xpath = "//div[@id='containerSecWiseDetails']//div[3]/div/div/div")
	public WebElement StartDate_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-2 wdthprnt'][2]/div")
	public WebElement EndDate_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-2 wdthprnt'][3]/div")
	public WebElement StartTime_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-2 wdthprnt'][4]/div")
	public WebElement EndTime_Text;
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-3 wdthprnt']/div")
	public WebElement TimeSpent_Text;
	
	@FindBy(id = "ancStudentReport")
	public WebElement StudentIndividualReport_LK;
	
	@FindBy(xpath = "//div[@id='CPHBody_rptStudentAsset_dvPreview_0']/div[2]/div/span[2]")
	public WebElement StudentName_LK;
	
	@FindBy(xpath = "//div[@id='overalldv']/div[6]/span")
	public WebElement OverallPerformanceStudent_Text;
	
	@FindBy(id = "ContentPlaceHolder1_ucdivStdPerform_rptLODetails_ancViewUnitDetails_0")
	public WebElement ViewDetailsSubject1_LK;
	
	@FindBy(id = "ContentPlaceHolder1_ucdivStdSubPerform_rptrTheme_spnName_0")
	public WebElement SubjectName_Tab;
	
	@FindBy(xpath = "//div[@class='pull-left expn']/div")
	public WebElement AverageScore_Text;
	
	@FindBy(id = "dvcenterTheme0")
	public WebElement AverageScorePercent_Text;
	
	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_ucdivStdSubPerform_rptrTheme_rptrThemeAssetTrack_0_dvAssetDetail_0']/div[2]/div/span[2]")
	public WebElement Assessment1_LK;
	
	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_ucdivStdSubPerform_rptrTheme_rptrThemeAssetTrack_0_dvAssetDetail_1']/div[2]/div/span[2]")
	public WebElement Assessment2_LK;
	
	@FindBy(id = "lblModal")
	public WebElement WindowHeading_Text;
	
	@FindBy(id = "btnViewQuestionsDetails")
	public WebElement ViewQuestionsDetails_LK;
	
	@FindBy(xpath = "//div[@id='popupModal']/div/div/div/button")
	public WebElement CancelWindow_Icon;
	
	@FindBy(xpath = "//button[@class='cancel']")
	public WebElement Cancel_btn;
	
	
	@FindBy(id = "ancMarkSheet")
	public WebElement MarkSheet_LK;
	
	@FindBy(xpath = "//div[@id='CPH_divHeader']/table/tbody/tr[53]/td[2]/a")
	public WebElement View_LK;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(id= "ContentPlaceHolder1_lblTotlsnplan")
	public WebElement TotalLessonPlan_Text;
	
	@FindBy(id= "ContentPlaceHolder1_lblCLCount")
	public WebElement TotalCompleted_Text;
	
	@FindBy(id= "ContentPlaceHolder1_lblIPLCount")
	public WebElement TotalInProgress_Text;
	
	@FindBy(id= "ContentPlaceHolder1_lblOLCount")
	public WebElement TotalOverDue_Text;
	
	@FindBy(id= "ContentPlaceHolder1_lblNYPLCount")
	public WebElement TotalYettoStart_Text;
	
	@FindBy(id= "ContentPlaceHolder1_lblNotUsedCount")
	public WebElement TotalNotYetPlanned_Text;
	
	@FindBy(id= "ContentPlaceHolder1_lblExtended")
	public WebElement TotalExtended_Text;
	
	@FindBy(id= "ContentPlaceHolder1_expandAll")
	public WebElement ExpandAll_LK;
	
	@FindBy(id= "ContentPlaceHolder1_ucdivStdPerform_rptLODetails_ancViewUnitDetails_0")
	public WebElement ViewDetailsSubject_LK;
	
	@FindBy(xpath = "//div[@id='dvLessonperformance']/div")
	public WebElement Lessonwiseperformance_Text;
	
	@FindBy(id= "ContentPlaceHolder1_ucdivStdSubPerform_dvExpand")
	public WebElement ExpandAllSubject_LK;

	@FindBy(xpath = "//div[@class='pull-right w8p']/div")
	public WebElement Activitywiseperformance_Text;
	
	
	
	
	
	
	
	public void fn_NavigateReportPage() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    Assert.assertTrue(ReportsHead_Label.getText().trim().equals("Reports"), "Reports label not correct: Fail");
 	    Thread.sleep(2000);
 	    Assert.assertTrue(SelectGroup_DD.getText().trim().equals("Assessment reports"), "Assessment reports not selected: Fail");
	    Thread.sleep(2000);
 	    readWriteExcel(64,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_NavigateReportPage","Pass");
	    }
	     else{
	    readWriteExcel(64,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_NavigateReportPage","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_LandingSectionwiseAssessmentReports() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,0);
	    Thread.sleep(2000);
	    Assert.assertTrue(SectionwiseReport_Label.getText().trim().equals("Sectionwise Reports"), "Sectionwise Reports label not correct: Fail");
 	    Thread.sleep(2000);
 	    fn_ScrollDown500();
        Thread.sleep(2000);
 	    Assert.assertTrue(SectionwiseDetailedReport_Label.getText().trim().equals("Sectionwise detailed reports"), "Sectionwise detailed reports label not correct: Fail");
	    Thread.sleep(2000);
 	   readWriteExcel(65,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_LandingSectionwiseAssessmentReports","Pass");
	      }
	     else{
	    readWriteExcel(65,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_LandingSectionwiseAssessmentReports","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ViewSectionwisedetailedreports() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,0);
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
 	   if(Navigate_Icon.isDisplayed()){
		Thread.sleep(2000);
		fn_Click(Navigate_Icon);
	    Thread.sleep(3000);
	    Assert.assertTrue(Subject_Text.getText().trim().equals("Subject"), "Subject text not correct: Fail");
 	    Thread.sleep(2000);
 	    Assert.assertTrue(AveragePerformance_Text.getText().trim().equals("Average performance of the subject"), "Average performance of the subject text not correct: Fail");
 	    Thread.sleep(2000);
 	    String aveperpercent=AveragePerformancePercentage_Text.getText().trim();
 	    System.out.println(aveperpercent);
 	    Thread.sleep(2000);
 	    Assert.assertTrue(ClassSubjectPerformance_Text.getText().trim().equals("Class Subject Average Performance"), "Class subject average performance text not correct: Fail");
 	    Thread.sleep(2000);
        readWriteExcel(66,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSectionwisedetailedreports","Pass");
	      }
	     else{
	    readWriteExcel(66,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSectionwisedetailedreports","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_ViewAssessmentReports() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,0);
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
 	   if(Navigate_Icon.isDisplayed()){
		Thread.sleep(2000);
		fn_Click(Navigate_Icon);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
	    fn_Click(Assessment_LK);
	    Thread.sleep(2000);
	    fn_Click(AssessmentName_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(AveragePerformanceofAssessment_Text.isDisplayed(), "Average performance of the Assessment text not present: Fail");
 	    Thread.sleep(2000);
 	    String aveperpercent=AveragePerformanceAssessmentPercent_Text.getText().trim();
 	    System.out.println(aveperpercent);
 	    Thread.sleep(2000);
 	    Assert.assertTrue(StudentwisePerformance_Text.getText().trim().equals("Studentswise Performance"), "Studentswise Performance text not correct: Fail");
 	    Thread.sleep(2000);
        readWriteExcel(67,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssessmentReports","Pass");
	      }
	     else{
	    readWriteExcel(67,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAssessmentReports","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_SubjectwiseDetailedReportofStudent() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,0);
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
 	   if(Navigate_Icon.isDisplayed()){
		Thread.sleep(2000);
		fn_Click(Navigate_Icon);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
	    fn_Click(Assessment_LK);
	    Thread.sleep(2000);
	    fn_Click(AssessmentName_LK);
	    Thread.sleep(3000);
	    fn_Click(ViewDetails_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(OverallPerformance_Text.getText().trim().equals("Overall performance"), "Overall performance text not correct: Fail");
	    Thread.sleep(2000);
 	    String aveperpercent=OverallPerformancePercent_Text.getText().trim();
 	    System.out.println(aveperpercent);
 	    Thread.sleep(2000);
 	    fn_ScrollDown100();
        Thread.sleep(2000);
 	    Assert.assertTrue(SubjectwisePerformance_Text.getText().trim().equals("Subjectwise Performance"), "Subjectwise Performance text not correct: Fail");
 	    Thread.sleep(2000);
 	    Assert.assertTrue(Subject1_Text.isDisplayed(), "Subject name text not present: Fail");
	    Thread.sleep(2000);
 	    String subaveperpercent=Subject1_Percent.getText().trim();
	    System.out.println(subaveperpercent);
	    Thread.sleep(2000);
//	    fn_ScrollUP500();
//        Thread.sleep(2000);
        readWriteExcel(68,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SubjectwiseDetailedReportofStudent","Pass");
	      }
	     else{
	    readWriteExcel(68,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SubjectwiseDetailedReportofStudent","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	
	public void fn_LandingSectionwiseLearningReports() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,1);
	    Thread.sleep(2000);
	    Assert.assertTrue(LearningReports_Text.getText().trim().equals("Learning Reports"), "Learning Reports text not correct: Fail");
 	    Thread.sleep(2000);
 	    Assert.assertTrue(SectionwiseReports_Text.getText().trim().equals("Sectionwise Reports"), "Sectionwise Reports text not correct: Fail");
	    Thread.sleep(2000);
 	    fn_ScrollDown500();
        Thread.sleep(2000);
 	    Assert.assertTrue(SectionwiseDetailedReport_Label.getText().trim().equals("Sectionwise detailed reports"), "Sectionwise detailed reports label not correct: Fail");
	    Thread.sleep(2000);
//	    fn_ScrollUP500();
//        Thread.sleep(2000);
 	    readWriteExcel(69,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_LandingSectionwiseLearningReports","Pass");
	      }
	     else{
	    readWriteExcel(69,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_LandingSectionwiseLearningReports","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewSectionwiseDetailedLearningReports() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,1);
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
 	    Assert.assertTrue(SectionwiseDetailedReport_Label.getText().trim().equals("Sectionwise detailed reports"), "Sectionwise detailed reports label not correct: Fail");
	    Thread.sleep(2000);
	    if(SectionwiseDetailedReport_Label.isDisplayed()){
		  Assert.assertTrue(Navigate_Icon.isDisplayed(), "Navigate ion is not present: Fail");
	    	Thread.sleep(2000);
			fn_Click(Navigate_Icon);
		    Thread.sleep(3000);
	    readWriteExcel(70,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSectionwiseDetailedLearningReports","Pass");
	      }
	     else{
	    readWriteExcel(70,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSectionwiseDetailedLearningReports","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_ViewAveragePerformanceofaLessonPlanandActivitywisePerformance() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,1);
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
 	    Assert.assertTrue(SectionwiseDetailedReport_Label.getText().trim().equals("Sectionwise detailed reports"), "Sectionwise detailed reports label not correct: Fail");
	    Thread.sleep(2000);
	    if(SectionwiseDetailedReport_Label.isDisplayed()){
		  Assert.assertTrue(Navigate_Icon.isDisplayed(), "Navigate ion is not present: Fail");
	    	Thread.sleep(2000);
			fn_Click(Navigate_Icon);
		    Thread.sleep(3000);
		    
		    
	    readWriteExcel(71,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAveragePerformanceofaLessonPlanandActivitywisePerformance","Pass");
	      }
	     else{
	    readWriteExcel(71,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAveragePerformanceofaLessonPlanandActivitywisePerformance","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_ViewSubjectwiseDetailedReportofRespectiveStudent() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(SectionwiseReport_LK);
	    Thread.sleep(3000);
	    fn_SelectbyIndex(ClassSubject_DD,0);
	    Thread.sleep(2000);
	    fn_SelectbyIndex(ReportType_DD,1);
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
 	    Assert.assertTrue(SectionwiseDetailedReport_Label.getText().trim().equals("Sectionwise detailed reports"), "Sectionwise detailed reports label not correct: Fail");
	    Thread.sleep(2000);
	    if(SectionwiseDetailedReport_Label.isDisplayed()){
		  Assert.assertTrue(Navigate_Icon.isDisplayed(), "Navigate ion is not present: Fail");
	    	Thread.sleep(2000);
			fn_Click(Navigate_Icon);
		    Thread.sleep(3000);
		    
		    
	    readWriteExcel(72,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSubjectwiseDetailedReportofRespectiveStudent","Pass");
	      }
	     else{
	    readWriteExcel(72,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSubjectwiseDetailedReportofRespectiveStudent","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_ViewTrackingReport() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(LearningReport_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(LessonPlansOverview_Text.getText().trim().equals("Lesson plans overview"), "Lesson Plans Overview text not correct: Fail");
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        Assert.assertTrue(SubjectwiseOverview_Text.getText().trim().equals("Subjectwise overview"), "Subjectwise Overview text not correct: Fail");
	    Thread.sleep(2000);
	    String subjectname=LearningSubject1_Text.getText().trim();
	    System.out.println(subjectname);
	    Thread.sleep(2000);
	    String lessonno=TotalLessonPlannedNo_Text.getText().trim();
	    System.out.println(lessonno);
	    Thread.sleep(2000);
	    Assert.assertTrue(ClassPerformance_Text.getText().trim().equals("Class performance"), "Class Performance text not correct: Fail");
	    Thread.sleep(2000);
	    String classpercent=ClassPerformancePercent_Text.getText().trim();
	    Thread.sleep(2000);
	    String classpercentoutside=ClassPerformancePercentoutside_Text.getText().trim();
	    Thread.sleep(2000);
	    Assert.assertTrue(classpercent.equals(classpercentoutside));
	    readWriteExcel(73,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTrackingReport","Pass");
	      }
	     else{
	    readWriteExcel(73,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTrackingReport","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     
	
	
	public void fn_ViewTrackingLearningReport() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(LearningReport_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        fn_Click(ViewDetail1_LK);
	    Thread.sleep(3000);
        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
	    Thread.sleep(2000);
	    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
	    System.out.println(avesubper);
	    Thread.sleep(2000);
	    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        if(AveragePerformanceofChapter_Text.isDisplayed()){
        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
	    Thread.sleep(2000);
	    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
	    System.out.println(avechapper);
	    Thread.sleep(2000);
	    Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
	    Thread.sleep(2000);
	    readWriteExcel(74,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTrackingLearningReport","Pass");
	      }
	     else{
	    readWriteExcel(74,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTrackingLearningReport","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_ViewAvrgPerformanceofLessonandActivitywisePerformance() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(LearningReport_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        fn_Click(ViewDetail1_LK);
	    Thread.sleep(3000);
        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
	    Thread.sleep(2000);
	    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
	    System.out.println(avesubper);
	    Thread.sleep(2000);
	    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        
        if(LessonPlanName_LK.isDisplayed()){
        	fn_Click(LessonPlanName_LK);
    	    Thread.sleep(2000);
        	
        Assert.assertTrue(AverageperformanceofLessonPlan_Text.getText().trim().equals("Average performance of a lesson plan"), "Average performance of Lesson Plan text not correct: Fail");
	    Thread.sleep(2000);
	    String avelessonper=AverageperformanceofLessonPlanPercent_Text.getText().trim();
	    System.out.println(avelessonper);
	    Thread.sleep(2000);
//	    Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
//	    Thread.sleep(2000);
	    readWriteExcel(75,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAvrgPerformanceofLessonandActivitywisePerformance","Pass");
	      }
	     else{
	    readWriteExcel(75,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAvrgPerformanceofLessonandActivitywisePerformance","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_ViewSubjectwiseDetailedReportofRespectiveStudentLearning() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(LearningReport_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        fn_Click(ViewDetails3_LK);
	    Thread.sleep(3000);
        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
	    Thread.sleep(2000);
	    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
	    System.out.println(avesubper);
	    Thread.sleep(2000);
	    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
	    Thread.sleep(2000);
	    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
	    System.out.println(avechapper);
	    Thread.sleep(2000);
        Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
	    Thread.sleep(2000);
	   if(LessonPlanName_LK.isDisplayed()){
        	fn_Click(LessonPlanName_LK);
    	    Thread.sleep(2000);
    	    Assert.assertTrue(AverageperformanceofLessonPlan_Text.getText().trim().equals("Average performance of a lesson plan"), "Average performance of Lesson Plan text not correct: Fail");
    	    Thread.sleep(2000);
    	    String avelessplanpper=AverageperformanceofLessonPlanPercent_Text.getText().trim();
    	    System.out.println(avelessplanpper);
    	    Thread.sleep(2000);
         if(ActivityName_LK.isDisplayed()){
    	fn_Click(ActivityName_LK);
	    Thread.sleep(2000);
        String avelearning=AvePerformofLearningResourcePercent_Text.getText().trim();
	    System.out.println(avelearning);
	    Thread.sleep(2000);
	    fn_Click(ViewStudent1Details_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(OverallPerformanceLearning_Text.getText().trim().equals("Overall performance"), "Overall Performance text not correct: Fail");
	    Thread.sleep(2000);
	    String avescore=AveScorePercent_Text.getText().trim();
	    System.out.println(avescore);
	    Thread.sleep(2000);
	    Assert.assertTrue(SubjectwisePerformanceLearning_Text.getText().trim().equals("Subjectwise Performance"), "Subjectwise Performance text not correct: Fail");
	    Thread.sleep(2000);
	    readWriteExcel(76,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSubjectwiseDetailedReportofRespectiveStudentLearning","Pass");
	      }
	     else{
	    readWriteExcel(76,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSubjectwiseDetailedReportofRespectiveStudentLearning","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	     }
	
	
	
	public void fn_ViewNumberofVisitsandTimeSpentonDevices() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(ApplicationUsageReport_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    Assert.assertTrue(Desktop_LK.getText().trim().equals("Desktop"), "Desktop text not correct: Fail");
	    Thread.sleep(2000);
	    String desktopvisits=DesktopNoVisits_Text.getText().trim();
	    System.out.println("No.of Visits for Desktop: " +desktopvisits);
	    Thread.sleep(2000);
	    String desktoptime=DesktopTimeSpent_Text.getText().trim();
	    System.out.println("Time spent for Desktop: " +desktoptime);
	    Thread.sleep(2000);
	    Assert.assertTrue(Mobile_LK.getText().trim().equals("Mobile"), "Mobile text not correct: Fail");
	    Thread.sleep(2000);
	    String mobilevisits=MobileNoVisits_Text.getText().trim();
	    System.out.println("No.of Visits for Mobile: " +mobilevisits);
	    Thread.sleep(2000);
	    String mobiletime=MobileTimeSpent_Text.getText().trim();
	    System.out.println("Time spent for Mobile: " +mobiletime);
	    Thread.sleep(2000);
	    Assert.assertTrue(School_LK.getText().trim().equals("School"), "School text not correct: Fail");
	    Thread.sleep(2000);
	    String schoolvisits=SchoolNoVisits_Text.getText().trim();
	    System.out.println("No.of Visits for School: " +schoolvisits);
	    Thread.sleep(2000);
	    String schooltime=SchoolTimeSpent_Text.getText().trim();
	    System.out.println("Time spent for School: " +schooltime);
	    Thread.sleep(2000);
	    Assert.assertTrue(Web_LK.getText().trim().equals("Web"), "Web text not correct: Fail");
	    Thread.sleep(2000);
	    String Webvisits=WebNoVisits_Text.getText().trim();
	    System.out.println("No.of Visits for Web: " +Webvisits);
	    Thread.sleep(2000);
	    String Webtime=WebTimeSpent_Text.getText().trim();
	    System.out.println("Time spent for Web: " +Webtime);
	    Thread.sleep(2000);
	    readWriteExcel(77,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNumberofVisitsandTimeSpentonDevices","Pass");
  	    }
	   else{
	    readWriteExcel(77,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNumberofVisitsandTimeSpentonDevices","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     
	
	
	public void fn_ViewNumberofVisitsandTimeSpentonAllRolls() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(ApplicationUsageReport_LK);
	    Thread.sleep(3000);
	    
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    fn_Click(Web_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    Assert.assertTrue(Teacher_LK.getText().trim().equals("Teacher"), "Teacher text not correct: Fail");
	    Thread.sleep(2000);
	    String Teachervisits=TeacherNoVisits_Text.getText().trim();
	    System.out.println("No.of Visits by Teacher: " +Teachervisits);
	    Thread.sleep(2000);
	    String Teachertime=TeacherTimeSpent_Text.getText().trim();
	    System.out.println("Time spent by Teacher: " +Teachertime);
	    Thread.sleep(2000);
	    Assert.assertTrue(Parent_LK.getText().trim().equals("Parent"), "Parent text not correct: Fail");
	    Thread.sleep(2000);
	    String Parentvisits=ParentNoVisits_Text.getText().trim();
	    System.out.println("No.of Visits by Parent: " +Parentvisits);
	    Thread.sleep(2000);
	    String Parenttime=ParentTimeSpent_Text.getText().trim();
	    System.out.println("Time spent by Parent: " +Parenttime);
	    Thread.sleep(2000);
	    Assert.assertTrue(Student_LK.getText().trim().equals("Student"), "Student text not correct: Fail");
	    Thread.sleep(2000);
	    String Studentvisits=StudentNoVisits_Text.getText().trim();
	    System.out.println("No.of Visits by Student: " +Studentvisits);
	    Thread.sleep(2000);
	    String Studenttime=StudentTimeSpent_Text.getText().trim();
	    System.out.println("Time spent by Student: " +Studenttime);
	    Thread.sleep(2000);
	    fn_ScrollUP500();
	    Thread.sleep(2000);
	    fn_Click(BackArrow_LK);
 	    Thread.sleep(2000);
	    readWriteExcel(78,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNumberofVisitsandTimeSpentonAllRolls","Pass");
  	    }
	   else{
	    readWriteExcel(78,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNumberofVisitsandTimeSpentonAllRolls","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_PrintUsageReport() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(ApplicationUsageReport_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    fn_Click(Web_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    Assert.assertTrue(Print_Icon.isDisplayed(), "Print icon not available");
//	    fn_Click(Print_Icon);
	    Thread.sleep(2000);
	    fn_Click(BackArrow_LK);
 	    Thread.sleep(2000);
	    readWriteExcel(79,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintUsageReport","Pass");
  	    }
	   else{
	    readWriteExcel(79,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintUsageReport","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_ViewSectionwiseUsageReport() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(TrackingReport_LK);
	    Thread.sleep(3000);
	    fn_Click(ApplicationUsageReport_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    fn_Click(Web_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    fn_Click(Teacher_LK);
	    Thread.sleep(3000);
	    fn_Click(RollName_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
	    Thread.sleep(2000);
	    fn_Click(SectionName1_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(StartDate_Text.getText().trim().equals("Start date"), "Start Date text not correct: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(EndDate_Text.getText().trim().equals("End date"), "End Date text not correct: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(StartTime_Text.getText().trim().equals("Start time"), "Start Time text not correct: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(EndTime_Text.getText().trim().equals("End time"), "End Time text not correct: Fail");
	    Thread.sleep(2000);
	    Assert.assertTrue(TimeSpent_Text.getText().trim().contains("Time spent"), "Time Spent text not present: Fail");
	    Thread.sleep(2000);
	    readWriteExcel(80,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSectionwiseUsageReport","Pass");
  	    }
	   else{
	    readWriteExcel(80,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSectionwiseUsageReport","Fail");
  	    Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewOverallandSubjectwisePerformanceofStudent() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(StudentIndividualReport_LK);
	    Thread.sleep(3000);
	    fn_Click(StudentName_LK);
	    Thread.sleep(3000);
	    Assert.assertTrue(OverallPerformanceStudent_Text.getText().trim().equals("Overall performance"), "Overall Performance of Student text not correct: Fail");
	    Thread.sleep(2000);
	    String avescoreper=AveScorePercent_Text.getText().trim();
	    System.out.println("Average score of Overall performance:" +avescoreper);
	    Thread.sleep(2000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        Assert.assertTrue(SubjectwisePerformanceLearning_Text.getText().trim().equals("Subjectwise Performance"), "Subjectwise Performance of student text not correct: Fail");
	    Thread.sleep(2000);
	    String avescore=ClassPerformancePercent_Text.getText().trim();
	    System.out.println("Average score of subject:" +avescore);
	    Thread.sleep(2000);
        readWriteExcel(81,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewOverallandSubjectwisePerformanceofStudent","Pass");
	      }
	     else{
	    readWriteExcel(81,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewOverallandSubjectwisePerformanceofStudent","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     
	     
	
		public void fn_ViewAverageScoreofSelectedSubject() throws InterruptedException, IOException{
	    Thread.sleep(2000);
		if(Reports_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Reports_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(Menu_Icon);
	    Thread.sleep(3000);
	    fn_Click(StudentIndividualReport_LK);
	    Thread.sleep(3000);
	    fn_Click(StudentName_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        fn_Click(ViewDetailsSubject1_LK);
	    Thread.sleep(3000);
	    fn_ScrollDown500();
        Thread.sleep(2000);
        if(SubjectName_Tab.isDisplayed()){
        	fn_Click(SubjectName_Tab);
    	    Thread.sleep(2000);
        Assert.assertTrue(AverageScore_Text.getText().trim().equals("Average score"), "Average Score of selected subject text not correct: Fail");
	    Thread.sleep(2000);
	    String avescorepercent=AverageScorePercent_Text.getText().trim();
	    System.out.println(avescorepercent);
	    Thread.sleep(2000);
	    readWriteExcel(82,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAverageScoreofSelectedSubject","Pass");
	      }
	     else{
	    readWriteExcel(82,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewAverageScoreofSelectedSubject","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
		public void fn_DisplayPracticeTestDetails() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(StudentIndividualReport_LK);
		    Thread.sleep(3000);
		    fn_Click(StudentName_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetailsSubject1_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        if(SubjectName_Tab.isDisplayed()){
	        	fn_Click(SubjectName_Tab);
	    	    Thread.sleep(2000);
	    	  if(Assessment1_LK.isDisplayed()){
		        	fn_Click(Assessment1_LK);
		    	    Thread.sleep(2000);   
	    	//    driver.switchTo().
	    	    
	    	Assert.assertTrue(WindowHeading_Text.getText().trim().equals("Practice test"), "Practice test text not correct: Fail");
		    Thread.sleep(2000);
		    
		   //Practice test page not coming ........... 
		   
		    readWriteExcel(83,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DisplayPracticeTestDetails","Pass");
		      }
		     else{
		    readWriteExcel(83,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DisplayPracticeTestDetails","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
		
		
		
		public void fn_ViewOverallPerformanceandStudentSubmissionStatusReport() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(StudentIndividualReport_LK);
		    Thread.sleep(3000);
		    fn_Click(StudentName_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetailsSubject1_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        if(SubjectName_Tab.isDisplayed()){
	        	fn_Click(SubjectName_Tab);
	    	    Thread.sleep(2000);
	    	  if(Assessment1_LK.isDisplayed()){
		        	fn_Click(Assessment1_LK);
		    	    Thread.sleep(2000);   
	    	//    driver.switchTo().
	    	    
	    	Assert.assertTrue(WindowHeading_Text.getText().trim().equals("Practice test"), "Practice test text not correct: Fail");
		    Thread.sleep(2000);
		    
		   //Arrow is not available so not able to code further......... 
		   
		    readWriteExcel(84,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewOverallPerformanceandStudentSubmissionStatusReport","Pass");
		      }
		     else{
		    readWriteExcel(84,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewOverallPerformanceandStudentSubmissionStatusReport","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
		
		
	
		public void fn_ViewTheQuestionAnswerChoicestudentAnswerandrightReport() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(StudentIndividualReport_LK);
		    Thread.sleep(3000);
		    fn_Click(StudentName_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetailsSubject1_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        if(SubjectName_Tab.isDisplayed()){
	        	fn_Click(SubjectName_Tab);
	    	    Thread.sleep(2000);
	    	  if(Assessment2_LK.isDisplayed()){
		        	fn_Click(Assessment2_LK);
		    	    Thread.sleep(2000);
		    	    
		    	    String Parent_Window = driver.getWindowHandle();    
		    	      // Switching from parent window to child window   
		    	     for (String Child_Window : driver.getWindowHandles())  
		    	     {  
		    	     driver.switchTo().window(Child_Window);  
		    	     // Performing actions on child window 
		    	     Thread.sleep(2000);
		    	     ViewQuestionsDetails_LK.click();
		 //   	     fn_Click(ViewQuestionsDetails_LK);
			    	    Thread.sleep(2000); 
			    	    fn_Click(CancelWindow_Icon);
			    	    Thread.sleep(2000);  
		    	     }  
		    	     //Switching back to Parent Window  
		    	     driver.switchTo().window(Parent_Window);  
	    	   readWriteExcel(85,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTheQuestionAnswerChoicestudentAnswerandrightReport","Pass");
		      }
		     else{
		    readWriteExcel(85,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTheQuestionAnswerChoicestudentAnswerandrightReport","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
	
	
		public void fn_ViewMarkSheetofSelectedStudent() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(MarkSheet_LK);
		    Thread.sleep(3000);
		    fn_Click(View_LK);
		    Thread.sleep(3000);
		    
		    try{
		    WindowHandling();
		    Thread.sleep(2000);
		    fn_Click(Reports_Lk);
	        Thread.sleep(3000);
	 	    readWriteExcel(86,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewMarkSheetofSelectedStudent","Pass");
			 }
			catch(NoAlertPresentException  ex){
				
				if(Popup_TX.isDisplayed()){
		 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("No records found for the Term Test"));
					Thread.sleep(2000);
					 fn_Click(Ok_BT);
					 Thread.sleep(2000);
					 readWriteExcel(87,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintMarkSheet","No records found: Pass");
		           }
				   }
		    catch(NoSuchElementException e){
		    	readWriteExcel(86,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewMarkSheetofSelectedStudent","Fail");
		  	    Thread.sleep(5000);
		           }
		    }
		    
		    
		      }
			
			
		
		
		
		public void fn_PrintMarkSheet() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(MarkSheet_LK);
		    Thread.sleep(3000);
		    fn_Click(View_LK);
		    Thread.sleep(3000);
		    try{
			    WindowHandling();
			    Thread.sleep(2000);
			    fn_Click(Reports_Lk);
		        Thread.sleep(3000);
		 	    readWriteExcel(87,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintMarkSheet","Pass");
				 }
				catch(NoAlertPresentException  ex){
					
					if(Popup_TX.isDisplayed()){
			 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("No records found for the Term Test"));
						Thread.sleep(2000);
						 fn_Click(Ok_BT);
						 Thread.sleep(2000);
						 readWriteExcel(87,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintMarkSheet","No records found: Pass");
			           }
					   }
			    catch(NoSuchElementException e){
			    	readWriteExcel(87,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PrintMarkSheet","Fail");
			  	    Thread.sleep(5000);
			           }
			         }
		             }
		
		
		
		public void fn_ViewLessonwiseoverview() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    String lessonplan=TotalLessonPlan_Text.getText().trim();
		    System.out.println("Total Lesson Plan is: " +lessonplan);
		    Thread.sleep(2000);
		    String completed=TotalCompleted_Text.getText().trim();
		    System.out.println("No. of completed: " +completed);
		    Thread.sleep(2000);
		    String InProgress=TotalInProgress_Text.getText().trim();
		    System.out.println("No. of In Progress: " +InProgress);
		    Thread.sleep(2000);
		    String Overdue=TotalOverDue_Text.getText().trim();
		    System.out.println("No. of Overdue: " +Overdue);
		    Thread.sleep(2000);
		    String yettostart=TotalYettoStart_Text.getText().trim();
		    System.out.println("No. of Yet to Start: " +yettostart);
		    Thread.sleep(2000);
		    String notyetplanned=TotalNotYetPlanned_Text.getText().trim();
		    System.out.println("No. of Not yet Planned: " +notyetplanned);
		    Thread.sleep(2000);
		    String extended=TotalExtended_Text.getText().trim();
		    System.out.println("No. of Extended: " +extended);
		    Thread.sleep(2000);
		    readWriteExcel(88,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonwiseoverview","Pass");
		      }
		     else{
		    readWriteExcel(88,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonwiseoverview","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     
		
		
		public void fn_ViewChapterwiseandLessonwiseperformance() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetail1_LK);
		    Thread.sleep(3000);
	        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
		    System.out.println(avesubper);
		    Thread.sleep(2000);
		    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        if(AveragePerformanceofChapter_Text.isDisplayed()){
	        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
		    Thread.sleep(2000);
		    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
		    System.out.println(avechapper);
		    Thread.sleep(2000);
		    Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		    readWriteExcel(89,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewChapterwiseandLessonwiseperformance","Pass");
		      }
		     else{
		    readWriteExcel(89,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewChapterwiseandLessonwiseperformance","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		
		
		
		public void fn_ViewLessonsandActivitiesThatAreTaggedofRespectivelessons() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetails3_LK);
		    Thread.sleep(3000);
	        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
		    System.out.println(avesubper);
		    Thread.sleep(2000);
		    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
		    Thread.sleep(2000);
		    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
		    System.out.println(avechapper);
		    Thread.sleep(2000);
	        Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		   if(LessonPlanName_LK.isDisplayed()){
	        	fn_Click(ExpandAll_LK);
	    	    Thread.sleep(2000);
	    	    
	         if(ActivityName_LK.isDisplayed()){
	    	    readWriteExcel(90,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonsandActivitiesThatAreTaggedofRespectivelessons","Pass");
		      }
		     else{
		    readWriteExcel(90,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonsandActivitiesThatAreTaggedofRespectivelessons","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
		
		
		
		public void fn_ViewTheAverageofThelesson() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetail1_LK);
		    Thread.sleep(3000);
	        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
		    System.out.println(avesubper);
		    Thread.sleep(2000);
		    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        
	        if(LessonPlanName_LK.isDisplayed()){
	        	fn_Click(LessonPlanName_LK);
	    	    Thread.sleep(2000);
	        	
	        Assert.assertTrue(AverageperformanceofLessonPlan_Text.getText().trim().equals("Average performance of a lesson plan"), "Average performance of Lesson Plan text not correct: Fail");
		    Thread.sleep(2000);
		    String avelessonper=AverageperformanceofLessonPlanPercent_Text.getText().trim();
		    System.out.println(avelessonper);
		    Thread.sleep(2000);
            readWriteExcel(91,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTheAverageofThelesson","Pass");
		      }
		     else{
		    readWriteExcel(91,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewTheAverageofThelesson","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		
		
		public void fn_ViewDetailsAboutSubmissionofparticularActivityBystudent() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetails3_LK);
		    Thread.sleep(3000);
	        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
		    System.out.println(avesubper);
		    Thread.sleep(2000);
		    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
		    Thread.sleep(2000);
		    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
		    System.out.println(avechapper);
		    Thread.sleep(2000);
	        Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		   if(LessonPlanName_LK.isDisplayed()){
	        	fn_Click(LessonPlanName_LK);
	    	    Thread.sleep(2000);
	    	    Assert.assertTrue(AverageperformanceofLessonPlan_Text.getText().trim().equals("Average performance of a lesson plan"), "Average performance of Lesson Plan text not correct: Fail");
	    	    Thread.sleep(2000);
	    	    String avelessplanpper=AverageperformanceofLessonPlanPercent_Text.getText().trim();
	    	    System.out.println(avelessplanpper);
	    	    Thread.sleep(2000);
	         if(ActivityName_LK.isDisplayed()){
	    	fn_Click(ActivityName_LK);
		    Thread.sleep(2000);
	        String avelearning=AvePerformofLearningResourcePercent_Text.getText().trim();
		    System.out.println(avelearning);
		    Thread.sleep(2000);
		    
		    readWriteExcel(92,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewDetailsAboutSubmissionofparticularActivityBystudent","Pass");
		      }
		     else{
		    readWriteExcel(92,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewDetailsAboutSubmissionofparticularActivityBystudent","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
		
		
		public void fn_ViewOverallPerformanceAndSubjectWisePerformance() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetails3_LK);
		    Thread.sleep(3000);
	        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
		    System.out.println(avesubper);
		    Thread.sleep(2000);
		    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
		    Thread.sleep(2000);
		    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
		    System.out.println(avechapper);
		    Thread.sleep(2000);
	        Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		   if(LessonPlanName_LK.isDisplayed()){
	        	fn_Click(LessonPlanName_LK);
	    	    Thread.sleep(2000);
	    	    Assert.assertTrue(AverageperformanceofLessonPlan_Text.getText().trim().equals("Average performance of a lesson plan"), "Average performance of Lesson Plan text not correct: Fail");
	    	    Thread.sleep(2000);
	    	    String avelessplanpper=AverageperformanceofLessonPlanPercent_Text.getText().trim();
	    	    System.out.println(avelessplanpper);
	    	    Thread.sleep(2000);
	         if(ActivityName_LK.isDisplayed()){
	    	fn_Click(ActivityName_LK);
		    Thread.sleep(2000);
	        String avelearning=AvePerformofLearningResourcePercent_Text.getText().trim();
		    System.out.println(avelearning);
		    Thread.sleep(2000);
		    fn_Click(ViewStudent1Details_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(OverallPerformanceLearning_Text.getText().trim().equals("Overall performance"), "Overall Performance text not correct: Fail");
		    Thread.sleep(2000);
		    String avescore=AveScorePercent_Text.getText().trim();
		    System.out.println(avescore);
		    Thread.sleep(2000);
		    Assert.assertTrue(SubjectwisePerformanceLearning_Text.getText().trim().equals("Subjectwise Performance"), "Subjectwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		    readWriteExcel(93,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewOverallPerformanceAndSubjectWisePerformance","Pass");
		      }
		     else{
		    readWriteExcel(93,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewOverallPerformanceAndSubjectWisePerformance","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
		
		
		public void fn_ViewLessonwisePerformancebytheStudent() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetails3_LK);
		    Thread.sleep(3000);
	        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
		    System.out.println(avesubper);
		    Thread.sleep(2000);
		    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
		    Thread.sleep(2000);
		    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
		    System.out.println(avechapper);
		    Thread.sleep(2000);
	        Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		   if(LessonPlanName_LK.isDisplayed()){
	        	fn_Click(LessonPlanName_LK);
	    	    Thread.sleep(2000);
	    	    Assert.assertTrue(AverageperformanceofLessonPlan_Text.getText().trim().equals("Average performance of a lesson plan"), "Average performance of Lesson Plan text not correct: Fail");
	    	    Thread.sleep(2000);
	    	    String avelessplanpper=AverageperformanceofLessonPlanPercent_Text.getText().trim();
	    	    System.out.println(avelessplanpper);
	    	    Thread.sleep(2000);
	         if(ActivityName_LK.isDisplayed()){
	    	fn_Click(ActivityName_LK);
		    Thread.sleep(2000);
	        String avelearning=AvePerformofLearningResourcePercent_Text.getText().trim();
		    System.out.println(avelearning);
		    Thread.sleep(2000);
		    fn_Click(ViewStudent1Details_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(OverallPerformanceLearning_Text.getText().trim().equals("Overall performance"), "Overall Performance text not correct: Fail");
		    Thread.sleep(2000);
		    String avescore=AveScorePercent_Text.getText().trim();
		    System.out.println(avescore);
		    Thread.sleep(2000);
		    Assert.assertTrue(SubjectwisePerformanceLearning_Text.getText().trim().equals("Subjectwise Performance"), "Subjectwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		    fn_Click(ViewDetailsSubject_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(Lessonwiseperformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		    String avelesson=AveragePerformanceofChapterPercent_Text.getText().trim();
		    System.out.println("Average lessonwise score :" +avelesson);
		    Thread.sleep(2000);
		    readWriteExcel(94,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonwisePerformancebytheStudent","Pass");
		      }
		     else{
		    readWriteExcel(94,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewLessonwisePerformancebytheStudent","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
		
		public void fn_ViewActivityWisePerformanceOfTheStudentofParticularlesson() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Reports_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Reports_Lk);
	 	    Thread.sleep(3000);
	 	    fn_Click(Menu_Icon);
		    Thread.sleep(3000);
		    fn_Click(TrackingReport_LK);
		    Thread.sleep(3000);
		    fn_Click(LearningReport_LK);
		    Thread.sleep(3000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        fn_Click(ViewDetails3_LK);
		    Thread.sleep(3000);
	        Assert.assertTrue(AveragePerformanceofSubject_Text.getText().trim().equals("Average performance of the subject"), "Average Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    String avesubper=AveragePerformanceofSubjectPercent_Text.getText().trim();
		    System.out.println(avesubper);
		    Thread.sleep(2000);
		    Assert.assertTrue(ChapterwisePerformance_Text.getText().trim().equals("Chapterwise performance"), "Chapterwise Performance of Subject text not correct: Fail");
		    Thread.sleep(2000);
		    fn_ScrollDown500();
	        Thread.sleep(2000);
	        Assert.assertTrue(AveragePerformanceofChapter_Text.getText().trim().equals("Average performance of a chapter"), "Average Performance of Chapter text not correct: Fail");
		    Thread.sleep(2000);
		    String avechapper=AveragePerformanceofChapterPercent_Text.getText().trim();
		    System.out.println(avechapper);
		    Thread.sleep(2000);
	        Assert.assertTrue(LessonwisePerformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		   if(LessonPlanName_LK.isDisplayed()){
	        	fn_Click(LessonPlanName_LK);
	    	    Thread.sleep(2000);
	    	    Assert.assertTrue(AverageperformanceofLessonPlan_Text.getText().trim().equals("Average performance of a lesson plan"), "Average performance of Lesson Plan text not correct: Fail");
	    	    Thread.sleep(2000);
	    	    String avelessplanpper=AverageperformanceofLessonPlanPercent_Text.getText().trim();
	    	    System.out.println(avelessplanpper);
	    	    Thread.sleep(2000);
	         if(ActivityName_LK.isDisplayed()){
	    	fn_Click(ActivityName_LK);
		    Thread.sleep(2000);
	        String avelearning=AvePerformofLearningResourcePercent_Text.getText().trim();
		    System.out.println(avelearning);
		    Thread.sleep(2000);
		    fn_Click(ViewStudent1Details_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(OverallPerformanceLearning_Text.getText().trim().equals("Overall performance"), "Overall Performance text not correct: Fail");
		    Thread.sleep(2000);
		    String avescore=AveScorePercent_Text.getText().trim();
		    System.out.println(avescore);
		    Thread.sleep(2000);
		    Assert.assertTrue(SubjectwisePerformanceLearning_Text.getText().trim().equals("Subjectwise Performance"), "Subjectwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		    fn_Click(ViewDetailsSubject_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(Lessonwiseperformance_Text.getText().trim().equals("Lessonwise performance"), "Lessonwise Performance text not correct: Fail");
		    Thread.sleep(2000);
		    fn_Click(ExpandAllSubject_LK);
		    Thread.sleep(3000);
		    Assert.assertTrue(Activitywiseperformance_Text.getText().trim().equals("Activitywise performance"), "Activitywise Performance text not correct: Fail");
		    Thread.sleep(2000);
		    readWriteExcel(95,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewActivityWisePerformanceOfTheStudentofParticularlesson","Pass");
		      }
		     else{
		    readWriteExcel(95,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewActivityWisePerformanceOfTheStudentofParticularlesson","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		     }
		     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		

}
