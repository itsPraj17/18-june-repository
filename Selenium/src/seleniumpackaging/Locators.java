package seleniumpackaging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();	//method chaining to browser maximize
		driver.get("https://www.facebook.com/login/");		//URL insert
		Thread.sleep(5000);
		//driver.findElement(By.className("email")).sendKeys("VelocityClass");
		//driver.findElement(By.id("pass")).sendKeys("password");
		//driver.findElement(By.name("login")).click();
		WebElement LoginButton= driver.findElement(By.tagName("button"));
		LoginButton.click();
		LoginButton.sendKeys("prajktajori0@gmail.com");
		
		

}
}
