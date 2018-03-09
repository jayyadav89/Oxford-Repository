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
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\Login.html");
	}
	
	
	@BeforeClass(alwaysRun= true)
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
	
	
	@Test(enabled=true)
	public void fn_SignInLandingPage() throws IOException, InterruptedException{
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
	
	
	
	@Test(priority=1,enabled=true)
     public void fn_ValidLogin() throws InterruptedException, IOException{
		logger=report.startTest("fn_ValidLogin");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_Login();
		logger.log(LogStatus.INFO, "Login is done successfully");
		
//		readWriteExcel(6,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidLogin","Pass");
//		Thread.sleep(5000);
//		login.fn_LogOut();
		}
		catch(FileNotFoundException e){
//	    readWriteExcel(6,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidLogin","Fail");
//			logger.log(LogStatus.INFO, "Login failed");
		//	login.fn_LogOut();
	         Thread.sleep(5000);
		}
	}
	
	
	
	@Test(priority=2,enabled=true)
	public void fn_InvalidLogin() throws InterruptedException, IOException{
		logger=report.startTest("fn_InValidLogin");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_InValidLogin();
		logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
		login.fn_Login();
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Alert is not coming" + ": Failed");
			}
	}
	
	
    @Test(priority=3,enabled=true)
	public void fn_CaseSensitivitylogin() throws InterruptedException, IOException{
		logger=report.startTest("fn_CaseSensitivitylogin");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_CaseSensitivitylogin();
		logger.log(LogStatus.INFO, "Credentials are case sensitive" +  ": Passed");
		login.fn_Login();
		}
		catch(FileNotFoundException e){
	       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
			}
	}
	
	
    
    @Test(priority=4,enabled=true)
	public void fn_InValidLoginNameAndValidPass() throws InterruptedException, IOException{
		logger=report.startTest("fn_InValidLoginNameAndValidPass");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_InValidLoginNameAndValidPass();
		logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
		login.fn_Login();
		}
		catch(FileNotFoundException e){
	//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
			}
	}
    
    
    
    @Test(priority=5,enabled=true)
	public void fn_ValidLoginNameAndInvalidPass() throws InterruptedException, IOException{
		logger=report.startTest("fn_ValidLoginNameAndInvalidPass");
		try{
		fn_LandingHome();
		logger.log(LogStatus.INFO, "Application is up and running");
        Thread.sleep(3000);
        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
		login.fn_ValidLoginNameAndInvalidPass();
		logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
		login.fn_Login();
		}
		catch(FileNotFoundException e){
	//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
			}
	}
    
	
    
    @Test(priority=6,enabled=false)
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
    
    
    
	 @Test(priority=7,enabled=false)
		public void fn_EditProfile() throws InterruptedException, IOException{
			logger=report.startTest("fn_EditProfile");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_EditProfile();
			logger.log(LogStatus.INFO, "Profile edited successfully" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
	
	
	
	
	 @Test(priority=8,enabled=true)
		public void fn_Validation() throws InterruptedException, IOException{
			logger=report.startTest("fn_Validation");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_Validation();
//			logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
	
	
    
		@Test(priority=9,enabled=true)
		public void fn_InvalidEmail() throws InterruptedException, IOException{
			logger=report.startTest("fn_InvalidEmail");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_InvalidEmail();
//			logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=10,enabled=true)
		public void fn_InvalidPhone() throws InterruptedException, IOException{
			logger=report.startTest("fn_InvalidPhone");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_InvalidPhone();
//			logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}	
		
		
	
		@Test(priority=11,enabled=true)
		public void fn_InvalidSecurityAns() throws InterruptedException, IOException{
			logger=report.startTest("fn_InvalidSecurityAns");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_InvalidSecurityAns();
//			logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=12,enabled=true)
		public void fn_InvalidSecurityDOB() throws InterruptedException, IOException{
			logger=report.startTest("fn_InvalidSecurityDOB");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_InvalidSecurityDOB();
//			logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		
		@Test(priority=13,enabled=false)
		public void fn_RemoveImg() throws InterruptedException, IOException{
			logger=report.startTest("fn_RemoveImg");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_RemoveImg();
			logger.log(LogStatus.INFO, "Image is removed" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=14,enabled=true)
		public void fn_CancelProfilePage() throws InterruptedException, IOException{
			logger=report.startTest("fn_CancelProfilePage");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_CancelProfilePage();
			logger.log(LogStatus.INFO, "Profile page cancelled" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		
		@Test(priority=15,enabled=false)
		public void fn_ChangePassword() throws InterruptedException, IOException{
			logger=report.startTest("fn_ChangePassword");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_ChangePassword();
			logger.log(LogStatus.INFO, "Password changed successfully" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=16,enabled=false)
		public void fn_ChangeCurrentPassword() throws InterruptedException, IOException{
			logger=report.startTest("fn_ChangeCurrentPassword");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_ChangeCurrentPassword();
			logger.log(LogStatus.INFO, "Current Password changed successfully" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=17, enabled=true)
		public void fn_ValidationPassword() throws InterruptedException, IOException{
			logger=report.startTest("fn_ValidationPassword");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_ValidationPassword();
			logger.log(LogStatus.INFO, "Validations on mandatory fields are coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=18,enabled=true)
		public void fn_CancelChangePassword() throws InterruptedException, IOException{
			logger=report.startTest("fn_CancelChangePassword");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_CancelChangePassword();
			logger.log(LogStatus.INFO, "Change password page cancelled" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=19,enabled=false)
		public void fn_ForgotPassword() throws InterruptedException, IOException{
			logger=report.startTest("fn_ForgotPassword");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_ForgotPassword();
			logger.log(LogStatus.INFO, "Password reset successfully" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		}
		
		
		
		@Test(priority=20,enabled=true)
		public void fn_ValidationForgotPassFields() throws InterruptedException, IOException{
			logger=report.startTest("fn_ValidationForgotPassFields");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_ValidationForgotPassFields();
			logger.log(LogStatus.INFO, "Validations for mandatory fields are coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		     }
		
		
		
		@Test(priority=21,enabled=true)
		public void fn_InvalidValidationForgotPassFields() throws InterruptedException, IOException{
			logger=report.startTest("fn_InvalidValidationForgotPassFields");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_InvalidValidationForgotPassFields();
			logger.log(LogStatus.INFO, "Validations for invalid entry coming" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
				}
		      }	
		
		
		@Test(priority=22,enabled=true)
		public void fn_SignOut() throws InterruptedException, IOException{
			logger=report.startTest("fn_SignOut");
			try{
			fn_LandingHome();
			logger.log(LogStatus.INFO, "Application is up and running");
	        Thread.sleep(3000);
	        Login_Method login=PageFactory.initElements(driver, Login_Method.class);
			login.fn_SignOut();
			logger.log(LogStatus.INFO, "Sign Out successfully" +  ": Passed");
			}
			catch(FileNotFoundException e){
		//       logger.log(LogStatus.INFO, "Credentials are not case sensitive" +  ": Failed");
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
	
	
	
	
	
	
	
	
	
	

	
//	@Test(priority=1, groups="Regression", enabled=false)
//    public void fn_ValidateOrderbyAddToCart() throws InterruptedException, IOException {
//   	 Login_Method pizzaorder=PageFactory.initElements(driver, Login_Method.class);
//	//   pizzaorder.fn_OrderbyAddToCart();
//	
//	}

	
	   }

	
	
	
  
