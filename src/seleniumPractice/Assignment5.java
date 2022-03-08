package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chromedriver.com" , "D:\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame("frame-top");
		
//		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-left']")));
		driver.switchTo().frame("frame-middle");
//		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
	}

}
