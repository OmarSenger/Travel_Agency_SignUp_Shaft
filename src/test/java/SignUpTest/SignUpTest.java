package SignUpTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;

import pages.SignUpPage;

public class SignUpTest {
	WebDriver driver ;
	private SignUpPage signUpPage ;
	@BeforeClass
	public void beforeClass() {
		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver,"https://www.phptravels.net/signup");
		signUpPage = new SignUpPage(driver);
	}
	
	@Test
	public void existEmail() {
		signUpPage.dataAction("Omar", "Senger", "01568938890","omarsenger1@gmail.com", "123456789");
		String failEmailMsg = ElementActions.getText(driver, By.className("message"));
		Assertions.assertEquals(failEmailMsg, "Email already exist!");	
	}
	
	@Test (priority = 1)
	public void wrongPhoneNo() {
		signUpPage.dataAction("Omar", "Senger", "Thats not a phone number","omarsenger10@yahoo.com", "123456789");
		String wrongPhoneMsg = ElementActions.getText(driver, By.className("message"));
		Assertions.assertEquals(wrongPhoneMsg, "Wrong Phone Number ex : 01234567890");	
	}
	
	@Test(priority = 2)
	public void PasswordValidation() {
		BrowserActions.navigateToURL(driver,"https://www.phptravels.net/signup");
		signUpPage.dataAction("Omar", "Senger", "01568938890","omarsenger11@yahoo.com", "1234");
		String noLimitPasssMsg = ElementActions.getText(driver, By.className("message"));
		Assertions.assertEquals(noLimitPasssMsg, "password should be at least 8 characters with capital letter and small letter");	
		
	}
	
	@Test(priority = 3)
	public void wrongEmailFormat() {
		BrowserActions.navigateToURL(driver,"https://www.phptravels.net/signup");
		signUpPage.dataAction("Omar", "Senger", "01068938890", "zzzz", "123456789");
		String wrongEmailFormatMsg = ElementActions.getText(driver, By.className("message"));
		Assertions.assertEquals(wrongEmailFormatMsg, "Wrong Email Formation");
	}
	
  @Test(priority = 4)
  public void successfullSignUp() {
	  BrowserActions.navigateToURL(driver,"https://www.phptravels.net/signup");
	  signUpPage.dataAction("Omar", "Senger", "01568938820","omarsenger12@yahoo.com", "123456789oO");
	  String successMsg = ElementActions.getText(driver, By.className("message"));
	  Assertions.assertEquals(successMsg, "Signup successfull please login.");
  }
  
  
}
