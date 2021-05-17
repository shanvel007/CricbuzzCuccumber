package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;


public class NewZealandMatchPage extends BaseClass
{

	@FindBy(xpath="//div[@class='cb-col-60 cb-col cb-srs-mtchs-tm cb-ovr-flo']")
	private List<WebElement> MatchDetail;
	
	
	
	public NewZealandMatchPage() 
	{
	
		PageFactory.initElements(driver, this);
	}

	
	public void writeNewZealandMatchDetail() throws Exception
	{
		
		src = new File("C:\\Users\\Sadik\\Desktop\\Projects\\Cricbuzz.xlsx");
		fis=  new FileInputStream(src); 
    	workbook = new XSSFWorkbook(fis);
    	XSSFSheet sh= workbook.getSheetAt(1);
		
    	XSSFCellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setBold(true);
		style.setFont(font); 
		style.setWrapText(true);
		style.setShrinkToFit(true);
		
		sh.createRow(0).createCell(0).setCellValue("Date");
		
		sh.getRow(0).createCell(1).setCellValue("Match Details");


		
    	
		for(int x=0;x<MatchDetail.size();x++) {
			
			String firstpart = "(//div[@class='cb-col-60 cb-col cb-srs-mtchs-tm cb-ovr-flo'])[";
			String firstpart1 = "]";

			sh.createRow(x+1);
			int y = x+1;
			
//			String Date=driver.findElement(By.xpath(firstpart+y+firstpart1+"/div")).getText();
			String MatchDetail=driver.findElement(By.xpath(firstpart+y+firstpart1)).getText();
		
					
			sh.getRow(x+1).createCell(0).setCellValue(MatchDetail);

//			sh.getRow(x+1).createCell(1).setCellValue(Date);
	
			
		}

		sh.setAutoFilter(CellRangeAddress.valueOf("A1:B1"));
		
 		
		fos=new FileOutputStream(src); 
		workbook.write(fos); 
		
		workbook.close();
	}
	
	
	
}
