package seleniumpackaging;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RediffAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='login1']"));
		username.click();
		Thread.sleep(3000);
		username.sendKeys("prajktasanjaypadval123@rediffmail.com");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys("Praj@9876543210");
		Thread.sleep(3000);
		WebElement keepMeSignedInButton=driver.findElement(By.xpath("//input[@type='checkbox']"));
		keepMeSignedInButton.click();
		Thread.sleep(3000);
		WebElement signInButton= driver.findElement(By.xpath("//input[@type='submit']"));
		signInButton.click();
		
		Thread.sleep(3000);
		
	/*	//homepage;
		
		WebElement openBulkTab=driver.findElement(By.xpath("//li[@class='fld_icon is_folder']"));
		openBulkTab.click();
		
		Thread.sleep(2000);
		
		WebElement openFirstMail = driver.findElement(By.xpath("//span[@title='Roadmap to becoming an expert in Embedded domain']"));
		openFirstMail.click();
		Thread.sleep(2000);
		
		WebElement Scroll=driver.findElement(By.xpath("//input[@class='rd_btn']"));
		JavascriptExecutor J=(JavascriptExecutor)driver;
		J.executeScript("arguments[0].scrollIntoView(true)",Scroll);
		
		
		*/
	    //write mail
		WebElement writeMail=driver.findElement(By.xpath("//li[@title='Compose a new mail']"));
		writeMail.click();
		Thread.sleep(3000);
		
		WebElement sendTo=driver.findElement(By.xpath("//ul[@id='as-selections-TO_IDcmp2']"));
		Actions act=new Actions(driver);
		act.click(sendTo).perform();
		Thread.sleep(2000);
		act.sendKeys(sendTo, "rohanjadhav1796@gmail.com").perform();
		WebElement addid=driver.findElement(By.xpath("//a[@class='cc_bcc_ng rd_mr_cc_bcc']"));
		addid.click();
		Thread.sleep(2000);
		
		WebElement MailSubject=driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']"));
		MailSubject.click();
		MailSubject.sendKeys("Study");
		Thread.sleep(2000);
		
		WebElement WriteMail=driver.findElement(By.xpath("//div[@id='cke_1_contents']"));
		WriteMail.click();
		Thread.sleep(2000);
		act.sendKeys(WriteMail, "focus on study !").perform();
		Thread.sleep(2000);
		
		WebElement SendMailButton=driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']"));
		SendMailButton.click();
		
		Thread.sleep(3000);
		
		//calender
		WebElement calenderButton=driver.findElement(By.xpath("//div[@class='rd_wid3']"));
		calenderButton.click();
		Thread.sleep(2000);
		
		WebElement NewEventButton=driver.findElement(By.xpath("//div[@id='calendarNewEvent']"));
		NewEventButton.click();
		Thread.sleep(2000);
			
		WebElement SubjectOfCalenderEvent=driver.findElement(By.xpath("//input[@id='subject_event']"));
		SubjectOfCalenderEvent.click();
		SubjectOfCalenderEvent.sendKeys("Spiritual Meet");
		Thread.sleep(2000);
		
		WebElement LocationOfCalenderEvent=driver.findElement(By.xpath("//input[@id='location_event']"));
		LocationOfCalenderEvent.click();
		LocationOfCalenderEvent.sendKeys("Las Vegas");
		Thread.sleep(2000);
		
		WebElement StartDateOfCalenderEvent=driver.findElement(By.xpath("//input[@id='start_date']"));
		StartDateOfCalenderEvent.clear();
		StartDateOfCalenderEvent.sendKeys("30/11/2022");
		Thread.sleep(2000);
		
		WebElement EndDateOfCalenderEvent=driver.findElement(By.xpath("//input[@id='end_date']"));
		EndDateOfCalenderEvent.clear();
		EndDateOfCalenderEvent.sendKeys("2/12/2022");
		Thread.sleep(2000);
		
		WebElement SaveButtonForCalenderEvent=driver.findElement(By.xpath("//span[@id='saveEventText']"));
		SaveButtonForCalenderEvent.click();
		Thread.sleep(2000);
		
		//logout
		WebElement logout=driver.findElement(By.xpath("//a[@class='rd_logout']"));
		logout.click();
		}

}



