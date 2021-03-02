package pom_KupujemProdajem;


import org.openqa.selenium.By;

import Base.AppDriver;

public class BrisanjeKorisnikaPopUpMsg {
	
	String msgTitle = "com.kupujemprodajem.android:id/dialog_confirmation_title"; /* Da li ste sigurni? */
	String msgDetailTitle = "com.kupujemprodajem.android:id/dialog_confirmation_message"; /* Brisanjem ovog korisnika iz adresara izgubićete i beleške o njemu */
	String odustaniBtn = "com.kupujemprodajem.android:id/dialog_confirmation_no";
	String obrisiBtn = "com.kupujemprodajem.android:id/dialog_confirmation_yes";
	
	
	//Odustani Button - Click
	public void clickBrisanjeKorisnikaPopUpMsgOdustaniBtn() {
		AppDriver.getDriver().findElement(By.id(odustaniBtn)).click();
		System.out.println("Click on Odustani Button");
	}
	
	//Obrisi Button - Click
	public void clickBrisanjeKorisnikaPopUpMsgObrisiBtn() {
		AppDriver.getDriver().findElement(By.id(obrisiBtn)).click();
		System.out.println("Click on Obrisi Button");
	}
	
	
}
	
	
	
	


	


