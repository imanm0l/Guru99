package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	protected WebDriver driver;
	@Test
  public void guru99tutorials() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","geckodriver.exe"); 
	    driver = new FirefoxDriver();
	    
//		WebDriver driver = new ChromeDriver();
        String eTitle = "Meet Guru99";
        String aTitle = "";
        // launch Firefox and redirect it to the Base URL
        driver.get("http://www.guru99.com/");
	  Thread.sleep(5000);
        //maximises the browser window
        driver.manage().window().maximize();
        // get the actual value of the title
        aTitle = driver.getTitle();
        // compare the actual title  with the expected title 
        if (aTitle.contentEquals(eTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }        
	   driver.get("http://www.google.com/");
        //close Firefox browser
        driver.close();
		
	}
}

