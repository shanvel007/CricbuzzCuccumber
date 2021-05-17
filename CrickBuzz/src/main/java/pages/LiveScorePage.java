package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;


public class LiveScorePage extends BaseClass 
{
	
	@FindBy(xpath = "//h1[@class='cb-nav-hdr cb-font-18 line-ht24']")
	WebElement title;

	@FindBy(xpath = "//div[@class='cb-col cb-scrcrd-status cb-col-100 cb-text-live ng-scope']")
	WebElement result;
	
	@FindBy(xpath = "(//div[@class='cb-col cb-col-100 cb-scrd-hdr-rw'])")
	private List<WebElement> innings;
	
	@FindBy(xpath = "(//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray'])[1]/div")  
	private List<WebElement> batsmanheading;
	
	String Batinglist1="(//div[@id='innings_";
	String Batinglist2="']//div[@class='cb-col cb-col-100 cb-scrd-itms'])[";
	String Batinglist3="]/div";
				
	String inningsbatting1="//div[@id='innings_";
	String inningsbatting2="']//div[@class='cb-col cb-col-100 cb-scrd-itms']";

	@FindBy(xpath = "//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']")
	private List<WebElement> batsman;
		
	@FindBy(xpath = "(//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray'])[2]/div")  
	private List<WebElement> bowlerheading;

	String Bowlinglist1="(//div[@id='innings_";
	String Bowlinglist2="']//div[@class='cb-col cb-col-100 cb-scrd-itms '])[";
	String Bowlinglist3="]/div";
	
	@FindBy(xpath = "(//div[@class='cb-col cb-col-100 cb-scrd-itms '])[1]/div")
	private List<WebElement> bowlerscore;
	
	String inningsbowling1="//div[@id='innings_";
	String inningsbowling2="']//div[@class='cb-col cb-col-100 cb-scrd-itms ']";
	
	@FindBy(xpath = "//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms ']")
	private List<WebElement> bowlers;
	
	
	
	@FindBy(xpath = "//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray text-bold']")
	WebElement FallOfWickt;
	
	String fallofwicketinnings1="(//div[@class='cb-col cb-col-100 cb-col-rt cb-font-13'])[";
	String fallofwicketinnings2="]";

	
	@FindBy(xpath = "//div[@class='cb-col cb-col-100 cb-col-rt cb-font-13']")
	WebElement FallOfWicktResult;
	
	
	WebDriverWait wait = new WebDriverWait(driver, 30);

	
	public LiveScorePage() 
	{
		PageFactory.initElements(driver, this);
	}

	
	public void writeScore() throws Exception
	{
		src = new File("C:\\Users\\Sadik\\Desktop\\Projects\\Cricbuzz.xlsx");
		fis=  new FileInputStream(src); 
    	workbook = new XSSFWorkbook(fis);
    	sheet= workbook.getSheetAt(2);
    	
    	sheet.createRow(0);
    	sheet.getRow(0).createCell(0).setCellValue(title.getText());
    	
		String LiveDetail = result.getText();
		sheet.createRow(1).createCell(0).setCellValue(LiveDetail);
		
		int r=2;
		int y = 1;


    	for(int i = 1; i<innings.size(); i++)
//		for(int i = innings.size()-1; i>=0; i--)
    	{
 

    		String inningsdetail = innings.get(i-1).getText();
    		sheet.createRow(r);
    		sheet.getRow(r).createCell(0).setCellValue(inningsdetail);
    		
    		r+=2;
			int k;
			
    				
			sheet.createRow(r);

    		for(int j = 0; j<batsmanheading.size(); j++)
    		{
    			
					String batsmanheadingdetail = batsmanheading.get(j).getText();
        			sheet.getRow(r).createCell(j).setCellValue(batsmanheadingdetail);
    		}

    			
    		for(k = 1; k<=batsman.size(); k++)
    		{
    				
    			r++;
    				
    				sheet.createRow(r);

    				List<WebElement> BatList=driver.findElements(By.xpath(Batinglist1+i+Batinglist2+k+Batinglist3));

    				
    				for(int x=0;x<BatList.size();x++) {
					 				
    					String batsmanrundetails = BatList.get(x).getText();
        				sheet.getRow(r).createCell(x).setCellValue(batsmanrundetails);
        				System.out.println(batsmanrundetails);
    				}
    		}
    			

    			r++;
    			
    			String wkt=FallOfWickt.getText();
    			sheet.createRow(r);
    			sheet.getRow(r).createCell(0).setCellValue(wkt);
    			
    			int c=1;
    			WebElement FallOfWicktinnings = driver.findElement(By.xpath(fallofwicketinnings1+c+fallofwicketinnings2));

    			String wktresult=FallOfWicktinnings.getText();
    			
    			sheet.getRow(r).createCell(1).setCellValue(wktresult);
    			c=c+2;
    		
    			r+=2;
    			sheet.createRow(r);
    			

    		for(int j1 = 0; j1<bowlerheading.size(); j1++)
    		{
    			String bowlerheadingdetail = bowlerheading.get(j1).getText();
    			sheet.getRow(r).createCell(j1).setCellValue(bowlerheadingdetail);
    			
    		}
    		
    		
			int k1;

    		for(k1 = 1; k1<=bowlers.size(); k1++)
    		{
    			r++;
    			sheet.createRow(r);
    			
    				List<WebElement> BowList=driver.findElements(By.xpath(Bowlinglist1+i+Bowlinglist2+k1+Bowlinglist3));
    				
    				    				
    				for(int x1=0;x1<BowList.size();x1++) {
       					
        				String bowlerrundetails = BowList.get(x1).getText();
        				sheet.getRow(r).createCell(x1).setCellValue(bowlerrundetails);
        				
        				}
    				
    		}
    		
    		r+=2;
    		y=y+2;
    		
    	}
    	
    	
    	fos=new FileOutputStream(src); 
		workbook.write(fos); 
		workbook.close();
    	
	}

}
