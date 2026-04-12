package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import testbase.BasePage;

public class New_CustomerPage extends BasePage{
	
	public New_CustomerPage(WebDriver driver){
		super(driver);
	}

	//new customer locators
	@FindBy(xpath="//a[@href=\"addcustomerpage.php\"]")
	WebElement new_customer;
	@FindBy(xpath="//p[normalize-space()=\"Add New Customer\"]") 
	WebElement txt_validation;
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement txt_cname;
	@FindBy(xpath="//input[@name = \"rad1\"][2]")
	WebElement btn_female;
	@FindBy(xpath="//input[@name = \"dob\"]")
	WebElement date_dob;
	@FindBy(xpath="//textarea[@name=\"addr\"]")
	WebElement txt_addr;
	@FindBy(xpath="//input[@name=\"city\"]")
	WebElement txt_city;
	@FindBy(xpath="//input[@name=\"state\"]")
	WebElement txt_state;
	@FindBy(xpath="//input[@name=\"pinno\"]")
	WebElement txt_pinno;
	@FindBy(xpath="//input[@name=\"telephoneno\"]")
	WebElement txt_telphno;
	@FindBy(xpath="//input[@name=\"emailid\"]")
	WebElement txt_emailid;
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement txt_passwrd2;
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement btn_submit2;
	//after submission
	@FindBy(xpath="//table[@id=\"customer\"]/tbody/tr[4]/td[2]")
	WebElement customer_id;
	//new customer Action methods
	public void new_customer() {
		new_customer.click();
	}
	public void txt_validation2() {
		Assert.assertEquals(txt_validation.getText(),"Add New Customer");
	}
	public void btn_female() {
		Assert.assertFalse(btn_female.isSelected());
		btn_female.click();
	}
	public void txt_cname(String name) {
		txt_cname.sendKeys(name);
	}
	public void dateOfBirth(String dd, String mm, String yyyy) {
		date_dob.sendKeys(dd,mm,yyyy);
	}
	public void txt_addr(String addr){
		txt_addr.sendKeys(addr);
	}
	public void txt_city(String city){
		txt_city.sendKeys(city);
	}
	public void txt_state(String state){
		txt_state.sendKeys(state);
	}
	public void txt_pinno(String pinno){
		txt_pinno.sendKeys(pinno);
	}
	public void txt_telphno(String phno){
		txt_telphno.sendKeys(phno);
	}
	public void txt_emailid(){
		//String randomEmail= RandomStringUtils.randomAlphanumeric(5);
		txt_emailid.sendKeys("vovi"+"@gmail.com");
	}
	public void txt_passwrd2(String passwrd2) {
		txt_passwrd2.sendKeys(passwrd2);
	}
	public void btn_submit2(){
		btn_submit2.click();
	}
	//after submission
	public String customer_id(){
		return customer_id.getText();
	}
}
