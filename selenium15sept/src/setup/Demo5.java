package setup;     // WebDriver

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5     //example3_quit
{
	
		public static void main(String[] args)
		{
			
System.setProperty("webdriver.chrome.driver","C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			 
			 WebDriver driver= new ChromeDriver();
			
			
			driver.get("https://www.google.com/");
			
			driver.quit();
			
			
		}

	}

