package com.oxford.login.pkg;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.oxford.generic.pkg.Generic_Methods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login_Method extends Generic_Methods {

	ExtentReports report;
	ExtentTest logger;
	
	@FindBy(xpath = "//input[@id='txtEmail']")
	public WebElement LoginName_TX;
	
	@FindBy(xpath = "//input[@id='txtPWD']")
	public WebElement Password_TX;
	
	//@FindBy(linkText= "Log In")
	@FindBy(xpath = "//a[@id='btnSignIn']")
	public WebElement SignIn_BT;
	
	@FindBy(xpath= "//h1")
	public WebElement SignIn_TX;
	
	@FindBy(id= "popup_message")
	public WebElement AlertMsg_TX;
	
	@FindBy(id= "popup_ok")
	public WebElement AlertOk_BT;
	
	@FindBy(id= "imgProfile")
	public WebElement Profile_Img;
	
	@FindBy(id= "logout")
	public WebElement LogOut_BT;
	
	
	@FindBy(xpath = "//div[@class='user_pro']/div")
	public WebElement Name_Label;
	
	@FindBy(id= "lblLoginName")
	public WebElement LoginName_Text;
	
	@FindBy(xpath = "//div[@id='classteach']/div")
	public WebElement ClassTeach_Label;
	
	@FindBy(xpath = "//div[@id='classes']/div")
	public WebElement Classes_Label;
	
	@FindBy(xpath = "//div[@id='subjects']//div/div")
	public WebElement Subjects_Label;
	
	
	@FindBy(linkText= "Edit profile")
	public WebElement EditProfile_LK;
	
	@FindBy(id= "CPH_txtFirstName")
	public WebElement FirstName_Text;
	
	@FindBy(id= "CPH_txtLastName")
	public WebElement LastName_Text;
	
	@FindBy(id= "CPH_txtEmail")
	public WebElement Email_Text;
	
	@FindBy(id= "CPH_txtPhone")
	public WebElement PhoneMobile_Text;
	
	@FindBy(id= "CPH_txtAddress")
	public WebElement Address_Text;
	
	@FindBy(id= "CPH_ddlSecurityQues")
	public WebElement SecurityQues_DD;
	
	@FindBy(id= "CPH_txtSecurityAns")
	public WebElement SecurityAns_Text;
	
	@FindBy(id= "CPH_fileUploadPhoto")
	public WebElement UploadPhoto_Img;
	
	@FindBy(id= "CPH_lnkbtnUpdate")
	public WebElement Update_BT;
	
	@FindBy(xpath = "//div[@id='popup_content']/div")
	public WebElement PopUp_Text;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	
	
	
	
	public void fn_SignInPage() throws IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  //	  verifyVisibility(SignIn_TX,obj.getProperty("SignInText"));
  	  String actualtext=SignIn_TX.getText();
  	  System.out.println(actualtext);
  	  if(actualtext.equalsIgnoreCase(obj.getProperty("SignInText"))){
  //		logger.log(LogStatus.INFO, "Sign In text is correct");
  		readWriteExcel(5,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SignInLandingPage","Pass");
  	  }
  	else{
  	//	logger.log(LogStatus.INFO, "Sign In text is incorrect");
  		readWriteExcel(5,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SignInLandingPage","Fail");
  	   }
  	}
	
  
  
	public void fn_Login() throws InterruptedException, IOException{
	//	fn_Click(Login_LK);
    	Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    fn_Input(LoginName_TX, obj.getProperty("LoginName"));
  	    fn_Input(Password_TX, obj.getProperty("Password"));
        fn_Click(SignIn_BT);
        Thread.sleep(10000);
         
  	  }
    
	
	
	public void fn_InValidLogin() throws InterruptedException, IOException{
		//	fn_Click(Login_LK);
	    	Properties obj = new Properties();   
	  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
	  	    obj.load(objfile);
	  	    fn_Input(LoginName_TX, obj.getProperty("InvalidName"));
	  	    fn_Input(Password_TX, obj.getProperty("InvalidPassword"));
	        fn_Click(SignIn_BT);
	       String alertmsg =AlertMsg_TX.getText().trim();
	    //   System.out.println(alertmsg);
	       if(alertmsg.equals(obj.getProperty("LoginAlertMessage"))){
	        fn_Click(AlertOk_BT);
	        readWriteExcel(7,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InValidLogin","Pass");
	        
	       }
	       else{
	    	  	//	logger.log(LogStatus.INFO, "Sign In text is incorrect");
	    	  		readWriteExcel(7,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InValidLogin","Fail");
	    	  	   }
	  	  }
	
	
	
	public void fn_CaseSensitivitylogin() throws InterruptedException, IOException{
		   
		//	fn_Click(Login_LK);
	    	Properties obj = new Properties();   
	  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
	  	    obj.load(objfile);
	  	    fn_Input(LoginName_TX, obj.getProperty("CaseSenLoginname"));
	  	    fn_Input(Password_TX, obj.getProperty("CaseSenPassword"));
	        fn_Click(SignIn_BT);
	       String alertmsg =AlertMsg_TX.getText().trim();
	//       System.out.println(alertmsg);
	       if(alertmsg.equals(obj.getProperty("LoginAlertMessage"))){
	    	   Thread.sleep(3000);
	        fn_Click(AlertOk_BT);
	        Thread.sleep(3000);
	        readWriteExcel(8,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CaseSensitivitylogin","Pass");
	//        logger.log(LogStatus.INFO, "Alert is coming" +  ": Passed");
	       }
	       else{
	    	  //		logger.log(LogStatus.INFO, "Alert is not coming" +  ": Failed");
	    	  readWriteExcel(8,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CaseSensitivitylogin","Fail");
	    	  	   }
	  	  }
	
	
	
	
	public void fn_InValidLoginNameAndValidPass() throws InterruptedException, IOException{
		    Properties obj = new Properties();   
	  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
	  	    obj.load(objfile);
	  	    fn_Input(LoginName_TX, obj.getProperty("InvalidLoginName"));
	  	    fn_Input(Password_TX, obj.getProperty("Password"));
	        fn_Click(SignIn_BT);
	        Thread.sleep(2000);
	       String alertmsg =AlertMsg_TX.getText().trim();
	//       System.out.println(alertmsg);
	       if(alertmsg.equals(obj.getProperty("LoginAlertMessage"))){
	    	   Thread.sleep(3000);
	        fn_Click(AlertOk_BT);
	        Thread.sleep(3000);
	        readWriteExcel(9,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InValidLoginNameAndValidPass","Pass");
	      
	       }
	       else{
	    	  readWriteExcel(9,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InValidLoginNameAndValidPass","Fail");
	    	  Thread.sleep(3000);
	    	  fn_Click(AlertOk_BT);  
	       }
	  	  }
	
	
	
	
	public void fn_ValidLoginNameAndInvalidPass() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    fn_Input(LoginName_TX, obj.getProperty("CaseSenLoginname"));
  	    fn_Input(Password_TX, obj.getProperty("InvalidPassword"));
        fn_Click(SignIn_BT);
        Thread.sleep(2000);
       String alertmsg =AlertMsg_TX.getText().trim();
//       System.out.println(alertmsg);
       if(alertmsg.equals(obj.getProperty("LoginAlertMessage"))){
    	   Thread.sleep(3000);
        fn_Click(AlertOk_BT);
        Thread.sleep(3000);
        readWriteExcel(10,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidLoginNameAndInvalidPass","Pass");
      
       }
       else{
    	  readWriteExcel(10,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidLoginNameAndInvalidPass","Fail");
    	  Thread.sleep(3000);
    	  fn_Click(AlertOk_BT);  
       }
  	  }
	
	
	
	public void fn_ProfileDetails() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	     fn_Login();
  	     Thread.sleep(5000);
  	    if(Profile_Img.isDisplayed()){
  	     Thread.sleep(3000);
  	     fn_Click(Profile_Img);
  	     Thread.sleep(3000);
  	     Assert.assertTrue(Name_Label.isDisplayed(), "Name label is not available");
  	     Assert.assertTrue(Name_Label.getText().equals("Name:"), "Name label Does not match:  Fail");
  	     Assert.assertTrue(LoginName_Text.isDisplayed(), "User Name text is not available");
	     Assert.assertTrue(LoginName_Text.getText().trim().equals(obj.getProperty("UserName")), "User Name text Does not match:  Fail");
		 Assert.assertTrue(ClassTeach_Label.isDisplayed(), "Class teacher label is not available");
  	     Assert.assertTrue(ClassTeach_Label.getText().trim().equals("Class teacher:"), "Class teacher label Does not match:  Fail");
		 Assert.assertTrue(Classes_Label.isDisplayed(), "Classes label is not available");
	     Assert.assertTrue(Classes_Label.getText().trim().equals("Classes:"), "Classes label Does not match:  Fail");
		 Assert.assertTrue(Subjects_Label.isDisplayed(), "Subjects label is not available");
	     Assert.assertTrue(Subjects_Label.getText().trim().equals("Subjects:"), "Subjects label Does not match:  Fail");
	     
	     readWriteExcel(11,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ProfileDetails","Pass");
//	     readWriteExcel2("fn_ProfileDetails","D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","Pass");
  	      driver.navigate().refresh();
  	    }
	     
  	    else{
  	    	readWriteExcel(11,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ProfileDetails","Fail");
  	    	driver.navigate().refresh();
  //	    	readWriteExcel2("fn_ProfileDetails","D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","Fail");
  	    }
	}
	
	
	
	
	public void fn_EditProfile() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    fn_Login();
  	    Thread.sleep(5000);
  	  if(Profile_Img.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(Profile_Img);
	  	  Thread.sleep(3000);
		  fn_Click(EditProfile_LK);
		  Thread.sleep(3000);
		  FirstName_Text.clear();
	  	  fn_Input(FirstName_Text, obj.getProperty("UpdateFirstName"));
	  	  LastName_Text.clear();
	  	  fn_Input(LastName_Text, obj.getProperty("UpdateLastName"));
	  	  Email_Text.clear();
	  	  fn_Input(Email_Text, obj.getProperty("UpdateEmail"));
	  	  PhoneMobile_Text.clear();
	  	  fn_Input(PhoneMobile_Text, obj.getProperty("UpdateMobile"));
	      Address_Text.clear();
	  	  fn_Input(Address_Text, obj.getProperty("Address"));
	  	  fn_ScrollDown100();
	  	  fn_ScrollDown100();
	  	  fn_SelectbyIndex(SecurityQues_DD,2);
	  	  SecurityAns_Text.clear();
	  	  Thread.sleep(1000);
	  	  fn_Input(SecurityAns_Text, obj.getProperty("UpdateSecurityAns"));
	  	  Thread.sleep(2000);
	  	  fn_ScrollUP500();
	  	  Thread.sleep(2000);
	  	  UploadPhoto_Img.sendKeys("C:\\Users\\incaendo\\Desktop\\images.jpg");
	  	  Thread.sleep(3000);
	  	  fn_ScrollDown500();
	  	  fn_Click(Update_BT);
	  	  Thread.sleep(3000);
	  	Assert.assertTrue(PopUp_Text.getText().equals("Profile updated successfully"), "Message Does not match:  Fail");
	  	readWriteExcel(12,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditProfile","Pass");
	  	 fn_Click(Ok_BT);
  	  }
  	else{
	    	readWriteExcel(12,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditProfile","Fail");
	    	}
  	  
	   }
	
	
	
	
	
	
	
	public void fn_LogOut() throws InterruptedException{
		fn_Click(Profile_Img);
		Thread.sleep(3000);
		fn_Click(LogOut_BT);
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	}
    
    