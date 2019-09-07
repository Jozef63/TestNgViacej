package hackerrank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HackerRankHome {
	
	WebDriver driver;
	private static final String baseUrl = "https://www.hackerrank.com/access-account/?h_r=home&h_l=header";

    @FindBy(xpath="/html/body/div[3]/div[3]/main/article/div/div/div[1]/div/div/div[2]/div[1]/div/div[4]/div/div/a/span")
    WebElement loginButton;    

    public HackerRankHome(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.navigate().to(baseUrl);
    }   

    public void clickLoginButton() {
    	loginButton.click();
    }
}
