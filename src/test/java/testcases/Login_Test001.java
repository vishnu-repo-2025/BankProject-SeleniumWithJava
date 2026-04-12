package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Bank_LoginPage;
import testbase.BaseClass;

public class Login_Test001 extends BaseClass{
 @Test
  public void Login_Test() {
	 try {
	Bank_LoginPage bl = new Bank_LoginPage(driver);
	bl.txt_username(userID);
	bl.txt_password(pswrd);
	bl.btn_login();
	Assert.assertEquals(bl.txt_vaidation.getText(), "Welcome To Manager's Page of Guru99 Bank");
	System.out.println("Login completed successfully...");
	 }
	 catch(Exception e) {
		 Assert.fail();
		 System.out.println(e.getMessage());
	 }
	 finally {
	driver.close();
	 }
  }
}
