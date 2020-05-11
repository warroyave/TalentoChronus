package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.User;
import co.com.proyectobase.screenplay.questions.TheScreen;
import co.com.proyectobase.screenplay.tasks.EnterthePage;
import co.com.proyectobase.screenplay.tasks.Login;
import co.com.proyectobase.screenplay.tasks.ObjetiveRegistration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class talentStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver hisbrowser;

	private Actor user = Actor.named("user");

	@Before
	public void configurationInicial() {
		user.can(BrowseTheWeb.with(hisbrowser));
	}

	@Given("^that user want to  use Talento$")
	public void thatUserWantToUseTalento() {

		user.wasAbleTo(EnterthePage.LaPaginaTalento());
	}

	@When("^he make the login in the page talento$")
	public void heMakeTheLoginInThePageTalento(List<User> data) {

		System.out.println(data);
		user.attemptsTo(Login.conElDato(data));

	}

	@When("^I entrance the performance option$")
	public void iEntranceThePerformanceOption(List<User> data2) {
//		System.out.println(data2);
		user.attemptsTo(ObjetiveRegistration.withTheData(data2));
	}

	@Then("^I verify the successful registration of the objective$")
	public void iVerifyTheSuccessfulRegistrationOfTheObjective(List<User> data3) throws Exception {

//		System.out.println(data3);
		
		user.should(GivenWhenThen.seeThat(TheScreen.theScreen(),Matchers.containsString(data3.get(0).getMessage_validation())));

		
	}

}
