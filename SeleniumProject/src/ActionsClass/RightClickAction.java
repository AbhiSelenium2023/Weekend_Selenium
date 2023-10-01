package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
