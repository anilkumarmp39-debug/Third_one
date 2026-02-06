package Day3;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Anil");
		
		Object empdata [][] = {{"SlNo","Name","Class"},
				{101,"Anil","BE"},
				{102,"Deepak","BCA"}};
		int rows = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
			}
		}
		String filepath="C:\\Users\\Admin\\git\\repository2\\Selenium_Ani\\Files\\AD.xlsx";
		FileOutputStream outstream= new FileOutputStream(filepath);
		workbook.write(outstream);
		
		outstream.close();
		System.out.println("Done Succesfully");
			}
		}
	


