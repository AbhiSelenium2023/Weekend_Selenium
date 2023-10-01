package WeekendBatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuitMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key1="webdriver.gecko.driver";
		String value1="./Softwares/geckodriver.exe";
		String key2="webdriver.chrome.driver";
		String value2="./Softwares/chromedriver.exe";
		System.setProperty(key1, value1);
		System.setProperty(key2, value2);
		FirefoxDriver fx = new FirefoxDriver();
		Thread.sleep(5000);
		//fx.close();
		fx.quit();
		ChromeDriver cr = new ChromeDriver();
		Thread.sleep(5000);
		//cr.close();
		cr.quit();
	}
}