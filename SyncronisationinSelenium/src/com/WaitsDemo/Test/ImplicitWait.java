package com.WaitsDemo.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("FromSector_show")).sendKeys("Delhi", Keys.ENTER);
		driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai", Keys.ENTER);
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.id("fiv_5_31/07/2026")).click();
		driver.findElement(By.className("srchBtnSe")).click();
	}

}
