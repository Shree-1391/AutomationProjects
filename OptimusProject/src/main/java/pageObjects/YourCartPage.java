package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.optimus.BaseClass;

public class YourCartPage extends BaseClass
{
	public WebDriver driver;
	
	//@FindBy(xpath="//div[@class='cart-header']//h1[@class='cart-header__title']")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/div/h1")
	private WebElement yourCartTitle;
	
	//@FindBy(xpath="//table/tbody/tr")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/table/tbody/tr")
	private List<WebElement> rows;
	
	//@FindBy(xpath="//table/tbody/tr/td")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/table/tbody/tr/td")
	private List<WebElement> columns;
	
	//@FindBy(xpath="//table/tbody/tr/td[@class='cart__meta small--text-left']//div[@class='list-view-item__title']")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/table/tbody/tr/td/div/div[2]/div/a")
	private List<WebElement> productDetails;
	
	//@FindBy(xpath="//table/tbody/tr/td[@class='cart__price text-right']/div/dl/div[2]/dd")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/table/tbody/tr/td/div[1]/dl/div[2]/dd")
	private List<WebElement> productPrice;
	
	//@FindBy(xpath="//div[@class='cart__qty']//input[@class='cart__qty-input']")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/table/tbody/tr/td/div[1]/input")
	private List<WebElement> productQty;
	
	//@FindBy(xpath="//table/tbody/tr/td[@class='cart__final-price text-right small--hide']")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/table/tbody/tr/td[4]/div/span")
	private List<WebElement> productTotal;
	
	//@FindBy(xpath="//table/tbody/tr/td[@class='cart__meta small--text-left']//p[@class='cart__remove']/a")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/table/tbody/tr/td/div/div[2]/p/a")
	private List<WebElement> removeLink;
	
	//@FindBy(xpath="//*[@class='cart-subtotal']//span[2]")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[1]/form/div/div/div/div[2]/span[2]")
	private WebElement subTotal;
	
	//@FindBy(xpath="//*[@id='shopify-section-cart-template']/div/div[2]/p")
	//@FindBy(xpath="//*[@class='empty-page-content text-center']//p[@class='cart--empty-message']")
	@FindBy(xpath="/html/body/div[3]/main/div/div/div[2]/p")
	private WebElement cartEmptyMsg;
	
	public YourCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String getXpath()
	{
	//	 String xpath="//*[@id='shopify-section-cart-template']/div/div[2]/p";
		 String xpath=" /html/body/div[3]/main/div/div/div[2]/p";
		
		 return xpath;
		
	}
	public WebElement getYourCartTitle() {
		return yourCartTitle;
	}


	public void setYourCartTitle(WebElement yourCartTitle) {
		this.yourCartTitle = yourCartTitle;
	}


	public List<WebElement> getRows() {
		return rows;
	}


	public void setRows(List<WebElement> rows) {
		this.rows = rows;
	}


	public List<WebElement> getColumns() {
		return columns;
	}


	public void setColumns(List<WebElement> columns) {
		this.columns = columns;
	}


	public List<WebElement> getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(List<WebElement> productDetails) {
		this.productDetails = productDetails;
	}


	public List<WebElement> getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(List<WebElement> productPrice) {
		this.productPrice = productPrice;
	}


	public List<WebElement> getProductQty() {
		return productQty;
	}


	public void setProductQty(List<WebElement> productQty) {
		this.productQty = productQty;
	}


	public List<WebElement> getProductTotal() {
		return productTotal;
	}


	public void setProductTotal(List<WebElement> productTotal) {
		this.productTotal = productTotal;
	}


	public List<WebElement> getRemoveLink() {
		return removeLink;
	}


	public void setRemoveLink(List<WebElement> removeLink) {
		this.removeLink = removeLink;
	}


	public WebElement getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(WebElement subTotal) {
		this.subTotal = subTotal;
	}
	
	public WebElement getCartEmptyMsg() {
		return cartEmptyMsg;
	}

	public void setCartEmptyMsg(WebElement cartEmptyMsg) {
		this.cartEmptyMsg = cartEmptyMsg;
	}



}
