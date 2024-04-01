package BrowserActionsOnGoDaddy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Printthepagetitleandurl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//String source = driver.getPageSource();
		//System.out.println(source);
		System.out.println("Script sucess");
		

	}

}
