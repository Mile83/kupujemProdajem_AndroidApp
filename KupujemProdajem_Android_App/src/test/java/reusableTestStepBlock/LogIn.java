package reusableTestStepBlock;

import pages.LoginPage;


public class LogIn {
	
	// Reusable Test Step Block - LogIn to Application
	/* This is standard Reusable Test Step Block for Login with valid credentials.
	 * The prerequisite is that the user is not logged in to the application
	 */
	
	public void logInUser(String username, String password) {
		
		//String email = "umilens@gmail.com";
		//String password= "umilens";
		
		LoginPage loginPage = new LoginPage();
		loginPage.clickLoginLoginBtn();
		loginPage.inputLoginEmailTxt(username);
		loginPage.inputLoginPasswordTxt(password);
		loginPage.clickLoginLoginBtn();
		
}
}