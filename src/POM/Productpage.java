package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	@FindBy(xpath="//area[@alt='Firsthalf']")
	private WebElement pic;
	@FindBy(xpath="//img[@class='prodImg']")
	private WebElement wishlist;
	@FindBy(xpath="//div[@id='wish-txt']")
	private WebElement clicking;
	public Productpage( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void pic()
	{
	pic.click();
	}	
	public void add()
	{
		wishlist.click();
	}
	public void clik()
	{
		clicking.click();
	}

}
