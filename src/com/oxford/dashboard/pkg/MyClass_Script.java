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

public class MyClass_Script extends Generic_Methods {

	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\MyClass.html");
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
	public void fn_ViewStudentsDetail() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewStudentsDetail");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_ViewStudentsDetail();
			logger.log(LogStatus.INFO, "Student details are present: Pass");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Student details are not present: Fail");
			}
	     }
	
	
	
	@Test(priority=2,enabled=true)
	public void fn_WlcmLtrToAnAdmission() throws IOException, InterruptedException{
		logger=report.startTest("fn_WlcmLtrToAnAdmission");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_WlcmLtrToAnAdmission();
			logger.log(LogStatus.INFO, "Welcome letter is generated: Pass");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Welcome letter is not generated: Fail");
			}
	     }
	
	
	@Test(priority=3,enabled=false)
	public void fn_WlcmLtrMorethanOneAdmission() throws IOException, InterruptedException{
		logger=report.startTest("fn_WlcmLtrMorethanOneAdmission");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_WlcmLtrMorethanOneAdmission();
			logger.log(LogStatus.INFO, "Welcome letter for more than one admissions is generated: Pass");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Welcome letter for more than one admissions is not generated: Fail");
			}
	     }
	
	
	@Test(priority=4,enabled=false)
	public void fn_TempPassword() throws IOException, InterruptedException{
		logger=report.startTest("fn_TempPassword");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_TempPassword();
			logger.log(LogStatus.INFO, "Temp password is generated: Pass");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Temp password is not generated: Fail");
			}
	     }
	
	
	
	@Test(priority=5,enabled=false)
	public void fn_ViewDetailsofGroup() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewDetailsofGroup");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_ViewDetailsofGroup();
			logger.log(LogStatus.INFO, "Group details are present: Pass");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Group details are not present: Fail");
			}
	     }
	
	
// currently no students are available in select users section...	
	@Test(priority=6,enabled=false)
	public void fn_CreateNewGroup() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreateNewGroup");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_CreateNewGroup();
			logger.log(LogStatus.INFO, "Creat Group method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Creat Group method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=7,enabled=false)
	public void fn_ValidationGrpNameField() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationGrpNameField");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_ValidationGrpNameField();
			logger.log(LogStatus.INFO, "Validation for Group name method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation for Group name method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=8,enabled=false)
	public void fn_CancelCreateGrpPage() throws IOException, InterruptedException{
		logger=report.startTest("fn_CancelCreateGrpPage");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_CancelCreateGrpPage();
			logger.log(LogStatus.INFO, "Cancel create group page method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Cancel create group page method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=9,enabled=false)
	public void fn_EditGroup() throws IOException, InterruptedException{
		logger=report.startTest("fn_EditGroup");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_EditGroup();
			logger.log(LogStatus.INFO, "Edit group method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Edit group method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=10,enabled=false)
	public void fn_CancelEditGrpPage() throws IOException, InterruptedException{
		logger=report.startTest("fn_CancelEditGrpPage");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_CancelEditGrpPage();
			logger.log(LogStatus.INFO, "Cancel edit group page method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Cancel edit group page method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=11,enabled=false)
	public void fn_DeleteGroup() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteGroup");
		try{
	        MyClass_Method myclass=PageFactory.initElements(driver, MyClass_Method.class);
			myclass.fn_DeleteGroup();
			logger.log(LogStatus.INFO, "Delete group method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete group method not executed successfully: Fail");
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
