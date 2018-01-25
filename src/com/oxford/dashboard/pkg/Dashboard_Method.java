package com.oxford.dashboard.pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.oxford.generic.pkg.Generic_Methods;
import com.oxford.login.pkg.Login_Method;

public class Dashboard_Method extends Generic_Methods {

	
	@FindBy(id= "imgLogo")
	public WebElement Logo_Img;
	
	@FindBy(xpath = "//li[@id='spnTeacherDashboard']/div[2]")
	public WebElement Home_Lk;
	
	@FindBy(xpath = "//li[@id='lnkBookMarks']/div[2]")
	public WebElement Bookmarks_Lk;
	
	@FindBy(xpath = "//li[@id='lnkClassAdministration']/div[2]")
	public WebElement MyClass_Lk;
	
	@FindBy(xpath = "//ul[@id='ulteacherNavigates']/li[5]/div[2]")
	public WebElement Notifications_Lk;
	
	@FindBy(xpath = "//li[@id='lnkReports']/div[2]")
	public WebElement Reports_Lk;
	
	@FindBy(xpath = "//li[@id='lnkMarksEntry']/div[2]")
	public WebElement MarksEntry_Lk;
	
	@FindBy(id= "imgProfile")
	public WebElement Profile_Img;
	
	@FindBy(xpath = "//input[@id='txtEmail']")
	public WebElement LoginName_TX;
	
	@FindBy(xpath = "//input[@id='txtPWD']")
	public WebElement Password_TX;
	
    @FindBy(xpath = "//a[@id='btnSignIn']")
	public WebElement SignIn_BT;
	
    @FindBy(xpath = "//body/div/div[2]/div/div")
	public WebElement FooterLogo_Img;
    
    @FindBy(id= "sys_requ")
	public WebElement SysReq_Icon;
    
    @FindBy(id= "contus_footer")
	public WebElement ContInfo_Icon;
    
    @FindBy(id= "footer_menu_lnks")
	public WebElement Menu_Icon;
    
    @FindBy(id= "ancPrivacy")
	public WebElement PrivacyPolicy_LK;
    
//    @FindBy(xpath = "//div[@id='general_content']//div/h1")
//	public WebElement PrivacyPolicy_Text;
    @FindBy(id= "ancLegal")
	public WebElement Legal_LK;
    
    @FindBy(id= "ancCookie")
	public WebElement Cookies_LK;
    
    @FindBy(id= "ancHelp")
	public WebElement Help_LK;
    
    @FindBy(id= "ancFaq")
	public WebElement FAQs_LK;	
    
    @FindBy(id= "serverarralign")
	public WebElement ServerDate_Icon;
    
    @FindBy(xpath = "//a[@id='CPH_dtlstSubjects_ancSubjectName_0']/div/img")
	public WebElement Subject1_Img;
    
    @FindBy(xpath = "//div[@id='dvCalendar']/h1")
	public WebElement Calendar_Text;
    
  
    
    
    
    
	public void fn_HeaderDashboard() throws InterruptedException, IOException{
		fn_Login();
		Thread.sleep(2000);
		if(Logo_Img.isDisplayed()){
 	     Thread.sleep(2000);
 //	   String logotext=Logo_Img.getText();
// 	    Assert.assertTrue(Logo_Img.getText().contains("Oxford Advantage"), "Logo text does not match:  Fail");
// 	     Thread.sleep(2000);
 	     Assert.assertTrue(Home_Lk.isDisplayed(), "Home link is not available");
 	     Assert.assertTrue(Home_Lk.getText().equals("Home"), "Home link does not match:  Fail");
 	     Thread.sleep(2000);
 	    Assert.assertTrue(Bookmarks_Lk.isDisplayed(), "Bookmark link is not available");
	     Assert.assertTrue(Bookmarks_Lk.getText().equals("Bookmark"), "Bookmark link does not match:  Fail");
	     Thread.sleep(2000);
	    Assert.assertTrue(MyClass_Lk.isDisplayed(), "My Class link is not available");
	     Assert.assertTrue(MyClass_Lk.getText().equals("My Class"), "My Class link does not match:  Fail");
	     Thread.sleep(2000);
	    Assert.assertTrue(Notifications_Lk.isDisplayed(), "Notifications link is not available");
	     Assert.assertTrue(Notifications_Lk.getText().equals("Notifications"), "Notifications link does not match:  Fail");
	     Thread.sleep(2000);
	    Assert.assertTrue(Reports_Lk.isDisplayed(), "Reports link is not available");
	     Assert.assertTrue(Reports_Lk.getText().equals("Reports"), "Reports link does not match:  Fail");
	     Thread.sleep(2000); 
	    Assert.assertTrue(MarksEntry_Lk.isDisplayed(), "Marks Entry link is not available");
	     Assert.assertTrue(MarksEntry_Lk.getText().equals("Marks Entry"), "Marks Entry link does not match:  Fail");
	     Thread.sleep(2000);
	     Assert.assertTrue(Profile_Img.isDisplayed(), "Profile image is not available");
	    
	     readWriteExcel(28,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_HeaderDashboard","Pass");
	      }
	     else{
  	    	readWriteExcel(28,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_HeaderDashboard","Fail");
  	    	Thread.sleep(5000);
           }
	      }
	     
     
	
	public void fn_FooterDashboard() throws InterruptedException, IOException{
		fn_Login();
		Thread.sleep(2000);
		fn_ScrollDown500();
		Thread.sleep(2000);
		if(FooterLogo_Img.isDisplayed()){
 	    Thread.sleep(2000);
 	    Assert.assertTrue(SysReq_Icon.isDisplayed(), "System Requirements is not available");
        Thread.sleep(2000);
        fn_mouseOver(SysReq_Icon);
        Thread.sleep(2000);
        Assert.assertTrue(ContInfo_Icon.isDisplayed(), " Contact Information  is not available");
        Thread.sleep(2000);
        fn_mouseOver(ContInfo_Icon);
        Thread.sleep(2000);
 	    Assert.assertTrue(Menu_Icon.isDisplayed(), "Menu link is not available");
 	    Thread.sleep(2000);
        fn_mouseOver(Menu_Icon);
        Thread.sleep(2000);
        fn_Click(PrivacyPolicy_LK);
        Thread.sleep(3000);
        WindowHandling();
        Thread.sleep(3000);
        fn_mouseOver(Menu_Icon);
        Thread.sleep(2000);
        fn_Click(Legal_LK);
        Thread.sleep(3000);
        WindowHandling();
        Thread.sleep(3000);
        fn_mouseOver(Menu_Icon);
        Thread.sleep(2000);
        fn_Click(Cookies_LK);
        Thread.sleep(3000);
        WindowHandling();
        Thread.sleep(3000);
        fn_mouseOver(Menu_Icon);
        Thread.sleep(2000);
        fn_Click(Help_LK);
        Thread.sleep(3000);
        WindowHandling();
        Thread.sleep(3000);
        fn_mouseOver(Menu_Icon);
        Thread.sleep(2000);
        fn_Click(FAQs_LK);
        Thread.sleep(3000);
        WindowHandling();
        Thread.sleep(3000);
        Assert.assertTrue(ServerDate_Icon.isDisplayed(), "Server Date link is not available");
 	    Thread.sleep(2000);
        fn_mouseOver(ServerDate_Icon);
        Thread.sleep(2000);
	    readWriteExcel(29,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_FooterDashboard","Pass");
	      }
	     else{
  	    	readWriteExcel(29,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_FooterDashboard","Fail");
  	    	Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_VisibilitySubjectandCalendar() throws InterruptedException, IOException{
		fn_Login();
		Thread.sleep(2000);
		if(Subject1_Img.isDisplayed()){
 	    Thread.sleep(2000);
 	    Assert.assertTrue(Calendar_Text.isDisplayed(), "Calendar Text is not available");
        Thread.sleep(2000);
        Assert.assertTrue(Calendar_Text.getText().trim().equals("Calendar"), "Calendar text does not match:  Fail");
        Thread.sleep(2000);
        readWriteExcel(30,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilitySubjectandCalendar","Pass");
	      }
	     else{
  	    	readWriteExcel(30,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_VisibilitySubjectandCalendar","Fail");
  	    	Thread.sleep(5000);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }
