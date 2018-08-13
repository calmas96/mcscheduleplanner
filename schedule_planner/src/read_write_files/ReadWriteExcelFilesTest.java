package read_write_files;

import java.util.List;

public class ReadWriteExcelFilesTest {
    public static final String path = "C:/Users/sangt/Desktop/example.xlsx";

    public static void main(String args[]) {
        List exampleList = ReadWriteExcelFiles.readXLSFile(path);
        System.out.println(exampleList);
    }
}
