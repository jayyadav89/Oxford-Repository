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
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(id= "CPH_fileDeletePhoto")
	public WebElement RemoveImg_BT;
	
	@FindBy(id= "CPH_lnkbtnBack")
	public WebElement CancelProfilePage_LK;
	
	@FindBy(xpath = "//div[@id='dvClass']/span")
	public WebElement Class_Label;
	
	@FindBy(linkText= "Change password")
	public WebElement ChangePasswprd_LK;
	
	@FindBy(id= "CPH_UCpwd_Npwd")
	public WebElement NewPassword_TX;
	
	@FindBy(id= "CPH_UCpwd_ConPwd")
	public WebElement ConfirmPassword_TX;
	
	@FindBy(id= "CPH_lnkSave")
	public WebElement PasswordUpdate_BT;
	
	@FindBy(id= "CPH_UCpwd_Cpwd")
	public WebElement CurrentPassword_TX;
	
	@FindBy(id= "CPH_lnkCancel")
	public WebElement CancelChangePasswordPage_LK;
	
	@FindBy(linkText= "Forgot password?")
	public WebElement ForgotPassword_LK;
	
	@FindBy(id= "txtUsername_Id")
	public WebElement LoginnameForgotPass_TX;
	
	@FindBy(id= "ddlSecurityQues")
	public WebElement SecurityQuesForgotPass_DD;
	
	@FindBy(id= "SecAns_Id")
	public WebElement SecurityAnsForgotPass_TX;
	
	@FindBy(id= "lnkbtnContinue")
	public WebElement Continue_BT;
	
	@FindBy(id= "Npwd")
	public WebElement NewPasswordForgotPass_TX;
	
	@FindBy(id= "ConPwd")
	public WebElement ConfirmPasswordForgotPass_TX;
	
	@FindBy(id= "lnkSave")
	public WebElement PasswordUpdateForgotPass_BT;
	
	@FindBy(id= "LinkButton1")
	public WebElement CancelForgotPass1_BT;
	
	@FindBy(id= "lnkCancel")
	public WebElement CancelForgotPass_BT;
	

	
	
	
	
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
	  	 
	  	  Thread.sleep(3000);
	  	 //	  if(Profile_Img.isDisplayed()){
	  	 		  Thread.sleep(3000);
	  		  	  fn_Click(Profile_Img);
	  		  	  Thread.sleep(3000);
	  			  fn_Click(EditProfile_LK);
	  			  Thread.sleep(3000);
	//  			Assert.assertTrue(FirstName_Text.getText().trim().equals(obj.getProperty("UpdateFirstName")));
	  			  FirstName_Text.clear();
	  		  	  fn_Input(FirstName_Text, obj.getProperty("FirstName"));
	 // 		  	Assert.assertTrue(LastName_Text.getText().trim().equals(obj.getProperty("UpdateLastName")));
	  		  	  LastName_Text.clear();
	  		  	  fn_Input(LastName_Text, obj.getProperty("LastName"));
	  //		  	Assert.assertTrue(Email_Text.getText().trim().equals(obj.getProperty("UpdateEmail")));
	  		  	  Email_Text.clear();
	  		  	  fn_Input(Email_Text, obj.getProperty("Email"));
	  //		  	Assert.assertTrue(PhoneMobile_Text.getText().trim().equals(obj.getProperty("UpdateMobile")));
	  		  	  PhoneMobile_Text.clear();
	  		  	  fn_Input(PhoneMobile_Text, obj.getProperty("Mobile"));
	  //		  	Assert.assertTrue(Address_Text.getText().trim().equals(obj.getProperty("Address")));
	  		  	  Address_Text.clear();
	  		//  	  fn_Input(Address_Text, obj.getProperty("Address"));
	  		  	  fn_ScrollDown100();
	  		  	  fn_ScrollDown100();
	  		  	  fn_SelectbyIndex(SecurityQues_DD,1);
	  		  	  SecurityAns_Text.clear();
	  		  	  Thread.sleep(1000);
	  		  	  fn_Input(SecurityAns_Text, obj.getProperty("SecurityAns"));
	  		  	  Thread.sleep(2000);
	  		  	  fn_ScrollUP500();
	  		  	  Thread.sleep(2000);
	  		  	  UploadPhoto_Img.sendKeys("C:\\Users\\incaendo\\Desktop\\oxford profile.jpg");
	  		  	  Thread.sleep(3000);
	  		  	  fn_ScrollDown500();
	  		  	  fn_Click(Update_BT);
	  		  	  Thread.sleep(3000);
	  		  	  fn_Click(Ok_BT);
	  		  	Thread.sleep(5000);
  	       }
  	      else{
	    	readWriteExcel(12,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditProfile","Fail");
	    	Thread.sleep(5000);
  	       }
  	  
	   }
	
	
	
	public void fn_Validation() throws InterruptedException, IOException{
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
		  fn_ScrollDown500();
		  fn_Click(Update_BT);
		  Thread.sleep(2000);
		 if(Popup_TX.isDisplayed()){
		Assert.assertTrue(Popup_TX.getText().trim().equals("First name cannot be blank"));
		Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 
		 fn_ScrollUP500();
		 Thread.sleep(2000);
		 fn_Input(FirstName_Text, obj.getProperty("FirstName"));
		 fn_ScrollDown500();
		 Thread.sleep(3000);
		 
		 fn_SelectbyIndex(SecurityQues_DD,0);
		 Thread.sleep(2000);
		 fn_Click(Update_BT);
		 Thread.sleep(2000);
		 Assert.assertTrue(Popup_TX.getText().trim().equals("Select security question"));
		 Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(2000);
		 fn_SelectbyIndex(SecurityQues_DD,1);
		 Thread.sleep(2000);
	  	 SecurityAns_Text.clear();
	  	 Thread.sleep(2000);
	  	 fn_Click(Update_BT);
	  	Thread.sleep(2000);
		 Assert.assertTrue(Popup_TX.getText().trim().equals("Enter security answer"));
		 Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(2000);
		 fn_Input(SecurityAns_Text, obj.getProperty("SecurityAns"));
		 fn_Click(Update_BT);
		 fn_Click(Ok_BT);
		 Thread.sleep(5000);
		 readWriteExcel(13,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_Validation","Pass");
		 
		 }
		 else{
		    	readWriteExcel(12,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditProfile","Fail");
		    	Thread.sleep(5000);
		 }
		       }
	
  	        }
	
	
	
	public void fn_InvalidEmail() throws InterruptedException, IOException{
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
		  Email_Text.clear();
		  Thread.sleep(2000);
		  fn_Input(Email_Text, obj.getProperty("InvalidEmail"));
		  fn_ScrollDown500();
		  fn_Click(Update_BT);
		  Thread.sleep(2000);
		 if(Popup_TX.isDisplayed()){
		Assert.assertTrue(Popup_TX.getText().trim().equals("Entered Email is not in the correct format"));
		Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 fn_ScrollUP500();
		 Thread.sleep(2000);
		 Email_Text.clear();
		 Thread.sleep(2000);
		 fn_Input(Email_Text, obj.getProperty("Email"));
		 fn_ScrollDown500();
		 fn_Click(Update_BT);
		 Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(5000);
		 readWriteExcel(14,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidEmail","Pass");
		 
		 }
		 else{
		    	readWriteExcel(14,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidEmail","Fail");
		    	Thread.sleep(5000);
		 }
		 }
  	  }
	
	
	
	public void fn_InvalidPhone() throws InterruptedException, IOException{
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
		  PhoneMobile_Text.clear();
		  Thread.sleep(2000);
		  fn_Input(PhoneMobile_Text, obj.getProperty("InvalidMobile"));
          Thread.sleep(2000);
		 if(Popup_TX.isDisplayed()){
		Assert.assertTrue(Popup_TX.getText().trim().equals("Special characters/Alphabets other than ()+.- are not allowed."));
		Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 fn_ScrollUP500();
		 Thread.sleep(2000);
		 PhoneMobile_Text.clear();
		 Thread.sleep(2000);
		 fn_Input(PhoneMobile_Text, obj.getProperty("Mobile"));
		 fn_ScrollDown500();
		 fn_Click(Update_BT);
		 Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(5000);
		 readWriteExcel(15,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidPhone","Pass");
		 
		 }
		 else{
		    	readWriteExcel(15,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidPhone","Fail");
		    	Thread.sleep(5000);
		 }
		 }
  	  }
	
	
	
	
	
	public void fn_InvalidSecurityAns() throws InterruptedException, IOException{
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
		  fn_ScrollDown500();
		  Thread.sleep(2000);
		  SecurityAns_Text.clear();
		  Thread.sleep(2000);
		  fn_Input(SecurityAns_Text, obj.getProperty("InvalidSecurityAns"));
		  fn_Click(Update_BT);
		  Thread.sleep(2000);
		 if(Popup_TX.isDisplayed()){
		Assert.assertTrue(Popup_TX.getText().trim().equals("Security answer should have at least 4 characters"));
		Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(2000);
		 SecurityAns_Text.clear();
		 Thread.sleep(2000);
		 fn_Input(SecurityAns_Text, obj.getProperty("SecurityAns"));
		 fn_Click(Update_BT);
		 Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(5000);
		 readWriteExcel(16,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidSecurityAns","Pass");
		 
		 }
		 else{
		    	readWriteExcel(16,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidSecurityAns","Fail");
		    	Thread.sleep(5000);
		 }
		 }
  	  }
	
	
	
	public void fn_InvalidSecurityDOB() throws InterruptedException, IOException{
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
		  fn_ScrollDown500();
		  fn_SelectbyIndex(SecurityQues_DD,3);
		  Thread.sleep(2000);
		  SecurityAns_Text.clear();
		  Thread.sleep(2000);
		 fn_Input(SecurityAns_Text, obj.getProperty("InvalidSecurityDob"));
		  fn_Click(Update_BT);
		  Thread.sleep(2000);
	try{
		if(Popup_TX.isDisplayed()){
	//	Assert.assertTrue(Popup_TX.getText().trim().equals("Security answer should have at least 4 characters"));
		Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(2000);
		 fn_SelectbyIndex(SecurityQues_DD,1);
		 SecurityAns_Text.clear();
		 Thread.sleep(2000);
		 fn_Input(SecurityAns_Text, obj.getProperty("SecurityAns"));
		 fn_Click(Update_BT);
		 Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(5000);
		 readWriteExcel(17,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidSecurityDOB","Pass");
		 
		 }}
		 catch(Exception e){
	//		   fn_Click(Ok_BT);
		    	readWriteExcel(17,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidSecurityDOB","Fail");
		    	Thread.sleep(5000);
		 }
		 }
  	  }
	
	
	
	
	public void fn_RemoveImg() throws InterruptedException, IOException{
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
		  Thread.sleep(2000);
		  
		 if(RemoveImg_BT.isDisplayed()){
			  fn_Click(RemoveImg_BT);
			  Thread.sleep(3000);
			  Assert.assertFalse(RemoveImg_BT.isDisplayed(), "Image not removed: Fail");
			  Thread.sleep(3000);
			  UploadPhoto_Img.sendKeys("C:\\Users\\incaendo\\Desktop\\oxford profile.jpg");
  		  	  Thread.sleep(3000);
  		  	  fn_ScrollDown500();
  		  	  fn_Click(Update_BT);
  		  	  Thread.sleep(3000);
  		  	  fn_Click(Ok_BT);
  		  	  Thread.sleep(5000);
			  readWriteExcel(18,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveImg","Pass");
				 
		 }
		 else{
		    	readWriteExcel(18,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveImg","Fail");
		    	Thread.sleep(5000);
		 }
		  
		  
  	  }}
	
	
	
	
	public void fn_CancelProfilePage() throws InterruptedException, IOException{
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
		  Thread.sleep(2000);
		  fn_ScrollDown500();
	  	  fn_Click(CancelProfilePage_LK);
	  	  Thread.sleep(3000);
	if(Class_Label.isDisplayed()){
		Thread.sleep(5000);
		readWriteExcel(19,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelProfilePage","Pass");
	  }
	 else{
	    	readWriteExcel(19,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelProfilePage","Fail");
	    	Thread.sleep(5000);
	    }
	     }
	   }
	
	
	
	public void fn_ChangePassword() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    fn_Login();
  	    Thread.sleep(5000);
  	  if(Profile_Img.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(Profile_Img);
	  	  Thread.sleep(3000);
		  fn_Click(ChangePasswprd_LK);
		  Thread.sleep(2000);
		  fn_Input(NewPassword_TX, obj.getProperty("NewPassword"));
		  Thread.sleep(2000);
		  fn_Input(ConfirmPassword_TX, obj.getProperty("NewPassword"));
		  Thread.sleep(2000);
	  	  fn_Click(PasswordUpdate_BT);
	  	  Thread.sleep(3000);
	  	  
	  	if(Popup_TX.isDisplayed()){
			Assert.assertTrue(Popup_TX.getText().trim().equals("Password changed successfully"));
			Thread.sleep(2000);
			fn_Click(Ok_BT);
			Thread.sleep(5000);
			fn_LogOut();
			Thread.sleep(2000);
			fn_Input(LoginName_TX, obj.getProperty("LoginName"));
	  	    fn_Input(Password_TX, obj.getProperty("NewPassword"));
	        fn_Click(SignIn_BT);
	        Thread.sleep(10000);
	        fn_Click(Profile_Img);
		  	  Thread.sleep(3000);
			  fn_Click(ChangePasswprd_LK);
			  Thread.sleep(2000);
			  fn_Input(NewPassword_TX, obj.getProperty("Password"));
			  Thread.sleep(2000);
			  fn_Input(ConfirmPassword_TX, obj.getProperty("Password"));
			  Thread.sleep(2000);
		  	  fn_Click(PasswordUpdate_BT);
		  	  Thread.sleep(3000);
		  	  fn_Click(Ok_BT);
			  Thread.sleep(5000);
			  readWriteExcel(20,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ChangePassword","Pass");
		    }
			 else{
			    	readWriteExcel(20,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ChangePassword","Fail");
			    	Thread.sleep(5000);
			    }
			     }
	  	       }
	
	
	
	public void fn_ChangeCurrentPassword() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    fn_Login();
  	    Thread.sleep(5000);
  	  if(Profile_Img.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(Profile_Img);
	  	  Thread.sleep(3000);
		  fn_Click(ChangePasswprd_LK);
		  Thread.sleep(2000);
		  
		  if(CurrentPassword_TX.isDisplayed()){
				Assert.assertFalse(CurrentPassword_TX.isEnabled(),"Current Password is Enabled: Fail");
				Thread.sleep(5000);
				readWriteExcel(21,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ChangeCurrentPassword","Pass");
			    }
				 else{
				    	readWriteExcel(21,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ChangeCurrentPassword","Fail");
				    	Thread.sleep(5000);
				    }
				  }
	          }
	
	
	
	public void fn_ValidationPassword() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    fn_Login();
  	    Thread.sleep(5000);
  	  if(Profile_Img.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(Profile_Img);
	  	  Thread.sleep(3000);
		  fn_Click(ChangePasswprd_LK);
		  Thread.sleep(3000);
		  fn_Click(PasswordUpdate_BT);
		  
		  if(Popup_TX.isDisplayed()){
				Assert.assertTrue(Popup_TX.getText().trim().equals("New password and Confirm password should not be empty"));
				Thread.sleep(2000);
				 fn_Click(Ok_BT);
				 Thread.sleep(5000);
				 readWriteExcel(22,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationPassword","Pass");
		    }
			 else{
			    	readWriteExcel(22,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationPassword","Fail");
			    	Thread.sleep(5000);
			    }
		        }
	          }
	
	
	
	public void fn_CancelChangePassword() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    fn_Login();
  	    Thread.sleep(5000);
  	  if(Profile_Img.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(Profile_Img);
	  	  Thread.sleep(3000);
		  fn_Click(ChangePasswprd_LK);
		  Thread.sleep(3000);
		  fn_Click(CancelChangePasswordPage_LK);
		  Thread.sleep(3000);
		  if(Class_Label.isDisplayed()){
				Thread.sleep(5000);
				readWriteExcel(23,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fh_CancelChangePassword","Pass");
			  }
			 else{
			    	readWriteExcel(23,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fh_CancelChangePassword","Fail");
			    	Thread.sleep(5000);
			    }
			     }
			   }
	
	
	
	
	public void fn_ForgotPassword() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  //	fn_Login();
  	    Thread.sleep(5000);
  	  if(ForgotPassword_LK.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(ForgotPassword_LK);
	  	  Thread.sleep(3000);
		  LoginnameForgotPass_TX.clear();
	  	  fn_Input(LoginnameForgotPass_TX, obj.getProperty("LoginName"));
	  	  fn_SelectbyIndex(SecurityQuesForgotPass_DD,1);
	  	  SecurityAnsForgotPass_TX.clear();
	  	  Thread.sleep(1000);
	  	  fn_Input(SecurityAnsForgotPass_TX, obj.getProperty("SecurityAns"));
	  	  Thread.sleep(2000);
	  	  fn_Click(Continue_BT);
	  	  Thread.sleep(3000);
	  	  fn_Input(NewPasswordForgotPass_TX, obj.getProperty("NewPassword"));
	  	  Thread.sleep(2000);
	  	  fn_Input(ConfirmPasswordForgotPass_TX, obj.getProperty("NewPassword"));
	  	  Thread.sleep(2000);
	  	  fn_Click(PasswordUpdateForgotPass_BT);
	  	  Thread.sleep(3000);
	  	Assert.assertTrue(Popup_TX.getText().trim().equals("Password changed successfully. Please re-login with updated password"));
		Thread.sleep(2000);
		 fn_Click(Ok_BT);
		 Thread.sleep(2000); 
	  	  fn_Input(LoginName_TX, obj.getProperty("LoginName"));
	  	    fn_Input(Password_TX, obj.getProperty("NewPassword"));
	        fn_Click(SignIn_BT);
	        Thread.sleep(10000);
	        fn_LogOut();
	        Thread.sleep(3000);
	       fn_Click(ForgotPassword_LK);
		  	  Thread.sleep(3000);
			LoginnameForgotPass_TX.clear();
		  	fn_Input(LoginnameForgotPass_TX, obj.getProperty("LoginName"));
		  	  fn_SelectbyIndex(SecurityQuesForgotPass_DD,1);
		  	  SecurityAnsForgotPass_TX.clear();
		  	  Thread.sleep(1000);
		  	  fn_Input(SecurityAnsForgotPass_TX, obj.getProperty("SecurityAns"));
		  	  Thread.sleep(2000);
		  	  fn_Click(Continue_BT);
		  	  Thread.sleep(3000);
		  	  fn_Input(NewPasswordForgotPass_TX, obj.getProperty("Password"));
		  	  Thread.sleep(2000);
		  	  fn_Input(ConfirmPasswordForgotPass_TX, obj.getProperty("Password"));
		  	  Thread.sleep(2000);
		  	  fn_Click(PasswordUpdateForgotPass_BT);
		  	  Thread.sleep(3000);
		  	Assert.assertTrue(Popup_TX.getText().trim().equals("Password changed successfully. Please re-login with updated password"));
			Thread.sleep(2000);
			 fn_Click(Ok_BT);
			 Thread.sleep(2000);
			 fn_Login();
			 Thread.sleep(5000);
			readWriteExcel(24,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ForgotPassword","Pass");
	  	   }
  	      else{
	    	readWriteExcel(24,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ForgotPassword","Fail");
	    	Thread.sleep(5000);
  	       }
  	      }
	
	
	
	
	public void fn_ValidationForgotPassFields() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	    
  	    if(ForgotPassword_LK.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(ForgotPassword_LK);
	  	  Thread.sleep(3000);
		  fn_Click(Continue_BT);
		  Thread.sleep(3000);
		  
		if(Popup_TX.isDisplayed()){
				Assert.assertTrue(Popup_TX.getText().trim().equals("Enter Login name"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				fn_Input(LoginnameForgotPass_TX, obj.getProperty("LoginName"));
				fn_Click(Continue_BT);
				Thread.sleep(3000);
				Assert.assertTrue(Popup_TX.getText().trim().equals("Select security question"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				fn_SelectbyIndex(SecurityQuesForgotPass_DD,1);
				fn_Click(Continue_BT);
				Thread.sleep(3000);
				Assert.assertTrue(Popup_TX.getText().trim().equals("Enter security answer"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				fn_Input(SecurityAnsForgotPass_TX, obj.getProperty("SecurityAns"));
				fn_Click(Continue_BT);
				Thread.sleep(3000);
				
				fn_Click(PasswordUpdateForgotPass_BT);
				Thread.sleep(3000);
				Assert.assertTrue(Popup_TX.getText().trim().equals("New password cannot be blank"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				fn_Input(NewPasswordForgotPass_TX, obj.getProperty("Password"));
				fn_Click(PasswordUpdateForgotPass_BT);
				Thread.sleep(3000);
				Assert.assertTrue(Popup_TX.getText().trim().equals("Confirm password cannot be blank"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				fn_Click(CancelForgotPass_BT);
				Thread.sleep(2000);
				fn_Click(CancelForgotPass1_BT);
				Thread.sleep(2000);
				fn_Login();
				Thread.sleep(5000);
				readWriteExcel(25,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationForgotPassFields","Pass");
		    }
			 else{
			    	readWriteExcel(25,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationForgotPassFields","Fail");
			    	Thread.sleep(5000);
			    }
		        }
	          }
	
	
	
	
	public void fn_InvalidValidationForgotPassFields() throws InterruptedException, IOException{
		Properties obj = new Properties();   
  	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	    obj.load(objfile);
  	   if(ForgotPassword_LK.isDisplayed()){
  		  Thread.sleep(3000);
	  	  fn_Click(ForgotPassword_LK);
	  	  Thread.sleep(3000);
	  	  fn_Input(LoginnameForgotPass_TX, obj.getProperty("InvalidName"));
	  	  Thread.sleep(2000);
	  	  fn_SelectbyIndex(SecurityQuesForgotPass_DD,1);
	  	  Thread.sleep(2000);
	  	fn_Input(SecurityAnsForgotPass_TX, obj.getProperty("SecurityAns"));
	  	  fn_Click(Continue_BT);
		   Thread.sleep(2000);
		if(Popup_TX.isDisplayed()){
				Assert.assertTrue(Popup_TX.getText().trim().equals("Please enter valid Login name or Contact school admin to retrieve your login name"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				LoginnameForgotPass_TX.clear();
				fn_Input(LoginnameForgotPass_TX, obj.getProperty("LoginName"));
				fn_SelectbyIndex(SecurityQuesForgotPass_DD,0);
			  	Thread.sleep(2000);
			  	fn_Input(SecurityAnsForgotPass_TX, obj.getProperty("SecurityAns"));
			  	fn_Click(Continue_BT);
			  	Thread.sleep(2000);
				Assert.assertTrue(Popup_TX.getText().trim().equals("Select security question"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				fn_SelectbyIndex(SecurityQuesForgotPass_DD,1);
			  	Thread.sleep(2000);
				SecurityAnsForgotPass_TX.clear();
				fn_Input(SecurityAnsForgotPass_TX, obj.getProperty("UpdateSecurityAns"));
			  	fn_Click(Continue_BT);
			  	Thread.sleep(2000);
				Assert.assertTrue(Popup_TX.getText().trim().equals("Invalid Security question and answer"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				SecurityAnsForgotPass_TX.clear();
				fn_Input(SecurityAnsForgotPass_TX, obj.getProperty("SecurityAns"));
			  	fn_Click(Continue_BT);
			  	Thread.sleep(2000);
			  	fn_Input(NewPasswordForgotPass_TX, obj.getProperty("Password"));
			  	Thread.sleep(2000);
			  	fn_Input(ConfirmPasswordForgotPass_TX, obj.getProperty("InvalidPassword"));
			  	Thread.sleep(2000);
				fn_Click(PasswordUpdateForgotPass_BT);
				Thread.sleep(3000);
				Assert.assertTrue(Popup_TX.getText().trim().equals("New password and Confirm password fields do not match"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
				fn_Click(CancelForgotPass_BT);
				Thread.sleep(2000);
				fn_Click(CancelForgotPass1_BT);
				Thread.sleep(2000);
				fn_Login();
				Thread.sleep(5000);
				readWriteExcel(26,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidValidationForgotPassFields","Pass");
		    }
			 else{
			    	readWriteExcel(26,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_InvalidValidationForgotPassFields","Fail");
			    	Thread.sleep(5000);
			    }
		        }
	          }
	
	
	
	
	public void fn_SignOut() throws InterruptedException, IOException{
		if(SignIn_BT.isDisplayed()){
			fn_Login();
			Thread.sleep(3000);
			fn_LogOut();
			Thread.sleep(3000);
			fn_Login();
			readWriteExcel(27,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SignOut","Pass");
			}
		else{
			readWriteExcel(27,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SignOut","Fail");
			}
		    }
	
	
	
	public void fn_LogOut() throws InterruptedException{
		fn_Click(Profile_Img);
		Thread.sleep(3000);
		fn_Click(LogOut_BT);
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	}
    
    