package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test2 
{
	
	
	public static WebDriver driver;
	public static void main(String[]args) throws InterruptedException 
	{
		
	System.setProperty("WebDriver.chrome.driver","C:\\IIEMTESTOMETER\\browser\\chromedriver.exe" );
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	driver = new ChromeDriver(options);

	Thread.sleep(2000);
	driver.get("https://www.makemytrip.com/flights/");
	
	
	driver.manage().window().maximize();
	

	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"fsw_inputBox searchCity inactiveWidget \"]/label")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"hsw_autocomplePopup autoSuggestPlugin \"]/div/input")).sendKeys("Mumbai");

	
 List<WebElement>  list=driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));

	
	
    for(int i=0; i<=list.size(); i++) 
    {
    		
    	String text=list.get(i).getText();
    	System.out.println(text);
    	
    	if( text.contains("Mumbai")) 
    	{
    		Thread.sleep(2000);
    		list.get(i).click();
    		break;
    		
    	}
    	
 
    }
    
  
    
    
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class=\"fsw_inputBox searchToCity inactiveWidget \"]//span)[1]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween\"]//input")).sendKeys("New Delhi, India");

	Thread.sleep(2000);
 List<WebElement>  list1=driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));

	
       Thread.sleep(2000);
    for(int i=0; i<=list1.size(); i++) 
    {
    	Thread.sleep(2000);
    	String text=list1.get(i).getText();
    	System.out.println(text);
    	
    	if( text.contains("New Delhi, India")) 
    	{
    		Thread.sleep(2000);
    		list1.get(i).click();
    		break;	
    	}
    	
    }
      
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class=\"DayPicker-Day\"]//p[text()='20'])[1]")).click();	
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@data-cy=\"returnArea\"]/label")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@aria-label=\"Thu May 25 2023\"]//p")).click();
    
    
}
		
	
}	


