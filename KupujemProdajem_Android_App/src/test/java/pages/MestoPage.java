package pages;


import org.openqa.selenium.By;

import Base.AppDriver;

public class MestoPage {
	
		
	//String noviSadBtn = "androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView[@text='Novi Sad']";
	
	String noviSadBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[5]";
	
	//Novi Sad Button - Click
	public void clickMestoPageNoviSadaBtn() {
		AppDriver.getDriver().findElement(By.xpath(noviSadBtn)).click();
		System.out.println("Click on Novi Sad Button");
	}
	
	
	
	
	

	
	
}
	
	
	
	
	
	


