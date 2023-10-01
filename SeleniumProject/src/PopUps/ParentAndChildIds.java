package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentAndChildIds 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.gecko.driver",  "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> all_id = driver.getWindowHandles();
		int size = all_id.size();
		System.out.println(size);
		for (String id : all_id) 
		{
			System.out.println(id);
		}
		Thread.sleep(2000);
		driver.quit();
}
}
