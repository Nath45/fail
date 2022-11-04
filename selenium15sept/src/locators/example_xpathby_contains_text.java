package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_xpathby_contains_text  //xpath  by contains  using  text
{
		public static void main(String[] args)
		{

			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");

			//click on forgotten pwd link
			driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
			
			
		}

	}
	
