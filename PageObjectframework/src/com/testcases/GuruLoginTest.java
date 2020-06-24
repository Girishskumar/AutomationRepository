package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.Guru99Homepage;
import com.objectrepository.Guru99LoginPage;
import com.objectrepository.Guru99NewCustomer;

public class GuruLoginTest extends TestBase{
	@Test
	public void guruLoginAction() throws InterruptedException
	{
	Guru99LoginPage glpage	=PageFactory.initElements(driver, Guru99LoginPage.class);
	Guru99Homepage ghpage=PageFactory.initElements(driver,Guru99Homepage.class );
	//Guru99NewCustomer gncpage=PageFactory.initElements(driver,Guru99NewCustomer.class);
	String userid= glpage.enterUsername("mngr266964");
	glpage.enterPassword("YjAsUbY");
	glpage.loginButton();
	String mgrtext=ghpage.verifyHomepage();
	
	Assert.assertEquals(mgrtext,userid ,"verified the Manager id");
	Thread.sleep(2000);
	
	

	
	
	

	}

}
