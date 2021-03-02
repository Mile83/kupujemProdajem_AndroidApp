package Base;

public class SetupValue {

	//Variables Setup
// 	static String DeviceName = "MotorolaOne";
//	static String DeviceId = "ZY323J98QB";
	
	static String DeviceName = "Pixel 4 API 28";
	static String DeviceId = "emulator-5554";
	
	static String ConnectionLocal = "http://0.0.0.0:4723/wd/hub"; 
	static String ConnectionBS = "http://hub.browserstack.com/wd/hub";
	
	static String APP = "C:\\Users\\mugarcina\\Desktop\\KP\\Appium\\KupujemProdajem_v1.7.3 build 456_apkpure.com.apk";
	static String appPackage = "com.kupujemprodajem.android";
	static String appActivity  = "com.kupujemprodajem.android.ui.MainActivity";
	

}





//      // Set your access credentials
//      caps.setCapability("browserstack.user", "mileugarcina1");
//      caps.setCapability("browserstack.key", "4Q3uTo96LyX6EEyCqdMB");
//      
//      // Set URL of the application under test
//      caps.setCapability("app", "bs://d318fa5c7d984a8b72a52addff9750303ae64da3");
//      
//      // Specify device and os_version for testing
//      caps.setCapability("device", "Samsung Galaxy S10e");
//      caps.setCapability("os_version", "9.0");
//        
//      // Set other BrowserStack capabilities
//      caps.setCapability("project", "First Java Project");
//      caps.setCapability("build", "Java Android");
//      caps.setCapability("name", "first_test");
//        
//      
//      // Initialise the remote Webdriver using BrowserStack remote URL
//      // and desired capabilities defined above
//        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
//            new URL("http://hub.browserstack.com/wd/hub"), caps);
//  