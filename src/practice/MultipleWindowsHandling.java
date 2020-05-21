package practice;

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signin/v2/usernamerecovery?flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		
		Set <String> handler=driver.getWindowHandles();
		
		Iterator<String>it=handler.iterator();
		
		String parentWindow=it.next();
		System.out.println("Parent Window ID :" +parentWindow);
		
		String childWindow=it.next();
		System.out.println("Child Window ID :" +childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
