package com.sgtesting.ExcelPOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;


public class ReadExcelFileContent {
    public static void main(String[] args) {
        readcontent();
    }

    private static void readcontent()
    {
        FileInputStream fin=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;

        try
        {
            fin=new FileInputStream("F:\\Demo\\PractiseDisplayPOI.xlsx");
            wb=new XSSFWorkbook(fin);
            sh=wb.getSheet("Sheet3");
            int rc=sh.getPhysicalNumberOfRows();
            for(int r=0;r<rc;r++)
            {
                row=sh.getRow(r);
                int cc=row.getPhysicalNumberOfCells();
                //DataFormatter formatter = new DataFormatter();
                //String strValue = formatter.toString();
                for(int c=0;c<cc;c++)
                {
                    cell=row.getCell(c);
                    String data=cell.getStringCellValue();
                    System.out.print(data+" ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                wb.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
