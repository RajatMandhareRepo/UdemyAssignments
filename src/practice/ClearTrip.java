package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// For Dropdown ---dynamic
		
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		Select s=new Select(driver.findElement(By.name("adults")));
		s.selectByVisibleText("5");
		
		Select s1=new Select(driver.findElement(By.name("childs")));
		s1.selectByVisibleText("2");
		
		//driver.switchTo().alert().dismiss();
		
		Select s3=new Select(driver.findElement(By.name("infants")));
		s3.selectByVisibleText("1");
		
		driver.findElement(By.cssSelector(".booking.large")).click();
		System.out.println("Test Passed");
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
		