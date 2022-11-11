package seleniumpackaging;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		Calendar cal= Calendar.getInstance();
		Date time= cal.getTime();
		String timestamp= time.toString().replace(":", "-");
		System.out.println(time);
		System.out.println(timestamp);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest= new File("D:\\Prajakta Padval\\Screenshot\\instagram"+ timestamp + ".jpg");
		FileHandler.copy(source, Dest);

	}

}
