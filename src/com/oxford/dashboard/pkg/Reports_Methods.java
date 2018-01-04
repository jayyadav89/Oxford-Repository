package com.oxford.dashboard.pkg;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
	    Assert.assertTrue(OverallPerformanceLearning_Text.getText().trim().equals("Overall  performance"), "Overall Performance text not correct: Fail");
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
	
	
	
	
	
	
	
	
	
	
	
	
	

}
