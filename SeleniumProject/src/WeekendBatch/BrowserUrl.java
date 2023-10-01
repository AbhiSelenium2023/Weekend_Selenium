package WeekendBatch;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUrl 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
