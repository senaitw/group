package test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddNewAccountPage;
import Page.Loginpage;
import Page.SideNavigationPage;
import Page.ViewTransactionPage;
import util.BroweserFactory;

public class LoginTest {
  
	WebDriver driver;
	@Test
	public void validUserShouldabletologin() throws InterruptedException {
		driver = BroweserFactory.startBroweser();
	
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.getPageTitle();
		login.login("techfiosdemo@gmail.com", "abc123");
		SideNavigationPage sideNav = PageFactory.initElements(driver, SideNavigationPage.class);
		sideNav.sideNavigation();
		sideNav.accountValidation();
		AddNewAccountPage newaccount= PageFactory.initElements(driver, AddNewAccountPage.class);
		newaccount.createNewAccount();
		Thread.sleep(2000);
		sideNav.clickonTransaction();
		Thread.sleep(3000);
		sideNav.validateTransaction();
		
		ViewTransactionPage viewTran= PageFactory.initElements(driver, ViewTransactionPage.class);
		List<String> columnData = viewTran.getColumnDataFor("Account");
		
		
	//driver.close();
	//driver.quit();
		
	}
	
}
