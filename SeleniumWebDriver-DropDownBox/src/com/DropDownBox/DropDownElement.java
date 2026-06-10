// WAP using selenium web driver of items for drop down box in test automation practice application and print items listed in drop down box, use TestNG framework.

package com.DropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownElement {
	WebDriver driver;
	String url = ("https://testautomationpractice.blogspot.com/");

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Test
	public void DropDownList() throws Exception {
		WebElement Country_Dropdown = driver.findElement(By.id("country"));
		Select Country_List = new Select(Country_Dropdown);

		Country_List.selectByIndex(3);
		Thread.sleep(10000);
		Country_List.selectByVisibleText("India");

		WebElement option = Country_List.getFirstSelectedOption();
		String countryindex = option.getText();
		System.out.println(countryindex);

		List<WebElement> c_list = Country_List.getOptions();
		int total_month = c_list.size();
		System.out.println("Total months count in List : " + total_month);

		for (WebElement ele : c_list) {
			String coun_name = ele.getText();
			System.out.println("Country Names n list:" + coun_name);
		}

	}

}
