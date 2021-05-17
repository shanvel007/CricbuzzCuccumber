package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {

		public static WebDriver driver;
		public static Properties prop;
		public static File src;
		public static FileInputStream fis;
		public static XSSFWorkbook workbook;
		public static XSSFSheet sheet;
		public static FileOutputStream fos;
		public static XSSFRow row0;
		public static XSSFRow row1;
		
		public BaseClass1()
		{
			
			
			
		}
		
		public void startup() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shanvel007\\Desktop\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.cricbuzz.com/");
		}

		
	}



