package XeroAppResource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Base {
	public WebDriver driver;

	public WebDriver launchBrowser() throws IOException {
		Properties pro = new Properties();
		try 
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\pkp\\Documents\\GitHub\\Project1\\XeroProject\\src\\main\\java\\XeroAppResource\\data.properties");
			pro.load(fis);
			String browserName = pro.getProperty("browser");
			String url = pro.getProperty("url");
			if(browserName.equals("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","C:\\download softwares\\Browser\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(browserName.equals("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver","C:\\download softwares\\Browser\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName=="IE")
			{
				
			}
			driver.get(url);
			driver.manage().window().maximize();
			/*Implicit wait sync for the driver*/
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		return driver;
	}
	
	public static int RandomNumber() {
		int random = (int )(Math.random() * 50 + 1);
		return random;
	}

	public static void PageLoad(WebDriver driver,WebElement element) {
		WebDriverWait pageload = new WebDriverWait(driver,30);
		pageload.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	public static void Wait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
