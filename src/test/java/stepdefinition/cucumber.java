package stepdefinition;

import Browser.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class cucumber {

	@Given("open the browser.")
	public void open_the_browser() {
	    try {
	    	browser.OpenBrowser();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

	@When("enter the {string}.")
	public void enter_the(String string) {
	    try {
	    	browser.OpenURL(string);
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

	@Then("the page has displayed.")
	public void the_page_has_displayed() {
	    try {
	    	String actualTitle = browser.GetTitle();
	    	Assert.assertEquals("Google",actualTitle);
	     }
	     catch(AssertionError e) {
	    	 e.printStackTrace();
	     }
	     browser.BrowserClose();
	}
}
