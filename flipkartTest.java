package selenium_Learning;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iPhone 15");
		search.submit();

		String mainPage = driver.getWindowHandle();
		System.out.println("Main page=" + mainPage);

		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 (Green, 128 GB)']")).click();

		Set<String> allPages = driver.getWindowHandles();
		for (String page : allPages) {
			if (!page.equals(mainPage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		List<WebElement> products = driver.findElements(By.className("U+9u4y"));
		System.out.println(products.size());
		for (WebElement product : products) {
			System.out.println(product.getText());
		}
		
		driver.findElement(By.xpath("//button[normalize-space()='Buy Now']")).click();
		//driver.quit();

	}

}
