package carpool;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase{
	Ride ride = new Ride();
	String actionButton;
	@Given("^employee \"([^\"]*)\" enter details like \"([^\"]*)\" as source, \"([^\"]*)\" as destination and time is \"([^\"]*)\"$")
	public void InputData(String empName, String source, String destination, String time) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ride.setEmpName(empName);
		ride.setSource(source);
		ride.setDestination(destination);
		ride.setTime(time);
	}

	@Given("^his email is \"([^\"]*)\" and phone is \"([^\"]*)\"$")
	public void MoreInputdata(String email, String phone) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ride.setEmail(email);
		ride.setPhone(phone);
	}

	@When("^click on \"([^\"]*)\"$")
	public void UserAction(String actionButton) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		this.actionButton = actionButton;
	}

	@Then("^data get saved and message \"([^\"]*)\" get displayed with \"([^\"]*)\" button$")
	public void ExpectedResult(String message, String buttonName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		RideBLL rideBLL = new RideBLL();
		assertEquals(message, rideBLL.SaveRide(ride));
		
		
	}

	@Then("^clicking on \"([^\"]*)\" will take him to \"([^\"]*)\" page$")
	public void MoreExpectedResult(String buttonName, String pageName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
