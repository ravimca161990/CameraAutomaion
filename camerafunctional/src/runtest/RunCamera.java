package runtest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utils.Caputils;
import io.appium.java_client.android.AndroidDriver;
import modes.CameraLaunch;
import modes.SelectMode;
public class RunCamera {
	
	@SuppressWarnings("rawtypes")
	private static AndroidDriver driver;
	 @Test
	 public void App() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	// Wait for 10 second
	 
		Thread.sleep(10000);
	 
		// close the application
		 driver.quit();
		 }
	 public static AndroidDriver setCaps() throws MalformedURLException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();

		 
		 capabilities.setCapability("deviceName",Caputils.DeviceName);
		 capabilities.setCapability("udid", Caputils.Deviceid);
		 capabilities.setCapability("platformVersion", Caputils.Platversion);
		 capabilities.setCapability("platformName", Caputils.Platform);
		 capabilities.setCapability("appPackage",Caputils.AppPack);
		 capabilities.setCapability("appActivity",Caputils.AppAct); 
		  
		 driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		 return driver;
	 }
	 @AfterMethod
	 public void afterMethod() {
		driver.quit();
	}
}
