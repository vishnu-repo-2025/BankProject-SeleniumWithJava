package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BasePage;

public class New_AccountCreationPage extends BasePage {
	New_AccountCreationPage(WebDriver driver){
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="")
	WebElement ele;

}
