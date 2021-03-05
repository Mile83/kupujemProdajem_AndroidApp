package pages;



import org.openqa.selenium.By;


import Base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;



public class NavigationBar {
	
	AppiumDriver<MobileElement> driver;
		
	String pocetnaBtn = "//android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Početna']";
	//String porukeBtn = "//android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@text='Poruke']";
	//String noviOglasBtn = "//android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[@text='Novi oglas']";
	//String obavestenjaBtn = "//android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@text='Obaveštenja']";
	String mojKPBtn = "//android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Moj kp']";

	//@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Po�?etna']")
	//MobileElement pocetnaBtn;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@text='Poruke']")
	MobileElement porukeBtn;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[@text='Novi oglas']")
	MobileElement noviOglasBtn;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@text='Obaveštenja']")
	MobileElement obavestenjaBtn;
	
	//@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='Moj kp']")
	//MobileElement mojKPBtn;
	

	//Moj KP Button - Click
	public void clickNavigationBarMojKPButton() {
		AppDriver.getDriver().findElement(By.xpath(mojKPBtn)).click();
		System.out.println("Click on Moj KP Button");
	}
	
	
	//Moj KP Button - Click
	public void clickNavigationBarPocetnaButton() {
		AppDriver.getDriver().findElement(By.xpath(pocetnaBtn)).click();
		System.out.println("Click on Pocetna Button");
	}
	
	
	
/*
	public void clickNavigationBarMojKPButton() {
		System.out.println("Click on Moj KP Button");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOf(mojKPBtn));
		mojKPBtn.click();
	}
	*/
}
	
	
	
	
	
	


