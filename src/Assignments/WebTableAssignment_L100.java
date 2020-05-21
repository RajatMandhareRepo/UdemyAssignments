package Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableAssignment_L100 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\81Version\\chromedriver.exe");//81 Version
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement rowdriver=driver.findElement(By.id("product"));
		WebElement columndriver=driver.findElement(By.xpath("//table[@id='product']/tbody/tr"));
		
		System.out.println("Total number of rows :");
		System.out.println(rowdriver.findElements(By.tagName("tr")).size());
		
		System.out.println("Total number of columns :");
		System.out.println(columndriver.findElements(By.tagName("th")).size());
		
	
		
		System.out.println(driver.findElement(By.xpath("//body//tr[3]//td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//body//tr[3]//td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//body//tr[3]//td[3]")).getText());
		
		}
		//Code by rahul shetty
		
		/*List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());

		System.out.println(secondrow.get(1).getText());

		System.out.println(secondrow.get(2).getText());*/
		
	}


