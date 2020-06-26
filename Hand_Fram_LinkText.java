package samplejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hand_Fram_LinkText {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumLearning\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		 
		 driver.switchTo().frame(2);//Switch to the third frame.
		 driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		 
		 Thread.sleep(5000);
		 driver.switchTo().frame(0); //Switch to 1st frame
		 
		 driver.findElement(By.linkText("org.openqa.selenium")).click();
		 Thread.sleep(5000);
		 driver.close();
}
}
	