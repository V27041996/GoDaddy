package BrowserActionsOnGoDaddy;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;
public class GetallLinks {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.godaddy.com/en-in");
	driver.manage().window().maximize();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<links.size();i++)
	{
	System.out.println(links.get(i).getText());	
	}
	}

}
