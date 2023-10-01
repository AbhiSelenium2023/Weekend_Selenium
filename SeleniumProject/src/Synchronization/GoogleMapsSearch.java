package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMapsSearch 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @ aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @ aria-label='Choose destination...']")).sendKeys("Mysore");
	}
}
