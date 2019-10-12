package com.StepDefinitionclass;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;

	@Before
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\Downloads\\eclipse-java-oxygen-3a-win32\\eclipse\\GunaTestNG Project\\AirlineProjectIncucumberUsingExcelIntegration\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@After
	public void close() {
		driver.quit();
	}
}
