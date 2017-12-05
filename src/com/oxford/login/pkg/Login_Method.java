package com.oxford.login.pkg;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void fn_LogOut() throws InterruptedException{
		fn_Click(Profile_Img);
		Thread.sleep(3000);
		fn_Click(LogOut_BT);
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	}
    
    