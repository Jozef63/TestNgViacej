package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import google.Google;

public class GoogleTest {

WebDriver driver;
	
	public GoogleTest(WebDriver driver) {
		this.driver = driver;
		this.driver.navigate().to("https://www.google.com/");
	}
	
	public void run(String keyword) {
		Google google = new Google(driver);
		google.insertInput(keyword);
		List<WebElement> vysledky = google.getFirstTenResults();
		vypisVysledky(vysledky, keyword);
	}
	
	private void vypisVysledky(List<WebElement> vysledky, String keyword) {
		vysledky = upravVysledky(vysledky);
		int poradie = 1;
		for(WebElement vysledok : vysledky) {
			String vysledokText = vysledok.getText();
				System.out.println(poradie + ". vysledok vyhladavania v google pre: " +keyword+ " je: " +vysledokText );
				poradie++;
		}
	}
	
	private List<WebElement> upravVysledky(List<WebElement> vysledky) {
		List<WebElement> odstranVysledky = new ArrayList<>();
		for(WebElement vysledok : vysledky) {
			if (vysledok.getText().equals("")) {
				 odstranVysledky.add(vysledok);
			}
		}
		vysledky.removeAll(odstranVysledky);
		return vysledky;
	}
	
	
}
