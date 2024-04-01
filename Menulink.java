package MenulinksGoDaddy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Menulink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Search for Domain Names")).click();
		driver.get("https://www.godaddy.com/en-in/domains");
		String domainname = driver.getTitle();
		System.out.println(domainname);
		String expected = "Search & Buy Available Domains - Register a Domain with GoDaddy";
		String actual = driver.getTitle();
		if(actual.equals(expected))
		{
		System.out.println("Domain name print true");
		}
		else
		{
		System.out.println("Domian name print false");
		}
		System.out.println("Script sucess");
		

	}

}
