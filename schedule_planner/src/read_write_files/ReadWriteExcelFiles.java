package read_write_files;

import objects.Example;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadWriteExcelFiles {

    public static List readXLSFile(String filename) {
        List exampleList = new ArrayList();
        FileInputStream exampleFIS = null;

        try {
            exampleFIS = new FileInputStream(filename);
            Workbook wb = new XSSFWorkbook(exampleFIS);
            int numberOfSheets = wb.getNumberOfSheets();

            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = wb.getSheetAt(i);
                Iterator rowIterator = sheet.iterator();

                while (rowIterator.hasNext()) {
                    Example ex = new Example();
                    Row row = (Row) rowIterator.next();
                    Iterator cellIterator = row.cellIterator();

                    while (cellIterator.hasNext()) {
                        Cell cell = (Cell) cellIterator.next();

                        if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                            ex.setName(cell.getStringCellValue());
                        } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                            if (cell.getColumnIndex() == 1) {
                                ex.setId(cell.getNumericCellValue());
                            } else {
                                ex.setAge(cell.getNumericCellValue());
                            }
                        }
                    }
                    exampleList.add(ex);
                }
            }
            exampleFIS.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return exampleList;
    }

    public String writeXLSFile(HSSFWorkbook workbook) {
        return null;
    }
}
