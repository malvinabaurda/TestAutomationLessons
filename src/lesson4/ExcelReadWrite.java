package lesson4;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelReadWrite {

	public static void main(String[] args) throws BiffException, IOException, WriteException {

		WritableWorkbook myWorkbook;
		myWorkbook = Workbook.createWorkbook(new File("c://temp//output.xls"));
		WritableSheet mySheet = myWorkbook.createSheet("First Sheet", 0);

		Label label = new Label(0, 2, "A label record");
		mySheet.addCell(label);

		Number number = new Number(3, 4, 3.1459);
		mySheet.addCell(number);
		myWorkbook.write();
		myWorkbook.close();
//-----------------------------------------------------------------------------------
		Workbook workbook = Workbook.getWorkbook(new File("c://temp//output.xls"));
		Sheet sheet = workbook.getSheet(0);
		Cell cell1 = sheet.getCell(0, 2);
		System.out.println(cell1.getContents());
		Cell cell2 = sheet.getCell(3, 4);
		System.out.println(cell2.getContents());
		workbook.close();

	}

}