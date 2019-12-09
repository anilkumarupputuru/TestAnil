package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForGotPOM {
private WebDriver driver; 
	
	public ForGotPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="I lost my password")
	private WebElement Lostpwd; 
	
	@FindBy(id="lost_password_user")
	private WebElement userName;
	
	@FindBy(id="lost_password_submit")
	private WebElement loginBtn; 
	
	
	public void Lostpwdclick() {
		this.Lostpwd.click(); 
	}
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}

