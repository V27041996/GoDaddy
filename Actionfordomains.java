package MenulinksGoDaddy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionfordomains {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Auctions for Domain Names")).click();
		driver.get("https://auctions.godaddy.com/beta");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		String expectedtitle = "GoDaddy Domain Auctions";
		String actual = driver.getTitle();
		if(actual.equals(expectedtitle))
		{
		System.out.println("Title name print true");
		}
		else
		{
		System.out.println("Title name print false");
		}
		System.out.println("Case1 Passed");
		driver.get("https://www.godaddy.com/en-in");
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Appraise Domain Name Value")).click();
		driver.get("https://in.godaddy.com/domain-value-appraisal");
		Thread.sleep(5000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		String expectedtitle1 = "Free Domain Value and Appraisal Tool | What is your domain worth? - GoDaddy IN";
		String actual1 = driver.getTitle();
		if(actual1.equals(expectedtitle1))
		{
		System.out.println("Title name print true");
		}
		else
		{
		System.out.println("Title name print false");
		}
		System.out.println("Case2 Passed");
		driver.get("https://www.godaddy.com/en-in");
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Investing in Domain Names")).click();
		driver.get("https://www.godaddy.com/en-in/domains/domain-investing");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String expectedtitle2 = "Domain Investing | Resources to help you get started - GoDaddy IN";
		String actualtitle2 = driver.getTitle();
		if(actualtitle2.equals(expectedtitle2))
		{
		System.out.println("Title name print true");
		}
		else
		{
		System.out.println("Title name print false");
		}
		System.out.println("case3 Passed");
	}

}
