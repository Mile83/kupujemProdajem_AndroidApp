package pom_KupujemProdajem;


import org.openqa.selenium.By;

import Base.AppDriver;

public class KorisnikDodatUAdresarPopUp {
	
		
	String dialogBox = "com.kupujemprodajem.android:id/dialog_address_book_entry_note_edit_text";
	String odustaniBtn ="com.kupujemprodajem.android:id/dialog_address_book_entry_note_cancel";
	String sacuvajBeleskeBtn ="com.kupujemprodajem.android:id/dialog_address_book_entry_note_save";
	
	
	//Enter Dialog Txt
	public void inputKorisnikDodatUAdresarPopUpDialogBox(String dialog) {
		AppDriver.getDriver().findElement(By.id(dialogBox)).sendKeys(dialog);
		System.out.println("Entering Dialog Txt: " + dialog);
	}
	
	//Odustani Button - Click
	public void clickKorisnikDodatUAdresarPopUpOdustaniBtn() {
		AppDriver.getDriver().findElement(By.id(odustaniBtn)).click();
		System.out.println("Click on Odustani Button");
	}

	//Sacuvaj Beleske Button - Click
	public void clickKorisnikDodatUAdresarPopUpSacuvajBeleskeBtn() {
		AppDriver.getDriver().findElement(By.id(sacuvajBeleskeBtn)).click();
		System.out.println("Click on Sacuvaj Beleske Button");
	}

	
	
	
	
	
}
	
	
	
	
	
	


