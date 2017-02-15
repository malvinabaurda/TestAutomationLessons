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
   
    Sheet sheet0 = wb.createSheet("����1");
    Row row = sheet0.createRow(0);
    Cell cell = row.createCell(0);
    cell.setCellValue("��������");
   
    //sheet0.setColumnWidth(0, 5000);
    //��� �������.1 �������� - ����� �������, ������ - ������
    //sheet0.autoSizeColumn(0);
    
    row.setHeightInPoints(30);
    //������ ������
    
    sheet0.addMergedRegion(new CellRangeAddress(0,5, 0, 2));
    //1,2 - c ������ �� ����� ������, 3,4 - � ����� �� ����� �������
    //����������� �����
    
    
    
    
    FileOutputStream fos = new FileOutputStream("�ellSize.xls");
    
    wb.write(fos);
    fos.close();

	}

}
