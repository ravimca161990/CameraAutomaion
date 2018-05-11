package modes;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class CameraLaunch {
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@content-desc,'Camera')]")//locates camera
	MobileElement cam ;
	AndroidDriver driver;
	
	
	public CameraLaunch(WebDriver driver){
		this.driver = (AndroidDriver) driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
	}
	public void lauchCamera() {
		cam.click();
	}
}
