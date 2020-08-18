package Important_for_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Veggies {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver 83/chromedriver.exe");//83 Version
		//79 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String[] reqveggies = {"Cucumber","Brocolli","Beetroot","Mushroom","Apple"};
		
		Veggies.cartItems(driver, reqveggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		String msg=driver.findElement(By.cssSelector("span.promoInfo")).getText();
		
		if(msg.equalsIgnoreCase("Code applied ..!")){
			System.out.println("Test case passed");
		}
		else{
			System.out.println("Test case failed");
		}
	}
	
	public static void cartItems(WebDriver driver, String[]reqveggies){
		int j=0;
		List <WebElement> vegetables=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<vegetables.size();i++){
			
			String[] veggiee=vegetables.get(i).getText().split("-");
			String formattedVeggiee=veggiee[0].trim();
			
			List reqveggiesList=Arrays.asList(reqveggies);
			
				
			if(reqveggiesList.contains(formattedVeggiee)){
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==reqveggies.length)
				{
				break;
				}
			}
			
		}
		
		System.out.println("Total Veggiees Count :" +j);
		
	}
}
	

