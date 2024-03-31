package selenium_Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("shubh");
		driver.findElement(By.name("inputPassword")).sendKeys("Test123");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("shubh");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("shubh@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("test@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7878787878");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		driver.close();
		

	}

}
