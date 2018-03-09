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

public class Notificatios_Script extends Generic_Methods{

	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\Notifications.html");
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
	public void fn_ViewNotificationDetails() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewNotificationDetails");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_ViewNotificationDetails();
			logger.log(LogStatus.INFO, "View notification details method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View notification details method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=2,enabled=true)
	public void fn_ViewNotificationBetweenSpecifiedDates() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewNotificationBetweenSpecifiedDates");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_ViewNotificationBetweenSpecifiedDates();
			logger.log(LogStatus.INFO, "View notifications between specified dates method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View notifications between specified dates method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=3,enabled=true)
	public void fn_SelectDateGreaterThanCurrentDate() throws IOException, InterruptedException{
		logger=report.startTest("fn_SelectDateGreaterThanCurrentDate");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_SelectDateGreaterThanCurrentDate();
			logger.log(LogStatus.INFO, "Select date greater than current date method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Select date greater than current date method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=4,enabled=true)
	public void fn_CreateNotification() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreateNotification");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_CreateNotification();
			logger.log(LogStatus.INFO, "Create Notification method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Create Notification method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=5,enabled=true)
	public void fn_ViewUserNotification() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewUserNotification");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_ViewUserNotification();
			logger.log(LogStatus.INFO, "View user notification method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View user notification method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=6,enabled=true)
	public void fn_DeleteNotification() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteNotification");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_DeleteNotification();
			logger.log(LogStatus.INFO, "Delete Notification method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete Notification method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=7,enabled=true)
	public void fn_ClearFilterResult() throws IOException, InterruptedException{
		logger=report.startTest("fn_ClearFilterResult");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_ClearFilterResult();
			logger.log(LogStatus.INFO, "Clear filter result method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Clear filter result method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=8,enabled=true)
	public void fn_ViewSystemNotification() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewSystemNotification");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_ViewSystemNotification();
			logger.log(LogStatus.INFO, "View system notification method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "View system notification method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=9,enabled=true)
	public void fn_ValidationMandatoryfields() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationMandatoryfields");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_ValidationMandatoryfields();
	        logger.log(LogStatus.INFO, "Validation for mandatory fields method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation for mandatory fields method not executed successfully: Fail");
			}
	     }
	
	
	
	@Test(priority=10,enabled=true)
	public void fn_SelectUserCategory() throws IOException, InterruptedException{
		logger=report.startTest("fn_SelectUserCategory");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_SelectUserCategory();
	//		UpdateCellColor(56,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage");
			logger.log(LogStatus.INFO, "Select user category method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Select user category method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=11,enabled=true)
	public void fn_SearchUsername() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchUsername");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_SearchUsername();
	        logger.log(LogStatus.INFO, "Search username method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Search username method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=12,enabled=true)
	public void fn_SelectAllUsers() throws IOException, InterruptedException{
		logger=report.startTest("fn_SelectAllUsers");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_SelectAllUsers();
	        logger.log(LogStatus.INFO, "Select all users method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Select all users method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=13,enabled=true)
	public void fn_SortingUsers() throws IOException, InterruptedException{
		logger=report.startTest("fn_SortingUsers");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_SortingUsers();
	        logger.log(LogStatus.INFO, "Sorting users method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Sorting users method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=14,enabled=true)
	public void fn_Pagination() throws IOException, InterruptedException{
		logger=report.startTest("fn_Pagination");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_Pagination();
	        logger.log(LogStatus.INFO, "User pagination method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "User pagination method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=15,enabled=true)
	public void fn_CloseUsernameWindow() throws IOException, InterruptedException{
		logger=report.startTest("fn_CloseUsernameWindow");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_CloseUsernameWindow();
	        logger.log(LogStatus.INFO, "Close user window method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Close user window method not executed successfully: Fail");
			}
	     }
	
	
	@Test(priority=16,enabled=true)
	public void fn_CancelCreatePage() throws IOException, InterruptedException{
		logger=report.startTest("fn_CancelCreatePage");
		try{
			Notificatios_Methods notifications=PageFactory.initElements(driver, Notificatios_Methods.class);
			notifications.fn_CancelCreatePage();
	        logger.log(LogStatus.INFO, "Close user window method executed successfully");
		   }
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Close user window method not executed successfully: Fail");
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
