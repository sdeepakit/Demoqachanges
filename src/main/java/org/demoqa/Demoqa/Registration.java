package org.demoqa.Demoqa;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	WebDriver driver;
	String text,text1,text2,text3;
	
	@Given("^the user in demoqa website$")
	public void the_user_in_demoqa_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Demoqa\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	     
	}

	@When("^the user entering text in each and every text boxes$")
	public void the_user_entering_text_in_each_and_every_text_boxes() throws Throwable {
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("Deepakraj");
		
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("S");
		
		WebElement mobile = driver.findElement(By.name("phone_9"));
		mobile.sendKeys("9876543210");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("sdeepak");
		
		WebElement email = driver.findElement(By.name("e_mail"));
		email.sendKeys("sdeepak@gmail.com");
	     
		WebElement self = driver.findElement(By.name("description"));
		self.sendKeys("Welcome");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Sdeepak#1990");
		
		WebElement pass1 = driver.findElement(By.id("confirm_password_password_2"));
		pass1.sendKeys("Sdeepak#1990");
	}

	@Then("^the user has to verifing the particular text is entered in text field or not$")
	public void the_user_has_to_verifing_the_particular_text_is_entered_in_text_field_or_not() throws Throwable {
	      
	     Assert.assertEquals("Deepakraj",driver.findElement(By.name("first_name")).getAttribute("value"));
	     Assert.assertEquals("S",driver.findElement(By.name("last_name")).getAttribute("value"));
	     Assert.assertEquals("9876543210",driver.findElement(By.name("phone_9")).getAttribute("value"));
	     Assert.assertEquals("sdeepak",driver.findElement(By.name("username")).getAttribute("value"));
	     Assert.assertEquals("sdeepak@gmail.com",driver.findElement(By.name("e_mail")).getAttribute("value"));
	     Assert.assertEquals("Welcome",driver.findElement(By.name("description")).getAttribute("value"));
	     Assert.assertEquals("Sdeepak#1990",driver.findElement(By.name("password")).getAttribute("value"));
	     Assert.assertEquals("Sdeepak#1990",driver.findElement(By.id("confirm_password_password_2")).getAttribute("value"));
	     
	}

	@When("^the user click the button as Single$")
	public void the_user_click_the_button_as_Single() throws Throwable {
		WebElement e=driver.findElement(By.xpath("//input[@value='single']"));
		e.click();
	     
	}

	@Then("^the user has to verifing the selected button is clicked or not$")
	public void the_user_has_to_verifing_the_selected_button_is_clicked_or_not() throws Throwable {
		WebElement single=driver.findElement(By.xpath("//input[@value='single']"));
		Assert.assertTrue(single.isSelected());
	     
	}

	@When("^the user click the box as Cricket$")
	public void the_user_click_the_box_as_Cricket() throws Throwable {
		WebElement hobb = driver.findElement(By.xpath("//input[@value='cricket ']"));
		hobb.click();
	     
	}

	@Then("^the user has to verifing the selected box is clicked or not$")
	public void the_user_has_to_verifing_the_selected_box_is_clicked_or_not() throws Throwable {
		WebElement cricket=driver.findElement(By.xpath("//input[@value='cricket ']"));
		Assert.assertTrue(cricket.isSelected());
	     
	}

	@When("^the user choose the country as india and date of birth$")
	public void the_user_choose_the_country_as_india_and_date_of_birth() throws Throwable {
		WebElement country = driver.findElement(By.id("dropdown_7"));
		   Select cou = new Select(country);
		   cou.selectByVisibleText("Afghanistan");
		   text=cou.getFirstSelectedOption().getText();
		   
		   WebElement month = driver.findElement(By.id("mm_date_8"));
		   Select mon = new Select(month);
		   mon.selectByIndex(2);
		   text1=mon.getFirstSelectedOption().getText();
		   
		   WebElement date = driver.findElement(By.id("dd_date_8"));
		   Select da = new Select(date);
		   da.selectByVisibleText("2");
		   text2=da.getFirstSelectedOption().getText();
		   
		   WebElement year = driver.findElement(By.id("yy_date_8"));
		   Select yr = new Select(year);
		   yr.selectByVisibleText("2000");
		   text3=yr.getFirstSelectedOption().getText();
	}

	@Then("^the user has to verifing the particular country and date of birth is choosed or not$")
	public void the_user_has_to_verifing_the_particular_country_and_date_of_birth_is_choosed_or_not() throws Throwable {
		
		Assert.assertEquals("India", text);
		Assert.assertEquals("2", text1);
		Assert.assertEquals("2", text2);
		Assert.assertEquals("2000", text3);
		
	}

}
