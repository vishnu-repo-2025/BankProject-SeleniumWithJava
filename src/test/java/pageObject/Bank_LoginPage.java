package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BasePage;

public class Bank_LoginPage extends BasePage{

	public Bank_LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//login Locators
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement txt_userId;
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement txt_password;
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement btn_submit;
	@FindBy(xpath="//marquee[normalize-space()=\"Welcome To Manager's Page of Guru99 Bank\"]")
	public WebElement txt_vaidation;
	//login Action methods
	public void txt_username(String uID) {
		txt_userId.sendKeys(uID);
	}
	public void txt_password(String pswrd) {
		txt_password.sendKeys(pswrd);
	}
	public void btn_login() {
		btn_submit.click();
	}
}	
