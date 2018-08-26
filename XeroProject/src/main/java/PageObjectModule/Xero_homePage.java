package PageObjectModule;

import org.openqa.selenium.WebDriver;

import PageObjectRepositories.homePage;
import XeroAppResource.ReusableFunc;

public class Xero_homePage {
	public WebDriver driver;
	public Xero_homePage(WebDriver driver) {
		this.driver=driver;
	}
	public void NavigatetoLogin() {
		homePage hp = new homePage(driver);
		ReusableFunc R = new ReusableFunc(driver);
		R.Clickbtn(hp.loginlink(), "LoginLink");				
	}

}
