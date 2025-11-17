package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/TestReport.html");
		reporter.config().setReportName("Automation test report");
		reporter.config().setDocumentTitle("Test EXecution Report");
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester","Atul Shristava");
		report.setSystemInfo("Enviroment","QA");
		report.setSystemInfo("Browser","Chrome");
		
		ExtentTest test=report.createTest("Login test","Verify Login functionality");
		test.log(Status.PASS,"Regustration link Clicked");
		test.log(Status.PASS,"UserName entered");
		
		ExtentTest test1=report.createTest("Registration Test","Verify registration functionality");
		test1.log(Status.FAIL,"Failed Steps");
		
		ExtentTest test2=report.createTest("Payment test","Verify payment Functionality");
		
		ExtentTest loginTest=test2.createNode("Login");
		loginTest.log(Status.PASS,"Enter Username");
		loginTest.log(Status.PASS,"Enter Password");
		loginTest.log(Status.PASS,"Click Submit");
		
		ExtentTest cartTest=test2.createNode("Slect product and navigate to cart");
		cartTest.log(Status.PASS,"Select Product");
		cartTest.log(Status.PASS,"Click on Add to cart Button");
		
		ExtentTest paymantTest=test2.createNode("Make Payment");
		cartTest.log(Status.PASS,"Verify product in cart");
		cartTest.log(Status.PASS,"Enter creditCard info and make paymant");
		report.flush();
		
		
		

	}

}
