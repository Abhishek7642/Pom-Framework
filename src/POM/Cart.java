package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	@FindBy(xpath="//img[@data-reactid='29']")
	private WebElement cart;
	@FindBy(xpath="//a[.=' continue shopping ']")
	private WebElement conti;
	public Cart( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void bag()
	{
		cart.click();
	}
	public void go()
	{
		conti.click();
	}

}
