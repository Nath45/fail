package i_frame;
import org.opeqa.selenium.By;
import org.openqa.selenium.webdriver;
import org.openqa.selenium.chrome.chromeDriver;
public class Example_1SwitchToFrame
{

		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Users\\\\administrator\\\\Downloads\\\\New folder (2)\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

			//switch to frame
			//driver.switchTo().frame("iframeResult");      //String frameID
			//driver.switchTo().frame("iframeResult");        //String frameName
			//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
			driver.switchTo().frame(1);                 //int frameIndex
			
			Object By;
			//click on date & time btn
			driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
			
		}

	}

