package DemoAutomation.PabjeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdb {
	
WebDriver ldriver;
	
	
	public Imdb(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//tbody/tr[6]/td[1]/a/parent::*/following-sibling::td[1]")
	WebElement releasedateimdb;
	
	@FindBy(xpath="//span[text()='Country of origin']/following-sibling::div/ul/li/a")
	WebElement countryimdb;
	
	@FindBy(xpath="//section/div/div[1]/section[9]/div[2]/ul/li[1]/a[2]")
	WebElement seemore;
	
	
	public String getReleasedateimdbText() {
		return releasedateimdb.getText();
	}
	
	public String getCountryimdbText() {
		return countryimdb.getText();
	}
	
	public void clickseemore(){
		seemore.click();
	}
	

}
