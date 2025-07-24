package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static List<Map<String ,String>> read (String path, String sheetName) throws IOException{
        //To Bring the data from file into the java program
        List<Map<String,String>> excelData = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            //.xlsx - XSSF, .xls -HSSF
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
            //There can be many sheets we are getting the sheet1 from Excel
            Sheet sheet = xssfWorkbook.getSheet(sheetName);
            //getting the number of actual rows that contains the data
            int noOfActualRowsWithData = sheet.getPhysicalNumberOfRows();
            //Getting the row number 0 as we will be using this for all the maps as keys
            Row headerRow = sheet.getRow(0);
            //A loop to go through all the rows
            for (int i = 1; i < noOfActualRowsWithData; i++) {
                //Getting each row one by one from the map
            }
        }
    }
}
