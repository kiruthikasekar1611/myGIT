package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetExcelData {

	public String[][] ReadData() throws Exception{
	
		XSSFWorkbook wb=new XSSFWorkbook("./ExcelsheetFolder/CL_data.xlsx");
		XSSFSheet sheet=wb.getSheetAt(0);

		int rowcount = sheet.getLastRowNum();
		int columncount= sheet.getRow(0).getLastCellNum();
		
		String [][] data=new String [rowcount][columncount];
		for(int i=1;i<=rowcount;i++){
			XSSFRow row=sheet.getRow(i);			
			for(int j=0;j<columncount;j++){
				String str=row.getCell(j).getStringCellValue();
				data[i-1][j]=str;
				
			}
		}

		return data;
	}

}
