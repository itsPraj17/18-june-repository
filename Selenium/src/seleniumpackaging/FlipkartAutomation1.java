package seleniumpackaging;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAutomation1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9975496825");
			WebElement username =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			username.sendKeys("9975496825");
			Thread.sleep(2000);
			WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("9975496825");
			Thread.sleep(2000);
			WebElement login =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			login.click();
			Thread.sleep(2000);
			WebElement searchBox =driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
			searchBox.sendKeys("Boat Smart watches");
			Thread.sleep(2000);
			WebElement search =driver.findElement(By.xpath("//button[@type='submit']"));
			search.click();
			Thread.sleep(2000);
			// for buying the watch
			WebElement watch =driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
			watch.click();
			Thread.sleep(2000);
			ArrayList<String>Al=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(Al.get(1));
			Thread.sleep(2000);
			WebElement EnterPin =driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
			EnterPin.sendKeys("400701");
			Thread.sleep(2000);
			WebElement cart =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			cart.click();
			Thread.sleep(2000);
			//for buying the Laptop
			WebElement searchBox1 =driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
			searchBox1.sendKeys("apple macbook pro");
			Thread.sleep(2000);
			WebElement search1 =driver.findElement(By.xpath("//button[@type='submit']"));
			search1.click();
			Thread.sleep(2000);
			WebElement laptop =driver.findElement(By.xpath("//div[text()='APPLE 2021 Macbook Pro M1 Max - (32 GB/1 TB SSD/Mac OS Monterey) MK1H3HN/A']"));
			laptop.click();
			Thread.sleep(2000);
			ArrayList<String>A2=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(A2.get(2));
			Thread.sleep(2000);
			WebElement EnterPin1 =driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
			EnterPin1.sendKeys("400701");
			Thread.sleep(2000);
			WebElement cart1 =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			cart1.click();
			//for buying Neckband
			WebElement searchBox2 =driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
			searchBox2.sendKeys("boat Rockerz 333 pro plus");
			Thread.sleep(2000);
			WebElement search2 =driver.findElement(By.xpath("//button[@type='submit']"));
			search2.click();
			Thread.sleep(2000);
			WebElement neckband =driver.findElement(By.xpath("(//a[@title='boAt Rockerz 333 Pro with 60 Hours Battery Bluetooth Headset'])[1]"));
			neckband.click();
			Thread.sleep(2000);
			ArrayList<String>A3=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(A3.get(3));
			Thread.sleep(2000);
			WebElement EnterPin2 =driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
			EnterPin2.sendKeys("400701");
			Thread.sleep(2000);
			WebElement cart2 =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			cart2.click();
			Thread.sleep(2000);
			// for go to My Profile
		    WebElement account=driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]"));
			Actions act= new Actions(driver);
			act.moveToElement(account).click().build().perform();
			Thread.sleep(2000);
			act.moveToElement(account).click().build().perform();
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.xpath("//div[text()='Logout']"));
			logout.click();
			Thread.sleep(2000);
			driver.quit();
		}
}
			


