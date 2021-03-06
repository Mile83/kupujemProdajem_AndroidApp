package testCases;

import java.net.MalformedURLException;

import org.testng.annotations.*;

import Base.*;
import pages.*;
import reusableTestStepBlock.*;



public class Adresar_TestSuite {
	
		@BeforeSuite()
		public void setupServicesApplication() throws MalformedURLException{
			//Setup all Services and App
			AppSetupLocal.AndroidSetup();
		}
		
		@BeforeTest
		@Parameters({ "username", "password" })
		public void loginUserToApp(String usernameNG, String passwordNG ){
			//Login to App with valid credentials
			LogIn logIn = new LogIn();
			logIn.logInUser(usernameNG, passwordNG);
		}
		
		@AfterTest
		public void logingOutUserFromApp() {
			//LogOut User from App
			LogOut logOut = new LogOut();
			logOut.logOutUser();
		}
		
		@AfterSuite
		public void shutdownServicesApplication() throws InterruptedException{
			//Stopping all Services and App
			AppSetupLocal.stopApp();
			AppSetupLocal.closeDriver();
		}
		
		/* TC_003_Adresar_Add_Conntact_To_AddressBook_Note - Successfully add a user to the Address Book with a comment in the note
		 * This test case checks the possibility of inserting contacts into the address book. 
		 * The user logs in, selects any ad and contact from it. Saves contact together with the note. 
		 * It goes to the address book and checks if it is that saved contact by verifying the contact name and note. 
		 * After all, it deletes the contact and the user logs out of the application.
		 */ 
		@Test (retryAnalyzer = listeners.MyRetry.class)
		@Parameters({ "searchParameter", "dialogTxt" })
		public void TC_003_Adresar_Add_Contact_To_AddressBook_Note(String searchParameterNG, String dialogTxtNG) throws InterruptedException {
			
			//Add Contact to Address book
			AddContact addContact = new AddContact();
			addContact.AddContactToAddressBook(searchParameterNG, dialogTxtNG);
						
			//Navigate to Address book
			//Click on Moj KP
			NavigationBar navigationBar = new NavigationBar();
			navigationBar.clickNavigationBarMojKPButton();
			
			//Click on Adresar
			MojKP mojKP = new MojKP();
			mojKP.clickAdresarBtn();
			
			//Verify added Contact
			//Verify Owner Name
			Adresar adresar = new Adresar();
			adresar.verifyAdresarOwnerNameTxt();
			//Verify Dialog Txt
			adresar.verifyAdresarDialogTxt(dialogTxtNG);
			
			//Deleting The Contact
			//Click on X Button
			adresar.clickXBtn();
			//Click on Obrisi Button
			BrisanjeKorisnikaPopUpMsg brisanjeKorisnikaPopUpMsg = new BrisanjeKorisnikaPopUpMsg();
			brisanjeKorisnikaPopUpMsg.clickBrisanjeKorisnikaPopUpMsgObrisiBtn();
			
			
		}

}
