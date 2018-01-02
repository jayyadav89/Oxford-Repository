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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.oxford.generic.pkg.Generic_Methods;
import com.oxford.login.pkg.Login_Method;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Dashboard_Script extends Generic_Methods {

	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\Dashboard.html");
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
	
	
	
	@Test(priority=23,enabled=false)
	public void fn_HeaderDashboard() throws IOException, InterruptedException{
		logger=report.startTest("fn_HeaderDashboard");
		try{
			fn_LandingHome();
			Dashboard_Method dashboard=PageFactory.initElements(driver, Dashboard_Method.class);
			dashboard.fn_HeaderDashboard();
			logger.log(LogStatus.INFO, "Header links are present: Passed");
		}
		catch(FileNotFoundException e){
			}
	     }
	
	
	
	@Test(priority=24,enabled=true)
	public void fn_FooterDashboard() throws IOException, InterruptedException{
		logger=report.startTest("fn_FooterDashboard");
		try{
			fn_LandingHome();
			Dashboard_Method dashboard=PageFactory.initElements(driver, Dashboard_Method.class);
			dashboard.fn_FooterDashboard();
			logger.log(LogStatus.INFO, "Footer links are present: Passed");
		}
		catch(FileNotFoundException e){
			}
	     }
	
	
	@Test(priority=25,enabled=false)
	public void fn_VisibilitySubjectandCalendar() throws IOException, InterruptedException{
		logger=report.startTest("fn_VisibilitySubjectandCalendar");
		try{
			fn_LandingHome();
			Dashboard_Method dashboard=PageFactory.initElements(driver, Dashboard_Method.class);
			dashboard.fn_VisibilitySubjectandCalendar();
			logger.log(LogStatus.INFO, "Subjects and Calendar are present: Passed");
		}
		catch(FileNotFoundException e){
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
//		driver.get("C:\\Login\\automation.html");
	}
	
	
	
	
	
	
	
	
	
	
	
}
