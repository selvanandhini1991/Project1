package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import PageObjectRepositories.LoginPage;
import XeroAppResource.ReusableFunc;

public class Xero_LoginPage {
	public WebDriver driver;
	public SoftAssert sAssert = new SoftAssert();
	
	public Xero_LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Login(String username,String password) {
		LoginPage lp = new LoginPage(driver);
		ReusableFunc R = new ReusableFunc(driver);
		R.Entervalue(lp.username(), username, "User Name");
		R.Entervalue(lp.password(), password, "password");
		R.Clickbtn(lp.Loginbtn(), "Login");
		
	}
	
	public void IncorrectCredential(String Expected) {
		LoginPage lp = new LoginPage(driver);
		ReusableFunc R = new ReusableFunc(driver);
		R.ErrorMsg(lp.Errormsg());
		sAssert.assertEquals(lp.Errormsg().getText(), Expected);
	}
	

}
