package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class links1 
{
	@Test
	public void TestGoogleLinks()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window()
		
	

}
}



