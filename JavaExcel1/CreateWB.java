package JavaExcel1;
//создание xls
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;

public class CreateWB {

	public static void main(String[] args) throws IOException {
	//Workbook - interface, HSSFWorkbook - class
		Workbook wb = new HSSFWorkbook();
    //создаем лист, Sheet - interface
    Sheet sheet0 = wb.createSheet("Издатели");
    Row row = sheet0.createRow(3);
    Cell cell = row.createCell(4);
    cell.setCellValue("OReilly");
    
    Sheet sheet1 = wb.createSheet("Книги");
    Row row1 = sheet1.createRow(0);
    Cell cell1 = row1.createCell(0);
    cell1.setCellValue("A");
    Cell cell2 = row1.createCell(1);
    cell2.setCellValue("B");
    Row row2 = sheet1.createRow(1);
    Cell cell3 = row2.createCell(0);
    cell3.setCellValue("C");
    
    Sheet sheet2 = wb.createSheet("Авторы");
    Sheet sheet3 = wb.createSheet(WorkbookUtil.createSafeSheetName("$%^^78@#$%^&"));
    //поток файла
    FileOutputStream fos = new FileOutputStream("my.xls");
    
    wb.write(fos);
    fos.close();
	}

}
