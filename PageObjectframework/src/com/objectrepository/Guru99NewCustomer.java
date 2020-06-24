package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Guru99NewCustomer {
	
	 WebDriver driver;
	public Guru99NewCustomer(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	// using findby for locating elements
	
	@FindBy(how=How.XPATH, using="//a[(text()='New Customer')]")
	WebElement newcust;
	
	@FindBy(how=How.XPATH, using="//input[contains(@name,'name')]")
	WebElement addnewcustomertitle;
	
	@FindBy(how=How.XPATH, using="//input[contains(@name,'name')]")
	WebElement customerName;
	
	@FindBy(how=How.XPATH, using="//input[contains(@value,'f')]")
	WebElement genderFemale;
	
	@FindBy(how=How.XPATH, using ="//input[contains(@id,'dob')]")
	WebElement datofBirth;
	
	@FindBy(how=How.XPATH, using ="//textarea[contains(@name,'addr')]")
	WebElement address;
	
	@FindBy(how=How.XPATH, using ="//input[contains(@name,'city')]")
	WebElement city;
	
	@FindBy(how=How.XPATH, using ="//input[contains(@name,'state')]")
	WebElement state;
	
	@FindBy(how=How.XPATH, using ="//input[contains(@name,'pinno')]")
	WebElement pin;
	
	@FindBy(how=How.XPATH, using ="//input[contains(@name,'telephoneno')]")
	WebElement mobilenumber;
	
	@FindBy(how=How.XPATH, using ="//input[contains(@name,'emailid')]")
	WebElement email;
	
	@FindBy(how=How.XPATH, using ="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//input[contains(@name,'sub')]")
	WebElement submit;
	
	
	// action methods
	// clicking on the link
	public void newcustomerLinkClick() {
		newcust.click();
	}
	
	//verify the page title
	public String verifyaddNewCustomerTitlePage()
	{
		String pageTitleForNewCustomer=addnewcustomertitle.getText();
		return pageTitleForNewCustomer;
	}

	// entering name
	public void enteringCustomerName(String cname)
	{
		customerName.sendKeys(cname);
		
	}
	// entering gender
	public void enteringGender()
	{
		genderFemale.click();
	}
	
	public void enterDateOfBirth(String dob)
	{
		datofBirth.sendKeys(dob);
		
	}
	
	// entering address
	public void enterAddress(String addr)
	{
		address.sendKeys(addr);
		
	}

	// city
		public void enterCity(String cityname)
		{
			city.sendKeys(cityname);
		}
	
		// enter state
				public void enterState(String statename)
				{
					state.sendKeys(statename);
				}
				
		// enter pin
				public void enterPin(String pinno)
				{
					pin.sendKeys(pinno);
				}	
				
		// enter Mobile Number
				public void enterMobileNumber(String mobno)
				{
					mobilenumber.sendKeys(mobno);
				}	
				
				// enter E-mail
				public void enteremail(String em)
				{
					email.sendKeys(em);
				}
		// enter pwd
				public void enterpassword(String pwd)
				{
					password.sendKeys(pwd);
				}		
		
		// Submit
		public void clickOnSubmitButton()
		{
			submit.click();
		}
		
}
