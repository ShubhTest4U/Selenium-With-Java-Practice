package SeleniumLearning;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();

		WebElement SelectOptions = driver.findElement(By.id("dropdown"));
		Select dropDownOptions = new Select(SelectOptions);

		// Select by Visible Text

//		dropDownOptions.selectByVisibleText("Option 2");
//		WebElement selectedOption = dropDownOptions.getFirstSelectedOption();
//		String selectedText = selectedOption.getText();
//		System.out.println("Selected option: " + selectedText);

		// Select by Index value

//		dropDownOptions.selectByIndex(1);
//		WebElement selectedOption2 = dropDownOptions.getFirstSelectedOption();
//		String selectedText = selectedOption2.getText();
//		System.out.println("Selected option: " + selectedText);

		// Select by Value

		 dropDownOptions.selectByValue("2");
		 WebElement selectedOption3 =dropDownOptions.getFirstSelectedOption();
		 String selectedText3 = selectedOption3.getText();
		 System.out.println("Selected option: " + selectedText3);
		 
		 //Selecting option from dropdown without using methods
		 
//		 List<WebElement> alloptions=dropDownOptions.getOptions();
//		 
//		 for(WebElement option:alloptions)
//		 {
//			 if(option.getText().equals(""))
//			 {
//				 option.click();
//			 }
//		 }
		 
		 
		 driver.quit();
		 
		 

	}

}
