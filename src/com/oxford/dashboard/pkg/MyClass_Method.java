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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyClass_Method extends Generic_Methods{

	ExtentReports report;
	ExtentTest logger;
//	report=new ExtentReports();
	
	@FindBy(xpath = "//li[@id='lnkClassAdministration']/div[2]")
	public WebElement MyClass_Lk;
	
	@FindBy(id = "CPH_ddlClass")
	public WebElement Class_DD;  
	
	@FindBy(id = "CPH_ddlSection")
	public WebElement Section_DD;
	
	@FindBy(id = "CPH_rptStudentList_chkUserId_0")
	public WebElement Student_CB;
	
	@FindBy(id = "CPH_rptStudentList_chkUserId_1")
	public WebElement Student1_CB;
	
	@FindBy(id = "CPH_rptStudentList_img_letter_0")
	public WebElement WelcomeLetter_Icon1;
	
	@FindBy(xpath = "//div[@id='divwelcomeletter']/a")
	public WebElement WelcomeLetter_Lk;
	
	@FindBy(xpath = "//a[@id='CPH_rptStudentList_lnkTempPassword_0']/img")
	public WebElement TempPassword1_Lk;
	
	@FindBy(xpath = "//div[@id='dvdisplay']/span")
	public WebElement TempPassword1_Text;
	
	@FindBy(id = "CPH_lnkCbgrpCreate")
	public WebElement ManageGrp_LK;
	
	@FindBy(id = "CPH_txtSearch")
	public WebElement SearchGroup_TB;
	
	@FindBy(id = "CPH_lnkSearch")
	public WebElement SearchGroup_BT;
	
	@FindBy(id = "CPH_repGroups_lblGroupName_0")
	public WebElement GroupName_Label;
	
	@FindBy(xpath = "//a[@id='CPH_lnkCbtnCreate']/span")
	public WebElement Create_LK;
	
	@FindBy(id = "CPH_txtGroupName")
	public WebElement GroupName_TB;
	
	@FindBy(id = "CPH_txtGroupDescription")
	public WebElement Desc_TB;
	
	@FindBy(xpath = "//a[@id='CPH_lnkbtnAddUser']/span")
	public WebElement AddRemove_LK;
	
	
	@FindBy(id = "iTestUser")
	public WebElement User_Iframe;
	
	
	
	@FindBy(id = "repUsers_ChkItem_0")
	public WebElement User1_CB;
	
	@FindBy(id = "repUsers_ChkItem_1")
	public WebElement User2_CB;
	
	@FindBy(id = "lnkBtnAdd")
	public WebElement AddRemove_BT;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	@FindBy(id= "CPH_Checkbox1")
	public WebElement SelectAll_CB;
	
	@FindBy(id= "CPH_lnkBtnSave")
	public WebElement Save_BT;
	
	@FindBy(id= "CPH_lnkBtnCancel")
	public WebElement Cancel_BT;
	
	@FindBy(id= "lblHeadertext")
	public WebElement ManageGroup_Label;
	
	@FindBy(id= "CPH_repGroups_img_edit_0")
	public WebElement EditGroup_Icon;
	
	@FindBy(xpath = "//a[@id='CPH_lnkDelete']/span")
	public WebElement Delete_LK;
	
	@FindBys({@FindBy(xpath = "//a[@id='CPH_UpdatepnlGroup']")})
	public List<WebElement> TotalGroups_LK;
	
	@FindBy(id= "CPH_repGroups_chkItem_0")
	public WebElement Group1_CB;
	
	
	
	
	
	public void fn_ViewStudentsDetail() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(Class_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Section_DD,0);
	 	    Thread.sleep(2000);
//	 	   logger.log(LogStatus.INFO, "Students detail are present: Passed"); 
	 	  if(Student_CB.isDisplayed()){
	 	     readWriteExcel(37,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentsDetail","Pass");
		      }
		     else{
//		    	 logger.log(LogStatus.INFO, "Students detail are not present: Passed");
	  	    	readWriteExcel(37,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewStudentsDetail","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	         }
	
	
	
	public void fn_WlcmLtrToAnAdmission() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(Class_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Section_DD,0);
	 	    Thread.sleep(2000);
//	 	   logger.log(LogStatus.INFO, "Students detail are present: Passed"); 
	 	  if(Student_CB.isDisplayed()){
	 		 fn_Click(Student_CB);
	 		 Thread.sleep(2000);
	 		 fn_Click(WelcomeLetter_Icon1);
	 		 Thread.sleep(2000);
	 		 
	 		 readWriteExcel(38,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_WlcmLtrToAnAdmission","Pass");
		      }
		     else{
//		    	 logger.log(LogStatus.INFO, "Students detail are not present: Passed");
	  	    	readWriteExcel(38,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_WlcmLtrToAnAdmission","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	         }
	
	
	
	public void fn_WlcmLtrMorethanOneAdmission() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(Class_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Section_DD,0);
	 	    Thread.sleep(2000);
//	 	   logger.log(LogStatus.INFO, "Students detail are present: Passed"); 
	 	  if(Student_CB.isDisplayed()){
	 		 fn_Click(Student_CB);
	 		 Thread.sleep(2000);
	 		fn_Click(Student1_CB);
	 		 Thread.sleep(2000);
	 		 fn_Click(WelcomeLetter_Lk);
	 		 Thread.sleep(2000);
	 		 
	 		 readWriteExcel(39,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_WlcmLtrMorethanOneAdmission","Pass");
		      }
		     else{
//		    	 logger.log(LogStatus.INFO, "Students detail are not present: Passed");
	  	    	readWriteExcel(39,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_WlcmLtrMorethanOneAdmission","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	         }
	
	
	
	public void fn_TempPassword() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(Class_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Section_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_Click(TempPassword1_Lk);
	 	    Thread.sleep(2000);
           if(TempPassword1_Text.isDisplayed()){
	 		 Thread.sleep(2000);
	 		readWriteExcel(40,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TempPassword","Pass");
		      }
		     else{
//		    	 logger.log(LogStatus.INFO, "Students detail are not present: Passed");
	  	    	readWriteExcel(40,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_TempPassword","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	         }
	
	
	
	
	public void fn_ViewDetailsofGroup() throws InterruptedException, IOException{
		//	fn_Login();
		    Properties obj = new Properties();   
  	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	        obj.load(objfile);
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(2000);
	 	    fn_Click(ManageGrp_LK);
	 	    Thread.sleep(3000);
	 	    SearchGroup_TB.clear();
	 	    Thread.sleep(2000);
	 	   fn_Input(SearchGroup_TB,obj.getProperty("GroupName"));
	 	    Thread.sleep(2000);
	 	    fn_Click(SearchGroup_BT);
	 	    Thread.sleep(2000);
           if(GroupName_Label.getText().trim().contains(obj.getProperty("GroupName"))){
	 		 Thread.sleep(2000);
	 		readWriteExcel(41,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewDetailsofGroup","Pass");
		      }
		     else{
//		    	 logger.log(LogStatus.INFO, "Students detail are not present: Passed");
	  	    	readWriteExcel(41,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewDetailsofGroup","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	         }
	
	
	
	
	public void fn_CreateNewGroup() throws InterruptedException, IOException{
		//	fn_Login();
		    Properties obj = new Properties();   
  	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	        obj.load(objfile);
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(2000);
	 	    fn_Click(ManageGrp_LK);
	 	    Thread.sleep(3000);
	 	    fn_Click(Create_LK);
	 	    Thread.sleep(3000);
	 	    fn_Input(GroupName_TB,obj.getProperty("GroupName"));
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Class_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Section_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_Input(Desc_TB,obj.getProperty("GroupDesc"));
	 	    Thread.sleep(2000);
	 	    fn_Click(AddRemove_LK);
	 	    Thread.sleep(3000);
	 	    driver.switchTo().frame(User_Iframe);
	 	    fn_Click(User1_CB);
	 	    fn_Click(User2_CB);
	 	    Thread.sleep(2000);
	 	    fn_Click(AddRemove_BT);
	 	    Thread.sleep(3000);
	 	   Assert.assertTrue(Popup_TX.getText().trim().equals("Students updated to group successfully"));
			Thread.sleep(2000);
			 fn_Click(Ok_BT);
			 Thread.sleep(3000);
			 fn_Click(SelectAll_CB);
			 Thread.sleep(2000);
			 fn_Click(Save_BT);
			 Thread.sleep(3000);
	 	   if(Popup_TX.isDisplayed()){
		 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("Group created successfully"));
					Thread.sleep(2000);
					 fn_Click(Ok_BT);
					 Thread.sleep(2000);
		 	    	readWriteExcel(42,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateNewGroup","Pass");
			      }
			     else{
		  	    	readWriteExcel(42,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CreateNewGroup","Fail");
		  	    	Thread.sleep(5000);
		           }
		      }
	         }
	
	
	
	public void fn_ValidationGrpNameField() throws InterruptedException, IOException{
		//	fn_Login();
		    Properties obj = new Properties();   
  	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	        obj.load(objfile);
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(2000);
	 	    fn_Click(ManageGrp_LK);
	 	    Thread.sleep(3000);
	 	    fn_Click(Create_LK);
	 	    Thread.sleep(3000);
	 	    fn_Click(Save_BT);
			 Thread.sleep(3000);
	 	   if(Popup_TX.isDisplayed()){
		 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("Enter group name"));
					Thread.sleep(2000);
					 fn_Click(Ok_BT);
					 Thread.sleep(2000);
		 	    	readWriteExcel(43,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationGrpNameField","Pass");
			      }
			     else{
		  	    	readWriteExcel(43,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ValidationGrpNameField","Fail");
		  	    	Thread.sleep(5000);
		           }
		      }
	         }
	
	
	
	public void fn_CancelCreateGrpPage() throws InterruptedException, IOException{
		//	fn_Login();
		    Properties obj = new Properties();   
  	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	        obj.load(objfile);
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(2000);
	 	    fn_Click(ManageGrp_LK);
	 	    Thread.sleep(3000);
	 	    fn_Click(Create_LK);
	 	    Thread.sleep(3000);
	 	    fn_Click(Cancel_BT);
			 Thread.sleep(3000);
	 	   if(ManageGroup_Label.isDisplayed()){
		 	    	Assert.assertTrue(ManageGroup_Label.getText().trim().equalsIgnoreCase("Manage groups"));
					Thread.sleep(2000);
					 readWriteExcel(44,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelCreateGrpPage","Pass");
			      }
			     else{
		  	    	readWriteExcel(44,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelCreateGrpPage","Fail");
		  	    	Thread.sleep(5000);
		           }
		          }
	             }
	
	
	
	public void fn_EditGroup() throws InterruptedException, IOException{
		//	fn_Login();
		    Properties obj = new Properties();   
  	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	        obj.load(objfile);
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(2000);
	 	    fn_Click(ManageGrp_LK);
	 	    Thread.sleep(2000);
	 	    SearchGroup_TB.clear();
	 	    Thread.sleep(2000);
	 	    fn_Input(SearchGroup_TB,obj.getProperty("GroupName"));
	 	    Thread.sleep(2000);
	 	    fn_Click(SearchGroup_BT);
	 	    Thread.sleep(2000);
	 	    fn_Click(EditGroup_Icon);
	 	    Thread.sleep(2000);
	 	    GroupName_TB.clear();
	 	   fn_Input(GroupName_TB,obj.getProperty("UpdateGroupName"));
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Class_DD,0);
	 	    Thread.sleep(2000);
	 	    fn_SelectbyIndex(Section_DD,0);
	 	    Thread.sleep(2000);
	 	    Desc_TB.clear();
	 	    fn_Input(Desc_TB,obj.getProperty("UpdateGroupDesc"));
	 	    Thread.sleep(2000);
	 	     fn_Click(Save_BT);
			 Thread.sleep(3000);
	 	   if(Popup_TX.isDisplayed()){
		 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("Group updated successfully"));
					Thread.sleep(2000);
					fn_Click(Ok_BT);
					Thread.sleep(2000);
					SearchGroup_TB.clear();
				 	Thread.sleep(2000);
				 	fn_Input(SearchGroup_TB,obj.getProperty("UpdateGroupName"));
				 	Thread.sleep(2000);
				 	fn_Click(SearchGroup_BT);
				 	Thread.sleep(2000);
			       if(GroupName_Label.getText().trim().contains(obj.getProperty("GroupName"))){
				 	Thread.sleep(2000);
				    readWriteExcel(45,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditGroup","Pass");
					      }	 
					    }
			     else{
		  	    	readWriteExcel(45,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_EditGroup","Fail");
		  	    	Thread.sleep(5000);
		           }
		          }
	             }
	
	
	
	
	public void fn_CancelEditGrpPage() throws InterruptedException, IOException{
		//	fn_Login();
		    Properties obj = new Properties();   
  	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	        obj.load(objfile);
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(2000);
	 	    fn_Click(ManageGrp_LK);
	 	    Thread.sleep(3000);
	 	    fn_Click(EditGroup_Icon);
	 	    Thread.sleep(3000);
	 	    fn_Click(Cancel_BT);
			 Thread.sleep(3000);
	 	   if(ManageGroup_Label.isDisplayed()){
		 	    	Assert.assertTrue(ManageGroup_Label.getText().trim().equalsIgnoreCase("Manage groups"));
					Thread.sleep(2000);
					 readWriteExcel(46,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelEditGrpPage","Pass");
			      }
			     else{
		  	    	readWriteExcel(46,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_CancelEditGrpPage","Fail");
		  	    	Thread.sleep(5000);
		           }
		          }
	             }
	
	
	
	public void fn_DeleteGroup() throws InterruptedException, IOException{
		//	fn_Login();
		    Properties obj = new Properties();   
  	        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
  	        obj.load(objfile);
			Thread.sleep(2000);
			if(MyClass_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(MyClass_Lk);
	 	    Thread.sleep(2000);
	 	    fn_Click(ManageGrp_LK);
	 	    Thread.sleep(3000);
	 	  int totalgrpbefore=TotalGroups_LK.size();
	 	  System.out.println(totalgrpbefore);
	 	    fn_Click(Group1_CB);
	 	    Thread.sleep(3000);
	 	    fn_Click(Delete_LK);
			 Thread.sleep(3000);
		  Assert.assertTrue(Popup_TX.getText().trim().equals("Are you sure you want to delete?"));
				Thread.sleep(2000);
				fn_Click(Ok_BT);
				Thread.sleep(2000);
			 if(Popup_TX.isDisplayed()){
				 Assert.assertTrue(Popup_TX.getText().trim().equals("Group(s) deleted successfully"));
					Thread.sleep(2000);
					fn_Click(Ok_BT);
					Thread.sleep(2000);
				 int totalgrpafter=TotalGroups_LK.size();
				 	  System.out.println(totalgrpafter);
				 	 if(totalgrpbefore>totalgrpafter){
					readWriteExcel(47,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteGroup","Pass");
			      }
			     else{
		  	    	readWriteExcel(47,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_DeleteGroup","Fail");
		  	    	Thread.sleep(5000);
		           }
		          }
	             }
	            }
	
	
	
	
	
	
	
	
	
	
}
