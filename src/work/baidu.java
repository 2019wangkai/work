package work;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baidu {
		WebDriver driver;
	  	String url="https://baidu.com";
		@BeforeClass
		public void openchrome() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver= new ChromeDriver();
//		DesiredCapabilities c = DesiredCapabilities.chrome();
//		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),c);
		}
		@Test
		public void Alogin() throws InterruptedException{
			driver.get(url);
			//找到输入框输入内容
			driver.findElement(By.name("wd")).sendKeys("selenium");
			//暂停
			Thread.sleep(1000);
			//点击按钮
			driver.findElement(By.id("su")).click();
		}
}

