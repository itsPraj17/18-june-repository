package seleniumpackaging;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();	//browser launch
	driver.manage().window().maximize();	//method chaining to maximize browser
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='confirmation']")).click();
	Thread.sleep(3000);
	Alert alt = driver.switchTo().alert();
	//alt.getText();	//fetch the text on alert pop-up
	alt.accept();	//accept the alert pop-up (OK)
	//alt.dismiss();	//dismiss the alert pop-up(cancel)
	//alt.sendKeys("prajkta");	//Enter the text into input field on alert pop-up
	Thread.sleep(2000);
	driver.close();
}
}