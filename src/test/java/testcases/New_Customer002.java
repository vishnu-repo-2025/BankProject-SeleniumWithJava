package testcases;

import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Bank_LoginPage;
import pageObject.New_CustomerPage;
import testbase.BaseClass;

public class New_Customer002 extends BaseClass {
  @Test
  public void New_Customer() throws IOException {
	  //login into website
	  Bank_LoginPage bl = new Bank_LoginPage(driver);
	  bl.txt_username(userID);
	  bl.txt_password(pswrd);
	  bl.btn_login();
	//New customer creation
	  New_CustomerPage nc = new New_CustomerPage(driver);
	  nc.new_customer();
	  nc.txt_validation2();
	  nc.btn_female();
	  nc.txt_cname("Vinuk");
	  nc.dateOfBirth("12", "12", "2025");
	  nc.txt_addr("11 abc colony india");
	  nc.txt_city("knll");
	  nc.txt_state("Hyderbad");
	  nc.txt_pinno("510009");
	  nc.txt_telphno(randaomPhnNumber());
	  nc.txt_emailid();
	  nc.txt_passwrd2("abc@2025");
	  nc.btn_submit2();
	  Assert.assertTrue(driver.getPageSource().contains("Customer Registered Successfully!!!"));
	  System.out.println("New customer ID created successfully: "+nc.customer_id());
	  pro.setProperty("CustomerId", nc.customer_id());
	  FileOutputStream file = new FileOutputStream(".\\src\\test\\resources\\config.properties");
	  pro.store(file, "Updating Customer ID in config.propertyies file.");
	  driver.close();
  }
}
