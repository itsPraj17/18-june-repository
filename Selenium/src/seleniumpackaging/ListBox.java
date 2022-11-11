package seleniumpackaging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement FirstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Prajkta");
		Thread.sleep(2000);

		WebElement Surname= driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("Padval");
		Thread.sleep(2000);
		
		WebElement Mobile= driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		Mobile.sendKeys("9975496825");
		Thread.sleep(2000);
		
		WebElement password= driver.findElement(By.xpath("//input[@aria-label='New password']"));
		password.sendKeys("Prajkta@12345");
		Thread.sleep(2000);

		WebElement Day= driver.findElement(By.xpath("//select[@id='day']"));
		Select D= new Select(Day);
		D.selectByIndex(16);
		Thread.sleep(2000);
		
		WebElement Month= driver.findElement(By.xpath("//select[@id='month']"));
		Select M= new Select(Month);
		M.selectByVisibleText("Aug");
		Thread.sleep(2000);
		
		WebElement Year= driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select Y= new Select(Year);
		Y.selectByValue("1998");
		
		WebElement Female =driver.findElement(By.xpath("//label[text()='Female']"));
		Actions act= new Actions(driver);
		act.moveToElement(Female).click().perform();
		
		WebElement login =driver.findElement(By.xpath("//button[@name='websubmit']"));
		login.click();
		
		WebElement friends =driver.findElement(By.xpath("//span[text()='Find Friends'][1]"));
		friends.click();
		//a[@aria-label='Home']
		//WebElement home =driver.findElement(By.xpath("//a[@aria-label='Home']"));
		//home.click();



		
	}
	}


