package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.element.ElementActions;

public class SignUpPage {
	
	// Constructor
		private WebDriver driver;
	    public SignUpPage(WebDriver driver){
	        this.driver = driver ;
	    }
	    
	 // Locators
	    
	    private By firstName = By.xpath("//input[@name='first_name']");
	    private By lastName = By.xpath("//input[@name='last_name']");
	    private By phoneNo = By.xpath("//input[@name='phone']");
	    private By email = By.xpath("//input[@name='email']");
	    private By password = By.xpath("//input[@name='password']");
	    private By signUpButton = By.className("btn-lg");
	    private By selectType = By.className("select2-selection--single");
	    private By selectAgent = By.xpath("/html/body/span/span/span[2]/ul/li[3]");
	    
	 // Actions 
	    
	    public void dataAction(String first , String last , String phone , String emailAddress , String pass) {
	    	ElementActions.type(driver, firstName, first);
	    	ElementActions.type(driver, lastName, last);
	    	ElementActions.type(driver, phoneNo, phone);
	    	ElementActions.type(driver, email, emailAddress);
	    	ElementActions.type(driver, password, pass);
	    	ElementActions.click(driver, selectType);
	    	ElementActions.click(driver, selectAgent);
	    	ElementActions.click(driver, signUpButton);
	    }
}
