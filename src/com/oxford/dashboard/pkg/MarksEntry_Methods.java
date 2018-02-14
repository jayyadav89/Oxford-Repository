package com.oxford.dashboard.pkg;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.oxford.generic.pkg.Generic_Methods;

    public class MarksEntry_Methods extends Generic_Methods{
	
		@FindBy(xpath = "//li[@id='lnkMarksEntry']/div[2]")
	    public WebElement MarksEntry_Lk;
		
		@FindBy(id = "lblPageHeading")
		public WebElement MarksEntryHeader_Label;
	
		@FindBy(id = "CPH_ddlYear")
		public WebElement AcademicYear_DD;
	
		@FindBy(id = "CPH_ddlClass")
		public WebElement Class_DD;
		
		@FindBy(id = "CPH_ddlSection")
		public WebElement Section_DD;
		
		@FindBy(id = "CPH_ddlTermTests")
		public WebElement TermTests_DD;
		
		@FindBy(id = "CPH_ddlSubject")
		public WebElement Subject_DD;
		
		@FindBy(id = "CPH_txtMaxmarks")
		public WebElement Maxmarks_TB;
		
		@FindBy(id = "CPH_rptrlatest_txtObtMarks_0")
		public WebElement MarksScored1_TB;
		
		@FindBy(id = "CPH_rptrlatest_repRO_0_ddlGradeRubrics_1")
		public WebElement Readingskill1_DD;
		
		@FindBy(id = "CPH_rptrlatest_btnstudentsubmit_0")
		public WebElement Save1_BT;
		
		@FindBy(id= "popup_ok")
		public WebElement Ok_BT;
		
		@FindBy(id= "popup_message")
		public WebElement Popup_TX;
		
		
		
		
		public void fn_VisibilityofMarksEntryLink() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(MarksEntry_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    Assert.assertTrue(MarksEntry_Lk.getText().trim().equals("Marks Entry"), "Marks Entry link not present: Fail");
	 	    Thread.sleep(2000);
	 	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofMarksEntryLink","Pass");
	 //	    readWriteExcel(198,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofMarksEntryLink","Pass");
		    }
		     else{
		    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_VisibilityofMarksEntryLink","Fail");
	//	    readWriteExcel(198,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilityofMarksEntryLink","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		
		
		public void fn_GradeStudents() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(MarksEntry_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MarksEntry_Lk);
	 	    Thread.sleep(3000);
	 	    Assert.assertTrue(MarksEntryHeader_Label.getText().trim().equals("Marks Entry"), "Marks Entry label not present: Fail");
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(AcademicYear_DD,2);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Class_DD,1);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Section_DD,1);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(TermTests_DD,1);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Subject_DD,1);
	 	    Thread.sleep(2000);
	 	    Maxmarks_TB.clear();
	 	    fn_Input(Maxmarks_TB,"100");
	 	    MarksScored1_TB.clear();
	 	    fn_Input(MarksScored1_TB,"50");
	 	    fn_SelectbyIndex(Readingskill1_DD,1);
	 	    Thread.sleep(2000);
	 	    fn_Click(Save1_BT);
	 	    Thread.sleep(2000);
	 	    Assert.assertTrue(Popup_TX.getText().trim().equals("Marks entered successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
			Thread.sleep(2000);
			readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_GradeStudents","Pass");
 //           readWriteExcel(199,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_GradeStudents","Pass");
		    }
		     else{
		    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_GradeStudents","Fail");
//		    readWriteExcel(199,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_GradeStudents","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
		
		
		
	
	
	
	
       }
