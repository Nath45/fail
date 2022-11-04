package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_cotainsusing_text    //example2
{
	public static void main(String[] args) throws InterruptedException
		{

			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");

			Thread.sleep(3000);
			//click on Create new acc link
			driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
			
			
		}

	}

