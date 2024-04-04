package seleniumPractice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		
		// Invoking Browser
		
		/*
		 * to launch Chrome Browser need an Executable file
		 *   
		 * need to set path for selenium to see for Executable file in System 
		 * 
		 * Selenium look for key value 
		 * 			"webdriver.chrome.driver" key value
		 * 			"webdriver.gecko.driver"
		 * value of the path is exe file in System file path
		 * // while downloading exe file cross check with present chrome version 
		 * 
		 * 
		 */
		
//		 System.setProperty("webdriver.chrome.driver", "D:\\Rahul\\chromedriver.exe");
//		 System.setProperty("webdriver.gecko.driver",  "d:\\rahul\\geckodriver.exe");
//		 System.setProperty("webdriver.edge.drive",    "d:\\rahul\\msedgedriver.exe");
		  
		
		/*
		 *for 
		 * 		Chrome  - ChromeDriver (class)
		 *To import all the methods of chrome 
		 * 		ChromeDriver driver = new ChromeDriver();
		 *to import only selenium supported (methods support by all browsers) 	
		 *		WebDriver driver = new ChromeDriver();
		 */

//        WebDriver driver = new ChromeDriver();
//        WebDriver driver =new FirefoxDriver();
//		  WebDriver driver = new EdgeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
//		chromeOptions.addArguments("--remote-allow-origins=*");   // had an issue with webSockets in 4.8.1 JavaSelenium version

		WebDriver driver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();
		if (driver instanceof ChromeDriver chromeDriver ){
			chromeDriver.get("https://www.google.com");
			System.out.println(driver.getTitle());
		}
		driver.get("https://www.rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.close(); //closes current window
		//driver.quit();  //will close all tabs opened within automation
		
        }
	}
