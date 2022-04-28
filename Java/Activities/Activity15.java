package activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {

    private static String FILE_NAME = "resources/TestSheet.xlsx";

    public static void main(String[] args) {

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Groceries in shop");

        /*Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };*/
        Object[][] groceries = {
                {"Item", "Type", "Quantity"},
                {"Apple", "Fruit", 1000},
                {"Carrot", "Vegetable", 500},
                {"Banana", "Fruit", 2000},
                {"Beans", "Vegetable", 1500},
                {"Cabbage", "Vegetable", 750},
                {"Mango", "Fruit", 3000}
        };
        int rowNum=0;
        System.out.println("Creating excel file" );
        for (Object[] datatype : groceries) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try{
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            wb.write(fos);
            wb.close();
        }
        catch(IOException e){
            e.printStackTrace();
            }
        System.out.println("Done Successfully");

    }
}
