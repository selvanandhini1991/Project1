package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import XeroAppResource.ReusableFunc;

public class Xero_ForgotPassword {
	public WebDriver driver;
	
	public Xero_ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}

	public void forgotpasswordrequest(String username) {
		WebElement unbox =driver.findElement(By.xpath("//input[@id='UserName']"));
		ReusableFunc R = new ReusableFunc(driver);
		R.Entervalue(unbox, username, "Email address for reset password");
		WebElement sendlink = driver.findElement(By.xpath("//a[@class='x-btn blue']/span"));
		R.Clickbtn(sendlink, "send link");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement cfnmsg = driver.findElement(By.xpath("//div[@class='x-boxed noBorder']//p[1]"));
		R.DisplayCheck(cfnmsg, "Reset password link confirmation message");
		
	}
}
