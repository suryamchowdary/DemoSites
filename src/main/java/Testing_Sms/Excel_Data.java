package Testing_Sms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import org.apache.commons.net.ftp.parser.ParserInitializationException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data {

	private static File file=new File("testdata\\testdata.xlsx");
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet1 ;
	private static XSSFRow Row;
	private static XSSFCell Cell;
	
	public static XSSFCell ReadExcel(int rownumber, int colnumber) throws Exception {
		
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet1 = wb.getSheetAt(0);
		Row = sheet1.getRow(rownumber);
		Cell = Row.getCell(colnumber);	
		fis.close();

	return Cell ;
	}
	
	public static XSSFCell WriteData() throws IOException, InvalidFormatException {
		
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet1 = wb.getSheetAt(0);
		Cell = Row.createCell(4);
		Cell.setCellValue("Suryam");
			FileOutputStream fileOut = new FileOutputStream(file);
				wb.write(fileOut);
			
		
		 return Cell;
		
		
	}
	public static void main(String[]args) throws Exception
	{
		System.out.println(ReadExcel(1, 1));
		System.out.println(ReadExcel(1, 0).getRawValue());
		System.out.println(ReadExcel(1, 2));
		System.out.println(WriteData());
	}
}
	






