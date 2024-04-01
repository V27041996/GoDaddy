package MenulinksGoDaddy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomianMenuLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Search for Domain Names")).click();
		driver.get("https://www.godaddy.com/en-in/domains");
		String name1 = driver.getTitle();
		System.out.println(name1);
		String expected = "Search & Buy Available Domains - Register a Domain with GoDaddy";
		String actual = driver.getTitle();
		if(actual.equals(expected))
		{
		System.out.println("name print true");
		}
		else
		{
		System.out.println("name print false");
		}
		System.out.println("Case1 passed");
		driver.findElement(By.id("bc92338a-8ea1-46e3-ab05-b27bff9d95af")).click();
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Transfer Domain Names")).click();
		driver.get("https://www.godaddy.com/en-in/domains/domain-transfer");
		String name2 = driver.getTitle();
		System.out.println(name2);
		String expected1 = "Domain Transfer | Domain Name Transferring Made Easy - GoDaddy IN";
		String actual1 = driver.getTitle();
		if(actual1.equals(expected1))
		{
		System.out.println("name print true");
		}
		else
		{
		System.out.println("name print false");
		}
		System.out.println("Case2 passed");
		driver.findElement(By.id("bc92338a-8ea1-46e3-ab05-b27bff9d95af")).click();
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Browse Domain Name Options")).click();
		driver.get("https://www.godaddy.com/en-in/domains/gtld-domain-names");
		String name3 = driver.getTitle();
		System.out.println(name3);
		String expected2 = "gTLD Domains | New Top-Level Domains Available - GoDaddy IN";
		String actual2 = driver.getTitle();
		if(actual2.equals(expected2))
		{
		System.out.println("name print true");
		}
		else
		{
		System.out.println("name print false");
		}
		System.out.println("Case3 passed");
	}

}
