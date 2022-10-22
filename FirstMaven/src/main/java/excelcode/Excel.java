package excelcode;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
public XSSFSheet sh; //Each sheet in excel sheet
	
	public Excel() throws IOException 
	{
		FileInputStream f= new FileInputStream("E:\\Software Testing\\Java\\ExcelFiletoRead\\ExcelforMaven.xlsx");
		//FileInputStream is java library files used to connect external file. ExcelRead external file
		//is integrated to java
		//FileInputStream f= new FileInputStream("E:\Software Testing\Java\ExcelFiletoRead\ExcelforMaven.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);//XSSFWorkbook is Excel sheet. This line of code creates a Workbook
		sh= w.getSheet("Sheet1");//getSheet is used to fetch data from Sheet1 of the Workbook
	}
	public String readData(int i, int j) 
	{
		Row r= sh.getRow(i);//Full rows 
		Cell c= r.getCell(j); //Import Cell of apache poi not Table. apache poi is a jar file used for ExcelRead.
		//Cell is each cell
		int celltype=c.getCellType();
		switch(celltype) //switch()...case is used for handling 2 datatypes (String and Integer). Since the method 
		//is String and the Row or Cell can contain integer also, it is not possible to return both datatypes in a
		//single method. So switch()...case can be used to convert integer(number) to String via return String.valueOf(a);
		{
		case Cell.CELL_TYPE_NUMERIC:
		{
			double a=c.getNumericCellValue();
			return String.valueOf(a);//Integer to String with output by a doublequotes. Eg:-"23";
		}
		case Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
		}
		return null; //If there is no data in excel, it will return null
	}
}
