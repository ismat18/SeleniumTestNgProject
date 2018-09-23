package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {
WebDriver driver;
	
	public AddContactPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how = How.XPATH, using = "//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Contact']")
	WebElement AddContact;
	
	@FindBy(how=How.ID,using="account")
	WebElement fullname;
	
	@FindBy(how=How.ID,using="company")
	WebElement companyname;
	
	@FindBy(how=How.ID, using="email")
	WebElement email1;
	
	@FindBy(how=How.ID,using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement address;
	
	@FindBy(how=How.ID, using="city")
	WebElement cityname;
	
	@FindBy(how=How.ID,using="state")
	WebElement statename;
	
	@FindBy(how=How.ID,using="zip")
	WebElement zip ;
	
	//@FindBy(how=How.ID, using="select2-country-container")
	//WebElement country;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submit_button;
		
	
	public void AddContact_demo(String Name, String Company, String Email_ID, 
			                    String PhoneNo, String Address, String City, 
			                    String State, String Zipcode){
		
		CRM.click();
		AddContact.click();
				
		/*fullname.sendKeys("Ismat Jahan");
		companyname.sendKeys("abc");
		email1.sendKeys("jahan.ismat@gmail.com");
		phone.sendKeys("12345678");
		address.sendKeys("123 Irving Blvd");
		cityname.sendKeys("Irving");
		statename.sendKeys("TX");
		zip.sendKeys("75060");*/
		
		fullname.sendKeys(Name);
		companyname.sendKeys(Company);
		email1.sendKeys(Email_ID);
		phone.sendKeys(PhoneNo);
		address.sendKeys(Address);
		cityname.sendKeys(City);
		statename.sendKeys(State);
		zip.sendKeys(Zipcode);

		submit_button.click();
			
	}
}
