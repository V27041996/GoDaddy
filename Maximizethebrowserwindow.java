package BrowserActionsOnGoDaddy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Maximizethebrowserwindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized sucessfully");

	}

}
