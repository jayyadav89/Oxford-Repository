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

public class Test_Scripts extends Generic_Methods{

	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\Test.html");
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
	
	
	@Test(priority=1,enabled=true)
	public void fn_ViewAllquestions() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllquestions");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_ViewAllTests();
			logger.log(LogStatus.INFO, "View All tests method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All tests method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=2,enabled=true)
	public void fn_ViewAllRecommendedTests() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllRecommendedTests");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_ViewAllRecommendedTests();
			logger.log(LogStatus.INFO, "View All Recommended Tests method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All Recommended Tests method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=3,enabled=true)
	public void fn_ViewAllMyTests() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewAllMyTests");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_ViewAllMyTests();
			logger.log(LogStatus.INFO, "View All My Tests method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View All My Tests method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=4,enabled=true)
	public void fn_SearchTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_SearchTest();
			logger.log(LogStatus.INFO, "Search Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Search Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=5,enabled=true)
	public void fn_SearchInvalidTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchInvalidTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_SearchInvalidTest();
			logger.log(LogStatus.INFO, "Search Invalid Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Search Invalid Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=6,enabled=true)
	public void fn_PreviewTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_PreviewTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_PreviewTest();
			logger.log(LogStatus.INFO, "Preview Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Preview Test method not executed successfully: Fail");
			}
	       }
	
	@Test(priority=7,enabled=true)
	public void fn_PrintTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_PrintTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_PrintTest();
			logger.log(LogStatus.INFO, "Print Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Print Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=8,enabled=true)
	public void fn_PrintAnswerBooklet() throws IOException, InterruptedException{
		logger=report.startTest("fn_PrintAnswerBooklet");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_PrintAnswerBooklet();
			logger.log(LogStatus.INFO, "Print Answer Booklet method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Print Answer Booklet method not executed successfully: Fail");
			}
	       }
	//17/01/18
	

	@Test(priority=9,enabled=true)
	public void fn_CreateTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreateTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_CreateTest();
			logger.log(LogStatus.INFO, "Create Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Create Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=10,enabled=true)
	public void fn_ValidationforMandatoryfieldinCreateTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationforMandatoryfieldinCreateTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_ValidationforMandatoryfieldinCreateTest();
			logger.log(LogStatus.INFO, "Validation for Mandatory field in Create Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation for Mandatory field in Create Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=11,enabled=true)
	public void fn_AddMoreSections() throws IOException, InterruptedException{
		logger=report.startTest("fn_AddMoreSections");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_AddMoreSections();
			logger.log(LogStatus.INFO, "Add More Sections method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Add More Sections method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=12,enabled=true)
	public void fn_EditSection() throws IOException, InterruptedException{
		logger=report.startTest("fn_EditSection");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_EditSection();
			logger.log(LogStatus.INFO, "Edit Section method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Edit Section method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=13,enabled=true)
	public void fn_DeleteSection() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteSection");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_DeleteSection();
			logger.log(LogStatus.INFO, "Delete Section method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete Section method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=14,enabled=true)
	public void fn_SearchSpecificQuestionWithAdvancedofQuestionBank() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchSpecificQuestionWithAdvancedofQuestionBank");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_SearchSpecificQuestionWithAdvancedofQuestionBank();
			logger.log(LogStatus.INFO, "Search Specific Question With Advanced Question Bank method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Search Specific Question With Advanced Question Bank method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=15,enabled=true)
	public void fn_SearchSpecificQuestionFromLeftofQuestionBank() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchSpecificQuestionFromLeftofQuestionBank");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_SearchSpecificQuestionFromLeftofQuestionBank();
			logger.log(LogStatus.INFO, "Search Specific Question From Left of Question Bank method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Search Specific Question From Left of Question Bank method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=16,enabled=true)
	public void fn_TryoutAQuestionBank() throws IOException, InterruptedException{
		logger=report.startTest("fn_TryoutAQuestionBank");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_TryoutAQuestionBank();
			logger.log(LogStatus.INFO, "Tryout Question Bank method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Tryout Question Bank method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=17,enabled=true)
	public void fn_RemoveSubmittedTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_RemoveSubmittedTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_RemoveSubmittedTest();
			logger.log(LogStatus.INFO, "Remove Submitted Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Remove Submitted Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=18,enabled=true)
	public void fn_DeleteTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_DeleteTest();
			logger.log(LogStatus.INFO, "Delete Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete Test method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=19,enabled=true)
	public void fn_DeleteTestbyNobutton() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteTestbyNobutton");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_DeleteTestbyNobutton();
			logger.log(LogStatus.INFO, "Delete Test by No button method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete Test by No button method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=20,enabled=true)
	public void fn_DeleteRecommendedTests() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteRecommendedTests");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_DeleteRecommendedTests();
			logger.log(LogStatus.INFO, "Delete Recommended Tests method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete Recommended Tests method not executed successfully: Fail");
			}
	       }
//	18/01/18
	@Test(priority=21,enabled=true)
	public void fn_AssignTesttoIndividuals() throws IOException, InterruptedException{
		logger=report.startTest("fn_AssignTesttoIndividuals");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_AssignTesttoIndividuals();
			logger.log(LogStatus.INFO, "Assign Test to Individuals method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Assign Test to Individuals method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=22,enabled=true)
	public void fn_AssignTesttoGroup() throws IOException, InterruptedException{
		logger=report.startTest("fn_AssignTesttoGroup");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_AssignTesttoGroup();
			logger.log(LogStatus.INFO, "Assign Test to Groups method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Assign Test to Groups method not executed successfully: Fail");
			}
	       }
	
	@Test(priority=23,enabled=true)
	public void fn_AssignTestLaterToindividuals() throws IOException, InterruptedException{
		logger=report.startTest("fn_AssignTestLaterToindividuals");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_AssignTestLaterToindividuals();
			logger.log(LogStatus.INFO, "Assign Test Later To individuals method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Assign Test Later To individuals method not executed successfully: Fail");
			}
	       }
	
	@Test(priority=24,enabled=true)
	public void fn_AssignTestLaterToGroup() throws IOException, InterruptedException{
		logger=report.startTest("fn_AssignTestLaterToGroup");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_AssignTestLaterToGroup();
			logger.log(LogStatus.INFO, "Assign Test Later To Groups method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Assign Test Later To Groups method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=25,enabled=true)
	public void fn_ValidationforTimeToAssignTest() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationforTimeToAssignTest");
		try{
			Test_Methods test=PageFactory.initElements(driver, Test_Methods.class);
			test.fn_ValidationforTimeToAssignTest();
			logger.log(LogStatus.INFO, "Validation for Time To Assign Test method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation for Time To Assign Test method not executed successfully: Fail");
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
