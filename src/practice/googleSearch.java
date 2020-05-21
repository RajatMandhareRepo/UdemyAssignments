package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[contains(@jsname,'gLFyf')]/input")).sendKeys("rahulshettyacedamy");
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();


		
		
		
		
		
	}

}
