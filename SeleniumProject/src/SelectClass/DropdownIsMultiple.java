package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownIsMultiple 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Abhishek%20N/Documents/HTML/Abhi_11.html");
		WebElement ele1 = driver.findElement(By.id("hotel"));
		Thread.sleep(2000);
		Select s = new Select(ele1);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("Multiselect");
		}
		else
		{
			System.out.println("Singleselect");
		}
		
		driver.get("file:///C:/Users/Abhishek%20N/Documents/HTML/Abhi_12.html");
		WebElement ele2 = driver.findElement(By.id("hotel"));
		Thread.sleep(2000);
		Select a = new Select(ele2);
		boolean m = a.isMultiple();
		if(m)
		{
			System.out.println("Multiselect");
		}
		else
		{
			System.out.println("Singleselect");
		}
		driver.quit();
		
	}
}
