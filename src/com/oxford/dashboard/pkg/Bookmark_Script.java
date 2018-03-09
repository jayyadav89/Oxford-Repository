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

public class Bookmark_Script extends Generic_Methods{

	
	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\Bookmark.html");
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
	public void fn_ViewBookmarkedresources() throws IOException, InterruptedException{
		logger=report.startTest("fn_ViewBookmarkedresources");
		try{
	//		fn_LandingHome();
			Bookmark_Method bookmark=PageFactory.initElements(driver, Bookmark_Method.class);
			bookmark.fn_ViewBookmarkedresources();
			logger.log(LogStatus.INFO, "Bookmarked resources are present: Passed");
		}
		catch(FileNotFoundException e){
			}
	     }
	
	
	
	
	@Test(priority=2,enabled=true)
	public void fn_SearchBookmark() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchBookmark");
		try{
	//		fn_LandingHome();
			Bookmark_Method bookmark=PageFactory.initElements(driver, Bookmark_Method.class);
			bookmark.fn_SearchBookmark();
			logger.log(LogStatus.INFO, "Searching is working fine: Passed");
		}
		catch(FileNotFoundException e){
			}
	     }
	
	
	
	@Test(priority=3,enabled=true)
	public void fn_PlayBookmarkedOneByOne() throws IOException, InterruptedException{
		logger=report.startTest("fn_PlayBookmarkedOneByOne");
		try{
//			fn_LandingHome();
			Bookmark_Method bookmark=PageFactory.initElements(driver, Bookmark_Method.class);
			bookmark.fn_PlayBookmarkedOneByOne();
			logger.log(LogStatus.INFO, "Bookmarked is played: Passed");
		}
		catch(FileNotFoundException e){
			}
	     }
	
	
	
	@Test(priority=4,enabled=true)
	public void fn_IndividualBookmarked() throws IOException, InterruptedException{
		logger=report.startTest("fn_IndividualBookmarked");
		try{
//			fn_LandingHome();
			Bookmark_Method bookmark=PageFactory.initElements(driver, Bookmark_Method.class);
			bookmark.fn_IndividualBookmarked();
			logger.log(LogStatus.INFO, "Bookmarked is played individual: Passed");
		}
		catch(FileNotFoundException e){
			}
	     }
	
	
	
	@Test(priority=5,enabled=true)
	public void fn_PreviewContent() throws IOException, InterruptedException{
		logger=report.startTest("fn_PreviewContent");
		try{
//			fn_LandingHome();
			Bookmark_Method bookmark=PageFactory.initElements(driver, Bookmark_Method.class);
			bookmark.fn_PreviewContent();
			logger.log(LogStatus.INFO, "Bookmark previewed : Passed");
		}
		catch(FileNotFoundException e){
			}
	     }
	
	
	
	@Test(priority=6,enabled=true)
	public void fn_RemoveBookmarked() throws IOException, InterruptedException{
		logger=report.startTest("fn_RemoveBookmarked");
		try{
//			fn_LandingHome();
			Bookmark_Method bookmark=PageFactory.initElements(driver, Bookmark_Method.class);
			bookmark.fn_RemoveBookmarked();
			logger.log(LogStatus.INFO, "Bookmark removed : Passed");
		}
		catch(FileNotFoundException e){
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
//		driver.get("C:\\Login\\automation.html");
	}
	
	
	
	
	
	
	
	
}
