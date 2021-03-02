package pom_KupujemProdajem;


import org.openqa.selenium.By;

import Base.AppDriver;

public class AdPage {
	
		
	static String ownerNameTxt = "com.kupujemprodajem.android:id/fragment_ad_owner_name";
	String dodajUAdresarBtn= "com.kupujemprodajem.android:id/view_ad_contact_info_addressbook_wrapper";
	
	public static String bufferOwnerNameTxt = "";
	
		
	//Buffer Owner Name
	public static void setBufferOwnerNameTxt() {
		AdPage.bufferOwnerNameTxt = AppDriver.getDriver().findElement(By.id(ownerNameTxt)).getText();
		String strNew = bufferOwnerNameTxt.replaceFirst(" offline", ""); 
		AdPage.bufferOwnerNameTxt = strNew;
		System.out.println("Buffered Value for Owner Name:" + AdPage.bufferOwnerNameTxt);
	}
	

	//Dodaj U Adresar Button - Click
	public void clickAdPageDodajUAdresarBtn() {
		AppDriver.getDriver().findElement(By.id(dodajUAdresarBtn)).click();
		System.out.println("Click on Dodaj U Adresar Button");
	}


	
}
	
	
	
	
	
	


