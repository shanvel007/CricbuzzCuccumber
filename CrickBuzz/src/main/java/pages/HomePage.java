package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;


public class HomePage extends BaseClass
{
	
	@FindBy(xpath = "//a[@title='Cricket Schedule']")
	WebElement schedule;
	
	@FindBy(id = "all-tab")
	WebElement allmatchs;
		
	@FindBy(xpath="//div[@id='teamDropDown']")
	WebElement Team;
	
	
	@FindBy(xpath="(//h2[@class='cb-col-75 cb-nws-lst-rt cb-col cb-col-text-container cb-lv-scr-mtch-hdr cb-team-item-text-outer'])[1]")
	WebElement NewZealandTeam;

	@FindBy(xpath= "//a[@class='cb-nav-tab' and @title='India Cricket Team Schedule']")
	WebElement MatchResults;
	
	@FindBy(xpath= "(//a[@class='cb-hm-mnu-itm'])[1]")
	WebElement livescorePage;
	
	
	@FindBy(xpath= "//a[@title='International' and @id='international-tab']")
	WebElement RecentPage;
	
	@FindBy(xpath= "(//a[@class='text-hvr-underline text-bold'])[1]")
	WebElement livematch;

	@FindBy(xpath= "//a[@class='cb-nav-tab '][1]")
	WebElement Scorecard;
	

	
	public HomePage()
	{
	PageFactory.initElements(driver, this);
	}


	public void clickSchedule()
	{
		schedule.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		allmatchs.click();
		
	}
	
	public void clickNewZealandResults()
	{
		Team.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		NewZealandTeam.click();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

		MatchResults.click();
		
		
	}
	
	
	public void clickLiveScore()
	{
		livescorePage.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		RecentPage.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		livematch.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		Scorecard.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	}

}
