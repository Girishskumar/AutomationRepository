package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Guru99Homepage {
	
	WebDriver driver;
	
	public Guru99Homepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	// using findby for locating elements
	@FindBy(how=How.XPATH, using="//td[(text()='Manger Id : mngr266964')]")
	WebElement mgrid;
	
	// action methods
	public String verifyHomepage()
	{
		String mgrTxt =mgrid.getText();// we will get -> Manger Id : mngr266964
		String expectedmgrTxt=mgrTxt.substring(12, 22);
		return expectedmgrTxt;
	}
	

}
