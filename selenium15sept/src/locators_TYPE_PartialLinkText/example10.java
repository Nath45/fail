package locators_TYPE_PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10  
{
	
		public static void main(String[] args)  
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("file:///C:/Users/administrator/Downloads/Html%20%20%20files/sample10partiallinkktext.html");
		
			//click on facebook link
			driver.findElement(By.partialLinkText("book")).click();
			

				
		}

	}

