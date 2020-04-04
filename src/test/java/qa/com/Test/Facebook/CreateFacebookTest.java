package qa.com.Test.Facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.page.createaccount.CreateFacebook;

public class CreateFacebookTest extends CreateFacebook {
	
	CreateFacebook facebook;
	@BeforeMethod
	public void Precondtion()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree\\Downloads\\Video\\ChromeServer\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void Test()
	{
		facebook=new CreateFacebook();
		facebook.createaccount();
	}
	@AfterMethod
	public void Postcondtion()
	{
		driver.close();
	}
	
}
