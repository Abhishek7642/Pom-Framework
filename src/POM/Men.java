package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men {
	@FindBy(xpath="//a[.='MEN']")
	private WebElement link;
	@FindBy(xpath="//area[@shape='rect']")
	private WebElement shop;
	@FindBy(id="search-input-field")
	private WebElement search;
	public Men( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void linkmen()
	{
		link.click();
	}
	public void shopmen()
	{
		shop.click();
	}
	public void input(String name)
	{
		search.sendKeys(name);
	}
	

}
