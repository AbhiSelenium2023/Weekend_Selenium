package SelectClass;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTreeSetAscending 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Abhishek%20N/Documents/HTML/Abhi_11.html");
		WebElement ele = driver.findElement(By.id("hotel"));
		Thread.sleep(2000);
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		TreeSet<String> l = new TreeSet<String>();
		for(WebElement o:opt)
		{
			l.add(o.getText());
		}
		for(String x:l)
		{
			System.out.println(x);
		}
		driver.quit();
	}
}
