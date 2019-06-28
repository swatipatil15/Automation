package cpproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	  public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver","D:\\Test_Local_EclipseJavaProject//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.v2solutions.com:4030/#/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("beta_edgar@careerpillar.com");
	driver.findElement(By.id("password")).sendKeys("test");
	driver.findElement(By.id("sign-in")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div[4]/ul/li[2]/a")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ui-view/div[1]/div/div/div/button")).click();
	
	
	//Thread.sleep(5000);
	
	//driver.quit();
	
	
	
	
		}

}