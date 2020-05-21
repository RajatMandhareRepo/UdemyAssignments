package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\81Version\\chromedriver.exe");//81 Version
		WebDriver driver= new ChromeDriver();
		WebDriverWait w= new WebDriverWait(driver, 10);
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		String text=driver.findElement(By.xpath("//div[@id='results']")).getText();
		System.out.println(text);
		System.out.println("Test Passed");
		
		
		
	}

}
