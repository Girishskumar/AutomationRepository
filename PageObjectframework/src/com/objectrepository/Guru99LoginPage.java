package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Guru99LoginPage {

WebDriver driver;
 public  Guru99LoginPage(WebDriver driver)
  {
	 this.driver = driver;
   }
		 
 // using findby for locating elements
		 @FindBy(how=How.NAME,using="uid")
		 WebElement UserId;
		 
		 @FindBy(how=How.NAME, using="password")
		 WebElement password;
		 
		 @FindBy(how=How.NAME, using ="btnLogin")
		 WebElement loginbutton;

		 // action methods
		 public String enterUsername(String uid)
		 {
			 UserId.sendKeys(uid);
			 return uid;
		 }
 
		 public void enterPassword(String pwd)
		 {
			 password.sendKeys(pwd);
		 }
		 
		 public void loginButton()
		 {
			 loginbutton.click();
		 }
		 
}
