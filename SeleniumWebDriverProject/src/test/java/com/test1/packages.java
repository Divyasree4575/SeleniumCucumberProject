package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class packages {

	@Test
	public void TestDragAndDrop()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath(""))
}
}
//*[@id="ctl00_ContentPlaceholder1_RadTreeView1"]/ul/li/ul/li[3]/ul/li[1]/div/div/span