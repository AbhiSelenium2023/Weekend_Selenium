package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRefreshPOM 
{
  //Declaration	
  @FindBy(id="nav-search-submit-button")
  private WebElement amazon_search_button;//@a2
  //Initialization
  public AmazonRefreshPOM(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  //Utilization
  public void Amazon_button()
  {
	  amazon_search_button.click();
  }
}
