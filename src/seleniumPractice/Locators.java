package seleniumPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshetty@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("helo");  //input[type='password'] is exact CSS
		driver.findElement(By.className("signInBtn")).click();

		String errorMsg = driver.findElement(By.cssSelector("p[class='error']")).getText();
		
		if (errorMsg.equals("* Incorrect username or password")); String password = "";{
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(3000L);
			driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
			String paswordString = driver.findElement(By.className("infoMsg")).getText();
			password=paswordString.split("'")[1];
			driver.findElement(By.className("go-to-login-btn")).click();
			Thread.sleep(2000);
		}


		driver.findElement(By.id("inputUsername")).sendKeys("rahulshetty@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();

	}
}
