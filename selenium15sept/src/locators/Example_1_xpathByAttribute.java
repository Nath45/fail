package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1_xpathByAttribute 
{
public static void main(String[]args)
{
System.setProperty("webdriver.chrome.driver");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	//driver.findElement(By.xpath("Locator type")
	//driver.findElement(By.xpath("StringxpathExpression"))
	
	//enter UN
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwinisaurabhvidhate");
	
	//enter pwd
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("malhar@123");
	
	//click on login button
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
}
}