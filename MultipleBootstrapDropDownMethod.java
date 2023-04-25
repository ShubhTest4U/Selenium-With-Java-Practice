package SeleniumLearning;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBootstrapDropDownMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//Product type 
		driver.findElement(By.xpath("//div[@class='drp1']//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		List<WebElement> prodType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Total number of product type="+prodType.size());
		SelValFromDropDown(prodType, "EMI");
		
		//Select Product
		
		driver.findElement(By.xpath("//div[@class='drp2']//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		List<WebElement> product = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Total number of product"+product.size());
		SelValFromDropDown(product, "Lifecare");
		
	}
	
	public static void SelValFromDropDown(List<WebElement> options,String value)
	{
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
		
	}

}
