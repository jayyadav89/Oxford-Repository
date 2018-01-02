package com.oxford.dashboard.pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import com.oxford.generic.pkg.Generic_Methods;

public class Notificatios_Methods extends Generic_Methods{

	
	@FindBy(xpath = "//ul[@id='ulteacherNavigates']/li[5]/div")
	public WebElement Notiications_Lk;
	
	@FindBy(xpath = "//div[@id='announcemntCtrl']/div/div[7]/div/div[2]/span")
	public WebElement Subject_Label;
	
	@FindBy(xpath = "//div[@id='announcemntCtrl']/div/div[7]/div/div[3]/span")
	public WebElement From_Label;
	
	@FindBy(xpath = "//div[@id='announcemntCtrl']/div/div[7]/div/div[4]/span")
	public WebElement Importance_Label;
	
	@FindBy(xpath = "//div[@id='announcemntCtrl']//span/strong")
	public WebElement NotificationsCount_Text;
	
    @FindBy(xpath = "//div[@id='announcemntCtrl']/div/div[7]/div/div[5]/span")
	public WebElement DateTime_Label;
	
	@FindBy(id = "datepickerfrom")
	public WebElement DateFrom_TB;
	
	@FindBy(id = "datepicker")
	public WebElement DateTo_TB;
	
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div/a[2]/span")
	public WebElement MonthForward_Icon;
	
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr[2]/td[3]/a")
	public WebElement SelectDate_LK;
	
	@FindBy(xpath = "//div[@id='announcemntCtrl']/div/div[7]/div/div[5]/div/span")
	public WebElement DateTime_Text;
	
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr[6]/td[7]")
	public WebElement DisabledDate_Text;
	
	@FindBy(id = "chk0")
	public WebElement Notification1_CB;
	
	@FindBy(id = "Deletemsg")
	public WebElement Delete_BT;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(xpath = "//li[@id='clearid']/span[2]")
	public WebElement Clear_BT;
	
	@FindBy(xpath = "//li[@id='Createmsg']/span[2]")
	public WebElement Create_BT;
	
	@FindBy(id= "CPH_ComposeControl1_btnAddUsers")
	public WebElement SelectUsers_LK;
	
	@FindBy(id= "CPH_ComposeControl1_txtSearch")
	public WebElement Search_TB;
	
	@FindBy(id= "CPH_ComposeControl1_lnkSearch")
	public WebElement Search_Icon;
	
	@FindBy(id= "CPH_ComposeControl1_ChkHeader")
	public WebElement UserHeader_CB;
	
	@FindBy(id= "CPH_ComposeControl1_lnkBtnAddd")
	public WebElement AddRemove_BT;
	
	@FindBy(id= "CPH_ComposeControl1_txtSub")
	public WebElement NotificationSubject_TB;
	
	@FindBy(id= "CPH_ComposeControl1_ddlImportance")
	public WebElement Important_DD;
	
	@FindBy(xpath = "//span[@id='cke_CPH_ComposeControl1_CKEditor1']//iframe")
	public WebElement Iframe;
	
	@FindBy(xpath = "//html[@class='CSS1Compat']")
    public WebElement Message_TB;
	
	@FindBy(id= "CPH_ComposeControl1_lnkSend")
	public WebElement Send_BT;
	
	@FindBy(xpath = "//div[@id='announcemntCtrl']/div/div[7]/div/div[6]/div")
	public WebElement PreviewUserNotification_Icon;
	
	@FindBy(xpath = "//div[@id='dvCustomScroll']/div")
	public WebElement SenderName_Text;
	
	@FindBy(xpath = "//div[@id='dvCustomScroll']/div[2]/span")
	public WebElement Importance_Text;
	
	@FindBy(xpath = "//div[@id='dvCustomScroll']/div[3]/div/span")
	public WebElement Subject_Text;
	
	@FindBy(xpath = "//div[@id='dvCustomScroll']/div[4]/div/p")
	public WebElement Message_Text;
	
	@FindBy(xpath = "//div[@id='ngdialog1']/div[2]/div[3]")
	public WebElement ClosePopup_Icon;
	
	@FindBy(xpath = "//div[@id='announcemntCtrl']/div/div[8]/div/div[6]/div")
	public WebElement PreviewSystemNotification_Icon;
	
	@FindBy(id= "CPH_ComposeControl1_lblUser")
	public WebElement User_Label;
	
	@FindBy(id= "CPH_ComposeControl1_students")
	public WebElement Students_LK;
	
	@FindBy(id= "CPH_ComposeControl1_a1")
	public WebElement Principals_LK;
	
	@FindBy(xpath = "//div[@id='divClosePopup']/button")
	public WebElement ClosePopup_BT;
	
	@FindBy(xpath = "//table//tr[2]/td[3]")
	public WebElement SearchUser_Text;
	
	@FindBys({@FindBy(xpath = "//table/tr/td[1]")})
	public List<WebElement> AllUsers_CB;
	
	@FindBy(id= "CPH_ComposeControl1_repUsers_ChkItem_0")
	public WebElement User1_CB;
	
	@FindBy(id= "CPH_ComposeControl1_lnkUname")
	public WebElement LoginName_LK;
	
	@FindBy(xpath = "//table//tr[2]/td[2]")
	public WebElement LoginName1_Text;
	
	@FindBy(id= "CPH_ComposeControl1_lnkFname")
	public WebElement FirstName_LK;
	
	@FindBy(id= "CPH_ComposeControl1_lnkSecondPage")
	public WebElement Page2_LK;
	
	@FindBy(id= "CPH_ComposeControl1_lnkFirstPage")
	public WebElement Page1_LK;
	
	@FindBy(id= "CPH_ComposeControl1_lnkbtnCancel")
	public WebElement Cancel_LK;
	
	@FindBy(id= "lblHeadertext")
	public WebElement ViewNotification_Header;
	
	
	
	@FindBy(id= "imgProfile")
	public WebElement Profile_Img;
	
	@FindBy(id= "logout")
	public WebElement LogOut_BT;
	
	
	
	
	public void fn_ViewNotificationDetails() throws InterruptedException, IOException{
		    Thread.sleep(2000);
			if(Notiications_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Notiications_Lk);
	 	    Thread.sleep(3000);
	 	    Assert.assertTrue(Subject_Label.isDisplayed(), "Subject label not present: Fail");
	 	    Thread.sleep(2000);
	 	    Assert.assertTrue(From_Label.isDisplayed(), "From label not present: Fail");
	 	    Thread.sleep(2000);
	 	    Assert.assertTrue(Importance_Label.isDisplayed(), "Importance label not present: Fail");
	 	    Thread.sleep(2000);
	 	    Assert.assertTrue(DateTime_Label.isDisplayed(), "Date and Time label not present: Fail");
	 	    Thread.sleep(3000);
	 	    readWriteExcel(48,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNotificationDetails","Pass");
		      }
		     else{
		    readWriteExcel(48,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNotificationDetails","Fail");
	  	    Thread.sleep(5000);
	           }
		      }
	         
	
	
	public void fn_ViewNotificationBetweenSpecifiedDates() throws InterruptedException, IOException{
	    Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
 	   String countbefore=NotificationsCount_Text.getText();
 	    int resultbefore = Integer.parseInt(countbefore);
 	      System.out.println(resultbefore);
 	       Thread.sleep(2000);
 	    
 	         fn_Click(DateFrom_TB);
	         Thread.sleep(2000);
	         
//	    do{
//	    	fn_Click(MonthForward_Icon);
//		    Thread.sleep(2000);
//	      }
// 	     while(MonthForward_Icon.);
// 	   //    fn_Click(MonthForward_Icon);
//	    
	         fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
			 fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
			 fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
	         Thread.sleep(3000);
	        fn_Click(SelectDate_LK);
	        Thread.sleep(3000);
	    
	      String countafter=NotificationsCount_Text.getText();
	       int resultafter = Integer.parseInt(countafter);
	        System.out.println(resultafter);
	        Thread.sleep(2000);
//	     String datetotextexp =DateTo_TB.getText();
//	     System.out.println(datetotextexp);
//	     Thread.sleep(2000);
//	     String datetotextact =DateTime_Text.getText();
//	     Thread.sleep(2000);
//	     if(datetotextact.contains(datetotextexp)){
	        Assert.assertTrue(resultbefore>resultafter, "Result is wrong: Fail");
	        Thread.sleep(3000);
	          readWriteExcel(49,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNotificationBetweenSpecifiedDates","Pass");
	           Thread.sleep(3000);
	           }
	     else{
	    readWriteExcel(49,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewNotificationBetweenSpecifiedDates","Fail");
  	    Thread.sleep(5000);
           }
	      }
	    
	
	
	public void fn_SelectDateGreaterThanCurrentDate() throws InterruptedException, IOException{
	    Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
 	   String countbefore=NotificationsCount_Text.getText();
 	    int resultbefore = Integer.parseInt(countbefore);
 	      System.out.println(resultbefore);
 	       Thread.sleep(2000);
 	        fn_Click(DateFrom_TB);
	         Thread.sleep(2000);
	         fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
			 fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
			 fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
	         Thread.sleep(3000);
	       if(DisabledDate_Text.isEnabled()){
	          readWriteExcel(50,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectDateGreaterThanCurrentDate","Fail");
	          Thread.sleep(3000);
	       }
	     else{
	         readWriteExcel(50,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectDateGreaterThanCurrentDate","Pass");
  	         Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_CreateNotification() throws InterruptedException, IOException{
		    Properties obj = new Properties();   
	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
	        obj.load(objfile);
			Thread.sleep(3000);
			if(Notiications_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Notiications_Lk);
	 	    Thread.sleep(3000);
 	         fn_Click(Create_BT);
	         Thread.sleep(3000);
	         fn_Click(SelectUsers_LK);
			 Thread.sleep(3000);
			 fn_Input(Search_TB,obj.getProperty("FirstName"));
			 Thread.sleep(1000);
			 fn_Click(Search_Icon);
			 Thread.sleep(2000);
			 fn_Click(UserHeader_CB);
			 Thread.sleep(3000);
	         fn_Click(AddRemove_BT);
	         Thread.sleep(3000);
	        fn_Input(NotificationSubject_TB,obj.getProperty("NotificationSubject"));
			 Thread.sleep(2000);
			 fn_SelectbyIndex(Important_DD,1);
		 	    Thread.sleep(2000);
		 	    fn_ScrollDown500();
		 	    Thread.sleep(2000);
		 	    driver.switchTo().frame(Iframe);
		 	    Thread.sleep(2000);
		 	 fn_Input(Message_TB,obj.getProperty("NotificationMessage"));
				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				fn_Click(Send_BT);
		        Thread.sleep(3000);
	        
		        if(Popup_TX.isDisplayed()){
		 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("Notification sent successfully"));
					Thread.sleep(2000);
					 fn_Click(Ok_BT);
					 Thread.sleep(2000);
		 	    	readWriteExcel(51,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateNotification","Pass");
			      }
			     else{
		  	    	readWriteExcel(51,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateNotification","Fail");
		  	    	Thread.sleep(5000);
		           }
	               }
	              }
	
	
	
	public void fn_ViewUserNotification() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(PreviewUserNotification_Icon);
	    Thread.sleep(3000);
	   if(SenderName_Text.isDisplayed()){
    	  Assert.assertTrue(SenderName_Text.getText().trim().contains("Sender Name: Mayank Mishra"));
	    Thread.sleep(2000);
	    Assert.assertTrue(Importance_Text.getText().trim().contains("High"));
	    Thread.sleep(2000);
	    Assert.assertTrue(Subject_Text.getText().trim().contains("Subject : Testing Notification"));
	    Thread.sleep(2000);
	    Assert.assertTrue(Message_Text.getText().trim().contains(obj.getProperty("NotificationMessage")));
	    Thread.sleep(2000);
	    fn_Click(ClosePopup_Icon);
 	    Thread.sleep(2000);
 	    readWriteExcel(52,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUserNotification","Pass");
	      }
	     else{
	    readWriteExcel(52,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewUserNotification","Fail");
  	    Thread.sleep(5000);
           }
	      }
	     }
	
	
	
	public void fn_DeleteNotification() throws InterruptedException, IOException{
	    Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
 	   String countbefore=NotificationsCount_Text.getText();
 	    int resultbefore = Integer.parseInt(countbefore);
 	      System.out.println(resultbefore);
 	       Thread.sleep(2000);
 	       fn_Click(Notification1_CB);
	         Thread.sleep(2000);
	         fn_Click(Delete_BT);
			 Thread.sleep(2000);
			 Assert.assertTrue(Popup_TX.getText().trim().equals("Are you sure you want to delete the notifications?"));
				Thread.sleep(2000);
				 fn_Click(Ok_BT);
				 Thread.sleep(3000);
			 if(Popup_TX.isDisplayed()){
	 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("Notification deleted successfully"));
				Thread.sleep(2000);
				 fn_Click(Ok_BT);
				 Thread.sleep(2000);
					 
				 String countafter=NotificationsCount_Text.getText();
			 	    int resultafter = Integer.parseInt(countafter);
			 	      System.out.println(resultafter);
			 	       Thread.sleep(2000);
			 	      Assert.assertTrue(resultbefore>resultafter, "Result is wrong: Fail");
				        Thread.sleep(3000);
					 
		 	    	readWriteExcel(53,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteNotification","Pass");
				      }
				     else{
			  	    	readWriteExcel(53,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteNotification","Fail");
			  	    	Thread.sleep(5000);
			           }
	                 }
	               }
	
	
	public void fn_ClearFilterResult() throws InterruptedException, IOException{
	    Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
 	   String countbefore=NotificationsCount_Text.getText();
 	    int resultbefore = Integer.parseInt(countbefore);
 	      System.out.println(resultbefore);
 	       Thread.sleep(2000);
 	        fn_Click(DateFrom_TB);
	         Thread.sleep(2000);
	         fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
			 fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
			 fn_Click(MonthForward_Icon);
			 Thread.sleep(1000);
	         Thread.sleep(3000);
	        fn_Click(SelectDate_LK);
	        Thread.sleep(3000);
	       String countafter=NotificationsCount_Text.getText();
	       int resultafter = Integer.parseInt(countafter);
	        System.out.println(resultafter);
	        Thread.sleep(2000);
            Assert.assertTrue(resultbefore>resultafter, "Result is wrong: Fail");
	        Thread.sleep(3000);
	        fn_Click(Clear_BT);
	        Thread.sleep(3000);
	        String clearafter=NotificationsCount_Text.getText();
	        int resultafterclear = Integer.parseInt(clearafter);
	        Thread.sleep(2000);
            Assert.assertTrue(resultbefore==resultafterclear, "Filtered Result is not cleared: Fail");
            Thread.sleep(2000);
	          readWriteExcel(54,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ClearFilterResult","Pass");
	      }
	     else{
	      readWriteExcel(54,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ClearFilterResult","Fail");
  	      Thread.sleep(5000);
           }
	      }
	
	
	public void fn_ViewSystemNotification() throws InterruptedException, IOException{
		Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
 	    fn_Click(PreviewSystemNotification_Icon);
	    Thread.sleep(3000);
	   if(SenderName_Text.isDisplayed()){
    	  Assert.assertTrue(SenderName_Text.getText().trim().contains("Sender Name: Mayank Mishra"));
	      Thread.sleep(2000);
	      fn_Click(ClosePopup_Icon);
 	      Thread.sleep(2000);
 	    readWriteExcel(55,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSystemNotification","Pass");
	      }
	     else{
	    readWriteExcel(55,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewSystemNotification","Fail");
  	    Thread.sleep(5000);
           }
	      UpdateCellColor(55,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage");
	      }
	     }
	
	
	public void fn_ValidationMandatoryfields() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
        fn_Input(NotificationSubject_TB,obj.getProperty("NotificationSubject"));
		 Thread.sleep(2000);
		  fn_ScrollDown500();
	 	    Thread.sleep(2000);
	 	    driver.switchTo().frame(Iframe);
	 	    Thread.sleep(2000);
	 	 fn_Input(Message_TB,obj.getProperty("NotificationMessage"));
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			fn_Click(Send_BT);
	        Thread.sleep(3000);
	       if(Popup_TX.isDisplayed()){
	 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("Select any one user to send a notification"));
				Thread.sleep(2000);
				 fn_Click(Ok_BT);
				 Thread.sleep(2000);
				 fn_ScrollUP500();
			 	 Thread.sleep(2000);
		         fn_Click(SelectUsers_LK);
				 Thread.sleep(3000);
				 fn_Input(Search_TB,obj.getProperty("FirstName"));
				 Thread.sleep(1000);
				 fn_Click(Search_Icon);
				 Thread.sleep(2000);
				 fn_Click(UserHeader_CB);
				 Thread.sleep(3000);
		         fn_Click(AddRemove_BT);
		         Thread.sleep(3000);
		         NotificationSubject_TB.clear();
		         Thread.sleep(2000);
		         fn_ScrollDown500();
			 	 Thread.sleep(2000);
				 fn_Click(Send_BT);
				 Thread.sleep(3000);
			     Assert.assertTrue(Popup_TX.getText().trim().equals("Enter subject"));
					Thread.sleep(2000);
					 fn_Click(Ok_BT);
					 Thread.sleep(2000);
					 fn_ScrollUP500();
				 	 Thread.sleep(2000);
				readWriteExcel(56,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationMandatoryfields","Pass");
		      }
		     else{
	  	    	readWriteExcel(56,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationMandatoryfields","Fail");
	  	    	Thread.sleep(5000);
	           }
	           }
		      
              }
	
	
	
	public void fn_SelectUserCategory() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
         fn_Click(SelectUsers_LK);
		 Thread.sleep(3000);
		 Assert.assertTrue(User_Label.getText().trim().equals("Teachers"));
		 Thread.sleep(2000);
         fn_Click(Students_LK);
		 Thread.sleep(3000);
		 Assert.assertTrue(User_Label.getText().trim().equals("Students"));
		 Thread.sleep(2000);
         fn_Click(Principals_LK);
		 Thread.sleep(3000);
		 Assert.assertTrue(User_Label.getText().trim().equals("Principals"));
		 fn_Click(ClosePopup_BT);
		 Thread.sleep(2000);
		 readWriteExcel(57,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectUserCategory","Pass");
		 }
		 else{
	  	    	readWriteExcel(57,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectUserCategory","Fail");
	  	    	Thread.sleep(5000);
	           }
	           }
	
	
	public void fn_SearchUsername() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
         fn_Click(SelectUsers_LK);
		 Thread.sleep(3000);
		 fn_Input(Search_TB,obj.getProperty("FirstName"));
		 Thread.sleep(2000);
		 fn_Click(Search_Icon);
		 Thread.sleep(3000);
         Assert.assertTrue(SearchUser_Text.getText().trim().equals(obj.getProperty("FirstName")));
         Thread.sleep(3000);
		 fn_Click(ClosePopup_BT);
		 Thread.sleep(3000);
		 fn_Click(Cancel_LK);
		 Thread.sleep(3000);
		 fn_ScrollDown500();
         Thread.sleep(2000);
		   readWriteExcel(58,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchUsername","Pass");
	      }
	     else{
	    	 readWriteExcel(58,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchUsername","Fail");
  	    	Thread.sleep(5000);
           }
           }
	
	
	
	public void fn_SelectAllUsers() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
         fn_Click(SelectUsers_LK);
         Thread.sleep(3000);
		 fn_Click(UserHeader_CB);
		 Thread.sleep(3000);
		 Assert.assertTrue(User1_CB.isSelected(), "Check box is not selected after selected");
		 fn_Click(UserHeader_CB);
		 Thread.sleep(3000);
		 Assert.assertFalse(User1_CB.isSelected(), "Check box is selected after deselected");
		 Thread.sleep(3000);
         fn_Click(ClosePopup_BT);
		 Thread.sleep(3000);
		 fn_ScrollDown500();
         Thread.sleep(2000);
		 fn_Click(Cancel_LK);
		 Thread.sleep(3000);
		 readWriteExcel(59,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectAllUsers","Pass");
		      }
		     else{
		    	 
	  	    	readWriteExcel(59,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectAllUsers","Fail");
	  	    	Thread.sleep(5000);
	           }
               }
	
	
	
	
	
	
	
//	public void fn_SelectAllUsers() throws InterruptedException, IOException{
//	    Properties obj = new Properties();   
//        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
//        obj.load(objfile);
//		Thread.sleep(3000);
//		if(Notiications_Lk.isDisplayed()){
// 	    Thread.sleep(2000);
// 	    fn_Click(Notiications_Lk);
// 	    Thread.sleep(3000);
//	    fn_Click(Create_BT);
//         Thread.sleep(3000);
//         fn_Click(SelectUsers_LK);
//		 Thread.sleep(3000);
//		 fn_Click(UserHeader_CB);
//		 Thread.sleep(3000);
//		 
//		 
////		int size =AllUsers_CB.size();
////		System.out.println(size);
////		 for(int i=0; i<=AllUsers_CB.size(); i++){
////          WebElement element=AllUsers_CB.get(i);
////   	     Assert.assertTrue(element.isSelected(), "Check box is not selected after selected");
////		 }
//		 Assert.assertTrue(User1_CB.isSelected(), "Check box is not selected after selected");
//		 
//		 
//		 fn_Click(UserHeader_CB);
//		 Thread.sleep(3000);
//		 Assert.assertFalse(User1_CB.isSelected(), "Check box is selected after deselected");
////		 for(int i=0; i<=AllUsers_CB.size(); i++){
////		     WebElement element=AllUsers_CB.get(i);
////			   	Assert.assertFalse(element.isSelected(), "Check box is selected after deselected");
////                 }
//		    fn_Click(ClosePopup_BT);
//			Thread.sleep(2000);
//		 readWriteExcel(59,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectAllUsers","Pass");
//		      }
//		     else{
//	  	    	readWriteExcel(59,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SelectAllUsers","Fail");
//	  	    	Thread.sleep(5000);
//	           }
//               }
	
	
	
	public void fn_SortingUsers() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
         fn_Click(SelectUsers_LK);
		 Thread.sleep(3000);
		String loginnamebefore=LoginName1_Text.getText().trim();
		fn_Click(LoginName_LK);
		 Thread.sleep(2000);
		String loginnameafter=LoginName1_Text.getText().trim();
		Thread.sleep(2000);
	    Assert.assertFalse(loginnamebefore.equals(loginnameafter), "Login name sorting not done");
		Thread.sleep(2000);
		fn_Click(LoginName_LK);
		 Thread.sleep(2000);
		 fn_Click(FirstName_LK);
		 Thread.sleep(2000);
		String firstnamebefore=SearchUser_Text.getText().trim();
		fn_Click(FirstName_LK);
		 Thread.sleep(2000);
		String firstnameafter=SearchUser_Text.getText().trim();
		 Thread.sleep(2000);
		Assert.assertFalse(firstnamebefore.equals(firstnameafter), "First name sorting not done");
		Thread.sleep(2000);
		 fn_Click(ClosePopup_BT);
		 Thread.sleep(2000);
		 fn_ScrollDown500();
         Thread.sleep(2000);
		 fn_Click(Cancel_LK);
		 Thread.sleep(3000);
		 readWriteExcel(60,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SortingUsers","Pass");
		 }
		 else{
			 readWriteExcel(60,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SortingUsers","Fail");
	  	    	Thread.sleep(5000);
	           }
	           }
	
	
	
	public void fn_Pagination() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
         fn_Click(SelectUsers_LK);
		 Thread.sleep(3000);
		 fn_Click(Page2_LK);
		 Thread.sleep(2000);
		 String loginnamebefore=LoginName1_Text.getText().trim();
		 fn_Click(Page1_LK);
		 Thread.sleep(2000);
		 String loginnameafter=LoginName1_Text.getText().trim();
		 Thread.sleep(2000);
		 Assert.assertFalse(loginnamebefore.equals(loginnameafter));
		 Thread.sleep(2000);
		 fn_Click(ClosePopup_BT);
		 Thread.sleep(2000);
		 fn_ScrollDown500();
         Thread.sleep(2000);
		 fn_Click(Cancel_LK);
		 Thread.sleep(3000);
		 readWriteExcel(61,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_Pagination","Pass");
		 }
		 else{
			 readWriteExcel(61,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_Pagination","Fail");
	  	    	Thread.sleep(5000);
	           }
	           }
	
	
	public void fn_CloseUsernameWindow() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
         fn_Click(SelectUsers_LK);
		 Thread.sleep(3000);
		 if(ClosePopup_BT.isDisplayed()){
		 fn_Click(ClosePopup_BT);
		 Thread.sleep(2000);
		 readWriteExcel(62,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CloseUsernameWindow","Pass");
		 }
		 else{
			 readWriteExcel(62,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CloseUsernameWindow","Fail");
	  	    	Thread.sleep(5000);
	           }
	           }
	          }
	
	
	public void fn_CancelCreatePage() throws InterruptedException, IOException{
	    Properties obj = new Properties();   
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
        obj.load(objfile);
		Thread.sleep(3000);
		if(Notiications_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Notiications_Lk);
 	    Thread.sleep(3000);
	     fn_Click(Create_BT);
         Thread.sleep(3000);
         fn_Click(Cancel_LK);
		 Thread.sleep(3000);
		 if(ViewNotification_Header.isDisplayed()){
		 Thread.sleep(2000);
		 readWriteExcel(63,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelCreatePage","Pass");
		 }
		 else{
			 readWriteExcel(63,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelCreatePage","Fail");
	  	    	Thread.sleep(5000);
	           }
	           }
	          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }
