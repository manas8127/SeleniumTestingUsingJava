package seleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	ChromeDriver driver;
	public void invokeBrowser() {
		
		String url="https://demo.guru99.com/V4/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\Selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}
	
	public void getTitle() {
		String titleOfThePage=driver.getTitle();
		System.out.println("Title of the page is "+titleOfThePage);
	}
	
	public void closeBrowser() {
		//driver.close();
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		WorkingWithChrome wc=new WorkingWithChrome();
		wc.invokeBrowser();
		
		wc.getTitle();
		
		wc.closeBrowser();
	}
}
