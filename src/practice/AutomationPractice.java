package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutomationPractice {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.name("checkBoxOption1")).isSelected());
		driver.findElement(By.name("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());
		
		List<WebElement>we=driver.findElements(By.xpath("//*[contains(@type,'checkbox')]"));
		System.out.println("Total count of checkboxes ="+we.size());
		
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Rajat");
		driver.findElement(By.xpath("//*[@value='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Rajat");
		driver.findElement(By.xpath("//*[@value='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
