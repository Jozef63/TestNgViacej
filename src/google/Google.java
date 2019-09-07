package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google {

	WebDriver driver;
	
	@FindBy(name="q")
	WebElement input;
	
	public Google(WebDriver driver) {
		this.driver = driver;
	}
	
	public void insertInput(String keyword) {
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys(keyword);
		input.submit();
	}
	
	public List<WebElement> getFirstTenResults() {
		List<WebElement> results =  driver.findElements(By.className("ellip"));
		return results;
	}
	
}
