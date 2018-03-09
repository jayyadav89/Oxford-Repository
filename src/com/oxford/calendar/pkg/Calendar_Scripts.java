package com.oxford.calendar.pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.oxford.generic.pkg.Generic_Methods;
import com.oxford.login.pkg.Login_Method;
import com.oxford.subject.pkg.Test_Methods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Calendar_Scripts extends Generic_Methods{
    ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\Calendar.html");
	}
	
	@BeforeClass(alwaysRun = true)
	@Parameters("browser")
//	@Test()
	public void setup(String browser) throws IOException, InterruptedException {
       //Check if parameter passed from TestNG is 'firefox'
         if(browser.equalsIgnoreCase("Firefox")){
        	 driver = new FirefoxDriver();
        }
	       else if(browser.equalsIgnoreCase("chrome")){
			  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
         }
           else if(browser.equalsIgnoreCase("IE")){
 			  System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
 			  driver=new InternetExplorerDriver();
         }
	    }
	
	@BeforeMethod(alwaysRun= true)
	public void Login() throws IOException, InterruptedException{
		fn_LandingHome();
		Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_Login();

	}
	
	@Test(priority=1,enabled=true)
	public void fn_VisibilityofCalendarText() throws IOException, InterruptedException{
		logger=report.startTest("fn_VisibilityofCalendarText");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_VisibilityofCalendarText();
			logger.log(LogStatus.INFO, "Visibility of Calendar Text method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Visibility of Calendar Text method not executed successfully: Fail");
			}
	       }

	
	@Test(priority=2,enabled=true)
	public void fn_AddAllDayEvent() throws IOException, InterruptedException{
		logger=report.startTest("fn_AddAllDayEvent");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_AddAllDayEvent();
			logger.log(LogStatus.INFO, "Add All Day Event method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Add All Day Event method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=3,enabled=true)
	public void fn_AddSpecificHourEvent() throws IOException, InterruptedException{
		logger=report.startTest("fn_AddSpecificHourEvent");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_AddSpecificHourEvent();
			logger.log(LogStatus.INFO, "Add Specific Hour Event method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Add Specific Hour Event method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=4,enabled=true)
	public void fn_ValidationsforMandatoryfields() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationsforMandatoryfields");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ValidationsforMandatoryfields();
			logger.log(LogStatus.INFO, "Validations for Mandatory fields method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validations for Mandatory fields method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=5,enabled=true)
	public void fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ValidationifFromTimeGreaterthanCurrntandTotimeLessthanCurrnt();
			logger.log(LogStatus.INFO, "Validation if From Time Greater than Currnt and To time Less than Currnt method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation if From Time Greater than Currnt and To time Less than Currnt method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=6,enabled=true)
	public void fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ValidationifFromTimeLessthanCurrntandTotimeGreaterthanCurrnt();
			logger.log(LogStatus.INFO, "Validation if From Time Less than Currnt and To time Greater than Currnt method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation if From Time Less than Currnt and To time Greater than Currnt method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=7,enabled=true)
	public void fn_ValidationifToDateLessthanFromDate() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationifToDateLessthanFromDate");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ValidationifToDateLessthanFromDate();
			logger.log(LogStatus.INFO, "Validation if To Date Less than From Date method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation if To Date Less than From Date method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=8,enabled=true)
	public void fn_CancelAddEventPopup() throws IOException, InterruptedException{
		logger=report.startTest("fn_CancelAddEventPopup");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_CancelAddEventPopup();
			logger.log(LogStatus.INFO, "Cancel Add Event Popup method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Cancel Add Event Popup method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=9,enabled=true)
	public void fn_VisibilityofManageAssignments() throws IOException, InterruptedException{
		logger=report.startTest("fn_VisibilityofManageAssignments");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_VisibilityofManageAssignments();
			logger.log(LogStatus.INFO, "Visibility of Manage Assignments method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Visibility of Manage Assignments method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=10,enabled=true)
	public void fn_ViewAllLessonPlansbyTeacher() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllLessonPlansbyTeacher");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewAllLessonPlansbyTeacher();
			logger.log(LogStatus.INFO, "View All Lesson Plans by Teacher method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All Lesson Plans by Teacher method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=11,enabled=true)
	public void fn_ViewAllActivitiesforSpecifieddates() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllActivitiesforSpecifieddates");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewAllActivitiesforSpecifieddates();
			logger.log(LogStatus.INFO, "View All Activities for Specified dates method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All Activities for Specified dates method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=12,enabled=true)
	public void fn_ViewAllLearningMaterialsforSpecifieddates() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllLearningMaterialsforSpecifieddates");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewAllLearningMaterialsforSpecifieddates();
			logger.log(LogStatus.INFO, "View All Learning Materials for Specified dates method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All Learning Materials for Specified dates method not executed successfully: Fail");
			}
	       }
	//22/01/18
	@Test(priority=13,enabled=true)
	public void fn_ViewStudentResourceMarkingReport() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewStudentResourceMarkingReport");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewStudentResourceMarkingReport();
			logger.log(LogStatus.INFO, "View Student Resource Marking Report method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Student Resource Marking Report method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=14,enabled=true)
	public void fn_ViewStudentsLearning() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewStudentsLearning");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewStudentsLearning();
			logger.log(LogStatus.INFO, "View Students Learning method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Students Learning method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=15,enabled=true)
	public void fn_ViewTestsforSpecifiedDaterange() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewTestsforSpecifiedDaterange");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewTestsforSpecifiedDaterange();
			logger.log(LogStatus.INFO, "View Tests for Specified Date range method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Tests for Specified Date range method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=16,enabled=true)
	public void fn_ViewStudentSubmissiondetails() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewStudentSubmissiondetails");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewStudentSubmissiondetails();
			logger.log(LogStatus.INFO, "View Student Submission details method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Student Submission details method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=17,enabled=true)
	public void fn_SaveRemarkFeedbackofTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_SaveRemarkFeedbackofTest");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_SaveRemarkFeedbackofTest();
			logger.log(LogStatus.INFO, "Save Remark/Feedback of Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Save Remark/Feedback of Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=18,enabled=true)
	public void fn_ViewTestReport() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewTestReport");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewTestReport();
			logger.log(LogStatus.INFO, "View Test Report method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Test Report method not executed successfully: Fail");
			}
	       }
	
////currently evaluate icon not available	
//	@Test(priority=19,enabled=true)
	public void fn_EvaluateRespectiveTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_EvaluateRespectiveTest");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_EvaluateRespectiveTest();
			logger.log(LogStatus.INFO, "Evaluate Respective Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Evaluate Respective Test method not executed successfully: Fail");
			}
	       }
	
	
////currently evaluate icon not available	
//	@Test(priority=20,enabled=true)
	public void fn_UploadingWorksheet() throws IOException, InterruptedException{
		logger=report.startTest("fn_UploadingWorksheet");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_UploadingWorksheet();
			logger.log(LogStatus.INFO, "Uploading Worksheet method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Uploading Worksheet method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=21,enabled=true)
	public void fn_ViewAssignmentsWithinSpecifiedDaterange() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAssignmentsWithinSpecifiedDaterange");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewAssignmentsWithinSpecifiedDaterange();
			logger.log(LogStatus.INFO, "View Assignments Within Specified Date range method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Assignments Within Specified Date range method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=22,enabled=true)
	public void fn_ViewAssignmentSubmissionDetails() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAssignmentSubmissionDetails");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewAssignmentSubmissionDetails();
			logger.log(LogStatus.INFO, "View Assignment Submission Details method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Assignment Submission Details method not executed successfully: Fail");
			}
	       }
	
/////////currently preview icon is not clickable
//	@Test(priority=23,enabled=true)
	public void fn_ViewAssignmentSubmissionsandResponses() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAssignmentSubmissionsandResponses");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_ViewAssignmentSubmissionsandResponses();
			logger.log(LogStatus.INFO, "View Assignment Submissions and Responses method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Assignment Submissions and Responses method not executed successfully: Fail");
			}
	       }
	
	
/////////currently preview icon is not clickable
//@Test(priority=24,enabled=true)
   public void fn_DownloadAssignmentSubmittedResources() throws IOException, InterruptedException{
		logger=report.startTest("fn_DownloadAssignmentSubmittedResources");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_DownloadAssignmentSubmittedResources();
			logger.log(LogStatus.INFO, "Download Assignment Submitted Resources method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Download Assignment Submitted Resources method not executed successfully: Fail");
			}
	       }
	
	
/////////currently Assignment Marking Report window not getting opened...
//@Test(priority=25,enabled=true)
	public void fn_StudentAssignmentMarkingReport() throws IOException, InterruptedException{
		logger=report.startTest("fn_StudentAssignmentMarkingReport");
		try{
			Calendar_Methods calendar=PageFactory.initElements(driver, Calendar_Methods.class);
			calendar.fn_StudentAssignmentMarkingReport();
			logger.log(LogStatus.INFO, "Student Assignment Marking Report method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Student Assignment Marking Report method not executed successfully: Fail");
			}
	      }
	
   
   
   
   
   
   
   
   
   
	
	
	@AfterMethod(alwaysRun= true)
	public void TearDown(ITestResult result) throws IOException, InterruptedException{
		if(result.getStatus()==ITestResult.FAILURE){
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:/Oxford Workspace/Screenshots/screenshot" + result.getName().toString().trim()+".png"));
		}
		report.endTest(logger);
		report.flush();
		Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_LogOut();
	}
	
	
	
	
	
	
	
	
	
	
	
}
