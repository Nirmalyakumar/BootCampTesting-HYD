package com.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	WebDriver driver;
	@Test(dataProvider = "EasyCalculation")
	public void Browser (String UserName, String Password) throws Exception{
		driver = new ChromeDriver();
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("log_email")).sendKeys(UserName);
		driver.findElement(By.id("log_password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name = "EasyCalculation")
	public Object[][] passData (){
		Object[][] data = new Object[3][2];
		data[0][0] = "9508635182";
		data[0][1] = "raghubn";
		
		data[1][0] = "9500835182";
		data[1][1] = "raghubn@123";
		
		data[2][0] = "9508635182";
		data[2][1] = "kush@2004";
		return data;
	}
	

}
