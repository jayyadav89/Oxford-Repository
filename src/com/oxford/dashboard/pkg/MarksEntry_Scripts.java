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

public class MarksEntry_Scripts extends Generic_Methods{

	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\MarksEntry.html");
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
	public void fn_VisibilityofMarksEntryLink() throws IOException, InterruptedException{
		logger=report.startTest("fn_VisibilityofMarksEntryLink");
		try{
			MarksEntry_Methods marksentry=PageFactory.initElements(driver, MarksEntry_Methods.class);
			marksentry.fn_VisibilityofMarksEntryLink();
			logger.log(LogStatus.INFO, "Visibility of Marks Entry Link method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Visibility of Marks Entry Link method not executed successfully: Fail");
			}
	     }

	
	
	@Test(priority=2,enabled=true)
	public void fn_GradeStudents() throws IOException, InterruptedException{
		logger=report.startTest("fn_GradeStudents");
		try{
			MarksEntry_Methods marksentry=PageFactory.initElements(driver, MarksEntry_Methods.class);
			marksentry.fn_GradeStudents();
			logger.log(LogStatus.INFO, "Grade Students method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Grade Students method not executed successfully: Fail");
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
