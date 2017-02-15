package JavaExcel1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

//Стили и шрифты
public class Style {

	public static void main(String[] args) throws IOException {
			Workbook wb = new HSSFWorkbook();
		    Sheet sheet0 = wb.createSheet("Лист1");
		    Row row = sheet0.createRow(3);
		    Cell cell = row.createCell(4);
		    cell.setCellValue("Значение");
		    
		    CellStyle style = wb.createCellStyle();
		    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		    style.setFillForegroundColor(IndexedColors.BLUE_GREY.getIndex());
		    //style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		    style.setAlignment(CellStyle.ALIGN_RIGHT);
		    style.setVerticalAlignment(CellStyle.VERTICAL_TOP);
		    style.setBorderBottom(CellStyle.BORDER_DASH_DOT_DOT);
		    style.setBottomBorderColor(IndexedColors.BLUE.getIndex());
		    
		    Font font = wb.createFont();
		    font.setFontName("Courier New");
		    font.setFontHeightInPoints((short) 15);
		    font.setBold(true);
		    font.setStrikeout(true);
		    font.setUnderline(Font.U_SINGLE);
		    font.setColor(IndexedColors.RED.getIndex());
		    
		    style.setFont(font);
		    
		    cell.setCellStyle(style);
		   
		   FileOutputStream fos = new FileOutputStream("style.xls");
		    
		    wb.write(fos);
		    fos.close();

	}

}
