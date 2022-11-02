import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaTwo {
	public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	     
	      WebDriver driver=new ChromeDriver();
	     
	      driver.get("file:///C:/Users/Shatha/Desktop/projectTwo/lecture2.html");
	      String ourTitle = driver.getTitle();
	      System.out.println(ourTitle);
	      List <WebElement> optionList = driver.findElements(By.tagName("option"));
	      for(int i = 0 ; i <optionList.size();i++) {
	    	 
	      	System.out.println(	optionList.get(i).getText());
	      }
	     
	     
	}
}