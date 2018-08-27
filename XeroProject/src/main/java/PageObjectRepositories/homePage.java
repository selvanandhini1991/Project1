package PageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	public WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginlink = By.xpath("//li[@class='global-ceiling-bar-cta1']/a");
	By Freetrail = By.xpath("//li[@class='global-ceiling-bar-cta2']/a");
	
	
	public WebElement Freetrail() {
		return driver.findElement(Freetrail);
	}
	public WebElement loginlink() {
		return driver.findElement(loginlink);
	}

}
