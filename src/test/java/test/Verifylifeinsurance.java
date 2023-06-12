package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browsersetup.Base;
import page.Homepage;
 import  utils.Utility;
 
public class Verifylifeinsurance extends  Base {
	private WebDriver driver;
	private Homepage homepage ;
	int TestID ;
	@BeforeTest
	public void lounchbrowser() {
		driver=Base.openchromebrowser();
	}
	
	@BeforeClass
	public void POMobject( ) {
		 homepage =new Homepage(driver);
	}
	@BeforeMethod
	public void gotopolicybazar() {
		driver.get("https://www.policybazaar.com");
	}
	@Test (priority=1)
	public void verifylifeinsurance() {
		 TestID =123;
		 homepage.gotolifeinsurance();
		 System.out.println(driver.getCurrentUrl());
		}
	@Test  (dependsOnMethods= {"verifylifeinsurance()"})
	public void senddeatail() {
		 TestID =124;
		 homepage.gotolifeinsurance();
		 
	}
	
	@AfterMethod
	public void failscrenshot(ITestResult result ) {
		if (ITestResult.FAILURE==result.getStatus()) {
			Utility.scrrenshot(driver, TestID);
		}
		}
	@AfterClass
	public void POMobjectclosed() {
		System.out.println("aaaaaaaaaaaaaaaaaaa");
	}
	@AfterTest
	public void closedriver() {
		driver.close();
	}
	
	
	

}
