package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how = How.LINK_TEXT , using="Sign in")
	protected WebElement linkSignin;
	
	@FindBy(how = How.ID , using="email")
	protected WebElement txtEmail;
	
	@FindBy(how = How.ID , using="passwd")
	protected WebElement txtPasswd;
	
	@FindBy(how = How.ID , using="SubmitLogin")
	protected WebElement submitLogin;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"search_query_top\"]")
	protected WebElement txtSearch;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"searchbox\"]/button")
	protected WebElement btSearch;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/a/img")
	protected WebElement btClickDress;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"add_to_cart\"]/button/span")
	protected WebElement btAddCart;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	protected WebElement btCheckOut;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"cart_quantity_up_7_34_0_607023\"]/span")
	protected WebElement btQty;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	protected WebElement btCheckOut2;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"center_column\"]/form/p/button/span")
	protected WebElement btCheckOut3;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"uniform-cgv\"]")
	protected WebElement ckClickTerms;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"form\"]/p/button/span")
	protected WebElement btCheckOut4;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	protected WebElement btPaymentBank;
	
	@FindBy(how = How.XPATH , using="//*[@id=\"cart_navigation\"]/button/span")
	protected WebElement btConfirmOrder;
}