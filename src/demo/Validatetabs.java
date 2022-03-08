package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatetabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.com" , "D:\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebElement footer = driver.findElement(By.id("gf-BIG"));
//		WebElement lastBox = footer.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
		
		WebElement lastBox =driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int linksCount = (lastBox.findElements(By.tagName("a")).size());
		System.out.println("no of links in area " +linksCount +" including header.");
		
		

		
		
//		opening and closing one by one 
		/*for (int i=1; i<linksCount;i++) 

		for (int i=0; i<linksCount;i++) 

		{
			
			
			lastBox.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			Thread.sleep(5000L);
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> window = windows.iterator();
			
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> window = windows.iterator();
			String parentId = window.next();
			String childId = window.next();
			
			driver.switchTo().window(childId);
			System.out.println(driver.getTitle());
		    driver.close();

		    driver.switchTo().window(tabs2.get(0));				
						
		}*/
		
//		opening all the links at once in selected area and print one by one 
		
		for (int i=1; i<linksCount;i++) 
		{

		    driver.switchTo().window(parentId);
		    
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		    driver.switchTo().window(tabs2.get(1));
//		    System.out.println(driver.getTitle());
//		    driver.close();
//		    driver.switchTo().window(tabs2.get(0));				

			
			
			lastBox.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window = windows.iterator();
		

		while (window.hasNext()) 
		{
			String a = window.next();
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
		}

		driver.quit();
		

	}

}

