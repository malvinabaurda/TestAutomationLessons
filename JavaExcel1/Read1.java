package JavaExcel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class Read1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C://Users//Мальвина//Desktop//Книга1.xls");
		Workbook wb = new HSSFWorkbook(fis);

		for (Row row : wb.getSheetAt(0)) {
			for (Cell cell : row) {
				CellReference cellref = new CellReference(row.getRowNum(), cell.getColumnIndex());
						System.out.print(cellref.formatAsString());
						System.out.print(" - ");
						System.out.println(cell);

			}

		}

	}
}
