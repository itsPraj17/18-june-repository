package apache;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
		
		public static void main(String[] args) throws IOException {
			
			
			FileInputStream file =	new FileInputStream("C:\\Users\\Sanjay Padval\\OneDrive\\Desktop\\Book1.xlsx");
			
			String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			
			System.out.println(data);

}
}
