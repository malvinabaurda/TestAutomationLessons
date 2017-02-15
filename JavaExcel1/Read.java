package JavaExcel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;

public class Read {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C://Users//Мальвина//Desktop//Книга1.xls");
		Workbook wb = new HSSFWorkbook(fis);
		String result = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(result);
		System.out.println(wb.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue());
		System.out.println(sdf.format(wb.getSheetAt(0).getRow(0).getCell(2).getDateCellValue()));
		System.out.println(wb.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue());
		fis.close();
	}

}
