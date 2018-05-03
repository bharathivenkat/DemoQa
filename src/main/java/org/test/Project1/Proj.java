package org.test.Project1;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Proj {
	public String text;

			@Given("^user is on DemoQa page$")
			public void user_is_on_DemoQa_page() {
				Base.browserOpen();
				Base.launchApp("http://demoqa.com/registration/");

				
			}

			@When("^user clicks  checkbox$")
			public void user_clicks_checkbox() throws Throwable  {
				POM p = new POM();
				Thread.sleep(3000);
				p.getHobbyCricket().click();
				p.getHobbyDance().click();
				p.getHobbyReading().click();

			}

			@Then("^user verifies whether the checkbox is selected or not$")
			public void user_verifies_whether_the_checkbox_is_selected_or_not() throws Throwable {
				POM p = new POM();
				boolean cricket = p.getHobbyCricket().isSelected();
				boolean dance = p.getHobbyDance().isSelected();
				boolean reading = p.getHobbyReading().isSelected();
				Assert.assertTrue(cricket && dance && reading);
				System.out.println("The check box are selected");
				Base.browserClose();

			}

			@When("^user clicks on the radio button$")
			public void user_clicks_on_the_radio_button() {
				POM p = new POM();
				p.getStatusMarried().click();
			}

			@Then("^user verifies whether the radio is selected or not$")
			public void user_verifies_whether_the_radio_is_selected_or_not() throws Throwable {
				POM p = new POM();
				boolean selected = p.getStatusMarried().isSelected();
				Assert.assertTrue(selected);
				System.out.println("Married radio button is selected");
				Base.browserClose();
			}

			@When("^user clicks the dropdown menu$")
			public  void user_clicks_the_dropdown_menu() {
				POM p = new POM();
				
				Select s= new Select(p.getDropDownCountry());
				text = s.getFirstSelectedOption().getText();
				
			}

			@Then("^user verifies whether the dropdown default value is same or not$")
			public void user_verifies_whether_the_dropdown_default_value_is_same_or_not() throws Throwable {
				
				Assert.assertEquals("Afghanistan", text);
				System.out.println("The default selected value is : "+text);
				Base.browserClose();
			}

		

	}


