package automationpratice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import actions.CreateAccountAction;
import actions.LoginPageAction;
import utils.Constants;
import utils.DriverContext;


public class AutomationPracticeTest {
	
	WebDriver driver;
	CreateAccountAction account;
	LoginPageAction login;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		account = new CreateAccountAction();
		login = new LoginPageAction();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	
	
	/*
	 * @Test public void testCriarContaUsuario() { account.clicarSignIn();
	 * account.preencherEmail("teste33234@gmail.com"); account.createAccount();
	 * account.selectTitle(); account.preencherFirstName("jose");
	 * account.preencherLastName("silva"); account.createPassword("automacao43");
	 * account.selectDay("2"); account.selectMonth("3"); account.selectYear("1984");
	 * account.selectNewsLetter(); account.preencherCompany("uninassau");
	 * account.preencherAddress1("rua do bobo"); account.preencherAddress2("casa");
	 * account.preencherCity("salt lake"); account.selectState("34");
	 * account.preencherPostalCode("00000"); account.selectCountry("United States");
	 * account.preencherPhone("000000000");
	 * account.preencherAlias("não sei bem kkkkk"); account.submitAccount(); }
	 */
	
	public void verificarConta() {
		String contaEsperada = "jose silva";
		String contaVerificada = driver.findElement(
				By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
		assertEquals(contaEsperada, contaVerificada);
	}
	
	public void verificarCompra() {
		String compraEsperada = "Your order on My Store is complete.";
		String compraConcluida = driver.findElement(
				By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
		assertEquals(compraEsperada, compraConcluida);
	}
	
	@Test
	public void testLoginCompra() {
		//login e verifica se a conta logada está certa
		login.clicarSignIn();
		login.preencherEmail("teste33234@gmail.com");
		login.preencherSenha("automacao43");
		login.submitLogin();
		verificarConta();
		
		//procura o produto, adicionar ao carrinho, faz os procedimentos de pagamento e checa no fim
		login.searchProduct("dress");
		login.clickSearch();
		login.ClicarVestido();
		login.addCart();
		login.checkOut();
		login.quantidadeMais();
		login.checkOut2();
		login.checkOut3();
		login.ClickTerms();
		login.checkOut4();
		login.clicarPaymentBank();
		login.clicarConfirmORder();
		verificarCompra();
	}
	
}