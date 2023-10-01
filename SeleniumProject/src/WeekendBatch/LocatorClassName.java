package WeekendBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassName 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/Abhishek%20N/Documents/HTML/Abhi_2.html");
		WebElement ele = driver.findElement(By.className("c1"));
		Thread.sleep(3000);
		ele.click();
	}
}
