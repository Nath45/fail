package Webelememt_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_isSelected 
{


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\\\\\Users\\\\\\\\administrator\\\\\\\\Downloads\\\\\\\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
	 boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
	 System.out.println(result);
	 
	 if(result==true)
	 {
		 System.out.println("Radio btn selected");
	 }
	 else
	 {
		 System.out.println("Radio btn de-selected");
	 }
	 
	}
}


