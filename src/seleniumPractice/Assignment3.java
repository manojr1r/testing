package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String info = driver.findElement(By.xpath(("//*[contains(text(),'username is')]"))).getText();
		String[] username = info.split("is")[1].trim().split(" ");
		String[] passWord = info.split("is")[2].trim().split("\\)");

		driver.findElement(By.cssSelector("#username")).sendKeys(username[0]);
		driver.findElement(By.cssSelector("#password")).sendKeys(passWord[0]);

		driver.findElement(By.xpath("//input[@value='user']")).click();

//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);

		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-lg-9'] //button[@class='btn btn-info']")));
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='col-lg-9'] //button[@class='btn btn-info']"));

		for (int i = 0; i < items.size(); i++)

		{
			items.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
