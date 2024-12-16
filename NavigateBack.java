package selenium_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		driver.navigate().to("https://github.com/ShubhTest4U/");
		driver.navigate().back();
		driver.navigate().forward();


	}

}
