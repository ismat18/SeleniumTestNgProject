package test;

import util.Xls_Reader;

import org.testng.annotations.Test;


public class AddContactTest {
	Xls_Reader reader = new Xls_Reader(".\\IsmatTestNgFramework\\Data\\TechFiosData.xlsx");
	
	String username = reader.getCellData("sheet1", "UserName", 2);
	String passwd = reader.getCellData("sheet1", "Password", 2);
	String title = reader.getCellData("sheet1", "Account title", 2);
	String details = reader.getCellData("sheet1", "Description", 2);
	String initBalance = reader.getCellData("sheet1", "Initial balance", 2);
	String name = reader.getCellData("sheet1", "Name", 2);
	String salePrice = reader.getCellData("sheet1", "Sale Price", 2);
	String itemNo = reader.getCellData("sheet1", "Itemnumber", 2);
	String descrip = reader.getCellData("sheet1", "Description", 2);
	String fullName = reader.getCellData("sheet1", "Full Name", 2);
	String company = reader.getCellData("sheet1", "Company", 2);
	String email = reader.getCellData("sheet1", "Email", 2);
	String phone = reader.getCellData("sheet1", "Phone", 2);
	String address = reader.getCellData("sheet1", "Address", 2);
	String city = reader.getCellData("sheet1", "City", 2);
	String state = reader.getCellData("sheet1", "State", 2);
	String zipcode = reader.getCellData("sheet1", "Zip", 2);

		
	@Test
	public void AddContact() {
		System.out.println(email);
		
		/*
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
		
		Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
		login.login_techfios(username, password);
		System.out.println ("login Sucessfully");
		
		AddContactPage AddContact=PageFactory.initElements(driver, AddContactPage.class);
		AddContact.AddContact_demo(fullname, companyname, email1,
		                           phone, address, cityname, statename, zip);
		
		System.out.println ("A New contact added");
		

		driver.close();

		driver.quit();
		*/			
			
		}
		
}
