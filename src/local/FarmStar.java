package local;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FarmStar {
       
	   WebDriver driver = null;
	
		@Test
		public void FarmStar() {
			System.out.println("i am The FarmStar project");
		System.setProperty("webdriver.chrome.driver","F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://52.172.163.181:9999/signup");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"main\"]//ion-app//-content//ion-card//-card-content//form//-item[1]//ion-input//input")).sendKeys("farmadmin21@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"main\"]//ion-app//ion-content//ion-card//-card-content//form//ion-item[2]//ion-input//input")).sendKeys("Reset@123");
		driver.findElement(By.xpath("//*[@id=\"main\"]//ion-app//-content//ion-card//ion-card-content//form/div[1]//ion-button")).click();
	
		driver.close();
		}
	

}
