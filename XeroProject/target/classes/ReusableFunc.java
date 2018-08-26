package XeroAppResource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableFunc {
	public WebDriver driver;
	public ReusableFunc(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Clickbtn(WebElement E,String BtnName) {
		if(E.isDisplayed()) 
		{
			E.click();
			System.out.println("Pass: "+ BtnName + " is displayed and clicked successfully");
		}else
		{
			System.out.println("Fail: "+ BtnName + " is not displayed in the page");
		}		
	}
	
	public void ClickElement(WebElement E,String ElementName) {
		if(E.isDisplayed()) 
		{
			E.click();
			System.out.println("Pass: "+ ElementName + " is displayed and clicked successfully");
		}else
		{
			System.out.println("Fail: "+ ElementName + " is not displayed in the page");
		}		
	}
	public void ErrorMsg(WebElement E) {
		if(E.isDisplayed())
		{
			System.out.println("Pass: Error Message is displayed");
		}else
		{
			System.out.println("Fail: Error Message is not displayed");
		}
	}
	public void Entervalue(WebElement E,String evalue,String textboxname) {
		if(E.isDisplayed())
		{
			E.clear();
			E.sendKeys(evalue);
			System.out.println("Pass: "+ textboxname + " is displayed and "+ evalue + " is entered");
		}else
		{
			System.out.println("Fail: "+ textboxname+ " is not displayed in the page");
		}
	}

}
