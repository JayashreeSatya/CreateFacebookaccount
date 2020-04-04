package qa.com.page.createaccount;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class CreateFacebook {
	protected static WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")
	static WebElement Firstname;
	@FindBy(xpath="//input[@name='lastname']")
	static WebElement Surname;
	@FindBy(xpath="//input[@name='reg_email__']")
	static WebElement Email;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	static WebElement Password;
	@FindBy(id="day")
	static WebElement Day;
	@FindBy(id="month")
	static WebElement month;
	@FindBy(id="year")
	static WebElement year;
	@FindBy(xpath="//input[@name='sex']")
	static List<WebElement>l1;
	
	public CreateFacebook()
	{
    PageFactory.initElements(driver, this);
	}

	public static void SelectDay(String Value)
	{
		Select sct=new Select(Day);
		sct.selectByValue(Value);
		
	}
	public static void SelectMonth(String DDLMonth)
	{
		Select sct1=new Select(month);
		sct1.selectByValue(DDLMonth);
		
	}
	public static void SelectYear(String DDLYear)
	{
		Select sct2= new Select(year);
		sct2.selectByValue(DDLYear);
	}
	public static void Rediobuttion (int i) {
		l1.get(i).click();


	/*	l1.size();
		for(i=0;i<l1.size();i++)
		{
			String data=l1.get(i).getText();
			if(data.equalsIgnoreCase("Female"))
			{
				l1.get(i).click();
			}
			
		}*/
	}
	public static void createaccount()
	{
		Firstname.sendKeys("Jaya");
		Surname.sendKeys("Sahoo");
		Email.sendKeys("panda.jaya123@yahoo.com");
		Password.sendKeys("123456567734");
		Rediobuttion(0);
		SelectDay("2");
		SelectMonth("3");
		SelectYear("2018");
		
		
		
		
		
	}
	
	

}
