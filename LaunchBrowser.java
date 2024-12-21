package selenium_Learning;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.npmjs.com/package/newman");
		
		System.out.println("Website title name is, "+driver.getTitle());
		System.out.println("Current URL of the page"+driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		
		

	}

}
