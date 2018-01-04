package com.oxford.dashboard.pkg;

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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports_Scripts extends Generic_Methods{

	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\Reports.html");
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
	
	
	
	@BeforeMethod
	public void Login() throws IOException, InterruptedException{
		fn_LandingHome();
		Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_Login();

	}
	
	
	
	@Test(priority=1,enabled=false)
	public void fn_NavigateReportPage() throws IOException, InterruptedException{
		logger=report.startTest("fn_NavigateReportPage");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_NavigateReportPage();
			logger.log(LogStatus.INFO, "Navigate to Report Page method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Navigate to Report Page method not executed successfully: Fail");
			}
	   }
	

	
	@Test(priority=2,enabled=false)
	public void fn_LandingSectionwiseAssessmentReports() throws IOException, InterruptedException{
		logger=report.startTest("fn_LandingSectionwiseAssessmentReports");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_LandingSectionwiseAssessmentReports();
			logger.log(LogStatus.INFO, "Landing Sectionwise Assessment Report Page method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Landing Sectionwise Assessment Report Page method not executed successfully: Fail");
			}
	   }
	
	
	
	@Test(priority=3,enabled=false)
	public void fn_ViewSectionwisedetailedreports() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewSectionwisedetailedreports");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewSectionwisedetailedreports();
			logger.log(LogStatus.INFO, "View Sectionwise detailed reports method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Sectionwise detailed reports method not executed successfully: Fail");
			}
	   }
	
	
	
	@Test(priority=4,enabled=false)
	public void fn_ViewAssessmentReports() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAssessmentReports");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewAssessmentReports();
			logger.log(LogStatus.INFO, "View Assessment Reports method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Assessment Reports method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=5,enabled=false)
	public void fn_SubjectwiseDetailedReportofStudent() throws IOException, InterruptedException{
		logger=report.startTest("fn_SubjectwiseDetailedReportofStudent");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_SubjectwiseDetailedReportofStudent();
			logger.log(LogStatus.INFO, "Subjectwise Detailed Report of Student method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Subjectwise Detailed Report of Student method not executed successfully: Fail");
			}
	       }
	
	
	//learning report are not available now
	@Test(priority=6,enabled=false)
	public void fn_LandingSectionwiseLearningReports() throws IOException, InterruptedException{
		logger=report.startTest("fn_LandingSectionwiseLearningReports");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_LandingSectionwiseLearningReports();
			logger.log(LogStatus.INFO, "Landing Sectionwise Learning Reports method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Landing Sectionwise Learning Reports method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=7,enabled=false)
	public void fn_ViewSectionwiseDetailedLearningReports() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewSectionwiseDetailedLearningReports");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewSectionwiseDetailedLearningReports();
			logger.log(LogStatus.INFO, "View Sectionwise Detailed Learning Reports method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Sectionwise Detailed Learning Reports method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=8,enabled=false)
	public void fn_ViewAveragePerformanceofaLessonPlanandActivitywisePerformance() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAveragePerformanceofaLessonPlanandActivitywisePerformance");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewAveragePerformanceofaLessonPlanandActivitywisePerformance();
			logger.log(LogStatus.INFO, "View Average Performance of a Lesson Planand Activitywise Performance method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Average Performance of a Lesson Planand Activitywise Performance method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=9,enabled=false)
	public void fn_ViewSubjectwiseDetailedReportofRespectiveStudent() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewSubjectwiseDetailedReportofRespectiveStudent");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewSubjectwiseDetailedReportofRespectiveStudent();
			logger.log(LogStatus.INFO, "View Subjectwise Detailed Report of Respective Student method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Subjectwise Detailed Report of Respective Student method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=10,enabled=false)
	public void fn_ViewTrackingReport() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewTrackingReport");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewTrackingReport();
			logger.log(LogStatus.INFO, "View Tracking Report method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Tracking Report method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=11,enabled=true)
	public void fn_ViewTrackingLearningReport() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewTrackingLearningReport");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewTrackingLearningReport();
			logger.log(LogStatus.INFO, "View Tracking Learning Report method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Tracking Learning Report method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=12,enabled=true)
	public void fn_ViewAvrgPerformanceofLessonandActivitywisePerformance() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAvrgPerformanceofLessonandActivitywisePerformance");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewAvrgPerformanceofLessonandActivitywisePerformance();
			logger.log(LogStatus.INFO, "View Average Performance of Lesson and Activitywise Performance method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Average Performance of Lesson and Activitywise Performance method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=13,enabled=true)
	public void fn_ViewSubjectwiseDetailedReportofRespectiveStudentLearning() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewSubjectwiseDetailedReportofRespectiveStudentLearning");
		try{
			Reports_Methods reports=PageFactory.initElements(driver, Reports_Methods.class);
			reports.fn_ViewSubjectwiseDetailedReportofRespectiveStudentLearning();
			logger.log(LogStatus.INFO, "View Subjectwise Detailed Report of Respective Student method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Subjectwise Detailed Report of Respective Student method not executed successfully: Fail");
			}
	       }
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
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
