package apache;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path= "C:\\Users\\Sanjay Padval\\OneDrive\\Desktop\\NewEmployee.xlsx";
		FileInputStream file =new FileInputStream(path);
		double data= WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getNumericCellValue();
		int rowcount= WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		Cell c= WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0);
		
		for(int i=0; i<=rowcount;i++) {
			int cellcount= WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getLastCellNum();
			System.out.println(rowcount+ " "+cellcount);
			for (int j=0; j<=cellcount-1;j++) {
				if(c.equals(CellType.BOOLEAN)) {
					c.getBooleanCellValue();
				}
				else if(c.equals(CellType.NUMERIC)) {
					
				}
			}
		}
		
		
	}

}
