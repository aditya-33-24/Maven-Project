package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CampaignModule {
	@Test
public void createCampaign() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	Reporter.log(driver.getTitle(),true);
//	Reporter.log("Campaign has been created",true);
	driver.quit();
}
}
