package stepDefinition;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contactformStepdefinition {

	WebDriver d;
	@Given(" I am in contact page")
	public void I_am_Contact_form() {
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
@When("I entered the valid details the contact form")
public void I_enterd_valid_credentials() {
	WebElement name = d.findElement(By.xpath("(//input[@type='text'])[1]"));
	if(name.isEnabled()) {
		name.clear();
		name.sendKeys("garigi");
	}
}
@Then("I validate the details accepted ")
public void I_validate_The_details_are_accepted() {
	System.out.println("task finish");
}
}
