import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.get("https://www.google.com"); //UrL Insert
	}
}
