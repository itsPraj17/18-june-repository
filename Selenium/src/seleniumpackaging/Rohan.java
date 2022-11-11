package seleniumpackaging;


	import java.util.ArrayList;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	
	public class Rohan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9579595219");
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("9960708672");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	Thread.sleep(2000);

	WebElement searchBox =driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	searchBox.sendKeys("Boat Smart watches");
	Thread.sleep(2000);
	WebElement search =driver.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	Thread.sleep(2000);
	WebElement watch =driver.findElement(By.xpath("//div[@class='col col-7-12']"));
	watch.click();
	Thread.sleep(2000);
	ArrayList<String>Al=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(Al.get(1));
	Thread.sleep(2000);

	WebElement pincode =driver.findElement(By.xpath("//input[@class='_36yFo0']"));
	pincode.click();
	Thread.sleep(2000);
	pincode.sendKeys("400701");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();


	//WebElement cart =driver.findElement(By.xpath("//li[@class='col col-6-12']"));

	try {
	WebElement cart =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	cart.click();
	}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
	WebElement cart =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	Thread.sleep(2000);
	cart.click();
	}




	}

	}


