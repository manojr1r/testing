package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightTickect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000L);
		
		  //check if it is not allowing more than 9 combine adult and child
		int i= 1;
		while (i<10 )  {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
				{
				System.out.println();
			}
			 
		}

	}

}
