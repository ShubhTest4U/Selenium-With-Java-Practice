package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDownSelect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// Setup WebDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		
		// Launch Chrome browser
		driver = new ChromeDriver();
		
		// Navigate to a web page
		driver.get("https://identity.ersnet.org/Account/Register");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		
		//Approach 1 (Lenghty method)
		
//		Select profdropdown = new Select(driver.findElement(By.id("profcatDropdown")));
//		profdropdown.selectByValue("22");
//		
//		Select countryDropdown1 = new Select(driver.findElement(By.id("countryDropdown")));
//		countryDropdown1.selectByIndex(5);
//		
//		Select ersinfoDropdown = new Select(driver.findElement(By.id("ersinfoDropdown")));
//		ersinfoDropdown.selectByValue("2");
//		
//		Select elfinfoDropdown = new Select(driver.findElement(By.id("elfinfoDropdown")));
//		elfinfoDropdown.selectByIndex(1);
		
//		Approach 2 (Generic method)
		
		
		WebElement profOption=driver.findElement(By.id("profcatDropdown"));
		SelectDropDowns(profOption, "Pathologist");
		WebElement countryOption=driver.findElement(By.id("countryDropdown"));
		SelectDropDowns(countryOption, "India");
		WebElement erinfoOption=driver.findElement(By.id("ersinfoDropdown"));
		SelectDropDowns(erinfoOption, "Yes, I would like to receive information by email from ERS");
		WebElement elinfoOption=driver.findElement(By.id("elfinfoDropdown"));
		SelectDropDowns(elinfoOption, "Yes, I would like to receive information by email from ELF");

	}
	
	// Method to select a dropdown option based on the visible text
	public static void SelectDropDowns(WebElement ele, String value) 
	{
		Select drop = new Select(ele);
		
		// Get all options from the dropdown
		List<WebElement>alloptions=drop.getOptions();
		
		// Loop through the options and click on the desired option
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
			option.click();
			break;
			}
		}
	}

	}
