package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy2 {
		WebDriver driver;
		String url = "https://www.easycalculation.com/";
		
		@BeforeTest
		public void Setup () {
			driver = new EdgeDriver ();
			driver.navigate().to(url);
			driver.manage().window().maximize();
		}
		@Test
		public void findElementById() throws Exception {
			driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/input[1]")).click();
		}

}
