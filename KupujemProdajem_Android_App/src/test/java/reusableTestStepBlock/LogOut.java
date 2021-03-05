package reusableTestStepBlock;

import pages.LogOutPopUpMsg;
import pages.MojKP;
import pages.NavigationBar;


public class LogOut {
	
	
	// Reusable Test Step Block - LogOut from Application
	/* This is standard Reusable Test Step Block for LogOut from Aplication
	 * The prerequisite is that the user is logged into the application
	 */
	
	public void logOutUser() {
		
		NavigationBar navigationBar = new NavigationBar();
		navigationBar.clickNavigationBarMojKPButton();
		MojKP mojKP = new MojKP();
		mojKP.clickIzlogujteSeBtn();
		LogOutPopUpMsg logOutPopUpMsg = new LogOutPopUpMsg();
		logOutPopUpMsg.clickLogOutPopUpMsgDaBtn();
		
}
}