package com.NorwegianAirshuttletResources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.StepDefinitionclass.Hook;

public class Base {
	static WebDriver driver;

	public static void launchApplication(String url) {
		Hook.driver.get(url);
	}

	public static void filltheBox(WebElement e, String value) {
		e.sendKeys(value);
	}

/*	public static void btnClk(WebElement e) {
		e.click();
	}*/

	public static List<HashMap<String, String>> getDataFromExcelSheet() throws Throwable {
		List<HashMap<String, String>> dl = new ArrayList<HashMap<String, String>>();
	
		File f = new File("C:\\Users\\Welcome\\Downloads\\eclipse-java-oxygen-3a-win32\\eclipse\\GunaTestNG Project\\AirlineProjectIncucumberUsingExcelIntegration\\Excel\\NorwegianAirShuttleExcelIntegration.xlsx");
		FileInputStream st=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(st);
		Sheet s = w.getSheet("FlightPage");
		Row hr = s.getRow(0);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			HashMap<String, String> md= new HashMap<String, String>();
			for (int j = 0; j < hr.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				
				switch (c.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					md.put(hr.getCell(j).getStringCellValue(), c.getStringCellValue());
				break;
				
				case Cell.CELL_TYPE_NUMERIC:
					md.put(hr.getCell(j).getStringCellValue(), String.valueOf(c.getNumericCellValue()));
					break;
				}
					
				}
			dl.add(md);
			}
		return dl;
	}
}
