package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 
{
	
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\administrator\\\\Downloads\\\\New folder (2)\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			
		String url = driver.getCurrentUrl();
			System.out.println(url);
			
		}

	}

