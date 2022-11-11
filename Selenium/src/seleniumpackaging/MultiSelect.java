package seleniumpackaging;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanjay Padval\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(3000);
		WebElement lan= driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s= new Select(lan);
		Thread.sleep(1000);
		s.selectByValue("java");
		Thread.sleep(1000);
		s.selectByValue("js");
		Thread.sleep(1000);
		s.selectByValue("c#");
		Thread.sleep(1000);
		
		
		WebElement firstSelected= s.getFirstSelectedOption(); // return first selected option
		System.out.println(firstSelected); 	//It will return webelement 
		System.out.println(firstSelected.getText()); 	//return text of webelement
		System.out.println(s.getFirstSelectedOption().getText());	//return text of webelement
		System.out.println(s.isMultiple()); 	//True verify listBox is Multi-selectable or not 
		
		List<WebElement> l=s.getAllSelectedOptions();   //return all selected options only
		List<WebElement> l2=s.getOptions();  //return all options of listBox
		System.out.println(l.size());    //count of options present in listBox
		
		
		System.out.println(l2.size());  //count of selected options

		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i).getText());  //print text of all options
		}
		//s.deselectByValue("java");		//deselect selected option
		Thread.sleep(1000);
		s.deselectByIndex(0);		//deselect selected option
		Thread.sleep(1000);
		s.deselectByIndex(1);		Thread.sleep(1000);
		//deselect selected option
		s.deselectByIndex(2);		//deselect selected option

		//s.deselectByVisibleText("c#");		//deselect selected option
		//s.deselectAll();		// deselect all selected options
		driver.close();
	}
}
