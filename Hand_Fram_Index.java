package samplejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hand_Fram_Index {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumLearning\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		 //Switching to a frame by index
		 driver.switchTo().frame(2);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		 Thread.sleep(5000);
		 driver.close();
	
	}
}
