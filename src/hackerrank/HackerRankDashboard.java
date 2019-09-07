package hackerrank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HackerRankDashboard {

	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/header/div/div/div[1]/div/h1")
	WebElement heading;
	
	 public HackerRankDashboard(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }   
	 
	 public String getHeadingText() {
		 String headingText = this.heading.getText();
		 return headingText;
	 }
}
