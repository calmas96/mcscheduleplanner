package read_write_files;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.List;


public interface ReadWriteExcelFilesAPI {

    /**
     * Read an xls file from a given directory.
     */
    List readXLSFile(String filename);

    /**
     * Write a workbook and return its directory.
     */
    String writeXLSFile(HSSFWorkbook workbook);

}
