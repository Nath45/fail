package Webelememt_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendKey

{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			
			//enter UN
			//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
			WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
			un.sendKeys("abc");
		
		}

	}

