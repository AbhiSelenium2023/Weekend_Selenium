package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndConfirmationPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();//click on ok
		//a.dismiss();//click on cancel
		Thread.sleep(2000);
		driver.quit();
	}
}
