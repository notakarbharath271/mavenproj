package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public FileInputStream fis;
	public FileOutputStream fos;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle cellstyle;
	String path;

	public ExcelUtility(String path) {
		this.path = path;
	}
	
	public int getRowCount(String sheetname) throws IOException {
		fis= new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
	    fis.close();
		return rowcount;
		
	}
	
	public int getcellCount(String sheetname ,int rownum) throws IOException {
		fis= new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
		int cellCount = row.getLastCellNum();
		workbook.close();
	    fis.close();
		return cellCount;
	}

	public String getcellData(String sheetname,int rownum,int colnum) throws IOException {
		fis= new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
	    cell =  row.getCell(colnum);
	    
	    DataFormatter formatter = new DataFormatter();
	    String data;
	    try {
	    	data = formatter.formatCellValue(cell);
	    }catch(Exception e) {
	    	data="";
	    }
	    workbook.close();
	    fis.close();
	    return data;
	}
	 public void setCellData(String sheetname,int row,int column,String data) throws IOException {
		 
		 File file = new File(path);
		 if(!file.exists()) {
			 workbook = new XSSFWorkbook();
			 fos = new FileOutputStream(path);
			 workbook.write(fos);
		 }
		 
		 fis = new FileInputStream(path);
		 workbook = new XSSFWorkbook(fis);
		 
	 
	}
	 
	 
	 
	 
	 
}
