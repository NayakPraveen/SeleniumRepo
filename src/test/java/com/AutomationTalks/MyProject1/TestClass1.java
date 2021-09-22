package com.AutomationTalks.MyProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass1 {
	public static WebDriver driver;
	@BeforeMethod
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CoreJava\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1()
	{
		driver.navigate().to("https://timesofindia.indiatimes.com");
		System.out.println("Test 1 title is "+driver.getTitle());
	}
	@Test
	public void Test2()
	{
		driver.navigate().to("https://www.nseindia.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Test 3 title is "+driver.getTitle());
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
