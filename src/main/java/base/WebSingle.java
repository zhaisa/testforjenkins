package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * 本类是单个用例调试运行的模板，case继承于本类后，就可以跑单个用例
 * 
 * @author Administrator
 *
 */
public class WebSingle extends TestBase {
	protected CheckPoint cp;
	protected static WebDriver driver;
	public static String url="http://testhf.irongbei.com";
	// Class开始之前，创建driver、checkPoint、locator、api对象
	@BeforeClass
	public void startChrome() {
		cp = new CheckPoint(this.getClass().getSimpleName(), driver);// 反射，谁调用就是谁的名字
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
