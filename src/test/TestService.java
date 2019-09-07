package test;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;


public class TestService {
    public WebDriver driver ; 
    
  @BeforeTest(alwaysRun=true)
  public void driverSetUp() {
	  System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", "app\\driver\\chromedriver.exe");
      driver = new ChromeDriver();
  }
    
     
//  @Test(priority=0, groups= {"hacker-rank"})
//  public void hackerRankTest() {
//	  HackerRankTest hacker = new HackerRankTest(driver);
//	  hacker.run();
//  }

  @Test(priority=1, groups={"google"}, dataProvider = "dp")
  public void googleTest(String keyword) {
	  GoogleTest google = new GoogleTest(driver);
	  google.run(keyword);
  }
 
  
  @AfterTest(alwaysRun=true)
  public void disconnect() {
	  driver.close();
  }
  
  @DataProvider(name="dp")
  public static Object[][] createData() {
      return new Object[][] {
              new Object[] { new String("Software") },
              new Object[] { new String("It") },
              new Object[] { new String("Technologies") }
      };
  }}
  

  