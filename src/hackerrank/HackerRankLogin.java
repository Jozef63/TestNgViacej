package hackerrank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HackerRankLogin {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"input-1\"]")
	WebElement userName;
	@FindBy(xpath="//*[@id=\"input-2\"]")
	WebElement passwd;
	@FindBy(xpath="/html/body/div[4]/div/div/div[3]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[4]/button")
	WebElement loginButton;
	
	 public HackerRankLogin(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }   
	 
	 public void login() {
		 this.userName.sendKeys("jozefsulek63@gmail.com");
		 this.passwd.sendKeys("kokocina321");
		 this.loginButton.click();
	 }
	

}
