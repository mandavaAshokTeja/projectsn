package local;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;

	public class TFP {
		  
		WebDriver driver = null;
	
        @Test
		public void TFP() throws InterruptedException {
			 System.out.println("I am the TFP Project");
		
			
			System.setProperty("webdriver.chrome.driver", "F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("http://183.82.100.162:8082/");
			
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//*[@id=\"ctl00_lblloginstatus\"]/a")).click();
			driver.findElement(By.id("ctl00_PageContent_txtUsername104")).sendKeys("tejaswini1122");
			driver.findElement(By.id("ctl00_PageContent_txtPassword106")).sendKeys("123456");
			driver.findElement(By.id("ctl00_PageContent_btnSave")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_divPrograms\"]/div[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_divPrograms\"]/div[5]")).click();
		    Thread.sleep(2000);
			
			driver.close();
		}
}