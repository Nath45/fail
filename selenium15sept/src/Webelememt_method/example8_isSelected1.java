package Webelememt_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_isSelected1 
{
	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\administrator\\Downloads\\New folder (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			
			//click on create new acc link
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			Thread.sleep(3000);
			
		 WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@class='_8esa']"));

	boolean result1 = femaleRadioBtn.isSelected();
		if(result1==true)
		{
			System.out.println("radio btn already selected");
		}
		else
		{
			
			System.out.println("radio btn de-selected");
			femaleRadioBtn.click();
			
			Thread.sleep(2000);
			
			boolean result2 = femaleRadioBtn.isSelected();
			if(result2==true)
			{
				System.out.println("radio btn selected");
			}
			else
			{
				System.out.println("radio btn de-selected");
			}	
		}
		}
}














		 

