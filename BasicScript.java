package BrowserActionsOnGoDaddy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromr.driver", "C:\\Users\\salka\\Desktop\\chrome");
		WebDriver DDD = new ChromeDriver();
		DDD.get("https://www.godaddy.com/en-in");
		DDD.manage().window().maximize();
		System.out.println(DDD.getCurrentUrl());
		System.out.println(DDD.getTitle());
		System.out.println("Script sucess");
		DDD.quit();
		

	}

}
