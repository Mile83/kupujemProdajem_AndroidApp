package reusableTestStepBlock;

import pages.*;

public class AddContact {
	
		// Reusable Test Step Block - Add Contact to Address book
		/* This Reusable Test Step Block goes through the process of inserting a contact into the address book with note.
		 * The prerequisite is that the user is logged in to the Application.
		 * He uses the location of Novi Sad as an ad place
		 * And "Burton cizme" as a search parameter.
		 * And it Buffers values for Ad Owner for later verification
		 * Note Txt is "Ovo je proba za Test Case 007"
		 */
	
		public void AddContactToAddressBook(String searchParameter, String dialogTxtNG) {	
		
		//Clisk on Pocetna Button
		NavigationBar navigationBar = new NavigationBar();
		navigationBar.clickNavigationBarPocetnaButton();
		
		//Click on Mesto Button
		HomePage homePage = new HomePage();
		homePage.clickHomePageMestoBtn();
		
		//Click on Novi Sad Button
		MestoPage mestoPage = new MestoPage();
		mestoPage.clickMestoPageNoviSadaBtn();
		
		//Click on Search Box 
		homePage.clickHomePageSearchBox();
		
		//Enter Search Parametars
		PretragePage pretragePage = new PretragePage();
		pretragePage.inputPretragaPageSearchBox(searchParameter);
		
		//Click Ok Button
		pretragePage.clickPretragePageOkBtn();
		
		//Click on First Search Results
		pretragePage.clickPretragePageFirstContainer();
		
		//Buffer Owner Name Value
		AdPage.setBufferOwnerNameTxt();
		
		//Click on Dodaj U Adresar Button
		AdPage adPage = new AdPage();
		adPage.clickAdPageDodajUAdresarBtn();
		
		//Enter Dialog Txt
		KorisnikDodatUAdresarPopUp korisnikDodatUAdresarPopUp = new KorisnikDodatUAdresarPopUp();
		korisnikDodatUAdresarPopUp.inputKorisnikDodatUAdresarPopUpDialogBox(dialogTxtNG);
		
		//Click on Sacuvaj Beleske Button
		korisnikDodatUAdresarPopUp.clickKorisnikDodatUAdresarPopUpSacuvajBeleskeBtn();
}
}