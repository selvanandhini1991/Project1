package XeroAppTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModule.Xero_DashBoardPage;
import PageObjectModule.Xero_LoginPage;
import PageObjectModule.Xero_homePage;
import XeroAppResource.Base;

public class TCDriver extends Base{
	public WebDriver driver;
	public SoftAssert sAssert = new SoftAssert();
	
	@BeforeClass
	public void OpenApp() {
		try {
			driver=launchBrowser();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		String title = driver.getTitle();
		System.out.println("Browser is launched and navigated to "+ title);
		
	
	}
	@Test(priority=1)
	public void Navigate_to_XERO() throws IOException {
		Xero_homePage xhp = new Xero_homePage(driver);
		xhp.NavigatetoLogin();
		Wait();
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\pkp\\eclipse-workspace\\XeroProject\\src\\main\\java\\XeroAppResource\\data.properties");
		pro.load(fis);
		String un = pro.getProperty("un");
		String pass = pro.getProperty("pwd");
		Xero_LoginPage xlp = new Xero_LoginPage(driver);
		Wait();Wait();
		xlp.Login(un, pass);
		Wait();
		sAssert.assertEquals(driver.getTitle(), "Xero | Dashboard | Demo Company (US) ");
		System.out.println("TC01 Pass");	
		Xero_DashBoardPage xdb = new Xero_DashBoardPage(driver);
		xdb.LogOut();
		Wait();
	}
	
	@Test(priority=2)
	public void Incorrect_Password() {
		
		Xero_LoginPage xlp = new Xero_LoginPage(driver);
		xlp.Login("selvanandhini.s@gmail", "password");
		Wait();
		String Expected = "Your email or password is incorrect ";
		xlp.IncorrectCredential(Expected);
		System.out.println("TC02 Pass");
	}
	
	@Test(priority=3)
	public void Incorrect_Email() {
		Xero_LoginPage xlp = new Xero_LoginPage(driver);
		xlp.Login("selvanandh.s@gmail", "password");
		Wait();
		String Expected = "Your email or password is incorrect ";
		xlp.IncorrectCredential(Expected);
		System.out.println("TC02 Pass");
	}
	
	@AfterClass
	public void teardown() {
		
		driver.close();
	}
	
}
