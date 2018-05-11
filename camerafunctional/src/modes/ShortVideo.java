package modes;
import runtest.RunCamera;
import modes.CameraLaunch;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import modes.SelectMode;
public class ShortVideo {
	static CameraLaunch camera;
	static SelectMode fmode;
	
	@Test
	public static void startTest() throws InterruptedException, MalformedURLException {
		AndroidDriver drvr= RunCamera.setCaps();
		camera = new CameraLaunch(drvr);
		Thread.sleep(5000);
		camera.lauchCamera();
		Thread.sleep(3000);
		fmode = new SelectMode(drvr);
		fmode.shortVideo();
		fmode.switchCamera_photo();
		fmode.video();
		fmode.photo();
		//fmode.switchCamera_photo();
		fmode.portrait();
		
	}
}
