package locators_TYPE_tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Users\\\\administrator\\\\Downloads\\\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("file:///C:/Users/administrator/Downloads/Html%20%20%20files/sample4tagname_locator.html");
		
			//Enter FN
			driver.findElement(By.tagName("input")).sendKeys("xyz");
			
			//Enter LN
			driver.findElement(By.tagName("input")).sendKeys("abc");
			
				
		}

	}

