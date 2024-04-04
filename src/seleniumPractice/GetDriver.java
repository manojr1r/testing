package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;




public class GetDriver {
    public enum drivername  {CHROME, EDGE, FIREFOX}
    public static WebDriver driver(drivername name){
        switch (name){
            case CHROME ->{
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                return WebDriverManager.chromedriver().capabilities(chromeOptions).create();
            }
            case EDGE -> {
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                return WebDriverManager.edgedriver().capabilities(edgeOptions).create();
            }
            case FIREFOX -> {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                return WebDriverManager.firefoxdriver().capabilities(firefoxOptions).create();
            }
            default -> { return null;
            }
        }
    }
}
