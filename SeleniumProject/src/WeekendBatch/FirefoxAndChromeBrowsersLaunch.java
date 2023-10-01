package WeekendBatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAndChromeBrowsersLaunch 
{
   public static void main(String[] args) 
   {
	   String key1="webdriver.gecko.driver";
	   String value1="./Softwares/geckodriver.exe";
	   String key2="webdriver.chrome.driver";
	   String value2="./Softwares/chromedriver.exe";
	   System.setProperty(key1, value1);
	   System.setProperty(key2, value2);
	   FirefoxDriver fx = new FirefoxDriver();
	   ChromeDriver cr = new ChromeDriver();
}
}
