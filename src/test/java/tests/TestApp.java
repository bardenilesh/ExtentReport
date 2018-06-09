package tests;

import listeners.MyListener;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import pages.MercuryToursLoginPage;
import pages.MercuryToursRegisterPage;

public class TestApp extends MyListener {
 MercuryToursLoginPage mlp;
 MercuryToursRegisterPage mrp;
 	@BeforeTest
 	@Parameters("browserName")
	public void beforeTest(String browserName) {
		try {
			mlp = PageFactory.initElements(driver, MercuryToursLoginPage.class);
			mrp = PageFactory.initElements(driver,
					MercuryToursRegisterPage.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 @AfterTest
 public void afterTest() {
  System.out.println("in after test");
  mlp = null;
  mrp = null;
 }
 
 @Test
 public void testMercuryTours() {
  try {
	System.out.println("in test method");
	  mlp.loadWebPage("http://newtours.demoaut.com");
	  mlp.clickRegister();
	  mrp.clickUserInfo();
	  mrp.clickSignOff();
	  String title = mlp.clickLogin();
	  Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
	  test.log(LogStatus.INFO, "the test tours is passed");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 }
}
