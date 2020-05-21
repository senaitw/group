package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewTransactionPage {

	WebDriver driver;
	
	public ViewTransactionPage(WebDriver driver) {
		this.driver = driver;
	}

	public List<String> getColumnDataFor(String columnHeader) {
		
		List<String> columnData = new ArrayList<String>();
		
		int idex= getColumnHeaderIndexfor(columnHeader);
		
		
		
		return columnData;
	}

	private int getColumnHeaderIndexfor(String columnHeader) {
		String xpath = "//table[@class='table table-bordered sys_table']//descendant::th";
		List<WebElement>columHeaderElements = driver.findElements(By.xpath(xpath));
		return 0;
	}

	
		
		
	
	
	
	
}
