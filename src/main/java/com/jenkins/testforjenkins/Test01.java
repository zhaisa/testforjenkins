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

/**
 * Hello world!
 *
 */
public class Test01 {
	public static WebDriver driver;
	public static String url="http://testhf.irongbei.com";
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
	   System.out.println(username);
	
	  assertEquals("融贝网官网_值得信赖的网络借贷信息中介平台", driver.getTitle());
	
   }
   
@BeforeClass
public void startChrome() {
	File f=new File("src/main/resources/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized","allow-running-insecure-content","--test-type");
	options.addArguments("disable-infobars");
	driver=new ChromeDriver(options);
	driver.get(url);
}
@AfterClass
public void closeDriver() {
	driver.close();
	driver.quit();
}

}
