package Webelememt_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_GetText
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			
			String text = driver.findElement(By.xpath("//button[text()='Log in']")).getText();
			System.out.println(text);
		}

	}

