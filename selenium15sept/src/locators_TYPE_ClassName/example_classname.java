package locators_TYPE_ClassName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_classname
{
	
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("file:///C:/Users/administrator/Downloads/Html%20%20%20files/classnamelocator.html");
		
			//Enter FN
			driver.findElement(By.className("abc123")).sendKeys("xyz");
			
			//Enter LN
			driver.findElement(By.className("abc123")).sendKeys("abc");
			
				
		}

	}

