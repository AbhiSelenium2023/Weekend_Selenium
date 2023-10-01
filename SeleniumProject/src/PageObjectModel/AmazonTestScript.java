package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonTestScript 
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		AmazonRefreshPOM p=new AmazonRefreshPOM(driver);
		p.Amazon_button();//@a1
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.Amazon_button();//@a2

	}
}
