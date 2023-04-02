package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 
{
	
	public static WebDriver driver;
	public static void main(String[]args) throws InterruptedException 
	{
		
	System.setProperty("WebDriver.chrome.driver","C:\\IIEMTESTOMETER\\browser\\chromedriver.exe" );
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	driver = new ChromeDriver(options);

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(2000);
	WebElement  logoPresent=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img"));
	if(logoPresent.isDisplayed()) 
	{
		System.out.println("logo is present ");
		
	}
	
	else 
	{
		
		System.out.println("logo is not present");
	}
		
}
	
	
	
	
	
	
	

}
