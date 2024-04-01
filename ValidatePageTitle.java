package BrowserActionsOnGoDaddy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatePageTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		String expectedtitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		String Actualtitle = driver.getTitle();
		if(Actualtitle.equals(expectedtitle))
		{
		System.out.println("Title is displayed correctly");
		}
		else
		{
		System.out.println("Title is not displayed");
		}
		System.out.println("Actual title");
		String expectedurl = "https://www.godaddy.com/en-in";
		String Actualurl =driver.getCurrentUrl();
		if(Actualurl.equals(expectedurl))
		{
		System.out.println("url is displayed correctly");
		}
		else
		{
		System.out.println("url is not displayed");
		}
		System.out.println("Actual url");
	}

}
