package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//WebElement >> Return single element
		
		//1
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		ele.sendKeys("XYZ");
		
		//2
		
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("All tag name:" +ele2.getText());
		
		//WebElements >> Return multiple elements
		//1
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements capture:"+links.size());
		
		for(WebElement ele3:links)
		{
			System.out.println(ele3.getText());
		}
		
		//2
		
		List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Number of elements capture:" +logo.size());
		//Return single element even we use list of webElements
		
		driver.close();
		

	}

}
