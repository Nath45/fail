package Webelememt_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled 
{

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Users\\\\administrator\\\\Downloads\\\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			
			boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
			System.out.println(result);
			
			if(result==true)
			{
				System.out.println("Element is enabled");
			}
			else
			{
				System.out.println("Element is disabled");
			}
		}

	}

