package WeekendBatch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch 
{
	public static void main(String[] args) 
	{
		//which browser should be launched
		String key="webdriver.gecko.driver";
		//where is the driver executable file
		String value="./Softwares/geckodriver.exe";
		//create communication between server and driver
		System.setProperty(key, value);
		//launch empty firefox browser
		FirefoxDriver fx = new FirefoxDriver();
	}
}
