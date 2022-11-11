package apache;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	//Browser Launch
		driver.manage().window().maximize(); 	//method chaining to browser maximize
		driver.get("https://www.facebook.com/"); 
		//selenium version 3 syntax
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//selenium version 4 syntax
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='login']")));
		ele.click();  
	}

}
