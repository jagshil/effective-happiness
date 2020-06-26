package samplejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Exe 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver","C:\\SeleniumLearning\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("http://www.rediff.com");
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 driver.manage().window().maximize();
	 
	 String DomainName = js.executeScript("return document.domain;").toString();
	 System.out.println("Domain name of the site :  " + DomainName);
	 
	 String url=js.executeScript("return document.URL;").toString();
	 System.out.println("Url of the site is : " +url);
	 
	 String Titlename=js.executeScript("return document.title;").toString();
	 System.out.println("Title of the page= " + Titlename);
	 
	 System.out.println("Success");
	 driver.quit();
	 		 
 }
}
