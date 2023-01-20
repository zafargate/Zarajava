package com.actitime.genric;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class DataDrivenTEsting
{
    public static void main(String[] args) throws IOException {
        File path=new File("./TestData/TestScriptData/testscript.xlsx");
        FileInputStream fis=new FileInputStream(path);
        Workbook wb= WorkbookFactory.create(path);
        String data= wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
        System.out.println(data);


    }
}
