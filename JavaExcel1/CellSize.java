package JavaExcel1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class CellSize {

	public static void main(String[] args)throws IOException {
	
		Workbook wb = new HSSFWorkbook();
   
    Sheet sheet0 = wb.createSheet("Ћист1");
    Row row = sheet0.createRow(0);
    Cell cell = row.createCell(0);
    cell.setCellValue("«начение");
   
    //sheet0.setColumnWidth(0, 5000);
    //дл€ колонки.1 параметр - номер столбца, второй - ширина
    //sheet0.autoSizeColumn(0);
    
    row.setHeightInPoints(30);
    //высота строки
    
    sheet0.addMergedRegion(new CellRangeAddress(0,5, 0, 2));
    //1,2 - c какого по какую строку, 3,4 - с какой по какую колонку
    //объединение €чеек
    
    
    
    
    FileOutputStream fos = new FileOutputStream("сellSize.xls");
    
    wb.write(fos);
    fos.close();

	}

}
