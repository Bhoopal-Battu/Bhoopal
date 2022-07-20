package Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
     public static WebDriver driver;
     public static WebDriverWait wait;
     public static void OpenBrowser() {
    	try {
    		WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             wait = new WebDriverWait(driver,Duration.ofSeconds(50));
    	}
    	catch(Exception e) {
    		e.printStackTrace();
        }
     }
     public static void OpenURL(String web_url) {
    	 try {
    		 driver.get(web_url);
    		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("q")));
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
     public static String GetTitle() {
    	 String abcd=driver.getTitle();
    	 return abcd;
     }
     public static void BrowserClose() {
    	 driver.quit();
     }
}
