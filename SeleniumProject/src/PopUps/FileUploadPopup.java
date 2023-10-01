package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Abhishek%20N/Documents/HTML/Abhi_14.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("f1"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\Abhishek N\\Downloads\\Sticky Notes.docx");
		Thread.sleep(2000);
		driver.quit();
	}
}
