package demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.com" , "D:\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window = windows.iterator();
		String parentId = window.next();
		String childId = window.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
	}

}
