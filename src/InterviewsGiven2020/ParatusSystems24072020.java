package InterviewsGiven2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParatusSystems24072020 {
	
	/*
		 * 1. Create a new project on Eclipse/IntelliJ IDE 2. Set it up for Selenium and
		 * TestNG and automate the following scenario using TestNG 3. Go to
		 * <http://login.yahoo.com> 4. Type username as ketanvj 5. Click on next button
		 * 6. Type password as 1235232 7. Click on Next button
		 */
		
		WebDriver driver;
		
		
		@BeforeMethod
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver 84/chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get("http://login.yahoo.com");
		}
		
		@Test
		public void loginTest() {
			
			driver.findElement(By.name("username")).sendKeys("ketanvj");
			driver.findElement(By.id("login-signin")).click();
			
			//WebElement we=driver.findElement(By.cssSelector("div[id=password-container]"));
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
					
			//driver.findElement(By.id("recaptcha-anchor")).click();
			driver.findElement(By.name("password")).sendKeys("1235232");
			//we.sendKeys("1235232");
			driver.findElement(By.id("login-signin")).click();
			
					
		}
		
		@AfterMethod
		public void tearDown() {
			
			
		}
	
	
	
	
	
}
