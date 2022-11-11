package seleniumpackaging;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(2000);
		WebElement tryIt= driver.findElement(By.xpath("//a[text()='Try it Yourself »'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("argument[0].scrollIntoView(true)",tryIt);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);


	}

}
