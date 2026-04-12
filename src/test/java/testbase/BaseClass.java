package testbase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public Properties pro;
	public WebDriver driver;
	public String pswrd;
	public String userID;

@Parameters({"browser"})
@BeforeClass
	public void setup(String br) throws IOException {
	//Loading properties file
		pro = new Properties();
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		pro.load(file);
	//Choosing browser
		switch(br.toLowerCase()){
		case "chrome" : driver = new ChromeDriver();break;
		case "edge" : driver = new EdgeDriver();break;
		case "firefox" : driver = new FirefoxDriver();break;
		default : System.out.println("Invalid browser selection..."); return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		
		userID = pro.getProperty("userId");
		pswrd = pro.getProperty("password");
	}
	public String randaomPhnNumber() {
		Random intrndm = new Random();
		int x = intrndm.nextInt(10);
		String s = String.valueOf(x);
		return s;
	}

}
