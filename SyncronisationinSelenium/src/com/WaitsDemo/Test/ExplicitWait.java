package com.WaitsDemo.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selelenium Automation Testing");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("Apj")));
		element.click();
	}
}

