package SeleniumLearning;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.npmjs.com/package/newman");
		
		System.out.println("Website title name is, "+driver.getTitle());
		System.out.println("Current URL of the page"+driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		
		

	}

}
