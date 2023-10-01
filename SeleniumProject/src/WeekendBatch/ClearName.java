package WeekendBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/Abhishek%20N/Documents/HTML/Abhi_4.html");
		Thread.sleep(3000);
		driver.findElement(By.name("n1")).clear();
	}

}
