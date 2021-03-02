package pom_KupujemProdajem;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import Base.AppDriver;

public class Adresar {
	
		
	String backButton = "com.kupujemprodajem.android:id/back";
	String sortirajBtn = "com.kupujemprodajem.android:id/sort";
	String firstContainer = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	String ownerNameTxt = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]";
	String dialogTxt = "com.kupujemprodajem.android:id/list_item_adresar_entry_note";
	
	String xBtn	= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView";
	
		
	//Back Button - Click
	public void clickAdresarBackBtn() {
		AppDriver.getDriver().findElement(By.id(backButton)).click();
		System.out.println("Click on Back Button");
	}
	
	//Sortiraj Button - Click
	public void clickAdresarsortirajBtn() {
		AppDriver.getDriver().findElement(By.id(sortirajBtn)).click();
		System.out.println("Click on Sortiraj Button");
	}
	
	//X Button - Click
	public void clickXBtn() {
		AppDriver.getDriver().findElement(By.xpath(xBtn)).click();
		System.out.println("Click on X Button");
	}
	
	//Verify Owner Name Txt
	public void verifyAdresarOwnerNameTxt() {
		String ownerNameTxtElement = AppDriver.getDriver().findElement(By.xpath(ownerNameTxt)).getText();
//		System.out.println(ownerNameTxtElement);
		System.out.println("Verify " + ownerNameTxtElement +" = " +  AdPage.bufferOwnerNameTxt);
		assertTrue(ownerNameTxtElement.contains(AdPage.bufferOwnerNameTxt));
	
	}
	
	//Verify Owner Name Txt
	public void verifyAdresarDialogTxt(String dialogTxtNG) {
		String dialogTxtElement = AppDriver.getDriver().findElement(By.id(dialogTxt)).getText();
//		System.out.println(dialogTxtElement);
		System.out.println("Verify " + dialogTxtElement +" = " +  dialogTxtNG);
		assertTrue(dialogTxtElement.contains(dialogTxtNG));
		
	}
	
}
	
	
	
	
	
	


