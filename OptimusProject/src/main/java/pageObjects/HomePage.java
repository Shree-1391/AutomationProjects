package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.optimus.BaseClass;

public class HomePage extends BaseClass
{
public WebDriver driver;
	
	//@FindBy(xpath="//*[@id='SiteNav']/li[1]/a/span")
	@FindBy(xpath="/html/body/div[2]/div[2]/header/div/nav/ul/li[1]/a/span")
	private WebElement homeLlink;
	
	//@FindBy(xpath="//*[@id='SiteNav']/li[2]/a/span")
	@FindBy(xpath="/html/body/div[2]/div[2]/header/div/nav/ul/li[2]/a/span")
	private WebElement catalogLink;
	
	//@FindBy(xpath="//*[@id='shopify-section-header']/div[2]/header/div/div[2]/div/button[1]")
	@FindBy(xpath="/html/body/div[2]/div[2]/header/div/div[2]/div/button[1]")
	private WebElement searchBtn;
	
	//@FindBy(xpath="//*[@id='shopify-section-header']/div[2]/header/div/div[2]/div/a")
	@FindBy(xpath="/html/body/div[2]/div[2]/header/div/div[2]/div/a")
	private WebElement cartBtn;
	
	//@FindBy(xpath="//*[@id='CartCount']")
	@FindBy(xpath="/html/body/div[2]/div[2]/header/div/div[2]/div/a/div")
	private WebElement cartCount;

	//@FindBy(xpath="//*[@id='SearchDrawer']/div/div/form/div/input[1]")
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/form/div/input[1]")
	private WebElement searchTxBx;
	
	//@FindBy(xpath="//*[@id='SearchDrawer']/div/div/form/button")
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/form/button")
	private WebElement searchEnter;
	
	//@FindBy(xpath="//*[@id='SearchDrawer']/div/div/div/button")
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div/button")
	private WebElement cancelBtn;
	
	//@FindBy(xpath="//*[starts-with(@id,'search-result')]/a")
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/form/div/div[1]/div/ul/li/a")
	private List<WebElement> productResult;
	
	//@FindBy(xpath="//div[@class='section-header text-center']")
	@FindBy(xpath="/html/body/div[3]/main/div[3]/div/div/h2")
	private WebElement featuredCollectionTitle;
	
	//@FindBy(xpath="//div[@class='page-width']//ul[@class='grid grid--uniform grid--view-items']/li/div/a")
	@FindBy(xpath="/html/body/div[3]/main/div[3]/div/ul/li/div/a")
	private List<WebElement> featuredCollectionProducts;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHomeLlink() {
		return homeLlink;
	}

	public void setHomeLlink(WebElement homeLlink) {
		this.homeLlink = homeLlink;
	}

	public WebElement getCatalogLink() {
		return catalogLink;
	}

	public void setCatalogLink(WebElement catalogLink) {
		this.catalogLink = catalogLink;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public void setCartBtn(WebElement cartBtn) {
		this.cartBtn = cartBtn;
	}

	public WebElement getSearchTxBx() {
		return searchTxBx;
	}

	public void setSearchTxBx(WebElement searchTxBx) {
		this.searchTxBx = searchTxBx;
	}

	public WebElement getSearchEnter() {
		return searchEnter;
	}

	public void setSearchEnter(WebElement searchEnter) {
		this.searchEnter = searchEnter;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	public void setCancelBtn(WebElement cancelBtn) {
		this.cancelBtn = cancelBtn;
	}

	public List<WebElement> getProductResult() {
		
		return productResult;
	}

	public void setProductResult(List<WebElement> productResult) {
		this.productResult = productResult;
	}
	
	public WebElement getCartCount() {
		return cartCount;
	}

	public void setCartCount(WebElement cartCount) {
		this.cartCount = cartCount;
	}
	
	public WebElement getFeaturedCollectionTitle() {
		return featuredCollectionTitle;
	}

	public void setFeaturedCollectionTitle(WebElement featuredCollectionTitle) {
		this.featuredCollectionTitle = featuredCollectionTitle;
	}

	public List<WebElement> getFeaturedCollectionProducts() {
		return featuredCollectionProducts;
	}

	public void setFeaturedCollectionProducts(List<WebElement> featuredCollectionProducts) {
		this.featuredCollectionProducts = featuredCollectionProducts;
	}

}
