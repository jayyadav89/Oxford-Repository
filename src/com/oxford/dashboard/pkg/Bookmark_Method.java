package com.oxford.dashboard.pkg;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.oxford.generic.pkg.Generic_Methods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Bookmark_Method extends Generic_Methods {
	
	
	@FindBy(xpath = "//li[@id='lnkBookMarks']/div[2]")
	public WebElement Bookmarks_Lk;
	
	@FindBy(xpath = "//div[@id='lessonPlanCtrl']//select")
	public WebElement ClassSubject_DD;
	
	@FindBy(id = "txtSearch")
	public WebElement search_TB;
	
	@FindBy(xpath = "//div[@id='custom-search-input']/div/span/button")
	public WebElement Search_BT;
	
	@FindBy(xpath = "//div[@class='row']/div//div[3]")
	public WebElement Searched_Text;
	
	@FindBy(id = "plyContent")
	public WebElement PlayContent_BT;
	
	@FindBy(xpath = "//div[@id='ngdialog1']/div[2]/div[2]")
	public WebElement Close_Icon;
	
	@FindBy(id = "playChk")
	public WebElement Content_CB;
	
	@FindBy(xpath = "//div[@class='row']//div[3]/div/div[3]")
	public WebElement Play_Icon;
	
	@FindBy(xpath = "//div[@class='row']/div[3]/div/div")
	public WebElement Remove_Icon;
	
	@FindBy(id= "popup_ok")
	public WebElement Ok_BT;
	
	@FindBy(id= "popup_message")
	public WebElement Popup_TX;
	
	
	
	
	public void fn_ViewBookmarkedresources() throws InterruptedException, IOException{
	//	fn_Login();
		Thread.sleep(2000);
		if(Bookmarks_Lk.isDisplayed()){
 	    Thread.sleep(2000);
 	    fn_Click(Bookmarks_Lk);
 	    Thread.sleep(3000);
 	    fn_SelectbyIndex(ClassSubject_DD,1);
 	    Thread.sleep(2000);
 	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewBookmarkedresources","Pass"); 
// 	    readWriteExcel(31,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewBookmarkedresources","Pass");
	      }
	     else{
	    	 readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_ViewBookmarkedresources","Fail"); 
//  	    	readWriteExcel(31,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_ViewBookmarkedresources","Fail");
  	    	Thread.sleep(5000);
           }
	      }
	
	
	
	public void fn_SearchBookmark() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(Bookmarks_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Bookmarks_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(ClassSubject_DD,1);
	 	    Thread.sleep(2000);
	 	    fn_Input(search_TB,"test");
	 	    fn_Click(Search_BT);
	 	    Thread.sleep(2000);
	 	    if(Searched_Text.getText().trim().contains("test")){
	 	    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchBookmark","Pass"); 
//	 	    	readWriteExcel(32,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchBookmark","Pass");
		      }
		     else{
		    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_SearchBookmark","Fail"); 
//	  	    	readWriteExcel(32,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_SearchBookmark","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	       }
	
	
	public void fn_PlayBookmarkedOneByOne() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(Bookmarks_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Bookmarks_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(ClassSubject_DD,1);
	 	    Thread.sleep(3000);
	 	  if(PlayContent_BT.isDisplayed()){
	 	    	fn_Click(PlayContent_BT);
		 	    Thread.sleep(2000);
		 	   fn_Click(Close_Icon);
		 	    Thread.sleep(2000);
		 	   readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PlayBookmarkedOneByOne","Pass");
//	 	    	readWriteExcel(33,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PlayBookmarkedOneByOne","Pass");
		      }
		     else{
		    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PlayBookmarkedOneByOne","Fail");
//	  	    	readWriteExcel(33,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PlayBookmarkedOneByOne","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	       }
	
	
	
	public void fn_IndividualBookmarked() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(Bookmarks_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Bookmarks_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(ClassSubject_DD,1);
	 	    Thread.sleep(3000);
	 	    fn_Click(Content_CB);
	 	   if(PlayContent_BT.isDisplayed()){
	 	    	fn_Click(PlayContent_BT);
		 	    Thread.sleep(2000);
		 	    fn_Click(Close_Icon);
		 	    Thread.sleep(2000);
		 	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_IndividualBookmarked","Pass");
//	 	    	readWriteExcel(34,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_IndividualBookmarked","Pass");
		      }
		     else{
		    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_IndividualBookmarked","Fail");
//	  	    	readWriteExcel(34,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_IndividualBookmarked","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	         }     
	
	
	public void fn_PreviewContent() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(Bookmarks_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Bookmarks_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(ClassSubject_DD,1);
	 	    Thread.sleep(2000);
	 	   if(Play_Icon.isDisplayed()){
	 	    	fn_Click(Play_Icon);
		 	    Thread.sleep(2000);
		 	    WindowHandling();
		 	    Thread.sleep(2000);
		 	    readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewContent","Pass");
//	 	    	readWriteExcel(35,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewContent","Pass");
		      }
		     else{
		    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_PreviewContent","Fail");
//	  	    	readWriteExcel(35,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_PreviewContent","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	          }
	
	
	
	public void fn_RemoveBookmarked() throws InterruptedException, IOException{
		//	fn_Login();
			Thread.sleep(2000);
			if(Bookmarks_Lk.isDisplayed()){
	 	    Thread.sleep(2000);
	 	    fn_Click(Bookmarks_Lk);
	 	    Thread.sleep(3000);
	 	    fn_SelectbyIndex(ClassSubject_DD,1);
	 	    Thread.sleep(2000);
	 	   fn_Click(Remove_Icon);
	 	    Thread.sleep(2000);
	 	   if(Popup_TX.isDisplayed()){
	 	    	Assert.assertTrue(Popup_TX.getText().trim().equals("Bookmark removed successfully"));
				Thread.sleep(2000);
				 fn_Click(Ok_BT);
				 Thread.sleep(2000);
				readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RemoveBookmarked","Pass");
//	 	    	readWriteExcel(36,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveBookmarked","Pass");
		      }
		     else{
		    	readWriteExcel2("D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Automation","fn_RemoveBookmarked","Fail");
//	  	    	readWriteExcel(36,3,"D:\\Oxford Workspace\\Oxford Advantage\\Advantage Test Cases.xlsx","Advantage","fn_RemoveBookmarked","Fail");
	  	    	Thread.sleep(5000);
	           }
		      }
	          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
         }
