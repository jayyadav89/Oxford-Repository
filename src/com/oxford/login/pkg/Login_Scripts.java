package com.oxford.login.pkg;

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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.oxford.generic.pkg.Generic_Methods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Login_Scripts extends Generic_Methods {
	
	ExtentReports report;
	ExtentTest logger;
	
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Login\\automation.html");
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
         
   //      report=new ExtentReports("C:\\Login\\automation.html");
    //     fn_LoginApp();
	//	launchBrowser("CH");
         
//         
         }
	
	
//	@Test()
	public void fn_SignInLandingPage() throws IOException{
		logger=report.startTest("fn_SignInLandingPage");
		try{
			fn_LandingHome();
			Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_SignInPage();
			logger.log(LogStatus.INFO, "Sign In text is correct");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Sign In text is incorrect");
			}
	}
	
	
	
//	@Test(priority=1)
     public void fn_ValidLogin() throws InterruptedException, IOException{
		logger=report.startTest("fn_ValidLogin");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_Login();
		logger.log(LogStatus.INFO, "Login is done successfully");
		
		readWriteExcel(6,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidLogin","Pass");
		Thread.sleep(5000);
		login.fn_LogOut();
		}
		catch(FileNotFoundException e){
	    readWriteExcel(6,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidLogin","Fail");
			logger.log(LogStatus.INFO, "Login failed");
		//	login.fn_LogOut();
	         Thread.sleep(5000);
		}
	}
	
	
	
//	@Test(priority=2)
	public void fn_InvalidLogin() throws InterruptedException, IOException{
		logger=report.startTest("fn_InValidLogin");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_InValidLogin();
		logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Alert is not coming" + ": Failed");
			}
	}
	
	
 //   @Test(priority=3)
	public void fn_CaseSensitivitylogin() throws InterruptedException, IOException{
		logger=report.startTest("fn_CaseSensitivitylogin");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_CaseSensitivitylogin();
		logger.log(LogStatus.INFO, "Credentials are case sensitive" +  ": Passed");
		}
		catch(FileNotFoundException e){
	       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
			}
	}
	
	
    
 //   @Test(priority=4)
	public void fn_InValidLoginNameAndValidPass() throws InterruptedException, IOException{
		logger=report.startTest("fn_InValidLoginNameAndValidPass");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_InValidLoginNameAndValidPass();
		logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
		}
		catch(FileNotFoundException e){
	//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
			}
	}
    
    
    
 //   @Test(priority=5)
	public void fn_ValidLoginNameAndInvalidPass() throws InterruptedException, IOException{
		logger=report.startTest("fn_ValidLoginNameAndInvalidPass");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_ValidLoginNameAndInvalidPass();
		logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
		}
		catch(FileNotFoundException e){
	//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
			}
	}
    
	
    
  //  @Test(priority=6)
	public void fn_ProfileDetails() throws InterruptedException, IOException{
		logger=report.startTest("fn_ProfileDetails");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_ProfileDetails();
//		logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
		}
		catch(FileNotFoundException e){
	//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
			}
	}
    
    
    
	 @Test(priority=7)
		public void fn_EditProfile() throws InterruptedException, IOException{
			logger=report.startTest("fn_EditProfile");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_EditProfile();
//			logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
	
	
	
	
	
	
	
    
    
	
	
	@AfterMethod
	public void TearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:/Oxford Workspace/Screenshots/screenshot" + result.getName().toString().trim()+".png"));
		}
		
		report.endTest(logger);
		report.flush();
		
//		driver.get("C:\\Login\\automation.html");
	}
	
	
	
	
	
	
	
	
	
	
	
	//	@AfterMethod
//	public void HomePage_Delivery() throws InterruptedException{
//		Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
//		pizzaorder.fn_ClickLocationTab();
//	}

	
//	@Test(priority=1, groups="Regression", enabled=false)
//    public void fn_ValidateOrderbyAddToCart() throws InterruptedException, IOException {
//   	 Login_Method pizzaorder=PageFactory.initElements(driver, Login_Method.class);
//	//   pizzaorder.fn_OrderbyAddToCart();
//	
//	}

	
	   }

	
	
	
  
