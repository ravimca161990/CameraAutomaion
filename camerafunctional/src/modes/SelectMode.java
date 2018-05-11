package modes;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class SelectMode {
	WebDriver driver;
	@AndroidFindBy(xpath="//android.widget.ImageView[contains(@content-desc,'Front and rear camera switch')]")//locates camera
	MobileElement flip;
	@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,'Shutter button')]")
	MobileElement shutter;
	
	@AndroidFindBy(id="com.android.camera:id/text_item_title")
	List<MobileElement> mode;
	
	
	
	public SelectMode(WebDriver driver) throws InterruptedException{
		this.driver = (AndroidDriver) driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
		
	}
	//public void startCamera() throws InterruptedException {
	//	cam.click();
	//	Thread.sleep(2000);
	//}
	public void shortVideo() throws InterruptedException {
		System.out.println(mode.size());
		//for(MobileElement ele : mode) {
			//System.out.println(ele.getAttribute("name"));
		//}
		Thread.sleep(1000);
		System.out.println(mode.get(0).getAttribute("name"));
		mode.get(0).click();
		Thread.sleep(2000);
		shutter.click();
		Thread.sleep(12000);
	}
	public void video() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(mode.get(1).getAttribute("name"));
		mode.get(1).click();
		Thread.sleep(2000);
		shutter.click();
		Thread.sleep(10000);
		shutter.click();
		Thread.sleep(1000);
	}
	public void photo() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println(mode.get(2).getAttribute("name"));
		mode.get(2).click();
		//pic.click();
		Thread.sleep(2000);
		shutter.click();
		Thread.sleep(1000);
		
	}
	public void portrait() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println(mode.get(3).getAttribute("name"));
		mode.get(3).click();
		Thread.sleep(2000);
		shutter.click();
		Thread.sleep(3000);
	}
	public void square() throws InterruptedException {
		Thread.sleep(2000);
		mode.get(4).click();
		Thread.sleep(1000);
		shutter.click();
		Thread.sleep(2000);
	}
	public void manual() throws InterruptedException {
		Thread.sleep(1000);
		mode.get(5).click();
	}
	
	public void switchCamera_photo() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println(mode.get(2).getAttribute("name"));
		mode.get(2).click();// go to photo mode
		Thread.sleep(2000);
		flip.click(); // switch camera
		Thread.sleep(2000);
		shutter.click(); 
		Thread.sleep(2000);// time to let the pic saved
		flip.click(); // switch to previous camera
		Thread.sleep(2000);
		
		
	}
}
