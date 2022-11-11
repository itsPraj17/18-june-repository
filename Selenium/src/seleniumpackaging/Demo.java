package seleniumpackaging;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException { //throws declaration due to the thread
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(); // Browser launch
	
	driver.manage().window().maximize(); // method chaining for browser maximize
	Thread.sleep(5000);
	driver.manage().window().minimize(); //not working
	Thread.sleep(5000);
	Options op= driver.manage();
	Window w= op.window();
	w.maximize();
	
	Dimension D1= new Dimension(100,200);
	driver.manage().window().setSize(D1);	// browser size
	Thread.sleep(4000);
	Point p= new Point(300,400);
	driver.manage().window().setPosition(p);	//browser position
	driver.manage().window().maximize(); // method chaining for browser maximize

	
	
	//driver.get("https://www.selenium.dev/downloads/");// insert url in browser
	
	driver.navigate().to("https://www.selenium.dev/downloads/"); //method chaining
 System.out.println(driver.getTitle());	// return the title of the tab
	
	Navigation nv = driver.navigate();
	nv.back();	// Backward
	nv.forward();	//forward
	Thread.sleep(5000);	// wait for 2 seconds and then execute line 24
	nv.refresh();	//browser refresh/reload
	Thread.sleep(5000);	// wait/ delay for 2 seconds and then execute line 26
	//driver.close();	// close current tab //Socket exception occure due to close method -version error
	driver.quit(); //all tab of browser are close
	
	}
}
