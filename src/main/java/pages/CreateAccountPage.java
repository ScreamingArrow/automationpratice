package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverContext;

import org.openqa.selenium.WebElement;

public class CreateAccountPage {
	
	public CreateAccountPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how = How.LINK_TEXT , using="Sign in")
	protected WebElement linkSignin;
	
	@FindBy(how = How.ID , using="email_create")
	protected WebElement txtEmail;	
	
	@FindBy(how = How.ID , using="SubmitCreate")
	protected WebElement btCreateAccount;
	
	@FindBy(how = How.ID , using="id_gender1")
	protected WebElement radioTitle;
	
	@FindBy(how = How.ID , using="customer_firstname")
	protected WebElement txtFirstName;
	
	@FindBy(how = How.ID , using="customer_lastname")
	protected WebElement txtLastName;
	
	@FindBy(how = How.ID , using="passwd")
	protected WebElement txtPassword;
	
	@FindBy(how = How.ID , using="days")
	protected WebElement cbDays;
	
	@FindBy(how = How.ID , using="months")
	protected WebElement cbMonths;
	
	@FindBy(how = How.ID , using="years")
	protected WebElement cbYears;
	
	@FindBy(how = How.ID , using="newsletter")
	protected WebElement ckNewsLetter;
	
	@FindBy(how = How.ID , using="company")
	protected WebElement txtCompany;
	
	@FindBy(how = How.ID , using="address1")
	protected WebElement txtAddress1;
	
	@FindBy(how = How.ID , using="address2")
	protected WebElement txtAddress2;
	
	@FindBy(how = How.ID , using="city")
	protected WebElement txtCity;
	
	@FindBy(how = How.ID , using="id_state")
	protected WebElement cbStates;
	
	@FindBy(how = How.ID , using="postcode")
	protected WebElement txtPostCode;
	
	@FindBy(how = How.ID , using="id_country")
	protected WebElement cbCountry;
	
	@FindBy(how = How.ID , using="phone")
	protected WebElement txtPhone;
	
	@FindBy(how = How.ID , using="alias")
	protected WebElement txtReference;
	
	@FindBy(how = How.ID , using="submitAccount")
	protected WebElement btSubmit;
}