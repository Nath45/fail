package locators_TYPE_LinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("file:///C:/Users/administrator/Downloads/Html%20%20%20files/sample9linktext.html");
		
			//click on facebook link
			driver.findElement(By.linkText("facebook")).click();
			

				
		}

	}

