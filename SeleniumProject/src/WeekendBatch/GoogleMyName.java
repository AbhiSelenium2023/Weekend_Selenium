package WeekendBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMyName 
{
   public static void main(String[] args) throws InterruptedException 
   {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.com/search?client=firefox-b-d&q=qspiders+");
	Thread.sleep(2000);
	List<WebElement> all_links = driver.findElements(By.xpath("//h3"));
	System.out.println(all_links.size());
	for(WebElement abhi:all_links)
	{
		String text = abhi.getText();
		System.out.println(text);
	}
	driver.quit();
		
}
}
