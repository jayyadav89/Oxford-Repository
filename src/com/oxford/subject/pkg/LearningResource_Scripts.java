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

public class LearningResource_Scripts extends Generic_Methods{

	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void ExtentReportGen(){
	  report=new ExtentReports("D:\\Oxford Workspace\\Automation Result\\LearningResource.html");
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
	public void fn_VisibilityofLearningResourceText() throws IOException, InterruptedException{
		logger=report.startTest("fn_VisibilityofLearningResourceText");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_VisibilityofLearningResourceText();
			logger.log(LogStatus.INFO, "Visibility of Learning Resource Text method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Visibility of Learning Resource Text method not executed successfully: Fail");
			}
	       }

	
	@Test(priority=2,enabled=true)
	public void fn_PreviewLearningResource() throws IOException, InterruptedException{
		logger=report.startTest("fn_PreviewLearningResource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_PreviewLearningResource();
			logger.log(LogStatus.INFO, "Preview Learning Resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Preview Learning Resource method not executed successfully: Fail");
			}
	       }
	
	//need to identify personalized link
	@Test(priority=3,enabled=true)
	public void fn_FilterLearningResources() throws IOException, InterruptedException{
		logger=report.startTest("fn_FilterLearningResources");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_FilterLearningResources();
			logger.log(LogStatus.INFO, "Filter Learning Resources method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Filter Learning Resources method not executed successfully: Fail");
			}
	       }
	//11/01/18
	
	@Test(priority=4,enabled=true)
	public void fn_SearchLearningResource() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchLearningResource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_SearchLearningResource();
			logger.log(LogStatus.INFO, "Search Learning Resources method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Search Learning Resources method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=5,enabled=true)
	public void fn_SearchInvalidLearningResources() throws IOException, InterruptedException{
		logger=report.startTest("fn_SearchInvalidLearningResources");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_SearchInvalidLearningResources();
			logger.log(LogStatus.INFO, "Search Invalid Learning Resources method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Search Invalid Learning Resources method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=6,enabled=true)
	public void fn_CreateLink() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreateLink");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_CreateLink();
			logger.log(LogStatus.INFO, "Create Link method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Create Link method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=7,enabled=true)
	public void fn_CreatelinkWithoutSelectingchapter() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreatelinkWithoutSelectingchapter");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_CreatelinkWithoutSelectingchapter();
			logger.log(LogStatus.INFO, "Create Link Without Selecting chapter method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Create Link Without Selecting chapter method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=8,enabled=true)
	public void fn_ValidationforMandatoryFieldsonAddLinkPopupWindow() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationforMandatoryFieldsonAddLinkPopupWindow");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_ValidationforMandatoryFieldsonAddLinkPopupWindow();
			logger.log(LogStatus.INFO, "Validation for Mandatory Fields on Add Link Popup Window method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation for Mandatory Fields on Add Link Popup Window method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=9,enabled=true)
	public void fn_UploadAnotherresources() throws IOException, InterruptedException{
		logger=report.startTest("fn_UploadAnotherresources");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_UploadAnotherresources();
			logger.log(LogStatus.INFO, "Upload another resources method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Upload another resources method not executed successfully: Fail");
			}
	       }
	
	
	
	@Test(priority=10,enabled=true)
	public void fn_TagmetadataToUploadedSubject() throws IOException, InterruptedException{
		logger=report.startTest("fn_TagmetadataToUploadedSubject");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_TagmetadataToUploadedSubject();
			logger.log(LogStatus.INFO, "Tag metadata To Uploaded Subject method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Tag metadata To Uploaded Subject method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=11,enabled=true)
	public void fn_CreateResource() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreateResource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_CreateResource();
			logger.log(LogStatus.INFO, "Create Resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Create Resource method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=12,enabled=true)
	public void fn_CreateResourceWithoutSelectingchapter() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreateResourceWithoutSelectingchapter");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_CreateResourceWithoutSelectingchapter();
			logger.log(LogStatus.INFO, "Create Resource Without Selecting chapter method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Create Resource Without Selecting chapter method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=13,enabled=true)
	public void fn_ValidationforMandatoryFieldsonAddResourcePopupWindow() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationforMandatoryFieldsonAddResourcePopupWindow");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_ValidationforMandatoryFieldsonAddResourcePopupWindow();
			logger.log(LogStatus.INFO, "Validation for Mandatory Fields on Add Resource Popup Window method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validation for Mandatory Fields on Add Resource Popup Window method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=14,enabled=true)
	public void fn_UploadAnotherLearningResource() throws IOException, InterruptedException{
		logger=report.startTest("fn_UploadAnotherLearningResource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_UploadAnotherLearningResource();
			logger.log(LogStatus.INFO, "Upload Another Learning Resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Upload Another Learning Resource method not executed successfully: Fail");
			}
	       }
	
     //	12/01/18
	@Test(priority=15,enabled=true)
	public void fn_TagmetadataToLearningResource() throws IOException, InterruptedException{
		logger=report.startTest("fn_TagmetadataToLearningResource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_TagmetadataToLearningResource();
			logger.log(LogStatus.INFO, "Tag metadata to Learning Resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Tag metadata to Learning Resource method not executed successfully: Fail");
			}
	       }
	
	//not able to scroll down popup window
//	@Test(priority=16,enabled=true)
	public void fn_CreateAssignment() throws IOException, InterruptedException{
		logger=report.startTest("fn_CreateAssignment");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_CreateAssignment();
			logger.log(LogStatus.INFO, "Create Assignment method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Create Assignment method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=17,enabled=true)
	public void fn_ValidationsForMandatoryFieldsonAssignPopupwindow() throws IOException, InterruptedException{
		logger=report.startTest("fn_ValidationsForMandatoryFieldsonAssignPopupwindow");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_ValidationsForMandatoryFieldsonAssignPopupwindow();
			logger.log(LogStatus.INFO, "Validations For Mandatory Fields on Assign Popup window method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Validations For Mandatory Fields on Assign Popup window method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=18,enabled=true)
	public void fn_DeleteLearningResources() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteLearningResources");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_DeleteLearningResources();
			logger.log(LogStatus.INFO, "Delete Learning Resources method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete Learning Resources method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=19,enabled=true)
	public void fn_DeleteResourcesByClickingOnNoInConfirmation() throws IOException, InterruptedException{
		logger=report.startTest("fn_DeleteResourcesByClickingOnNoInConfirmation");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_DeleteResourcesByClickingOnNoInConfirmation();
			logger.log(LogStatus.INFO, "Delete Resources By Clicking On 'No' In Confirmation method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Delete Resources By Clicking On 'No' In Confirmation method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=20,enabled=true)
	public void fn_PlayContent() throws IOException, InterruptedException{
		logger=report.startTest("fn_PlayContent");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_PlayContent();
			logger.log(LogStatus.INFO, "Play Content method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Play Content method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=21,enabled=true)
	public void fn_SavePlayedresource() throws IOException, InterruptedException{
		logger=report.startTest("fn_SavePlayedresource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_SavePlayedresource();
			logger.log(LogStatus.INFO, "Save Played resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Save Played resource method not executed successfully: Fail");
			}
	       }
   //	15/01/18
	
	@Test(priority=22,enabled=true)
	public void fn_BookmarkLearningresource() throws IOException, InterruptedException{
		logger=report.startTest("fn_BookmarkLearningresource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_BookmarkLearningresource();
			logger.log(LogStatus.INFO, "Bookmark Learning resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Bookmark Learning resource method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=23,enabled=true)
	public void fn_RemoveLearningresource() throws IOException, InterruptedException{
		logger=report.startTest("fn_RemoveLearningresource");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_RemoveLearningresource();
			logger.log(LogStatus.INFO, "Remove Learning resource method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Remove Learning resource method not executed successfully: Fail");
			}
	       }
	
	
	@Test(priority=24,enabled=true)
	public void fn_AddLessontoLessonplayer() throws IOException, InterruptedException{
		logger=report.startTest("fn_AddLessontoLessonplayer");
		try{
			LearningResource_Methods learningresource=PageFactory.initElements(driver, LearningResource_Methods.class);
			learningresource.fn_AddLessontoLessonplayer();
			logger.log(LogStatus.INFO, "Add Lesson to Lesson player method executed successfully");
		}
		catch(FileNotFoundException e){
			logger.log(LogStatus.INFO, "Add Lesson to Lesson player method not executed successfully: Fail");
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
