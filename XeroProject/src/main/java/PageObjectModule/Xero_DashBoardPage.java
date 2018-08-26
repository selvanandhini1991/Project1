package PageObjectModule;

import org.openqa.selenium.WebDriver;

import PageObjectRepositories.DashBoardPage;

import XeroAppResource.ReusableFunc;

public class Xero_DashBoardPage {
	public WebDriver driver;
	public Xero_DashBoardPage(WebDriver driver) {
		this.driver=driver;
	}
	public void LogOut() {
		DashBoardPage db = new DashBoardPage(driver);
		ReusableFunc R = new ReusableFunc(driver);
		R.ClickElement(db.userName(), "User Name");
		R.ClickElement(db.Logoutbtn(), "Log out Button");
	}
	

}
