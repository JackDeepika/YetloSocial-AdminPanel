package com.YetloTestCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.YetloUtilities.XLUtils;

public class TC_FrameDDT_01 extends BaseClass {
	@Test
	public void FrameTest()
	{
		
	}
	
	//@DataProvider(name="FrameName")
	 // getData()
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/YetloTestData/FrameNameYetlo.xlsx";
		//int rownum=XLUtils.getRowCount(path, "Sheet1");
		//int cellnum=XLUtils.getCellCount(path, "Sheet1");
		
		//String FrameDDT[][]=new String[rownum][cellnum];
		//for(int i=1;i<=rownum;i++)
		{
			//for(int j=1;j<=cellnum;j++)
			{
				//FrameDDT [i-1][j]= XLUtils.getCellData(path,"Sheet1",i,j)
			}
		}
		
		
	}

}
