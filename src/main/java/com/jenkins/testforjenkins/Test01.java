package com.jenkins.testforjenkins;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import base.WebSingle;

/**
 * Hello world!
 *
 */
public class Test01 extends WebSingle {
	
@Parameters({"username"})
@Test(timeOut=4000)
   public void openBaiDu(String username) {
//	   driver.findElement(By.linkText("新闻")).click();
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   System.out.println(driver.getTitle());
	   System.out.println(username+"这是历史性的胜利");
	
//	 assertEquals("融贝网官网_值得信赖的网络借贷信息中介平台", driver.getTitle());
	   cp.equals("融贝网官网_值得信赖的网络借贷信息中介平台", driver.getTitle());
	   cp.result("完美运行成功");
   }
   


}
