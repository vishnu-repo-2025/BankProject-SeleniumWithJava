package utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter report;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		System.out.println("Test started..");
		
		//creating file and using path
		File path = new File(System.getProperty("user.dir")+"/reports/mytestreport.html");
		report = new ExtentSparkReporter(path);
		
		report.config().setDocumentTitle("Automation report");
		report.config().setReportName("Functional testing");
		report.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(report);//attatch path to extent report, then only flush() works.
	    
		extent.setSystemInfo("Tester", "Mahalakshmi");
		extent.setSystemInfo("Tester2", "Vishnu");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("IDE", "Eclipse");
	}
	public void onTestStart(ITestResult result) {

	}
	public void onTestSuccess(ITestResult result) {
		    // not implemented
	}
	public void onTestFailure(ITestResult result) {
	    // not implemented
	}
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	}
	public void onFinish(ITestContext context) {
		extent.flush();
		System.out.println("Test finished..");
	}	

}

