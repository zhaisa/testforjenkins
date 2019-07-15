package com.jenkins.testforjenkins;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.WebSingle;
import myutil.GetExcelData;

/**
 * Hello world!
 *
 */
public class Test02 extends WebSingle {
	
//@Parameters({"username"})
	
@Test(timeOut=4000,dataProvider="getdata")
   public void openBaiDu(Map<String, String> map) {
//	   driver.findElement(By.linkText("新闻")).click();
	String param1 = map.get("测试1");
	String param2 = map.get("测试2");
	String param3 = map.get("测试3");
	String param4=map.get("测试4");
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   System.out.println(driver.getTitle());
	   System.out.println(param1+"第一列数据");
	   System.out.println(param2+"第二列数据");
	   System.out.println(param3+"第三列数据");
	   System.out.println(param4+"第四列数据");
//	 assertEquals("融贝网官网_值得信赖的网络借贷信息中介平台", driver.getTitle());
	   cp.equals("融贝网官网_值得信赖的网络借贷信息中介平台", driver.getTitle());
	   cp.result("完美运行成功");
   }
   @DataProvider(name="getdata")
public Object[][] getdata(){
	   GetExcelData ged=new GetExcelData();
	   Object[][] result = null;
	try {
		result = ged.getmydata("D:\\workspace\\testforjenkins\\src\\main\\resources\\123.xlsx");
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return result;
	   
   }

}
