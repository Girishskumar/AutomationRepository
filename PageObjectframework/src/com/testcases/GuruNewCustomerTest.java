package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.objectrepository.Guru99NewCustomer;

public class GuruNewCustomerTest extends TestBase{
	
	@Test
	public void Guru99NewCustomerAction() throws InterruptedException
	{
		Guru99NewCustomer gncpage=PageFactory.initElements(driver, Guru99NewCustomer.class);
		gncpage.newcustomerLinkClick();
		gncpage.enteringCustomerName("pavpavpavpavpav");
		gncpage.enteringGender();
		gncpage.enterDateOfBirth("2011-02-01");
		Thread.sleep(2000);
		gncpage.enterAddress("1234 york street");
		gncpage.enterCity("Bangalore");
		gncpage.enterState("karnataka");
		gncpage.enterPin("567890");
		gncpage.enterMobileNumber("90557890557890");
		gncpage.enteremail("121@yahoo.com");
		gncpage.enterpassword("YjAsUbY");
		Thread.sleep(2000);
		gncpage.clickOnSubmitButton();
	
	
	}

}
