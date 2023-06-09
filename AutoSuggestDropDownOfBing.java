package SeleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDownOfBing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));
		System.out.println("Size of auto suggestion= "+list.size());
		
		for(WebElement listItem : list)
		{
			if(listItem.getText().contains("download"))
			{
				listItem.click();
				break;
			}
		}
		
		driver.quit();

	}

}
