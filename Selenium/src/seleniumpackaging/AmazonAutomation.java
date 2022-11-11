package seleniumpackaging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutomation {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	Thread.sleep(2000);
	
	WebElement username =driver.findElement(By.xpath("//input[@id='ap_email']"));
	username.sendKeys("prajktajori0@gmail.com");
	WebElement signin =driver.findElement(By.xpath("//input[@id='continue']"));
	signin.click();
	Thread.sleep(2000);
	
	WebElement password =driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys("Praj@9975496825");
	WebElement Signin =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	Signin.click();
	Thread.sleep(2000);
	WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.click();
	search.sendKeys("Mobile");
	Thread.sleep(2000);
	WebElement select =driver.findElement(By.xpath("//span[text()=' under 15000']"));
	select.click();
	Thread.sleep(2000);
	
	WebElement mobile =driver.findElement(By.xpath("(//span[text()='Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB)'])[1]"));
	mobile.click();
	Thread.sleep(2000);
	WebElement cart =driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	cart.click();
	Thread.sleep(2000);
	WebElement tele =driver.findElement(By.xpath("//input[@type='tel']"));
	tele.sendKeys("9975496825");
	Thread.sleep(2000);
	WebElement next =driver.findElement(By.xpath("//input[@type='submit']"));
	next.click();
	


	

	

	}
}
