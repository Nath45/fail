package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_bycontains_using_attributes
{
	
	public static void main(String[] args)
		{

			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");

			//enter UN
			driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
			
			//enter pwd
			driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
		}

	}

