package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//Product Type
		
		driver.findElement(By.xpath("//div[@class='drp1']//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		List<WebElement> prodTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Total number of options:" +prodTypes.size());
		
		for(WebElement Ptype:prodTypes)
		{
			if(Ptype.getText().equals("EMI"))
			{
				Ptype.click();
				break;
			}
		}
		
		//Select Product
		
		driver.findElement(By.xpath("//div[@class='drp2']//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		List<WebElement>SelProd = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Total umber of products= "+SelProd.size());
		
		for(WebElement Sprod:SelProd)
		{
			if(Sprod.getText().equals("Lifecare"))
			{
				Sprod.click();
				break;
			}
		}
	}

}
