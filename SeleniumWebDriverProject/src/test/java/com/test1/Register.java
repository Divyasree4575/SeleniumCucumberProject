package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register {
	@Test
	public void DemoWebShopLogin()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Register"));
		driver.findElement(By.id("gender-female")).sendKeys("Female");
		driver.findElement(By.id("FirstName")).sendKeys("Divya");
		driver.findElement(By.id("LastName")).sendKeys("sree");
		driver.findElement(By.id("Email")).sendKeys("divyasree@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		//driver.close();
}
}