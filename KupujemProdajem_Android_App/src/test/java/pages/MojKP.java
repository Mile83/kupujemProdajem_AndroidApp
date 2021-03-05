package pages;


import org.openqa.selenium.By;

import Base.AppDriver;

public class MojKP {
	
	String adresarBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]";
	//String izlogujteSeBtn = "android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[16]/android.widget.TextView[@text='Izlogujte se']";
	String izlogujteSeBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[16]";
		
	
	//Adresar Button - Click
	public void clickAdresarBtn() {
		AppDriver.getDriver().findElement(By.xpath(adresarBtn)).click();
		System.out.println("Click on Adresar Button");
		
	}
	
	//Izlogujte Se Button - Click
	public void clickIzlogujteSeBtn() {
		AppDriver.getDriver().findElement(By.xpath(izlogujteSeBtn)).click();
		System.out.println("Click on Izlogujte Se Button");
	}
	
	
}
	
	
	
	


	


