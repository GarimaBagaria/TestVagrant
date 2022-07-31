package DemoAutomation.Test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DemoAutomation.PabjeObject.Imdb;
import DemoAutomation.PabjeObject.Wikipedia;


public class Moviedetails extends BaseClassDemo{

	//public static WebDriver driver;

	@Test(priority = -1)
	public void MovieDetailstest() {
		
		Wikipedia wk = new Wikipedia(driver);
		Imdb ib = new Imdb(driver);
		
		//Wikipedia Pushpa Movie Search
		driver.get("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise");
		driver.manage().window().maximize();
		
		String wikireleasedate = wk.getReleasedateText();
		String wikicountry = wk.getCountryText();
		
		
		//IMDB Pushpa Movie Search
		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		driver.manage().window().maximize();
		
		String imdbcountry = ib.getCountryimdbText();
		ib.clickseemore();
		String imdbreleasedate = ib.getReleasedateimdbText();
		
		//Assertion of Wikipedia and IMDB's Releasedate and Country details
		Assert.assertEquals(wikireleasedate, imdbreleasedate);
		Assert.assertEquals(wikicountry, imdbcountry);
		
	}

	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
