package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utilityFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file_path = new FileInputStream(System.getProperty("user.dir")+".\\testdata\\test_data.xlsx");
		
		try (XSSFWorkbook workbook = new XSSFWorkbook(file_path)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int row_count = sheet.getLastRowNum();
			//int cell_count = sheet.getRow(1).getLastCellNum();
			System.out.println("Total rows = "+row_count);
			
			for(int r = 0; r<=row_count; r++) {
				XSSFRow row = sheet.getRow(r);
				if(row==null)continue;
				int cell_count = row.getLastCellNum();
				for(int c = 0; c<=cell_count; c++) {
					XSSFCell celldata = row.getCell(c);
					if(celldata==null)continue;
					System.out.print(celldata.toString()+"\t"+" | ");
				}
				System.out.println(" ");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
