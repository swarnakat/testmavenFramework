package group1.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    		System.setProperty("WebDriver.chrome.driver", "");
    		WebDriver driver=new ChromeDriver();
    		driver.get("http://clicktool.com");
    		//driver.findElement(By.cssSelector("a[data-ctid=navbarAgencyDesktop]")).click();
    		driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[1]/span/nav/ul/li[2]/a[1]/button")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.name("email")).sendKeys("swarna@clicktool.com");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//*[@id=\"contentPageHeight\"]/div/div[2]/div[2]/form/div[2]/div/input")).sendKeys("12343");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//*[@id=\"contentPageHeight\"]/div/div[2]/div[2]/form/button")).click();
    }
}
