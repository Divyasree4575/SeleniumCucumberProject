package com.test1;




 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.interactions.Actions;
  import org.testng.Assert;
  import org.testng.annotations.AfterClass;
  import org.testng.annotations.AfterTest;
  import org.testng.annotations.BeforeClass;
  import org.testng.annotations.BeforeTest;
  import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import testmeapp.utility.Drivers;
  public class CaseStudy{
   WebDriver driver;
   @BeforeClass
   public void beforeClass() {
   driver=Drivers.getDriver("chrome");
   driver.get("http://10.232.237.143:443/TestMeApp/");
         driver.manage().window().maximize();
   }
   
  @Test(priority=2)
  public void testLogin() {
   String title=driver.getTitle();
   Assert.assertTrue(title.contains("Login"));
   driver.findElement(By.id("userName")).sendKeys("divyasree348");
   driver.findElement(By.id("password")).sendKeys("abcd123");
   driver.findElement(By.cssSelector("input[value='Login']")).click();

  
  }

 @Test(priority=1)
  public void testRegistration() {
   driver.findElement(By.linkText("SignUp")).click();
   
   driver.findElement(By.id("userName")).sendKeys("divyasree348");
   driver.findElement(By.id("firstName")).sendKeys("divya");
   driver.findElement(By.id("lastName")).sendKeys("sree");
   
   driver.findElement(By.id("password")).sendKeys("abcd123");
   driver.findElement(By.id("pass_confirmation")).sendKeys("abcd123");
   driver.findElement(By.cssSelector("input[value='Female']")).click();
   driver.findElement(By.id("emailAddress")).sendKeys("abcd@email.com");
   driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
   driver.findElement(By.id("dob")).sendKeys("01/23/2019");
   driver.findElement(By.id("address")).sendKeys("qwertyuiopasdfghjklzxcvbnm");
   driver.findElement(By.id("securityQuestion")).sendKeys("What is your favour color?");
   driver.findElement(By.id("answer")).sendKeys("red");
   driver.findElement(By.cssSelector("input[value='Register']")).click();

  
  }
  @Test(priority=3)
  public void testCart() throws InterruptedException {
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   Actions action=new Actions(driver);
   action.moveToElement(driver.findElement(By.partialLinkText("All Categories"))).perform();
   action.click(driver.findElement(By.partialLinkText("Electronics"))).perform();
   action.click(driver.findElement(By.partialLinkText("Head Phone"))).perform();
   action.click(driver.findElement(By.partialLinkText("Add to cart"))).perform();
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }  
   
  @Test(priority=4)    
  public void testPayment() 
  {
	  Actions action=new Actions(driver);
	  action.click(driver.findElement(By.partialLinkText("Cart"))).perform();
	   action.click(driver.findElement(By.partialLinkText("Checkout"))).perform();
	  action.click(driver.findElement(By.cssSelector("input[value='Proceed to Pay']"))).perform();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  String title1=driver.getTitle();
	  Assert.assertTrue(title1.contains("Payment Gateway"));
	  action.click(driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label"))).perform();

	  //driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

	  driver.findElement(By.id("btn")).click();

	driver.findElement(By.name("username")).sendKeys("123456");

	driver.findElement(By.name("password")).sendKeys("Pass@456");

	action.click(driver.findElement(By.cssSelector("input[value='LOGIN']"))).perform();
  }
   
  
   
  @AfterClass
  public void endReportAfterTest() {
  //driver.close();
  }
  
  }








