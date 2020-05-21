package Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\81Version\\chromedriver.exe");//81 Version
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector(" a[href*='windows']")).click();
		driver.findElement(By.cssSelector(" a[href*='windows/new']")).click();
		
		Set <String> handler=driver.getWindowHandles();
		
		Iterator<String>it=handler.iterator();
		
		String parentWindow=it.next();
		System.out.println("Parent Window ID :" +parentWindow);
		
		String childWindow=it.next();
		System.out.println("Child Window ID :" +childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("Switching to child window");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		//driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Switching to parent window");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		
		
		
	}

}
