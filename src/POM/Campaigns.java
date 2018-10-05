package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaigns {
	@FindBy(xpath="//a[.='CAMPAIGNS']")
	private WebElement option;
	@FindBy(xpath="//img[@rel='Shop the Feature']")
	private WebElement select;
	public Campaigns( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void camp()
	{
		option.click();
	}
	public void feat()
	{
		select.click();
	}

}
