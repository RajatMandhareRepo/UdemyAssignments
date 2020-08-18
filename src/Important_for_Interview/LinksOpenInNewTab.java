package Important_for_Interview;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOpenInNewTab {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver 83/chromedriver.exe");// 83
																													// Version
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println("Total count of links on the page : " + count);

		WebElement bottom = driver.findElement(By.id("gf-BIG"));

		System.out.println(bottom.findElements(By.tagName("a")).size());

		WebElement bottomcolumn = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));

		int col1 = bottomcolumn.findElements(By.tagName("a")).size();

		System.out.println("Bottom left first column links count is : " + col1);
		for (int i = 1; i < bottomcolumn.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			bottomcolumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(4000);
		}
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		driver.quit();
	}
}
