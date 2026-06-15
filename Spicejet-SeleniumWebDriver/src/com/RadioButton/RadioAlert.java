package com.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioAlert {
	WebDriver driver;
	String url = "https://www.spicejet.com/";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void radioAlert() 
	{
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		String text = driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).getText();
		System.out.println(text);
	}
}

