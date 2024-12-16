package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		driver.get("https://www.amazon.in/");

		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch!");

		System.out.println("Title Verified! - " + actualTitle);

		driver.findElement(By.xpath("//a[@id='nav-cart' or @class='nav-cart-container']")).click();

		System.out.println("Navigated to Cart Page");

		driver.quit();
	}
}
