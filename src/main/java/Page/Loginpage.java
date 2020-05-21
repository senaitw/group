package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {

	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		}
	@FindBy(how=How.ID,using="username")WebElement UserName;
	@FindBy(how=How.ID,using="password")WebElement Passward;
	@FindBy(how=How.NAME,using="login")WebElement Submit;
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Dashboard')] ")
	WebElement dashboard;
	
	public void login(String username, String passward) {
		UserName.sendKeys(username);
		Passward.sendKeys(passward);
		Submit.click();
		dashboard.isDisplayed();
	}

	public String getPageTitle() {
		return driver.getTitle();
		
	}
}
