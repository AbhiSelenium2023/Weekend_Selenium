package WeekendBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon1stLink 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @ name='field-keywords']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @ name='field-keywords']")).sendKeys("Iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @ type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Results']/../../../../../../div[3]//span[contains(.,'Apple')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
