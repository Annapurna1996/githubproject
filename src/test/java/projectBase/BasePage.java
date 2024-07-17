package projectBase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	public static WebDriver driver;
	public static WebDriverWait Wait;
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public Actions action;
	 public void setup() {
		 file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\ProjectConfig.properties");
		try {
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		action = new Actions(driver);
		
		 
	 }
	 
	public void quit() throws Exception {
		fis.close();
	}

	

}
