package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.optimus.BaseClass;

public class ProductDetailsPage extends BaseClass
{
	public WebDriver driver;
	
	//@FindBy(xpath="/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/form/div[3]/div/button")	
	@FindBy(xpath="/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/form/div[3]/div/button")	
	private WebElement addToCartBtn;
	
	@FindBy(xpath="/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/form/div[3]/div/button/span")
	private WebElement unavailableBtn;

	//@FindBy(xpath="//*[@id='ProductSection-product-template']/div/div[2]/div[1]/h1")
	@FindBy(xpath="/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/h1")
	private WebElement selectedProductName;
	
	//@FindBy(xpath="//*[@id='CartPopupHeading']")
	@FindBy(xpath="/html/body/div[1]/div/div[1]/h2")
	private WebElement popUpHeading;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[1]/div")
	private WebElement addedProductname;
	
	//@FindBy(xpath="//*[@id='ProductSection-product-template']/div/div[2]/div[1]/div/dl/div[1]/div[1]/dd/span")
	@FindBy(xpath="/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/div/dl/div[1]/div[1]/dd/span")
	private WebElement addedProductPrice;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[1]/ul/li[1]")
	private WebElement addedColor;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[1]/ul/li[2]")
	private WebElement addedSize;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/button")
	private WebElement closePopUp;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]")
	private WebElement qtyPopup;
	
	//@FindBy(xpath="//*[@id='SingleOptionSelector-0']")
	@FindBy(xpath="/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/form/div[1]/div[1]/select")
	private WebElement colorDropdown;
	
	@FindBy(xpath="/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/form/div[1]/div[2]/select")
	private WebElement sizeDropdown;
	
	
	public ProductDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public void setAddToCartBtn(WebElement addToCartBtn) {
		this.addToCartBtn = addToCartBtn;
	}

	public WebElement getSelectedProductName() {
		return selectedProductName;
	}

	public void setSelectedProductName(WebElement selectedProductName) {
		this.selectedProductName = selectedProductName;
	}

	public WebElement getPopUpHeading() {
		return popUpHeading;
	}

	public void setPopUpHeading(WebElement popUpHeading) {
		this.popUpHeading = popUpHeading;
	}
	
	
	public WebElement getAddedProductname() {
		return addedProductname;
	}

	public void setAddedProductname(WebElement addedProductname) {
		this.addedProductname = addedProductname;
	}

	public WebElement getAddedProductPrice() {
		return addedProductPrice;
	}

	public void setAddedProductPrice(WebElement addedProductPrice) {
		this.addedProductPrice = addedProductPrice;
	}

	public WebElement getAddedColor() {
		return addedColor;
	}

	public void setAddedColor(WebElement addedColor) {
		this.addedColor = addedColor;
	}

	public WebElement getAddedSize() {
		return addedSize;
	}

	public void setAddedSize(WebElement addedSize) {
		this.addedSize = addedSize;
	}

	public WebElement getClosePopUp() {
		return closePopUp;
	}

	public void setClosePopUp(WebElement closePopUp) {
		this.closePopUp = closePopUp;
	}

	public WebElement getQtyPopup() {
		return qtyPopup;
	}

	public void setQtyPopup(WebElement qtyPopup) {
		this.qtyPopup = qtyPopup;
	}

	public WebElement getColorDropdown() {
		return colorDropdown;
	}

	public void setColorDropdown(WebElement colorDropdown) {
		this.colorDropdown = colorDropdown;
	}

	public WebElement getSizeDropdown() {
		return sizeDropdown;
	}

	public void setSizeDropdown(WebElement sizeDropdown) {
		this.sizeDropdown = sizeDropdown;
	}

	public WebElement getUnavailableBtn() {
		return unavailableBtn;
	}

	public void setUnavailableBtn(WebElement unavailableBtn) {
		this.unavailableBtn = unavailableBtn;
	}
	
}
