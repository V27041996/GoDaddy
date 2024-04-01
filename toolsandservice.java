package MenulinksGoDaddy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsandservice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Generate Domain Names")).click();
		driver.get("https://www.godaddy.com/en-in/domains/domain-name-generator");
		String title1 = driver.getTitle();
		System.out.println(title1);
		String expectedtitle = "GoDaddy IN: Domain Name Generator | Domain Name Suggestions";
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(expectedtitle))
		{
		System.out.println("title print true");	
		}
		else
		{
		System.out.println("title print false");
		}
		System.out.println("Case1 passed");
		driver.get("https://www.godaddy.com/en-in");
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Find a Domain Owner (WHOIS)")).click();
		driver.get("https://www.godaddy.com/en-in/whois");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String expectedtitle1 = "WHOIS Domain Lookup | Discover website owner details - GoDaddy IN";
		String actualtitle1 = driver.getTitle();
		if(actualtitle1.equals(expectedtitle1))
		{
		System.out.println("title print true");
		}
		else
		{
		System.out.println("title print false");
		}
		System.out.println("Case2 passed");
		driver.get("https://www.godaddy.com/en-in");
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Domain Broker Service")).click();
		driver.get("https://www.godaddy.com/en-in/domains/domain-broker");
		String title3 = driver.getTitle();
		System.out.println(title3);
		String expectedtitle2 = "Domain Broker Service | Let our experts secure your domain GoDaddy IN";
		String Actualtitle2 = driver.getTitle();
		if(Actualtitle2.equals(expectedtitle2))
		{
		System.out.println("Title print true");
		}
		else
		{
		System.out.println("Title print false");
		}
		System.out.println("Case3 passed");
	}

}
