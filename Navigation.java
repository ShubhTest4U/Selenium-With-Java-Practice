package selenium_Learning;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		
		driver.quit();
		

	}

}
