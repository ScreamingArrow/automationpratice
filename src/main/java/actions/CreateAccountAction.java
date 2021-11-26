package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreateAccountPage;
import utils.DriverContext;

public class CreateAccountAction extends CreateAccountPage{
	
	WebDriverWait wait;

	public CreateAccountAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 20);
	}
	
	
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignin)).click();
	}
	
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	
	public void createAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btCreateAccount)).click();
	}
	
	public void selectTitle() {
		wait.until(ExpectedConditions.elementToBeClickable(radioTitle)).click();
	}
	
	public void preencherFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	
	public void preencherLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	
	public void createPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void selectDay(String day) {
		Select cbDay = new Select(cbDays);
		cbDay.selectByValue(day);
	}
	
	public void selectMonth(String month) {
		Select cbMonth = new Select(cbMonths);
		cbMonth.selectByValue(month);
	}
	
	public void selectYear(String year) {
		Select cbYear = new Select(cbYears);
		cbYear.selectByValue(year);
	}
	
	public void selectNewsLetter() {
		ckNewsLetter.click();
	}
	
	public void preencherCompany(String company) {
		txtCompany.sendKeys(company);
	}
	
	public void preencherAddress1(String address) {
		txtAddress1.sendKeys(address);
	}
	
	public void preencherAddress2(String address) {
		txtAddress2.sendKeys(address);
	}
	
	public void preencherCity(String city) {
		txtCity.sendKeys(city);
	}
	
	public void selectState(String state) {
		Select cbState = new Select(cbStates);
		cbState.selectByValue(state);
	}
	
	public void preencherPostalCode(String postalCode) {
		txtPostCode.sendKeys(postalCode);
	}
	
	public void selectCountry(String country) {
		Select us = new Select(cbCountry);
		us.selectByVisibleText(country);
	}
	
	public void preencherPhone(String phone) {
		txtPhone.sendKeys(phone);
	}
	
	public void preencherAlias(String alias) {
		txtReference.sendKeys(alias);
	}
	
	public void submitAccount() {
		btSubmit.click();
	}
	
	
}
