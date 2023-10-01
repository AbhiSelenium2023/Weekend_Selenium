package Synchronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAddToCart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @ name='field-keywords']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @ name='field-keywords']")).sendKeys("Iphone 14");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @ type='submit']")).click();
		driver.findElement(By.xpath("//span[.='Results']/../../../../../../div[3]//span[contains(.,'Apple')]")).click();
		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) 
		{
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//input[@type='button' and @value='Add to Cart']")).click();
        
	}
}
