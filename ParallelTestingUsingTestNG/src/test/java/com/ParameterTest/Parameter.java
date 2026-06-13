package com.ParameterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	@Parameters("browserName")
	
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is....." + browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
	}
	@Test
	public void BrowserTest() throws Exception{
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}


