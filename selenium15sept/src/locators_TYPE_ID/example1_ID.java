package locators_TYPE_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_ID
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
			driver.get("file:///C:/Users/administrator/Downloads/Html%20%20%20files/IDlocatorsample5.html");
		
			//Enter FN
			driver.findElement(By.id("123")).sendKeys("xyz");
			
			//Enter LN
			driver.findElement(By.id("123")).sendKeys("ashwini");
			
				
		}

	}
	
	
				

