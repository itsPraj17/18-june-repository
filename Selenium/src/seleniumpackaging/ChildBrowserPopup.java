package seleniumpackaging;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	//Browser Launch
		driver.manage().window().maximize(); 	//method chaining to browser maximize
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(3000);
		String mainWindowID =driver.getWindowHandle();	//return ID of main window
		String expUrl= "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		String expID= "";
		Set<String> allAdd=driver.getWindowHandles();	//main+ ID of child Windows
		/*for(String s: allAdd) {
			System.out.println(s); 	//fetching one by one from set
			driver.switchTo().window(s);	//switch to new window by using ID
			String actURL= driver.getCurrentUrl(); 	//fetching the url of new window after switch
			if(expUrl.equals(actURL)) {
				System.out.println("Correct Window");
				expID=s;	//stored ID after switch in correct window
			}else {
				System.out.println("Wrong Window");
			}
			}*/
		driver.switchTo().window(expID);	//switch to expected window by ID
	}
}
