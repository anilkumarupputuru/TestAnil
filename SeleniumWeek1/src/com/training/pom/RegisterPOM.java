package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	private WebDriver driver; 
	public RegisterPOM() {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText ="Sign up!")
	private WebElement Signup; 
	@FindBy(id="registration_firstname")
	private WebElement FirstName; 
	@FindBy(id ="registration_lastname")
	private WebElement LastName; 
	@FindBy(id ="registration_email")
	private WebElement Email; 
	@FindBy(id ="username")
	private WebElement userName;
	@FindBy(id ="pass1")
	private WebElement password1;
	@FindBy(id="pass2")
	private WebElement password2;
	
	@FindBy(id="registration_submit")
	private WebElement Registerbtn; 
	
	public void sendFirstName(String FirstName) {
		this.FirstName.clear();
		this.FirstName.sendKeys("Anil");
	}
	public void sendLastName(String LastName) {
		this.LastName.clear();
		this.LastName.sendKeys("Kumar");
	}
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys("anil@abc.com");
	}
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys("Anil123");
	}
		public void sendpassword1(String password1) {
			this.password1.clear(); 
			this.password1.sendKeys("Anil@123"); 
		}
		public void sendpassword2(String password2) {
			this.password2.clear(); 
			this.password2.sendKeys("Anil@123"); 
		}
	
	public void clickRegisterbtn() {
		this.Registerbtn.click(); 
	}


}
