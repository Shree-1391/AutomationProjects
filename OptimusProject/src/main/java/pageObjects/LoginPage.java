package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.optimus.BaseClass;

public class LoginPage extends BaseClass
{
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div/a")
	private WebElement enterUsingPw;
	
//	@FindBy(xpath="//*[@id=\"Password\"]")
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/input")
	private WebElement enterPw;
	
//	@FindBy(xpath="//*[@id='login_form']/div/span/button")
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/span/button")
	private WebElement submitBtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEnterUsingPw() {
		return enterUsingPw;
	}

	public void setEnterUsingPw(WebElement enterUsingPw) {
		this.enterUsingPw = enterUsingPw;
	}
	
	public WebElement getEnterPw() {
		return enterPw;
	}

	public void setEnterPw(WebElement enterPw) {
		this.enterPw = enterPw;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

}
