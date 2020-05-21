package Page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountPage {

	WebDriver driver;
	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;
			}
	@FindBy(how=How.ID, using= "account")WebElement Account;
	@FindBy(how=How.ID, using="description")WebElement Descrption;
	@FindBy(how=How.ID, using="balance")WebElement Balance;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary']")
	WebElement Submit;
	
	public void createNewAccount() throws InterruptedException {
		Random rnd = new Random();
		int random =rnd.nextInt(999);
		Thread.sleep(3000);
		Account.sendKeys("myown" + random);
		Descrption.sendKeys("payontime" + random);
		Balance.sendKeys("15");
		Thread.sleep(2000);
		Submit.click();
		
	}
}
