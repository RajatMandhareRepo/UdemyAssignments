package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakMyTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();;
		//WebElement from=driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		//input[@class='react-autosuggest__input react-autosuggest__input--open']
		WebElement from=driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
		from.clear();
		from.sendKeys("mum");
		for(int i=0;i<1;i++)
		{
			from.sendKeys(Keys.ARROW_DOWN);
		}
		from.sendKeys(Keys.ENTER);
		
		WebElement to=driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.clear();
		to.sendKeys("d");
		for(int i=0;i<4;i++)
		{
			to.sendKeys(Keys.ARROW_DOWN);
		}
		to.sendKeys(Keys.ENTER);
		
		
		
	}

}
