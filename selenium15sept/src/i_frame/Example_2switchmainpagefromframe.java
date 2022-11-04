package i_frame;

public class Example_2switchmainpagefromframe 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Users\\\\administrator\\\\Downloads\\\\New folder (2)\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

			//switch to frame
			driver.switchTo().frame("iframeResult");      //String frameID
				
			//click on date & time btn from iframe 
			driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
			Thread.sleep(2000);
			
			//switch to main page
			//driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			
			//click on open menu from main page
			driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		}

	}

