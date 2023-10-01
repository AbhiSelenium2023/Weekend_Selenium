package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchParentId 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver",  "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		Thread.sleep(2000);
		driver.quit();
		
}
}
