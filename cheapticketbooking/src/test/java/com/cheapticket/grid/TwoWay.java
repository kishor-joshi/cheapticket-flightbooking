package com.cheapticket.grid;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TwoWay {
	public static RemoteWebDriver driver;

	Properties loc = new Properties();

	@BeforeClass
	  @Parameters("browser")
	public void setUp(String browser) throws IOException
	{
	FileInputStream input = new FileInputStream(".\\src\\test\\resources\\locators\\locators.properties");

	loc.load(input);
	driver=BaseClass.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
