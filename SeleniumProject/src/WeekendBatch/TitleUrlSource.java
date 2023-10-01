package WeekendBatch;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleUrlSource 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		//System.out.println(title);
		String url = driver.getCurrentUrl();
		//System.out.println(url);
		String page = driver.getPageSource();
		System.out.println(page);
	}

}
