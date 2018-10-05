package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order{
	@FindBy(xpath="//img[@alt='track order']")
	private WebElement track;
	@FindBy(xpath="//p[.='Track Order']")
	private WebElement place;
	public Order( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void tracking()
	{
		track.click();
	}
	public void placing()
	{
		place.click();
	}
	
}