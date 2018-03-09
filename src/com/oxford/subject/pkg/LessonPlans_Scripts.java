package com.oxford.subject.pkg;

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

import com.oxford.dashboard.pkg.Reports_Methods;
import com.oxford.generic.pkg.Generic_Methods;
import com.oxford.login.pkg.Login_Method;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LessonPlans_Scripts extends Generic_Methods{

	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\LessonPlan.html");
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
	public void fn_ViewSubjectsandCalendarofClass() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewSubjectsandCalendarofClass");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewSubjectsandCalendarofClass();
			logger.log(LogStatus.INFO, "View Subjects and Calendar of Class method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Subjects and Calendar of Class method not executed successfully: Fail");
			}
	   }
	
	
	
	@Test(priority=2,enabled=true)
	public void fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewRespectiveChaptersAndLessonPlansLearningResourcesQuesBankAndTest();
			logger.log(LogStatus.INFO, "View Respective Chapters And Lesson Plans Learning Resources QuesBank And Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Respective Chapters And Lesson Plans Learning Resources QuesBank And Test method not executed successfully: Fail");
			}
	   }
	
	
	@Test(priority=3,enabled=true)
	public void fn_VisibilityofText() throws IOException, InterruptedException{
		logger=report.startTest("fn_VisibilityofText");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_VisibilityofText();
			logger.log(LogStatus.INFO, "Visibility of Lesson Plans Text method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Visibility of Lesson Plans Text method not executed successfully: Fail");
			}
	   }
	
	
	
	@Test(priority=4,enabled=true)
	public void fn_ViewAllLessons() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllLessons");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewAllLessons();
			logger.log(LogStatus.INFO, "View All Lessons method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All Lessons method not executed successfully: Fail");
			}
	   }
	
	//usage link not enabled
//	@Test(priority=5,enabled=true)
	public void fn_ViewUsageListofLesson() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewUsageListofLesson");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewUsageListofLesson();
			logger.log(LogStatus.INFO, "View Usage List of Lesson method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Usage List of Lesson method not executed successfully: Fail");
			}
	   }
	
	
	
	//usage link not enabled
//	@Test(priority=6,enabled=true)
	public void fn_ViewTheChapterPlanDetails() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewTheChapterPlanDetails");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewTheChapterPlanDetails();
			logger.log(LogStatus.INFO, "View the Chapter Plan Details method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View the Chapter Plan Details method not executed successfully: Fail");
			}
	   }
	
	
	
	//usage link not enabled
//	@Test(priority=7,enabled=true)
	public void fn_PrintChapterPlanDetails() throws IOException, InterruptedException{
		logger=report.startTest("fn_PrintChapterPlanDetails");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_PrintChapterPlanDetails();
			logger.log(LogStatus.INFO, "Print Chapter Plan Details method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Print Chapter Plan Details method not executed successfully: Fail");
			}
	   }
	
	
	
	@Test(priority=8,enabled=true)
	public void fn_PreviewLesson() throws IOException, InterruptedException{
		logger=report.startTest("fn_PreviewLesson");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_PreviewLesson();
			logger.log(LogStatus.INFO, "Preview Lesson method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Preview Lesson method not executed successfully: Fail");
			}
	   }
	
	
	
	@Test(priority=9,enabled=true)
	public void fn_ViewAllAssetsAssociatedwithLearningresource() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllAssetsAssociatedwithLearningresource");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewAllAssetsAssociatedwithLearningresource();
			logger.log(LogStatus.INFO, "View All Assets Associated with Learning resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All Assets Associated with Learning resource method not executed successfully: Fail");
			}
	   }
	
	
	
	@Test(priority=10,enabled=true)
	public void fn_ViewallTeachingresources() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewallTeachingresources");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewallTeachingresources();
			logger.log(LogStatus.INFO, "View all Teaching resources method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View all Teaching resources method not executed successfully: Fail");
			}
	   }
	
	
	@Test(priority=11,enabled=true)
	public void fn_BookmarktheResource() throws IOException, InterruptedException{
		logger=report.startTest("fn_BookmarktheResource");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_BookmarktheResource();
			logger.log(LogStatus.INFO, "Bookmark the resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Bookmark the resource method not executed successfully: Fail");
			}
	   }
	
	
	@Test(priority=12,enabled=true)
	public void fn_ViewLessonPlan() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewLessonPlan");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewLessonPlan();
			logger.log(LogStatus.INFO, "View Lesson Plan method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Lesson Plan method not executed successfully: Fail");
			}
	      }
	
	
	@Test(priority=13,enabled=true)
	public void fn_ViewRecommendedLesson() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewRecommendedLesson");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewRecommendedLesson();
			logger.log(LogStatus.INFO, "View Recommended Lessons method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Recommended Lessons method not executed successfully: Fail");
			}
	      }
	
	
	@Test(priority=14,enabled=true)
	public void fn_ViewMyLessons() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewMyLessons");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_ViewMyLessons();
			logger.log(LogStatus.INFO, "View My Lessons method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View My Lessons method not executed successfully: Fail");
			}
	      }
	
	
	@Test(priority=15,enabled=true)
	public void fn_PlanLessons() throws IOException, InterruptedException{
		logger=report.startTest("fn_PlanLessons");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_PlanLessons();
			logger.log(LogStatus.INFO, "Plan Lessons method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Plan Lessons method not executed successfully: Fail");
			}
	      }
	
	
	@Test(priority=16,enabled=true)
	public void fn_AddLessonPlan() throws IOException, InterruptedException{
		logger=report.startTest("fn_AddLessonPlan");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_AddLessonPlan();
			logger.log(LogStatus.INFO, "Add Lesson Plan method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Add Lesson Plan method not executed successfully: Fail");
			}
	      }
	
	
	@Test(priority=17,enabled=true)
	public void fn_DeleteMyLessons() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteMyLessons");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_DeleteMyLessons();
			logger.log(LogStatus.INFO, "Delete My Lessons method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete My Lessons method not executed successfully: Fail");
			}
	      }
	
	@Test(priority=18,enabled=true)
	public void fn_AssignLessonToStudents() throws IOException, InterruptedException{
		logger=report.startTest("fn_AssignLessonToStudents");
		try{
			LessonPlans_Methods lessonplans=PageFactory.initElements(driver, LessonPlans_Methods.class);
			lessonplans.fn_AssignLessonToStudents();
			logger.log(LogStatus.INFO, "Assign Lesson To Students method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Assign Lesson To Students method not executed successfully: Fail");
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
