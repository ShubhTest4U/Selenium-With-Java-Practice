package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Selected_Enabled_Disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		   
		driver.get("https://demoqa.com/radio-button");
		
		//isDisplayed, isEnabled
		
		WebElement displayed = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		System.out.println("Logo displayed:"+displayed.isDisplayed()); //true
		System.out.println("Logo enabled:"+displayed.isEnabled()); //true
		
		WebElement selected = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		System.out.println("Radio button is selected:"+selected.isSelected());
		
		selected.click();
		System.out.println("Selected radio button status:"+selected.isSelected());
		
		WebElement selected2 = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
		selected2.click();
		 
		System.out.println("Selected radio button status:"+selected2.isSelected());
		
		//driver.close();
		
		
	}

}
