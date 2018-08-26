package PageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
	By Loginbtn = By.xpath("//button[@id='submitButton']");
	By Errormsg = By.xpath("//div[@class='x-boxed warning']//p");
	
	
	public WebElement Errormsg() {
		return driver.findElement(Errormsg);
	}
	public WebElement username(){
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement Loginbtn() {
		return driver.findElement(Loginbtn);
	}

}
