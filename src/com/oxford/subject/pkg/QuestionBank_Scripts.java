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

import com.oxford.generic.pkg.Generic_Methods;
import com.oxford.login.pkg.Login_Method;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class QuestionBank_Scripts extends Generic_Methods{

	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\QuestionBank.html");
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
	public void fn_ViewAllquestions() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllquestions");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_ViewAllquestions();
			logger.log(LogStatus.INFO, "View All questions method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All questions method not executed successfully: Fail");
			}
	       }

	
	@Test(priority=2,enabled=true)
	public void fn_ViewRecommendedquestions() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewRecommendedquestions");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_ViewRecommendedquestions();
			logger.log(LogStatus.INFO, "View Recommended questions method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View Recommended questions method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=3,enabled=true)
	public void fn_ViewMyquestions() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewMyquestions");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_ViewMyquestions();
			logger.log(LogStatus.INFO, "View My questions method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View My questions method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=4,enabled=true)
	public void fn_PreviewRespectivequestion() throws IOException, InterruptedException{
		logger=report.startTest("fn_PreviewRespectivequestion");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_PreviewRespectivequestion();
			logger.log(LogStatus.INFO, "Preview Respective question method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Preview Respective question method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=5,enabled=true)
	public void fn_AssessmentGeneration() throws IOException, InterruptedException{
		logger=report.startTest("fn_AssessmentGeneration");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_AssessmentGeneration();
			logger.log(LogStatus.INFO, "Assessment Generation method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Assessment Generation method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=6,enabled=true)
	public void fn_ValidationForMandatoryFieldsonAssessmentwindow() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationForMandatoryFieldsonAssessmentwindow");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_ValidationForMandatoryFieldsonAssessmentwindow();
			logger.log(LogStatus.INFO, "Validation for Mandatory Fields on Assessment window method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation for Mandatory Fields on Assessment window method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=7,enabled=true)
	public void fn_CancelAssessmentwindow() throws IOException, InterruptedException{
		logger=report.startTest("fn_CancelAssessmentwindow");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_CancelAssessmentwindow();
			logger.log(LogStatus.INFO, "Cancel Assessment window method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Cancel Assessment window method not executed successfully: Fail");
			}
	       }
//	16/01/18
	
	@Test(priority=8,enabled=true)
	public void fn_RandomAssessmentGeneration() throws IOException, InterruptedException{
		logger=report.startTest("fn_RandomAssessmentGeneration");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_RandomAssessmentGeneration();
			logger.log(LogStatus.INFO, "Random Assessment Generation method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Random Assessment Generation method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=9,enabled=true)
	public void fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_ValidationsForMandatoryFieldsOnRandomAssessmentGeneration();
			logger.log(LogStatus.INFO, "Validations For Mandatory Fields On Random Assessment Generation method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validations For Mandatory Fields On Random Assessment Generation method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=10,enabled=true)
	public void fn_CancelRandomAssessmentwindow() throws IOException, InterruptedException{
		logger=report.startTest("fn_CancelRandomAssessmentwindow");
		try{
			QuestionBank_Methods questionbank=PageFactory.initElements(driver, QuestionBank_Methods.class);
			questionbank.fn_CancelRandomAssessmentwindow();
			logger.log(LogStatus.INFO, "Cancel Random Assessment window method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Cancel Random Assessment window method not executed successfully: Fail");
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
