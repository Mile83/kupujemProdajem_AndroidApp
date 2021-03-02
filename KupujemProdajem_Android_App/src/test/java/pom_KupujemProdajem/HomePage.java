package pom_KupujemProdajem;


import org.openqa.selenium.By;

import Base.AppDriver;

public class HomePage {
	
		
	String searchBox = "com.kupujemprodajem.android:id/edit_text_search";
	String mestoBtn= "com.kupujemprodajem.android:id/activity_main_place";
	
	
	
	//Search Button - Click
	public void clickHomePageSearchBox() {
		AppDriver.getDriver().findElement(By.id(searchBox)).click();
		System.out.println("Click on Search Box");
	}
	
	//Enter Search Txt
	public void inputHomePageSearchTxt(String search) {
		AppDriver.getDriver().findElement(By.id(searchBox)).sendKeys(search);
		System.out.println("Entering Search parameters: " + search);
	}
	
		
	//Mesto Button - Click
	public void clickHomePageMestoBtn() {
		AppDriver.getDriver().findElement(By.id(mestoBtn)).click();
		System.out.println("Click on Mesto Button");
	}
	
	
	
	
	
	
	

	
}
	
	
	
	
	
	


