package seleniumpackaging;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.getCurrentUrl();
	Thread.sleep(2000); //delay for 2 seconds
	
	Options op= driver.manage();
	Window w= op.window();
	w.maximize();	//maximize the browser
	
	Dimension D1= new Dimension(500,600);
	driver.manage().window().setSize(D1); //change size
	
	Point P1 = new Point(100,100);
	driver.manage().window().setPosition(P1);	//change position
	driver.close(); // close the browser
	

}
}
