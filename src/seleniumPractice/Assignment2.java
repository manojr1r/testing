package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Rahul");
		driver.findElement(By.name("email")).sendKeys("Rahul@gm.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password");
		driver.findElement(By.id("exampleCheck1")).click();
		
//		driver.findElement(By.xpath("//div/select")).click();
//		driver.findElement(By.xpath("//div/select/option/following-sibling::option[1]")).click();
		
		//below work for select tagName(Static drop down) 
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		System.out.println(dropdown.getFirstSelectedOption().getText()); //to check selected drop down
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText()); //to check selected drop down
		dropdown.selectByVisibleText("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("01-01-2021");
		driver.findElement(By.className("btn-success")).click();
		
		
		
		
	}

}
