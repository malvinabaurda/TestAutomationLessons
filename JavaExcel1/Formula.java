package JavaExcel1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//Формулы
public class Formula {

	public static void main(String[] args) throws IOException {
		//Workbook - interface, HSSFWorkbook - class
			Workbook wb = new HSSFWorkbook();
		    Sheet sheet = wb.createSheet("Лист1");
		    
		    Row row = sheet.createRow(0);
		    
		    Cell cell0 = row.createCell(0);
		    cell0.setCellValue(1);
		    Cell cell1 = row.createCell(1);
		    cell1.setCellValue(2);
		    Cell cell2 = row.createCell(2);
		    cell2.setCellFormula("A1+B1");
		    Cell cell3 = row.createCell(2);
		    cell3.setCellFormula("A1*B1");
		    
		    Row row1 = sheet.createRow(1);
		    Cell cell4 = row1.createCell(0);
		    cell4.setCellValue(1);
		    
		    Row row2 = sheet.createRow(2);
		    Cell cell5 = row2.createCell(0);
		    cell5.setCellValue(2);
		    
		    Row row3 = sheet.createRow(3);
		    Cell cell6 = row3.createCell(0);
		    cell6.setCellValue(3);
		    
		    Row row4 = sheet.createRow(4);
		    Cell cell7 = row4.createCell(0);
		    cell7.setCellValue(4);
		    
		    Row row5 = sheet.createRow(5);
		    Cell cell8 = row5.createCell(0);
		    cell8.setCellFormula("Sum(A2:A5)");
		    
		    
		    FileOutputStream fos = new FileOutputStream("C://Users//Мальвина//workspace//JavaExcel//formula.xls");
		    wb.write(fos);
		    fos.close();
		    
		    

	}

}
