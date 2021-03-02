package pom_KupujemProdajem;


import org.openqa.selenium.By;

import Base.AppDriver;

public class PretragePage {
	
		
	String okBtn = "com.kupujemprodajem.android:id/fragment_search_ok";
	String searchBox= "com.kupujemprodajem.android:id/fragment_search_edit_text";
	String firstContainer = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout";
	
			
	//Ok Button - Click
	public void clickPretragePageOkBtn() {
		AppDriver.getDriver().findElement(By.id(okBtn)).click();
		System.out.println("Click on Ok Button");
	}
	
	//Enter Search Txt
	public void inputPretragaPageSearchBox(String searchParameter) {
		AppDriver.getDriver().findElement(By.id(searchBox)).sendKeys(searchParameter);
		System.out.println("Entering Search parameters: " + searchParameter);
	}
	
	
	//First Container - Click
	public void clickPretragePageFirstContainer() {
		AppDriver.getDriver().findElement(By.xpath(firstContainer)).click();
		System.out.println("Click on First Search Results");
	}

	
}
	
	
	
	
	
	


