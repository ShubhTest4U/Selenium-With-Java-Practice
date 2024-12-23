package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVSgetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		WebElement EmailInputBox = driver.findElement(By.xpath("//input[@id='Email']"));
		//EmailInputBox.clear();
		
		//capturing text from inputbox
		
		System.out.println("Result from getAttribute():" +EmailInputBox.getAttribute("value"));
		
		WebElement buttonText = driver.findElement(By.cssSelector("button[type='submit']"));
		
		System.out.println("Result from getText()=" +buttonText.getText());
		
		driver.quit();
		
		
		

	}

}
