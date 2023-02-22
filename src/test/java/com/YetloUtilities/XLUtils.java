package com.YetloUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	//public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	
	
	
	
	public static int getRowCount(String xlfile,String xlSheet) throws IOException
	{
		FileInputStream fi=new FileInputStream(xlfile);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet(xlSheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String xlfile,String xlSheet) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		int cellCount=ws.getLeftCol();
		wb.close();
		fi.close();
		return cellCount;
	}

}
