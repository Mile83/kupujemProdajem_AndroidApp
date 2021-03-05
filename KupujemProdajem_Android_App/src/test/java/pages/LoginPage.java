package pages;


import org.openqa.selenium.By;

import Base.AppDriver;

public class LoginPage {
	
		
	String emailTxt = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@text='ime.prezime@email']";
	String passwordTxt = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText";
	String loginBtn = "com.kupujemprodajem.android:id/button_login";

		
	//Enter Email Txt
	public void inputLoginEmailTxt(String username) {
		AppDriver.getDriver().findElement(By.xpath(emailTxt)).sendKeys(username);
		System.out.println("Entering Email: " + username);
	}
	
	//Enter Password Txt
	public void inputLoginPasswordTxt(String password) {
		AppDriver.getDriver().findElement(By.xpath(passwordTxt)).sendKeys(password);
		System.out.println("Entering Password: " + password);
	}
	
	//Close Button - Click
	public void clickLoginLoginBtn() {
		AppDriver.getDriver().findElement(By.id(loginBtn)).click();
		System.out.println("Click on Ulogujte se Button");
	}
	
	
}
	
	
	
	
	
	


