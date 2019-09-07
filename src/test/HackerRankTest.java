package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hackerrank.HackerRankDashboard;
import hackerrank.HackerRankHome;
import hackerrank.HackerRankLogin;

public class HackerRankTest {
	WebDriver driver;
	
	public HackerRankTest(WebDriver driver) {
		this.driver = driver;
	}
	
	public void run() {
		loginDashboard();
		verifyDashboardTitle();
	}
	
	 public void loginDashboard() {
		  HackerRankHome home = new HackerRankHome(driver);
		  HackerRankLogin login = new HackerRankLogin(driver);
		  
		  home.clickLoginButton();
		  login.login();
		   
		  verifyDashboardTitle();
	  }
	  
	  public void verifyDashboardTitle() {
		  WebDriverWait wait = new WebDriverWait(driver, 5);
		  wait.until(ExpectedConditions.urlContains("dashboard"));
		  
		  HackerRankDashboard dashboard = new HackerRankDashboard(driver);
		  String actualTitle = dashboard.getHeadingText();
		  String expectedTitle = "Dashboard";
	      Assert.assertEquals(actualTitle, expectedTitle);
		  
	  }
}
