package DemoAutomation.PabjeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {
	
WebDriver ldriver;
	
	
	public Wikipedia(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[text()='Release date']/parent::*/following-sibling::*/div/ul/li")
	WebElement releasedatewiki;
	
	@FindBy(xpath="//th[text()='Country']/following-sibling::td")
	WebElement countrywiki;
	
	public String getReleasedateText() {
		return releasedatewiki.getText();
	}
	
	public String  getCountryText() {
		return countrywiki.getText();
	}
	
}
