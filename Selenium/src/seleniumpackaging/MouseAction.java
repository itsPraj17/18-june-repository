package seleniumpackaging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement changeLanguage =driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		
		/*act.moveToElement(changeLanguage).perform();	//move mouse cursor on particular webelement
		act.contextClick().perform();	// right click
		Thread.sleep(2000);
		
		act.contextClick(changeLanguage).perform();	// right click on particular webelement
		act.moveToElement(changeLanguage).perform();	//move mouse cursor on particular webelement
		
		act.click().perform();	//left or right click
		act.click(changeLanguage).perform();	//click on particular webelement
		
		act.doubleClick().perform();	// double click
		act.doubleClick(changeLanguage).perform();	//double click on particular webelement
		*/
		
		//combining and executing multiple actions in one line
		act.moveToElement(changeLanguage).click().build().perform();
	}

}
