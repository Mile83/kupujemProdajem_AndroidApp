package pages;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import Base.AppDriver;

public class LogOutPopUpMsg {
	
	String msgTitle = "com.kupujemprodajem.android:id/dialog_confirmation_message";
	String neBtn = "com.kupujemprodajem.android:id/dialog_confirmation_no";
	String daBtn = "com.kupujemprodajem.android:id/dialog_confirmation_yes";
	
		
	
	
	//Verify Welcome Screen Title 
	public void verifyWelcomeTitleTxt() {
		String msgTitleTxt = "Da li ste sigurni da želite da se izlogujete?";
		String msgTitleElement = AppDriver.getDriver().findElement(By.id(msgTitle)).getText();
//		System.out.println(msgTitleElement);
		assertTrue(msgTitleElement.contains(msgTitleTxt));
	}
	
	//Ne Button - Click
	public void clickLogOutPopUpMsgNeBtn() {
		AppDriver.getDriver().findElement(By.id(neBtn)).click();
		System.out.println("Click on Ne Button");
	}
	
	//Da Button - Click
	public void clickLogOutPopUpMsgDaBtn() {
		AppDriver.getDriver().findElement(By.id(daBtn)).click();
		System.out.println("Click on Da Button");
	}
	
	
}
	
	
	
	


	


