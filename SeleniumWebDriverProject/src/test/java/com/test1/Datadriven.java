package com.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Datadriven {
	@Test
	public void TestReadExcel()
	{
		File file=new File("C:\\Users\\training_b6b.01.09\\Downloads\\eclipse-java-2019-03-R-win32-x86_64\\eclipse\\Divyasree\\SeleniumWebDriverProject\\src\\test\\resources\\datadriven.xlsx");
		try {
			InputStream is=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(is);
			XSSFSheet sheet1=workbook.getSheet("Sheet1");
			for(int i=1;i<sheet1.getLastRowNum();i++)
			{
				for(int j=0;j<sheet1.getRow(i).getPhysicalNumberOfCells();j++)
				{
					System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue());
				}
				System.out.println();
				workbook.close();
			}
			
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}
