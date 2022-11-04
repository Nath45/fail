package setup;     //web driver methods

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6    //example4_get title

	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			 
			 WebDriver driver= new ChromeDriver();

		
			driver.get("https://www.facebook.com/");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			
		}

	}

