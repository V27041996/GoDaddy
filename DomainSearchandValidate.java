package DomainNameSearch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomainSearchandValidate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
		WebElement PageColor = driver.findElement(By.xpath("/html"));
		String color = PageColor.getCssValue("color");
		System.out.println(color);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Search for Domain Names")).click();
		driver.get("https://www.godaddy.com/en-in/domains");
		String title = driver.getTitle();
		System.out.println(title);
		String expected = "Search & Buy Available Domains - Register a Domain with GoDaddy";
		String Actual = driver.getTitle();
		if(Actual.equals(expected))
		{
		System.out.println("title print true");
		}
		else
		{
		System.out.println("title print false");
		}
		System.out.println("Case 1 passed");
		driver.findElement(By.xpath("//*[@id=\"id-0e72a714-c6bc-433d-b797-83fc3aec378f\"]")).sendKeys("my domain");
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div/div/div/form/div/div/button"));
		boolean isSearchenabled = Search.isEnabled();
		if(isSearchenabled)
		{
		 Search.click();
		 System.out.println("Search button is enabled");
		}
		else
		{
		System.out.println("Search button is not enabled");
		}
		
		System.out.println("Script sucess");
	}

}
