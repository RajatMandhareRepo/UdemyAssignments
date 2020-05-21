package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// For Dropdown ---dynamic
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Pune (PNQ)')]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//*[contains(text(),' Delhi (DEL)')])[2]")).click();// to select [2] indexes
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinat"+
						"ionStation1_CTNR'] //*[contains(text(),' Delhi (DEL)')]")).click();// parent space child
		
		// for calendar
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			System.out.println("Its is disabled");
		}
		else{
			System.out.println("Its is not disabled");
		}
		
		// For Dropdown---static
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("2");
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		s1.selectByVisibleText("3");
		Select s2=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
		s2.selectByVisibleText("2");
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		//for check boxes
		
		driver.findElement(By.xpath("//*[contains(@name,'SeniorCitizenDiscount')]")).click();
		
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		System.out.println("Test Passed");
	}

}
		