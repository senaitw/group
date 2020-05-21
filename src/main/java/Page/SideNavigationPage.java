package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class SideNavigationPage {

	 WebDriver driver;
	 
	 public SideNavigationPage(WebDriver driver) {
		 this.driver = driver;
		 }
	 @FindBy(how=How.LINK_TEXT, using ="Bank & Cash")WebElement Bank;
	 @FindBy(how=How.LINK_TEXT, using ="New Account")WebElement newAccount;
	 @FindBy(how=How.XPATH,using = "//h2[contains(text(),'Accounts ')]")WebElement
	 accountVisblity;
	 @FindBy(how=How.LINK_TEXT,using="Transactions")WebElement Transactions;
	 @FindBy(how=How.LINK_TEXT,using="View Transactions")WebElement VewTransactions;
	// @FindBy(how=How.XPATH,using="//div[@class='col-lg-12']")WebElement Valdation;
	 
	 public void sideNavigation() throws InterruptedException {
		 Bank.click();
		 Thread.sleep(3000);
		 newAccount.click();
	 }
	 public void accountValidation() {
		 accountVisblity.isDisplayed();
	 }
	 public void clickonTransaction() {
		 Transactions.click();
		 VewTransactions.click();
	 }
	 public void validateTransaction() {
		 String title = driver.findElement(By.xpath("//div[@class='col-lg-12']")).getText();
		 Assert.assertEquals(title, "Transactions", "negative");
	 }
}
