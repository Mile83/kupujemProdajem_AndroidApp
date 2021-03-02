package pom_KupujemProdajem;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import Base.AppDriver;

public class WelcomeScreen {
	
	String closeBtn = "com.kupujemprodajem.android:id/welcome_screen_close";
	String screenTitleTxt = "com.kupujemprodajem.android:id/welcome_screen_title";
	String registerBtn = "com.kupujemprodajem.android:id/welcome_screen_register";
	String loginBtn ="com.kupujemprodajem.android:id/welcome_screen_login";
	
	
	//Close Button - Click
	public void clickWelcomeScreenCloseBtn() {
		AppDriver.getDriver().findElement(By.id(closeBtn)).click();
		System.out.println("Click on Close Button");
	}
	
	//Register Button - Click
	public void clickWelcomeScreenRegisterdBtn() {
		AppDriver.getDriver().findElement(By.id(registerBtn)).click();
		System.out.println("Click on Register Button");
	}
	
	
	//Login Button - Click
	public void clickWelcomeScreenLoginBtn() {
		AppDriver.getDriver().findElement(By.id(loginBtn)).click();
		System.out.println("Click on Login Button");
	}
	
	
	//Verify Welcome Screen Title 
	public void verifyWelcomeTitleTxt() {
		String welcomeTitleTxt = "Dobro došli na KupujemProdajem";
		String welcomeTitleTxtElement = AppDriver.getDriver().findElement(By.id(screenTitleTxt)).getText();
//		System.out.println(welcomeTitleTxtElement);
		assertTrue(welcomeTitleTxtElement.contains(welcomeTitleTxt));
	}
	
}
	
	
	
	
	
	


