package cpproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learner_login {
	
	  public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver","D:\\Test_Local_EclipseJavaProject//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://uat.weareimago.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("beta_student6@careerpillar.com");
			driver.findElement(By.id("password")).sendKeys("test");
			driver.findElement(By.id("sign-in")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/a[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='lesson-start-left']/div[1]/div/div[2]/div/div[1]/div/div[1]/div/a/img")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@class='play-study-button play-button']")).click();
			
			Thread.sleep(20000);
			
			driver.quit();
			
			
			
			
				}

		}

