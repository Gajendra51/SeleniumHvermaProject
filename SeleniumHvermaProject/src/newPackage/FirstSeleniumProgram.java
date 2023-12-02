/**
 * 
 */
package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author GKSingh
 *
 */
public class FirstSeleniumProgram extends ParentClass{
	public static void main(String[] args)throws Exception{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Chrome opened");
		driver.close();
		System.setProperty("webdriver.gecko.driver","\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Selenium First Program");
		Thread.sleep(3000);
		driver.close();
		
		
		System.out.println("Test Passed");
	
		
	}

}
