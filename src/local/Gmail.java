package local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.gmail.com");
		
		driver.manage().window().maximize();

		
		driver.quit();
	}


}