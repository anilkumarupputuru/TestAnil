package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Registration {

	private WebDriver driver;
	private String baseUrl;
	private RegisterPOM registration;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		registration = new RegisterPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	}

	@Test
	public void registrationTest() {
		registration.clicksignupbtn();
		registration.sendFirstName("Anil");
		registration.sendLastName("Kumar");
		registration.sendEmail("anil@abc.com");
		registration.sendUserName("Anil123");
		registration.sendpassword1("Anil@123");
		registration.sendpassword2("Anil@123");
		registration.clickRegisterbtn();
		
		screenShot.captureScreenShot("First");
	}


}
