package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;



public class SchedulePage extends BaseClass
{
	
	String FirstXpathDate = "(//div[@class='cb-lv-grn-strip text-bold'])[";
	
	String FirstXpathDate1 = "/following-sibling::div";
	
	String LastXpath = "]";
	
	@FindBy(xpath = "//h1[@class='cb-nav-hdr cb-font-18 line-ht24']")
	List<WebElement> MatchList;
	
	
	
public SchedulePage() 
	{
	 
		PageFactory.initElements(driver, this);
	}



	public void writedata() throws Exception 
	{
		
		
		File file = new File("C:\\Users\\Sadik\\Desktop\\Projects\\Cricbuzz.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		sh.createRow(0);
		sh.getRow(0).createCell(0).setCellValue("ALL MATCH DETAILS");

	   	XSSFCellStyle style = wb.createCellStyle();
		XSSFFont font = wb.createFont();
		font.setBold(true);
		style.setFont(font); 
		style.setWrapText(true);
		style.setShrinkToFit(true);
			
		scrollSmooth();
		
		List<WebElement> totalRows = driver.findElements(By.xpath("//div[@class='cb-lv-grn-strip text-bold']/ancestor::div[@class='cb-col-100 cb-col']"));
		
		
		int c = 1;

		
		for(int row=1; row <= totalRows.size(); row++){

			
			sh.createRow(c);

			WebElement date = driver.findElement(By.xpath(FirstXpathDate+row+LastXpath));
			
				
			if(date.getText().contains("SAT")) {
				System.out.print("Do nothing ");
			}
			else {  
			
			String Date = date.getText();

			sh.getRow(c).createCell(0).setCellValue(Date);


			List<WebElement> ind = driver.findElements(By.xpath(FirstXpathDate+row+LastXpath+FirstXpathDate1+"/a"));
			List<WebElement> ind1 = driver.findElements(By.xpath(FirstXpathDate+row+LastXpath+FirstXpathDate1+"/div"));
			
			for(int d=0; d<ind.size();d++) {
				
			sh.createRow(c+1);

			
			String Match = ind.get(d).getText();
			String Match1 = ind1.get(d).getText();

			
			sh.getRow(c+1).createCell(0).setCellValue(Match);
			sh.getRow(c+1).createCell(1).setCellValue(Match1);

			c++;

			}
			c++;
			}
			
		}
			

	
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		
	}
	
	public void scrollSmooth(){
	    for(int i=0;i<6000;i++) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,15)", "");
	    }
	}
	
}
		


  	


