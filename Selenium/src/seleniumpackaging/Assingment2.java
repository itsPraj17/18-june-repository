package seleniumpackaging;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	Options op= driver.manage();
	Window W= op.window();
	W.maximize();
	
	driver.get("https://www.google.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	driver.navigate();
	Navigation nv= driver.navigate();
	nv.back();
	
	//driver.get("https://www.google.com/");
	Thread.sleep(3000);
	Dimension D1= new Dimension(200,400);
	driver.manage().window().setSize(D1);
	Thread.sleep(2000);
	
	Point P1= new Point (100,500);
	driver.manage().window().setPosition(P1);
	Thread.sleep(2000);
	
	Options op1= driver.manage();
	Window W1= op1.window();
	W1.maximize();
	Thread.sleep(2000);
	nv.back();
	
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	nv.refresh();
	Thread.sleep(2000);
	driver.close();		//close current tab/ browser
	driver.quit();	// close all the tabs / browsers
	
	}
}
