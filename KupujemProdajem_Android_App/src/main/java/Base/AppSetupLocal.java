package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


//Start Driver & Session
public class AppSetupLocal {
	
	public static AndroidDriver<MobileElement> driver;
	public static DesiredCapabilities capabilities = new DesiredCapabilities();
	
	public static void AndroidSetup() throws MalformedURLException {
	
	 	//Setup for connection and application
	 			//capabilities.setCapability("avd", SetupValue.DeviceName); //Strat Android Emulator
				//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, SetupValue.DeviceName);
				//capabilities.setCapability("avdLaunchTimeout", 30000);
				//capabilities.setCapability("skipDeviceInitialization", "True");
				//capabilities.setCapability("skipServerInstallation", "True");
				//capabilities.setCapability("skipDeviceInitialization", "True");
				capabilities.setCapability("udid", SetupValue.DeviceId); 
				//capabilities.setCapability("androidNaturalOrientation", "False");
				capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, SetupValue.appPackage);
				capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, SetupValue.appActivity);
				capabilities.setCapability("automationName", "uiautomator2");
//				capabilities.setCapability("app", SetupValue.APP); // Install apk
				capabilities.setCapability(MobileCapabilityType.FULL_RESET, "False");
				capabilities.setCapability(MobileCapabilityType.NO_RESET, "True");
				
				driver = new AndroidDriver<MobileElement>(new URL(SetupValue.ConnectionLocal), capabilities);
				AppDriver.setDriver(driver);
				
				driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
				
				System.out.println("Staring Up Services and Application");
	}
	

			
		//Lunch Aplication	
			public static void lunchApp() {
				driver.launchApp();
			}
			
		//Stop Aplication
			public static void stopApp() throws InterruptedException {
				Thread.sleep(1000);
				driver.closeApp();
				
				System.out.println("Shutdown Service And Application");
			}
			
			
		//Stop Driver & Session	
			public static void closeDriver() {
				
				//Uninstall APK
						//driver.removeApp(SetupValue.appPackage);
				
						driver.quit();
				/*
				Stop Appium Server	
						service.stop();
				*/
						
			
			}
			
	
			
			public static void TimeOut() {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			
			
}
