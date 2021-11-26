package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import utils.DriverContext;

public class LoginPageAction extends LoginPage{
	WebDriverWait wait;

	public LoginPageAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 20);
	}
	
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignin)).click();
	}
	
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	
	public void preencherSenha(String senha) {
		wait.until(ExpectedConditions.visibilityOf(txtPasswd)).sendKeys(senha);
	}
	
	public void submitLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(submitLogin)).click();
	}
	
	public void searchProduct(String produto) {
		wait.until(ExpectedConditions.visibilityOf(txtSearch)).sendKeys(produto);
	}
	
	public void clickSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(btSearch)).click();
	}
	
	public void ClicarVestido() {
		wait.until(ExpectedConditions.elementToBeClickable(btClickDress)).click();
	}
	
	public void addCart() {
		wait.until(ExpectedConditions.elementToBeClickable(btAddCart)).click();
	}
	
	public void checkOut() {
		wait.until(ExpectedConditions.elementToBeClickable(btCheckOut)).click();
	}
	
	public void quantidadeMais() {
		wait.until(ExpectedConditions.elementToBeClickable(btQty)).click();
	}
	
	public void checkOut2() {
		wait.until(ExpectedConditions.elementToBeClickable(btCheckOut2)).click();
	}
	
	public void checkOut3() {
		wait.until(ExpectedConditions.elementToBeClickable(btCheckOut3)).click();
	}
	
	public void ClickTerms() {
		wait.until(ExpectedConditions.elementToBeClickable(ckClickTerms)).click();
	}
	
	public void checkOut4() {
		wait.until(ExpectedConditions.elementToBeClickable(btCheckOut4)).click();
	}
	
	public void clicarPaymentBank() {
		wait.until(ExpectedConditions.elementToBeClickable(btPaymentBank)).click();
	}
	
	public void clicarConfirmORder() {
		wait.until(ExpectedConditions.elementToBeClickable(btConfirmOrder)).click();
	}
}