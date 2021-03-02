package Base;


import io.appium.java_client.AppiumDriver;


public class AppDriver {
	
	private static ThreadLocal<AppiumDriver<?>> driver = new ThreadLocal<AppiumDriver<?>>();
		
	public static AppiumDriver<?> getDriver() {
		
		return driver.get();
	}

	static void setDriver(AppiumDriver<?> Driver) {
		
		driver.set(Driver);
	}
}
