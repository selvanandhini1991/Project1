package PageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
	public WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userName = By.xpath("//a[@class='username']");
	By Logoutbtn = By.xpath("//a[contains(text(),'Logout')]");
	
	
	public WebElement Logoutbtn() {
		return driver.findElement(Logoutbtn);
	}
	public WebElement userName() {
		return driver.findElement(userName);
	}

	
}
