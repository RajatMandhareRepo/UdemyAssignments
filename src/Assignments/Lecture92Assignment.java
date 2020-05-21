package Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lecture92Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\81Version\\chromedriver.exe");//81 Version
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String opt=driver.findElement(By.xpath("//option[contains(text(),'Option2')]")).getText();
		Select s1=new Select(driver.findElement(By.id("dropdown-class-example")));
		s1.selectByVisibleText(opt);
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String stmnt=driver.switchTo().alert().getText();
		if(stmnt.contains(opt))
		{
			System.out.println("Test passed sucessfully");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.switchTo().alert().accept();
	}

}
