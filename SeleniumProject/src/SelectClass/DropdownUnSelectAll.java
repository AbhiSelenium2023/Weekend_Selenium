package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUnSelectAll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Abhishek%20N/Documents/HTML/Abhi_11.html");
		WebElement ele = driver.findElement(By.id("hotel"));
		Thread.sleep(2000);
		Select a = new Select(ele);
		a.selectByIndex(3);
		Thread.sleep(2000);
		a.selectByValue("j");
		Thread.sleep(2000);
		a.selectByVisibleText("Mango");
		Thread.sleep(2000);
		a.deselectAll();
		Thread.sleep(2000);
		driver.quit();
	}
}
