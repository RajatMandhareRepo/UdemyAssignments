package practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PotteryTestCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Browser Drivers\\81Version\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://jijaart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//div[@id='desktopShow']//span[contains(text(),'Pottery')]")).click();
		
				
		//WebElement prodset=driver.findElement(By.xpath("//div[@class='women-set1']"));
		

		
			List<WebElement> items = driver.findElements(By.cssSelector("div[class*= slideInUp] h4"));
			System.out.println("Total Number Of Products On Page :"+items.size());
			Iterator<WebElement> it = items.iterator();

			//for (WebElement text :items)
			int j=1;
			//for (int i=0;i<items.size();i++)	
			
			while(it.hasNext())
			{
				System.out.print("Product "+j +" ");
				WebElement text1 = it.next();
				//WebElement text=driver.findElement(By.tagName("h4"));
				System.out.println(text1.getText());
				j++;
				
				
				/*WebElement table = driver.findElement(By.xpath("your path"));
				List<WebElement> rows = table.findElements(By.tagName("your tagName"));
				java.util.Iterator<WebElement> i = rows.iterator();
				while(i.hasNext()) {
				    WebElement row = i.next();
				    System.out.println(row.getText());*/
				
				
				
			}
		
	}
}
