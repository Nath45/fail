package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_text2 
{
	
		public static void main(String[] args)
		{

			System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Users\\\\administrator\\\\Downloads\\\\New folder (2)\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");

			//click on Create new acc link
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			
		}

	}

