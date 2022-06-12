package guru99Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99ApplicationTest {
	
	
	ChromeDriver driver; 
	String url="https://demo.guru99.com/V4/";
	
//	@BeforeMethod
//	public void invokeTest()
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\Selenium\\chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get(url);
//	}
	
	@Test(priority = -100)
	public void invokeTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority=0)
	public void verifyTest() {
		
		String acceptedTitle="Guru99 Bank Home Page";
		String actualTile=driver.getTitle();
		Assert.assertEquals(actualTile, acceptedTitle);
		//driver.quit();
	}
	
	@Test(priority=100)
	public void testLoginToGuru99Application(){
		WebElement userId=driver.findElement(By.name("uid"));
		WebElement userPassword=driver.findElement(By.name("password"));
		WebElement loginbtn=driver.findElement(By.name("btnLogin"));
		
		userId.sendKeys("mngr415486");
		userPassword.sendKeys("suqUdEz");
		loginbtn.click();
		//driver.quit();
	}
	
	@Test(priority=200)
	public void addCustomer() {
		WebElement addCustomerLink=driver.findElement(By.linkText("New Customer"));
		addCustomerLink.click();
//		WebElement ad = driver.findElement(By.id("dismiss-button"));
//		ad.click();
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.name("name")).sendKeys("Manas Srivastava");
		driver.findElement(By.name("dob")).sendKeys("03/22/2001");
		driver.findElement(By.name("addr")).sendKeys("Lucknow");
		driver.findElement(By.name("city")).sendKeys("Lucknow");
		driver.findElement(By.name("state")).sendKeys("UP");
		driver.findElement(By.name("pinno")).sendKeys("226001");
		driver.findElement(By.name("telephoneno")).sendKeys("8314579190");
		driver.findElement(By.name("emailid")).sendKeys("abc@xyz.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("sub")).click();
	}
	
	@Test(priority=300)
	public void GetCustomeId() {
		String customerID=driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
		System.out.println("Customer D - " + customerID);
	}
}
