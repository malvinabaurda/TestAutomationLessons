package JavaExcel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Read2 {

	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream("C://Users//Мальвина//Desktop//Книга1.xls");
				HSSFWorkbook workbook = new HSSFWorkbook()) {
			HSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print((int) cell.getNumericCellValue() + "(Integer)\t");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "(String)\t");
						break;
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
