package cpproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class employer_login {
	public static void main(String[] args) throws Exception  {		
	System.setProperty("webdriver.chrome.driver","D:\\Test_Local_EclipseJavaProject\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.v2solutions.com:4030/#/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("beta_lionel.m@yopmail.com");
	driver.findElement(By.id("password")).sendKeys("test");
	driver.findElement(By.id("sign-in")).click();
	
	Thread.sleep(20000);
	
	driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div[3]/ul/li[2]/a")).click();
	
	Thread.sleep(20000);
	
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/div[1]/div/div/div[1]/div[2]/div[2]/button")).click();
	Thread.sleep(20000);
	
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/fieldset/div[2]/div[1]/div/div/div[1]/input")).sendKeys("Employer Tour");
	
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/fieldset/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("4");
	
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/fieldset/div[2]/div[3]/div[1]/textarea")).sendKeys("sample description");
	
	Thread.sleep(20000);

	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[2]/div[3]/div/button")).click();
	
	//find the date 
	//driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[2]/div/div/div/div/div[1]/input")).click();
	
		
	//Select Date
	
	//driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[2]/div/div/div/div/div[1]/input")).sendKeys("06/20/2019");
	
	//Select reschedule -
	
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[3]/div/div[1]/input")).click();
	
	//Step 2://
	//SELECT_ADDRESS
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[4]/div/div[1]/input")).click();
	
	//SELECT_LOCATION-
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[4]/div/div[3]/div[1]/input")).sendKeys("School name");
	
	//CLICK_NEXT -
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[2]/div[3]/div/button")).click();
	
	//Step 3://
	//SELECT DEPARTMENTS -
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/input")).click();
	
	//SELECT DRESSCODE -
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[2]/div[3]/div[1]/div[2]/input")).sendKeys("Formal dress code");
	
	//SELECT_LUNCH =
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[1]/div/div[2]/div[3]/div[2]/div/span[1]/input")).click();
	
	//Step 4://
	//CLICK_NEXT -
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[2]/div[3]/div/button")).click();
	
	//Step 5://
	
	//CLICK_NEXT -
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/div[1]/div[2]/div/div/div[3]/div/button")).click();
	
	Thread.sleep(20000);
	
	//Step 6://
	//CLICK NEXT -
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div/div[3]/div/button")).click();
	
	//Step 7://
	
	//CLICK POST Button -
	driver.findElement(By.xpath("//*[@id='host-new']/div/div/div/ng-include/form/div[2]/div[3]/div/button")).click();

	driver.quit();
	
	
	}
}
